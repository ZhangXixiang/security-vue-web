package com.space.controller;

import com.space.common.dto.model.RestApiModel;
import com.space.common.dto.star.GetProtocol;
import com.space.common.dto.star.IMBasicForm;
import com.space.common.dto.star.IMUserForm;
import com.space.common.dto.star.NewsInfoForm;
import com.space.common.enums.ResponseStatusCode;
import com.space.common.lp.member.UserResetPwdReq;
import com.space.common.util.RequestParamMap;
import com.space.common.util.WEBUtils;
import com.space.service.IMService;
import com.space.util.HSDataSynchroService;
import org.apache.commons.lang3.StringUtils;
import org.apache.http.util.TextUtils;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Map;

/**
 * 首页数据接口
 */
@RestController
@RequestMapping(value = "/starspace/restapi/im", produces = "application/json")
public class IMController extends BaseMobileController {


    private final static Logger logger = LoggerFactory.getLogger(IMController.class);

    @Autowired
    private IMService imService;

    @Value("${defaultlHeadImg}")
    private String defaultlHeadImg;

    @Value("${prefixHeadImg}")
    private String prefixHeadImg;

    @Autowired
    private HSDataSynchroService hsDataSynchroService;


    /**
     * 获取用户account
     * @param imBasicForm
     * @return
     */
    @RequestMapping(value = "/getUserAccount")
    public String getUserAccount(IMBasicForm imBasicForm) {
        RestApiModel restApiModel = new RestApiModel();
        if(StringUtils.isEmpty(imBasicForm.getName()) ){
            restApiModel.setCodeMessage(ResponseStatusCode.lostParams.getCode(),ResponseStatusCode.lostParams.getDesc());
            return restApiModel.toJson();
        }
        List<IMUserForm> imUserForms = imService.getIMUserFormByRealName(imBasicForm.getName().trim());
        if(imUserForms != null && imUserForms.size()>0){
            for(IMUserForm imUserForm : imUserForms){
                if(StringUtils.isBlank(imUserForm.getHeadImg())){
                    imUserForm.setHeadImg(defaultlHeadImg);
                }else {
                    imUserForm.setHeadImg(prefixHeadImg+imUserForm.getHeadImg());
                }
                //判断是否注册,若未注册则进行im注册
               boolean isRegist =  imService.isRegist(imUserForm.getAccount());
                if(!isRegist){
                    imService.getIMTokenByAccount(imUserForm.getAccount());
                }
            }
            restApiModel.setContent(imUserForms);
        }else {
            restApiModel.setCodeMessage(ResponseStatusCode.IMNoSuchUser.getCode(),ResponseStatusCode.IMNoSuchUser.getDesc());
        }
        return restApiModel.toJson();
    }

    /**
     * 获取推荐人列表
     * @param userResetPwdReq
     * @return
     */
    @RequestMapping("/getInvitedUsers")
    public String getInvitedUsers(UserResetPwdReq userResetPwdReq){
        RestApiModel restApiModel = new RestApiModel();
        if(StringUtils.isBlank(userResetPwdReq.getMobile())){
            restApiModel.setCodeMessage(ResponseStatusCode.lostParams.getCode(),ResponseStatusCode.lostParams.getDesc());
            return restApiModel.toJson();
        }
        List<Map<String,String>> users = imService.getInvitedUsers(userResetPwdReq.getMobile());
        restApiModel.setContent(users);
        return restApiModel.toJson();
    }

    /**
     * url 解析
     * @param uri
     * @return
     */
    @RequestMapping("/parseHtml")
    private String parseHtml(String uri) {
        logger.info("解析url:"+uri+"开始");
        RestApiModel restApiModel = new RestApiModel();
        if(StringUtils.isEmpty(uri)){
            restApiModel.setCodeMessage(ResponseStatusCode.lostParams.getCode(),ResponseStatusCode.lostParams.getDesc());
        }
        try {
            GetProtocol getProtocol = new GetProtocol();
            String url = getProtocol.getProtocol(uri);//补全URL
            //这里开始是做一个解析，需要在非UI线程进行
            String imgStr = "";//图片地址
            String desStr = "";//网页描述
            Document document1 = Jsoup.connect(url)
                    .header("User-Agent", "Mozilla/5.0 (Linux; U; Android 2.2; en-us; Nexus One Build/FRF91) AppleWebKit/533.1 (KHTML, like Gecko) Version/4.0 Mobile Safari/533.1")
                    .timeout(5000)
                    .get();
            Document document = Jsoup.parse(document1.html().replaceAll("data-src", "src"));//处理防盗链
            String title = document.head().getElementsByTag("title").text();//网页标题
            if (TextUtils.isEmpty(title)) {
                String selector2 = "div>h2";
                Elements titleElements = document.select(selector2);
                if (titleElements.size() > 0) {
                    title = titleElements.get(0).text();
                }
            }

            //获取图片
            Elements imgs = document.select("img[src]");//取得所有Img标签的值
            for (int i = 0; i < imgs.size(); i++) {
                if (!TextUtils.isEmpty(imgs.get(i).attr("src"))) {
                    imgStr = imgs.get(i).attr("src");
                    break;
                }
            }
            if (!TextUtils.isEmpty(imgStr)) {
                imgStr = getProtocol.getProtocol(imgStr);
            }

            //获取描述
            Elements descriptions = document.select("meta[name=description]");
            if (descriptions.size() > 0) {
                desStr = descriptions.get(0).attr("content");
            } else {
                desStr = document.body().text();
            }
            //解决自定义消息中描述过长，发送不出去的问题
            if (desStr.length() > 100) {
                desStr = desStr.substring(0, 50);
            }

            NewsInfoForm newsInfo = new NewsInfoForm();
            newsInfo.setTitle(title);
            newsInfo.setImageUrl(imgStr);
            newsInfo.setDesStr(desStr);
            restApiModel.setContent(newsInfo);
        } catch (Exception e) {
            restApiModel.setCodeMessage(ResponseStatusCode.failUrl.getCode(),ResponseStatusCode.failUrl.getDesc());
            e.printStackTrace();
        }
        logger.info("解析url:"+uri+"结束"+restApiModel.toJson());
        return restApiModel.toJson();
    }



    @RequestMapping("/statisIMData")
    public void statisIMData(HttpServletRequest request, String type){
        if(StringUtils.isEmpty(type)){
            return;
        }
        //异步调用数据同步接口
        try {
            Map paramMaps = RequestParamMap.getParamMap(request);
            paramMaps.put("secondModule","app调用IM");//二级模块
            paramMaps.put("thirdModule", ImType.getEnum((String) paramMaps.get("type")).value);//三级模块
            hsDataSynchroService.pushDataToHS(paramMaps, WEBUtils.getServerUrl(request),WEBUtils.getIpAddr(request),request.getRequestURI());
        }catch (Exception e){
            logger.info("im异步通知异常！参数type="+type);
            e.printStackTrace();
        }
    }

    /**
     * IM行为记录
     */
    private enum ImType {
        CLICK_TO_ENTER("1","app点击使用IM"),
        USE_TO_CHAT("2","app使用IM聊天"),
        ADD_FRIEND("3","app使用IM添加好友");

        public String code;
        public String value;
        private ImType(String code, String value) {
            this.code = code;
            this.value = value;
        }
        public static ImType getEnum(String code){
            ImType[] imTypes = ImType.values();
            for (ImType imType : imTypes) {
                if (imType.code.equals(code)) {
                    return imType;
                }
            }
            return null;
        }

    }
}

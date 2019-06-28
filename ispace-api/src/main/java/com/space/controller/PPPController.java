package com.space.controller;

import com.space.common.dto.model.RestApiModel;
import com.space.common.dto.star.BannerForm;
import com.space.common.dto.star.BasicForm;
import com.space.common.dto.star.ContactForm;
import com.space.common.dto.star.NoticeForm;
import com.space.common.enums.ResponseStatusCode;
import com.space.common.util.StringUtils;
import com.space.common.util.redis.RedisUtil;
import com.space.service.PPPService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * 首页数据接口
 */
@RestController
@RequestMapping(value = "/starspace/restapi/ppp", produces = "application/json")
public class PPPController extends BaseMobileController {

    private final static Logger logger = LoggerFactory.getLogger(PPPController.class);

    @Autowired
    private PPPService pppService;

    @Autowired
    private RedisUtil redisUtil;

    /**
     * 获取首页
     */
    @RequestMapping(value = "/index", method = RequestMethod.POST)
    public String pppIndex(HttpServletRequest request, HttpServletResponse response) {
        logger.info("请求ppp数据接口开始：");
        RestApiModel resultApiModel = new RestApiModel();
        Map<String, Object> map = new HashMap();
        try {
            /**banner 轮播*/
            List<BannerForm> topbanners =  pppService.getPPPBanner("pppadv01");
            map.put("firstBanner", topbanners);
            /**pppdbgg 顶部最新公告*/
            List<NoticeForm> indexNotice = pppService.getIndexNotice("pppdbgg", 0, 1);
            map.put("indexNotice", indexNotice);
            /**
             * 平台资讯
             */
            List<NoticeForm> dynamic = pppService.getIndexNotice("xwdt", 0, 3);//本所动态
            map.put("ptzx", dynamic);
            /**
             * 行业资讯
             */
            List<NoticeForm> focus = pppService.getIndexNotice("qtxx", 0, 3);//媒体聚焦 = indexService.getIndexNotice();
            map.put("hyzx", focus);
            /**
             *资产交易专栏
             */
            List<NoticeForm> vocality = pppService.getIndexNotice("ces1", 0, 3);//本所动态 = indexService.getIndexNotice();
            map.put("zcyjzl", vocality);
            /**
             * 海外专栏
             */
            List<NoticeForm> zysy = pppService.getIndexNotice("zysy", 0, 3);//本所动态 = indexService.getIndexNotice();
            map.put("hwzl", zysy);
            resultApiModel.setContent(map);
        } catch (Exception e) {
            logger.error("bannerList error message:{},exception:{}", e.getMessage(), e);
            //错误信息
            resultApiModel.setCodeMessage(ResponseStatusCode.serverError.getCode(), ResponseStatusCode.serverError.getDesc());
        }
        response.setHeader("Access-Control-Allow-Origin", "*");
        logger.info("请求首页数据接口结束!");
        return resultApiModel.toJson();
    }

    /**
     * 根据code获取一类资讯列表
     *
     * @param basicForm
     * @return
     */
    @RequestMapping(value = "/noticeList", method = RequestMethod.POST)
    public String noticeList(BasicForm basicForm, HttpServletResponse response) {
        logger.info("请求资讯数据接口开始，请求参数：" + StringUtils.paseObjToString(basicForm));
        RestApiModel resultApiModel = new RestApiModel();
        if (org.apache.commons.lang3.StringUtils.isBlank(basicForm.getType())) {
            resultApiModel.setCodeMessage(ResponseStatusCode.lostParams.getCode(), ResponseStatusCode.lostParams.getDesc());
        } else {
            try {
                /**资讯*/
                Long totle = pppService.countNoticeByType(basicForm);
                resultApiModel.setKeyAndValue("totalItem", totle);//总条数
                List<NoticeForm> indexNotice = pppService.getNoticeByType(basicForm);
                resultApiModel.setContent(indexNotice);
            } catch (Exception e) {
                logger.error("noticeList error message:{},exception:{}", e.getMessage(), e);
                //错误信息
                resultApiModel.setCodeMessage(ResponseStatusCode.serverError.getCode(), ResponseStatusCode.serverError.getDesc());
            }
        }
        response.setHeader("Access-Control-Allow-Origin", "*");
        logger.info("请求资讯数据接口结束！");
        return resultApiModel.toJson();
    }

    /**
     * 根据id获取资讯详情
     *
     * @param contId
     * @return
     */
    @RequestMapping(value = "/getNoticeDetail", method = RequestMethod.POST)
    public String getNoticeDetail(String contId, HttpServletRequest request, HttpServletResponse response) {
        logger.info("请求资讯详情接口开始，请求参数 contId：" + contId);
        RestApiModel resultApiModel = new RestApiModel();
        if (org.apache.commons.lang3.StringUtils.isBlank(contId)) {
            resultApiModel.setCodeMessage(ResponseStatusCode.lostParams.getCode(), ResponseStatusCode.lostParams.getDesc());
        } else {
            try {
                /**资讯*/
                Map notice = pppService.getNoticeById(contId);
                if (notice != null) {
                    resultApiModel.setContent(notice);
                    pppService.updateViewCount(contId);
                } else {
                    resultApiModel.setCodeMessage(ResponseStatusCode.serverError.getCode(), ResponseStatusCode.serverError.getDesc());
                }
            } catch (Exception e) {
                logger.error("getNoticeDetail error message:{},exception:{}", e.getMessage(), e);
                //错误信息
                resultApiModel.setCodeMessage(ResponseStatusCode.serverError.getCode(), ResponseStatusCode.serverError.getDesc());
            }
        }
        logger.info("请求资讯详情接口结束！");
        response.setHeader("Access-Control-Allow-Origin", "*");
        return resultApiModel.toJson();
    }


    /**
     * 请求下一条资讯
     * @param contId 当前id
     * @param next next 下一条， prev 上一条
     * @param request
     * @param response
     * @return
     */
    @RequestMapping(value = "/getNextNotice", method = RequestMethod.POST)
    public String getNextNotice(String contId, String next, String channerCode, HttpServletRequest request, HttpServletResponse response) {
        logger.info("请求ppp资讯详情翻页接口开始，请求参数 contId：" + contId+"next:"+next+"channerCode:"+channerCode);
        RestApiModel resultApiModel = new RestApiModel();
        if (org.apache.commons.lang3.StringUtils.isBlank(contId) || org.apache.commons.lang3.StringUtils.isBlank(channerCode)) {
            resultApiModel.setCodeMessage(ResponseStatusCode.lostParams.getCode(), ResponseStatusCode.lostParams.getDesc());
        } else {
            response.setHeader("Access-Control-Allow-Origin", "*");
            try {
                List<String> idList = null;
                if(redisUtil.hasKey("PPP"+channerCode)){
                     idList = (List<String>)redisUtil.get("PPP"+channerCode);
                }else {
                    //向redis中存储该类资讯id的list
                    idList = pppService.getNoticeIdsByType(channerCode);
                    redisUtil.set("PPP"+channerCode,idList,600);
                }
                //判断是否最后一条  //不存在
                int index = idList.indexOf(contId);
                String indexId=null;
                if("next".equals(next) && index!= idList.size()-1){
                    indexId = idList.get(index + 1);
                }else if("prev".equals(next) && index >0){
                    indexId = idList.get(index - 1);
                }else {
                    resultApiModel.setCodeMessage(ResponseStatusCode.lastNotice.getCode(), ResponseStatusCode.lastNotice.getDesc());
                    return resultApiModel.toJson();
                }
                /**资讯*/
                Map notice = pppService.getNoticeById(indexId);
                if (notice != null) {
                    resultApiModel.setContent(notice);
                    pppService.updateViewCount(indexId);
                } else {
                    resultApiModel.setCodeMessage(ResponseStatusCode.serverError.getCode(), ResponseStatusCode.serverError.getDesc());
                }
            } catch (Exception e) {
                logger.error("getNoticeDetail error message:{},exception:{}", e.getMessage(), e);
                //错误信息
                resultApiModel.setCodeMessage(ResponseStatusCode.serverError.getCode(), ResponseStatusCode.serverError.getDesc());
            }
        }
        logger.info("请求ppp资讯详情翻页接口结束！");

        return resultApiModel.toJson();
    }

    /**
     * 获取banner
     * @param basicForm
     * @return
     */
    @RequestMapping("/getPPPBanners")
    public String getBannerList(BasicForm basicForm, HttpServletResponse response){
        RestApiModel resultApiModel = new RestApiModel();
        if(org.apache.commons.lang3.StringUtils.isBlank(basicForm.getType())){
             resultApiModel.setCodeMessage(ResponseStatusCode.lostParams.getCode(),ResponseStatusCode.lostParams.getDesc());
            return resultApiModel.toJson();
        }
        List<BannerForm> pppBanner = pppService.getPPPBanner(basicForm.getType());
        resultApiModel.setContent(pppBanner);
        response.setHeader("Access-Control-Allow-Origin", "*");
        return resultApiModel.toJson();
    }

    /**
     * 获取联系人信息
     * @return
     */
    @RequestMapping("/getContactInfo")
    public String getContactInfo(HttpServletResponse response) throws UnsupportedEncodingException {
        RestApiModel resultApiModel = new RestApiModel();
        ContactForm contactForm = null;
        contactForm = pppService.getContactInfo();
        resultApiModel.setContent(contactForm);
        response.setHeader("Access-Control-Allow-Origin", "*");
        return resultApiModel.toJson();
    }
}

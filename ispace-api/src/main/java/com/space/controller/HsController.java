package com.space.controller;

import com.space.common.dto.model.RestApiModel;
import com.space.common.dto.star.HSBasicForm;
import com.space.common.enums.ResponseStatusCode;
import com.space.common.lp.util.SignUtil;
import com.space.common.util.RequestParamMap;
import com.space.common.util.WEBUtils;
import com.space.util.HSDataSynchroService;
import com.space.util.HsHttpsUtils;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.beans.BeanInfo;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;


@RestController
@RequestMapping("/service")
public class HsController {
    private final static Logger logger = LoggerFactory.getLogger(HsController.class);

    @Autowired
    private SignUtil signUtil;
    @Autowired
    private HsHttpsUtils hsHttpsUtils;
    @Autowired
    private HSDataSynchroService hsDataSynchroService;

    public  Map<String, Object> objectToMap(Object obj) throws Exception {
        if(obj == null){
            return null;
        }
        Map<String, Object> map = new HashMap<String, Object>();
        BeanInfo beanInfo = Introspector.getBeanInfo(obj.getClass());
        PropertyDescriptor[] propertyDescriptors = beanInfo.getPropertyDescriptors();
        for (PropertyDescriptor property : propertyDescriptors) {
            String key = property.getName();
            if (key.compareToIgnoreCase("class") == 0) {
                continue;
            }
            Method getter = property.getReadMethod();
            Object value = getter!=null ? getter.invoke(obj) : null;
            map.put(key, value);
        }
        return map;
    }

    /**
     * 我的关注
     * @param hsBasicForm
     * @return
     * @throws Exception
     */
    @RequestMapping("QueryMyCollectionFundinfoRequest")
    String queryMyCollectionFundinfoRequest(HSBasicForm hsBasicForm, HttpServletRequest request, HttpServletResponse response) throws Exception {
        Map<String, Object> paramMap = objectToMap(hsBasicForm);
        String result = hsHttpsUtils.post(signUtil.getStarSpaceUrlPath(), paramMap);
        response.setHeader("Access-Control-Allow-Origin", "*");
        return result;
    }

    /**
     * 3.2.	撮合项目列表
     * @param hsBasicForm
     * @return
     * @throws Exception
     */
    @RequestMapping("QueryFundinfoRequest")
    String queryFundinfoRequest(HSBasicForm hsBasicForm, HttpServletRequest request, HttpServletResponse response) throws Exception {
        Map<String, Object> paramMap = objectToMap(hsBasicForm);
        String result = hsHttpsUtils.post(signUtil.getStarSpaceUrlPath(), paramMap);
        response.setHeader("Access-Control-Allow-Origin", "*");
        //异步调用数据同步接口
        Map paramMaps = RequestParamMap.getParamMap(request);
        paramMaps.put("secondModule","撮合项目列表接口");//二级模块
        paramMaps.put("thirdModule","");//三级模块
        hsDataSynchroService.pushDataToHS(paramMaps, WEBUtils.getServerUrl(request),WEBUtils.getIpAddr(request),request.getRequestURI());
        return result;
    }

    /**
     *3.3.	资产交易列表
     * @param hsBasicForm
     * @return
     * @throws Exception
     */
    @RequestMapping("QueryAssertProductListRequest")
    String queryAssertProductListRequest(HSBasicForm hsBasicForm, HttpServletRequest request, HttpServletResponse response) throws Exception {
        Map<String, Object> paramMap = objectToMap(hsBasicForm);
        String result = hsHttpsUtils.post(signUtil.getStarSpaceUrlPath(), paramMap);
        //异步调用数据同步接口
        Map paramMaps = RequestParamMap.getParamMap(request);
        paramMaps.put("secondModule","资产交易列表接口");//二级模块
        paramMaps.put("thirdModule","");//三级模块
        hsDataSynchroService.pushDataToHS(paramMaps, WEBUtils.getServerUrl(request),WEBUtils.getIpAddr(request),request.getRequestURI());
        response.setHeader("Access-Control-Allow-Origin", "*");
        return result;
    }

    /**
     *3.4.	撮合项目详情
     * @param hsBasicForm
     * @return
     * @throws Exception
     */
    @RequestMapping("QueryFundDetailRequest")
    String queryFundDetailRequest(HSBasicForm hsBasicForm, HttpServletRequest request, HttpServletResponse response) throws Exception {
        Map<String, Object> paramMap = objectToMap(hsBasicForm);
        String result = hsHttpsUtils.post(signUtil.getStarSpaceUrlPath(), paramMap);
        //异步调用数据同步接口
        Map paramMaps = RequestParamMap.getParamMap(request);
        paramMaps.put("secondModule","撮合项目");//二级模块
        paramMaps.put("thirdModule","撮合项目详情接口");//三级模块
        hsDataSynchroService.pushDataToHS(paramMaps, WEBUtils.getServerUrl(request),WEBUtils.getIpAddr(request),request.getRequestURI());
        response.setHeader("Access-Control-Allow-Origin", "*");
        return result;
    }

    /**
     *3.5.	资产交易详情
     * @param hsBasicForm
     * @return
     * @throws Exception
     */
    @RequestMapping("QueryAssertProductInfoRequest")
    String queryAssertProductInfoRequest(HSBasicForm hsBasicForm, HttpServletRequest request, HttpServletResponse response) throws Exception {
        Map<String, Object> paramMap = objectToMap(hsBasicForm);
        String result = hsHttpsUtils.post(signUtil.getStarSpaceUrlPath(), paramMap);
        //异步调用数据同步接口
        Map paramMaps = RequestParamMap.getParamMap(request);
        paramMaps.put("secondModule","资产交易 ");//二级模块
        paramMaps.put("thirdModule","资产交易详情接口");//三级模块
        hsDataSynchroService.pushDataToHS(paramMaps, WEBUtils.getServerUrl(request),WEBUtils.getIpAddr(request),request.getRequestURI());
        response.setHeader("Access-Control-Allow-Origin", "*");
        return result;
    }

    /**
     *3.6.	项目留言查阅
     * @param hsBasicForm
     * @return
     * @throws Exception
     */
    @RequestMapping("MessageQueryRequest")
    String messageQueryRequest(HSBasicForm hsBasicForm, HttpServletRequest request, HttpServletResponse response) throws Exception {
        Map<String, Object> paramMap = objectToMap(hsBasicForm);
        String result = hsHttpsUtils.post(signUtil.getStarSpaceUrlPath(), paramMap);
        response.setHeader("Access-Control-Allow-Origin", "*");
        return result;
    }

    /**
     *3.7.	项目留言详情
     * @param hsBasicForm
     * @return
     * @throws Exception
     */
    @RequestMapping("MessageDetailQueryRequest")
    String messageDetailQueryRequest(HSBasicForm hsBasicForm, HttpServletRequest request, HttpServletResponse response) throws Exception {
        Map<String, Object> paramMap = objectToMap(hsBasicForm);
        String result = hsHttpsUtils.post(signUtil.getStarSpaceUrlPath(), paramMap);
        response.setHeader("Access-Control-Allow-Origin", "*");
        return result;
    }

    /**
     *3.8.	项目留言提交
     * @param hsBasicForm
     * @return
     * @throws Exception
     */
    @RequestMapping("MessageSubmitRequest")
    String messageSubmitRequest(HSBasicForm hsBasicForm, HttpServletRequest request, HttpServletResponse response) throws Exception {
        Map<String, Object> paramMap = objectToMap(hsBasicForm);
        String result = hsHttpsUtils.post(signUtil.getStarSpaceUrlPath(), paramMap);
        response.setHeader("Access-Control-Allow-Origin", "*");
        return result;
    }

    /**
     *3.9.	项目评分查阅
     * @param hsBasicForm
     * @return
     * @throws Exception
     */
    @RequestMapping("GetScoreInfoRequest")
    String getScoreInfoRequest(HSBasicForm hsBasicForm, HttpServletRequest request, HttpServletResponse response) throws Exception {
        Map<String, Object> paramMap = objectToMap(hsBasicForm);
        String result = hsHttpsUtils.post(signUtil.getStarSpaceUrlPath(), paramMap);
        response.setHeader("Access-Control-Allow-Origin", "*");
        return result;
    }

    /**
     *3.10.	项目评分提交
     * @param hsBasicForm
     * @return
     * @throws Exception
     */
    @RequestMapping("PostScoreInfoRequest")
    String postScoreInfoRequest(HSBasicForm hsBasicForm, HttpServletRequest request, HttpServletResponse response) throws Exception {
        Map<String, Object> paramMap = objectToMap(hsBasicForm);
        String result = hsHttpsUtils.post(signUtil.getStarSpaceUrlPath(), paramMap);
        response.setHeader("Access-Control-Allow-Origin", "*");
        return result;
    }

    /**
     *3.11.	首页统计
     * @param hsBasicForm
     * @return
     * @throws Exception
     */
    @RequestMapping("QueryHomeStatisticsInfoRequest")
    String queryHomeStatisticsInfoRequest (HSBasicForm hsBasicForm, HttpServletRequest request, HttpServletResponse response) throws Exception {
        Map<String, Object> paramMap = objectToMap(hsBasicForm);
        String result = hsHttpsUtils.post(signUtil.getStarSpaceUrlPath(), paramMap);
        response.setHeader("Access-Control-Allow-Origin", "*");
        return result;
    }

    /**
     *3.12.	我的发布撮合
     * @param hsBasicForm
     * @return
     * @throws Exception
     */
    @RequestMapping("QueryMyInfomationFundinfoRequest")
    String queryMyInfomationFundinfoRequest(HSBasicForm hsBasicForm, HttpServletRequest request, HttpServletResponse response) throws Exception {
        Map<String, Object> paramMap = objectToMap(hsBasicForm);
        String result = hsHttpsUtils.post(signUtil.getStarSpaceUrlPath(), paramMap);
        response.setHeader("Access-Control-Allow-Origin", "*");
        return result;
    }

    /**
     *3.13.	我的发布资产交易
     * @param hsBasicForm
     * @return
     * @throws Exception
     */
    @RequestMapping("QueryMyAssertProductListRequest")
    String queryMyAssertProductListRequest(HSBasicForm hsBasicForm, HttpServletRequest request, HttpServletResponse response) throws Exception {
        Map<String, Object> paramMap = objectToMap(hsBasicForm);
        String result = hsHttpsUtils.post(signUtil.getStarSpaceUrlPath(), paramMap);
        response.setHeader("Access-Control-Allow-Origin", "*");
        return result;
    }

    /**
     *3.14.	我的足迹
     * @param hsBasicForm
     * @return
     * @throws Exception
     */
    @RequestMapping("QueryMyFootprintRequest")
    String queryMyFootprintRequest(HSBasicForm hsBasicForm, HttpServletRequest request, HttpServletResponse response) throws Exception {
        Map<String, Object> paramMap = objectToMap(hsBasicForm);
        String result = hsHttpsUtils.post(signUtil.getStarSpaceUrlPath(), paramMap);
        response.setHeader("Access-Control-Allow-Origin", "*");
        return result;
    }

    /**
     *3.15.	我的访客（
     * @param hsBasicForm
     * @return
     * @throws Exception
     */
    @RequestMapping("QueryMyVisitorRequest")
    String queryMyVisitorRequest(HSBasicForm hsBasicForm, HttpServletRequest request, HttpServletResponse response) throws Exception {
        Map<String, Object> paramMap = objectToMap(hsBasicForm);
        String result = hsHttpsUtils.post(signUtil.getStarSpaceUrlPath(), paramMap);
        response.setHeader("Access-Control-Allow-Origin", "*");
        return result;
    }

    /**
     *3.16.	我的留言列表
     * @param hsBasicForm
     * @return
     * @throws Exception
     */
    @RequestMapping("ProjectWithMessageListRequest")
    String projectWithMessageListRequest(HSBasicForm hsBasicForm, HttpServletRequest request, HttpServletResponse response) throws Exception {
        Map<String, Object> paramMap = objectToMap(hsBasicForm);
        String result = hsHttpsUtils.post(signUtil.getStarSpaceUrlPath(), paramMap);
        response.setHeader("Access-Control-Allow-Origin", "*");
        return result;
    }

    /**
     *3.17.	观看历史列表
     * @param hsBasicForm
     * @return
     * @throws Exception
     */
    @RequestMapping("QueryViewRecordPageRequest")
    String queryViewRecordPageRequest(HSBasicForm hsBasicForm, HttpServletRequest request, HttpServletResponse response) throws Exception {
        Map<String, Object> paramMap = objectToMap(hsBasicForm);
        String result = hsHttpsUtils.post(signUtil.getStarSpaceUrlPath(), paramMap);
        return result;
    }

    /**
     *3.18.	离线空间列表
     * @param hsBasicForm
     * @return
     * @throws Exception
     */
    @RequestMapping("QueryJoinRecordPageRequest")
    String queryJoinRecordPageRequest(HSBasicForm hsBasicForm, HttpServletRequest request, HttpServletResponse response) throws Exception {
        Map<String, Object> paramMap = objectToMap(hsBasicForm);
        String result = hsHttpsUtils.post(signUtil.getStarSpaceUrlPath(), paramMap);
        response.setHeader("Access-Control-Allow-Origin", "*");
        return result;
    }

    /**
     *3.19.	站内信列表
     * @param hsBasicForm
     * @return
     * @throws Exception
     */
    @RequestMapping("QueryMsgRequest")
    String queryMsgRequest(HSBasicForm hsBasicForm, HttpServletRequest request, HttpServletResponse response) throws Exception {
        Map<String, Object> paramMap = objectToMap(hsBasicForm);
        String result = hsHttpsUtils.post(signUtil.getStarSpaceUrlPath(), paramMap);
        response.setHeader("Access-Control-Allow-Origin", "*");
        return result;
    }

    /**
     *3.20.站内信详情
     * @param hsBasicForm
     * @return
     * @throws Exception
     */
    @RequestMapping("QueryMsgInfoRequest")
    String queryMsgInfoRequest(HSBasicForm hsBasicForm, HttpServletRequest request, HttpServletResponse response) throws Exception {
        Map<String, Object> paramMap = objectToMap(hsBasicForm);
        String result = hsHttpsUtils.post(signUtil.getStarSpaceUrlPath(), paramMap);
        response.setHeader("Access-Control-Allow-Origin", "*");
        return result;
    }

    /**
     *3.21.	获取省份接口
     * @param hsBasicForm
     * @return
     * @throws Exception
     */
    @RequestMapping("GetProvinceDataRequest")
    String getProvinceDataRequest(HSBasicForm hsBasicForm, HttpServletRequest request, HttpServletResponse response) throws Exception {
        Map<String, Object> paramMap = objectToMap(hsBasicForm);
        String result = hsHttpsUtils.post(signUtil.getStarSpaceUrlPath(), paramMap);
        response.setHeader("Access-Control-Allow-Origin", "*");
        return result;
    }

    /**
     *3.22.	根据省份获取市区接口
     * @param hsBasicForm
     * @return
     * @throws Exception
     */
    @RequestMapping("GetCityDataRequest")
    String getCityDataRequest(HSBasicForm hsBasicForm, HttpServletRequest request, HttpServletResponse response) throws Exception {
        Map<String, Object> paramMap = objectToMap(hsBasicForm);
        String result = hsHttpsUtils.post(signUtil.getStarSpaceUrlPath(), paramMap);
        response.setHeader("Access-Control-Allow-Origin", "*");
        return result;
    }

    /**
     *3.24.	获取花名（
     * @param hsBasicForm
     * @return
     * @throws Exception
     */
    @RequestMapping("GetFlowerNameRequest")
    String getFlowerNameRequest(HSBasicForm hsBasicForm, HttpServletRequest request, HttpServletResponse response) throws Exception {
        Map<String, Object> paramMap = objectToMap(hsBasicForm);
        String result = hsHttpsUtils.post(signUtil.getStarSpaceUrlPath(), paramMap);
        response.setHeader("Access-Control-Allow-Origin", "*");
        return result;
    }

    /**
     *3.25.	修改花名
     * @param hsBasicForm
     * @return
     * @throws Exception
     */
    @RequestMapping("UpdateFlowerNameRequest")
    String updateFlowerNameRequest(HSBasicForm hsBasicForm, HttpServletRequest request, HttpServletResponse response) throws Exception {
        Map<String, Object> paramMap = objectToMap(hsBasicForm);
        String result = hsHttpsUtils.post(signUtil.getStarSpaceUrlPath(), paramMap);
        response.setHeader("Access-Control-Allow-Origin", "*");
        return result;
    }

    /**
     3.26.	【二期】路演列表
     * @param hsBasicForm
     * @return
     * @throws Exception
     */
    @RequestMapping("QueryCrmRoadShowRequest")
    String queryCrmRoadShowRequest(HSBasicForm hsBasicForm, HttpServletRequest request, HttpServletResponse response) throws Exception {
        Map<String, Object> paramMap = objectToMap(hsBasicForm);
        String result = hsHttpsUtils.post(signUtil.getStarSpaceUrlPath(), paramMap);
        response.setHeader("Access-Control-Allow-Origin", "*");
        return result;
    }

    /**
     *3.27.	【二期】路演详情
     * @param hsBasicForm
     * @return
     * @throws Exception
     */
    @RequestMapping("QueryCrmRoadShowDetailRequest")
    String queryCrmRoadShowDetailRequest(HSBasicForm hsBasicForm, HttpServletResponse response) throws Exception {
        Map<String, Object> paramMap = objectToMap(hsBasicForm);
        String result = hsHttpsUtils.post(signUtil.getStarSpaceUrlPath(), paramMap);
        response.setHeader("Access-Control-Allow-Origin", "*");
        return result;
    }


    /**
     *3.28.	【二期】知识学院列表
     * @param hsBasicForm
     * @return
     * @throws Exception
     */
    @RequestMapping("QueryCrmKnowPageRequest")
    String queryCrmKnowPageRequest(HSBasicForm hsBasicForm, HttpServletRequest request, HttpServletResponse response) throws Exception {
        Map<String, Object> paramMap = objectToMap(hsBasicForm);
        String result = hsHttpsUtils.post(signUtil.getStarSpaceUrlPath(), paramMap);
        response.setHeader("Access-Control-Allow-Origin", "*");
        return result;
    }

    /**
     *3.29.	【二期】知识学院详情
     * @param hsBasicForm
     * @return
     * @throws Exception
     */
    @RequestMapping("QueryCrmKnowDetailRequest")
    String queryCrmKnowDetailRequest(HSBasicForm hsBasicForm, HttpServletRequest request, HttpServletResponse response) throws Exception {
        Map<String, Object> paramMap = objectToMap(hsBasicForm);
        String result = hsHttpsUtils.post(signUtil.getStarSpaceUrlPath(), paramMap);
        response.setHeader("Access-Control-Allow-Origin", "*");
        return result;
    }

    /**
     *3.30.	【二期】评论查询
     * @param hsBasicForm
     * @return
     * @throws Exception
     */
    @RequestMapping("QueryCrmCommentPageRequest")
    String queryCrmCommentPageRequest(HSBasicForm hsBasicForm, HttpServletRequest request, HttpServletResponse response) throws Exception {
        Map<String, Object> paramMap = objectToMap(hsBasicForm);
        String result = hsHttpsUtils.post(signUtil.getStarSpaceUrlPath(), paramMap);
        response.setHeader("Access-Control-Allow-Origin", "*");
        return result;
    }

    /**
     *3.31.	【二期】评论提交
     * @param hsBasicForm
     * @return
     * @throws Exception
     */
    @RequestMapping("PublishCommentRequest")
    String publishCommentRequest(HSBasicForm hsBasicForm, HttpServletRequest request, HttpServletResponse response) throws Exception {
        Map<String, Object> paramMap = objectToMap(hsBasicForm);
        String result = hsHttpsUtils.post(signUtil.getStarSpaceUrlPath(), paramMap);
        response.setHeader("Access-Control-Allow-Origin", "*");
        return result;
    }

    /**
     *3.32.	【二期】直播链接查询
     * @param hsBasicForm
     * @return
     * @throws Exception
     */
    @RequestMapping("QueryLiveAddressRequest")
    String queryLiveAddressRequest(HSBasicForm hsBasicForm, HttpServletRequest request, HttpServletResponse response) throws Exception {
        Map<String, Object> paramMap = objectToMap(hsBasicForm);
        String result = hsHttpsUtils.post(signUtil.getStarSpaceUrlPath(), paramMap);
        response.setHeader("Access-Control-Allow-Origin", "*");
        return result;
    }

    /**
     *3.33.	【二期】会议、培训列表查询
     * @param hsBasicForm
     * @return
     * @throws Exception
     */
    @RequestMapping("QueryConferenceTrainRequest")
    String queryConferenceTrainRequest(HSBasicForm hsBasicForm, HttpServletRequest request, HttpServletResponse response) throws Exception {
        Map<String, Object> paramMap = objectToMap(hsBasicForm);
        String result = hsHttpsUtils.post(signUtil.getStarSpaceUrlPath(), paramMap);
        response.setHeader("Access-Control-Allow-Origin", "*");
        return result;
    }

    /**
     *3.34.	【二期】会议、培训详情查询
     * @param hsBasicForm
     * @return
     * @throws Exception
     */
    @RequestMapping("QueryConferenceTrainDetailRequest")
    String queryConferenceTrainDetailRequest(HSBasicForm hsBasicForm, HttpServletRequest request, HttpServletResponse response) throws Exception {
        Map<String, Object> paramMap = objectToMap(hsBasicForm);
        String result = hsHttpsUtils.post(signUtil.getStarSpaceUrlPath(), paramMap);
        response.setHeader("Access-Control-Allow-Origin", "*");
        return result;
    }

    /**
     *3.35.	【二期】会议、培训报名
     * @param hsBasicForm
     * @return
     * @throws Exception
     */
    @RequestMapping("AddIntentUserRequest")
    String addIntentUserRequest(HSBasicForm hsBasicForm, HttpServletRequest request, HttpServletResponse response) throws Exception {
        Map<String, Object> paramMap = objectToMap(hsBasicForm);
        String result = hsHttpsUtils.post(signUtil.getStarSpaceUrlPath(), paramMap);
        response.setHeader("Access-Control-Allow-Origin", "*");
        return result;
    }

    /**
     *3.36.	【二期】资料下载
     * @param hsBasicForm
     * @return
     * @throws Exception
     */
    @RequestMapping("DownloadFileRequest")
    String downloadFileRequest(HSBasicForm hsBasicForm, HttpServletRequest request, HttpServletResponse response) throws Exception {
        Map<String, Object> paramMap = objectToMap(hsBasicForm);
        String result = hsHttpsUtils.post(signUtil.getStarSpaceUrlPath(), paramMap);
        response.setHeader("Access-Control-Allow-Origin", "*");
        return result;
    }

    /**
     *3.37.	【二期】会议日程查询
     * @param hsBasicForm
     * @return
     * @throws Exception
     */
    @RequestMapping("QueryConferenceSchedulelRequest")
    String queryConferenceSchedulelRequest(HSBasicForm hsBasicForm, HttpServletRequest request, HttpServletResponse response) throws Exception {
        Map<String, Object> paramMap = objectToMap(hsBasicForm);
        String result = hsHttpsUtils.post(signUtil.getStarSpaceUrlPath(), paramMap);
        response.setHeader("Access-Control-Allow-Origin", "*");
        return result;
    }

    /**
     *3.38.	【二期】添加关注
     * @param hsBasicForm
     * @return
     * @throws Exception
     */
    @RequestMapping("AddCollectRequest")
    String addCollectRequest(HSBasicForm hsBasicForm, HttpServletRequest request, HttpServletResponse response) throws Exception {
        Map<String, Object> paramMap = objectToMap(hsBasicForm);
        String result = hsHttpsUtils.post(signUtil.getStarSpaceUrlPath(), paramMap);
        response.setHeader("Access-Control-Allow-Origin", "*");
        return result;
    }

    /**
     *3.39.	【二期】会议、培训、路演、知识学院评分查阅
     * @param hsBasicForm
     * @return
     * @throws Exception
     */
    @RequestMapping("GetCommonScoreInfoRequest")
    String getCommonScoreInfoRequest(HSBasicForm hsBasicForm, HttpServletRequest request, HttpServletResponse response) throws Exception {
        Map<String, Object> paramMap = objectToMap(hsBasicForm);
        String result = hsHttpsUtils.post(signUtil.getStarSpaceUrlPath(), paramMap);
        response.setHeader("Access-Control-Allow-Origin", "*");
        return result;
    }

    /**
     *3.40.	【二期】会议、培训、路演、知识学院评分
     * @param hsBasicForm
     * @return
     * @throws Exception
     */
    @RequestMapping("PostCommonScoreInfoRequest")
    String postCommonScoreInfoRequest(HSBasicForm hsBasicForm, HttpServletRequest request, HttpServletResponse response) throws Exception {
        Map<String, Object> paramMap = objectToMap(hsBasicForm);
        String result = hsHttpsUtils.post(signUtil.getStarSpaceUrlPath(), paramMap);
        response.setHeader("Access-Control-Allow-Origin", "*");
        return result;
    }

    /**
     *3.42.	【三期】用户详情查询 属于统一会员url
     * @param hsBasicForm
     * @param request
     * @param response
     * @return
     * @throws Exception
     */
    @RequestMapping("QueryUserInfoRequest")
    String queryUserInfoRequest(HSBasicForm hsBasicForm, HttpServletRequest request, HttpServletResponse response) throws Exception {
        //校验非空参数
        if(StringUtils.isBlank(hsBasicForm.getLoginAccount()) || !signUtil.getPlatformId().equals(hsBasicForm.getPlatformId())){
           return new RestApiModel(ResponseStatusCode.lostParams).toJson();
        }
        Map<String, Object> paramMap = objectToMap(hsBasicForm);
        String result = hsHttpsUtils.post(signUtil.getUrlPath(), paramMap);
        response.setHeader("Access-Control-Allow-Origin", "*");
        return result;
    }

    /**
     *3.43. 【三期】安全设置查询
     * @param hsBasicForm
     * @param request
     * @param response
     * @return
     * @throws Exception
     */
    @RequestMapping("QuerySecuritySetRequest")
    String querySecuritySetRequest(HSBasicForm hsBasicForm, HttpServletRequest request, HttpServletResponse response) throws Exception {
        Map<String, Object> paramMap = objectToMap(hsBasicForm);
        String result = hsHttpsUtils.post(signUtil.getStarSpaceUrlPath(), paramMap);
        response.setHeader("Access-Control-Allow-Origin", "*");
        return result;
    }

    /**
     *3.44. 【三期】实名认证信息查询
     * @param hsBasicForm
     * @param request
     * @param response
     * @return
     * @throws Exception
     */
    @RequestMapping("QueryCertificationRequest")
    String queryCertificationRequest(HSBasicForm hsBasicForm, HttpServletRequest request, HttpServletResponse response) throws Exception {
        Map<String, Object> paramMap = objectToMap(hsBasicForm);
        String result = hsHttpsUtils.post(signUtil.getStarSpaceUrlPath(), paramMap);
        response.setHeader("Access-Control-Allow-Origin", "*");
        return result;
    }

    /**
     *3.45. 【三期】实名认证设置
     * @param hsBasicForm
     * @param request
     * @param response
     * @return
     * @throws Exception
     */
    @RequestMapping("CertificationRequest")
    String certificationRequest(HSBasicForm hsBasicForm, HttpServletRequest request, HttpServletResponse response) throws Exception {
        Map<String, Object> paramMap = objectToMap(hsBasicForm);
        String result = hsHttpsUtils.post(signUtil.getStarSpaceUrlPath(), paramMap);
        response.setHeader("Access-Control-Allow-Origin", "*");
        return result;
    }

    /**
     *3.46. 【三期】手机认证设置
     * @param hsBasicForm
     * @param request
     * @param response
     * @return
     * @throws Exception
     */
    @RequestMapping("MobileSetRequest")
    String mobileSetRequest(HSBasicForm hsBasicForm, HttpServletRequest request, HttpServletResponse response) throws Exception {
        Map<String, Object> paramMap = objectToMap(hsBasicForm);
        String result = hsHttpsUtils.post(signUtil.getStarSpaceUrlPath(), paramMap);
        response.setHeader("Access-Control-Allow-Origin", "*");
        return result;
    }

    /**
     *3.47. 【三期】邮箱认证设置
     * @param hsBasicForm
     * @param request
     * @param response
     * @return
     * @throws Exception
     */
    @RequestMapping("EmailSetRequest")
    String emailSetRequest(HSBasicForm hsBasicForm, HttpServletRequest request, HttpServletResponse response) throws Exception {
        Map<String, Object> paramMap = objectToMap(hsBasicForm);
        String result = hsHttpsUtils.post(signUtil.getStarSpaceUrlPath(), paramMap);
        response.setHeader("Access-Control-Allow-Origin", "*");
        return result;
    }

    /**
     *3.48. 【三期】密保认证查询
     * @param hsBasicForm
     * @param request
     * @param response
     * @return
     * @throws Exception
     */
    @RequestMapping("QueryPwdAnswerRequest")
    String queryPwdAnswerRequest(HSBasicForm hsBasicForm, HttpServletRequest request, HttpServletResponse response) throws Exception {
        Map<String, Object> paramMap = objectToMap(hsBasicForm);
        String result = hsHttpsUtils.post(signUtil.getStarSpaceUrlPath(), paramMap);
        response.setHeader("Access-Control-Allow-Origin", "*");
        return result;
    }

    /**
     *3.49. 【三期】密保认证设置
     * @param hsBasicForm
     * @param request
     * @param response
     * @return
     * @throws Exception
     */
    @RequestMapping("PwdAnswerSetRequest")
    String pwdAnswerSetRequest(HSBasicForm hsBasicForm, HttpServletRequest request, HttpServletResponse response) throws Exception {
        Map<String, Object> paramMap = objectToMap(hsBasicForm);
        String result = hsHttpsUtils.post(signUtil.getStarSpaceUrlPath(), paramMap);
        response.setHeader("Access-Control-Allow-Origin", "*");
        return result;
    }

    /**
     *3.50. 【三期】获取短信验证码
     * @param hsBasicForm
     * @param request
     * @param response
     * @return
     * @throws Exception
     */
    @RequestMapping("QueryCheckCodeRequest")
    String queryCheckCodeRequest(HSBasicForm hsBasicForm, HttpServletRequest request, HttpServletResponse response) throws Exception {
        Map<String, Object> paramMap = objectToMap(hsBasicForm);
        String result = hsHttpsUtils.post(signUtil.getStarSpaceUrlPath(), paramMap);
        response.setHeader("Access-Control-Allow-Origin", "*");
        return result;
    }

    /**
     *3.51. 【三期】我的统计查询
     * @param hsBasicForm
     * @param request
     * @param response
     * @return
     * @throws Exception
     */
    @RequestMapping("QueryMyStatisticsRequest")
    String queryMyStatisticsRequest(HSBasicForm hsBasicForm, HttpServletRequest request, HttpServletResponse response) throws Exception {
        Map<String, Object> paramMap = objectToMap(hsBasicForm);
        String result = hsHttpsUtils.post(signUtil.getStarSpaceUrlPath(), paramMap);
        response.setHeader("Access-Control-Allow-Origin", "*");
        return result;
    }

    /**
     *3.52. 【三期】展厅列表查询
     * @param hsBasicForm
     * @param request
     * @param response
     * @return
     * @throws Exception
     */
    @RequestMapping("QueryExhibitionHallRequest")
    String queryExhibitionHallRequest(HSBasicForm hsBasicForm, HttpServletRequest request, HttpServletResponse response) throws Exception {
        Map<String, Object> paramMap = objectToMap(hsBasicForm);
        String result = hsHttpsUtils.post(signUtil.getStarSpaceUrlPath(), paramMap);
        response.setHeader("Access-Control-Allow-Origin", "*");
        return result;
    }

    /**
     *3.53. 【三期】展厅详情查询
     * @param hsBasicForm
     * @param request
     * @param response
     * @return
     * @throws Exception
     */
    @RequestMapping("QueryExhibitionHallDetailRequest")
    String queryExhibitionHallDetailRequest(HSBasicForm hsBasicForm, HttpServletRequest request, HttpServletResponse response) throws Exception {
        Map<String, Object> paramMap = objectToMap(hsBasicForm);
        String result = hsHttpsUtils.post(signUtil.getStarSpaceUrlPath(), paramMap);
        response.setHeader("Access-Control-Allow-Origin", "*");
        return result;
    }

    /**
     *3.54. 【三期】为您推荐查询
     * @param hsBasicForm
     * @param request
     * @param response
     * @return
     * @throws Exception
     */
    @RequestMapping("QueryRecommendedRequest")
    String queryRecommendedRequest(HSBasicForm hsBasicForm, HttpServletRequest request, HttpServletResponse response) throws Exception {
        Map<String, Object> paramMap = objectToMap(hsBasicForm);
        String result = hsHttpsUtils.post(signUtil.getStarSpaceUrlPath(), paramMap);
        response.setHeader("Access-Control-Allow-Origin", "*");
        return result;
    }

    /**
     *3.55. 【三期】权益查询列表
     * @param hsBasicForm
     * @param request
     * @param response
     * @return
     * @throws Exception
     */
    @RequestMapping("QueryInterestRequest")
    String queryInterestRequest(HSBasicForm hsBasicForm, HttpServletRequest request, HttpServletResponse response) throws Exception {
        Map<String, Object> paramMap = objectToMap(hsBasicForm);
        String result = hsHttpsUtils.post(signUtil.getStarSpaceUrlPath(), paramMap);
        response.setHeader("Access-Control-Allow-Origin", "*");
        return result;
    }

    @RequestMapping("sendDataToOtherPlat")
    String sendDataToOtherPlat(HttpServletRequest request, HttpServletResponse response) throws Exception {
        Map paramMap = RequestParamMap.getParamMap(request);
        logger.info("sendDataToOtherPlat 参数：{}"+paramMap);
        response.setHeader("Access-Control-Allow-Origin", "*");
        String url = (String)paramMap.get("url");
        if(StringUtils.isEmpty(url)){
            RestApiModel restApiModel = new RestApiModel(ResponseStatusCode.lostParams);
            return restApiModel.toJson();
        }else {
            String result = hsHttpsUtils.postyunying(signUtil.getYunyingUrlPath()+url, paramMap);
            logger.info("sendDataToOtherPlat 请求返回参数：{}"+result);
            return result;
        }
    }

}

package com.space.controller;

import com.space.common.dto.model.RestApiModel;
import com.space.common.enums.ResponseStatusCode;
import com.space.service.IndexService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * 请求转发
 */
@Controller
@RequestMapping(value = "/starspace/restapi/red")
public class RedirectController extends BaseMobileController {

    private final static Logger logger = LoggerFactory.getLogger(RedirectController.class);

    @Autowired
    private IndexService indexService;


    @RequestMapping(value = "/toNoticeDetail", method = RequestMethod.GET)
    public String toNoticeDetail(String contId, HttpServletRequest request, HttpServletResponse response) {
        logger.info("请求外链资讯详情接口开始，请求参数 contId：" + contId);
        RestApiModel resultApiModel = new RestApiModel();
        if (org.apache.commons.lang3.StringUtils.isBlank(contId)) {
            resultApiModel.setCodeMessage(ResponseStatusCode.lostParams.getCode(), ResponseStatusCode.lostParams.getDesc());
        } else {
            try {
                /**资讯月读量加1*/
                indexService.updateViewCount(contId);
                String links = indexService.getNoticeLinkById(contId);
               // String links = "https://mp.weixin.qq.com/s?__biz=MzA3NTQ3OTAxNg==&mid=2650351325&idx=1&sn=01acc829b521b03f792dd4f5326fcdbc&chksm=8762645ab015ed4cc4153b971fbc2f18e460e2d2d480abf2966a674d6730b29d6a1347c162cf&token=1474499264&lang=zh_CN#rd";
                logger.info("请求外链资讯详情接口结束！");
                return "redirect:"+links;

            } catch (Exception e) {
                logger.error("getNoticeDetail error message:{},exception:{}", e.getMessage(), e);
                //错误信息
                resultApiModel.setCodeMessage(ResponseStatusCode.serverError.getCode(), ResponseStatusCode.serverError.getDesc());
            }
        }
        logger.info("请求外链资讯详情接口结束！");
        response.setHeader("Access-Control-Allow-Origin", "*");
        return resultApiModel.toJson();
    }

}

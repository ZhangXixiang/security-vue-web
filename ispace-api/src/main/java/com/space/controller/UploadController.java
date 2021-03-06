package com.space.controller;

import com.alibaba.fastjson.JSONObject;
import com.space.common.util.BaseFileUtil;
import com.space.common.util.DateTimeUtil;
import com.space.common.util.UploadResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.ServletContextAware;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.ServletContext;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * 文件上传控制器
 *
 * @author: xiaochai
 * @create: 2019-05-31
 **/
@RequestMapping(value = "/upload")
@RestController
public class UploadController implements ServletContextAware {

    private static final Logger LOGGER = LoggerFactory.getLogger(UploadController.class);

    private String rootPath;

    @Value("${demo.fileUpload.fileSavePathPrefix}")
    private String fileSavePathPrefix;
    @Value("${demo.fileUpload.fileSavePath}")
    private String fileSavePath;
    @Value("${demo.fileUpload.fileSavePath1}")
    private String fileSavePath1;
    @Value("${demo.fileUpload.fileMaxSize}")
    private String fileMaxSize;
    @Value("${demo.fileUpload.fileUrlPrefix}")
    private String fileUrlPrefix;

    @Override
    public void setServletContext(ServletContext servletContext) {
        rootPath = servletContext.getRealPath("/");
    }


    /**
     * 上传文件
     * 上传到项目的webapp
     *
     * @param multipartFile
     * @return
     */
    @PostMapping(value = "/upload")
    @ResponseBody
    public Object upload(@RequestPart("file") MultipartFile multipartFile) {

        try {
            if (null != multipartFile) {
                String localSavePath = fileSavePath;

                long size = multipartFile.getSize();
                if (size > Long.valueOf(fileMaxSize)){
                    return null;
                }

                UploadResult result = BaseFileUtil.writeFileToService(multipartFile, fileSavePathPrefix, localSavePath);

                if (result.getIsSuccess()) {
                    Map<String, Object> resultMap = new HashMap<>();

                    resultMap.put("size", size);
                    // 文件名
                    resultMap.put( "originalName", multipartFile.getOriginalFilename());
                    // 文件名
                    resultMap.put( "fileName", result.getFileName());
                    // 所属group
                    resultMap.put( "group", localSavePath.substring(localSavePath.lastIndexOf("/") + 1));
                    // 文件访问的url
//                    resultMap.put( "url", fileUrlPrefix  + "/" + localSavePath + "/" + result.getFileName());
                    resultMap.put( "url", localSavePath + "/" + result.getFileName());

                    return JSONObject.toJSONString(resultMap);
                }
            }
        } catch (Exception e) {
            LOGGER.error(e.getMessage(), e);
        }
        return null;
    }

    /**
     * 上传文件
     * 上传到项目的webapp
     *
     * @param multipartFile
     * @return
     */
    @PostMapping(value = "/upload1")
    @ResponseBody
    public Object upload1(@RequestPart("file") MultipartFile multipartFile) {

        try {
            if (null != multipartFile) {
                String localSavePath = fileSavePath1;

                long size = multipartFile.getSize();
                if (size > Long.valueOf(fileMaxSize)){
                    return null;
                }

                UploadResult result = BaseFileUtil.writeFileToService(multipartFile, fileSavePathPrefix, localSavePath);

                if (result.getIsSuccess()) {
                    Map<String, Object> resultMap = new HashMap<>();

                    resultMap.put("size", size);
                    // 文件名
                    resultMap.put( "originalName", multipartFile.getOriginalFilename());
                    // 文件名
                    resultMap.put( "fileName", result.getFileName());
                    // 所属group
                    resultMap.put( "group", localSavePath.substring(localSavePath.lastIndexOf("/") + 1));
                    // 文件访问的url
                    resultMap.put( "url", localSavePath + "/" + result.getFileName());

                    return JSONObject.toJSONString(resultMap);
                }
            }
        } catch (Exception e) {
            LOGGER.error(e.getMessage(), e);
        }
        return null;
    }


}

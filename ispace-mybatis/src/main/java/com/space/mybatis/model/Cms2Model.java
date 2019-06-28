package com.space.mybatis.model;

import java.util.Date;

public class Cms2Model {
    private Long id;

    private String modelName;

    private String modelPath;

    private String tplChannelPrefix;

    private String tplContentPrefix;

    private Long titleImgWidth;

    private Long titleImgHeight;

    private Long contentImgWidth;

    private Long contentImgHeight;

    private Long priority;

    private Long hasContent;

    private Long isDisabled;

    private Long isDef;

    private Date gmtCreate;

    private Date gmtModify;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName == null ? null : modelName.trim();
    }

    public String getModelPath() {
        return modelPath;
    }

    public void setModelPath(String modelPath) {
        this.modelPath = modelPath == null ? null : modelPath.trim();
    }

    public String getTplChannelPrefix() {
        return tplChannelPrefix;
    }

    public void setTplChannelPrefix(String tplChannelPrefix) {
        this.tplChannelPrefix = tplChannelPrefix == null ? null : tplChannelPrefix.trim();
    }

    public String getTplContentPrefix() {
        return tplContentPrefix;
    }

    public void setTplContentPrefix(String tplContentPrefix) {
        this.tplContentPrefix = tplContentPrefix == null ? null : tplContentPrefix.trim();
    }

    public Long getTitleImgWidth() {
        return titleImgWidth;
    }

    public void setTitleImgWidth(Long titleImgWidth) {
        this.titleImgWidth = titleImgWidth;
    }

    public Long getTitleImgHeight() {
        return titleImgHeight;
    }

    public void setTitleImgHeight(Long titleImgHeight) {
        this.titleImgHeight = titleImgHeight;
    }

    public Long getContentImgWidth() {
        return contentImgWidth;
    }

    public void setContentImgWidth(Long contentImgWidth) {
        this.contentImgWidth = contentImgWidth;
    }

    public Long getContentImgHeight() {
        return contentImgHeight;
    }

    public void setContentImgHeight(Long contentImgHeight) {
        this.contentImgHeight = contentImgHeight;
    }

    public Long getPriority() {
        return priority;
    }

    public void setPriority(Long priority) {
        this.priority = priority;
    }

    public Long getHasContent() {
        return hasContent;
    }

    public void setHasContent(Long hasContent) {
        this.hasContent = hasContent;
    }

    public Long getIsDisabled() {
        return isDisabled;
    }

    public void setIsDisabled(Long isDisabled) {
        this.isDisabled = isDisabled;
    }

    public Long getIsDef() {
        return isDef;
    }

    public void setIsDef(Long isDef) {
        this.isDef = isDef;
    }

    public Date getGmtCreate() {
        return gmtCreate;
    }

    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    public Date getGmtModify() {
        return gmtModify;
    }

    public void setGmtModify(Date gmtModify) {
        this.gmtModify = gmtModify;
    }
}
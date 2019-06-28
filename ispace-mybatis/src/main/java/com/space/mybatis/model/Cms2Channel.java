package com.space.mybatis.model;

import java.util.Date;

public class Cms2Channel {
    private Long id;

    /**
     * 模型ID
     */
    private Long modelId;

    /**
     * 站点ID
     */
    private Long siteId;

    /**
     * 是否是父栏目 1:是 2：不是
     */
    private Long isParent;

    /**
     * 父栏目ID
     */
    private Long parentId;

    /**
     * 访问路径
     */
    private String code;

    private Long lft;

    private Long rgt;

    private String priority;

    /**
     * 是否显示1显示 2不显示
     */
    private Long isDisplay;

    /**
     * 是否待删除1正常 2待删除
     */
    private Long status;

    /**
     * 栏目副本设置 主本 1：不是；2：是
     */
    private Long copyMain;

    /**
     * 栏目副本设置 ?副本 1：不是；2：是
     */
    private Long copyCopy;

    private Date gmtCreate;

    private Date gmtModify;

    private String treeSort;

    /**
     * 栏目名称
     */
    private String channelName;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getModelId() {
        return modelId;
    }

    public void setModelId(Long modelId) {
        this.modelId = modelId;
    }

    public Long getSiteId() {
        return siteId;
    }

    public void setSiteId(Long siteId) {
        this.siteId = siteId;
    }

    public Long getIsParent() {
        return isParent;
    }

    public void setIsParent(Long isParent) {
        this.isParent = isParent;
    }

    public Long getParentId() {
        return parentId;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    public Long getLft() {
        return lft;
    }

    public void setLft(Long lft) {
        this.lft = lft;
    }

    public Long getRgt() {
        return rgt;
    }

    public void setRgt(Long rgt) {
        this.rgt = rgt;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority == null ? null : priority.trim();
    }

    public Long getIsDisplay() {
        return isDisplay;
    }

    public void setIsDisplay(Long isDisplay) {
        this.isDisplay = isDisplay;
    }

    public Long getStatus() {
        return status;
    }

    public void setStatus(Long status) {
        this.status = status;
    }

    public Long getCopyMain() {
        return copyMain;
    }

    public void setCopyMain(Long copyMain) {
        this.copyMain = copyMain;
    }

    public Long getCopyCopy() {
        return copyCopy;
    }

    public void setCopyCopy(Long copyCopy) {
        this.copyCopy = copyCopy;
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

    public String getTreeSort() {
        return treeSort;
    }

    public void setTreeSort(String treeSort) {
        this.treeSort = treeSort == null ? null : treeSort.trim();
    }

    public String getChannelName() {
        return channelName;
    }

    public void setChannelName(String channelName) {
        this.channelName = channelName == null ? null : channelName.trim();
    }
}
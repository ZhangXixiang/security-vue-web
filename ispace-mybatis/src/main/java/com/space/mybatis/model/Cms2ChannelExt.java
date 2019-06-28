package com.space.mybatis.model;

public class Cms2ChannelExt {
    private Long id;

    private Long channelId;

    /**
     * 终审级别
     */
    private Long finalStep;

    /**
     * 审核后(1:不能修改删除;2:修改后退回;3:修改后不变)
     */
    private Long afterCheck;

    /**
     * 栏目标题图宽度，例如：139
     */
    private Long titleImgWidth;

    /**
     * 栏目标题图高度，例如：139
     */
    private Long titleImgHeight;

    /**
     * 栏目内容图宽度，例如：310
     */
    private Long contImgWidth;

    /**
     * 栏目内容图高度，例如：310
     */
    private Long contImgHeight;

    /**
     * 是否栏目静态化 1静态化 2不静态化
     */
    private Long isStaticChnl;

    /**
     * 是否内容静态化 1静态化 2不静态化
     */
    private Long isStaticCont;

    /**
     * 是否使用目录访问 1使用2不使用
     */
    private Long isAccessByDir;

    /**
     * 是否使用子栏目列表 1使用 2不使用
     */
    private Long isListChild;

    /**
     * 每页多少条记录
     */
    private Long pageSize;

    /**
     * 外部链接
     */
    private String link;

    /**
     * 栏目页模板ID
     */
    private Long tplChnlId;

    /**
     * 内容页模板ID
     */
    private Long tplContId;

    /**
     * 内容是否有缩略图 1没有 2有
     */
    private Long hasTitleImg;

    /**
     * 内容是否有内容图 1没有 2有
     */
    private Long hasContImg;

    /**
     * 评论(1:匿名;2:会员;3:关闭)
     */
    private Long commentControl;

    /**
     * 顶踩 1开放 2 关闭
     */
    private Long allowUpdown;

    /**
     * 是否新窗口打开 1是 2不是
     */
    private Long isBlank;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getChannelId() {
        return channelId;
    }

    public void setChannelId(Long channelId) {
        this.channelId = channelId;
    }

    public Long getFinalStep() {
        return finalStep;
    }

    public void setFinalStep(Long finalStep) {
        this.finalStep = finalStep;
    }

    public Long getAfterCheck() {
        return afterCheck;
    }

    public void setAfterCheck(Long afterCheck) {
        this.afterCheck = afterCheck;
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

    public Long getContImgWidth() {
        return contImgWidth;
    }

    public void setContImgWidth(Long contImgWidth) {
        this.contImgWidth = contImgWidth;
    }

    public Long getContImgHeight() {
        return contImgHeight;
    }

    public void setContImgHeight(Long contImgHeight) {
        this.contImgHeight = contImgHeight;
    }

    public Long getIsStaticChnl() {
        return isStaticChnl;
    }

    public void setIsStaticChnl(Long isStaticChnl) {
        this.isStaticChnl = isStaticChnl;
    }

    public Long getIsStaticCont() {
        return isStaticCont;
    }

    public void setIsStaticCont(Long isStaticCont) {
        this.isStaticCont = isStaticCont;
    }

    public Long getIsAccessByDir() {
        return isAccessByDir;
    }

    public void setIsAccessByDir(Long isAccessByDir) {
        this.isAccessByDir = isAccessByDir;
    }

    public Long getIsListChild() {
        return isListChild;
    }

    public void setIsListChild(Long isListChild) {
        this.isListChild = isListChild;
    }

    public Long getPageSize() {
        return pageSize;
    }

    public void setPageSize(Long pageSize) {
        this.pageSize = pageSize;
    }

    public Long getTplChnlId() {
        return tplChnlId;
    }

    public void setTplChnlId(Long tplChnlId) {
        this.tplChnlId = tplChnlId;
    }

    public Long getTplContId() {
        return tplContId;
    }

    public void setTplContId(Long tplContId) {
        this.tplContId = tplContId;
    }

    public Long getHasTitleImg() {
        return hasTitleImg;
    }

    public void setHasTitleImg(Long hasTitleImg) {
        this.hasTitleImg = hasTitleImg;
    }

    public Long getHasContImg() {
        return hasContImg;
    }

    public void setHasContImg(Long hasContImg) {
        this.hasContImg = hasContImg;
    }

    public Long getCommentControl() {
        return commentControl;
    }

    public void setCommentControl(Long commentControl) {
        this.commentControl = commentControl;
    }

    public Long getAllowUpdown() {
        return allowUpdown;
    }

    public void setAllowUpdown(Long allowUpdown) {
        this.allowUpdown = allowUpdown;
    }

    public Long getIsBlank() {
        return isBlank;
    }

    public void setIsBlank(Long isBlank) {
        this.isBlank = isBlank;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }
}
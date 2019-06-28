package com.space.mybatis.model;

import java.util.Date;

public class Cms2Cont {
    private Long id;

    /**
     * 栏目ID
     */
    private Long channelId;

    /**
     * 站点ID
     */
    private Long siteId;

    /**
     * 管理平台撰稿人ID
     */
    private Long adminId;

    /**
     * 前台投稿人
     */
    private Long memberId;

    /**
     * 排序日期
     */
    private Date sortDate;

    /**
     * 固顶级别 0不固顶；其余正整数代表相应固顶级别(1-99)
     */
    private Long topLevel;

    /**
     * 是否有标题图 1有 2没有 3未上传图片
     */
    private Long hasTitleImg;

    /**
     * 是否推荐 1不推荐 2推荐
     */
    private Long isRecommend;

    /**
     * 状态(1:草稿;2:审核中;3:审核通过;4:回收站,5待删除)
     */
    private Long status;

    /**
     * 日访问数
     */
    private Long viewsDay;

    /**
     * 日评论数
     */
    private Long commentsDay;

    /**
     * 日下载数
     */
    private Long downloadsDay;

    /**
     * 日顶数
     */
    private Long upsDay;

    /**
     * 修改时间
     */
    private Date modifyTime;

    /**
     * 内容 正本
     */
    private Long contIdMain;

    /**
     * 外部系统内容ID
     */
    private String exterContId;

    /**
     * 是否是副本 1：否；2：是
     */
    private Long isCopy;

    /**
     * 是否隐藏 1：默认文章不隐藏 2单页状态下隐藏
     */
    private Long isHide;

    private Date gmtCreate;

    private Date gmtModify;

    /**
     * 管理平台撰稿人姓名
     */
    private String adminName;

    /**
     * 前台投稿人姓名
     */
    private String memberName;

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

    public Long getSiteId() {
        return siteId;
    }

    public void setSiteId(Long siteId) {
        this.siteId = siteId;
    }

    public Long getAdminId() {
        return adminId;
    }

    public void setAdminId(Long adminId) {
        this.adminId = adminId;
    }

    public Long getMemberId() {
        return memberId;
    }

    public void setMemberId(Long memberId) {
        this.memberId = memberId;
    }

    public Date getSortDate() {
        return sortDate;
    }

    public void setSortDate(Date sortDate) {
        this.sortDate = sortDate;
    }

    public Long getTopLevel() {
        return topLevel;
    }

    public void setTopLevel(Long topLevel) {
        this.topLevel = topLevel;
    }

    public Long getHasTitleImg() {
        return hasTitleImg;
    }

    public void setHasTitleImg(Long hasTitleImg) {
        this.hasTitleImg = hasTitleImg;
    }

    public Long getIsRecommend() {
        return isRecommend;
    }

    public void setIsRecommend(Long isRecommend) {
        this.isRecommend = isRecommend;
    }

    public Long getStatus() {
        return status;
    }

    public void setStatus(Long status) {
        this.status = status;
    }

    public Long getViewsDay() {
        return viewsDay;
    }

    public void setViewsDay(Long viewsDay) {
        this.viewsDay = viewsDay;
    }

    public Long getCommentsDay() {
        return commentsDay;
    }

    public void setCommentsDay(Long commentsDay) {
        this.commentsDay = commentsDay;
    }

    public Long getDownloadsDay() {
        return downloadsDay;
    }

    public void setDownloadsDay(Long downloadsDay) {
        this.downloadsDay = downloadsDay;
    }

    public Long getUpsDay() {
        return upsDay;
    }

    public void setUpsDay(Long upsDay) {
        this.upsDay = upsDay;
    }

    public Date getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    public Long getContIdMain() {
        return contIdMain;
    }

    public void setContIdMain(Long contIdMain) {
        this.contIdMain = contIdMain;
    }

    public String getExterContId() {
        return exterContId;
    }

    public void setExterContId(String exterContId) {
        this.exterContId = exterContId == null ? null : exterContId.trim();
    }

    public Long getIsCopy() {
        return isCopy;
    }

    public void setIsCopy(Long isCopy) {
        this.isCopy = isCopy;
    }

    public Long getIsHide() {
        return isHide;
    }

    public void setIsHide(Long isHide) {
        this.isHide = isHide;
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

    public String getAdminName() {
        return adminName;
    }

    public void setAdminName(String adminName) {
        this.adminName = adminName == null ? null : adminName.trim();
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName == null ? null : memberName.trim();
    }
}
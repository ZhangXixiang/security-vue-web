package com.space.mybatis.model;

import java.util.Date;

public class Cms2ContCount {
    private Long id;

    private Long contId;

    /**
     * 总访问数
     */
    private Long views;

    /**
     * 月访问数
     */
    private Long viewsMonth;

    /**
     * 周访问数
     */
    private Long viewsWeek;

    /**
     * 日访问数
     */
    private Long viewsDay;

    /**
     * 总评论数
     */
    private Long comments;

    /**
     * 月评论数
     */
    private Long commentsMonth;

    /**
     * 周评论数
     */
    private Long commentsWeek;

    /**
     * 日评论数
     */
    private Long commentsDay;

    /**
     * 总下载数
     */
    private Long downloads;

    /**
     * 月下载数
     */
    private Long downloadsMonth;

    /**
     * 周下载数
     */
    private Long downloadsWeek;

    /**
     * 日下载数
     */
    private Long downloadsDay;

    /**
     * 总顶数
     */
    private Long ups;

    /**
     * 月顶数
     */
    private Long upsMonth;

    /**
     * 周顶数
     */
    private Long upsWeek;

    /**
     * 日顶数
     */
    private Long upsDay;

    /**
     * 总踩数
     */
    private Long downs;

    private Date gmtCreate;

    private Date gmtModify;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getContId() {
        return contId;
    }

    public void setContId(Long contId) {
        this.contId = contId;
    }

    public Long getViews() {
        return views;
    }

    public void setViews(Long views) {
        this.views = views;
    }

    public Long getViewsMonth() {
        return viewsMonth;
    }

    public void setViewsMonth(Long viewsMonth) {
        this.viewsMonth = viewsMonth;
    }

    public Long getViewsWeek() {
        return viewsWeek;
    }

    public void setViewsWeek(Long viewsWeek) {
        this.viewsWeek = viewsWeek;
    }

    public Long getViewsDay() {
        return viewsDay;
    }

    public void setViewsDay(Long viewsDay) {
        this.viewsDay = viewsDay;
    }

    public Long getComments() {
        return comments;
    }

    public void setComments(Long comments) {
        this.comments = comments;
    }

    public Long getCommentsMonth() {
        return commentsMonth;
    }

    public void setCommentsMonth(Long commentsMonth) {
        this.commentsMonth = commentsMonth;
    }

    public Long getCommentsWeek() {
        return commentsWeek;
    }

    public void setCommentsWeek(Long commentsWeek) {
        this.commentsWeek = commentsWeek;
    }

    public Long getCommentsDay() {
        return commentsDay;
    }

    public void setCommentsDay(Long commentsDay) {
        this.commentsDay = commentsDay;
    }

    public Long getDownloads() {
        return downloads;
    }

    public void setDownloads(Long downloads) {
        this.downloads = downloads;
    }

    public Long getDownloadsMonth() {
        return downloadsMonth;
    }

    public void setDownloadsMonth(Long downloadsMonth) {
        this.downloadsMonth = downloadsMonth;
    }

    public Long getDownloadsWeek() {
        return downloadsWeek;
    }

    public void setDownloadsWeek(Long downloadsWeek) {
        this.downloadsWeek = downloadsWeek;
    }

    public Long getDownloadsDay() {
        return downloadsDay;
    }

    public void setDownloadsDay(Long downloadsDay) {
        this.downloadsDay = downloadsDay;
    }

    public Long getUps() {
        return ups;
    }

    public void setUps(Long ups) {
        this.ups = ups;
    }

    public Long getUpsMonth() {
        return upsMonth;
    }

    public void setUpsMonth(Long upsMonth) {
        this.upsMonth = upsMonth;
    }

    public Long getUpsWeek() {
        return upsWeek;
    }

    public void setUpsWeek(Long upsWeek) {
        this.upsWeek = upsWeek;
    }

    public Long getUpsDay() {
        return upsDay;
    }

    public void setUpsDay(Long upsDay) {
        this.upsDay = upsDay;
    }

    public Long getDowns() {
        return downs;
    }

    public void setDowns(Long downs) {
        this.downs = downs;
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
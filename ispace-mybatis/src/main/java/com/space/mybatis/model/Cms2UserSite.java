package com.space.mybatis.model;

import java.util.Date;

public class Cms2UserSite {
    private Long id;

    private Long adminId;

    private Long siteId;

    private Long checkStep;

    private Long isAllChannel;

    private Date gmtCreate;

    private Date gmtModify;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getAdminId() {
        return adminId;
    }

    public void setAdminId(Long adminId) {
        this.adminId = adminId;
    }

    public Long getSiteId() {
        return siteId;
    }

    public void setSiteId(Long siteId) {
        this.siteId = siteId;
    }

    public Long getCheckStep() {
        return checkStep;
    }

    public void setCheckStep(Long checkStep) {
        this.checkStep = checkStep;
    }

    public Long getIsAllChannel() {
        return isAllChannel;
    }

    public void setIsAllChannel(Long isAllChannel) {
        this.isAllChannel = isAllChannel;
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
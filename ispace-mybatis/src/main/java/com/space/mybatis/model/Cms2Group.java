package com.space.mybatis.model;

import java.util.Date;

public class Cms2Group {
    private Long id;

    private String code;

    private String groupName;

    private Long priority;

    private Long needCaptcha;

    private Long needCheck;

    private Long allowPerDay;

    private Long allowMaxFile;

    private Long isRegDef;

    private Date gmtCreate;

    private Date gmtModify;

    private String allowSuffix;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName == null ? null : groupName.trim();
    }

    public Long getPriority() {
        return priority;
    }

    public void setPriority(Long priority) {
        this.priority = priority;
    }

    public Long getNeedCaptcha() {
        return needCaptcha;
    }

    public void setNeedCaptcha(Long needCaptcha) {
        this.needCaptcha = needCaptcha;
    }

    public Long getNeedCheck() {
        return needCheck;
    }

    public void setNeedCheck(Long needCheck) {
        this.needCheck = needCheck;
    }

    public Long getAllowPerDay() {
        return allowPerDay;
    }

    public void setAllowPerDay(Long allowPerDay) {
        this.allowPerDay = allowPerDay;
    }

    public Long getAllowMaxFile() {
        return allowMaxFile;
    }

    public void setAllowMaxFile(Long allowMaxFile) {
        this.allowMaxFile = allowMaxFile;
    }

    public Long getIsRegDef() {
        return isRegDef;
    }

    public void setIsRegDef(Long isRegDef) {
        this.isRegDef = isRegDef;
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

    public String getAllowSuffix() {
        return allowSuffix;
    }

    public void setAllowSuffix(String allowSuffix) {
        this.allowSuffix = allowSuffix == null ? null : allowSuffix.trim();
    }
}
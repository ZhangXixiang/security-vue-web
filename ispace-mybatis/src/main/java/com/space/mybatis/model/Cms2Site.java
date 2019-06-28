package com.space.mybatis.model;

import java.util.Date;

public class Cms2Site {
    private Long id;

    private Long configId;

    private Long ftpUploadId;

    private String domain;

    private String sitePath;

    private String siteName;

    private String shortName;

    private String protocol;

    private String dynamicSuffix;

    private String staticSuffix;

    private String staticDir;

    private Long isIndexToRoot;

    private Long isStaticIndex;

    private String localeAdmin;

    private String localeFront;

    private String tplSolution;

    private Long finalStep;

    private Long afterCheck;

    private Long isRelativePath;

    private Long isRecycleOn;

    private Long staticRange;

    private Long staticPage;

    private Long pageSize;

    private Date gmtCreate;

    private Date gmtModify;

    private Long overReview;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getConfigId() {
        return configId;
    }

    public void setConfigId(Long configId) {
        this.configId = configId;
    }

    public Long getFtpUploadId() {
        return ftpUploadId;
    }

    public void setFtpUploadId(Long ftpUploadId) {
        this.ftpUploadId = ftpUploadId;
    }

    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain == null ? null : domain.trim();
    }

    public String getSitePath() {
        return sitePath;
    }

    public void setSitePath(String sitePath) {
        this.sitePath = sitePath == null ? null : sitePath.trim();
    }

    public String getSiteName() {
        return siteName;
    }

    public void setSiteName(String siteName) {
        this.siteName = siteName == null ? null : siteName.trim();
    }

    public String getShortName() {
        return shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName == null ? null : shortName.trim();
    }

    public String getProtocol() {
        return protocol;
    }

    public void setProtocol(String protocol) {
        this.protocol = protocol == null ? null : protocol.trim();
    }

    public String getDynamicSuffix() {
        return dynamicSuffix;
    }

    public void setDynamicSuffix(String dynamicSuffix) {
        this.dynamicSuffix = dynamicSuffix == null ? null : dynamicSuffix.trim();
    }

    public String getStaticSuffix() {
        return staticSuffix;
    }

    public void setStaticSuffix(String staticSuffix) {
        this.staticSuffix = staticSuffix == null ? null : staticSuffix.trim();
    }

    public String getStaticDir() {
        return staticDir;
    }

    public void setStaticDir(String staticDir) {
        this.staticDir = staticDir == null ? null : staticDir.trim();
    }

    public Long getIsIndexToRoot() {
        return isIndexToRoot;
    }

    public void setIsIndexToRoot(Long isIndexToRoot) {
        this.isIndexToRoot = isIndexToRoot;
    }

    public Long getIsStaticIndex() {
        return isStaticIndex;
    }

    public void setIsStaticIndex(Long isStaticIndex) {
        this.isStaticIndex = isStaticIndex;
    }

    public String getLocaleAdmin() {
        return localeAdmin;
    }

    public void setLocaleAdmin(String localeAdmin) {
        this.localeAdmin = localeAdmin == null ? null : localeAdmin.trim();
    }

    public String getLocaleFront() {
        return localeFront;
    }

    public void setLocaleFront(String localeFront) {
        this.localeFront = localeFront == null ? null : localeFront.trim();
    }

    public String getTplSolution() {
        return tplSolution;
    }

    public void setTplSolution(String tplSolution) {
        this.tplSolution = tplSolution == null ? null : tplSolution.trim();
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

    public Long getIsRelativePath() {
        return isRelativePath;
    }

    public void setIsRelativePath(Long isRelativePath) {
        this.isRelativePath = isRelativePath;
    }

    public Long getIsRecycleOn() {
        return isRecycleOn;
    }

    public void setIsRecycleOn(Long isRecycleOn) {
        this.isRecycleOn = isRecycleOn;
    }

    public Long getStaticRange() {
        return staticRange;
    }

    public void setStaticRange(Long staticRange) {
        this.staticRange = staticRange;
    }

    public Long getStaticPage() {
        return staticPage;
    }

    public void setStaticPage(Long staticPage) {
        this.staticPage = staticPage;
    }

    public Long getPageSize() {
        return pageSize;
    }

    public void setPageSize(Long pageSize) {
        this.pageSize = pageSize;
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

    public Long getOverReview() {
        return overReview;
    }

    public void setOverReview(Long overReview) {
        this.overReview = overReview;
    }
}
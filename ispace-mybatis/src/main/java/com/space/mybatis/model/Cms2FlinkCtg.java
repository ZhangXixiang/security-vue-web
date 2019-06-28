package com.space.mybatis.model;

import java.util.Date;

public class Cms2FlinkCtg {
    private Long id;

    private Long siteId;

    private String name;

    /**
     * 1：图片 （默认）；2：文字；3：图片+文字 ；
     */
    private Long type;

    /**
     * 是否是父类目 1:是 2：不是
     */
    private Long isParent;

    /**
     * 父栏目ID 为空代表顶级栏目
     */
    private Long parentId;

    private String code;

    /**
     * 后台显示的优先级
     */
    private Long priority;

    /**
     * 排序方式 0:倒序 1：正序
     */
    private Long sortType;

    /**
     * 1：启用 （默认）2：不启用
     */
    private Long isEnable;

    private String remark;

    private Date gmtCreate;

    private Date gmtModify;

    /**
     * 1:正常 2：删除
     */
    private Long status;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getSiteId() {
        return siteId;
    }

    public void setSiteId(Long siteId) {
        this.siteId = siteId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Long getType() {
        return type;
    }

    public void setType(Long type) {
        this.type = type;
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

    public Long getPriority() {
        return priority;
    }

    public void setPriority(Long priority) {
        this.priority = priority;
    }

    public Long getSortType() {
        return sortType;
    }

    public void setSortType(Long sortType) {
        this.sortType = sortType;
    }

    public Long getIsEnable() {
        return isEnable;
    }

    public void setIsEnable(Long isEnable) {
        this.isEnable = isEnable;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
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

    public Long getStatus() {
        return status;
    }

    public void setStatus(Long status) {
        this.status = status;
    }
}
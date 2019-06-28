package com.space.mybatis.model;

import java.util.Date;

/**
 * 附件表
 */
public class Cms2Attach {
    private Long id;

    /**
     * 1000：友情链接；1100：广告；1200：文章附件集；1301：文章图片集；1302：文章?栏目标题图；1303：文章?内容标题图；1400：栏目?栏目标题图
     */
    private Long attachType;

    private Long objId;

    /**
     * 优先级
     */
    private Long priority;

    private Long fileId;

    private String fileName;

    private Long downloadCount;

    /**
     * 状态(1:永久;2:临时)
     */
    private Long status;

    private Date gmtCreate;

    private Date gmtModify;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getAttachType() {
        return attachType;
    }

    public void setAttachType(Long attachType) {
        this.attachType = attachType;
    }

    public Long getObjId() {
        return objId;
    }

    public void setObjId(Long objId) {
        this.objId = objId;
    }

    public Long getPriority() {
        return priority;
    }

    public void setPriority(Long priority) {
        this.priority = priority;
    }

    public Long getFileId() {
        return fileId;
    }

    public void setFileId(Long fileId) {
        this.fileId = fileId;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName == null ? null : fileName.trim();
    }

    public Long getDownloadCount() {
        return downloadCount;
    }

    public void setDownloadCount(Long downloadCount) {
        this.downloadCount = downloadCount;
    }

    public Long getStatus() {
        return status;
    }

    public void setStatus(Long status) {
        this.status = status;
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
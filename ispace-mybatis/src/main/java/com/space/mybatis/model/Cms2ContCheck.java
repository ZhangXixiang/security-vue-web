package com.space.mybatis.model;

public class Cms2ContCheck {
    private Long id;

    private Long contentId;

    /**
     * 审核步数
     */
    private Long checkStep;

    /**
     * 是否退回 1不退回 2退回
     */
    private Long isRejected;

    /**
     * 审核意见
     */
    private String checkOpinion;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getContentId() {
        return contentId;
    }

    public void setContentId(Long contentId) {
        this.contentId = contentId;
    }

    public Long getCheckStep() {
        return checkStep;
    }

    public void setCheckStep(Long checkStep) {
        this.checkStep = checkStep;
    }

    public Long getIsRejected() {
        return isRejected;
    }

    public void setIsRejected(Long isRejected) {
        this.isRejected = isRejected;
    }

    public String getCheckOpinion() {
        return checkOpinion;
    }

    public void setCheckOpinion(String checkOpinion) {
        this.checkOpinion = checkOpinion == null ? null : checkOpinion.trim();
    }
}
package com.space.mybatis.model;

import java.util.ArrayList;
import java.util.List;

public class Cms2ChannelExtExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public Cms2ChannelExtExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andChannelIdIsNull() {
            addCriterion("CHANNEL_ID is null");
            return (Criteria) this;
        }

        public Criteria andChannelIdIsNotNull() {
            addCriterion("CHANNEL_ID is not null");
            return (Criteria) this;
        }

        public Criteria andChannelIdEqualTo(Long value) {
            addCriterion("CHANNEL_ID =", value, "channelId");
            return (Criteria) this;
        }

        public Criteria andChannelIdNotEqualTo(Long value) {
            addCriterion("CHANNEL_ID <>", value, "channelId");
            return (Criteria) this;
        }

        public Criteria andChannelIdGreaterThan(Long value) {
            addCriterion("CHANNEL_ID >", value, "channelId");
            return (Criteria) this;
        }

        public Criteria andChannelIdGreaterThanOrEqualTo(Long value) {
            addCriterion("CHANNEL_ID >=", value, "channelId");
            return (Criteria) this;
        }

        public Criteria andChannelIdLessThan(Long value) {
            addCriterion("CHANNEL_ID <", value, "channelId");
            return (Criteria) this;
        }

        public Criteria andChannelIdLessThanOrEqualTo(Long value) {
            addCriterion("CHANNEL_ID <=", value, "channelId");
            return (Criteria) this;
        }

        public Criteria andChannelIdIn(List<Long> values) {
            addCriterion("CHANNEL_ID in", values, "channelId");
            return (Criteria) this;
        }

        public Criteria andChannelIdNotIn(List<Long> values) {
            addCriterion("CHANNEL_ID not in", values, "channelId");
            return (Criteria) this;
        }

        public Criteria andChannelIdBetween(Long value1, Long value2) {
            addCriterion("CHANNEL_ID between", value1, value2, "channelId");
            return (Criteria) this;
        }

        public Criteria andChannelIdNotBetween(Long value1, Long value2) {
            addCriterion("CHANNEL_ID not between", value1, value2, "channelId");
            return (Criteria) this;
        }

        public Criteria andFinalStepIsNull() {
            addCriterion("FINAL_STEP is null");
            return (Criteria) this;
        }

        public Criteria andFinalStepIsNotNull() {
            addCriterion("FINAL_STEP is not null");
            return (Criteria) this;
        }

        public Criteria andFinalStepEqualTo(Long value) {
            addCriterion("FINAL_STEP =", value, "finalStep");
            return (Criteria) this;
        }

        public Criteria andFinalStepNotEqualTo(Long value) {
            addCriterion("FINAL_STEP <>", value, "finalStep");
            return (Criteria) this;
        }

        public Criteria andFinalStepGreaterThan(Long value) {
            addCriterion("FINAL_STEP >", value, "finalStep");
            return (Criteria) this;
        }

        public Criteria andFinalStepGreaterThanOrEqualTo(Long value) {
            addCriterion("FINAL_STEP >=", value, "finalStep");
            return (Criteria) this;
        }

        public Criteria andFinalStepLessThan(Long value) {
            addCriterion("FINAL_STEP <", value, "finalStep");
            return (Criteria) this;
        }

        public Criteria andFinalStepLessThanOrEqualTo(Long value) {
            addCriterion("FINAL_STEP <=", value, "finalStep");
            return (Criteria) this;
        }

        public Criteria andFinalStepIn(List<Long> values) {
            addCriterion("FINAL_STEP in", values, "finalStep");
            return (Criteria) this;
        }

        public Criteria andFinalStepNotIn(List<Long> values) {
            addCriterion("FINAL_STEP not in", values, "finalStep");
            return (Criteria) this;
        }

        public Criteria andFinalStepBetween(Long value1, Long value2) {
            addCriterion("FINAL_STEP between", value1, value2, "finalStep");
            return (Criteria) this;
        }

        public Criteria andFinalStepNotBetween(Long value1, Long value2) {
            addCriterion("FINAL_STEP not between", value1, value2, "finalStep");
            return (Criteria) this;
        }

        public Criteria andAfterCheckIsNull() {
            addCriterion("AFTER_CHECK is null");
            return (Criteria) this;
        }

        public Criteria andAfterCheckIsNotNull() {
            addCriterion("AFTER_CHECK is not null");
            return (Criteria) this;
        }

        public Criteria andAfterCheckEqualTo(Long value) {
            addCriterion("AFTER_CHECK =", value, "afterCheck");
            return (Criteria) this;
        }

        public Criteria andAfterCheckNotEqualTo(Long value) {
            addCriterion("AFTER_CHECK <>", value, "afterCheck");
            return (Criteria) this;
        }

        public Criteria andAfterCheckGreaterThan(Long value) {
            addCriterion("AFTER_CHECK >", value, "afterCheck");
            return (Criteria) this;
        }

        public Criteria andAfterCheckGreaterThanOrEqualTo(Long value) {
            addCriterion("AFTER_CHECK >=", value, "afterCheck");
            return (Criteria) this;
        }

        public Criteria andAfterCheckLessThan(Long value) {
            addCriterion("AFTER_CHECK <", value, "afterCheck");
            return (Criteria) this;
        }

        public Criteria andAfterCheckLessThanOrEqualTo(Long value) {
            addCriterion("AFTER_CHECK <=", value, "afterCheck");
            return (Criteria) this;
        }

        public Criteria andAfterCheckIn(List<Long> values) {
            addCriterion("AFTER_CHECK in", values, "afterCheck");
            return (Criteria) this;
        }

        public Criteria andAfterCheckNotIn(List<Long> values) {
            addCriterion("AFTER_CHECK not in", values, "afterCheck");
            return (Criteria) this;
        }

        public Criteria andAfterCheckBetween(Long value1, Long value2) {
            addCriterion("AFTER_CHECK between", value1, value2, "afterCheck");
            return (Criteria) this;
        }

        public Criteria andAfterCheckNotBetween(Long value1, Long value2) {
            addCriterion("AFTER_CHECK not between", value1, value2, "afterCheck");
            return (Criteria) this;
        }

        public Criteria andTitleImgWidthIsNull() {
            addCriterion("TITLE_IMG_WIDTH is null");
            return (Criteria) this;
        }

        public Criteria andTitleImgWidthIsNotNull() {
            addCriterion("TITLE_IMG_WIDTH is not null");
            return (Criteria) this;
        }

        public Criteria andTitleImgWidthEqualTo(Long value) {
            addCriterion("TITLE_IMG_WIDTH =", value, "titleImgWidth");
            return (Criteria) this;
        }

        public Criteria andTitleImgWidthNotEqualTo(Long value) {
            addCriterion("TITLE_IMG_WIDTH <>", value, "titleImgWidth");
            return (Criteria) this;
        }

        public Criteria andTitleImgWidthGreaterThan(Long value) {
            addCriterion("TITLE_IMG_WIDTH >", value, "titleImgWidth");
            return (Criteria) this;
        }

        public Criteria andTitleImgWidthGreaterThanOrEqualTo(Long value) {
            addCriterion("TITLE_IMG_WIDTH >=", value, "titleImgWidth");
            return (Criteria) this;
        }

        public Criteria andTitleImgWidthLessThan(Long value) {
            addCriterion("TITLE_IMG_WIDTH <", value, "titleImgWidth");
            return (Criteria) this;
        }

        public Criteria andTitleImgWidthLessThanOrEqualTo(Long value) {
            addCriterion("TITLE_IMG_WIDTH <=", value, "titleImgWidth");
            return (Criteria) this;
        }

        public Criteria andTitleImgWidthIn(List<Long> values) {
            addCriterion("TITLE_IMG_WIDTH in", values, "titleImgWidth");
            return (Criteria) this;
        }

        public Criteria andTitleImgWidthNotIn(List<Long> values) {
            addCriterion("TITLE_IMG_WIDTH not in", values, "titleImgWidth");
            return (Criteria) this;
        }

        public Criteria andTitleImgWidthBetween(Long value1, Long value2) {
            addCriterion("TITLE_IMG_WIDTH between", value1, value2, "titleImgWidth");
            return (Criteria) this;
        }

        public Criteria andTitleImgWidthNotBetween(Long value1, Long value2) {
            addCriterion("TITLE_IMG_WIDTH not between", value1, value2, "titleImgWidth");
            return (Criteria) this;
        }

        public Criteria andTitleImgHeightIsNull() {
            addCriterion("TITLE_IMG_HEIGHT is null");
            return (Criteria) this;
        }

        public Criteria andTitleImgHeightIsNotNull() {
            addCriterion("TITLE_IMG_HEIGHT is not null");
            return (Criteria) this;
        }

        public Criteria andTitleImgHeightEqualTo(Long value) {
            addCriterion("TITLE_IMG_HEIGHT =", value, "titleImgHeight");
            return (Criteria) this;
        }

        public Criteria andTitleImgHeightNotEqualTo(Long value) {
            addCriterion("TITLE_IMG_HEIGHT <>", value, "titleImgHeight");
            return (Criteria) this;
        }

        public Criteria andTitleImgHeightGreaterThan(Long value) {
            addCriterion("TITLE_IMG_HEIGHT >", value, "titleImgHeight");
            return (Criteria) this;
        }

        public Criteria andTitleImgHeightGreaterThanOrEqualTo(Long value) {
            addCriterion("TITLE_IMG_HEIGHT >=", value, "titleImgHeight");
            return (Criteria) this;
        }

        public Criteria andTitleImgHeightLessThan(Long value) {
            addCriterion("TITLE_IMG_HEIGHT <", value, "titleImgHeight");
            return (Criteria) this;
        }

        public Criteria andTitleImgHeightLessThanOrEqualTo(Long value) {
            addCriterion("TITLE_IMG_HEIGHT <=", value, "titleImgHeight");
            return (Criteria) this;
        }

        public Criteria andTitleImgHeightIn(List<Long> values) {
            addCriterion("TITLE_IMG_HEIGHT in", values, "titleImgHeight");
            return (Criteria) this;
        }

        public Criteria andTitleImgHeightNotIn(List<Long> values) {
            addCriterion("TITLE_IMG_HEIGHT not in", values, "titleImgHeight");
            return (Criteria) this;
        }

        public Criteria andTitleImgHeightBetween(Long value1, Long value2) {
            addCriterion("TITLE_IMG_HEIGHT between", value1, value2, "titleImgHeight");
            return (Criteria) this;
        }

        public Criteria andTitleImgHeightNotBetween(Long value1, Long value2) {
            addCriterion("TITLE_IMG_HEIGHT not between", value1, value2, "titleImgHeight");
            return (Criteria) this;
        }

        public Criteria andContImgWidthIsNull() {
            addCriterion("CONT_IMG_WIDTH is null");
            return (Criteria) this;
        }

        public Criteria andContImgWidthIsNotNull() {
            addCriterion("CONT_IMG_WIDTH is not null");
            return (Criteria) this;
        }

        public Criteria andContImgWidthEqualTo(Long value) {
            addCriterion("CONT_IMG_WIDTH =", value, "contImgWidth");
            return (Criteria) this;
        }

        public Criteria andContImgWidthNotEqualTo(Long value) {
            addCriterion("CONT_IMG_WIDTH <>", value, "contImgWidth");
            return (Criteria) this;
        }

        public Criteria andContImgWidthGreaterThan(Long value) {
            addCriterion("CONT_IMG_WIDTH >", value, "contImgWidth");
            return (Criteria) this;
        }

        public Criteria andContImgWidthGreaterThanOrEqualTo(Long value) {
            addCriterion("CONT_IMG_WIDTH >=", value, "contImgWidth");
            return (Criteria) this;
        }

        public Criteria andContImgWidthLessThan(Long value) {
            addCriterion("CONT_IMG_WIDTH <", value, "contImgWidth");
            return (Criteria) this;
        }

        public Criteria andContImgWidthLessThanOrEqualTo(Long value) {
            addCriterion("CONT_IMG_WIDTH <=", value, "contImgWidth");
            return (Criteria) this;
        }

        public Criteria andContImgWidthIn(List<Long> values) {
            addCriterion("CONT_IMG_WIDTH in", values, "contImgWidth");
            return (Criteria) this;
        }

        public Criteria andContImgWidthNotIn(List<Long> values) {
            addCriterion("CONT_IMG_WIDTH not in", values, "contImgWidth");
            return (Criteria) this;
        }

        public Criteria andContImgWidthBetween(Long value1, Long value2) {
            addCriterion("CONT_IMG_WIDTH between", value1, value2, "contImgWidth");
            return (Criteria) this;
        }

        public Criteria andContImgWidthNotBetween(Long value1, Long value2) {
            addCriterion("CONT_IMG_WIDTH not between", value1, value2, "contImgWidth");
            return (Criteria) this;
        }

        public Criteria andContImgHeightIsNull() {
            addCriterion("CONT_IMG_HEIGHT is null");
            return (Criteria) this;
        }

        public Criteria andContImgHeightIsNotNull() {
            addCriterion("CONT_IMG_HEIGHT is not null");
            return (Criteria) this;
        }

        public Criteria andContImgHeightEqualTo(Long value) {
            addCriterion("CONT_IMG_HEIGHT =", value, "contImgHeight");
            return (Criteria) this;
        }

        public Criteria andContImgHeightNotEqualTo(Long value) {
            addCriterion("CONT_IMG_HEIGHT <>", value, "contImgHeight");
            return (Criteria) this;
        }

        public Criteria andContImgHeightGreaterThan(Long value) {
            addCriterion("CONT_IMG_HEIGHT >", value, "contImgHeight");
            return (Criteria) this;
        }

        public Criteria andContImgHeightGreaterThanOrEqualTo(Long value) {
            addCriterion("CONT_IMG_HEIGHT >=", value, "contImgHeight");
            return (Criteria) this;
        }

        public Criteria andContImgHeightLessThan(Long value) {
            addCriterion("CONT_IMG_HEIGHT <", value, "contImgHeight");
            return (Criteria) this;
        }

        public Criteria andContImgHeightLessThanOrEqualTo(Long value) {
            addCriterion("CONT_IMG_HEIGHT <=", value, "contImgHeight");
            return (Criteria) this;
        }

        public Criteria andContImgHeightIn(List<Long> values) {
            addCriterion("CONT_IMG_HEIGHT in", values, "contImgHeight");
            return (Criteria) this;
        }

        public Criteria andContImgHeightNotIn(List<Long> values) {
            addCriterion("CONT_IMG_HEIGHT not in", values, "contImgHeight");
            return (Criteria) this;
        }

        public Criteria andContImgHeightBetween(Long value1, Long value2) {
            addCriterion("CONT_IMG_HEIGHT between", value1, value2, "contImgHeight");
            return (Criteria) this;
        }

        public Criteria andContImgHeightNotBetween(Long value1, Long value2) {
            addCriterion("CONT_IMG_HEIGHT not between", value1, value2, "contImgHeight");
            return (Criteria) this;
        }

        public Criteria andIsStaticChnlIsNull() {
            addCriterion("IS_STATIC_CHNL is null");
            return (Criteria) this;
        }

        public Criteria andIsStaticChnlIsNotNull() {
            addCriterion("IS_STATIC_CHNL is not null");
            return (Criteria) this;
        }

        public Criteria andIsStaticChnlEqualTo(Long value) {
            addCriterion("IS_STATIC_CHNL =", value, "isStaticChnl");
            return (Criteria) this;
        }

        public Criteria andIsStaticChnlNotEqualTo(Long value) {
            addCriterion("IS_STATIC_CHNL <>", value, "isStaticChnl");
            return (Criteria) this;
        }

        public Criteria andIsStaticChnlGreaterThan(Long value) {
            addCriterion("IS_STATIC_CHNL >", value, "isStaticChnl");
            return (Criteria) this;
        }

        public Criteria andIsStaticChnlGreaterThanOrEqualTo(Long value) {
            addCriterion("IS_STATIC_CHNL >=", value, "isStaticChnl");
            return (Criteria) this;
        }

        public Criteria andIsStaticChnlLessThan(Long value) {
            addCriterion("IS_STATIC_CHNL <", value, "isStaticChnl");
            return (Criteria) this;
        }

        public Criteria andIsStaticChnlLessThanOrEqualTo(Long value) {
            addCriterion("IS_STATIC_CHNL <=", value, "isStaticChnl");
            return (Criteria) this;
        }

        public Criteria andIsStaticChnlIn(List<Long> values) {
            addCriterion("IS_STATIC_CHNL in", values, "isStaticChnl");
            return (Criteria) this;
        }

        public Criteria andIsStaticChnlNotIn(List<Long> values) {
            addCriterion("IS_STATIC_CHNL not in", values, "isStaticChnl");
            return (Criteria) this;
        }

        public Criteria andIsStaticChnlBetween(Long value1, Long value2) {
            addCriterion("IS_STATIC_CHNL between", value1, value2, "isStaticChnl");
            return (Criteria) this;
        }

        public Criteria andIsStaticChnlNotBetween(Long value1, Long value2) {
            addCriterion("IS_STATIC_CHNL not between", value1, value2, "isStaticChnl");
            return (Criteria) this;
        }

        public Criteria andIsStaticContIsNull() {
            addCriterion("IS_STATIC_CONT is null");
            return (Criteria) this;
        }

        public Criteria andIsStaticContIsNotNull() {
            addCriterion("IS_STATIC_CONT is not null");
            return (Criteria) this;
        }

        public Criteria andIsStaticContEqualTo(Long value) {
            addCriterion("IS_STATIC_CONT =", value, "isStaticCont");
            return (Criteria) this;
        }

        public Criteria andIsStaticContNotEqualTo(Long value) {
            addCriterion("IS_STATIC_CONT <>", value, "isStaticCont");
            return (Criteria) this;
        }

        public Criteria andIsStaticContGreaterThan(Long value) {
            addCriterion("IS_STATIC_CONT >", value, "isStaticCont");
            return (Criteria) this;
        }

        public Criteria andIsStaticContGreaterThanOrEqualTo(Long value) {
            addCriterion("IS_STATIC_CONT >=", value, "isStaticCont");
            return (Criteria) this;
        }

        public Criteria andIsStaticContLessThan(Long value) {
            addCriterion("IS_STATIC_CONT <", value, "isStaticCont");
            return (Criteria) this;
        }

        public Criteria andIsStaticContLessThanOrEqualTo(Long value) {
            addCriterion("IS_STATIC_CONT <=", value, "isStaticCont");
            return (Criteria) this;
        }

        public Criteria andIsStaticContIn(List<Long> values) {
            addCriterion("IS_STATIC_CONT in", values, "isStaticCont");
            return (Criteria) this;
        }

        public Criteria andIsStaticContNotIn(List<Long> values) {
            addCriterion("IS_STATIC_CONT not in", values, "isStaticCont");
            return (Criteria) this;
        }

        public Criteria andIsStaticContBetween(Long value1, Long value2) {
            addCriterion("IS_STATIC_CONT between", value1, value2, "isStaticCont");
            return (Criteria) this;
        }

        public Criteria andIsStaticContNotBetween(Long value1, Long value2) {
            addCriterion("IS_STATIC_CONT not between", value1, value2, "isStaticCont");
            return (Criteria) this;
        }

        public Criteria andIsAccessByDirIsNull() {
            addCriterion("IS_ACCESS_BY_DIR is null");
            return (Criteria) this;
        }

        public Criteria andIsAccessByDirIsNotNull() {
            addCriterion("IS_ACCESS_BY_DIR is not null");
            return (Criteria) this;
        }

        public Criteria andIsAccessByDirEqualTo(Long value) {
            addCriterion("IS_ACCESS_BY_DIR =", value, "isAccessByDir");
            return (Criteria) this;
        }

        public Criteria andIsAccessByDirNotEqualTo(Long value) {
            addCriterion("IS_ACCESS_BY_DIR <>", value, "isAccessByDir");
            return (Criteria) this;
        }

        public Criteria andIsAccessByDirGreaterThan(Long value) {
            addCriterion("IS_ACCESS_BY_DIR >", value, "isAccessByDir");
            return (Criteria) this;
        }

        public Criteria andIsAccessByDirGreaterThanOrEqualTo(Long value) {
            addCriterion("IS_ACCESS_BY_DIR >=", value, "isAccessByDir");
            return (Criteria) this;
        }

        public Criteria andIsAccessByDirLessThan(Long value) {
            addCriterion("IS_ACCESS_BY_DIR <", value, "isAccessByDir");
            return (Criteria) this;
        }

        public Criteria andIsAccessByDirLessThanOrEqualTo(Long value) {
            addCriterion("IS_ACCESS_BY_DIR <=", value, "isAccessByDir");
            return (Criteria) this;
        }

        public Criteria andIsAccessByDirIn(List<Long> values) {
            addCriterion("IS_ACCESS_BY_DIR in", values, "isAccessByDir");
            return (Criteria) this;
        }

        public Criteria andIsAccessByDirNotIn(List<Long> values) {
            addCriterion("IS_ACCESS_BY_DIR not in", values, "isAccessByDir");
            return (Criteria) this;
        }

        public Criteria andIsAccessByDirBetween(Long value1, Long value2) {
            addCriterion("IS_ACCESS_BY_DIR between", value1, value2, "isAccessByDir");
            return (Criteria) this;
        }

        public Criteria andIsAccessByDirNotBetween(Long value1, Long value2) {
            addCriterion("IS_ACCESS_BY_DIR not between", value1, value2, "isAccessByDir");
            return (Criteria) this;
        }

        public Criteria andIsListChildIsNull() {
            addCriterion("IS_LIST_CHILD is null");
            return (Criteria) this;
        }

        public Criteria andIsListChildIsNotNull() {
            addCriterion("IS_LIST_CHILD is not null");
            return (Criteria) this;
        }

        public Criteria andIsListChildEqualTo(Long value) {
            addCriterion("IS_LIST_CHILD =", value, "isListChild");
            return (Criteria) this;
        }

        public Criteria andIsListChildNotEqualTo(Long value) {
            addCriterion("IS_LIST_CHILD <>", value, "isListChild");
            return (Criteria) this;
        }

        public Criteria andIsListChildGreaterThan(Long value) {
            addCriterion("IS_LIST_CHILD >", value, "isListChild");
            return (Criteria) this;
        }

        public Criteria andIsListChildGreaterThanOrEqualTo(Long value) {
            addCriterion("IS_LIST_CHILD >=", value, "isListChild");
            return (Criteria) this;
        }

        public Criteria andIsListChildLessThan(Long value) {
            addCriterion("IS_LIST_CHILD <", value, "isListChild");
            return (Criteria) this;
        }

        public Criteria andIsListChildLessThanOrEqualTo(Long value) {
            addCriterion("IS_LIST_CHILD <=", value, "isListChild");
            return (Criteria) this;
        }

        public Criteria andIsListChildIn(List<Long> values) {
            addCriterion("IS_LIST_CHILD in", values, "isListChild");
            return (Criteria) this;
        }

        public Criteria andIsListChildNotIn(List<Long> values) {
            addCriterion("IS_LIST_CHILD not in", values, "isListChild");
            return (Criteria) this;
        }

        public Criteria andIsListChildBetween(Long value1, Long value2) {
            addCriterion("IS_LIST_CHILD between", value1, value2, "isListChild");
            return (Criteria) this;
        }

        public Criteria andIsListChildNotBetween(Long value1, Long value2) {
            addCriterion("IS_LIST_CHILD not between", value1, value2, "isListChild");
            return (Criteria) this;
        }

        public Criteria andPageSizeIsNull() {
            addCriterion("PAGE_SIZE is null");
            return (Criteria) this;
        }

        public Criteria andPageSizeIsNotNull() {
            addCriterion("PAGE_SIZE is not null");
            return (Criteria) this;
        }

        public Criteria andPageSizeEqualTo(Long value) {
            addCriterion("PAGE_SIZE =", value, "pageSize");
            return (Criteria) this;
        }

        public Criteria andPageSizeNotEqualTo(Long value) {
            addCriterion("PAGE_SIZE <>", value, "pageSize");
            return (Criteria) this;
        }

        public Criteria andPageSizeGreaterThan(Long value) {
            addCriterion("PAGE_SIZE >", value, "pageSize");
            return (Criteria) this;
        }

        public Criteria andPageSizeGreaterThanOrEqualTo(Long value) {
            addCriterion("PAGE_SIZE >=", value, "pageSize");
            return (Criteria) this;
        }

        public Criteria andPageSizeLessThan(Long value) {
            addCriterion("PAGE_SIZE <", value, "pageSize");
            return (Criteria) this;
        }

        public Criteria andPageSizeLessThanOrEqualTo(Long value) {
            addCriterion("PAGE_SIZE <=", value, "pageSize");
            return (Criteria) this;
        }

        public Criteria andPageSizeIn(List<Long> values) {
            addCriterion("PAGE_SIZE in", values, "pageSize");
            return (Criteria) this;
        }

        public Criteria andPageSizeNotIn(List<Long> values) {
            addCriterion("PAGE_SIZE not in", values, "pageSize");
            return (Criteria) this;
        }

        public Criteria andPageSizeBetween(Long value1, Long value2) {
            addCriterion("PAGE_SIZE between", value1, value2, "pageSize");
            return (Criteria) this;
        }

        public Criteria andPageSizeNotBetween(Long value1, Long value2) {
            addCriterion("PAGE_SIZE not between", value1, value2, "pageSize");
            return (Criteria) this;
        }

        public Criteria andTplChnlIdIsNull() {
            addCriterion("TPL_CHNL_ID is null");
            return (Criteria) this;
        }

        public Criteria andTplChnlIdIsNotNull() {
            addCriterion("TPL_CHNL_ID is not null");
            return (Criteria) this;
        }

        public Criteria andTplChnlIdEqualTo(Long value) {
            addCriterion("TPL_CHNL_ID =", value, "tplChnlId");
            return (Criteria) this;
        }

        public Criteria andTplChnlIdNotEqualTo(Long value) {
            addCriterion("TPL_CHNL_ID <>", value, "tplChnlId");
            return (Criteria) this;
        }

        public Criteria andTplChnlIdGreaterThan(Long value) {
            addCriterion("TPL_CHNL_ID >", value, "tplChnlId");
            return (Criteria) this;
        }

        public Criteria andTplChnlIdGreaterThanOrEqualTo(Long value) {
            addCriterion("TPL_CHNL_ID >=", value, "tplChnlId");
            return (Criteria) this;
        }

        public Criteria andTplChnlIdLessThan(Long value) {
            addCriterion("TPL_CHNL_ID <", value, "tplChnlId");
            return (Criteria) this;
        }

        public Criteria andTplChnlIdLessThanOrEqualTo(Long value) {
            addCriterion("TPL_CHNL_ID <=", value, "tplChnlId");
            return (Criteria) this;
        }

        public Criteria andTplChnlIdIn(List<Long> values) {
            addCriterion("TPL_CHNL_ID in", values, "tplChnlId");
            return (Criteria) this;
        }

        public Criteria andTplChnlIdNotIn(List<Long> values) {
            addCriterion("TPL_CHNL_ID not in", values, "tplChnlId");
            return (Criteria) this;
        }

        public Criteria andTplChnlIdBetween(Long value1, Long value2) {
            addCriterion("TPL_CHNL_ID between", value1, value2, "tplChnlId");
            return (Criteria) this;
        }

        public Criteria andTplChnlIdNotBetween(Long value1, Long value2) {
            addCriterion("TPL_CHNL_ID not between", value1, value2, "tplChnlId");
            return (Criteria) this;
        }

        public Criteria andTplContIdIsNull() {
            addCriterion("TPL_CONT_ID is null");
            return (Criteria) this;
        }

        public Criteria andTplContIdIsNotNull() {
            addCriterion("TPL_CONT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andTplContIdEqualTo(Long value) {
            addCriterion("TPL_CONT_ID =", value, "tplContId");
            return (Criteria) this;
        }

        public Criteria andTplContIdNotEqualTo(Long value) {
            addCriterion("TPL_CONT_ID <>", value, "tplContId");
            return (Criteria) this;
        }

        public Criteria andTplContIdGreaterThan(Long value) {
            addCriterion("TPL_CONT_ID >", value, "tplContId");
            return (Criteria) this;
        }

        public Criteria andTplContIdGreaterThanOrEqualTo(Long value) {
            addCriterion("TPL_CONT_ID >=", value, "tplContId");
            return (Criteria) this;
        }

        public Criteria andTplContIdLessThan(Long value) {
            addCriterion("TPL_CONT_ID <", value, "tplContId");
            return (Criteria) this;
        }

        public Criteria andTplContIdLessThanOrEqualTo(Long value) {
            addCriterion("TPL_CONT_ID <=", value, "tplContId");
            return (Criteria) this;
        }

        public Criteria andTplContIdIn(List<Long> values) {
            addCriterion("TPL_CONT_ID in", values, "tplContId");
            return (Criteria) this;
        }

        public Criteria andTplContIdNotIn(List<Long> values) {
            addCriterion("TPL_CONT_ID not in", values, "tplContId");
            return (Criteria) this;
        }

        public Criteria andTplContIdBetween(Long value1, Long value2) {
            addCriterion("TPL_CONT_ID between", value1, value2, "tplContId");
            return (Criteria) this;
        }

        public Criteria andTplContIdNotBetween(Long value1, Long value2) {
            addCriterion("TPL_CONT_ID not between", value1, value2, "tplContId");
            return (Criteria) this;
        }

        public Criteria andHasTitleImgIsNull() {
            addCriterion("HAS_TITLE_IMG is null");
            return (Criteria) this;
        }

        public Criteria andHasTitleImgIsNotNull() {
            addCriterion("HAS_TITLE_IMG is not null");
            return (Criteria) this;
        }

        public Criteria andHasTitleImgEqualTo(Long value) {
            addCriterion("HAS_TITLE_IMG =", value, "hasTitleImg");
            return (Criteria) this;
        }

        public Criteria andHasTitleImgNotEqualTo(Long value) {
            addCriterion("HAS_TITLE_IMG <>", value, "hasTitleImg");
            return (Criteria) this;
        }

        public Criteria andHasTitleImgGreaterThan(Long value) {
            addCriterion("HAS_TITLE_IMG >", value, "hasTitleImg");
            return (Criteria) this;
        }

        public Criteria andHasTitleImgGreaterThanOrEqualTo(Long value) {
            addCriterion("HAS_TITLE_IMG >=", value, "hasTitleImg");
            return (Criteria) this;
        }

        public Criteria andHasTitleImgLessThan(Long value) {
            addCriterion("HAS_TITLE_IMG <", value, "hasTitleImg");
            return (Criteria) this;
        }

        public Criteria andHasTitleImgLessThanOrEqualTo(Long value) {
            addCriterion("HAS_TITLE_IMG <=", value, "hasTitleImg");
            return (Criteria) this;
        }

        public Criteria andHasTitleImgIn(List<Long> values) {
            addCriterion("HAS_TITLE_IMG in", values, "hasTitleImg");
            return (Criteria) this;
        }

        public Criteria andHasTitleImgNotIn(List<Long> values) {
            addCriterion("HAS_TITLE_IMG not in", values, "hasTitleImg");
            return (Criteria) this;
        }

        public Criteria andHasTitleImgBetween(Long value1, Long value2) {
            addCriterion("HAS_TITLE_IMG between", value1, value2, "hasTitleImg");
            return (Criteria) this;
        }

        public Criteria andHasTitleImgNotBetween(Long value1, Long value2) {
            addCriterion("HAS_TITLE_IMG not between", value1, value2, "hasTitleImg");
            return (Criteria) this;
        }

        public Criteria andHasContImgIsNull() {
            addCriterion("HAS_CONT_IMG is null");
            return (Criteria) this;
        }

        public Criteria andHasContImgIsNotNull() {
            addCriterion("HAS_CONT_IMG is not null");
            return (Criteria) this;
        }

        public Criteria andHasContImgEqualTo(Long value) {
            addCriterion("HAS_CONT_IMG =", value, "hasContImg");
            return (Criteria) this;
        }

        public Criteria andHasContImgNotEqualTo(Long value) {
            addCriterion("HAS_CONT_IMG <>", value, "hasContImg");
            return (Criteria) this;
        }

        public Criteria andHasContImgGreaterThan(Long value) {
            addCriterion("HAS_CONT_IMG >", value, "hasContImg");
            return (Criteria) this;
        }

        public Criteria andHasContImgGreaterThanOrEqualTo(Long value) {
            addCriterion("HAS_CONT_IMG >=", value, "hasContImg");
            return (Criteria) this;
        }

        public Criteria andHasContImgLessThan(Long value) {
            addCriterion("HAS_CONT_IMG <", value, "hasContImg");
            return (Criteria) this;
        }

        public Criteria andHasContImgLessThanOrEqualTo(Long value) {
            addCriterion("HAS_CONT_IMG <=", value, "hasContImg");
            return (Criteria) this;
        }

        public Criteria andHasContImgIn(List<Long> values) {
            addCriterion("HAS_CONT_IMG in", values, "hasContImg");
            return (Criteria) this;
        }

        public Criteria andHasContImgNotIn(List<Long> values) {
            addCriterion("HAS_CONT_IMG not in", values, "hasContImg");
            return (Criteria) this;
        }

        public Criteria andHasContImgBetween(Long value1, Long value2) {
            addCriterion("HAS_CONT_IMG between", value1, value2, "hasContImg");
            return (Criteria) this;
        }

        public Criteria andHasContImgNotBetween(Long value1, Long value2) {
            addCriterion("HAS_CONT_IMG not between", value1, value2, "hasContImg");
            return (Criteria) this;
        }

        public Criteria andCommentControlIsNull() {
            addCriterion("COMMENT_CONTROL is null");
            return (Criteria) this;
        }

        public Criteria andCommentControlIsNotNull() {
            addCriterion("COMMENT_CONTROL is not null");
            return (Criteria) this;
        }

        public Criteria andCommentControlEqualTo(Long value) {
            addCriterion("COMMENT_CONTROL =", value, "commentControl");
            return (Criteria) this;
        }

        public Criteria andCommentControlNotEqualTo(Long value) {
            addCriterion("COMMENT_CONTROL <>", value, "commentControl");
            return (Criteria) this;
        }

        public Criteria andCommentControlGreaterThan(Long value) {
            addCriterion("COMMENT_CONTROL >", value, "commentControl");
            return (Criteria) this;
        }

        public Criteria andCommentControlGreaterThanOrEqualTo(Long value) {
            addCriterion("COMMENT_CONTROL >=", value, "commentControl");
            return (Criteria) this;
        }

        public Criteria andCommentControlLessThan(Long value) {
            addCriterion("COMMENT_CONTROL <", value, "commentControl");
            return (Criteria) this;
        }

        public Criteria andCommentControlLessThanOrEqualTo(Long value) {
            addCriterion("COMMENT_CONTROL <=", value, "commentControl");
            return (Criteria) this;
        }

        public Criteria andCommentControlIn(List<Long> values) {
            addCriterion("COMMENT_CONTROL in", values, "commentControl");
            return (Criteria) this;
        }

        public Criteria andCommentControlNotIn(List<Long> values) {
            addCriterion("COMMENT_CONTROL not in", values, "commentControl");
            return (Criteria) this;
        }

        public Criteria andCommentControlBetween(Long value1, Long value2) {
            addCriterion("COMMENT_CONTROL between", value1, value2, "commentControl");
            return (Criteria) this;
        }

        public Criteria andCommentControlNotBetween(Long value1, Long value2) {
            addCriterion("COMMENT_CONTROL not between", value1, value2, "commentControl");
            return (Criteria) this;
        }

        public Criteria andAllowUpdownIsNull() {
            addCriterion("ALLOW_UPDOWN is null");
            return (Criteria) this;
        }

        public Criteria andAllowUpdownIsNotNull() {
            addCriterion("ALLOW_UPDOWN is not null");
            return (Criteria) this;
        }

        public Criteria andAllowUpdownEqualTo(Long value) {
            addCriterion("ALLOW_UPDOWN =", value, "allowUpdown");
            return (Criteria) this;
        }

        public Criteria andAllowUpdownNotEqualTo(Long value) {
            addCriterion("ALLOW_UPDOWN <>", value, "allowUpdown");
            return (Criteria) this;
        }

        public Criteria andAllowUpdownGreaterThan(Long value) {
            addCriterion("ALLOW_UPDOWN >", value, "allowUpdown");
            return (Criteria) this;
        }

        public Criteria andAllowUpdownGreaterThanOrEqualTo(Long value) {
            addCriterion("ALLOW_UPDOWN >=", value, "allowUpdown");
            return (Criteria) this;
        }

        public Criteria andAllowUpdownLessThan(Long value) {
            addCriterion("ALLOW_UPDOWN <", value, "allowUpdown");
            return (Criteria) this;
        }

        public Criteria andAllowUpdownLessThanOrEqualTo(Long value) {
            addCriterion("ALLOW_UPDOWN <=", value, "allowUpdown");
            return (Criteria) this;
        }

        public Criteria andAllowUpdownIn(List<Long> values) {
            addCriterion("ALLOW_UPDOWN in", values, "allowUpdown");
            return (Criteria) this;
        }

        public Criteria andAllowUpdownNotIn(List<Long> values) {
            addCriterion("ALLOW_UPDOWN not in", values, "allowUpdown");
            return (Criteria) this;
        }

        public Criteria andAllowUpdownBetween(Long value1, Long value2) {
            addCriterion("ALLOW_UPDOWN between", value1, value2, "allowUpdown");
            return (Criteria) this;
        }

        public Criteria andAllowUpdownNotBetween(Long value1, Long value2) {
            addCriterion("ALLOW_UPDOWN not between", value1, value2, "allowUpdown");
            return (Criteria) this;
        }

        public Criteria andIsBlankIsNull() {
            addCriterion("IS_BLANK is null");
            return (Criteria) this;
        }

        public Criteria andIsBlankIsNotNull() {
            addCriterion("IS_BLANK is not null");
            return (Criteria) this;
        }

        public Criteria andIsBlankEqualTo(Long value) {
            addCriterion("IS_BLANK =", value, "isBlank");
            return (Criteria) this;
        }

        public Criteria andIsBlankNotEqualTo(Long value) {
            addCriterion("IS_BLANK <>", value, "isBlank");
            return (Criteria) this;
        }

        public Criteria andIsBlankGreaterThan(Long value) {
            addCriterion("IS_BLANK >", value, "isBlank");
            return (Criteria) this;
        }

        public Criteria andIsBlankGreaterThanOrEqualTo(Long value) {
            addCriterion("IS_BLANK >=", value, "isBlank");
            return (Criteria) this;
        }

        public Criteria andIsBlankLessThan(Long value) {
            addCriterion("IS_BLANK <", value, "isBlank");
            return (Criteria) this;
        }

        public Criteria andIsBlankLessThanOrEqualTo(Long value) {
            addCriterion("IS_BLANK <=", value, "isBlank");
            return (Criteria) this;
        }

        public Criteria andIsBlankIn(List<Long> values) {
            addCriterion("IS_BLANK in", values, "isBlank");
            return (Criteria) this;
        }

        public Criteria andIsBlankNotIn(List<Long> values) {
            addCriterion("IS_BLANK not in", values, "isBlank");
            return (Criteria) this;
        }

        public Criteria andIsBlankBetween(Long value1, Long value2) {
            addCriterion("IS_BLANK between", value1, value2, "isBlank");
            return (Criteria) this;
        }

        public Criteria andIsBlankNotBetween(Long value1, Long value2) {
            addCriterion("IS_BLANK not between", value1, value2, "isBlank");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}
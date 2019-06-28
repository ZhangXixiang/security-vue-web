package com.space.mybatis.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Cms2ModelExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public Cms2ModelExample() {
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

        public Criteria andModelNameIsNull() {
            addCriterion("MODEL_NAME is null");
            return (Criteria) this;
        }

        public Criteria andModelNameIsNotNull() {
            addCriterion("MODEL_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andModelNameEqualTo(String value) {
            addCriterion("MODEL_NAME =", value, "modelName");
            return (Criteria) this;
        }

        public Criteria andModelNameNotEqualTo(String value) {
            addCriterion("MODEL_NAME <>", value, "modelName");
            return (Criteria) this;
        }

        public Criteria andModelNameGreaterThan(String value) {
            addCriterion("MODEL_NAME >", value, "modelName");
            return (Criteria) this;
        }

        public Criteria andModelNameGreaterThanOrEqualTo(String value) {
            addCriterion("MODEL_NAME >=", value, "modelName");
            return (Criteria) this;
        }

        public Criteria andModelNameLessThan(String value) {
            addCriterion("MODEL_NAME <", value, "modelName");
            return (Criteria) this;
        }

        public Criteria andModelNameLessThanOrEqualTo(String value) {
            addCriterion("MODEL_NAME <=", value, "modelName");
            return (Criteria) this;
        }

        public Criteria andModelNameLike(String value) {
            addCriterion("MODEL_NAME like", value, "modelName");
            return (Criteria) this;
        }

        public Criteria andModelNameNotLike(String value) {
            addCriterion("MODEL_NAME not like", value, "modelName");
            return (Criteria) this;
        }

        public Criteria andModelNameIn(List<String> values) {
            addCriterion("MODEL_NAME in", values, "modelName");
            return (Criteria) this;
        }

        public Criteria andModelNameNotIn(List<String> values) {
            addCriterion("MODEL_NAME not in", values, "modelName");
            return (Criteria) this;
        }

        public Criteria andModelNameBetween(String value1, String value2) {
            addCriterion("MODEL_NAME between", value1, value2, "modelName");
            return (Criteria) this;
        }

        public Criteria andModelNameNotBetween(String value1, String value2) {
            addCriterion("MODEL_NAME not between", value1, value2, "modelName");
            return (Criteria) this;
        }

        public Criteria andModelPathIsNull() {
            addCriterion("MODEL_PATH is null");
            return (Criteria) this;
        }

        public Criteria andModelPathIsNotNull() {
            addCriterion("MODEL_PATH is not null");
            return (Criteria) this;
        }

        public Criteria andModelPathEqualTo(String value) {
            addCriterion("MODEL_PATH =", value, "modelPath");
            return (Criteria) this;
        }

        public Criteria andModelPathNotEqualTo(String value) {
            addCriterion("MODEL_PATH <>", value, "modelPath");
            return (Criteria) this;
        }

        public Criteria andModelPathGreaterThan(String value) {
            addCriterion("MODEL_PATH >", value, "modelPath");
            return (Criteria) this;
        }

        public Criteria andModelPathGreaterThanOrEqualTo(String value) {
            addCriterion("MODEL_PATH >=", value, "modelPath");
            return (Criteria) this;
        }

        public Criteria andModelPathLessThan(String value) {
            addCriterion("MODEL_PATH <", value, "modelPath");
            return (Criteria) this;
        }

        public Criteria andModelPathLessThanOrEqualTo(String value) {
            addCriterion("MODEL_PATH <=", value, "modelPath");
            return (Criteria) this;
        }

        public Criteria andModelPathLike(String value) {
            addCriterion("MODEL_PATH like", value, "modelPath");
            return (Criteria) this;
        }

        public Criteria andModelPathNotLike(String value) {
            addCriterion("MODEL_PATH not like", value, "modelPath");
            return (Criteria) this;
        }

        public Criteria andModelPathIn(List<String> values) {
            addCriterion("MODEL_PATH in", values, "modelPath");
            return (Criteria) this;
        }

        public Criteria andModelPathNotIn(List<String> values) {
            addCriterion("MODEL_PATH not in", values, "modelPath");
            return (Criteria) this;
        }

        public Criteria andModelPathBetween(String value1, String value2) {
            addCriterion("MODEL_PATH between", value1, value2, "modelPath");
            return (Criteria) this;
        }

        public Criteria andModelPathNotBetween(String value1, String value2) {
            addCriterion("MODEL_PATH not between", value1, value2, "modelPath");
            return (Criteria) this;
        }

        public Criteria andTplChannelPrefixIsNull() {
            addCriterion("TPL_CHANNEL_PREFIX is null");
            return (Criteria) this;
        }

        public Criteria andTplChannelPrefixIsNotNull() {
            addCriterion("TPL_CHANNEL_PREFIX is not null");
            return (Criteria) this;
        }

        public Criteria andTplChannelPrefixEqualTo(String value) {
            addCriterion("TPL_CHANNEL_PREFIX =", value, "tplChannelPrefix");
            return (Criteria) this;
        }

        public Criteria andTplChannelPrefixNotEqualTo(String value) {
            addCriterion("TPL_CHANNEL_PREFIX <>", value, "tplChannelPrefix");
            return (Criteria) this;
        }

        public Criteria andTplChannelPrefixGreaterThan(String value) {
            addCriterion("TPL_CHANNEL_PREFIX >", value, "tplChannelPrefix");
            return (Criteria) this;
        }

        public Criteria andTplChannelPrefixGreaterThanOrEqualTo(String value) {
            addCriterion("TPL_CHANNEL_PREFIX >=", value, "tplChannelPrefix");
            return (Criteria) this;
        }

        public Criteria andTplChannelPrefixLessThan(String value) {
            addCriterion("TPL_CHANNEL_PREFIX <", value, "tplChannelPrefix");
            return (Criteria) this;
        }

        public Criteria andTplChannelPrefixLessThanOrEqualTo(String value) {
            addCriterion("TPL_CHANNEL_PREFIX <=", value, "tplChannelPrefix");
            return (Criteria) this;
        }

        public Criteria andTplChannelPrefixLike(String value) {
            addCriterion("TPL_CHANNEL_PREFIX like", value, "tplChannelPrefix");
            return (Criteria) this;
        }

        public Criteria andTplChannelPrefixNotLike(String value) {
            addCriterion("TPL_CHANNEL_PREFIX not like", value, "tplChannelPrefix");
            return (Criteria) this;
        }

        public Criteria andTplChannelPrefixIn(List<String> values) {
            addCriterion("TPL_CHANNEL_PREFIX in", values, "tplChannelPrefix");
            return (Criteria) this;
        }

        public Criteria andTplChannelPrefixNotIn(List<String> values) {
            addCriterion("TPL_CHANNEL_PREFIX not in", values, "tplChannelPrefix");
            return (Criteria) this;
        }

        public Criteria andTplChannelPrefixBetween(String value1, String value2) {
            addCriterion("TPL_CHANNEL_PREFIX between", value1, value2, "tplChannelPrefix");
            return (Criteria) this;
        }

        public Criteria andTplChannelPrefixNotBetween(String value1, String value2) {
            addCriterion("TPL_CHANNEL_PREFIX not between", value1, value2, "tplChannelPrefix");
            return (Criteria) this;
        }

        public Criteria andTplContentPrefixIsNull() {
            addCriterion("TPL_CONTENT_PREFIX is null");
            return (Criteria) this;
        }

        public Criteria andTplContentPrefixIsNotNull() {
            addCriterion("TPL_CONTENT_PREFIX is not null");
            return (Criteria) this;
        }

        public Criteria andTplContentPrefixEqualTo(String value) {
            addCriterion("TPL_CONTENT_PREFIX =", value, "tplContentPrefix");
            return (Criteria) this;
        }

        public Criteria andTplContentPrefixNotEqualTo(String value) {
            addCriterion("TPL_CONTENT_PREFIX <>", value, "tplContentPrefix");
            return (Criteria) this;
        }

        public Criteria andTplContentPrefixGreaterThan(String value) {
            addCriterion("TPL_CONTENT_PREFIX >", value, "tplContentPrefix");
            return (Criteria) this;
        }

        public Criteria andTplContentPrefixGreaterThanOrEqualTo(String value) {
            addCriterion("TPL_CONTENT_PREFIX >=", value, "tplContentPrefix");
            return (Criteria) this;
        }

        public Criteria andTplContentPrefixLessThan(String value) {
            addCriterion("TPL_CONTENT_PREFIX <", value, "tplContentPrefix");
            return (Criteria) this;
        }

        public Criteria andTplContentPrefixLessThanOrEqualTo(String value) {
            addCriterion("TPL_CONTENT_PREFIX <=", value, "tplContentPrefix");
            return (Criteria) this;
        }

        public Criteria andTplContentPrefixLike(String value) {
            addCriterion("TPL_CONTENT_PREFIX like", value, "tplContentPrefix");
            return (Criteria) this;
        }

        public Criteria andTplContentPrefixNotLike(String value) {
            addCriterion("TPL_CONTENT_PREFIX not like", value, "tplContentPrefix");
            return (Criteria) this;
        }

        public Criteria andTplContentPrefixIn(List<String> values) {
            addCriterion("TPL_CONTENT_PREFIX in", values, "tplContentPrefix");
            return (Criteria) this;
        }

        public Criteria andTplContentPrefixNotIn(List<String> values) {
            addCriterion("TPL_CONTENT_PREFIX not in", values, "tplContentPrefix");
            return (Criteria) this;
        }

        public Criteria andTplContentPrefixBetween(String value1, String value2) {
            addCriterion("TPL_CONTENT_PREFIX between", value1, value2, "tplContentPrefix");
            return (Criteria) this;
        }

        public Criteria andTplContentPrefixNotBetween(String value1, String value2) {
            addCriterion("TPL_CONTENT_PREFIX not between", value1, value2, "tplContentPrefix");
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

        public Criteria andContentImgWidthIsNull() {
            addCriterion("CONTENT_IMG_WIDTH is null");
            return (Criteria) this;
        }

        public Criteria andContentImgWidthIsNotNull() {
            addCriterion("CONTENT_IMG_WIDTH is not null");
            return (Criteria) this;
        }

        public Criteria andContentImgWidthEqualTo(Long value) {
            addCriterion("CONTENT_IMG_WIDTH =", value, "contentImgWidth");
            return (Criteria) this;
        }

        public Criteria andContentImgWidthNotEqualTo(Long value) {
            addCriterion("CONTENT_IMG_WIDTH <>", value, "contentImgWidth");
            return (Criteria) this;
        }

        public Criteria andContentImgWidthGreaterThan(Long value) {
            addCriterion("CONTENT_IMG_WIDTH >", value, "contentImgWidth");
            return (Criteria) this;
        }

        public Criteria andContentImgWidthGreaterThanOrEqualTo(Long value) {
            addCriterion("CONTENT_IMG_WIDTH >=", value, "contentImgWidth");
            return (Criteria) this;
        }

        public Criteria andContentImgWidthLessThan(Long value) {
            addCriterion("CONTENT_IMG_WIDTH <", value, "contentImgWidth");
            return (Criteria) this;
        }

        public Criteria andContentImgWidthLessThanOrEqualTo(Long value) {
            addCriterion("CONTENT_IMG_WIDTH <=", value, "contentImgWidth");
            return (Criteria) this;
        }

        public Criteria andContentImgWidthIn(List<Long> values) {
            addCriterion("CONTENT_IMG_WIDTH in", values, "contentImgWidth");
            return (Criteria) this;
        }

        public Criteria andContentImgWidthNotIn(List<Long> values) {
            addCriterion("CONTENT_IMG_WIDTH not in", values, "contentImgWidth");
            return (Criteria) this;
        }

        public Criteria andContentImgWidthBetween(Long value1, Long value2) {
            addCriterion("CONTENT_IMG_WIDTH between", value1, value2, "contentImgWidth");
            return (Criteria) this;
        }

        public Criteria andContentImgWidthNotBetween(Long value1, Long value2) {
            addCriterion("CONTENT_IMG_WIDTH not between", value1, value2, "contentImgWidth");
            return (Criteria) this;
        }

        public Criteria andContentImgHeightIsNull() {
            addCriterion("CONTENT_IMG_HEIGHT is null");
            return (Criteria) this;
        }

        public Criteria andContentImgHeightIsNotNull() {
            addCriterion("CONTENT_IMG_HEIGHT is not null");
            return (Criteria) this;
        }

        public Criteria andContentImgHeightEqualTo(Long value) {
            addCriterion("CONTENT_IMG_HEIGHT =", value, "contentImgHeight");
            return (Criteria) this;
        }

        public Criteria andContentImgHeightNotEqualTo(Long value) {
            addCriterion("CONTENT_IMG_HEIGHT <>", value, "contentImgHeight");
            return (Criteria) this;
        }

        public Criteria andContentImgHeightGreaterThan(Long value) {
            addCriterion("CONTENT_IMG_HEIGHT >", value, "contentImgHeight");
            return (Criteria) this;
        }

        public Criteria andContentImgHeightGreaterThanOrEqualTo(Long value) {
            addCriterion("CONTENT_IMG_HEIGHT >=", value, "contentImgHeight");
            return (Criteria) this;
        }

        public Criteria andContentImgHeightLessThan(Long value) {
            addCriterion("CONTENT_IMG_HEIGHT <", value, "contentImgHeight");
            return (Criteria) this;
        }

        public Criteria andContentImgHeightLessThanOrEqualTo(Long value) {
            addCriterion("CONTENT_IMG_HEIGHT <=", value, "contentImgHeight");
            return (Criteria) this;
        }

        public Criteria andContentImgHeightIn(List<Long> values) {
            addCriterion("CONTENT_IMG_HEIGHT in", values, "contentImgHeight");
            return (Criteria) this;
        }

        public Criteria andContentImgHeightNotIn(List<Long> values) {
            addCriterion("CONTENT_IMG_HEIGHT not in", values, "contentImgHeight");
            return (Criteria) this;
        }

        public Criteria andContentImgHeightBetween(Long value1, Long value2) {
            addCriterion("CONTENT_IMG_HEIGHT between", value1, value2, "contentImgHeight");
            return (Criteria) this;
        }

        public Criteria andContentImgHeightNotBetween(Long value1, Long value2) {
            addCriterion("CONTENT_IMG_HEIGHT not between", value1, value2, "contentImgHeight");
            return (Criteria) this;
        }

        public Criteria andPriorityIsNull() {
            addCriterion("PRIORITY is null");
            return (Criteria) this;
        }

        public Criteria andPriorityIsNotNull() {
            addCriterion("PRIORITY is not null");
            return (Criteria) this;
        }

        public Criteria andPriorityEqualTo(Long value) {
            addCriterion("PRIORITY =", value, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityNotEqualTo(Long value) {
            addCriterion("PRIORITY <>", value, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityGreaterThan(Long value) {
            addCriterion("PRIORITY >", value, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityGreaterThanOrEqualTo(Long value) {
            addCriterion("PRIORITY >=", value, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityLessThan(Long value) {
            addCriterion("PRIORITY <", value, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityLessThanOrEqualTo(Long value) {
            addCriterion("PRIORITY <=", value, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityIn(List<Long> values) {
            addCriterion("PRIORITY in", values, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityNotIn(List<Long> values) {
            addCriterion("PRIORITY not in", values, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityBetween(Long value1, Long value2) {
            addCriterion("PRIORITY between", value1, value2, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityNotBetween(Long value1, Long value2) {
            addCriterion("PRIORITY not between", value1, value2, "priority");
            return (Criteria) this;
        }

        public Criteria andHasContentIsNull() {
            addCriterion("HAS_CONTENT is null");
            return (Criteria) this;
        }

        public Criteria andHasContentIsNotNull() {
            addCriterion("HAS_CONTENT is not null");
            return (Criteria) this;
        }

        public Criteria andHasContentEqualTo(Long value) {
            addCriterion("HAS_CONTENT =", value, "hasContent");
            return (Criteria) this;
        }

        public Criteria andHasContentNotEqualTo(Long value) {
            addCriterion("HAS_CONTENT <>", value, "hasContent");
            return (Criteria) this;
        }

        public Criteria andHasContentGreaterThan(Long value) {
            addCriterion("HAS_CONTENT >", value, "hasContent");
            return (Criteria) this;
        }

        public Criteria andHasContentGreaterThanOrEqualTo(Long value) {
            addCriterion("HAS_CONTENT >=", value, "hasContent");
            return (Criteria) this;
        }

        public Criteria andHasContentLessThan(Long value) {
            addCriterion("HAS_CONTENT <", value, "hasContent");
            return (Criteria) this;
        }

        public Criteria andHasContentLessThanOrEqualTo(Long value) {
            addCriterion("HAS_CONTENT <=", value, "hasContent");
            return (Criteria) this;
        }

        public Criteria andHasContentIn(List<Long> values) {
            addCriterion("HAS_CONTENT in", values, "hasContent");
            return (Criteria) this;
        }

        public Criteria andHasContentNotIn(List<Long> values) {
            addCriterion("HAS_CONTENT not in", values, "hasContent");
            return (Criteria) this;
        }

        public Criteria andHasContentBetween(Long value1, Long value2) {
            addCriterion("HAS_CONTENT between", value1, value2, "hasContent");
            return (Criteria) this;
        }

        public Criteria andHasContentNotBetween(Long value1, Long value2) {
            addCriterion("HAS_CONTENT not between", value1, value2, "hasContent");
            return (Criteria) this;
        }

        public Criteria andIsDisabledIsNull() {
            addCriterion("IS_DISABLED is null");
            return (Criteria) this;
        }

        public Criteria andIsDisabledIsNotNull() {
            addCriterion("IS_DISABLED is not null");
            return (Criteria) this;
        }

        public Criteria andIsDisabledEqualTo(Long value) {
            addCriterion("IS_DISABLED =", value, "isDisabled");
            return (Criteria) this;
        }

        public Criteria andIsDisabledNotEqualTo(Long value) {
            addCriterion("IS_DISABLED <>", value, "isDisabled");
            return (Criteria) this;
        }

        public Criteria andIsDisabledGreaterThan(Long value) {
            addCriterion("IS_DISABLED >", value, "isDisabled");
            return (Criteria) this;
        }

        public Criteria andIsDisabledGreaterThanOrEqualTo(Long value) {
            addCriterion("IS_DISABLED >=", value, "isDisabled");
            return (Criteria) this;
        }

        public Criteria andIsDisabledLessThan(Long value) {
            addCriterion("IS_DISABLED <", value, "isDisabled");
            return (Criteria) this;
        }

        public Criteria andIsDisabledLessThanOrEqualTo(Long value) {
            addCriterion("IS_DISABLED <=", value, "isDisabled");
            return (Criteria) this;
        }

        public Criteria andIsDisabledIn(List<Long> values) {
            addCriterion("IS_DISABLED in", values, "isDisabled");
            return (Criteria) this;
        }

        public Criteria andIsDisabledNotIn(List<Long> values) {
            addCriterion("IS_DISABLED not in", values, "isDisabled");
            return (Criteria) this;
        }

        public Criteria andIsDisabledBetween(Long value1, Long value2) {
            addCriterion("IS_DISABLED between", value1, value2, "isDisabled");
            return (Criteria) this;
        }

        public Criteria andIsDisabledNotBetween(Long value1, Long value2) {
            addCriterion("IS_DISABLED not between", value1, value2, "isDisabled");
            return (Criteria) this;
        }

        public Criteria andIsDefIsNull() {
            addCriterion("IS_DEF is null");
            return (Criteria) this;
        }

        public Criteria andIsDefIsNotNull() {
            addCriterion("IS_DEF is not null");
            return (Criteria) this;
        }

        public Criteria andIsDefEqualTo(Long value) {
            addCriterion("IS_DEF =", value, "isDef");
            return (Criteria) this;
        }

        public Criteria andIsDefNotEqualTo(Long value) {
            addCriterion("IS_DEF <>", value, "isDef");
            return (Criteria) this;
        }

        public Criteria andIsDefGreaterThan(Long value) {
            addCriterion("IS_DEF >", value, "isDef");
            return (Criteria) this;
        }

        public Criteria andIsDefGreaterThanOrEqualTo(Long value) {
            addCriterion("IS_DEF >=", value, "isDef");
            return (Criteria) this;
        }

        public Criteria andIsDefLessThan(Long value) {
            addCriterion("IS_DEF <", value, "isDef");
            return (Criteria) this;
        }

        public Criteria andIsDefLessThanOrEqualTo(Long value) {
            addCriterion("IS_DEF <=", value, "isDef");
            return (Criteria) this;
        }

        public Criteria andIsDefIn(List<Long> values) {
            addCriterion("IS_DEF in", values, "isDef");
            return (Criteria) this;
        }

        public Criteria andIsDefNotIn(List<Long> values) {
            addCriterion("IS_DEF not in", values, "isDef");
            return (Criteria) this;
        }

        public Criteria andIsDefBetween(Long value1, Long value2) {
            addCriterion("IS_DEF between", value1, value2, "isDef");
            return (Criteria) this;
        }

        public Criteria andIsDefNotBetween(Long value1, Long value2) {
            addCriterion("IS_DEF not between", value1, value2, "isDef");
            return (Criteria) this;
        }

        public Criteria andGmtCreateIsNull() {
            addCriterion("GMT_CREATE is null");
            return (Criteria) this;
        }

        public Criteria andGmtCreateIsNotNull() {
            addCriterion("GMT_CREATE is not null");
            return (Criteria) this;
        }

        public Criteria andGmtCreateEqualTo(Date value) {
            addCriterion("GMT_CREATE =", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateNotEqualTo(Date value) {
            addCriterion("GMT_CREATE <>", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateGreaterThan(Date value) {
            addCriterion("GMT_CREATE >", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateGreaterThanOrEqualTo(Date value) {
            addCriterion("GMT_CREATE >=", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateLessThan(Date value) {
            addCriterion("GMT_CREATE <", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateLessThanOrEqualTo(Date value) {
            addCriterion("GMT_CREATE <=", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateIn(List<Date> values) {
            addCriterion("GMT_CREATE in", values, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateNotIn(List<Date> values) {
            addCriterion("GMT_CREATE not in", values, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateBetween(Date value1, Date value2) {
            addCriterion("GMT_CREATE between", value1, value2, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateNotBetween(Date value1, Date value2) {
            addCriterion("GMT_CREATE not between", value1, value2, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtModifyIsNull() {
            addCriterion("GMT_MODIFY is null");
            return (Criteria) this;
        }

        public Criteria andGmtModifyIsNotNull() {
            addCriterion("GMT_MODIFY is not null");
            return (Criteria) this;
        }

        public Criteria andGmtModifyEqualTo(Date value) {
            addCriterion("GMT_MODIFY =", value, "gmtModify");
            return (Criteria) this;
        }

        public Criteria andGmtModifyNotEqualTo(Date value) {
            addCriterion("GMT_MODIFY <>", value, "gmtModify");
            return (Criteria) this;
        }

        public Criteria andGmtModifyGreaterThan(Date value) {
            addCriterion("GMT_MODIFY >", value, "gmtModify");
            return (Criteria) this;
        }

        public Criteria andGmtModifyGreaterThanOrEqualTo(Date value) {
            addCriterion("GMT_MODIFY >=", value, "gmtModify");
            return (Criteria) this;
        }

        public Criteria andGmtModifyLessThan(Date value) {
            addCriterion("GMT_MODIFY <", value, "gmtModify");
            return (Criteria) this;
        }

        public Criteria andGmtModifyLessThanOrEqualTo(Date value) {
            addCriterion("GMT_MODIFY <=", value, "gmtModify");
            return (Criteria) this;
        }

        public Criteria andGmtModifyIn(List<Date> values) {
            addCriterion("GMT_MODIFY in", values, "gmtModify");
            return (Criteria) this;
        }

        public Criteria andGmtModifyNotIn(List<Date> values) {
            addCriterion("GMT_MODIFY not in", values, "gmtModify");
            return (Criteria) this;
        }

        public Criteria andGmtModifyBetween(Date value1, Date value2) {
            addCriterion("GMT_MODIFY between", value1, value2, "gmtModify");
            return (Criteria) this;
        }

        public Criteria andGmtModifyNotBetween(Date value1, Date value2) {
            addCriterion("GMT_MODIFY not between", value1, value2, "gmtModify");
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
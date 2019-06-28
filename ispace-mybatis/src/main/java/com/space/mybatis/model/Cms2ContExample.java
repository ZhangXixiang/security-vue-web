package com.space.mybatis.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Cms2ContExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public Cms2ContExample() {
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

        public Criteria andSiteIdIsNull() {
            addCriterion("SITE_ID is null");
            return (Criteria) this;
        }

        public Criteria andSiteIdIsNotNull() {
            addCriterion("SITE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andSiteIdEqualTo(Long value) {
            addCriterion("SITE_ID =", value, "siteId");
            return (Criteria) this;
        }

        public Criteria andSiteIdNotEqualTo(Long value) {
            addCriterion("SITE_ID <>", value, "siteId");
            return (Criteria) this;
        }

        public Criteria andSiteIdGreaterThan(Long value) {
            addCriterion("SITE_ID >", value, "siteId");
            return (Criteria) this;
        }

        public Criteria andSiteIdGreaterThanOrEqualTo(Long value) {
            addCriterion("SITE_ID >=", value, "siteId");
            return (Criteria) this;
        }

        public Criteria andSiteIdLessThan(Long value) {
            addCriterion("SITE_ID <", value, "siteId");
            return (Criteria) this;
        }

        public Criteria andSiteIdLessThanOrEqualTo(Long value) {
            addCriterion("SITE_ID <=", value, "siteId");
            return (Criteria) this;
        }

        public Criteria andSiteIdIn(List<Long> values) {
            addCriterion("SITE_ID in", values, "siteId");
            return (Criteria) this;
        }

        public Criteria andSiteIdNotIn(List<Long> values) {
            addCriterion("SITE_ID not in", values, "siteId");
            return (Criteria) this;
        }

        public Criteria andSiteIdBetween(Long value1, Long value2) {
            addCriterion("SITE_ID between", value1, value2, "siteId");
            return (Criteria) this;
        }

        public Criteria andSiteIdNotBetween(Long value1, Long value2) {
            addCriterion("SITE_ID not between", value1, value2, "siteId");
            return (Criteria) this;
        }

        public Criteria andAdminIdIsNull() {
            addCriterion("ADMIN_ID is null");
            return (Criteria) this;
        }

        public Criteria andAdminIdIsNotNull() {
            addCriterion("ADMIN_ID is not null");
            return (Criteria) this;
        }

        public Criteria andAdminIdEqualTo(Long value) {
            addCriterion("ADMIN_ID =", value, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdNotEqualTo(Long value) {
            addCriterion("ADMIN_ID <>", value, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdGreaterThan(Long value) {
            addCriterion("ADMIN_ID >", value, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdGreaterThanOrEqualTo(Long value) {
            addCriterion("ADMIN_ID >=", value, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdLessThan(Long value) {
            addCriterion("ADMIN_ID <", value, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdLessThanOrEqualTo(Long value) {
            addCriterion("ADMIN_ID <=", value, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdIn(List<Long> values) {
            addCriterion("ADMIN_ID in", values, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdNotIn(List<Long> values) {
            addCriterion("ADMIN_ID not in", values, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdBetween(Long value1, Long value2) {
            addCriterion("ADMIN_ID between", value1, value2, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdNotBetween(Long value1, Long value2) {
            addCriterion("ADMIN_ID not between", value1, value2, "adminId");
            return (Criteria) this;
        }

        public Criteria andMemberIdIsNull() {
            addCriterion("MEMBER_ID is null");
            return (Criteria) this;
        }

        public Criteria andMemberIdIsNotNull() {
            addCriterion("MEMBER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andMemberIdEqualTo(Long value) {
            addCriterion("MEMBER_ID =", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdNotEqualTo(Long value) {
            addCriterion("MEMBER_ID <>", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdGreaterThan(Long value) {
            addCriterion("MEMBER_ID >", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdGreaterThanOrEqualTo(Long value) {
            addCriterion("MEMBER_ID >=", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdLessThan(Long value) {
            addCriterion("MEMBER_ID <", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdLessThanOrEqualTo(Long value) {
            addCriterion("MEMBER_ID <=", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdIn(List<Long> values) {
            addCriterion("MEMBER_ID in", values, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdNotIn(List<Long> values) {
            addCriterion("MEMBER_ID not in", values, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdBetween(Long value1, Long value2) {
            addCriterion("MEMBER_ID between", value1, value2, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdNotBetween(Long value1, Long value2) {
            addCriterion("MEMBER_ID not between", value1, value2, "memberId");
            return (Criteria) this;
        }

        public Criteria andSortDateIsNull() {
            addCriterion("SORT_DATE is null");
            return (Criteria) this;
        }

        public Criteria andSortDateIsNotNull() {
            addCriterion("SORT_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andSortDateEqualTo(Date value) {
            addCriterion("SORT_DATE =", value, "sortDate");
            return (Criteria) this;
        }

        public Criteria andSortDateNotEqualTo(Date value) {
            addCriterion("SORT_DATE <>", value, "sortDate");
            return (Criteria) this;
        }

        public Criteria andSortDateGreaterThan(Date value) {
            addCriterion("SORT_DATE >", value, "sortDate");
            return (Criteria) this;
        }

        public Criteria andSortDateGreaterThanOrEqualTo(Date value) {
            addCriterion("SORT_DATE >=", value, "sortDate");
            return (Criteria) this;
        }

        public Criteria andSortDateLessThan(Date value) {
            addCriterion("SORT_DATE <", value, "sortDate");
            return (Criteria) this;
        }

        public Criteria andSortDateLessThanOrEqualTo(Date value) {
            addCriterion("SORT_DATE <=", value, "sortDate");
            return (Criteria) this;
        }

        public Criteria andSortDateIn(List<Date> values) {
            addCriterion("SORT_DATE in", values, "sortDate");
            return (Criteria) this;
        }

        public Criteria andSortDateNotIn(List<Date> values) {
            addCriterion("SORT_DATE not in", values, "sortDate");
            return (Criteria) this;
        }

        public Criteria andSortDateBetween(Date value1, Date value2) {
            addCriterion("SORT_DATE between", value1, value2, "sortDate");
            return (Criteria) this;
        }

        public Criteria andSortDateNotBetween(Date value1, Date value2) {
            addCriterion("SORT_DATE not between", value1, value2, "sortDate");
            return (Criteria) this;
        }

        public Criteria andTopLevelIsNull() {
            addCriterion("TOP_LEVEL is null");
            return (Criteria) this;
        }

        public Criteria andTopLevelIsNotNull() {
            addCriterion("TOP_LEVEL is not null");
            return (Criteria) this;
        }

        public Criteria andTopLevelEqualTo(Long value) {
            addCriterion("TOP_LEVEL =", value, "topLevel");
            return (Criteria) this;
        }

        public Criteria andTopLevelNotEqualTo(Long value) {
            addCriterion("TOP_LEVEL <>", value, "topLevel");
            return (Criteria) this;
        }

        public Criteria andTopLevelGreaterThan(Long value) {
            addCriterion("TOP_LEVEL >", value, "topLevel");
            return (Criteria) this;
        }

        public Criteria andTopLevelGreaterThanOrEqualTo(Long value) {
            addCriterion("TOP_LEVEL >=", value, "topLevel");
            return (Criteria) this;
        }

        public Criteria andTopLevelLessThan(Long value) {
            addCriterion("TOP_LEVEL <", value, "topLevel");
            return (Criteria) this;
        }

        public Criteria andTopLevelLessThanOrEqualTo(Long value) {
            addCriterion("TOP_LEVEL <=", value, "topLevel");
            return (Criteria) this;
        }

        public Criteria andTopLevelIn(List<Long> values) {
            addCriterion("TOP_LEVEL in", values, "topLevel");
            return (Criteria) this;
        }

        public Criteria andTopLevelNotIn(List<Long> values) {
            addCriterion("TOP_LEVEL not in", values, "topLevel");
            return (Criteria) this;
        }

        public Criteria andTopLevelBetween(Long value1, Long value2) {
            addCriterion("TOP_LEVEL between", value1, value2, "topLevel");
            return (Criteria) this;
        }

        public Criteria andTopLevelNotBetween(Long value1, Long value2) {
            addCriterion("TOP_LEVEL not between", value1, value2, "topLevel");
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

        public Criteria andIsRecommendIsNull() {
            addCriterion("IS_RECOMMEND is null");
            return (Criteria) this;
        }

        public Criteria andIsRecommendIsNotNull() {
            addCriterion("IS_RECOMMEND is not null");
            return (Criteria) this;
        }

        public Criteria andIsRecommendEqualTo(Long value) {
            addCriterion("IS_RECOMMEND =", value, "isRecommend");
            return (Criteria) this;
        }

        public Criteria andIsRecommendNotEqualTo(Long value) {
            addCriterion("IS_RECOMMEND <>", value, "isRecommend");
            return (Criteria) this;
        }

        public Criteria andIsRecommendGreaterThan(Long value) {
            addCriterion("IS_RECOMMEND >", value, "isRecommend");
            return (Criteria) this;
        }

        public Criteria andIsRecommendGreaterThanOrEqualTo(Long value) {
            addCriterion("IS_RECOMMEND >=", value, "isRecommend");
            return (Criteria) this;
        }

        public Criteria andIsRecommendLessThan(Long value) {
            addCriterion("IS_RECOMMEND <", value, "isRecommend");
            return (Criteria) this;
        }

        public Criteria andIsRecommendLessThanOrEqualTo(Long value) {
            addCriterion("IS_RECOMMEND <=", value, "isRecommend");
            return (Criteria) this;
        }

        public Criteria andIsRecommendIn(List<Long> values) {
            addCriterion("IS_RECOMMEND in", values, "isRecommend");
            return (Criteria) this;
        }

        public Criteria andIsRecommendNotIn(List<Long> values) {
            addCriterion("IS_RECOMMEND not in", values, "isRecommend");
            return (Criteria) this;
        }

        public Criteria andIsRecommendBetween(Long value1, Long value2) {
            addCriterion("IS_RECOMMEND between", value1, value2, "isRecommend");
            return (Criteria) this;
        }

        public Criteria andIsRecommendNotBetween(Long value1, Long value2) {
            addCriterion("IS_RECOMMEND not between", value1, value2, "isRecommend");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("STATUS is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Long value) {
            addCriterion("STATUS =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Long value) {
            addCriterion("STATUS <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Long value) {
            addCriterion("STATUS >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Long value) {
            addCriterion("STATUS >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Long value) {
            addCriterion("STATUS <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Long value) {
            addCriterion("STATUS <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Long> values) {
            addCriterion("STATUS in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Long> values) {
            addCriterion("STATUS not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Long value1, Long value2) {
            addCriterion("STATUS between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Long value1, Long value2) {
            addCriterion("STATUS not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andViewsDayIsNull() {
            addCriterion("VIEWS_DAY is null");
            return (Criteria) this;
        }

        public Criteria andViewsDayIsNotNull() {
            addCriterion("VIEWS_DAY is not null");
            return (Criteria) this;
        }

        public Criteria andViewsDayEqualTo(Long value) {
            addCriterion("VIEWS_DAY =", value, "viewsDay");
            return (Criteria) this;
        }

        public Criteria andViewsDayNotEqualTo(Long value) {
            addCriterion("VIEWS_DAY <>", value, "viewsDay");
            return (Criteria) this;
        }

        public Criteria andViewsDayGreaterThan(Long value) {
            addCriterion("VIEWS_DAY >", value, "viewsDay");
            return (Criteria) this;
        }

        public Criteria andViewsDayGreaterThanOrEqualTo(Long value) {
            addCriterion("VIEWS_DAY >=", value, "viewsDay");
            return (Criteria) this;
        }

        public Criteria andViewsDayLessThan(Long value) {
            addCriterion("VIEWS_DAY <", value, "viewsDay");
            return (Criteria) this;
        }

        public Criteria andViewsDayLessThanOrEqualTo(Long value) {
            addCriterion("VIEWS_DAY <=", value, "viewsDay");
            return (Criteria) this;
        }

        public Criteria andViewsDayIn(List<Long> values) {
            addCriterion("VIEWS_DAY in", values, "viewsDay");
            return (Criteria) this;
        }

        public Criteria andViewsDayNotIn(List<Long> values) {
            addCriterion("VIEWS_DAY not in", values, "viewsDay");
            return (Criteria) this;
        }

        public Criteria andViewsDayBetween(Long value1, Long value2) {
            addCriterion("VIEWS_DAY between", value1, value2, "viewsDay");
            return (Criteria) this;
        }

        public Criteria andViewsDayNotBetween(Long value1, Long value2) {
            addCriterion("VIEWS_DAY not between", value1, value2, "viewsDay");
            return (Criteria) this;
        }

        public Criteria andCommentsDayIsNull() {
            addCriterion("COMMENTS_DAY is null");
            return (Criteria) this;
        }

        public Criteria andCommentsDayIsNotNull() {
            addCriterion("COMMENTS_DAY is not null");
            return (Criteria) this;
        }

        public Criteria andCommentsDayEqualTo(Long value) {
            addCriterion("COMMENTS_DAY =", value, "commentsDay");
            return (Criteria) this;
        }

        public Criteria andCommentsDayNotEqualTo(Long value) {
            addCriterion("COMMENTS_DAY <>", value, "commentsDay");
            return (Criteria) this;
        }

        public Criteria andCommentsDayGreaterThan(Long value) {
            addCriterion("COMMENTS_DAY >", value, "commentsDay");
            return (Criteria) this;
        }

        public Criteria andCommentsDayGreaterThanOrEqualTo(Long value) {
            addCriterion("COMMENTS_DAY >=", value, "commentsDay");
            return (Criteria) this;
        }

        public Criteria andCommentsDayLessThan(Long value) {
            addCriterion("COMMENTS_DAY <", value, "commentsDay");
            return (Criteria) this;
        }

        public Criteria andCommentsDayLessThanOrEqualTo(Long value) {
            addCriterion("COMMENTS_DAY <=", value, "commentsDay");
            return (Criteria) this;
        }

        public Criteria andCommentsDayIn(List<Long> values) {
            addCriterion("COMMENTS_DAY in", values, "commentsDay");
            return (Criteria) this;
        }

        public Criteria andCommentsDayNotIn(List<Long> values) {
            addCriterion("COMMENTS_DAY not in", values, "commentsDay");
            return (Criteria) this;
        }

        public Criteria andCommentsDayBetween(Long value1, Long value2) {
            addCriterion("COMMENTS_DAY between", value1, value2, "commentsDay");
            return (Criteria) this;
        }

        public Criteria andCommentsDayNotBetween(Long value1, Long value2) {
            addCriterion("COMMENTS_DAY not between", value1, value2, "commentsDay");
            return (Criteria) this;
        }

        public Criteria andDownloadsDayIsNull() {
            addCriterion("DOWNLOADS_DAY is null");
            return (Criteria) this;
        }

        public Criteria andDownloadsDayIsNotNull() {
            addCriterion("DOWNLOADS_DAY is not null");
            return (Criteria) this;
        }

        public Criteria andDownloadsDayEqualTo(Long value) {
            addCriterion("DOWNLOADS_DAY =", value, "downloadsDay");
            return (Criteria) this;
        }

        public Criteria andDownloadsDayNotEqualTo(Long value) {
            addCriterion("DOWNLOADS_DAY <>", value, "downloadsDay");
            return (Criteria) this;
        }

        public Criteria andDownloadsDayGreaterThan(Long value) {
            addCriterion("DOWNLOADS_DAY >", value, "downloadsDay");
            return (Criteria) this;
        }

        public Criteria andDownloadsDayGreaterThanOrEqualTo(Long value) {
            addCriterion("DOWNLOADS_DAY >=", value, "downloadsDay");
            return (Criteria) this;
        }

        public Criteria andDownloadsDayLessThan(Long value) {
            addCriterion("DOWNLOADS_DAY <", value, "downloadsDay");
            return (Criteria) this;
        }

        public Criteria andDownloadsDayLessThanOrEqualTo(Long value) {
            addCriterion("DOWNLOADS_DAY <=", value, "downloadsDay");
            return (Criteria) this;
        }

        public Criteria andDownloadsDayIn(List<Long> values) {
            addCriterion("DOWNLOADS_DAY in", values, "downloadsDay");
            return (Criteria) this;
        }

        public Criteria andDownloadsDayNotIn(List<Long> values) {
            addCriterion("DOWNLOADS_DAY not in", values, "downloadsDay");
            return (Criteria) this;
        }

        public Criteria andDownloadsDayBetween(Long value1, Long value2) {
            addCriterion("DOWNLOADS_DAY between", value1, value2, "downloadsDay");
            return (Criteria) this;
        }

        public Criteria andDownloadsDayNotBetween(Long value1, Long value2) {
            addCriterion("DOWNLOADS_DAY not between", value1, value2, "downloadsDay");
            return (Criteria) this;
        }

        public Criteria andUpsDayIsNull() {
            addCriterion("UPS_DAY is null");
            return (Criteria) this;
        }

        public Criteria andUpsDayIsNotNull() {
            addCriterion("UPS_DAY is not null");
            return (Criteria) this;
        }

        public Criteria andUpsDayEqualTo(Long value) {
            addCriterion("UPS_DAY =", value, "upsDay");
            return (Criteria) this;
        }

        public Criteria andUpsDayNotEqualTo(Long value) {
            addCriterion("UPS_DAY <>", value, "upsDay");
            return (Criteria) this;
        }

        public Criteria andUpsDayGreaterThan(Long value) {
            addCriterion("UPS_DAY >", value, "upsDay");
            return (Criteria) this;
        }

        public Criteria andUpsDayGreaterThanOrEqualTo(Long value) {
            addCriterion("UPS_DAY >=", value, "upsDay");
            return (Criteria) this;
        }

        public Criteria andUpsDayLessThan(Long value) {
            addCriterion("UPS_DAY <", value, "upsDay");
            return (Criteria) this;
        }

        public Criteria andUpsDayLessThanOrEqualTo(Long value) {
            addCriterion("UPS_DAY <=", value, "upsDay");
            return (Criteria) this;
        }

        public Criteria andUpsDayIn(List<Long> values) {
            addCriterion("UPS_DAY in", values, "upsDay");
            return (Criteria) this;
        }

        public Criteria andUpsDayNotIn(List<Long> values) {
            addCriterion("UPS_DAY not in", values, "upsDay");
            return (Criteria) this;
        }

        public Criteria andUpsDayBetween(Long value1, Long value2) {
            addCriterion("UPS_DAY between", value1, value2, "upsDay");
            return (Criteria) this;
        }

        public Criteria andUpsDayNotBetween(Long value1, Long value2) {
            addCriterion("UPS_DAY not between", value1, value2, "upsDay");
            return (Criteria) this;
        }

        public Criteria andModifyTimeIsNull() {
            addCriterion("MODIFY_TIME is null");
            return (Criteria) this;
        }

        public Criteria andModifyTimeIsNotNull() {
            addCriterion("MODIFY_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andModifyTimeEqualTo(Date value) {
            addCriterion("MODIFY_TIME =", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeNotEqualTo(Date value) {
            addCriterion("MODIFY_TIME <>", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeGreaterThan(Date value) {
            addCriterion("MODIFY_TIME >", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("MODIFY_TIME >=", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeLessThan(Date value) {
            addCriterion("MODIFY_TIME <", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeLessThanOrEqualTo(Date value) {
            addCriterion("MODIFY_TIME <=", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeIn(List<Date> values) {
            addCriterion("MODIFY_TIME in", values, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeNotIn(List<Date> values) {
            addCriterion("MODIFY_TIME not in", values, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeBetween(Date value1, Date value2) {
            addCriterion("MODIFY_TIME between", value1, value2, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeNotBetween(Date value1, Date value2) {
            addCriterion("MODIFY_TIME not between", value1, value2, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andContIdMainIsNull() {
            addCriterion("CONT_ID_MAIN is null");
            return (Criteria) this;
        }

        public Criteria andContIdMainIsNotNull() {
            addCriterion("CONT_ID_MAIN is not null");
            return (Criteria) this;
        }

        public Criteria andContIdMainEqualTo(Long value) {
            addCriterion("CONT_ID_MAIN =", value, "contIdMain");
            return (Criteria) this;
        }

        public Criteria andContIdMainNotEqualTo(Long value) {
            addCriterion("CONT_ID_MAIN <>", value, "contIdMain");
            return (Criteria) this;
        }

        public Criteria andContIdMainGreaterThan(Long value) {
            addCriterion("CONT_ID_MAIN >", value, "contIdMain");
            return (Criteria) this;
        }

        public Criteria andContIdMainGreaterThanOrEqualTo(Long value) {
            addCriterion("CONT_ID_MAIN >=", value, "contIdMain");
            return (Criteria) this;
        }

        public Criteria andContIdMainLessThan(Long value) {
            addCriterion("CONT_ID_MAIN <", value, "contIdMain");
            return (Criteria) this;
        }

        public Criteria andContIdMainLessThanOrEqualTo(Long value) {
            addCriterion("CONT_ID_MAIN <=", value, "contIdMain");
            return (Criteria) this;
        }

        public Criteria andContIdMainIn(List<Long> values) {
            addCriterion("CONT_ID_MAIN in", values, "contIdMain");
            return (Criteria) this;
        }

        public Criteria andContIdMainNotIn(List<Long> values) {
            addCriterion("CONT_ID_MAIN not in", values, "contIdMain");
            return (Criteria) this;
        }

        public Criteria andContIdMainBetween(Long value1, Long value2) {
            addCriterion("CONT_ID_MAIN between", value1, value2, "contIdMain");
            return (Criteria) this;
        }

        public Criteria andContIdMainNotBetween(Long value1, Long value2) {
            addCriterion("CONT_ID_MAIN not between", value1, value2, "contIdMain");
            return (Criteria) this;
        }

        public Criteria andExterContIdIsNull() {
            addCriterion("EXTER_CONT_ID is null");
            return (Criteria) this;
        }

        public Criteria andExterContIdIsNotNull() {
            addCriterion("EXTER_CONT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andExterContIdEqualTo(String value) {
            addCriterion("EXTER_CONT_ID =", value, "exterContId");
            return (Criteria) this;
        }

        public Criteria andExterContIdNotEqualTo(String value) {
            addCriterion("EXTER_CONT_ID <>", value, "exterContId");
            return (Criteria) this;
        }

        public Criteria andExterContIdGreaterThan(String value) {
            addCriterion("EXTER_CONT_ID >", value, "exterContId");
            return (Criteria) this;
        }

        public Criteria andExterContIdGreaterThanOrEqualTo(String value) {
            addCriterion("EXTER_CONT_ID >=", value, "exterContId");
            return (Criteria) this;
        }

        public Criteria andExterContIdLessThan(String value) {
            addCriterion("EXTER_CONT_ID <", value, "exterContId");
            return (Criteria) this;
        }

        public Criteria andExterContIdLessThanOrEqualTo(String value) {
            addCriterion("EXTER_CONT_ID <=", value, "exterContId");
            return (Criteria) this;
        }

        public Criteria andExterContIdLike(String value) {
            addCriterion("EXTER_CONT_ID like", value, "exterContId");
            return (Criteria) this;
        }

        public Criteria andExterContIdNotLike(String value) {
            addCriterion("EXTER_CONT_ID not like", value, "exterContId");
            return (Criteria) this;
        }

        public Criteria andExterContIdIn(List<String> values) {
            addCriterion("EXTER_CONT_ID in", values, "exterContId");
            return (Criteria) this;
        }

        public Criteria andExterContIdNotIn(List<String> values) {
            addCriterion("EXTER_CONT_ID not in", values, "exterContId");
            return (Criteria) this;
        }

        public Criteria andExterContIdBetween(String value1, String value2) {
            addCriterion("EXTER_CONT_ID between", value1, value2, "exterContId");
            return (Criteria) this;
        }

        public Criteria andExterContIdNotBetween(String value1, String value2) {
            addCriterion("EXTER_CONT_ID not between", value1, value2, "exterContId");
            return (Criteria) this;
        }

        public Criteria andIsCopyIsNull() {
            addCriterion("IS_COPY is null");
            return (Criteria) this;
        }

        public Criteria andIsCopyIsNotNull() {
            addCriterion("IS_COPY is not null");
            return (Criteria) this;
        }

        public Criteria andIsCopyEqualTo(Long value) {
            addCriterion("IS_COPY =", value, "isCopy");
            return (Criteria) this;
        }

        public Criteria andIsCopyNotEqualTo(Long value) {
            addCriterion("IS_COPY <>", value, "isCopy");
            return (Criteria) this;
        }

        public Criteria andIsCopyGreaterThan(Long value) {
            addCriterion("IS_COPY >", value, "isCopy");
            return (Criteria) this;
        }

        public Criteria andIsCopyGreaterThanOrEqualTo(Long value) {
            addCriterion("IS_COPY >=", value, "isCopy");
            return (Criteria) this;
        }

        public Criteria andIsCopyLessThan(Long value) {
            addCriterion("IS_COPY <", value, "isCopy");
            return (Criteria) this;
        }

        public Criteria andIsCopyLessThanOrEqualTo(Long value) {
            addCriterion("IS_COPY <=", value, "isCopy");
            return (Criteria) this;
        }

        public Criteria andIsCopyIn(List<Long> values) {
            addCriterion("IS_COPY in", values, "isCopy");
            return (Criteria) this;
        }

        public Criteria andIsCopyNotIn(List<Long> values) {
            addCriterion("IS_COPY not in", values, "isCopy");
            return (Criteria) this;
        }

        public Criteria andIsCopyBetween(Long value1, Long value2) {
            addCriterion("IS_COPY between", value1, value2, "isCopy");
            return (Criteria) this;
        }

        public Criteria andIsCopyNotBetween(Long value1, Long value2) {
            addCriterion("IS_COPY not between", value1, value2, "isCopy");
            return (Criteria) this;
        }

        public Criteria andIsHideIsNull() {
            addCriterion("IS_HIDE is null");
            return (Criteria) this;
        }

        public Criteria andIsHideIsNotNull() {
            addCriterion("IS_HIDE is not null");
            return (Criteria) this;
        }

        public Criteria andIsHideEqualTo(Long value) {
            addCriterion("IS_HIDE =", value, "isHide");
            return (Criteria) this;
        }

        public Criteria andIsHideNotEqualTo(Long value) {
            addCriterion("IS_HIDE <>", value, "isHide");
            return (Criteria) this;
        }

        public Criteria andIsHideGreaterThan(Long value) {
            addCriterion("IS_HIDE >", value, "isHide");
            return (Criteria) this;
        }

        public Criteria andIsHideGreaterThanOrEqualTo(Long value) {
            addCriterion("IS_HIDE >=", value, "isHide");
            return (Criteria) this;
        }

        public Criteria andIsHideLessThan(Long value) {
            addCriterion("IS_HIDE <", value, "isHide");
            return (Criteria) this;
        }

        public Criteria andIsHideLessThanOrEqualTo(Long value) {
            addCriterion("IS_HIDE <=", value, "isHide");
            return (Criteria) this;
        }

        public Criteria andIsHideIn(List<Long> values) {
            addCriterion("IS_HIDE in", values, "isHide");
            return (Criteria) this;
        }

        public Criteria andIsHideNotIn(List<Long> values) {
            addCriterion("IS_HIDE not in", values, "isHide");
            return (Criteria) this;
        }

        public Criteria andIsHideBetween(Long value1, Long value2) {
            addCriterion("IS_HIDE between", value1, value2, "isHide");
            return (Criteria) this;
        }

        public Criteria andIsHideNotBetween(Long value1, Long value2) {
            addCriterion("IS_HIDE not between", value1, value2, "isHide");
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

        public Criteria andAdminNameIsNull() {
            addCriterion("ADMIN_NAME is null");
            return (Criteria) this;
        }

        public Criteria andAdminNameIsNotNull() {
            addCriterion("ADMIN_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andAdminNameEqualTo(String value) {
            addCriterion("ADMIN_NAME =", value, "adminName");
            return (Criteria) this;
        }

        public Criteria andAdminNameNotEqualTo(String value) {
            addCriterion("ADMIN_NAME <>", value, "adminName");
            return (Criteria) this;
        }

        public Criteria andAdminNameGreaterThan(String value) {
            addCriterion("ADMIN_NAME >", value, "adminName");
            return (Criteria) this;
        }

        public Criteria andAdminNameGreaterThanOrEqualTo(String value) {
            addCriterion("ADMIN_NAME >=", value, "adminName");
            return (Criteria) this;
        }

        public Criteria andAdminNameLessThan(String value) {
            addCriterion("ADMIN_NAME <", value, "adminName");
            return (Criteria) this;
        }

        public Criteria andAdminNameLessThanOrEqualTo(String value) {
            addCriterion("ADMIN_NAME <=", value, "adminName");
            return (Criteria) this;
        }

        public Criteria andAdminNameLike(String value) {
            addCriterion("ADMIN_NAME like", value, "adminName");
            return (Criteria) this;
        }

        public Criteria andAdminNameNotLike(String value) {
            addCriterion("ADMIN_NAME not like", value, "adminName");
            return (Criteria) this;
        }

        public Criteria andAdminNameIn(List<String> values) {
            addCriterion("ADMIN_NAME in", values, "adminName");
            return (Criteria) this;
        }

        public Criteria andAdminNameNotIn(List<String> values) {
            addCriterion("ADMIN_NAME not in", values, "adminName");
            return (Criteria) this;
        }

        public Criteria andAdminNameBetween(String value1, String value2) {
            addCriterion("ADMIN_NAME between", value1, value2, "adminName");
            return (Criteria) this;
        }

        public Criteria andAdminNameNotBetween(String value1, String value2) {
            addCriterion("ADMIN_NAME not between", value1, value2, "adminName");
            return (Criteria) this;
        }

        public Criteria andMemberNameIsNull() {
            addCriterion("MEMBER_NAME is null");
            return (Criteria) this;
        }

        public Criteria andMemberNameIsNotNull() {
            addCriterion("MEMBER_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andMemberNameEqualTo(String value) {
            addCriterion("MEMBER_NAME =", value, "memberName");
            return (Criteria) this;
        }

        public Criteria andMemberNameNotEqualTo(String value) {
            addCriterion("MEMBER_NAME <>", value, "memberName");
            return (Criteria) this;
        }

        public Criteria andMemberNameGreaterThan(String value) {
            addCriterion("MEMBER_NAME >", value, "memberName");
            return (Criteria) this;
        }

        public Criteria andMemberNameGreaterThanOrEqualTo(String value) {
            addCriterion("MEMBER_NAME >=", value, "memberName");
            return (Criteria) this;
        }

        public Criteria andMemberNameLessThan(String value) {
            addCriterion("MEMBER_NAME <", value, "memberName");
            return (Criteria) this;
        }

        public Criteria andMemberNameLessThanOrEqualTo(String value) {
            addCriterion("MEMBER_NAME <=", value, "memberName");
            return (Criteria) this;
        }

        public Criteria andMemberNameLike(String value) {
            addCriterion("MEMBER_NAME like", value, "memberName");
            return (Criteria) this;
        }

        public Criteria andMemberNameNotLike(String value) {
            addCriterion("MEMBER_NAME not like", value, "memberName");
            return (Criteria) this;
        }

        public Criteria andMemberNameIn(List<String> values) {
            addCriterion("MEMBER_NAME in", values, "memberName");
            return (Criteria) this;
        }

        public Criteria andMemberNameNotIn(List<String> values) {
            addCriterion("MEMBER_NAME not in", values, "memberName");
            return (Criteria) this;
        }

        public Criteria andMemberNameBetween(String value1, String value2) {
            addCriterion("MEMBER_NAME between", value1, value2, "memberName");
            return (Criteria) this;
        }

        public Criteria andMemberNameNotBetween(String value1, String value2) {
            addCriterion("MEMBER_NAME not between", value1, value2, "memberName");
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
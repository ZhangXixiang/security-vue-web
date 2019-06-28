package com.space.mybatis.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Cms2ContCountExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public Cms2ContCountExample() {
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

        public Criteria andContIdIsNull() {
            addCriterion("CONT_ID is null");
            return (Criteria) this;
        }

        public Criteria andContIdIsNotNull() {
            addCriterion("CONT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andContIdEqualTo(Long value) {
            addCriterion("CONT_ID =", value, "contId");
            return (Criteria) this;
        }

        public Criteria andContIdNotEqualTo(Long value) {
            addCriterion("CONT_ID <>", value, "contId");
            return (Criteria) this;
        }

        public Criteria andContIdGreaterThan(Long value) {
            addCriterion("CONT_ID >", value, "contId");
            return (Criteria) this;
        }

        public Criteria andContIdGreaterThanOrEqualTo(Long value) {
            addCriterion("CONT_ID >=", value, "contId");
            return (Criteria) this;
        }

        public Criteria andContIdLessThan(Long value) {
            addCriterion("CONT_ID <", value, "contId");
            return (Criteria) this;
        }

        public Criteria andContIdLessThanOrEqualTo(Long value) {
            addCriterion("CONT_ID <=", value, "contId");
            return (Criteria) this;
        }

        public Criteria andContIdIn(List<Long> values) {
            addCriterion("CONT_ID in", values, "contId");
            return (Criteria) this;
        }

        public Criteria andContIdNotIn(List<Long> values) {
            addCriterion("CONT_ID not in", values, "contId");
            return (Criteria) this;
        }

        public Criteria andContIdBetween(Long value1, Long value2) {
            addCriterion("CONT_ID between", value1, value2, "contId");
            return (Criteria) this;
        }

        public Criteria andContIdNotBetween(Long value1, Long value2) {
            addCriterion("CONT_ID not between", value1, value2, "contId");
            return (Criteria) this;
        }

        public Criteria andViewsIsNull() {
            addCriterion("VIEWS is null");
            return (Criteria) this;
        }

        public Criteria andViewsIsNotNull() {
            addCriterion("VIEWS is not null");
            return (Criteria) this;
        }

        public Criteria andViewsEqualTo(Long value) {
            addCriterion("VIEWS =", value, "views");
            return (Criteria) this;
        }

        public Criteria andViewsNotEqualTo(Long value) {
            addCriterion("VIEWS <>", value, "views");
            return (Criteria) this;
        }

        public Criteria andViewsGreaterThan(Long value) {
            addCriterion("VIEWS >", value, "views");
            return (Criteria) this;
        }

        public Criteria andViewsGreaterThanOrEqualTo(Long value) {
            addCriterion("VIEWS >=", value, "views");
            return (Criteria) this;
        }

        public Criteria andViewsLessThan(Long value) {
            addCriterion("VIEWS <", value, "views");
            return (Criteria) this;
        }

        public Criteria andViewsLessThanOrEqualTo(Long value) {
            addCriterion("VIEWS <=", value, "views");
            return (Criteria) this;
        }

        public Criteria andViewsIn(List<Long> values) {
            addCriterion("VIEWS in", values, "views");
            return (Criteria) this;
        }

        public Criteria andViewsNotIn(List<Long> values) {
            addCriterion("VIEWS not in", values, "views");
            return (Criteria) this;
        }

        public Criteria andViewsBetween(Long value1, Long value2) {
            addCriterion("VIEWS between", value1, value2, "views");
            return (Criteria) this;
        }

        public Criteria andViewsNotBetween(Long value1, Long value2) {
            addCriterion("VIEWS not between", value1, value2, "views");
            return (Criteria) this;
        }

        public Criteria andViewsMonthIsNull() {
            addCriterion("VIEWS_MONTH is null");
            return (Criteria) this;
        }

        public Criteria andViewsMonthIsNotNull() {
            addCriterion("VIEWS_MONTH is not null");
            return (Criteria) this;
        }

        public Criteria andViewsMonthEqualTo(Long value) {
            addCriterion("VIEWS_MONTH =", value, "viewsMonth");
            return (Criteria) this;
        }

        public Criteria andViewsMonthNotEqualTo(Long value) {
            addCriterion("VIEWS_MONTH <>", value, "viewsMonth");
            return (Criteria) this;
        }

        public Criteria andViewsMonthGreaterThan(Long value) {
            addCriterion("VIEWS_MONTH >", value, "viewsMonth");
            return (Criteria) this;
        }

        public Criteria andViewsMonthGreaterThanOrEqualTo(Long value) {
            addCriterion("VIEWS_MONTH >=", value, "viewsMonth");
            return (Criteria) this;
        }

        public Criteria andViewsMonthLessThan(Long value) {
            addCriterion("VIEWS_MONTH <", value, "viewsMonth");
            return (Criteria) this;
        }

        public Criteria andViewsMonthLessThanOrEqualTo(Long value) {
            addCriterion("VIEWS_MONTH <=", value, "viewsMonth");
            return (Criteria) this;
        }

        public Criteria andViewsMonthIn(List<Long> values) {
            addCriterion("VIEWS_MONTH in", values, "viewsMonth");
            return (Criteria) this;
        }

        public Criteria andViewsMonthNotIn(List<Long> values) {
            addCriterion("VIEWS_MONTH not in", values, "viewsMonth");
            return (Criteria) this;
        }

        public Criteria andViewsMonthBetween(Long value1, Long value2) {
            addCriterion("VIEWS_MONTH between", value1, value2, "viewsMonth");
            return (Criteria) this;
        }

        public Criteria andViewsMonthNotBetween(Long value1, Long value2) {
            addCriterion("VIEWS_MONTH not between", value1, value2, "viewsMonth");
            return (Criteria) this;
        }

        public Criteria andViewsWeekIsNull() {
            addCriterion("VIEWS_WEEK is null");
            return (Criteria) this;
        }

        public Criteria andViewsWeekIsNotNull() {
            addCriterion("VIEWS_WEEK is not null");
            return (Criteria) this;
        }

        public Criteria andViewsWeekEqualTo(Long value) {
            addCriterion("VIEWS_WEEK =", value, "viewsWeek");
            return (Criteria) this;
        }

        public Criteria andViewsWeekNotEqualTo(Long value) {
            addCriterion("VIEWS_WEEK <>", value, "viewsWeek");
            return (Criteria) this;
        }

        public Criteria andViewsWeekGreaterThan(Long value) {
            addCriterion("VIEWS_WEEK >", value, "viewsWeek");
            return (Criteria) this;
        }

        public Criteria andViewsWeekGreaterThanOrEqualTo(Long value) {
            addCriterion("VIEWS_WEEK >=", value, "viewsWeek");
            return (Criteria) this;
        }

        public Criteria andViewsWeekLessThan(Long value) {
            addCriterion("VIEWS_WEEK <", value, "viewsWeek");
            return (Criteria) this;
        }

        public Criteria andViewsWeekLessThanOrEqualTo(Long value) {
            addCriterion("VIEWS_WEEK <=", value, "viewsWeek");
            return (Criteria) this;
        }

        public Criteria andViewsWeekIn(List<Long> values) {
            addCriterion("VIEWS_WEEK in", values, "viewsWeek");
            return (Criteria) this;
        }

        public Criteria andViewsWeekNotIn(List<Long> values) {
            addCriterion("VIEWS_WEEK not in", values, "viewsWeek");
            return (Criteria) this;
        }

        public Criteria andViewsWeekBetween(Long value1, Long value2) {
            addCriterion("VIEWS_WEEK between", value1, value2, "viewsWeek");
            return (Criteria) this;
        }

        public Criteria andViewsWeekNotBetween(Long value1, Long value2) {
            addCriterion("VIEWS_WEEK not between", value1, value2, "viewsWeek");
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

        public Criteria andCommentsIsNull() {
            addCriterion("COMMENTS is null");
            return (Criteria) this;
        }

        public Criteria andCommentsIsNotNull() {
            addCriterion("COMMENTS is not null");
            return (Criteria) this;
        }

        public Criteria andCommentsEqualTo(Long value) {
            addCriterion("COMMENTS =", value, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsNotEqualTo(Long value) {
            addCriterion("COMMENTS <>", value, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsGreaterThan(Long value) {
            addCriterion("COMMENTS >", value, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsGreaterThanOrEqualTo(Long value) {
            addCriterion("COMMENTS >=", value, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsLessThan(Long value) {
            addCriterion("COMMENTS <", value, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsLessThanOrEqualTo(Long value) {
            addCriterion("COMMENTS <=", value, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsIn(List<Long> values) {
            addCriterion("COMMENTS in", values, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsNotIn(List<Long> values) {
            addCriterion("COMMENTS not in", values, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsBetween(Long value1, Long value2) {
            addCriterion("COMMENTS between", value1, value2, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsNotBetween(Long value1, Long value2) {
            addCriterion("COMMENTS not between", value1, value2, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsMonthIsNull() {
            addCriterion("COMMENTS_MONTH is null");
            return (Criteria) this;
        }

        public Criteria andCommentsMonthIsNotNull() {
            addCriterion("COMMENTS_MONTH is not null");
            return (Criteria) this;
        }

        public Criteria andCommentsMonthEqualTo(Long value) {
            addCriterion("COMMENTS_MONTH =", value, "commentsMonth");
            return (Criteria) this;
        }

        public Criteria andCommentsMonthNotEqualTo(Long value) {
            addCriterion("COMMENTS_MONTH <>", value, "commentsMonth");
            return (Criteria) this;
        }

        public Criteria andCommentsMonthGreaterThan(Long value) {
            addCriterion("COMMENTS_MONTH >", value, "commentsMonth");
            return (Criteria) this;
        }

        public Criteria andCommentsMonthGreaterThanOrEqualTo(Long value) {
            addCriterion("COMMENTS_MONTH >=", value, "commentsMonth");
            return (Criteria) this;
        }

        public Criteria andCommentsMonthLessThan(Long value) {
            addCriterion("COMMENTS_MONTH <", value, "commentsMonth");
            return (Criteria) this;
        }

        public Criteria andCommentsMonthLessThanOrEqualTo(Long value) {
            addCriterion("COMMENTS_MONTH <=", value, "commentsMonth");
            return (Criteria) this;
        }

        public Criteria andCommentsMonthIn(List<Long> values) {
            addCriterion("COMMENTS_MONTH in", values, "commentsMonth");
            return (Criteria) this;
        }

        public Criteria andCommentsMonthNotIn(List<Long> values) {
            addCriterion("COMMENTS_MONTH not in", values, "commentsMonth");
            return (Criteria) this;
        }

        public Criteria andCommentsMonthBetween(Long value1, Long value2) {
            addCriterion("COMMENTS_MONTH between", value1, value2, "commentsMonth");
            return (Criteria) this;
        }

        public Criteria andCommentsMonthNotBetween(Long value1, Long value2) {
            addCriterion("COMMENTS_MONTH not between", value1, value2, "commentsMonth");
            return (Criteria) this;
        }

        public Criteria andCommentsWeekIsNull() {
            addCriterion("COMMENTS_WEEK is null");
            return (Criteria) this;
        }

        public Criteria andCommentsWeekIsNotNull() {
            addCriterion("COMMENTS_WEEK is not null");
            return (Criteria) this;
        }

        public Criteria andCommentsWeekEqualTo(Long value) {
            addCriterion("COMMENTS_WEEK =", value, "commentsWeek");
            return (Criteria) this;
        }

        public Criteria andCommentsWeekNotEqualTo(Long value) {
            addCriterion("COMMENTS_WEEK <>", value, "commentsWeek");
            return (Criteria) this;
        }

        public Criteria andCommentsWeekGreaterThan(Long value) {
            addCriterion("COMMENTS_WEEK >", value, "commentsWeek");
            return (Criteria) this;
        }

        public Criteria andCommentsWeekGreaterThanOrEqualTo(Long value) {
            addCriterion("COMMENTS_WEEK >=", value, "commentsWeek");
            return (Criteria) this;
        }

        public Criteria andCommentsWeekLessThan(Long value) {
            addCriterion("COMMENTS_WEEK <", value, "commentsWeek");
            return (Criteria) this;
        }

        public Criteria andCommentsWeekLessThanOrEqualTo(Long value) {
            addCriterion("COMMENTS_WEEK <=", value, "commentsWeek");
            return (Criteria) this;
        }

        public Criteria andCommentsWeekIn(List<Long> values) {
            addCriterion("COMMENTS_WEEK in", values, "commentsWeek");
            return (Criteria) this;
        }

        public Criteria andCommentsWeekNotIn(List<Long> values) {
            addCriterion("COMMENTS_WEEK not in", values, "commentsWeek");
            return (Criteria) this;
        }

        public Criteria andCommentsWeekBetween(Long value1, Long value2) {
            addCriterion("COMMENTS_WEEK between", value1, value2, "commentsWeek");
            return (Criteria) this;
        }

        public Criteria andCommentsWeekNotBetween(Long value1, Long value2) {
            addCriterion("COMMENTS_WEEK not between", value1, value2, "commentsWeek");
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

        public Criteria andDownloadsIsNull() {
            addCriterion("DOWNLOADS is null");
            return (Criteria) this;
        }

        public Criteria andDownloadsIsNotNull() {
            addCriterion("DOWNLOADS is not null");
            return (Criteria) this;
        }

        public Criteria andDownloadsEqualTo(Long value) {
            addCriterion("DOWNLOADS =", value, "downloads");
            return (Criteria) this;
        }

        public Criteria andDownloadsNotEqualTo(Long value) {
            addCriterion("DOWNLOADS <>", value, "downloads");
            return (Criteria) this;
        }

        public Criteria andDownloadsGreaterThan(Long value) {
            addCriterion("DOWNLOADS >", value, "downloads");
            return (Criteria) this;
        }

        public Criteria andDownloadsGreaterThanOrEqualTo(Long value) {
            addCriterion("DOWNLOADS >=", value, "downloads");
            return (Criteria) this;
        }

        public Criteria andDownloadsLessThan(Long value) {
            addCriterion("DOWNLOADS <", value, "downloads");
            return (Criteria) this;
        }

        public Criteria andDownloadsLessThanOrEqualTo(Long value) {
            addCriterion("DOWNLOADS <=", value, "downloads");
            return (Criteria) this;
        }

        public Criteria andDownloadsIn(List<Long> values) {
            addCriterion("DOWNLOADS in", values, "downloads");
            return (Criteria) this;
        }

        public Criteria andDownloadsNotIn(List<Long> values) {
            addCriterion("DOWNLOADS not in", values, "downloads");
            return (Criteria) this;
        }

        public Criteria andDownloadsBetween(Long value1, Long value2) {
            addCriterion("DOWNLOADS between", value1, value2, "downloads");
            return (Criteria) this;
        }

        public Criteria andDownloadsNotBetween(Long value1, Long value2) {
            addCriterion("DOWNLOADS not between", value1, value2, "downloads");
            return (Criteria) this;
        }

        public Criteria andDownloadsMonthIsNull() {
            addCriterion("DOWNLOADS_MONTH is null");
            return (Criteria) this;
        }

        public Criteria andDownloadsMonthIsNotNull() {
            addCriterion("DOWNLOADS_MONTH is not null");
            return (Criteria) this;
        }

        public Criteria andDownloadsMonthEqualTo(Long value) {
            addCriterion("DOWNLOADS_MONTH =", value, "downloadsMonth");
            return (Criteria) this;
        }

        public Criteria andDownloadsMonthNotEqualTo(Long value) {
            addCriterion("DOWNLOADS_MONTH <>", value, "downloadsMonth");
            return (Criteria) this;
        }

        public Criteria andDownloadsMonthGreaterThan(Long value) {
            addCriterion("DOWNLOADS_MONTH >", value, "downloadsMonth");
            return (Criteria) this;
        }

        public Criteria andDownloadsMonthGreaterThanOrEqualTo(Long value) {
            addCriterion("DOWNLOADS_MONTH >=", value, "downloadsMonth");
            return (Criteria) this;
        }

        public Criteria andDownloadsMonthLessThan(Long value) {
            addCriterion("DOWNLOADS_MONTH <", value, "downloadsMonth");
            return (Criteria) this;
        }

        public Criteria andDownloadsMonthLessThanOrEqualTo(Long value) {
            addCriterion("DOWNLOADS_MONTH <=", value, "downloadsMonth");
            return (Criteria) this;
        }

        public Criteria andDownloadsMonthIn(List<Long> values) {
            addCriterion("DOWNLOADS_MONTH in", values, "downloadsMonth");
            return (Criteria) this;
        }

        public Criteria andDownloadsMonthNotIn(List<Long> values) {
            addCriterion("DOWNLOADS_MONTH not in", values, "downloadsMonth");
            return (Criteria) this;
        }

        public Criteria andDownloadsMonthBetween(Long value1, Long value2) {
            addCriterion("DOWNLOADS_MONTH between", value1, value2, "downloadsMonth");
            return (Criteria) this;
        }

        public Criteria andDownloadsMonthNotBetween(Long value1, Long value2) {
            addCriterion("DOWNLOADS_MONTH not between", value1, value2, "downloadsMonth");
            return (Criteria) this;
        }

        public Criteria andDownloadsWeekIsNull() {
            addCriterion("DOWNLOADS_WEEK is null");
            return (Criteria) this;
        }

        public Criteria andDownloadsWeekIsNotNull() {
            addCriterion("DOWNLOADS_WEEK is not null");
            return (Criteria) this;
        }

        public Criteria andDownloadsWeekEqualTo(Long value) {
            addCriterion("DOWNLOADS_WEEK =", value, "downloadsWeek");
            return (Criteria) this;
        }

        public Criteria andDownloadsWeekNotEqualTo(Long value) {
            addCriterion("DOWNLOADS_WEEK <>", value, "downloadsWeek");
            return (Criteria) this;
        }

        public Criteria andDownloadsWeekGreaterThan(Long value) {
            addCriterion("DOWNLOADS_WEEK >", value, "downloadsWeek");
            return (Criteria) this;
        }

        public Criteria andDownloadsWeekGreaterThanOrEqualTo(Long value) {
            addCriterion("DOWNLOADS_WEEK >=", value, "downloadsWeek");
            return (Criteria) this;
        }

        public Criteria andDownloadsWeekLessThan(Long value) {
            addCriterion("DOWNLOADS_WEEK <", value, "downloadsWeek");
            return (Criteria) this;
        }

        public Criteria andDownloadsWeekLessThanOrEqualTo(Long value) {
            addCriterion("DOWNLOADS_WEEK <=", value, "downloadsWeek");
            return (Criteria) this;
        }

        public Criteria andDownloadsWeekIn(List<Long> values) {
            addCriterion("DOWNLOADS_WEEK in", values, "downloadsWeek");
            return (Criteria) this;
        }

        public Criteria andDownloadsWeekNotIn(List<Long> values) {
            addCriterion("DOWNLOADS_WEEK not in", values, "downloadsWeek");
            return (Criteria) this;
        }

        public Criteria andDownloadsWeekBetween(Long value1, Long value2) {
            addCriterion("DOWNLOADS_WEEK between", value1, value2, "downloadsWeek");
            return (Criteria) this;
        }

        public Criteria andDownloadsWeekNotBetween(Long value1, Long value2) {
            addCriterion("DOWNLOADS_WEEK not between", value1, value2, "downloadsWeek");
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

        public Criteria andUpsIsNull() {
            addCriterion("UPS is null");
            return (Criteria) this;
        }

        public Criteria andUpsIsNotNull() {
            addCriterion("UPS is not null");
            return (Criteria) this;
        }

        public Criteria andUpsEqualTo(Long value) {
            addCriterion("UPS =", value, "ups");
            return (Criteria) this;
        }

        public Criteria andUpsNotEqualTo(Long value) {
            addCriterion("UPS <>", value, "ups");
            return (Criteria) this;
        }

        public Criteria andUpsGreaterThan(Long value) {
            addCriterion("UPS >", value, "ups");
            return (Criteria) this;
        }

        public Criteria andUpsGreaterThanOrEqualTo(Long value) {
            addCriterion("UPS >=", value, "ups");
            return (Criteria) this;
        }

        public Criteria andUpsLessThan(Long value) {
            addCriterion("UPS <", value, "ups");
            return (Criteria) this;
        }

        public Criteria andUpsLessThanOrEqualTo(Long value) {
            addCriterion("UPS <=", value, "ups");
            return (Criteria) this;
        }

        public Criteria andUpsIn(List<Long> values) {
            addCriterion("UPS in", values, "ups");
            return (Criteria) this;
        }

        public Criteria andUpsNotIn(List<Long> values) {
            addCriterion("UPS not in", values, "ups");
            return (Criteria) this;
        }

        public Criteria andUpsBetween(Long value1, Long value2) {
            addCriterion("UPS between", value1, value2, "ups");
            return (Criteria) this;
        }

        public Criteria andUpsNotBetween(Long value1, Long value2) {
            addCriterion("UPS not between", value1, value2, "ups");
            return (Criteria) this;
        }

        public Criteria andUpsMonthIsNull() {
            addCriterion("UPS_MONTH is null");
            return (Criteria) this;
        }

        public Criteria andUpsMonthIsNotNull() {
            addCriterion("UPS_MONTH is not null");
            return (Criteria) this;
        }

        public Criteria andUpsMonthEqualTo(Long value) {
            addCriterion("UPS_MONTH =", value, "upsMonth");
            return (Criteria) this;
        }

        public Criteria andUpsMonthNotEqualTo(Long value) {
            addCriterion("UPS_MONTH <>", value, "upsMonth");
            return (Criteria) this;
        }

        public Criteria andUpsMonthGreaterThan(Long value) {
            addCriterion("UPS_MONTH >", value, "upsMonth");
            return (Criteria) this;
        }

        public Criteria andUpsMonthGreaterThanOrEqualTo(Long value) {
            addCriterion("UPS_MONTH >=", value, "upsMonth");
            return (Criteria) this;
        }

        public Criteria andUpsMonthLessThan(Long value) {
            addCriterion("UPS_MONTH <", value, "upsMonth");
            return (Criteria) this;
        }

        public Criteria andUpsMonthLessThanOrEqualTo(Long value) {
            addCriterion("UPS_MONTH <=", value, "upsMonth");
            return (Criteria) this;
        }

        public Criteria andUpsMonthIn(List<Long> values) {
            addCriterion("UPS_MONTH in", values, "upsMonth");
            return (Criteria) this;
        }

        public Criteria andUpsMonthNotIn(List<Long> values) {
            addCriterion("UPS_MONTH not in", values, "upsMonth");
            return (Criteria) this;
        }

        public Criteria andUpsMonthBetween(Long value1, Long value2) {
            addCriterion("UPS_MONTH between", value1, value2, "upsMonth");
            return (Criteria) this;
        }

        public Criteria andUpsMonthNotBetween(Long value1, Long value2) {
            addCriterion("UPS_MONTH not between", value1, value2, "upsMonth");
            return (Criteria) this;
        }

        public Criteria andUpsWeekIsNull() {
            addCriterion("UPS_WEEK is null");
            return (Criteria) this;
        }

        public Criteria andUpsWeekIsNotNull() {
            addCriterion("UPS_WEEK is not null");
            return (Criteria) this;
        }

        public Criteria andUpsWeekEqualTo(Long value) {
            addCriterion("UPS_WEEK =", value, "upsWeek");
            return (Criteria) this;
        }

        public Criteria andUpsWeekNotEqualTo(Long value) {
            addCriterion("UPS_WEEK <>", value, "upsWeek");
            return (Criteria) this;
        }

        public Criteria andUpsWeekGreaterThan(Long value) {
            addCriterion("UPS_WEEK >", value, "upsWeek");
            return (Criteria) this;
        }

        public Criteria andUpsWeekGreaterThanOrEqualTo(Long value) {
            addCriterion("UPS_WEEK >=", value, "upsWeek");
            return (Criteria) this;
        }

        public Criteria andUpsWeekLessThan(Long value) {
            addCriterion("UPS_WEEK <", value, "upsWeek");
            return (Criteria) this;
        }

        public Criteria andUpsWeekLessThanOrEqualTo(Long value) {
            addCriterion("UPS_WEEK <=", value, "upsWeek");
            return (Criteria) this;
        }

        public Criteria andUpsWeekIn(List<Long> values) {
            addCriterion("UPS_WEEK in", values, "upsWeek");
            return (Criteria) this;
        }

        public Criteria andUpsWeekNotIn(List<Long> values) {
            addCriterion("UPS_WEEK not in", values, "upsWeek");
            return (Criteria) this;
        }

        public Criteria andUpsWeekBetween(Long value1, Long value2) {
            addCriterion("UPS_WEEK between", value1, value2, "upsWeek");
            return (Criteria) this;
        }

        public Criteria andUpsWeekNotBetween(Long value1, Long value2) {
            addCriterion("UPS_WEEK not between", value1, value2, "upsWeek");
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

        public Criteria andDownsIsNull() {
            addCriterion("DOWNS is null");
            return (Criteria) this;
        }

        public Criteria andDownsIsNotNull() {
            addCriterion("DOWNS is not null");
            return (Criteria) this;
        }

        public Criteria andDownsEqualTo(Long value) {
            addCriterion("DOWNS =", value, "downs");
            return (Criteria) this;
        }

        public Criteria andDownsNotEqualTo(Long value) {
            addCriterion("DOWNS <>", value, "downs");
            return (Criteria) this;
        }

        public Criteria andDownsGreaterThan(Long value) {
            addCriterion("DOWNS >", value, "downs");
            return (Criteria) this;
        }

        public Criteria andDownsGreaterThanOrEqualTo(Long value) {
            addCriterion("DOWNS >=", value, "downs");
            return (Criteria) this;
        }

        public Criteria andDownsLessThan(Long value) {
            addCriterion("DOWNS <", value, "downs");
            return (Criteria) this;
        }

        public Criteria andDownsLessThanOrEqualTo(Long value) {
            addCriterion("DOWNS <=", value, "downs");
            return (Criteria) this;
        }

        public Criteria andDownsIn(List<Long> values) {
            addCriterion("DOWNS in", values, "downs");
            return (Criteria) this;
        }

        public Criteria andDownsNotIn(List<Long> values) {
            addCriterion("DOWNS not in", values, "downs");
            return (Criteria) this;
        }

        public Criteria andDownsBetween(Long value1, Long value2) {
            addCriterion("DOWNS between", value1, value2, "downs");
            return (Criteria) this;
        }

        public Criteria andDownsNotBetween(Long value1, Long value2) {
            addCriterion("DOWNS not between", value1, value2, "downs");
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
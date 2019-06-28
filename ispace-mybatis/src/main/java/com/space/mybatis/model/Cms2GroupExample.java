package com.space.mybatis.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Cms2GroupExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public Cms2GroupExample() {
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

        public Criteria andCodeIsNull() {
            addCriterion("CODE is null");
            return (Criteria) this;
        }

        public Criteria andCodeIsNotNull() {
            addCriterion("CODE is not null");
            return (Criteria) this;
        }

        public Criteria andCodeEqualTo(String value) {
            addCriterion("CODE =", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotEqualTo(String value) {
            addCriterion("CODE <>", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeGreaterThan(String value) {
            addCriterion("CODE >", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeGreaterThanOrEqualTo(String value) {
            addCriterion("CODE >=", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLessThan(String value) {
            addCriterion("CODE <", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLessThanOrEqualTo(String value) {
            addCriterion("CODE <=", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLike(String value) {
            addCriterion("CODE like", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotLike(String value) {
            addCriterion("CODE not like", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeIn(List<String> values) {
            addCriterion("CODE in", values, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotIn(List<String> values) {
            addCriterion("CODE not in", values, "code");
            return (Criteria) this;
        }

        public Criteria andCodeBetween(String value1, String value2) {
            addCriterion("CODE between", value1, value2, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotBetween(String value1, String value2) {
            addCriterion("CODE not between", value1, value2, "code");
            return (Criteria) this;
        }

        public Criteria andGroupNameIsNull() {
            addCriterion("GROUP_NAME is null");
            return (Criteria) this;
        }

        public Criteria andGroupNameIsNotNull() {
            addCriterion("GROUP_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andGroupNameEqualTo(String value) {
            addCriterion("GROUP_NAME =", value, "groupName");
            return (Criteria) this;
        }

        public Criteria andGroupNameNotEqualTo(String value) {
            addCriterion("GROUP_NAME <>", value, "groupName");
            return (Criteria) this;
        }

        public Criteria andGroupNameGreaterThan(String value) {
            addCriterion("GROUP_NAME >", value, "groupName");
            return (Criteria) this;
        }

        public Criteria andGroupNameGreaterThanOrEqualTo(String value) {
            addCriterion("GROUP_NAME >=", value, "groupName");
            return (Criteria) this;
        }

        public Criteria andGroupNameLessThan(String value) {
            addCriterion("GROUP_NAME <", value, "groupName");
            return (Criteria) this;
        }

        public Criteria andGroupNameLessThanOrEqualTo(String value) {
            addCriterion("GROUP_NAME <=", value, "groupName");
            return (Criteria) this;
        }

        public Criteria andGroupNameLike(String value) {
            addCriterion("GROUP_NAME like", value, "groupName");
            return (Criteria) this;
        }

        public Criteria andGroupNameNotLike(String value) {
            addCriterion("GROUP_NAME not like", value, "groupName");
            return (Criteria) this;
        }

        public Criteria andGroupNameIn(List<String> values) {
            addCriterion("GROUP_NAME in", values, "groupName");
            return (Criteria) this;
        }

        public Criteria andGroupNameNotIn(List<String> values) {
            addCriterion("GROUP_NAME not in", values, "groupName");
            return (Criteria) this;
        }

        public Criteria andGroupNameBetween(String value1, String value2) {
            addCriterion("GROUP_NAME between", value1, value2, "groupName");
            return (Criteria) this;
        }

        public Criteria andGroupNameNotBetween(String value1, String value2) {
            addCriterion("GROUP_NAME not between", value1, value2, "groupName");
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

        public Criteria andNeedCaptchaIsNull() {
            addCriterion("NEED_CAPTCHA is null");
            return (Criteria) this;
        }

        public Criteria andNeedCaptchaIsNotNull() {
            addCriterion("NEED_CAPTCHA is not null");
            return (Criteria) this;
        }

        public Criteria andNeedCaptchaEqualTo(Long value) {
            addCriterion("NEED_CAPTCHA =", value, "needCaptcha");
            return (Criteria) this;
        }

        public Criteria andNeedCaptchaNotEqualTo(Long value) {
            addCriterion("NEED_CAPTCHA <>", value, "needCaptcha");
            return (Criteria) this;
        }

        public Criteria andNeedCaptchaGreaterThan(Long value) {
            addCriterion("NEED_CAPTCHA >", value, "needCaptcha");
            return (Criteria) this;
        }

        public Criteria andNeedCaptchaGreaterThanOrEqualTo(Long value) {
            addCriterion("NEED_CAPTCHA >=", value, "needCaptcha");
            return (Criteria) this;
        }

        public Criteria andNeedCaptchaLessThan(Long value) {
            addCriterion("NEED_CAPTCHA <", value, "needCaptcha");
            return (Criteria) this;
        }

        public Criteria andNeedCaptchaLessThanOrEqualTo(Long value) {
            addCriterion("NEED_CAPTCHA <=", value, "needCaptcha");
            return (Criteria) this;
        }

        public Criteria andNeedCaptchaIn(List<Long> values) {
            addCriterion("NEED_CAPTCHA in", values, "needCaptcha");
            return (Criteria) this;
        }

        public Criteria andNeedCaptchaNotIn(List<Long> values) {
            addCriterion("NEED_CAPTCHA not in", values, "needCaptcha");
            return (Criteria) this;
        }

        public Criteria andNeedCaptchaBetween(Long value1, Long value2) {
            addCriterion("NEED_CAPTCHA between", value1, value2, "needCaptcha");
            return (Criteria) this;
        }

        public Criteria andNeedCaptchaNotBetween(Long value1, Long value2) {
            addCriterion("NEED_CAPTCHA not between", value1, value2, "needCaptcha");
            return (Criteria) this;
        }

        public Criteria andNeedCheckIsNull() {
            addCriterion("NEED_CHECK is null");
            return (Criteria) this;
        }

        public Criteria andNeedCheckIsNotNull() {
            addCriterion("NEED_CHECK is not null");
            return (Criteria) this;
        }

        public Criteria andNeedCheckEqualTo(Long value) {
            addCriterion("NEED_CHECK =", value, "needCheck");
            return (Criteria) this;
        }

        public Criteria andNeedCheckNotEqualTo(Long value) {
            addCriterion("NEED_CHECK <>", value, "needCheck");
            return (Criteria) this;
        }

        public Criteria andNeedCheckGreaterThan(Long value) {
            addCriterion("NEED_CHECK >", value, "needCheck");
            return (Criteria) this;
        }

        public Criteria andNeedCheckGreaterThanOrEqualTo(Long value) {
            addCriterion("NEED_CHECK >=", value, "needCheck");
            return (Criteria) this;
        }

        public Criteria andNeedCheckLessThan(Long value) {
            addCriterion("NEED_CHECK <", value, "needCheck");
            return (Criteria) this;
        }

        public Criteria andNeedCheckLessThanOrEqualTo(Long value) {
            addCriterion("NEED_CHECK <=", value, "needCheck");
            return (Criteria) this;
        }

        public Criteria andNeedCheckIn(List<Long> values) {
            addCriterion("NEED_CHECK in", values, "needCheck");
            return (Criteria) this;
        }

        public Criteria andNeedCheckNotIn(List<Long> values) {
            addCriterion("NEED_CHECK not in", values, "needCheck");
            return (Criteria) this;
        }

        public Criteria andNeedCheckBetween(Long value1, Long value2) {
            addCriterion("NEED_CHECK between", value1, value2, "needCheck");
            return (Criteria) this;
        }

        public Criteria andNeedCheckNotBetween(Long value1, Long value2) {
            addCriterion("NEED_CHECK not between", value1, value2, "needCheck");
            return (Criteria) this;
        }

        public Criteria andAllowPerDayIsNull() {
            addCriterion("ALLOW_PER_DAY is null");
            return (Criteria) this;
        }

        public Criteria andAllowPerDayIsNotNull() {
            addCriterion("ALLOW_PER_DAY is not null");
            return (Criteria) this;
        }

        public Criteria andAllowPerDayEqualTo(Long value) {
            addCriterion("ALLOW_PER_DAY =", value, "allowPerDay");
            return (Criteria) this;
        }

        public Criteria andAllowPerDayNotEqualTo(Long value) {
            addCriterion("ALLOW_PER_DAY <>", value, "allowPerDay");
            return (Criteria) this;
        }

        public Criteria andAllowPerDayGreaterThan(Long value) {
            addCriterion("ALLOW_PER_DAY >", value, "allowPerDay");
            return (Criteria) this;
        }

        public Criteria andAllowPerDayGreaterThanOrEqualTo(Long value) {
            addCriterion("ALLOW_PER_DAY >=", value, "allowPerDay");
            return (Criteria) this;
        }

        public Criteria andAllowPerDayLessThan(Long value) {
            addCriterion("ALLOW_PER_DAY <", value, "allowPerDay");
            return (Criteria) this;
        }

        public Criteria andAllowPerDayLessThanOrEqualTo(Long value) {
            addCriterion("ALLOW_PER_DAY <=", value, "allowPerDay");
            return (Criteria) this;
        }

        public Criteria andAllowPerDayIn(List<Long> values) {
            addCriterion("ALLOW_PER_DAY in", values, "allowPerDay");
            return (Criteria) this;
        }

        public Criteria andAllowPerDayNotIn(List<Long> values) {
            addCriterion("ALLOW_PER_DAY not in", values, "allowPerDay");
            return (Criteria) this;
        }

        public Criteria andAllowPerDayBetween(Long value1, Long value2) {
            addCriterion("ALLOW_PER_DAY between", value1, value2, "allowPerDay");
            return (Criteria) this;
        }

        public Criteria andAllowPerDayNotBetween(Long value1, Long value2) {
            addCriterion("ALLOW_PER_DAY not between", value1, value2, "allowPerDay");
            return (Criteria) this;
        }

        public Criteria andAllowMaxFileIsNull() {
            addCriterion("ALLOW_MAX_FILE is null");
            return (Criteria) this;
        }

        public Criteria andAllowMaxFileIsNotNull() {
            addCriterion("ALLOW_MAX_FILE is not null");
            return (Criteria) this;
        }

        public Criteria andAllowMaxFileEqualTo(Long value) {
            addCriterion("ALLOW_MAX_FILE =", value, "allowMaxFile");
            return (Criteria) this;
        }

        public Criteria andAllowMaxFileNotEqualTo(Long value) {
            addCriterion("ALLOW_MAX_FILE <>", value, "allowMaxFile");
            return (Criteria) this;
        }

        public Criteria andAllowMaxFileGreaterThan(Long value) {
            addCriterion("ALLOW_MAX_FILE >", value, "allowMaxFile");
            return (Criteria) this;
        }

        public Criteria andAllowMaxFileGreaterThanOrEqualTo(Long value) {
            addCriterion("ALLOW_MAX_FILE >=", value, "allowMaxFile");
            return (Criteria) this;
        }

        public Criteria andAllowMaxFileLessThan(Long value) {
            addCriterion("ALLOW_MAX_FILE <", value, "allowMaxFile");
            return (Criteria) this;
        }

        public Criteria andAllowMaxFileLessThanOrEqualTo(Long value) {
            addCriterion("ALLOW_MAX_FILE <=", value, "allowMaxFile");
            return (Criteria) this;
        }

        public Criteria andAllowMaxFileIn(List<Long> values) {
            addCriterion("ALLOW_MAX_FILE in", values, "allowMaxFile");
            return (Criteria) this;
        }

        public Criteria andAllowMaxFileNotIn(List<Long> values) {
            addCriterion("ALLOW_MAX_FILE not in", values, "allowMaxFile");
            return (Criteria) this;
        }

        public Criteria andAllowMaxFileBetween(Long value1, Long value2) {
            addCriterion("ALLOW_MAX_FILE between", value1, value2, "allowMaxFile");
            return (Criteria) this;
        }

        public Criteria andAllowMaxFileNotBetween(Long value1, Long value2) {
            addCriterion("ALLOW_MAX_FILE not between", value1, value2, "allowMaxFile");
            return (Criteria) this;
        }

        public Criteria andIsRegDefIsNull() {
            addCriterion("IS_REG_DEF is null");
            return (Criteria) this;
        }

        public Criteria andIsRegDefIsNotNull() {
            addCriterion("IS_REG_DEF is not null");
            return (Criteria) this;
        }

        public Criteria andIsRegDefEqualTo(Long value) {
            addCriterion("IS_REG_DEF =", value, "isRegDef");
            return (Criteria) this;
        }

        public Criteria andIsRegDefNotEqualTo(Long value) {
            addCriterion("IS_REG_DEF <>", value, "isRegDef");
            return (Criteria) this;
        }

        public Criteria andIsRegDefGreaterThan(Long value) {
            addCriterion("IS_REG_DEF >", value, "isRegDef");
            return (Criteria) this;
        }

        public Criteria andIsRegDefGreaterThanOrEqualTo(Long value) {
            addCriterion("IS_REG_DEF >=", value, "isRegDef");
            return (Criteria) this;
        }

        public Criteria andIsRegDefLessThan(Long value) {
            addCriterion("IS_REG_DEF <", value, "isRegDef");
            return (Criteria) this;
        }

        public Criteria andIsRegDefLessThanOrEqualTo(Long value) {
            addCriterion("IS_REG_DEF <=", value, "isRegDef");
            return (Criteria) this;
        }

        public Criteria andIsRegDefIn(List<Long> values) {
            addCriterion("IS_REG_DEF in", values, "isRegDef");
            return (Criteria) this;
        }

        public Criteria andIsRegDefNotIn(List<Long> values) {
            addCriterion("IS_REG_DEF not in", values, "isRegDef");
            return (Criteria) this;
        }

        public Criteria andIsRegDefBetween(Long value1, Long value2) {
            addCriterion("IS_REG_DEF between", value1, value2, "isRegDef");
            return (Criteria) this;
        }

        public Criteria andIsRegDefNotBetween(Long value1, Long value2) {
            addCriterion("IS_REG_DEF not between", value1, value2, "isRegDef");
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
package com.space.mybatis.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UcUsersFullExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UcUsersFullExample() {
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
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andFormIdIsNull() {
            addCriterion("form_id is null");
            return (Criteria) this;
        }

        public Criteria andFormIdIsNotNull() {
            addCriterion("form_id is not null");
            return (Criteria) this;
        }

        public Criteria andFormIdEqualTo(Integer value) {
            addCriterion("form_id =", value, "formId");
            return (Criteria) this;
        }

        public Criteria andFormIdNotEqualTo(Integer value) {
            addCriterion("form_id <>", value, "formId");
            return (Criteria) this;
        }

        public Criteria andFormIdGreaterThan(Integer value) {
            addCriterion("form_id >", value, "formId");
            return (Criteria) this;
        }

        public Criteria andFormIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("form_id >=", value, "formId");
            return (Criteria) this;
        }

        public Criteria andFormIdLessThan(Integer value) {
            addCriterion("form_id <", value, "formId");
            return (Criteria) this;
        }

        public Criteria andFormIdLessThanOrEqualTo(Integer value) {
            addCriterion("form_id <=", value, "formId");
            return (Criteria) this;
        }

        public Criteria andFormIdIn(List<Integer> values) {
            addCriterion("form_id in", values, "formId");
            return (Criteria) this;
        }

        public Criteria andFormIdNotIn(List<Integer> values) {
            addCriterion("form_id not in", values, "formId");
            return (Criteria) this;
        }

        public Criteria andFormIdBetween(Integer value1, Integer value2) {
            addCriterion("form_id between", value1, value2, "formId");
            return (Criteria) this;
        }

        public Criteria andFormIdNotBetween(Integer value1, Integer value2) {
            addCriterion("form_id not between", value1, value2, "formId");
            return (Criteria) this;
        }

        public Criteria andQueryAttrIsNull() {
            addCriterion("query_attr is null");
            return (Criteria) this;
        }

        public Criteria andQueryAttrIsNotNull() {
            addCriterion("query_attr is not null");
            return (Criteria) this;
        }

        public Criteria andQueryAttrEqualTo(String value) {
            addCriterion("query_attr =", value, "queryAttr");
            return (Criteria) this;
        }

        public Criteria andQueryAttrNotEqualTo(String value) {
            addCriterion("query_attr <>", value, "queryAttr");
            return (Criteria) this;
        }

        public Criteria andQueryAttrGreaterThan(String value) {
            addCriterion("query_attr >", value, "queryAttr");
            return (Criteria) this;
        }

        public Criteria andQueryAttrGreaterThanOrEqualTo(String value) {
            addCriterion("query_attr >=", value, "queryAttr");
            return (Criteria) this;
        }

        public Criteria andQueryAttrLessThan(String value) {
            addCriterion("query_attr <", value, "queryAttr");
            return (Criteria) this;
        }

        public Criteria andQueryAttrLessThanOrEqualTo(String value) {
            addCriterion("query_attr <=", value, "queryAttr");
            return (Criteria) this;
        }

        public Criteria andQueryAttrLike(String value) {
            addCriterion("query_attr like", value, "queryAttr");
            return (Criteria) this;
        }

        public Criteria andQueryAttrNotLike(String value) {
            addCriterion("query_attr not like", value, "queryAttr");
            return (Criteria) this;
        }

        public Criteria andQueryAttrIn(List<String> values) {
            addCriterion("query_attr in", values, "queryAttr");
            return (Criteria) this;
        }

        public Criteria andQueryAttrNotIn(List<String> values) {
            addCriterion("query_attr not in", values, "queryAttr");
            return (Criteria) this;
        }

        public Criteria andQueryAttrBetween(String value1, String value2) {
            addCriterion("query_attr between", value1, value2, "queryAttr");
            return (Criteria) this;
        }

        public Criteria andQueryAttrNotBetween(String value1, String value2) {
            addCriterion("query_attr not between", value1, value2, "queryAttr");
            return (Criteria) this;
        }

        public Criteria andListAttrIsNull() {
            addCriterion("list_attr is null");
            return (Criteria) this;
        }

        public Criteria andListAttrIsNotNull() {
            addCriterion("list_attr is not null");
            return (Criteria) this;
        }

        public Criteria andListAttrEqualTo(String value) {
            addCriterion("list_attr =", value, "listAttr");
            return (Criteria) this;
        }

        public Criteria andListAttrNotEqualTo(String value) {
            addCriterion("list_attr <>", value, "listAttr");
            return (Criteria) this;
        }

        public Criteria andListAttrGreaterThan(String value) {
            addCriterion("list_attr >", value, "listAttr");
            return (Criteria) this;
        }

        public Criteria andListAttrGreaterThanOrEqualTo(String value) {
            addCriterion("list_attr >=", value, "listAttr");
            return (Criteria) this;
        }

        public Criteria andListAttrLessThan(String value) {
            addCriterion("list_attr <", value, "listAttr");
            return (Criteria) this;
        }

        public Criteria andListAttrLessThanOrEqualTo(String value) {
            addCriterion("list_attr <=", value, "listAttr");
            return (Criteria) this;
        }

        public Criteria andListAttrLike(String value) {
            addCriterion("list_attr like", value, "listAttr");
            return (Criteria) this;
        }

        public Criteria andListAttrNotLike(String value) {
            addCriterion("list_attr not like", value, "listAttr");
            return (Criteria) this;
        }

        public Criteria andListAttrIn(List<String> values) {
            addCriterion("list_attr in", values, "listAttr");
            return (Criteria) this;
        }

        public Criteria andListAttrNotIn(List<String> values) {
            addCriterion("list_attr not in", values, "listAttr");
            return (Criteria) this;
        }

        public Criteria andListAttrBetween(String value1, String value2) {
            addCriterion("list_attr between", value1, value2, "listAttr");
            return (Criteria) this;
        }

        public Criteria andListAttrNotBetween(String value1, String value2) {
            addCriterion("list_attr not between", value1, value2, "listAttr");
            return (Criteria) this;
        }

        public Criteria andLoginAttrIsNull() {
            addCriterion("login_attr is null");
            return (Criteria) this;
        }

        public Criteria andLoginAttrIsNotNull() {
            addCriterion("login_attr is not null");
            return (Criteria) this;
        }

        public Criteria andLoginAttrEqualTo(String value) {
            addCriterion("login_attr =", value, "loginAttr");
            return (Criteria) this;
        }

        public Criteria andLoginAttrNotEqualTo(String value) {
            addCriterion("login_attr <>", value, "loginAttr");
            return (Criteria) this;
        }

        public Criteria andLoginAttrGreaterThan(String value) {
            addCriterion("login_attr >", value, "loginAttr");
            return (Criteria) this;
        }

        public Criteria andLoginAttrGreaterThanOrEqualTo(String value) {
            addCriterion("login_attr >=", value, "loginAttr");
            return (Criteria) this;
        }

        public Criteria andLoginAttrLessThan(String value) {
            addCriterion("login_attr <", value, "loginAttr");
            return (Criteria) this;
        }

        public Criteria andLoginAttrLessThanOrEqualTo(String value) {
            addCriterion("login_attr <=", value, "loginAttr");
            return (Criteria) this;
        }

        public Criteria andLoginAttrLike(String value) {
            addCriterion("login_attr like", value, "loginAttr");
            return (Criteria) this;
        }

        public Criteria andLoginAttrNotLike(String value) {
            addCriterion("login_attr not like", value, "loginAttr");
            return (Criteria) this;
        }

        public Criteria andLoginAttrIn(List<String> values) {
            addCriterion("login_attr in", values, "loginAttr");
            return (Criteria) this;
        }

        public Criteria andLoginAttrNotIn(List<String> values) {
            addCriterion("login_attr not in", values, "loginAttr");
            return (Criteria) this;
        }

        public Criteria andLoginAttrBetween(String value1, String value2) {
            addCriterion("login_attr between", value1, value2, "loginAttr");
            return (Criteria) this;
        }

        public Criteria andLoginAttrNotBetween(String value1, String value2) {
            addCriterion("login_attr not between", value1, value2, "loginAttr");
            return (Criteria) this;
        }

        public Criteria andInterfaceQueryAttrIsNull() {
            addCriterion("interface_query_attr is null");
            return (Criteria) this;
        }

        public Criteria andInterfaceQueryAttrIsNotNull() {
            addCriterion("interface_query_attr is not null");
            return (Criteria) this;
        }

        public Criteria andInterfaceQueryAttrEqualTo(String value) {
            addCriterion("interface_query_attr =", value, "interfaceQueryAttr");
            return (Criteria) this;
        }

        public Criteria andInterfaceQueryAttrNotEqualTo(String value) {
            addCriterion("interface_query_attr <>", value, "interfaceQueryAttr");
            return (Criteria) this;
        }

        public Criteria andInterfaceQueryAttrGreaterThan(String value) {
            addCriterion("interface_query_attr >", value, "interfaceQueryAttr");
            return (Criteria) this;
        }

        public Criteria andInterfaceQueryAttrGreaterThanOrEqualTo(String value) {
            addCriterion("interface_query_attr >=", value, "interfaceQueryAttr");
            return (Criteria) this;
        }

        public Criteria andInterfaceQueryAttrLessThan(String value) {
            addCriterion("interface_query_attr <", value, "interfaceQueryAttr");
            return (Criteria) this;
        }

        public Criteria andInterfaceQueryAttrLessThanOrEqualTo(String value) {
            addCriterion("interface_query_attr <=", value, "interfaceQueryAttr");
            return (Criteria) this;
        }

        public Criteria andInterfaceQueryAttrLike(String value) {
            addCriterion("interface_query_attr like", value, "interfaceQueryAttr");
            return (Criteria) this;
        }

        public Criteria andInterfaceQueryAttrNotLike(String value) {
            addCriterion("interface_query_attr not like", value, "interfaceQueryAttr");
            return (Criteria) this;
        }

        public Criteria andInterfaceQueryAttrIn(List<String> values) {
            addCriterion("interface_query_attr in", values, "interfaceQueryAttr");
            return (Criteria) this;
        }

        public Criteria andInterfaceQueryAttrNotIn(List<String> values) {
            addCriterion("interface_query_attr not in", values, "interfaceQueryAttr");
            return (Criteria) this;
        }

        public Criteria andInterfaceQueryAttrBetween(String value1, String value2) {
            addCriterion("interface_query_attr between", value1, value2, "interfaceQueryAttr");
            return (Criteria) this;
        }

        public Criteria andInterfaceQueryAttrNotBetween(String value1, String value2) {
            addCriterion("interface_query_attr not between", value1, value2, "interfaceQueryAttr");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Byte value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Byte value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Byte value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Byte value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Byte value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Byte> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Byte> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Byte value1, Byte value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andAuditRemarkIsNull() {
            addCriterion("audit_remark is null");
            return (Criteria) this;
        }

        public Criteria andAuditRemarkIsNotNull() {
            addCriterion("audit_remark is not null");
            return (Criteria) this;
        }

        public Criteria andAuditRemarkEqualTo(String value) {
            addCriterion("audit_remark =", value, "auditRemark");
            return (Criteria) this;
        }

        public Criteria andAuditRemarkNotEqualTo(String value) {
            addCriterion("audit_remark <>", value, "auditRemark");
            return (Criteria) this;
        }

        public Criteria andAuditRemarkGreaterThan(String value) {
            addCriterion("audit_remark >", value, "auditRemark");
            return (Criteria) this;
        }

        public Criteria andAuditRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("audit_remark >=", value, "auditRemark");
            return (Criteria) this;
        }

        public Criteria andAuditRemarkLessThan(String value) {
            addCriterion("audit_remark <", value, "auditRemark");
            return (Criteria) this;
        }

        public Criteria andAuditRemarkLessThanOrEqualTo(String value) {
            addCriterion("audit_remark <=", value, "auditRemark");
            return (Criteria) this;
        }

        public Criteria andAuditRemarkLike(String value) {
            addCriterion("audit_remark like", value, "auditRemark");
            return (Criteria) this;
        }

        public Criteria andAuditRemarkNotLike(String value) {
            addCriterion("audit_remark not like", value, "auditRemark");
            return (Criteria) this;
        }

        public Criteria andAuditRemarkIn(List<String> values) {
            addCriterion("audit_remark in", values, "auditRemark");
            return (Criteria) this;
        }

        public Criteria andAuditRemarkNotIn(List<String> values) {
            addCriterion("audit_remark not in", values, "auditRemark");
            return (Criteria) this;
        }

        public Criteria andAuditRemarkBetween(String value1, String value2) {
            addCriterion("audit_remark between", value1, value2, "auditRemark");
            return (Criteria) this;
        }

        public Criteria andAuditRemarkNotBetween(String value1, String value2) {
            addCriterion("audit_remark not between", value1, value2, "auditRemark");
            return (Criteria) this;
        }

        public Criteria andGmtAuditIsNull() {
            addCriterion("gmt_audit is null");
            return (Criteria) this;
        }

        public Criteria andGmtAuditIsNotNull() {
            addCriterion("gmt_audit is not null");
            return (Criteria) this;
        }

        public Criteria andGmtAuditEqualTo(Date value) {
            addCriterion("gmt_audit =", value, "gmtAudit");
            return (Criteria) this;
        }

        public Criteria andGmtAuditNotEqualTo(Date value) {
            addCriterion("gmt_audit <>", value, "gmtAudit");
            return (Criteria) this;
        }

        public Criteria andGmtAuditGreaterThan(Date value) {
            addCriterion("gmt_audit >", value, "gmtAudit");
            return (Criteria) this;
        }

        public Criteria andGmtAuditGreaterThanOrEqualTo(Date value) {
            addCriterion("gmt_audit >=", value, "gmtAudit");
            return (Criteria) this;
        }

        public Criteria andGmtAuditLessThan(Date value) {
            addCriterion("gmt_audit <", value, "gmtAudit");
            return (Criteria) this;
        }

        public Criteria andGmtAuditLessThanOrEqualTo(Date value) {
            addCriterion("gmt_audit <=", value, "gmtAudit");
            return (Criteria) this;
        }

        public Criteria andGmtAuditIn(List<Date> values) {
            addCriterion("gmt_audit in", values, "gmtAudit");
            return (Criteria) this;
        }

        public Criteria andGmtAuditNotIn(List<Date> values) {
            addCriterion("gmt_audit not in", values, "gmtAudit");
            return (Criteria) this;
        }

        public Criteria andGmtAuditBetween(Date value1, Date value2) {
            addCriterion("gmt_audit between", value1, value2, "gmtAudit");
            return (Criteria) this;
        }

        public Criteria andGmtAuditNotBetween(Date value1, Date value2) {
            addCriterion("gmt_audit not between", value1, value2, "gmtAudit");
            return (Criteria) this;
        }

        public Criteria andLastLoginIpIsNull() {
            addCriterion("last_login_ip is null");
            return (Criteria) this;
        }

        public Criteria andLastLoginIpIsNotNull() {
            addCriterion("last_login_ip is not null");
            return (Criteria) this;
        }

        public Criteria andLastLoginIpEqualTo(String value) {
            addCriterion("last_login_ip =", value, "lastLoginIp");
            return (Criteria) this;
        }

        public Criteria andLastLoginIpNotEqualTo(String value) {
            addCriterion("last_login_ip <>", value, "lastLoginIp");
            return (Criteria) this;
        }

        public Criteria andLastLoginIpGreaterThan(String value) {
            addCriterion("last_login_ip >", value, "lastLoginIp");
            return (Criteria) this;
        }

        public Criteria andLastLoginIpGreaterThanOrEqualTo(String value) {
            addCriterion("last_login_ip >=", value, "lastLoginIp");
            return (Criteria) this;
        }

        public Criteria andLastLoginIpLessThan(String value) {
            addCriterion("last_login_ip <", value, "lastLoginIp");
            return (Criteria) this;
        }

        public Criteria andLastLoginIpLessThanOrEqualTo(String value) {
            addCriterion("last_login_ip <=", value, "lastLoginIp");
            return (Criteria) this;
        }

        public Criteria andLastLoginIpLike(String value) {
            addCriterion("last_login_ip like", value, "lastLoginIp");
            return (Criteria) this;
        }

        public Criteria andLastLoginIpNotLike(String value) {
            addCriterion("last_login_ip not like", value, "lastLoginIp");
            return (Criteria) this;
        }

        public Criteria andLastLoginIpIn(List<String> values) {
            addCriterion("last_login_ip in", values, "lastLoginIp");
            return (Criteria) this;
        }

        public Criteria andLastLoginIpNotIn(List<String> values) {
            addCriterion("last_login_ip not in", values, "lastLoginIp");
            return (Criteria) this;
        }

        public Criteria andLastLoginIpBetween(String value1, String value2) {
            addCriterion("last_login_ip between", value1, value2, "lastLoginIp");
            return (Criteria) this;
        }

        public Criteria andLastLoginIpNotBetween(String value1, String value2) {
            addCriterion("last_login_ip not between", value1, value2, "lastLoginIp");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeIsNull() {
            addCriterion("last_login_time is null");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeIsNotNull() {
            addCriterion("last_login_time is not null");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeEqualTo(Date value) {
            addCriterion("last_login_time =", value, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeNotEqualTo(Date value) {
            addCriterion("last_login_time <>", value, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeGreaterThan(Date value) {
            addCriterion("last_login_time >", value, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("last_login_time >=", value, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeLessThan(Date value) {
            addCriterion("last_login_time <", value, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeLessThanOrEqualTo(Date value) {
            addCriterion("last_login_time <=", value, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeIn(List<Date> values) {
            addCriterion("last_login_time in", values, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeNotIn(List<Date> values) {
            addCriterion("last_login_time not in", values, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeBetween(Date value1, Date value2) {
            addCriterion("last_login_time between", value1, value2, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeNotBetween(Date value1, Date value2) {
            addCriterion("last_login_time not between", value1, value2, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andRegSourceIsNull() {
            addCriterion("reg_source is null");
            return (Criteria) this;
        }

        public Criteria andRegSourceIsNotNull() {
            addCriterion("reg_source is not null");
            return (Criteria) this;
        }

        public Criteria andRegSourceEqualTo(Byte value) {
            addCriterion("reg_source =", value, "regSource");
            return (Criteria) this;
        }

        public Criteria andRegSourceNotEqualTo(Byte value) {
            addCriterion("reg_source <>", value, "regSource");
            return (Criteria) this;
        }

        public Criteria andRegSourceGreaterThan(Byte value) {
            addCriterion("reg_source >", value, "regSource");
            return (Criteria) this;
        }

        public Criteria andRegSourceGreaterThanOrEqualTo(Byte value) {
            addCriterion("reg_source >=", value, "regSource");
            return (Criteria) this;
        }

        public Criteria andRegSourceLessThan(Byte value) {
            addCriterion("reg_source <", value, "regSource");
            return (Criteria) this;
        }

        public Criteria andRegSourceLessThanOrEqualTo(Byte value) {
            addCriterion("reg_source <=", value, "regSource");
            return (Criteria) this;
        }

        public Criteria andRegSourceIn(List<Byte> values) {
            addCriterion("reg_source in", values, "regSource");
            return (Criteria) this;
        }

        public Criteria andRegSourceNotIn(List<Byte> values) {
            addCriterion("reg_source not in", values, "regSource");
            return (Criteria) this;
        }

        public Criteria andRegSourceBetween(Byte value1, Byte value2) {
            addCriterion("reg_source between", value1, value2, "regSource");
            return (Criteria) this;
        }

        public Criteria andRegSourceNotBetween(Byte value1, Byte value2) {
            addCriterion("reg_source not between", value1, value2, "regSource");
            return (Criteria) this;
        }

        public Criteria andInfoApplyIsNull() {
            addCriterion("info_apply is null");
            return (Criteria) this;
        }

        public Criteria andInfoApplyIsNotNull() {
            addCriterion("info_apply is not null");
            return (Criteria) this;
        }

        public Criteria andInfoApplyEqualTo(String value) {
            addCriterion("info_apply =", value, "infoApply");
            return (Criteria) this;
        }

        public Criteria andInfoApplyNotEqualTo(String value) {
            addCriterion("info_apply <>", value, "infoApply");
            return (Criteria) this;
        }

        public Criteria andInfoApplyGreaterThan(String value) {
            addCriterion("info_apply >", value, "infoApply");
            return (Criteria) this;
        }

        public Criteria andInfoApplyGreaterThanOrEqualTo(String value) {
            addCriterion("info_apply >=", value, "infoApply");
            return (Criteria) this;
        }

        public Criteria andInfoApplyLessThan(String value) {
            addCriterion("info_apply <", value, "infoApply");
            return (Criteria) this;
        }

        public Criteria andInfoApplyLessThanOrEqualTo(String value) {
            addCriterion("info_apply <=", value, "infoApply");
            return (Criteria) this;
        }

        public Criteria andInfoApplyLike(String value) {
            addCriterion("info_apply like", value, "infoApply");
            return (Criteria) this;
        }

        public Criteria andInfoApplyNotLike(String value) {
            addCriterion("info_apply not like", value, "infoApply");
            return (Criteria) this;
        }

        public Criteria andInfoApplyIn(List<String> values) {
            addCriterion("info_apply in", values, "infoApply");
            return (Criteria) this;
        }

        public Criteria andInfoApplyNotIn(List<String> values) {
            addCriterion("info_apply not in", values, "infoApply");
            return (Criteria) this;
        }

        public Criteria andInfoApplyBetween(String value1, String value2) {
            addCriterion("info_apply between", value1, value2, "infoApply");
            return (Criteria) this;
        }

        public Criteria andInfoApplyNotBetween(String value1, String value2) {
            addCriterion("info_apply not between", value1, value2, "infoApply");
            return (Criteria) this;
        }

        public Criteria andParentIdIsNull() {
            addCriterion("parent_id is null");
            return (Criteria) this;
        }

        public Criteria andParentIdIsNotNull() {
            addCriterion("parent_id is not null");
            return (Criteria) this;
        }

        public Criteria andParentIdEqualTo(Integer value) {
            addCriterion("parent_id =", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdNotEqualTo(Integer value) {
            addCriterion("parent_id <>", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdGreaterThan(Integer value) {
            addCriterion("parent_id >", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("parent_id >=", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdLessThan(Integer value) {
            addCriterion("parent_id <", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdLessThanOrEqualTo(Integer value) {
            addCriterion("parent_id <=", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdIn(List<Integer> values) {
            addCriterion("parent_id in", values, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdNotIn(List<Integer> values) {
            addCriterion("parent_id not in", values, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdBetween(Integer value1, Integer value2) {
            addCriterion("parent_id between", value1, value2, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdNotBetween(Integer value1, Integer value2) {
            addCriterion("parent_id not between", value1, value2, "parentId");
            return (Criteria) this;
        }

        public Criteria andIsDeletedIsNull() {
            addCriterion("is_deleted is null");
            return (Criteria) this;
        }

        public Criteria andIsDeletedIsNotNull() {
            addCriterion("is_deleted is not null");
            return (Criteria) this;
        }

        public Criteria andIsDeletedEqualTo(String value) {
            addCriterion("is_deleted =", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedNotEqualTo(String value) {
            addCriterion("is_deleted <>", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedGreaterThan(String value) {
            addCriterion("is_deleted >", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedGreaterThanOrEqualTo(String value) {
            addCriterion("is_deleted >=", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedLessThan(String value) {
            addCriterion("is_deleted <", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedLessThanOrEqualTo(String value) {
            addCriterion("is_deleted <=", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedLike(String value) {
            addCriterion("is_deleted like", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedNotLike(String value) {
            addCriterion("is_deleted not like", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedIn(List<String> values) {
            addCriterion("is_deleted in", values, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedNotIn(List<String> values) {
            addCriterion("is_deleted not in", values, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedBetween(String value1, String value2) {
            addCriterion("is_deleted between", value1, value2, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedNotBetween(String value1, String value2) {
            addCriterion("is_deleted not between", value1, value2, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andCreatorIdIsNull() {
            addCriterion("creator_id is null");
            return (Criteria) this;
        }

        public Criteria andCreatorIdIsNotNull() {
            addCriterion("creator_id is not null");
            return (Criteria) this;
        }

        public Criteria andCreatorIdEqualTo(Integer value) {
            addCriterion("creator_id =", value, "creatorId");
            return (Criteria) this;
        }

        public Criteria andCreatorIdNotEqualTo(Integer value) {
            addCriterion("creator_id <>", value, "creatorId");
            return (Criteria) this;
        }

        public Criteria andCreatorIdGreaterThan(Integer value) {
            addCriterion("creator_id >", value, "creatorId");
            return (Criteria) this;
        }

        public Criteria andCreatorIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("creator_id >=", value, "creatorId");
            return (Criteria) this;
        }

        public Criteria andCreatorIdLessThan(Integer value) {
            addCriterion("creator_id <", value, "creatorId");
            return (Criteria) this;
        }

        public Criteria andCreatorIdLessThanOrEqualTo(Integer value) {
            addCriterion("creator_id <=", value, "creatorId");
            return (Criteria) this;
        }

        public Criteria andCreatorIdIn(List<Integer> values) {
            addCriterion("creator_id in", values, "creatorId");
            return (Criteria) this;
        }

        public Criteria andCreatorIdNotIn(List<Integer> values) {
            addCriterion("creator_id not in", values, "creatorId");
            return (Criteria) this;
        }

        public Criteria andCreatorIdBetween(Integer value1, Integer value2) {
            addCriterion("creator_id between", value1, value2, "creatorId");
            return (Criteria) this;
        }

        public Criteria andCreatorIdNotBetween(Integer value1, Integer value2) {
            addCriterion("creator_id not between", value1, value2, "creatorId");
            return (Criteria) this;
        }

        public Criteria andRootUserIdIsNull() {
            addCriterion("root_user_id is null");
            return (Criteria) this;
        }

        public Criteria andRootUserIdIsNotNull() {
            addCriterion("root_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andRootUserIdEqualTo(Integer value) {
            addCriterion("root_user_id =", value, "rootUserId");
            return (Criteria) this;
        }

        public Criteria andRootUserIdNotEqualTo(Integer value) {
            addCriterion("root_user_id <>", value, "rootUserId");
            return (Criteria) this;
        }

        public Criteria andRootUserIdGreaterThan(Integer value) {
            addCriterion("root_user_id >", value, "rootUserId");
            return (Criteria) this;
        }

        public Criteria andRootUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("root_user_id >=", value, "rootUserId");
            return (Criteria) this;
        }

        public Criteria andRootUserIdLessThan(Integer value) {
            addCriterion("root_user_id <", value, "rootUserId");
            return (Criteria) this;
        }

        public Criteria andRootUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("root_user_id <=", value, "rootUserId");
            return (Criteria) this;
        }

        public Criteria andRootUserIdIn(List<Integer> values) {
            addCriterion("root_user_id in", values, "rootUserId");
            return (Criteria) this;
        }

        public Criteria andRootUserIdNotIn(List<Integer> values) {
            addCriterion("root_user_id not in", values, "rootUserId");
            return (Criteria) this;
        }

        public Criteria andRootUserIdBetween(Integer value1, Integer value2) {
            addCriterion("root_user_id between", value1, value2, "rootUserId");
            return (Criteria) this;
        }

        public Criteria andRootUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("root_user_id not between", value1, value2, "rootUserId");
            return (Criteria) this;
        }

        public Criteria andAccountIsNull() {
            addCriterion("account is null");
            return (Criteria) this;
        }

        public Criteria andAccountIsNotNull() {
            addCriterion("account is not null");
            return (Criteria) this;
        }

        public Criteria andAccountEqualTo(String value) {
            addCriterion("account =", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountNotEqualTo(String value) {
            addCriterion("account <>", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountGreaterThan(String value) {
            addCriterion("account >", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountGreaterThanOrEqualTo(String value) {
            addCriterion("account >=", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountLessThan(String value) {
            addCriterion("account <", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountLessThanOrEqualTo(String value) {
            addCriterion("account <=", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountLike(String value) {
            addCriterion("account like", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountNotLike(String value) {
            addCriterion("account not like", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountIn(List<String> values) {
            addCriterion("account in", values, "account");
            return (Criteria) this;
        }

        public Criteria andAccountNotIn(List<String> values) {
            addCriterion("account not in", values, "account");
            return (Criteria) this;
        }

        public Criteria andAccountBetween(String value1, String value2) {
            addCriterion("account between", value1, value2, "account");
            return (Criteria) this;
        }

        public Criteria andAccountNotBetween(String value1, String value2) {
            addCriterion("account not between", value1, value2, "account");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andLoginPwdIsNull() {
            addCriterion("login_pwd is null");
            return (Criteria) this;
        }

        public Criteria andLoginPwdIsNotNull() {
            addCriterion("login_pwd is not null");
            return (Criteria) this;
        }

        public Criteria andLoginPwdEqualTo(String value) {
            addCriterion("login_pwd =", value, "loginPwd");
            return (Criteria) this;
        }

        public Criteria andLoginPwdNotEqualTo(String value) {
            addCriterion("login_pwd <>", value, "loginPwd");
            return (Criteria) this;
        }

        public Criteria andLoginPwdGreaterThan(String value) {
            addCriterion("login_pwd >", value, "loginPwd");
            return (Criteria) this;
        }

        public Criteria andLoginPwdGreaterThanOrEqualTo(String value) {
            addCriterion("login_pwd >=", value, "loginPwd");
            return (Criteria) this;
        }

        public Criteria andLoginPwdLessThan(String value) {
            addCriterion("login_pwd <", value, "loginPwd");
            return (Criteria) this;
        }

        public Criteria andLoginPwdLessThanOrEqualTo(String value) {
            addCriterion("login_pwd <=", value, "loginPwd");
            return (Criteria) this;
        }

        public Criteria andLoginPwdLike(String value) {
            addCriterion("login_pwd like", value, "loginPwd");
            return (Criteria) this;
        }

        public Criteria andLoginPwdNotLike(String value) {
            addCriterion("login_pwd not like", value, "loginPwd");
            return (Criteria) this;
        }

        public Criteria andLoginPwdIn(List<String> values) {
            addCriterion("login_pwd in", values, "loginPwd");
            return (Criteria) this;
        }

        public Criteria andLoginPwdNotIn(List<String> values) {
            addCriterion("login_pwd not in", values, "loginPwd");
            return (Criteria) this;
        }

        public Criteria andLoginPwdBetween(String value1, String value2) {
            addCriterion("login_pwd between", value1, value2, "loginPwd");
            return (Criteria) this;
        }

        public Criteria andLoginPwdNotBetween(String value1, String value2) {
            addCriterion("login_pwd not between", value1, value2, "loginPwd");
            return (Criteria) this;
        }

        public Criteria andPayPwdIsNull() {
            addCriterion("pay_pwd is null");
            return (Criteria) this;
        }

        public Criteria andPayPwdIsNotNull() {
            addCriterion("pay_pwd is not null");
            return (Criteria) this;
        }

        public Criteria andPayPwdEqualTo(String value) {
            addCriterion("pay_pwd =", value, "payPwd");
            return (Criteria) this;
        }

        public Criteria andPayPwdNotEqualTo(String value) {
            addCriterion("pay_pwd <>", value, "payPwd");
            return (Criteria) this;
        }

        public Criteria andPayPwdGreaterThan(String value) {
            addCriterion("pay_pwd >", value, "payPwd");
            return (Criteria) this;
        }

        public Criteria andPayPwdGreaterThanOrEqualTo(String value) {
            addCriterion("pay_pwd >=", value, "payPwd");
            return (Criteria) this;
        }

        public Criteria andPayPwdLessThan(String value) {
            addCriterion("pay_pwd <", value, "payPwd");
            return (Criteria) this;
        }

        public Criteria andPayPwdLessThanOrEqualTo(String value) {
            addCriterion("pay_pwd <=", value, "payPwd");
            return (Criteria) this;
        }

        public Criteria andPayPwdLike(String value) {
            addCriterion("pay_pwd like", value, "payPwd");
            return (Criteria) this;
        }

        public Criteria andPayPwdNotLike(String value) {
            addCriterion("pay_pwd not like", value, "payPwd");
            return (Criteria) this;
        }

        public Criteria andPayPwdIn(List<String> values) {
            addCriterion("pay_pwd in", values, "payPwd");
            return (Criteria) this;
        }

        public Criteria andPayPwdNotIn(List<String> values) {
            addCriterion("pay_pwd not in", values, "payPwd");
            return (Criteria) this;
        }

        public Criteria andPayPwdBetween(String value1, String value2) {
            addCriterion("pay_pwd between", value1, value2, "payPwd");
            return (Criteria) this;
        }

        public Criteria andPayPwdNotBetween(String value1, String value2) {
            addCriterion("pay_pwd not between", value1, value2, "payPwd");
            return (Criteria) this;
        }

        public Criteria andLoginNumIsNull() {
            addCriterion("login_num is null");
            return (Criteria) this;
        }

        public Criteria andLoginNumIsNotNull() {
            addCriterion("login_num is not null");
            return (Criteria) this;
        }

        public Criteria andLoginNumEqualTo(Integer value) {
            addCriterion("login_num =", value, "loginNum");
            return (Criteria) this;
        }

        public Criteria andLoginNumNotEqualTo(Integer value) {
            addCriterion("login_num <>", value, "loginNum");
            return (Criteria) this;
        }

        public Criteria andLoginNumGreaterThan(Integer value) {
            addCriterion("login_num >", value, "loginNum");
            return (Criteria) this;
        }

        public Criteria andLoginNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("login_num >=", value, "loginNum");
            return (Criteria) this;
        }

        public Criteria andLoginNumLessThan(Integer value) {
            addCriterion("login_num <", value, "loginNum");
            return (Criteria) this;
        }

        public Criteria andLoginNumLessThanOrEqualTo(Integer value) {
            addCriterion("login_num <=", value, "loginNum");
            return (Criteria) this;
        }

        public Criteria andLoginNumIn(List<Integer> values) {
            addCriterion("login_num in", values, "loginNum");
            return (Criteria) this;
        }

        public Criteria andLoginNumNotIn(List<Integer> values) {
            addCriterion("login_num not in", values, "loginNum");
            return (Criteria) this;
        }

        public Criteria andLoginNumBetween(Integer value1, Integer value2) {
            addCriterion("login_num between", value1, value2, "loginNum");
            return (Criteria) this;
        }

        public Criteria andLoginNumNotBetween(Integer value1, Integer value2) {
            addCriterion("login_num not between", value1, value2, "loginNum");
            return (Criteria) this;
        }

        public Criteria andLoginFailedTimesIsNull() {
            addCriterion("login_failed_times is null");
            return (Criteria) this;
        }

        public Criteria andLoginFailedTimesIsNotNull() {
            addCriterion("login_failed_times is not null");
            return (Criteria) this;
        }

        public Criteria andLoginFailedTimesEqualTo(Integer value) {
            addCriterion("login_failed_times =", value, "loginFailedTimes");
            return (Criteria) this;
        }

        public Criteria andLoginFailedTimesNotEqualTo(Integer value) {
            addCriterion("login_failed_times <>", value, "loginFailedTimes");
            return (Criteria) this;
        }

        public Criteria andLoginFailedTimesGreaterThan(Integer value) {
            addCriterion("login_failed_times >", value, "loginFailedTimes");
            return (Criteria) this;
        }

        public Criteria andLoginFailedTimesGreaterThanOrEqualTo(Integer value) {
            addCriterion("login_failed_times >=", value, "loginFailedTimes");
            return (Criteria) this;
        }

        public Criteria andLoginFailedTimesLessThan(Integer value) {
            addCriterion("login_failed_times <", value, "loginFailedTimes");
            return (Criteria) this;
        }

        public Criteria andLoginFailedTimesLessThanOrEqualTo(Integer value) {
            addCriterion("login_failed_times <=", value, "loginFailedTimes");
            return (Criteria) this;
        }

        public Criteria andLoginFailedTimesIn(List<Integer> values) {
            addCriterion("login_failed_times in", values, "loginFailedTimes");
            return (Criteria) this;
        }

        public Criteria andLoginFailedTimesNotIn(List<Integer> values) {
            addCriterion("login_failed_times not in", values, "loginFailedTimes");
            return (Criteria) this;
        }

        public Criteria andLoginFailedTimesBetween(Integer value1, Integer value2) {
            addCriterion("login_failed_times between", value1, value2, "loginFailedTimes");
            return (Criteria) this;
        }

        public Criteria andLoginFailedTimesNotBetween(Integer value1, Integer value2) {
            addCriterion("login_failed_times not between", value1, value2, "loginFailedTimes");
            return (Criteria) this;
        }

        public Criteria andUserRolesIsNull() {
            addCriterion("user_roles is null");
            return (Criteria) this;
        }

        public Criteria andUserRolesIsNotNull() {
            addCriterion("user_roles is not null");
            return (Criteria) this;
        }

        public Criteria andUserRolesEqualTo(Integer value) {
            addCriterion("user_roles =", value, "userRoles");
            return (Criteria) this;
        }

        public Criteria andUserRolesNotEqualTo(Integer value) {
            addCriterion("user_roles <>", value, "userRoles");
            return (Criteria) this;
        }

        public Criteria andUserRolesGreaterThan(Integer value) {
            addCriterion("user_roles >", value, "userRoles");
            return (Criteria) this;
        }

        public Criteria andUserRolesGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_roles >=", value, "userRoles");
            return (Criteria) this;
        }

        public Criteria andUserRolesLessThan(Integer value) {
            addCriterion("user_roles <", value, "userRoles");
            return (Criteria) this;
        }

        public Criteria andUserRolesLessThanOrEqualTo(Integer value) {
            addCriterion("user_roles <=", value, "userRoles");
            return (Criteria) this;
        }

        public Criteria andUserRolesIn(List<Integer> values) {
            addCriterion("user_roles in", values, "userRoles");
            return (Criteria) this;
        }

        public Criteria andUserRolesNotIn(List<Integer> values) {
            addCriterion("user_roles not in", values, "userRoles");
            return (Criteria) this;
        }

        public Criteria andUserRolesBetween(Integer value1, Integer value2) {
            addCriterion("user_roles between", value1, value2, "userRoles");
            return (Criteria) this;
        }

        public Criteria andUserRolesNotBetween(Integer value1, Integer value2) {
            addCriterion("user_roles not between", value1, value2, "userRoles");
            return (Criteria) this;
        }

        public Criteria andCompanyCnIsNull() {
            addCriterion("company_cn is null");
            return (Criteria) this;
        }

        public Criteria andCompanyCnIsNotNull() {
            addCriterion("company_cn is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyCnEqualTo(String value) {
            addCriterion("company_cn =", value, "companyCn");
            return (Criteria) this;
        }

        public Criteria andCompanyCnNotEqualTo(String value) {
            addCriterion("company_cn <>", value, "companyCn");
            return (Criteria) this;
        }

        public Criteria andCompanyCnGreaterThan(String value) {
            addCriterion("company_cn >", value, "companyCn");
            return (Criteria) this;
        }

        public Criteria andCompanyCnGreaterThanOrEqualTo(String value) {
            addCriterion("company_cn >=", value, "companyCn");
            return (Criteria) this;
        }

        public Criteria andCompanyCnLessThan(String value) {
            addCriterion("company_cn <", value, "companyCn");
            return (Criteria) this;
        }

        public Criteria andCompanyCnLessThanOrEqualTo(String value) {
            addCriterion("company_cn <=", value, "companyCn");
            return (Criteria) this;
        }

        public Criteria andCompanyCnLike(String value) {
            addCriterion("company_cn like", value, "companyCn");
            return (Criteria) this;
        }

        public Criteria andCompanyCnNotLike(String value) {
            addCriterion("company_cn not like", value, "companyCn");
            return (Criteria) this;
        }

        public Criteria andCompanyCnIn(List<String> values) {
            addCriterion("company_cn in", values, "companyCn");
            return (Criteria) this;
        }

        public Criteria andCompanyCnNotIn(List<String> values) {
            addCriterion("company_cn not in", values, "companyCn");
            return (Criteria) this;
        }

        public Criteria andCompanyCnBetween(String value1, String value2) {
            addCriterion("company_cn between", value1, value2, "companyCn");
            return (Criteria) this;
        }

        public Criteria andCompanyCnNotBetween(String value1, String value2) {
            addCriterion("company_cn not between", value1, value2, "companyCn");
            return (Criteria) this;
        }

        public Criteria andCompanyCnShortIsNull() {
            addCriterion("company_cn_short is null");
            return (Criteria) this;
        }

        public Criteria andCompanyCnShortIsNotNull() {
            addCriterion("company_cn_short is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyCnShortEqualTo(String value) {
            addCriterion("company_cn_short =", value, "companyCnShort");
            return (Criteria) this;
        }

        public Criteria andCompanyCnShortNotEqualTo(String value) {
            addCriterion("company_cn_short <>", value, "companyCnShort");
            return (Criteria) this;
        }

        public Criteria andCompanyCnShortGreaterThan(String value) {
            addCriterion("company_cn_short >", value, "companyCnShort");
            return (Criteria) this;
        }

        public Criteria andCompanyCnShortGreaterThanOrEqualTo(String value) {
            addCriterion("company_cn_short >=", value, "companyCnShort");
            return (Criteria) this;
        }

        public Criteria andCompanyCnShortLessThan(String value) {
            addCriterion("company_cn_short <", value, "companyCnShort");
            return (Criteria) this;
        }

        public Criteria andCompanyCnShortLessThanOrEqualTo(String value) {
            addCriterion("company_cn_short <=", value, "companyCnShort");
            return (Criteria) this;
        }

        public Criteria andCompanyCnShortLike(String value) {
            addCriterion("company_cn_short like", value, "companyCnShort");
            return (Criteria) this;
        }

        public Criteria andCompanyCnShortNotLike(String value) {
            addCriterion("company_cn_short not like", value, "companyCnShort");
            return (Criteria) this;
        }

        public Criteria andCompanyCnShortIn(List<String> values) {
            addCriterion("company_cn_short in", values, "companyCnShort");
            return (Criteria) this;
        }

        public Criteria andCompanyCnShortNotIn(List<String> values) {
            addCriterion("company_cn_short not in", values, "companyCnShort");
            return (Criteria) this;
        }

        public Criteria andCompanyCnShortBetween(String value1, String value2) {
            addCriterion("company_cn_short between", value1, value2, "companyCnShort");
            return (Criteria) this;
        }

        public Criteria andCompanyCnShortNotBetween(String value1, String value2) {
            addCriterion("company_cn_short not between", value1, value2, "companyCnShort");
            return (Criteria) this;
        }

        public Criteria andCompanyEnIsNull() {
            addCriterion("company_en is null");
            return (Criteria) this;
        }

        public Criteria andCompanyEnIsNotNull() {
            addCriterion("company_en is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyEnEqualTo(String value) {
            addCriterion("company_en =", value, "companyEn");
            return (Criteria) this;
        }

        public Criteria andCompanyEnNotEqualTo(String value) {
            addCriterion("company_en <>", value, "companyEn");
            return (Criteria) this;
        }

        public Criteria andCompanyEnGreaterThan(String value) {
            addCriterion("company_en >", value, "companyEn");
            return (Criteria) this;
        }

        public Criteria andCompanyEnGreaterThanOrEqualTo(String value) {
            addCriterion("company_en >=", value, "companyEn");
            return (Criteria) this;
        }

        public Criteria andCompanyEnLessThan(String value) {
            addCriterion("company_en <", value, "companyEn");
            return (Criteria) this;
        }

        public Criteria andCompanyEnLessThanOrEqualTo(String value) {
            addCriterion("company_en <=", value, "companyEn");
            return (Criteria) this;
        }

        public Criteria andCompanyEnLike(String value) {
            addCriterion("company_en like", value, "companyEn");
            return (Criteria) this;
        }

        public Criteria andCompanyEnNotLike(String value) {
            addCriterion("company_en not like", value, "companyEn");
            return (Criteria) this;
        }

        public Criteria andCompanyEnIn(List<String> values) {
            addCriterion("company_en in", values, "companyEn");
            return (Criteria) this;
        }

        public Criteria andCompanyEnNotIn(List<String> values) {
            addCriterion("company_en not in", values, "companyEn");
            return (Criteria) this;
        }

        public Criteria andCompanyEnBetween(String value1, String value2) {
            addCriterion("company_en between", value1, value2, "companyEn");
            return (Criteria) this;
        }

        public Criteria andCompanyEnNotBetween(String value1, String value2) {
            addCriterion("company_en not between", value1, value2, "companyEn");
            return (Criteria) this;
        }

        public Criteria andCompanyCodeIsNull() {
            addCriterion("company_code is null");
            return (Criteria) this;
        }

        public Criteria andCompanyCodeIsNotNull() {
            addCriterion("company_code is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyCodeEqualTo(String value) {
            addCriterion("company_code =", value, "companyCode");
            return (Criteria) this;
        }

        public Criteria andCompanyCodeNotEqualTo(String value) {
            addCriterion("company_code <>", value, "companyCode");
            return (Criteria) this;
        }

        public Criteria andCompanyCodeGreaterThan(String value) {
            addCriterion("company_code >", value, "companyCode");
            return (Criteria) this;
        }

        public Criteria andCompanyCodeGreaterThanOrEqualTo(String value) {
            addCriterion("company_code >=", value, "companyCode");
            return (Criteria) this;
        }

        public Criteria andCompanyCodeLessThan(String value) {
            addCriterion("company_code <", value, "companyCode");
            return (Criteria) this;
        }

        public Criteria andCompanyCodeLessThanOrEqualTo(String value) {
            addCriterion("company_code <=", value, "companyCode");
            return (Criteria) this;
        }

        public Criteria andCompanyCodeLike(String value) {
            addCriterion("company_code like", value, "companyCode");
            return (Criteria) this;
        }

        public Criteria andCompanyCodeNotLike(String value) {
            addCriterion("company_code not like", value, "companyCode");
            return (Criteria) this;
        }

        public Criteria andCompanyCodeIn(List<String> values) {
            addCriterion("company_code in", values, "companyCode");
            return (Criteria) this;
        }

        public Criteria andCompanyCodeNotIn(List<String> values) {
            addCriterion("company_code not in", values, "companyCode");
            return (Criteria) this;
        }

        public Criteria andCompanyCodeBetween(String value1, String value2) {
            addCriterion("company_code between", value1, value2, "companyCode");
            return (Criteria) this;
        }

        public Criteria andCompanyCodeNotBetween(String value1, String value2) {
            addCriterion("company_code not between", value1, value2, "companyCode");
            return (Criteria) this;
        }

        public Criteria andFundAccountIsNull() {
            addCriterion("fund_account is null");
            return (Criteria) this;
        }

        public Criteria andFundAccountIsNotNull() {
            addCriterion("fund_account is not null");
            return (Criteria) this;
        }

        public Criteria andFundAccountEqualTo(String value) {
            addCriterion("fund_account =", value, "fundAccount");
            return (Criteria) this;
        }

        public Criteria andFundAccountNotEqualTo(String value) {
            addCriterion("fund_account <>", value, "fundAccount");
            return (Criteria) this;
        }

        public Criteria andFundAccountGreaterThan(String value) {
            addCriterion("fund_account >", value, "fundAccount");
            return (Criteria) this;
        }

        public Criteria andFundAccountGreaterThanOrEqualTo(String value) {
            addCriterion("fund_account >=", value, "fundAccount");
            return (Criteria) this;
        }

        public Criteria andFundAccountLessThan(String value) {
            addCriterion("fund_account <", value, "fundAccount");
            return (Criteria) this;
        }

        public Criteria andFundAccountLessThanOrEqualTo(String value) {
            addCriterion("fund_account <=", value, "fundAccount");
            return (Criteria) this;
        }

        public Criteria andFundAccountLike(String value) {
            addCriterion("fund_account like", value, "fundAccount");
            return (Criteria) this;
        }

        public Criteria andFundAccountNotLike(String value) {
            addCriterion("fund_account not like", value, "fundAccount");
            return (Criteria) this;
        }

        public Criteria andFundAccountIn(List<String> values) {
            addCriterion("fund_account in", values, "fundAccount");
            return (Criteria) this;
        }

        public Criteria andFundAccountNotIn(List<String> values) {
            addCriterion("fund_account not in", values, "fundAccount");
            return (Criteria) this;
        }

        public Criteria andFundAccountBetween(String value1, String value2) {
            addCriterion("fund_account between", value1, value2, "fundAccount");
            return (Criteria) this;
        }

        public Criteria andFundAccountNotBetween(String value1, String value2) {
            addCriterion("fund_account not between", value1, value2, "fundAccount");
            return (Criteria) this;
        }

        public Criteria andCompanyTypeIsNull() {
            addCriterion("company_type is null");
            return (Criteria) this;
        }

        public Criteria andCompanyTypeIsNotNull() {
            addCriterion("company_type is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyTypeEqualTo(String value) {
            addCriterion("company_type =", value, "companyType");
            return (Criteria) this;
        }

        public Criteria andCompanyTypeNotEqualTo(String value) {
            addCriterion("company_type <>", value, "companyType");
            return (Criteria) this;
        }

        public Criteria andCompanyTypeGreaterThan(String value) {
            addCriterion("company_type >", value, "companyType");
            return (Criteria) this;
        }

        public Criteria andCompanyTypeGreaterThanOrEqualTo(String value) {
            addCriterion("company_type >=", value, "companyType");
            return (Criteria) this;
        }

        public Criteria andCompanyTypeLessThan(String value) {
            addCriterion("company_type <", value, "companyType");
            return (Criteria) this;
        }

        public Criteria andCompanyTypeLessThanOrEqualTo(String value) {
            addCriterion("company_type <=", value, "companyType");
            return (Criteria) this;
        }

        public Criteria andCompanyTypeLike(String value) {
            addCriterion("company_type like", value, "companyType");
            return (Criteria) this;
        }

        public Criteria andCompanyTypeNotLike(String value) {
            addCriterion("company_type not like", value, "companyType");
            return (Criteria) this;
        }

        public Criteria andCompanyTypeIn(List<String> values) {
            addCriterion("company_type in", values, "companyType");
            return (Criteria) this;
        }

        public Criteria andCompanyTypeNotIn(List<String> values) {
            addCriterion("company_type not in", values, "companyType");
            return (Criteria) this;
        }

        public Criteria andCompanyTypeBetween(String value1, String value2) {
            addCriterion("company_type between", value1, value2, "companyType");
            return (Criteria) this;
        }

        public Criteria andCompanyTypeNotBetween(String value1, String value2) {
            addCriterion("company_type not between", value1, value2, "companyType");
            return (Criteria) this;
        }

        public Criteria andOrgCodeIsNull() {
            addCriterion("org_code is null");
            return (Criteria) this;
        }

        public Criteria andOrgCodeIsNotNull() {
            addCriterion("org_code is not null");
            return (Criteria) this;
        }

        public Criteria andOrgCodeEqualTo(String value) {
            addCriterion("org_code =", value, "orgCode");
            return (Criteria) this;
        }

        public Criteria andOrgCodeNotEqualTo(String value) {
            addCriterion("org_code <>", value, "orgCode");
            return (Criteria) this;
        }

        public Criteria andOrgCodeGreaterThan(String value) {
            addCriterion("org_code >", value, "orgCode");
            return (Criteria) this;
        }

        public Criteria andOrgCodeGreaterThanOrEqualTo(String value) {
            addCriterion("org_code >=", value, "orgCode");
            return (Criteria) this;
        }

        public Criteria andOrgCodeLessThan(String value) {
            addCriterion("org_code <", value, "orgCode");
            return (Criteria) this;
        }

        public Criteria andOrgCodeLessThanOrEqualTo(String value) {
            addCriterion("org_code <=", value, "orgCode");
            return (Criteria) this;
        }

        public Criteria andOrgCodeLike(String value) {
            addCriterion("org_code like", value, "orgCode");
            return (Criteria) this;
        }

        public Criteria andOrgCodeNotLike(String value) {
            addCriterion("org_code not like", value, "orgCode");
            return (Criteria) this;
        }

        public Criteria andOrgCodeIn(List<String> values) {
            addCriterion("org_code in", values, "orgCode");
            return (Criteria) this;
        }

        public Criteria andOrgCodeNotIn(List<String> values) {
            addCriterion("org_code not in", values, "orgCode");
            return (Criteria) this;
        }

        public Criteria andOrgCodeBetween(String value1, String value2) {
            addCriterion("org_code between", value1, value2, "orgCode");
            return (Criteria) this;
        }

        public Criteria andOrgCodeNotBetween(String value1, String value2) {
            addCriterion("org_code not between", value1, value2, "orgCode");
            return (Criteria) this;
        }

        public Criteria andTaxCertIsNull() {
            addCriterion("tax_cert is null");
            return (Criteria) this;
        }

        public Criteria andTaxCertIsNotNull() {
            addCriterion("tax_cert is not null");
            return (Criteria) this;
        }

        public Criteria andTaxCertEqualTo(String value) {
            addCriterion("tax_cert =", value, "taxCert");
            return (Criteria) this;
        }

        public Criteria andTaxCertNotEqualTo(String value) {
            addCriterion("tax_cert <>", value, "taxCert");
            return (Criteria) this;
        }

        public Criteria andTaxCertGreaterThan(String value) {
            addCriterion("tax_cert >", value, "taxCert");
            return (Criteria) this;
        }

        public Criteria andTaxCertGreaterThanOrEqualTo(String value) {
            addCriterion("tax_cert >=", value, "taxCert");
            return (Criteria) this;
        }

        public Criteria andTaxCertLessThan(String value) {
            addCriterion("tax_cert <", value, "taxCert");
            return (Criteria) this;
        }

        public Criteria andTaxCertLessThanOrEqualTo(String value) {
            addCriterion("tax_cert <=", value, "taxCert");
            return (Criteria) this;
        }

        public Criteria andTaxCertLike(String value) {
            addCriterion("tax_cert like", value, "taxCert");
            return (Criteria) this;
        }

        public Criteria andTaxCertNotLike(String value) {
            addCriterion("tax_cert not like", value, "taxCert");
            return (Criteria) this;
        }

        public Criteria andTaxCertIn(List<String> values) {
            addCriterion("tax_cert in", values, "taxCert");
            return (Criteria) this;
        }

        public Criteria andTaxCertNotIn(List<String> values) {
            addCriterion("tax_cert not in", values, "taxCert");
            return (Criteria) this;
        }

        public Criteria andTaxCertBetween(String value1, String value2) {
            addCriterion("tax_cert between", value1, value2, "taxCert");
            return (Criteria) this;
        }

        public Criteria andTaxCertNotBetween(String value1, String value2) {
            addCriterion("tax_cert not between", value1, value2, "taxCert");
            return (Criteria) this;
        }

        public Criteria andBusinessCertIsNull() {
            addCriterion("business_cert is null");
            return (Criteria) this;
        }

        public Criteria andBusinessCertIsNotNull() {
            addCriterion("business_cert is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessCertEqualTo(String value) {
            addCriterion("business_cert =", value, "businessCert");
            return (Criteria) this;
        }

        public Criteria andBusinessCertNotEqualTo(String value) {
            addCriterion("business_cert <>", value, "businessCert");
            return (Criteria) this;
        }

        public Criteria andBusinessCertGreaterThan(String value) {
            addCriterion("business_cert >", value, "businessCert");
            return (Criteria) this;
        }

        public Criteria andBusinessCertGreaterThanOrEqualTo(String value) {
            addCriterion("business_cert >=", value, "businessCert");
            return (Criteria) this;
        }

        public Criteria andBusinessCertLessThan(String value) {
            addCriterion("business_cert <", value, "businessCert");
            return (Criteria) this;
        }

        public Criteria andBusinessCertLessThanOrEqualTo(String value) {
            addCriterion("business_cert <=", value, "businessCert");
            return (Criteria) this;
        }

        public Criteria andBusinessCertLike(String value) {
            addCriterion("business_cert like", value, "businessCert");
            return (Criteria) this;
        }

        public Criteria andBusinessCertNotLike(String value) {
            addCriterion("business_cert not like", value, "businessCert");
            return (Criteria) this;
        }

        public Criteria andBusinessCertIn(List<String> values) {
            addCriterion("business_cert in", values, "businessCert");
            return (Criteria) this;
        }

        public Criteria andBusinessCertNotIn(List<String> values) {
            addCriterion("business_cert not in", values, "businessCert");
            return (Criteria) this;
        }

        public Criteria andBusinessCertBetween(String value1, String value2) {
            addCriterion("business_cert between", value1, value2, "businessCert");
            return (Criteria) this;
        }

        public Criteria andBusinessCertNotBetween(String value1, String value2) {
            addCriterion("business_cert not between", value1, value2, "businessCert");
            return (Criteria) this;
        }

        public Criteria andBizPermitCertIsNull() {
            addCriterion("biz_permit_cert is null");
            return (Criteria) this;
        }

        public Criteria andBizPermitCertIsNotNull() {
            addCriterion("biz_permit_cert is not null");
            return (Criteria) this;
        }

        public Criteria andBizPermitCertEqualTo(String value) {
            addCriterion("biz_permit_cert =", value, "bizPermitCert");
            return (Criteria) this;
        }

        public Criteria andBizPermitCertNotEqualTo(String value) {
            addCriterion("biz_permit_cert <>", value, "bizPermitCert");
            return (Criteria) this;
        }

        public Criteria andBizPermitCertGreaterThan(String value) {
            addCriterion("biz_permit_cert >", value, "bizPermitCert");
            return (Criteria) this;
        }

        public Criteria andBizPermitCertGreaterThanOrEqualTo(String value) {
            addCriterion("biz_permit_cert >=", value, "bizPermitCert");
            return (Criteria) this;
        }

        public Criteria andBizPermitCertLessThan(String value) {
            addCriterion("biz_permit_cert <", value, "bizPermitCert");
            return (Criteria) this;
        }

        public Criteria andBizPermitCertLessThanOrEqualTo(String value) {
            addCriterion("biz_permit_cert <=", value, "bizPermitCert");
            return (Criteria) this;
        }

        public Criteria andBizPermitCertLike(String value) {
            addCriterion("biz_permit_cert like", value, "bizPermitCert");
            return (Criteria) this;
        }

        public Criteria andBizPermitCertNotLike(String value) {
            addCriterion("biz_permit_cert not like", value, "bizPermitCert");
            return (Criteria) this;
        }

        public Criteria andBizPermitCertIn(List<String> values) {
            addCriterion("biz_permit_cert in", values, "bizPermitCert");
            return (Criteria) this;
        }

        public Criteria andBizPermitCertNotIn(List<String> values) {
            addCriterion("biz_permit_cert not in", values, "bizPermitCert");
            return (Criteria) this;
        }

        public Criteria andBizPermitCertBetween(String value1, String value2) {
            addCriterion("biz_permit_cert between", value1, value2, "bizPermitCert");
            return (Criteria) this;
        }

        public Criteria andBizPermitCertNotBetween(String value1, String value2) {
            addCriterion("biz_permit_cert not between", value1, value2, "bizPermitCert");
            return (Criteria) this;
        }

        public Criteria andRegDateIsNull() {
            addCriterion("reg_date is null");
            return (Criteria) this;
        }

        public Criteria andRegDateIsNotNull() {
            addCriterion("reg_date is not null");
            return (Criteria) this;
        }

        public Criteria andRegDateEqualTo(String value) {
            addCriterion("reg_date =", value, "regDate");
            return (Criteria) this;
        }

        public Criteria andRegDateNotEqualTo(String value) {
            addCriterion("reg_date <>", value, "regDate");
            return (Criteria) this;
        }

        public Criteria andRegDateGreaterThan(String value) {
            addCriterion("reg_date >", value, "regDate");
            return (Criteria) this;
        }

        public Criteria andRegDateGreaterThanOrEqualTo(String value) {
            addCriterion("reg_date >=", value, "regDate");
            return (Criteria) this;
        }

        public Criteria andRegDateLessThan(String value) {
            addCriterion("reg_date <", value, "regDate");
            return (Criteria) this;
        }

        public Criteria andRegDateLessThanOrEqualTo(String value) {
            addCriterion("reg_date <=", value, "regDate");
            return (Criteria) this;
        }

        public Criteria andRegDateLike(String value) {
            addCriterion("reg_date like", value, "regDate");
            return (Criteria) this;
        }

        public Criteria andRegDateNotLike(String value) {
            addCriterion("reg_date not like", value, "regDate");
            return (Criteria) this;
        }

        public Criteria andRegDateIn(List<String> values) {
            addCriterion("reg_date in", values, "regDate");
            return (Criteria) this;
        }

        public Criteria andRegDateNotIn(List<String> values) {
            addCriterion("reg_date not in", values, "regDate");
            return (Criteria) this;
        }

        public Criteria andRegDateBetween(String value1, String value2) {
            addCriterion("reg_date between", value1, value2, "regDate");
            return (Criteria) this;
        }

        public Criteria andRegDateNotBetween(String value1, String value2) {
            addCriterion("reg_date not between", value1, value2, "regDate");
            return (Criteria) this;
        }

        public Criteria andLegalPersonIsNull() {
            addCriterion("legal_person is null");
            return (Criteria) this;
        }

        public Criteria andLegalPersonIsNotNull() {
            addCriterion("legal_person is not null");
            return (Criteria) this;
        }

        public Criteria andLegalPersonEqualTo(String value) {
            addCriterion("legal_person =", value, "legalPerson");
            return (Criteria) this;
        }

        public Criteria andLegalPersonNotEqualTo(String value) {
            addCriterion("legal_person <>", value, "legalPerson");
            return (Criteria) this;
        }

        public Criteria andLegalPersonGreaterThan(String value) {
            addCriterion("legal_person >", value, "legalPerson");
            return (Criteria) this;
        }

        public Criteria andLegalPersonGreaterThanOrEqualTo(String value) {
            addCriterion("legal_person >=", value, "legalPerson");
            return (Criteria) this;
        }

        public Criteria andLegalPersonLessThan(String value) {
            addCriterion("legal_person <", value, "legalPerson");
            return (Criteria) this;
        }

        public Criteria andLegalPersonLessThanOrEqualTo(String value) {
            addCriterion("legal_person <=", value, "legalPerson");
            return (Criteria) this;
        }

        public Criteria andLegalPersonLike(String value) {
            addCriterion("legal_person like", value, "legalPerson");
            return (Criteria) this;
        }

        public Criteria andLegalPersonNotLike(String value) {
            addCriterion("legal_person not like", value, "legalPerson");
            return (Criteria) this;
        }

        public Criteria andLegalPersonIn(List<String> values) {
            addCriterion("legal_person in", values, "legalPerson");
            return (Criteria) this;
        }

        public Criteria andLegalPersonNotIn(List<String> values) {
            addCriterion("legal_person not in", values, "legalPerson");
            return (Criteria) this;
        }

        public Criteria andLegalPersonBetween(String value1, String value2) {
            addCriterion("legal_person between", value1, value2, "legalPerson");
            return (Criteria) this;
        }

        public Criteria andLegalPersonNotBetween(String value1, String value2) {
            addCriterion("legal_person not between", value1, value2, "legalPerson");
            return (Criteria) this;
        }

        public Criteria andAgencyPersonIsNull() {
            addCriterion("agency_person is null");
            return (Criteria) this;
        }

        public Criteria andAgencyPersonIsNotNull() {
            addCriterion("agency_person is not null");
            return (Criteria) this;
        }

        public Criteria andAgencyPersonEqualTo(String value) {
            addCriterion("agency_person =", value, "agencyPerson");
            return (Criteria) this;
        }

        public Criteria andAgencyPersonNotEqualTo(String value) {
            addCriterion("agency_person <>", value, "agencyPerson");
            return (Criteria) this;
        }

        public Criteria andAgencyPersonGreaterThan(String value) {
            addCriterion("agency_person >", value, "agencyPerson");
            return (Criteria) this;
        }

        public Criteria andAgencyPersonGreaterThanOrEqualTo(String value) {
            addCriterion("agency_person >=", value, "agencyPerson");
            return (Criteria) this;
        }

        public Criteria andAgencyPersonLessThan(String value) {
            addCriterion("agency_person <", value, "agencyPerson");
            return (Criteria) this;
        }

        public Criteria andAgencyPersonLessThanOrEqualTo(String value) {
            addCriterion("agency_person <=", value, "agencyPerson");
            return (Criteria) this;
        }

        public Criteria andAgencyPersonLike(String value) {
            addCriterion("agency_person like", value, "agencyPerson");
            return (Criteria) this;
        }

        public Criteria andAgencyPersonNotLike(String value) {
            addCriterion("agency_person not like", value, "agencyPerson");
            return (Criteria) this;
        }

        public Criteria andAgencyPersonIn(List<String> values) {
            addCriterion("agency_person in", values, "agencyPerson");
            return (Criteria) this;
        }

        public Criteria andAgencyPersonNotIn(List<String> values) {
            addCriterion("agency_person not in", values, "agencyPerson");
            return (Criteria) this;
        }

        public Criteria andAgencyPersonBetween(String value1, String value2) {
            addCriterion("agency_person between", value1, value2, "agencyPerson");
            return (Criteria) this;
        }

        public Criteria andAgencyPersonNotBetween(String value1, String value2) {
            addCriterion("agency_person not between", value1, value2, "agencyPerson");
            return (Criteria) this;
        }

        public Criteria andRegCapitalIsNull() {
            addCriterion("reg_capital is null");
            return (Criteria) this;
        }

        public Criteria andRegCapitalIsNotNull() {
            addCriterion("reg_capital is not null");
            return (Criteria) this;
        }

        public Criteria andRegCapitalEqualTo(String value) {
            addCriterion("reg_capital =", value, "regCapital");
            return (Criteria) this;
        }

        public Criteria andRegCapitalNotEqualTo(String value) {
            addCriterion("reg_capital <>", value, "regCapital");
            return (Criteria) this;
        }

        public Criteria andRegCapitalGreaterThan(String value) {
            addCriterion("reg_capital >", value, "regCapital");
            return (Criteria) this;
        }

        public Criteria andRegCapitalGreaterThanOrEqualTo(String value) {
            addCriterion("reg_capital >=", value, "regCapital");
            return (Criteria) this;
        }

        public Criteria andRegCapitalLessThan(String value) {
            addCriterion("reg_capital <", value, "regCapital");
            return (Criteria) this;
        }

        public Criteria andRegCapitalLessThanOrEqualTo(String value) {
            addCriterion("reg_capital <=", value, "regCapital");
            return (Criteria) this;
        }

        public Criteria andRegCapitalLike(String value) {
            addCriterion("reg_capital like", value, "regCapital");
            return (Criteria) this;
        }

        public Criteria andRegCapitalNotLike(String value) {
            addCriterion("reg_capital not like", value, "regCapital");
            return (Criteria) this;
        }

        public Criteria andRegCapitalIn(List<String> values) {
            addCriterion("reg_capital in", values, "regCapital");
            return (Criteria) this;
        }

        public Criteria andRegCapitalNotIn(List<String> values) {
            addCriterion("reg_capital not in", values, "regCapital");
            return (Criteria) this;
        }

        public Criteria andRegCapitalBetween(String value1, String value2) {
            addCriterion("reg_capital between", value1, value2, "regCapital");
            return (Criteria) this;
        }

        public Criteria andRegCapitalNotBetween(String value1, String value2) {
            addCriterion("reg_capital not between", value1, value2, "regCapital");
            return (Criteria) this;
        }

        public Criteria andSettleBankIsNull() {
            addCriterion("settle_bank is null");
            return (Criteria) this;
        }

        public Criteria andSettleBankIsNotNull() {
            addCriterion("settle_bank is not null");
            return (Criteria) this;
        }

        public Criteria andSettleBankEqualTo(String value) {
            addCriterion("settle_bank =", value, "settleBank");
            return (Criteria) this;
        }

        public Criteria andSettleBankNotEqualTo(String value) {
            addCriterion("settle_bank <>", value, "settleBank");
            return (Criteria) this;
        }

        public Criteria andSettleBankGreaterThan(String value) {
            addCriterion("settle_bank >", value, "settleBank");
            return (Criteria) this;
        }

        public Criteria andSettleBankGreaterThanOrEqualTo(String value) {
            addCriterion("settle_bank >=", value, "settleBank");
            return (Criteria) this;
        }

        public Criteria andSettleBankLessThan(String value) {
            addCriterion("settle_bank <", value, "settleBank");
            return (Criteria) this;
        }

        public Criteria andSettleBankLessThanOrEqualTo(String value) {
            addCriterion("settle_bank <=", value, "settleBank");
            return (Criteria) this;
        }

        public Criteria andSettleBankLike(String value) {
            addCriterion("settle_bank like", value, "settleBank");
            return (Criteria) this;
        }

        public Criteria andSettleBankNotLike(String value) {
            addCriterion("settle_bank not like", value, "settleBank");
            return (Criteria) this;
        }

        public Criteria andSettleBankIn(List<String> values) {
            addCriterion("settle_bank in", values, "settleBank");
            return (Criteria) this;
        }

        public Criteria andSettleBankNotIn(List<String> values) {
            addCriterion("settle_bank not in", values, "settleBank");
            return (Criteria) this;
        }

        public Criteria andSettleBankBetween(String value1, String value2) {
            addCriterion("settle_bank between", value1, value2, "settleBank");
            return (Criteria) this;
        }

        public Criteria andSettleBankNotBetween(String value1, String value2) {
            addCriterion("settle_bank not between", value1, value2, "settleBank");
            return (Criteria) this;
        }

        public Criteria andOpenBankIsNull() {
            addCriterion("open_bank is null");
            return (Criteria) this;
        }

        public Criteria andOpenBankIsNotNull() {
            addCriterion("open_bank is not null");
            return (Criteria) this;
        }

        public Criteria andOpenBankEqualTo(String value) {
            addCriterion("open_bank =", value, "openBank");
            return (Criteria) this;
        }

        public Criteria andOpenBankNotEqualTo(String value) {
            addCriterion("open_bank <>", value, "openBank");
            return (Criteria) this;
        }

        public Criteria andOpenBankGreaterThan(String value) {
            addCriterion("open_bank >", value, "openBank");
            return (Criteria) this;
        }

        public Criteria andOpenBankGreaterThanOrEqualTo(String value) {
            addCriterion("open_bank >=", value, "openBank");
            return (Criteria) this;
        }

        public Criteria andOpenBankLessThan(String value) {
            addCriterion("open_bank <", value, "openBank");
            return (Criteria) this;
        }

        public Criteria andOpenBankLessThanOrEqualTo(String value) {
            addCriterion("open_bank <=", value, "openBank");
            return (Criteria) this;
        }

        public Criteria andOpenBankLike(String value) {
            addCriterion("open_bank like", value, "openBank");
            return (Criteria) this;
        }

        public Criteria andOpenBankNotLike(String value) {
            addCriterion("open_bank not like", value, "openBank");
            return (Criteria) this;
        }

        public Criteria andOpenBankIn(List<String> values) {
            addCriterion("open_bank in", values, "openBank");
            return (Criteria) this;
        }

        public Criteria andOpenBankNotIn(List<String> values) {
            addCriterion("open_bank not in", values, "openBank");
            return (Criteria) this;
        }

        public Criteria andOpenBankBetween(String value1, String value2) {
            addCriterion("open_bank between", value1, value2, "openBank");
            return (Criteria) this;
        }

        public Criteria andOpenBankNotBetween(String value1, String value2) {
            addCriterion("open_bank not between", value1, value2, "openBank");
            return (Criteria) this;
        }

        public Criteria andBankAccountIsNull() {
            addCriterion("bank_account is null");
            return (Criteria) this;
        }

        public Criteria andBankAccountIsNotNull() {
            addCriterion("bank_account is not null");
            return (Criteria) this;
        }

        public Criteria andBankAccountEqualTo(String value) {
            addCriterion("bank_account =", value, "bankAccount");
            return (Criteria) this;
        }

        public Criteria andBankAccountNotEqualTo(String value) {
            addCriterion("bank_account <>", value, "bankAccount");
            return (Criteria) this;
        }

        public Criteria andBankAccountGreaterThan(String value) {
            addCriterion("bank_account >", value, "bankAccount");
            return (Criteria) this;
        }

        public Criteria andBankAccountGreaterThanOrEqualTo(String value) {
            addCriterion("bank_account >=", value, "bankAccount");
            return (Criteria) this;
        }

        public Criteria andBankAccountLessThan(String value) {
            addCriterion("bank_account <", value, "bankAccount");
            return (Criteria) this;
        }

        public Criteria andBankAccountLessThanOrEqualTo(String value) {
            addCriterion("bank_account <=", value, "bankAccount");
            return (Criteria) this;
        }

        public Criteria andBankAccountLike(String value) {
            addCriterion("bank_account like", value, "bankAccount");
            return (Criteria) this;
        }

        public Criteria andBankAccountNotLike(String value) {
            addCriterion("bank_account not like", value, "bankAccount");
            return (Criteria) this;
        }

        public Criteria andBankAccountIn(List<String> values) {
            addCriterion("bank_account in", values, "bankAccount");
            return (Criteria) this;
        }

        public Criteria andBankAccountNotIn(List<String> values) {
            addCriterion("bank_account not in", values, "bankAccount");
            return (Criteria) this;
        }

        public Criteria andBankAccountBetween(String value1, String value2) {
            addCriterion("bank_account between", value1, value2, "bankAccount");
            return (Criteria) this;
        }

        public Criteria andBankAccountNotBetween(String value1, String value2) {
            addCriterion("bank_account not between", value1, value2, "bankAccount");
            return (Criteria) this;
        }

        public Criteria andBankAccountNameIsNull() {
            addCriterion("bank_account_name is null");
            return (Criteria) this;
        }

        public Criteria andBankAccountNameIsNotNull() {
            addCriterion("bank_account_name is not null");
            return (Criteria) this;
        }

        public Criteria andBankAccountNameEqualTo(String value) {
            addCriterion("bank_account_name =", value, "bankAccountName");
            return (Criteria) this;
        }

        public Criteria andBankAccountNameNotEqualTo(String value) {
            addCriterion("bank_account_name <>", value, "bankAccountName");
            return (Criteria) this;
        }

        public Criteria andBankAccountNameGreaterThan(String value) {
            addCriterion("bank_account_name >", value, "bankAccountName");
            return (Criteria) this;
        }

        public Criteria andBankAccountNameGreaterThanOrEqualTo(String value) {
            addCriterion("bank_account_name >=", value, "bankAccountName");
            return (Criteria) this;
        }

        public Criteria andBankAccountNameLessThan(String value) {
            addCriterion("bank_account_name <", value, "bankAccountName");
            return (Criteria) this;
        }

        public Criteria andBankAccountNameLessThanOrEqualTo(String value) {
            addCriterion("bank_account_name <=", value, "bankAccountName");
            return (Criteria) this;
        }

        public Criteria andBankAccountNameLike(String value) {
            addCriterion("bank_account_name like", value, "bankAccountName");
            return (Criteria) this;
        }

        public Criteria andBankAccountNameNotLike(String value) {
            addCriterion("bank_account_name not like", value, "bankAccountName");
            return (Criteria) this;
        }

        public Criteria andBankAccountNameIn(List<String> values) {
            addCriterion("bank_account_name in", values, "bankAccountName");
            return (Criteria) this;
        }

        public Criteria andBankAccountNameNotIn(List<String> values) {
            addCriterion("bank_account_name not in", values, "bankAccountName");
            return (Criteria) this;
        }

        public Criteria andBankAccountNameBetween(String value1, String value2) {
            addCriterion("bank_account_name between", value1, value2, "bankAccountName");
            return (Criteria) this;
        }

        public Criteria andBankAccountNameNotBetween(String value1, String value2) {
            addCriterion("bank_account_name not between", value1, value2, "bankAccountName");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNull() {
            addCriterion("phone is null");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNotNull() {
            addCriterion("phone is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneEqualTo(String value) {
            addCriterion("phone =", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotEqualTo(String value) {
            addCriterion("phone <>", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThan(String value) {
            addCriterion("phone >", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("phone >=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThan(String value) {
            addCriterion("phone <", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThanOrEqualTo(String value) {
            addCriterion("phone <=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLike(String value) {
            addCriterion("phone like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotLike(String value) {
            addCriterion("phone not like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneIn(List<String> values) {
            addCriterion("phone in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotIn(List<String> values) {
            addCriterion("phone not in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneBetween(String value1, String value2) {
            addCriterion("phone between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotBetween(String value1, String value2) {
            addCriterion("phone not between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andFaxIsNull() {
            addCriterion("fax is null");
            return (Criteria) this;
        }

        public Criteria andFaxIsNotNull() {
            addCriterion("fax is not null");
            return (Criteria) this;
        }

        public Criteria andFaxEqualTo(String value) {
            addCriterion("fax =", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxNotEqualTo(String value) {
            addCriterion("fax <>", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxGreaterThan(String value) {
            addCriterion("fax >", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxGreaterThanOrEqualTo(String value) {
            addCriterion("fax >=", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxLessThan(String value) {
            addCriterion("fax <", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxLessThanOrEqualTo(String value) {
            addCriterion("fax <=", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxLike(String value) {
            addCriterion("fax like", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxNotLike(String value) {
            addCriterion("fax not like", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxIn(List<String> values) {
            addCriterion("fax in", values, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxNotIn(List<String> values) {
            addCriterion("fax not in", values, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxBetween(String value1, String value2) {
            addCriterion("fax between", value1, value2, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxNotBetween(String value1, String value2) {
            addCriterion("fax not between", value1, value2, "fax");
            return (Criteria) this;
        }

        public Criteria andMobileIsNull() {
            addCriterion("mobile is null");
            return (Criteria) this;
        }

        public Criteria andMobileIsNotNull() {
            addCriterion("mobile is not null");
            return (Criteria) this;
        }

        public Criteria andMobileEqualTo(String value) {
            addCriterion("mobile =", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotEqualTo(String value) {
            addCriterion("mobile <>", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileGreaterThan(String value) {
            addCriterion("mobile >", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileGreaterThanOrEqualTo(String value) {
            addCriterion("mobile >=", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLessThan(String value) {
            addCriterion("mobile <", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLessThanOrEqualTo(String value) {
            addCriterion("mobile <=", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLike(String value) {
            addCriterion("mobile like", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotLike(String value) {
            addCriterion("mobile not like", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileIn(List<String> values) {
            addCriterion("mobile in", values, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotIn(List<String> values) {
            addCriterion("mobile not in", values, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileBetween(String value1, String value2) {
            addCriterion("mobile between", value1, value2, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotBetween(String value1, String value2) {
            addCriterion("mobile not between", value1, value2, "mobile");
            return (Criteria) this;
        }

        public Criteria andWebsiteIsNull() {
            addCriterion("website is null");
            return (Criteria) this;
        }

        public Criteria andWebsiteIsNotNull() {
            addCriterion("website is not null");
            return (Criteria) this;
        }

        public Criteria andWebsiteEqualTo(String value) {
            addCriterion("website =", value, "website");
            return (Criteria) this;
        }

        public Criteria andWebsiteNotEqualTo(String value) {
            addCriterion("website <>", value, "website");
            return (Criteria) this;
        }

        public Criteria andWebsiteGreaterThan(String value) {
            addCriterion("website >", value, "website");
            return (Criteria) this;
        }

        public Criteria andWebsiteGreaterThanOrEqualTo(String value) {
            addCriterion("website >=", value, "website");
            return (Criteria) this;
        }

        public Criteria andWebsiteLessThan(String value) {
            addCriterion("website <", value, "website");
            return (Criteria) this;
        }

        public Criteria andWebsiteLessThanOrEqualTo(String value) {
            addCriterion("website <=", value, "website");
            return (Criteria) this;
        }

        public Criteria andWebsiteLike(String value) {
            addCriterion("website like", value, "website");
            return (Criteria) this;
        }

        public Criteria andWebsiteNotLike(String value) {
            addCriterion("website not like", value, "website");
            return (Criteria) this;
        }

        public Criteria andWebsiteIn(List<String> values) {
            addCriterion("website in", values, "website");
            return (Criteria) this;
        }

        public Criteria andWebsiteNotIn(List<String> values) {
            addCriterion("website not in", values, "website");
            return (Criteria) this;
        }

        public Criteria andWebsiteBetween(String value1, String value2) {
            addCriterion("website between", value1, value2, "website");
            return (Criteria) this;
        }

        public Criteria andWebsiteNotBetween(String value1, String value2) {
            addCriterion("website not between", value1, value2, "website");
            return (Criteria) this;
        }

        public Criteria andCompZipCodeIsNull() {
            addCriterion("comp_zip_code is null");
            return (Criteria) this;
        }

        public Criteria andCompZipCodeIsNotNull() {
            addCriterion("comp_zip_code is not null");
            return (Criteria) this;
        }

        public Criteria andCompZipCodeEqualTo(String value) {
            addCriterion("comp_zip_code =", value, "compZipCode");
            return (Criteria) this;
        }

        public Criteria andCompZipCodeNotEqualTo(String value) {
            addCriterion("comp_zip_code <>", value, "compZipCode");
            return (Criteria) this;
        }

        public Criteria andCompZipCodeGreaterThan(String value) {
            addCriterion("comp_zip_code >", value, "compZipCode");
            return (Criteria) this;
        }

        public Criteria andCompZipCodeGreaterThanOrEqualTo(String value) {
            addCriterion("comp_zip_code >=", value, "compZipCode");
            return (Criteria) this;
        }

        public Criteria andCompZipCodeLessThan(String value) {
            addCriterion("comp_zip_code <", value, "compZipCode");
            return (Criteria) this;
        }

        public Criteria andCompZipCodeLessThanOrEqualTo(String value) {
            addCriterion("comp_zip_code <=", value, "compZipCode");
            return (Criteria) this;
        }

        public Criteria andCompZipCodeLike(String value) {
            addCriterion("comp_zip_code like", value, "compZipCode");
            return (Criteria) this;
        }

        public Criteria andCompZipCodeNotLike(String value) {
            addCriterion("comp_zip_code not like", value, "compZipCode");
            return (Criteria) this;
        }

        public Criteria andCompZipCodeIn(List<String> values) {
            addCriterion("comp_zip_code in", values, "compZipCode");
            return (Criteria) this;
        }

        public Criteria andCompZipCodeNotIn(List<String> values) {
            addCriterion("comp_zip_code not in", values, "compZipCode");
            return (Criteria) this;
        }

        public Criteria andCompZipCodeBetween(String value1, String value2) {
            addCriterion("comp_zip_code between", value1, value2, "compZipCode");
            return (Criteria) this;
        }

        public Criteria andCompZipCodeNotBetween(String value1, String value2) {
            addCriterion("comp_zip_code not between", value1, value2, "compZipCode");
            return (Criteria) this;
        }

        public Criteria andCompCountryCodeIsNull() {
            addCriterion("comp_country_code is null");
            return (Criteria) this;
        }

        public Criteria andCompCountryCodeIsNotNull() {
            addCriterion("comp_country_code is not null");
            return (Criteria) this;
        }

        public Criteria andCompCountryCodeEqualTo(String value) {
            addCriterion("comp_country_code =", value, "compCountryCode");
            return (Criteria) this;
        }

        public Criteria andCompCountryCodeNotEqualTo(String value) {
            addCriterion("comp_country_code <>", value, "compCountryCode");
            return (Criteria) this;
        }

        public Criteria andCompCountryCodeGreaterThan(String value) {
            addCriterion("comp_country_code >", value, "compCountryCode");
            return (Criteria) this;
        }

        public Criteria andCompCountryCodeGreaterThanOrEqualTo(String value) {
            addCriterion("comp_country_code >=", value, "compCountryCode");
            return (Criteria) this;
        }

        public Criteria andCompCountryCodeLessThan(String value) {
            addCriterion("comp_country_code <", value, "compCountryCode");
            return (Criteria) this;
        }

        public Criteria andCompCountryCodeLessThanOrEqualTo(String value) {
            addCriterion("comp_country_code <=", value, "compCountryCode");
            return (Criteria) this;
        }

        public Criteria andCompCountryCodeLike(String value) {
            addCriterion("comp_country_code like", value, "compCountryCode");
            return (Criteria) this;
        }

        public Criteria andCompCountryCodeNotLike(String value) {
            addCriterion("comp_country_code not like", value, "compCountryCode");
            return (Criteria) this;
        }

        public Criteria andCompCountryCodeIn(List<String> values) {
            addCriterion("comp_country_code in", values, "compCountryCode");
            return (Criteria) this;
        }

        public Criteria andCompCountryCodeNotIn(List<String> values) {
            addCriterion("comp_country_code not in", values, "compCountryCode");
            return (Criteria) this;
        }

        public Criteria andCompCountryCodeBetween(String value1, String value2) {
            addCriterion("comp_country_code between", value1, value2, "compCountryCode");
            return (Criteria) this;
        }

        public Criteria andCompCountryCodeNotBetween(String value1, String value2) {
            addCriterion("comp_country_code not between", value1, value2, "compCountryCode");
            return (Criteria) this;
        }

        public Criteria andCompProvinceCodeIsNull() {
            addCriterion("comp_province_code is null");
            return (Criteria) this;
        }

        public Criteria andCompProvinceCodeIsNotNull() {
            addCriterion("comp_province_code is not null");
            return (Criteria) this;
        }

        public Criteria andCompProvinceCodeEqualTo(String value) {
            addCriterion("comp_province_code =", value, "compProvinceCode");
            return (Criteria) this;
        }

        public Criteria andCompProvinceCodeNotEqualTo(String value) {
            addCriterion("comp_province_code <>", value, "compProvinceCode");
            return (Criteria) this;
        }

        public Criteria andCompProvinceCodeGreaterThan(String value) {
            addCriterion("comp_province_code >", value, "compProvinceCode");
            return (Criteria) this;
        }

        public Criteria andCompProvinceCodeGreaterThanOrEqualTo(String value) {
            addCriterion("comp_province_code >=", value, "compProvinceCode");
            return (Criteria) this;
        }

        public Criteria andCompProvinceCodeLessThan(String value) {
            addCriterion("comp_province_code <", value, "compProvinceCode");
            return (Criteria) this;
        }

        public Criteria andCompProvinceCodeLessThanOrEqualTo(String value) {
            addCriterion("comp_province_code <=", value, "compProvinceCode");
            return (Criteria) this;
        }

        public Criteria andCompProvinceCodeLike(String value) {
            addCriterion("comp_province_code like", value, "compProvinceCode");
            return (Criteria) this;
        }

        public Criteria andCompProvinceCodeNotLike(String value) {
            addCriterion("comp_province_code not like", value, "compProvinceCode");
            return (Criteria) this;
        }

        public Criteria andCompProvinceCodeIn(List<String> values) {
            addCriterion("comp_province_code in", values, "compProvinceCode");
            return (Criteria) this;
        }

        public Criteria andCompProvinceCodeNotIn(List<String> values) {
            addCriterion("comp_province_code not in", values, "compProvinceCode");
            return (Criteria) this;
        }

        public Criteria andCompProvinceCodeBetween(String value1, String value2) {
            addCriterion("comp_province_code between", value1, value2, "compProvinceCode");
            return (Criteria) this;
        }

        public Criteria andCompProvinceCodeNotBetween(String value1, String value2) {
            addCriterion("comp_province_code not between", value1, value2, "compProvinceCode");
            return (Criteria) this;
        }

        public Criteria andCompCityCodeIsNull() {
            addCriterion("comp_city_code is null");
            return (Criteria) this;
        }

        public Criteria andCompCityCodeIsNotNull() {
            addCriterion("comp_city_code is not null");
            return (Criteria) this;
        }

        public Criteria andCompCityCodeEqualTo(String value) {
            addCriterion("comp_city_code =", value, "compCityCode");
            return (Criteria) this;
        }

        public Criteria andCompCityCodeNotEqualTo(String value) {
            addCriterion("comp_city_code <>", value, "compCityCode");
            return (Criteria) this;
        }

        public Criteria andCompCityCodeGreaterThan(String value) {
            addCriterion("comp_city_code >", value, "compCityCode");
            return (Criteria) this;
        }

        public Criteria andCompCityCodeGreaterThanOrEqualTo(String value) {
            addCriterion("comp_city_code >=", value, "compCityCode");
            return (Criteria) this;
        }

        public Criteria andCompCityCodeLessThan(String value) {
            addCriterion("comp_city_code <", value, "compCityCode");
            return (Criteria) this;
        }

        public Criteria andCompCityCodeLessThanOrEqualTo(String value) {
            addCriterion("comp_city_code <=", value, "compCityCode");
            return (Criteria) this;
        }

        public Criteria andCompCityCodeLike(String value) {
            addCriterion("comp_city_code like", value, "compCityCode");
            return (Criteria) this;
        }

        public Criteria andCompCityCodeNotLike(String value) {
            addCriterion("comp_city_code not like", value, "compCityCode");
            return (Criteria) this;
        }

        public Criteria andCompCityCodeIn(List<String> values) {
            addCriterion("comp_city_code in", values, "compCityCode");
            return (Criteria) this;
        }

        public Criteria andCompCityCodeNotIn(List<String> values) {
            addCriterion("comp_city_code not in", values, "compCityCode");
            return (Criteria) this;
        }

        public Criteria andCompCityCodeBetween(String value1, String value2) {
            addCriterion("comp_city_code between", value1, value2, "compCityCode");
            return (Criteria) this;
        }

        public Criteria andCompCityCodeNotBetween(String value1, String value2) {
            addCriterion("comp_city_code not between", value1, value2, "compCityCode");
            return (Criteria) this;
        }

        public Criteria andCompDistrictCodeIsNull() {
            addCriterion("comp_district_code is null");
            return (Criteria) this;
        }

        public Criteria andCompDistrictCodeIsNotNull() {
            addCriterion("comp_district_code is not null");
            return (Criteria) this;
        }

        public Criteria andCompDistrictCodeEqualTo(String value) {
            addCriterion("comp_district_code =", value, "compDistrictCode");
            return (Criteria) this;
        }

        public Criteria andCompDistrictCodeNotEqualTo(String value) {
            addCriterion("comp_district_code <>", value, "compDistrictCode");
            return (Criteria) this;
        }

        public Criteria andCompDistrictCodeGreaterThan(String value) {
            addCriterion("comp_district_code >", value, "compDistrictCode");
            return (Criteria) this;
        }

        public Criteria andCompDistrictCodeGreaterThanOrEqualTo(String value) {
            addCriterion("comp_district_code >=", value, "compDistrictCode");
            return (Criteria) this;
        }

        public Criteria andCompDistrictCodeLessThan(String value) {
            addCriterion("comp_district_code <", value, "compDistrictCode");
            return (Criteria) this;
        }

        public Criteria andCompDistrictCodeLessThanOrEqualTo(String value) {
            addCriterion("comp_district_code <=", value, "compDistrictCode");
            return (Criteria) this;
        }

        public Criteria andCompDistrictCodeLike(String value) {
            addCriterion("comp_district_code like", value, "compDistrictCode");
            return (Criteria) this;
        }

        public Criteria andCompDistrictCodeNotLike(String value) {
            addCriterion("comp_district_code not like", value, "compDistrictCode");
            return (Criteria) this;
        }

        public Criteria andCompDistrictCodeIn(List<String> values) {
            addCriterion("comp_district_code in", values, "compDistrictCode");
            return (Criteria) this;
        }

        public Criteria andCompDistrictCodeNotIn(List<String> values) {
            addCriterion("comp_district_code not in", values, "compDistrictCode");
            return (Criteria) this;
        }

        public Criteria andCompDistrictCodeBetween(String value1, String value2) {
            addCriterion("comp_district_code between", value1, value2, "compDistrictCode");
            return (Criteria) this;
        }

        public Criteria andCompDistrictCodeNotBetween(String value1, String value2) {
            addCriterion("comp_district_code not between", value1, value2, "compDistrictCode");
            return (Criteria) this;
        }

        public Criteria andCompAddrIsNull() {
            addCriterion("comp_addr is null");
            return (Criteria) this;
        }

        public Criteria andCompAddrIsNotNull() {
            addCriterion("comp_addr is not null");
            return (Criteria) this;
        }

        public Criteria andCompAddrEqualTo(String value) {
            addCriterion("comp_addr =", value, "compAddr");
            return (Criteria) this;
        }

        public Criteria andCompAddrNotEqualTo(String value) {
            addCriterion("comp_addr <>", value, "compAddr");
            return (Criteria) this;
        }

        public Criteria andCompAddrGreaterThan(String value) {
            addCriterion("comp_addr >", value, "compAddr");
            return (Criteria) this;
        }

        public Criteria andCompAddrGreaterThanOrEqualTo(String value) {
            addCriterion("comp_addr >=", value, "compAddr");
            return (Criteria) this;
        }

        public Criteria andCompAddrLessThan(String value) {
            addCriterion("comp_addr <", value, "compAddr");
            return (Criteria) this;
        }

        public Criteria andCompAddrLessThanOrEqualTo(String value) {
            addCriterion("comp_addr <=", value, "compAddr");
            return (Criteria) this;
        }

        public Criteria andCompAddrLike(String value) {
            addCriterion("comp_addr like", value, "compAddr");
            return (Criteria) this;
        }

        public Criteria andCompAddrNotLike(String value) {
            addCriterion("comp_addr not like", value, "compAddr");
            return (Criteria) this;
        }

        public Criteria andCompAddrIn(List<String> values) {
            addCriterion("comp_addr in", values, "compAddr");
            return (Criteria) this;
        }

        public Criteria andCompAddrNotIn(List<String> values) {
            addCriterion("comp_addr not in", values, "compAddr");
            return (Criteria) this;
        }

        public Criteria andCompAddrBetween(String value1, String value2) {
            addCriterion("comp_addr between", value1, value2, "compAddr");
            return (Criteria) this;
        }

        public Criteria andCompAddrNotBetween(String value1, String value2) {
            addCriterion("comp_addr not between", value1, value2, "compAddr");
            return (Criteria) this;
        }

        public Criteria andCompRemarkIsNull() {
            addCriterion("comp_remark is null");
            return (Criteria) this;
        }

        public Criteria andCompRemarkIsNotNull() {
            addCriterion("comp_remark is not null");
            return (Criteria) this;
        }

        public Criteria andCompRemarkEqualTo(String value) {
            addCriterion("comp_remark =", value, "compRemark");
            return (Criteria) this;
        }

        public Criteria andCompRemarkNotEqualTo(String value) {
            addCriterion("comp_remark <>", value, "compRemark");
            return (Criteria) this;
        }

        public Criteria andCompRemarkGreaterThan(String value) {
            addCriterion("comp_remark >", value, "compRemark");
            return (Criteria) this;
        }

        public Criteria andCompRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("comp_remark >=", value, "compRemark");
            return (Criteria) this;
        }

        public Criteria andCompRemarkLessThan(String value) {
            addCriterion("comp_remark <", value, "compRemark");
            return (Criteria) this;
        }

        public Criteria andCompRemarkLessThanOrEqualTo(String value) {
            addCriterion("comp_remark <=", value, "compRemark");
            return (Criteria) this;
        }

        public Criteria andCompRemarkLike(String value) {
            addCriterion("comp_remark like", value, "compRemark");
            return (Criteria) this;
        }

        public Criteria andCompRemarkNotLike(String value) {
            addCriterion("comp_remark not like", value, "compRemark");
            return (Criteria) this;
        }

        public Criteria andCompRemarkIn(List<String> values) {
            addCriterion("comp_remark in", values, "compRemark");
            return (Criteria) this;
        }

        public Criteria andCompRemarkNotIn(List<String> values) {
            addCriterion("comp_remark not in", values, "compRemark");
            return (Criteria) this;
        }

        public Criteria andCompRemarkBetween(String value1, String value2) {
            addCriterion("comp_remark between", value1, value2, "compRemark");
            return (Criteria) this;
        }

        public Criteria andCompRemarkNotBetween(String value1, String value2) {
            addCriterion("comp_remark not between", value1, value2, "compRemark");
            return (Criteria) this;
        }

        public Criteria andUserCodeIsNull() {
            addCriterion("user_code is null");
            return (Criteria) this;
        }

        public Criteria andUserCodeIsNotNull() {
            addCriterion("user_code is not null");
            return (Criteria) this;
        }

        public Criteria andUserCodeEqualTo(String value) {
            addCriterion("user_code =", value, "userCode");
            return (Criteria) this;
        }

        public Criteria andUserCodeNotEqualTo(String value) {
            addCriterion("user_code <>", value, "userCode");
            return (Criteria) this;
        }

        public Criteria andUserCodeGreaterThan(String value) {
            addCriterion("user_code >", value, "userCode");
            return (Criteria) this;
        }

        public Criteria andUserCodeGreaterThanOrEqualTo(String value) {
            addCriterion("user_code >=", value, "userCode");
            return (Criteria) this;
        }

        public Criteria andUserCodeLessThan(String value) {
            addCriterion("user_code <", value, "userCode");
            return (Criteria) this;
        }

        public Criteria andUserCodeLessThanOrEqualTo(String value) {
            addCriterion("user_code <=", value, "userCode");
            return (Criteria) this;
        }

        public Criteria andUserCodeLike(String value) {
            addCriterion("user_code like", value, "userCode");
            return (Criteria) this;
        }

        public Criteria andUserCodeNotLike(String value) {
            addCriterion("user_code not like", value, "userCode");
            return (Criteria) this;
        }

        public Criteria andUserCodeIn(List<String> values) {
            addCriterion("user_code in", values, "userCode");
            return (Criteria) this;
        }

        public Criteria andUserCodeNotIn(List<String> values) {
            addCriterion("user_code not in", values, "userCode");
            return (Criteria) this;
        }

        public Criteria andUserCodeBetween(String value1, String value2) {
            addCriterion("user_code between", value1, value2, "userCode");
            return (Criteria) this;
        }

        public Criteria andUserCodeNotBetween(String value1, String value2) {
            addCriterion("user_code not between", value1, value2, "userCode");
            return (Criteria) this;
        }

        public Criteria andUserTypeIsNull() {
            addCriterion("user_type is null");
            return (Criteria) this;
        }

        public Criteria andUserTypeIsNotNull() {
            addCriterion("user_type is not null");
            return (Criteria) this;
        }

        public Criteria andUserTypeEqualTo(String value) {
            addCriterion("user_type =", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeNotEqualTo(String value) {
            addCriterion("user_type <>", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeGreaterThan(String value) {
            addCriterion("user_type >", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeGreaterThanOrEqualTo(String value) {
            addCriterion("user_type >=", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeLessThan(String value) {
            addCriterion("user_type <", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeLessThanOrEqualTo(String value) {
            addCriterion("user_type <=", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeLike(String value) {
            addCriterion("user_type like", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeNotLike(String value) {
            addCriterion("user_type not like", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeIn(List<String> values) {
            addCriterion("user_type in", values, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeNotIn(List<String> values) {
            addCriterion("user_type not in", values, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeBetween(String value1, String value2) {
            addCriterion("user_type between", value1, value2, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeNotBetween(String value1, String value2) {
            addCriterion("user_type not between", value1, value2, "userType");
            return (Criteria) this;
        }

        public Criteria andUkeyStrIsNull() {
            addCriterion("ukey_str is null");
            return (Criteria) this;
        }

        public Criteria andUkeyStrIsNotNull() {
            addCriterion("ukey_str is not null");
            return (Criteria) this;
        }

        public Criteria andUkeyStrEqualTo(String value) {
            addCriterion("ukey_str =", value, "ukeyStr");
            return (Criteria) this;
        }

        public Criteria andUkeyStrNotEqualTo(String value) {
            addCriterion("ukey_str <>", value, "ukeyStr");
            return (Criteria) this;
        }

        public Criteria andUkeyStrGreaterThan(String value) {
            addCriterion("ukey_str >", value, "ukeyStr");
            return (Criteria) this;
        }

        public Criteria andUkeyStrGreaterThanOrEqualTo(String value) {
            addCriterion("ukey_str >=", value, "ukeyStr");
            return (Criteria) this;
        }

        public Criteria andUkeyStrLessThan(String value) {
            addCriterion("ukey_str <", value, "ukeyStr");
            return (Criteria) this;
        }

        public Criteria andUkeyStrLessThanOrEqualTo(String value) {
            addCriterion("ukey_str <=", value, "ukeyStr");
            return (Criteria) this;
        }

        public Criteria andUkeyStrLike(String value) {
            addCriterion("ukey_str like", value, "ukeyStr");
            return (Criteria) this;
        }

        public Criteria andUkeyStrNotLike(String value) {
            addCriterion("ukey_str not like", value, "ukeyStr");
            return (Criteria) this;
        }

        public Criteria andUkeyStrIn(List<String> values) {
            addCriterion("ukey_str in", values, "ukeyStr");
            return (Criteria) this;
        }

        public Criteria andUkeyStrNotIn(List<String> values) {
            addCriterion("ukey_str not in", values, "ukeyStr");
            return (Criteria) this;
        }

        public Criteria andUkeyStrBetween(String value1, String value2) {
            addCriterion("ukey_str between", value1, value2, "ukeyStr");
            return (Criteria) this;
        }

        public Criteria andUkeyStrNotBetween(String value1, String value2) {
            addCriterion("ukey_str not between", value1, value2, "ukeyStr");
            return (Criteria) this;
        }

        public Criteria andUkeyNameIsNull() {
            addCriterion("ukey_name is null");
            return (Criteria) this;
        }

        public Criteria andUkeyNameIsNotNull() {
            addCriterion("ukey_name is not null");
            return (Criteria) this;
        }

        public Criteria andUkeyNameEqualTo(String value) {
            addCriterion("ukey_name =", value, "ukeyName");
            return (Criteria) this;
        }

        public Criteria andUkeyNameNotEqualTo(String value) {
            addCriterion("ukey_name <>", value, "ukeyName");
            return (Criteria) this;
        }

        public Criteria andUkeyNameGreaterThan(String value) {
            addCriterion("ukey_name >", value, "ukeyName");
            return (Criteria) this;
        }

        public Criteria andUkeyNameGreaterThanOrEqualTo(String value) {
            addCriterion("ukey_name >=", value, "ukeyName");
            return (Criteria) this;
        }

        public Criteria andUkeyNameLessThan(String value) {
            addCriterion("ukey_name <", value, "ukeyName");
            return (Criteria) this;
        }

        public Criteria andUkeyNameLessThanOrEqualTo(String value) {
            addCriterion("ukey_name <=", value, "ukeyName");
            return (Criteria) this;
        }

        public Criteria andUkeyNameLike(String value) {
            addCriterion("ukey_name like", value, "ukeyName");
            return (Criteria) this;
        }

        public Criteria andUkeyNameNotLike(String value) {
            addCriterion("ukey_name not like", value, "ukeyName");
            return (Criteria) this;
        }

        public Criteria andUkeyNameIn(List<String> values) {
            addCriterion("ukey_name in", values, "ukeyName");
            return (Criteria) this;
        }

        public Criteria andUkeyNameNotIn(List<String> values) {
            addCriterion("ukey_name not in", values, "ukeyName");
            return (Criteria) this;
        }

        public Criteria andUkeyNameBetween(String value1, String value2) {
            addCriterion("ukey_name between", value1, value2, "ukeyName");
            return (Criteria) this;
        }

        public Criteria andUkeyNameNotBetween(String value1, String value2) {
            addCriterion("ukey_name not between", value1, value2, "ukeyName");
            return (Criteria) this;
        }

        public Criteria andJobIsNull() {
            addCriterion("job is null");
            return (Criteria) this;
        }

        public Criteria andJobIsNotNull() {
            addCriterion("job is not null");
            return (Criteria) this;
        }

        public Criteria andJobEqualTo(String value) {
            addCriterion("job =", value, "job");
            return (Criteria) this;
        }

        public Criteria andJobNotEqualTo(String value) {
            addCriterion("job <>", value, "job");
            return (Criteria) this;
        }

        public Criteria andJobGreaterThan(String value) {
            addCriterion("job >", value, "job");
            return (Criteria) this;
        }

        public Criteria andJobGreaterThanOrEqualTo(String value) {
            addCriterion("job >=", value, "job");
            return (Criteria) this;
        }

        public Criteria andJobLessThan(String value) {
            addCriterion("job <", value, "job");
            return (Criteria) this;
        }

        public Criteria andJobLessThanOrEqualTo(String value) {
            addCriterion("job <=", value, "job");
            return (Criteria) this;
        }

        public Criteria andJobLike(String value) {
            addCriterion("job like", value, "job");
            return (Criteria) this;
        }

        public Criteria andJobNotLike(String value) {
            addCriterion("job not like", value, "job");
            return (Criteria) this;
        }

        public Criteria andJobIn(List<String> values) {
            addCriterion("job in", values, "job");
            return (Criteria) this;
        }

        public Criteria andJobNotIn(List<String> values) {
            addCriterion("job not in", values, "job");
            return (Criteria) this;
        }

        public Criteria andJobBetween(String value1, String value2) {
            addCriterion("job between", value1, value2, "job");
            return (Criteria) this;
        }

        public Criteria andJobNotBetween(String value1, String value2) {
            addCriterion("job not between", value1, value2, "job");
            return (Criteria) this;
        }

        public Criteria andJobNoIsNull() {
            addCriterion("job_no is null");
            return (Criteria) this;
        }

        public Criteria andJobNoIsNotNull() {
            addCriterion("job_no is not null");
            return (Criteria) this;
        }

        public Criteria andJobNoEqualTo(String value) {
            addCriterion("job_no =", value, "jobNo");
            return (Criteria) this;
        }

        public Criteria andJobNoNotEqualTo(String value) {
            addCriterion("job_no <>", value, "jobNo");
            return (Criteria) this;
        }

        public Criteria andJobNoGreaterThan(String value) {
            addCriterion("job_no >", value, "jobNo");
            return (Criteria) this;
        }

        public Criteria andJobNoGreaterThanOrEqualTo(String value) {
            addCriterion("job_no >=", value, "jobNo");
            return (Criteria) this;
        }

        public Criteria andJobNoLessThan(String value) {
            addCriterion("job_no <", value, "jobNo");
            return (Criteria) this;
        }

        public Criteria andJobNoLessThanOrEqualTo(String value) {
            addCriterion("job_no <=", value, "jobNo");
            return (Criteria) this;
        }

        public Criteria andJobNoLike(String value) {
            addCriterion("job_no like", value, "jobNo");
            return (Criteria) this;
        }

        public Criteria andJobNoNotLike(String value) {
            addCriterion("job_no not like", value, "jobNo");
            return (Criteria) this;
        }

        public Criteria andJobNoIn(List<String> values) {
            addCriterion("job_no in", values, "jobNo");
            return (Criteria) this;
        }

        public Criteria andJobNoNotIn(List<String> values) {
            addCriterion("job_no not in", values, "jobNo");
            return (Criteria) this;
        }

        public Criteria andJobNoBetween(String value1, String value2) {
            addCriterion("job_no between", value1, value2, "jobNo");
            return (Criteria) this;
        }

        public Criteria andJobNoNotBetween(String value1, String value2) {
            addCriterion("job_no not between", value1, value2, "jobNo");
            return (Criteria) this;
        }

        public Criteria andBirthdayIsNull() {
            addCriterion("birthday is null");
            return (Criteria) this;
        }

        public Criteria andBirthdayIsNotNull() {
            addCriterion("birthday is not null");
            return (Criteria) this;
        }

        public Criteria andBirthdayEqualTo(String value) {
            addCriterion("birthday =", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotEqualTo(String value) {
            addCriterion("birthday <>", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayGreaterThan(String value) {
            addCriterion("birthday >", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayGreaterThanOrEqualTo(String value) {
            addCriterion("birthday >=", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayLessThan(String value) {
            addCriterion("birthday <", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayLessThanOrEqualTo(String value) {
            addCriterion("birthday <=", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayLike(String value) {
            addCriterion("birthday like", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotLike(String value) {
            addCriterion("birthday not like", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayIn(List<String> values) {
            addCriterion("birthday in", values, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotIn(List<String> values) {
            addCriterion("birthday not in", values, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayBetween(String value1, String value2) {
            addCriterion("birthday between", value1, value2, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotBetween(String value1, String value2) {
            addCriterion("birthday not between", value1, value2, "birthday");
            return (Criteria) this;
        }

        public Criteria andImIsNull() {
            addCriterion("im is null");
            return (Criteria) this;
        }

        public Criteria andImIsNotNull() {
            addCriterion("im is not null");
            return (Criteria) this;
        }

        public Criteria andImEqualTo(String value) {
            addCriterion("im =", value, "im");
            return (Criteria) this;
        }

        public Criteria andImNotEqualTo(String value) {
            addCriterion("im <>", value, "im");
            return (Criteria) this;
        }

        public Criteria andImGreaterThan(String value) {
            addCriterion("im >", value, "im");
            return (Criteria) this;
        }

        public Criteria andImGreaterThanOrEqualTo(String value) {
            addCriterion("im >=", value, "im");
            return (Criteria) this;
        }

        public Criteria andImLessThan(String value) {
            addCriterion("im <", value, "im");
            return (Criteria) this;
        }

        public Criteria andImLessThanOrEqualTo(String value) {
            addCriterion("im <=", value, "im");
            return (Criteria) this;
        }

        public Criteria andImLike(String value) {
            addCriterion("im like", value, "im");
            return (Criteria) this;
        }

        public Criteria andImNotLike(String value) {
            addCriterion("im not like", value, "im");
            return (Criteria) this;
        }

        public Criteria andImIn(List<String> values) {
            addCriterion("im in", values, "im");
            return (Criteria) this;
        }

        public Criteria andImNotIn(List<String> values) {
            addCriterion("im not in", values, "im");
            return (Criteria) this;
        }

        public Criteria andImBetween(String value1, String value2) {
            addCriterion("im between", value1, value2, "im");
            return (Criteria) this;
        }

        public Criteria andImNotBetween(String value1, String value2) {
            addCriterion("im not between", value1, value2, "im");
            return (Criteria) this;
        }

        public Criteria andOfficePhoneIsNull() {
            addCriterion("office_phone is null");
            return (Criteria) this;
        }

        public Criteria andOfficePhoneIsNotNull() {
            addCriterion("office_phone is not null");
            return (Criteria) this;
        }

        public Criteria andOfficePhoneEqualTo(String value) {
            addCriterion("office_phone =", value, "officePhone");
            return (Criteria) this;
        }

        public Criteria andOfficePhoneNotEqualTo(String value) {
            addCriterion("office_phone <>", value, "officePhone");
            return (Criteria) this;
        }

        public Criteria andOfficePhoneGreaterThan(String value) {
            addCriterion("office_phone >", value, "officePhone");
            return (Criteria) this;
        }

        public Criteria andOfficePhoneGreaterThanOrEqualTo(String value) {
            addCriterion("office_phone >=", value, "officePhone");
            return (Criteria) this;
        }

        public Criteria andOfficePhoneLessThan(String value) {
            addCriterion("office_phone <", value, "officePhone");
            return (Criteria) this;
        }

        public Criteria andOfficePhoneLessThanOrEqualTo(String value) {
            addCriterion("office_phone <=", value, "officePhone");
            return (Criteria) this;
        }

        public Criteria andOfficePhoneLike(String value) {
            addCriterion("office_phone like", value, "officePhone");
            return (Criteria) this;
        }

        public Criteria andOfficePhoneNotLike(String value) {
            addCriterion("office_phone not like", value, "officePhone");
            return (Criteria) this;
        }

        public Criteria andOfficePhoneIn(List<String> values) {
            addCriterion("office_phone in", values, "officePhone");
            return (Criteria) this;
        }

        public Criteria andOfficePhoneNotIn(List<String> values) {
            addCriterion("office_phone not in", values, "officePhone");
            return (Criteria) this;
        }

        public Criteria andOfficePhoneBetween(String value1, String value2) {
            addCriterion("office_phone between", value1, value2, "officePhone");
            return (Criteria) this;
        }

        public Criteria andOfficePhoneNotBetween(String value1, String value2) {
            addCriterion("office_phone not between", value1, value2, "officePhone");
            return (Criteria) this;
        }

        public Criteria andHomePhoneIsNull() {
            addCriterion("home_phone is null");
            return (Criteria) this;
        }

        public Criteria andHomePhoneIsNotNull() {
            addCriterion("home_phone is not null");
            return (Criteria) this;
        }

        public Criteria andHomePhoneEqualTo(String value) {
            addCriterion("home_phone =", value, "homePhone");
            return (Criteria) this;
        }

        public Criteria andHomePhoneNotEqualTo(String value) {
            addCriterion("home_phone <>", value, "homePhone");
            return (Criteria) this;
        }

        public Criteria andHomePhoneGreaterThan(String value) {
            addCriterion("home_phone >", value, "homePhone");
            return (Criteria) this;
        }

        public Criteria andHomePhoneGreaterThanOrEqualTo(String value) {
            addCriterion("home_phone >=", value, "homePhone");
            return (Criteria) this;
        }

        public Criteria andHomePhoneLessThan(String value) {
            addCriterion("home_phone <", value, "homePhone");
            return (Criteria) this;
        }

        public Criteria andHomePhoneLessThanOrEqualTo(String value) {
            addCriterion("home_phone <=", value, "homePhone");
            return (Criteria) this;
        }

        public Criteria andHomePhoneLike(String value) {
            addCriterion("home_phone like", value, "homePhone");
            return (Criteria) this;
        }

        public Criteria andHomePhoneNotLike(String value) {
            addCriterion("home_phone not like", value, "homePhone");
            return (Criteria) this;
        }

        public Criteria andHomePhoneIn(List<String> values) {
            addCriterion("home_phone in", values, "homePhone");
            return (Criteria) this;
        }

        public Criteria andHomePhoneNotIn(List<String> values) {
            addCriterion("home_phone not in", values, "homePhone");
            return (Criteria) this;
        }

        public Criteria andHomePhoneBetween(String value1, String value2) {
            addCriterion("home_phone between", value1, value2, "homePhone");
            return (Criteria) this;
        }

        public Criteria andHomePhoneNotBetween(String value1, String value2) {
            addCriterion("home_phone not between", value1, value2, "homePhone");
            return (Criteria) this;
        }

        public Criteria andDeptNameIsNull() {
            addCriterion("dept_name is null");
            return (Criteria) this;
        }

        public Criteria andDeptNameIsNotNull() {
            addCriterion("dept_name is not null");
            return (Criteria) this;
        }

        public Criteria andDeptNameEqualTo(String value) {
            addCriterion("dept_name =", value, "deptName");
            return (Criteria) this;
        }

        public Criteria andDeptNameNotEqualTo(String value) {
            addCriterion("dept_name <>", value, "deptName");
            return (Criteria) this;
        }

        public Criteria andDeptNameGreaterThan(String value) {
            addCriterion("dept_name >", value, "deptName");
            return (Criteria) this;
        }

        public Criteria andDeptNameGreaterThanOrEqualTo(String value) {
            addCriterion("dept_name >=", value, "deptName");
            return (Criteria) this;
        }

        public Criteria andDeptNameLessThan(String value) {
            addCriterion("dept_name <", value, "deptName");
            return (Criteria) this;
        }

        public Criteria andDeptNameLessThanOrEqualTo(String value) {
            addCriterion("dept_name <=", value, "deptName");
            return (Criteria) this;
        }

        public Criteria andDeptNameLike(String value) {
            addCriterion("dept_name like", value, "deptName");
            return (Criteria) this;
        }

        public Criteria andDeptNameNotLike(String value) {
            addCriterion("dept_name not like", value, "deptName");
            return (Criteria) this;
        }

        public Criteria andDeptNameIn(List<String> values) {
            addCriterion("dept_name in", values, "deptName");
            return (Criteria) this;
        }

        public Criteria andDeptNameNotIn(List<String> values) {
            addCriterion("dept_name not in", values, "deptName");
            return (Criteria) this;
        }

        public Criteria andDeptNameBetween(String value1, String value2) {
            addCriterion("dept_name between", value1, value2, "deptName");
            return (Criteria) this;
        }

        public Criteria andDeptNameNotBetween(String value1, String value2) {
            addCriterion("dept_name not between", value1, value2, "deptName");
            return (Criteria) this;
        }

        public Criteria andEmailIsNull() {
            addCriterion("email is null");
            return (Criteria) this;
        }

        public Criteria andEmailIsNotNull() {
            addCriterion("email is not null");
            return (Criteria) this;
        }

        public Criteria andEmailEqualTo(String value) {
            addCriterion("email =", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotEqualTo(String value) {
            addCriterion("email <>", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThan(String value) {
            addCriterion("email >", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThanOrEqualTo(String value) {
            addCriterion("email >=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThan(String value) {
            addCriterion("email <", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThanOrEqualTo(String value) {
            addCriterion("email <=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLike(String value) {
            addCriterion("email like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotLike(String value) {
            addCriterion("email not like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailIn(List<String> values) {
            addCriterion("email in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotIn(List<String> values) {
            addCriterion("email not in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailBetween(String value1, String value2) {
            addCriterion("email between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotBetween(String value1, String value2) {
            addCriterion("email not between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andZipCodeIsNull() {
            addCriterion("zip_code is null");
            return (Criteria) this;
        }

        public Criteria andZipCodeIsNotNull() {
            addCriterion("zip_code is not null");
            return (Criteria) this;
        }

        public Criteria andZipCodeEqualTo(String value) {
            addCriterion("zip_code =", value, "zipCode");
            return (Criteria) this;
        }

        public Criteria andZipCodeNotEqualTo(String value) {
            addCriterion("zip_code <>", value, "zipCode");
            return (Criteria) this;
        }

        public Criteria andZipCodeGreaterThan(String value) {
            addCriterion("zip_code >", value, "zipCode");
            return (Criteria) this;
        }

        public Criteria andZipCodeGreaterThanOrEqualTo(String value) {
            addCriterion("zip_code >=", value, "zipCode");
            return (Criteria) this;
        }

        public Criteria andZipCodeLessThan(String value) {
            addCriterion("zip_code <", value, "zipCode");
            return (Criteria) this;
        }

        public Criteria andZipCodeLessThanOrEqualTo(String value) {
            addCriterion("zip_code <=", value, "zipCode");
            return (Criteria) this;
        }

        public Criteria andZipCodeLike(String value) {
            addCriterion("zip_code like", value, "zipCode");
            return (Criteria) this;
        }

        public Criteria andZipCodeNotLike(String value) {
            addCriterion("zip_code not like", value, "zipCode");
            return (Criteria) this;
        }

        public Criteria andZipCodeIn(List<String> values) {
            addCriterion("zip_code in", values, "zipCode");
            return (Criteria) this;
        }

        public Criteria andZipCodeNotIn(List<String> values) {
            addCriterion("zip_code not in", values, "zipCode");
            return (Criteria) this;
        }

        public Criteria andZipCodeBetween(String value1, String value2) {
            addCriterion("zip_code between", value1, value2, "zipCode");
            return (Criteria) this;
        }

        public Criteria andZipCodeNotBetween(String value1, String value2) {
            addCriterion("zip_code not between", value1, value2, "zipCode");
            return (Criteria) this;
        }

        public Criteria andWorkYearIsNull() {
            addCriterion("work_year is null");
            return (Criteria) this;
        }

        public Criteria andWorkYearIsNotNull() {
            addCriterion("work_year is not null");
            return (Criteria) this;
        }

        public Criteria andWorkYearEqualTo(String value) {
            addCriterion("work_year =", value, "workYear");
            return (Criteria) this;
        }

        public Criteria andWorkYearNotEqualTo(String value) {
            addCriterion("work_year <>", value, "workYear");
            return (Criteria) this;
        }

        public Criteria andWorkYearGreaterThan(String value) {
            addCriterion("work_year >", value, "workYear");
            return (Criteria) this;
        }

        public Criteria andWorkYearGreaterThanOrEqualTo(String value) {
            addCriterion("work_year >=", value, "workYear");
            return (Criteria) this;
        }

        public Criteria andWorkYearLessThan(String value) {
            addCriterion("work_year <", value, "workYear");
            return (Criteria) this;
        }

        public Criteria andWorkYearLessThanOrEqualTo(String value) {
            addCriterion("work_year <=", value, "workYear");
            return (Criteria) this;
        }

        public Criteria andWorkYearLike(String value) {
            addCriterion("work_year like", value, "workYear");
            return (Criteria) this;
        }

        public Criteria andWorkYearNotLike(String value) {
            addCriterion("work_year not like", value, "workYear");
            return (Criteria) this;
        }

        public Criteria andWorkYearIn(List<String> values) {
            addCriterion("work_year in", values, "workYear");
            return (Criteria) this;
        }

        public Criteria andWorkYearNotIn(List<String> values) {
            addCriterion("work_year not in", values, "workYear");
            return (Criteria) this;
        }

        public Criteria andWorkYearBetween(String value1, String value2) {
            addCriterion("work_year between", value1, value2, "workYear");
            return (Criteria) this;
        }

        public Criteria andWorkYearNotBetween(String value1, String value2) {
            addCriterion("work_year not between", value1, value2, "workYear");
            return (Criteria) this;
        }

        public Criteria andCountryCodeIsNull() {
            addCriterion("country_code is null");
            return (Criteria) this;
        }

        public Criteria andCountryCodeIsNotNull() {
            addCriterion("country_code is not null");
            return (Criteria) this;
        }

        public Criteria andCountryCodeEqualTo(String value) {
            addCriterion("country_code =", value, "countryCode");
            return (Criteria) this;
        }

        public Criteria andCountryCodeNotEqualTo(String value) {
            addCriterion("country_code <>", value, "countryCode");
            return (Criteria) this;
        }

        public Criteria andCountryCodeGreaterThan(String value) {
            addCriterion("country_code >", value, "countryCode");
            return (Criteria) this;
        }

        public Criteria andCountryCodeGreaterThanOrEqualTo(String value) {
            addCriterion("country_code >=", value, "countryCode");
            return (Criteria) this;
        }

        public Criteria andCountryCodeLessThan(String value) {
            addCriterion("country_code <", value, "countryCode");
            return (Criteria) this;
        }

        public Criteria andCountryCodeLessThanOrEqualTo(String value) {
            addCriterion("country_code <=", value, "countryCode");
            return (Criteria) this;
        }

        public Criteria andCountryCodeLike(String value) {
            addCriterion("country_code like", value, "countryCode");
            return (Criteria) this;
        }

        public Criteria andCountryCodeNotLike(String value) {
            addCriterion("country_code not like", value, "countryCode");
            return (Criteria) this;
        }

        public Criteria andCountryCodeIn(List<String> values) {
            addCriterion("country_code in", values, "countryCode");
            return (Criteria) this;
        }

        public Criteria andCountryCodeNotIn(List<String> values) {
            addCriterion("country_code not in", values, "countryCode");
            return (Criteria) this;
        }

        public Criteria andCountryCodeBetween(String value1, String value2) {
            addCriterion("country_code between", value1, value2, "countryCode");
            return (Criteria) this;
        }

        public Criteria andCountryCodeNotBetween(String value1, String value2) {
            addCriterion("country_code not between", value1, value2, "countryCode");
            return (Criteria) this;
        }

        public Criteria andProvinceCodeIsNull() {
            addCriterion("province_code is null");
            return (Criteria) this;
        }

        public Criteria andProvinceCodeIsNotNull() {
            addCriterion("province_code is not null");
            return (Criteria) this;
        }

        public Criteria andProvinceCodeEqualTo(String value) {
            addCriterion("province_code =", value, "provinceCode");
            return (Criteria) this;
        }

        public Criteria andProvinceCodeNotEqualTo(String value) {
            addCriterion("province_code <>", value, "provinceCode");
            return (Criteria) this;
        }

        public Criteria andProvinceCodeGreaterThan(String value) {
            addCriterion("province_code >", value, "provinceCode");
            return (Criteria) this;
        }

        public Criteria andProvinceCodeGreaterThanOrEqualTo(String value) {
            addCriterion("province_code >=", value, "provinceCode");
            return (Criteria) this;
        }

        public Criteria andProvinceCodeLessThan(String value) {
            addCriterion("province_code <", value, "provinceCode");
            return (Criteria) this;
        }

        public Criteria andProvinceCodeLessThanOrEqualTo(String value) {
            addCriterion("province_code <=", value, "provinceCode");
            return (Criteria) this;
        }

        public Criteria andProvinceCodeLike(String value) {
            addCriterion("province_code like", value, "provinceCode");
            return (Criteria) this;
        }

        public Criteria andProvinceCodeNotLike(String value) {
            addCriterion("province_code not like", value, "provinceCode");
            return (Criteria) this;
        }

        public Criteria andProvinceCodeIn(List<String> values) {
            addCriterion("province_code in", values, "provinceCode");
            return (Criteria) this;
        }

        public Criteria andProvinceCodeNotIn(List<String> values) {
            addCriterion("province_code not in", values, "provinceCode");
            return (Criteria) this;
        }

        public Criteria andProvinceCodeBetween(String value1, String value2) {
            addCriterion("province_code between", value1, value2, "provinceCode");
            return (Criteria) this;
        }

        public Criteria andProvinceCodeNotBetween(String value1, String value2) {
            addCriterion("province_code not between", value1, value2, "provinceCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeIsNull() {
            addCriterion("city_code is null");
            return (Criteria) this;
        }

        public Criteria andCityCodeIsNotNull() {
            addCriterion("city_code is not null");
            return (Criteria) this;
        }

        public Criteria andCityCodeEqualTo(String value) {
            addCriterion("city_code =", value, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeNotEqualTo(String value) {
            addCriterion("city_code <>", value, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeGreaterThan(String value) {
            addCriterion("city_code >", value, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeGreaterThanOrEqualTo(String value) {
            addCriterion("city_code >=", value, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeLessThan(String value) {
            addCriterion("city_code <", value, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeLessThanOrEqualTo(String value) {
            addCriterion("city_code <=", value, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeLike(String value) {
            addCriterion("city_code like", value, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeNotLike(String value) {
            addCriterion("city_code not like", value, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeIn(List<String> values) {
            addCriterion("city_code in", values, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeNotIn(List<String> values) {
            addCriterion("city_code not in", values, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeBetween(String value1, String value2) {
            addCriterion("city_code between", value1, value2, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeNotBetween(String value1, String value2) {
            addCriterion("city_code not between", value1, value2, "cityCode");
            return (Criteria) this;
        }

        public Criteria andDistrictCodeIsNull() {
            addCriterion("district_code is null");
            return (Criteria) this;
        }

        public Criteria andDistrictCodeIsNotNull() {
            addCriterion("district_code is not null");
            return (Criteria) this;
        }

        public Criteria andDistrictCodeEqualTo(String value) {
            addCriterion("district_code =", value, "districtCode");
            return (Criteria) this;
        }

        public Criteria andDistrictCodeNotEqualTo(String value) {
            addCriterion("district_code <>", value, "districtCode");
            return (Criteria) this;
        }

        public Criteria andDistrictCodeGreaterThan(String value) {
            addCriterion("district_code >", value, "districtCode");
            return (Criteria) this;
        }

        public Criteria andDistrictCodeGreaterThanOrEqualTo(String value) {
            addCriterion("district_code >=", value, "districtCode");
            return (Criteria) this;
        }

        public Criteria andDistrictCodeLessThan(String value) {
            addCriterion("district_code <", value, "districtCode");
            return (Criteria) this;
        }

        public Criteria andDistrictCodeLessThanOrEqualTo(String value) {
            addCriterion("district_code <=", value, "districtCode");
            return (Criteria) this;
        }

        public Criteria andDistrictCodeLike(String value) {
            addCriterion("district_code like", value, "districtCode");
            return (Criteria) this;
        }

        public Criteria andDistrictCodeNotLike(String value) {
            addCriterion("district_code not like", value, "districtCode");
            return (Criteria) this;
        }

        public Criteria andDistrictCodeIn(List<String> values) {
            addCriterion("district_code in", values, "districtCode");
            return (Criteria) this;
        }

        public Criteria andDistrictCodeNotIn(List<String> values) {
            addCriterion("district_code not in", values, "districtCode");
            return (Criteria) this;
        }

        public Criteria andDistrictCodeBetween(String value1, String value2) {
            addCriterion("district_code between", value1, value2, "districtCode");
            return (Criteria) this;
        }

        public Criteria andDistrictCodeNotBetween(String value1, String value2) {
            addCriterion("district_code not between", value1, value2, "districtCode");
            return (Criteria) this;
        }

        public Criteria andAddressIsNull() {
            addCriterion("address is null");
            return (Criteria) this;
        }

        public Criteria andAddressIsNotNull() {
            addCriterion("address is not null");
            return (Criteria) this;
        }

        public Criteria andAddressEqualTo(String value) {
            addCriterion("address =", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotEqualTo(String value) {
            addCriterion("address <>", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThan(String value) {
            addCriterion("address >", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThanOrEqualTo(String value) {
            addCriterion("address >=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThan(String value) {
            addCriterion("address <", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThanOrEqualTo(String value) {
            addCriterion("address <=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLike(String value) {
            addCriterion("address like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotLike(String value) {
            addCriterion("address not like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressIn(List<String> values) {
            addCriterion("address in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotIn(List<String> values) {
            addCriterion("address not in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressBetween(String value1, String value2) {
            addCriterion("address between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotBetween(String value1, String value2) {
            addCriterion("address not between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andIdTypeIsNull() {
            addCriterion("id_type is null");
            return (Criteria) this;
        }

        public Criteria andIdTypeIsNotNull() {
            addCriterion("id_type is not null");
            return (Criteria) this;
        }

        public Criteria andIdTypeEqualTo(String value) {
            addCriterion("id_type =", value, "idType");
            return (Criteria) this;
        }

        public Criteria andIdTypeNotEqualTo(String value) {
            addCriterion("id_type <>", value, "idType");
            return (Criteria) this;
        }

        public Criteria andIdTypeGreaterThan(String value) {
            addCriterion("id_type >", value, "idType");
            return (Criteria) this;
        }

        public Criteria andIdTypeGreaterThanOrEqualTo(String value) {
            addCriterion("id_type >=", value, "idType");
            return (Criteria) this;
        }

        public Criteria andIdTypeLessThan(String value) {
            addCriterion("id_type <", value, "idType");
            return (Criteria) this;
        }

        public Criteria andIdTypeLessThanOrEqualTo(String value) {
            addCriterion("id_type <=", value, "idType");
            return (Criteria) this;
        }

        public Criteria andIdTypeLike(String value) {
            addCriterion("id_type like", value, "idType");
            return (Criteria) this;
        }

        public Criteria andIdTypeNotLike(String value) {
            addCriterion("id_type not like", value, "idType");
            return (Criteria) this;
        }

        public Criteria andIdTypeIn(List<String> values) {
            addCriterion("id_type in", values, "idType");
            return (Criteria) this;
        }

        public Criteria andIdTypeNotIn(List<String> values) {
            addCriterion("id_type not in", values, "idType");
            return (Criteria) this;
        }

        public Criteria andIdTypeBetween(String value1, String value2) {
            addCriterion("id_type between", value1, value2, "idType");
            return (Criteria) this;
        }

        public Criteria andIdTypeNotBetween(String value1, String value2) {
            addCriterion("id_type not between", value1, value2, "idType");
            return (Criteria) this;
        }

        public Criteria andIdNoIsNull() {
            addCriterion("id_no is null");
            return (Criteria) this;
        }

        public Criteria andIdNoIsNotNull() {
            addCriterion("id_no is not null");
            return (Criteria) this;
        }

        public Criteria andIdNoEqualTo(String value) {
            addCriterion("id_no =", value, "idNo");
            return (Criteria) this;
        }

        public Criteria andIdNoNotEqualTo(String value) {
            addCriterion("id_no <>", value, "idNo");
            return (Criteria) this;
        }

        public Criteria andIdNoGreaterThan(String value) {
            addCriterion("id_no >", value, "idNo");
            return (Criteria) this;
        }

        public Criteria andIdNoGreaterThanOrEqualTo(String value) {
            addCriterion("id_no >=", value, "idNo");
            return (Criteria) this;
        }

        public Criteria andIdNoLessThan(String value) {
            addCriterion("id_no <", value, "idNo");
            return (Criteria) this;
        }

        public Criteria andIdNoLessThanOrEqualTo(String value) {
            addCriterion("id_no <=", value, "idNo");
            return (Criteria) this;
        }

        public Criteria andIdNoLike(String value) {
            addCriterion("id_no like", value, "idNo");
            return (Criteria) this;
        }

        public Criteria andIdNoNotLike(String value) {
            addCriterion("id_no not like", value, "idNo");
            return (Criteria) this;
        }

        public Criteria andIdNoIn(List<String> values) {
            addCriterion("id_no in", values, "idNo");
            return (Criteria) this;
        }

        public Criteria andIdNoNotIn(List<String> values) {
            addCriterion("id_no not in", values, "idNo");
            return (Criteria) this;
        }

        public Criteria andIdNoBetween(String value1, String value2) {
            addCriterion("id_no between", value1, value2, "idNo");
            return (Criteria) this;
        }

        public Criteria andIdNoNotBetween(String value1, String value2) {
            addCriterion("id_no not between", value1, value2, "idNo");
            return (Criteria) this;
        }

        public Criteria andEducationIsNull() {
            addCriterion("education is null");
            return (Criteria) this;
        }

        public Criteria andEducationIsNotNull() {
            addCriterion("education is not null");
            return (Criteria) this;
        }

        public Criteria andEducationEqualTo(String value) {
            addCriterion("education =", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationNotEqualTo(String value) {
            addCriterion("education <>", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationGreaterThan(String value) {
            addCriterion("education >", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationGreaterThanOrEqualTo(String value) {
            addCriterion("education >=", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationLessThan(String value) {
            addCriterion("education <", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationLessThanOrEqualTo(String value) {
            addCriterion("education <=", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationLike(String value) {
            addCriterion("education like", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationNotLike(String value) {
            addCriterion("education not like", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationIn(List<String> values) {
            addCriterion("education in", values, "education");
            return (Criteria) this;
        }

        public Criteria andEducationNotIn(List<String> values) {
            addCriterion("education not in", values, "education");
            return (Criteria) this;
        }

        public Criteria andEducationBetween(String value1, String value2) {
            addCriterion("education between", value1, value2, "education");
            return (Criteria) this;
        }

        public Criteria andEducationNotBetween(String value1, String value2) {
            addCriterion("education not between", value1, value2, "education");
            return (Criteria) this;
        }

        public Criteria andDegreeIsNull() {
            addCriterion("degree is null");
            return (Criteria) this;
        }

        public Criteria andDegreeIsNotNull() {
            addCriterion("degree is not null");
            return (Criteria) this;
        }

        public Criteria andDegreeEqualTo(String value) {
            addCriterion("degree =", value, "degree");
            return (Criteria) this;
        }

        public Criteria andDegreeNotEqualTo(String value) {
            addCriterion("degree <>", value, "degree");
            return (Criteria) this;
        }

        public Criteria andDegreeGreaterThan(String value) {
            addCriterion("degree >", value, "degree");
            return (Criteria) this;
        }

        public Criteria andDegreeGreaterThanOrEqualTo(String value) {
            addCriterion("degree >=", value, "degree");
            return (Criteria) this;
        }

        public Criteria andDegreeLessThan(String value) {
            addCriterion("degree <", value, "degree");
            return (Criteria) this;
        }

        public Criteria andDegreeLessThanOrEqualTo(String value) {
            addCriterion("degree <=", value, "degree");
            return (Criteria) this;
        }

        public Criteria andDegreeLike(String value) {
            addCriterion("degree like", value, "degree");
            return (Criteria) this;
        }

        public Criteria andDegreeNotLike(String value) {
            addCriterion("degree not like", value, "degree");
            return (Criteria) this;
        }

        public Criteria andDegreeIn(List<String> values) {
            addCriterion("degree in", values, "degree");
            return (Criteria) this;
        }

        public Criteria andDegreeNotIn(List<String> values) {
            addCriterion("degree not in", values, "degree");
            return (Criteria) this;
        }

        public Criteria andDegreeBetween(String value1, String value2) {
            addCriterion("degree between", value1, value2, "degree");
            return (Criteria) this;
        }

        public Criteria andDegreeNotBetween(String value1, String value2) {
            addCriterion("degree not between", value1, value2, "degree");
            return (Criteria) this;
        }

        public Criteria andGenderIsNull() {
            addCriterion("gender is null");
            return (Criteria) this;
        }

        public Criteria andGenderIsNotNull() {
            addCriterion("gender is not null");
            return (Criteria) this;
        }

        public Criteria andGenderEqualTo(String value) {
            addCriterion("gender =", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotEqualTo(String value) {
            addCriterion("gender <>", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderGreaterThan(String value) {
            addCriterion("gender >", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderGreaterThanOrEqualTo(String value) {
            addCriterion("gender >=", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderLessThan(String value) {
            addCriterion("gender <", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderLessThanOrEqualTo(String value) {
            addCriterion("gender <=", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderLike(String value) {
            addCriterion("gender like", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotLike(String value) {
            addCriterion("gender not like", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderIn(List<String> values) {
            addCriterion("gender in", values, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotIn(List<String> values) {
            addCriterion("gender not in", values, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderBetween(String value1, String value2) {
            addCriterion("gender between", value1, value2, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotBetween(String value1, String value2) {
            addCriterion("gender not between", value1, value2, "gender");
            return (Criteria) this;
        }

        public Criteria andIsActiveIsNull() {
            addCriterion("is_active is null");
            return (Criteria) this;
        }

        public Criteria andIsActiveIsNotNull() {
            addCriterion("is_active is not null");
            return (Criteria) this;
        }

        public Criteria andIsActiveEqualTo(String value) {
            addCriterion("is_active =", value, "isActive");
            return (Criteria) this;
        }

        public Criteria andIsActiveNotEqualTo(String value) {
            addCriterion("is_active <>", value, "isActive");
            return (Criteria) this;
        }

        public Criteria andIsActiveGreaterThan(String value) {
            addCriterion("is_active >", value, "isActive");
            return (Criteria) this;
        }

        public Criteria andIsActiveGreaterThanOrEqualTo(String value) {
            addCriterion("is_active >=", value, "isActive");
            return (Criteria) this;
        }

        public Criteria andIsActiveLessThan(String value) {
            addCriterion("is_active <", value, "isActive");
            return (Criteria) this;
        }

        public Criteria andIsActiveLessThanOrEqualTo(String value) {
            addCriterion("is_active <=", value, "isActive");
            return (Criteria) this;
        }

        public Criteria andIsActiveLike(String value) {
            addCriterion("is_active like", value, "isActive");
            return (Criteria) this;
        }

        public Criteria andIsActiveNotLike(String value) {
            addCriterion("is_active not like", value, "isActive");
            return (Criteria) this;
        }

        public Criteria andIsActiveIn(List<String> values) {
            addCriterion("is_active in", values, "isActive");
            return (Criteria) this;
        }

        public Criteria andIsActiveNotIn(List<String> values) {
            addCriterion("is_active not in", values, "isActive");
            return (Criteria) this;
        }

        public Criteria andIsActiveBetween(String value1, String value2) {
            addCriterion("is_active between", value1, value2, "isActive");
            return (Criteria) this;
        }

        public Criteria andIsActiveNotBetween(String value1, String value2) {
            addCriterion("is_active not between", value1, value2, "isActive");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("remark not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andUExt1IsNull() {
            addCriterion("u_ext1 is null");
            return (Criteria) this;
        }

        public Criteria andUExt1IsNotNull() {
            addCriterion("u_ext1 is not null");
            return (Criteria) this;
        }

        public Criteria andUExt1EqualTo(String value) {
            addCriterion("u_ext1 =", value, "uExt1");
            return (Criteria) this;
        }

        public Criteria andUExt1NotEqualTo(String value) {
            addCriterion("u_ext1 <>", value, "uExt1");
            return (Criteria) this;
        }

        public Criteria andUExt1GreaterThan(String value) {
            addCriterion("u_ext1 >", value, "uExt1");
            return (Criteria) this;
        }

        public Criteria andUExt1GreaterThanOrEqualTo(String value) {
            addCriterion("u_ext1 >=", value, "uExt1");
            return (Criteria) this;
        }

        public Criteria andUExt1LessThan(String value) {
            addCriterion("u_ext1 <", value, "uExt1");
            return (Criteria) this;
        }

        public Criteria andUExt1LessThanOrEqualTo(String value) {
            addCriterion("u_ext1 <=", value, "uExt1");
            return (Criteria) this;
        }

        public Criteria andUExt1Like(String value) {
            addCriterion("u_ext1 like", value, "uExt1");
            return (Criteria) this;
        }

        public Criteria andUExt1NotLike(String value) {
            addCriterion("u_ext1 not like", value, "uExt1");
            return (Criteria) this;
        }

        public Criteria andUExt1In(List<String> values) {
            addCriterion("u_ext1 in", values, "uExt1");
            return (Criteria) this;
        }

        public Criteria andUExt1NotIn(List<String> values) {
            addCriterion("u_ext1 not in", values, "uExt1");
            return (Criteria) this;
        }

        public Criteria andUExt1Between(String value1, String value2) {
            addCriterion("u_ext1 between", value1, value2, "uExt1");
            return (Criteria) this;
        }

        public Criteria andUExt1NotBetween(String value1, String value2) {
            addCriterion("u_ext1 not between", value1, value2, "uExt1");
            return (Criteria) this;
        }

        public Criteria andUExt2IsNull() {
            addCriterion("u_ext2 is null");
            return (Criteria) this;
        }

        public Criteria andUExt2IsNotNull() {
            addCriterion("u_ext2 is not null");
            return (Criteria) this;
        }

        public Criteria andUExt2EqualTo(String value) {
            addCriterion("u_ext2 =", value, "uExt2");
            return (Criteria) this;
        }

        public Criteria andUExt2NotEqualTo(String value) {
            addCriterion("u_ext2 <>", value, "uExt2");
            return (Criteria) this;
        }

        public Criteria andUExt2GreaterThan(String value) {
            addCriterion("u_ext2 >", value, "uExt2");
            return (Criteria) this;
        }

        public Criteria andUExt2GreaterThanOrEqualTo(String value) {
            addCriterion("u_ext2 >=", value, "uExt2");
            return (Criteria) this;
        }

        public Criteria andUExt2LessThan(String value) {
            addCriterion("u_ext2 <", value, "uExt2");
            return (Criteria) this;
        }

        public Criteria andUExt2LessThanOrEqualTo(String value) {
            addCriterion("u_ext2 <=", value, "uExt2");
            return (Criteria) this;
        }

        public Criteria andUExt2Like(String value) {
            addCriterion("u_ext2 like", value, "uExt2");
            return (Criteria) this;
        }

        public Criteria andUExt2NotLike(String value) {
            addCriterion("u_ext2 not like", value, "uExt2");
            return (Criteria) this;
        }

        public Criteria andUExt2In(List<String> values) {
            addCriterion("u_ext2 in", values, "uExt2");
            return (Criteria) this;
        }

        public Criteria andUExt2NotIn(List<String> values) {
            addCriterion("u_ext2 not in", values, "uExt2");
            return (Criteria) this;
        }

        public Criteria andUExt2Between(String value1, String value2) {
            addCriterion("u_ext2 between", value1, value2, "uExt2");
            return (Criteria) this;
        }

        public Criteria andUExt2NotBetween(String value1, String value2) {
            addCriterion("u_ext2 not between", value1, value2, "uExt2");
            return (Criteria) this;
        }

        public Criteria andUExt3IsNull() {
            addCriterion("u_ext3 is null");
            return (Criteria) this;
        }

        public Criteria andUExt3IsNotNull() {
            addCriterion("u_ext3 is not null");
            return (Criteria) this;
        }

        public Criteria andUExt3EqualTo(String value) {
            addCriterion("u_ext3 =", value, "uExt3");
            return (Criteria) this;
        }

        public Criteria andUExt3NotEqualTo(String value) {
            addCriterion("u_ext3 <>", value, "uExt3");
            return (Criteria) this;
        }

        public Criteria andUExt3GreaterThan(String value) {
            addCriterion("u_ext3 >", value, "uExt3");
            return (Criteria) this;
        }

        public Criteria andUExt3GreaterThanOrEqualTo(String value) {
            addCriterion("u_ext3 >=", value, "uExt3");
            return (Criteria) this;
        }

        public Criteria andUExt3LessThan(String value) {
            addCriterion("u_ext3 <", value, "uExt3");
            return (Criteria) this;
        }

        public Criteria andUExt3LessThanOrEqualTo(String value) {
            addCriterion("u_ext3 <=", value, "uExt3");
            return (Criteria) this;
        }

        public Criteria andUExt3Like(String value) {
            addCriterion("u_ext3 like", value, "uExt3");
            return (Criteria) this;
        }

        public Criteria andUExt3NotLike(String value) {
            addCriterion("u_ext3 not like", value, "uExt3");
            return (Criteria) this;
        }

        public Criteria andUExt3In(List<String> values) {
            addCriterion("u_ext3 in", values, "uExt3");
            return (Criteria) this;
        }

        public Criteria andUExt3NotIn(List<String> values) {
            addCriterion("u_ext3 not in", values, "uExt3");
            return (Criteria) this;
        }

        public Criteria andUExt3Between(String value1, String value2) {
            addCriterion("u_ext3 between", value1, value2, "uExt3");
            return (Criteria) this;
        }

        public Criteria andUExt3NotBetween(String value1, String value2) {
            addCriterion("u_ext3 not between", value1, value2, "uExt3");
            return (Criteria) this;
        }

        public Criteria andCiExt1IsNull() {
            addCriterion("ci_ext1 is null");
            return (Criteria) this;
        }

        public Criteria andCiExt1IsNotNull() {
            addCriterion("ci_ext1 is not null");
            return (Criteria) this;
        }

        public Criteria andCiExt1EqualTo(String value) {
            addCriterion("ci_ext1 =", value, "ciExt1");
            return (Criteria) this;
        }

        public Criteria andCiExt1NotEqualTo(String value) {
            addCriterion("ci_ext1 <>", value, "ciExt1");
            return (Criteria) this;
        }

        public Criteria andCiExt1GreaterThan(String value) {
            addCriterion("ci_ext1 >", value, "ciExt1");
            return (Criteria) this;
        }

        public Criteria andCiExt1GreaterThanOrEqualTo(String value) {
            addCriterion("ci_ext1 >=", value, "ciExt1");
            return (Criteria) this;
        }

        public Criteria andCiExt1LessThan(String value) {
            addCriterion("ci_ext1 <", value, "ciExt1");
            return (Criteria) this;
        }

        public Criteria andCiExt1LessThanOrEqualTo(String value) {
            addCriterion("ci_ext1 <=", value, "ciExt1");
            return (Criteria) this;
        }

        public Criteria andCiExt1Like(String value) {
            addCriterion("ci_ext1 like", value, "ciExt1");
            return (Criteria) this;
        }

        public Criteria andCiExt1NotLike(String value) {
            addCriterion("ci_ext1 not like", value, "ciExt1");
            return (Criteria) this;
        }

        public Criteria andCiExt1In(List<String> values) {
            addCriterion("ci_ext1 in", values, "ciExt1");
            return (Criteria) this;
        }

        public Criteria andCiExt1NotIn(List<String> values) {
            addCriterion("ci_ext1 not in", values, "ciExt1");
            return (Criteria) this;
        }

        public Criteria andCiExt1Between(String value1, String value2) {
            addCriterion("ci_ext1 between", value1, value2, "ciExt1");
            return (Criteria) this;
        }

        public Criteria andCiExt1NotBetween(String value1, String value2) {
            addCriterion("ci_ext1 not between", value1, value2, "ciExt1");
            return (Criteria) this;
        }

        public Criteria andCiExt2IsNull() {
            addCriterion("ci_ext2 is null");
            return (Criteria) this;
        }

        public Criteria andCiExt2IsNotNull() {
            addCriterion("ci_ext2 is not null");
            return (Criteria) this;
        }

        public Criteria andCiExt2EqualTo(String value) {
            addCriterion("ci_ext2 =", value, "ciExt2");
            return (Criteria) this;
        }

        public Criteria andCiExt2NotEqualTo(String value) {
            addCriterion("ci_ext2 <>", value, "ciExt2");
            return (Criteria) this;
        }

        public Criteria andCiExt2GreaterThan(String value) {
            addCriterion("ci_ext2 >", value, "ciExt2");
            return (Criteria) this;
        }

        public Criteria andCiExt2GreaterThanOrEqualTo(String value) {
            addCriterion("ci_ext2 >=", value, "ciExt2");
            return (Criteria) this;
        }

        public Criteria andCiExt2LessThan(String value) {
            addCriterion("ci_ext2 <", value, "ciExt2");
            return (Criteria) this;
        }

        public Criteria andCiExt2LessThanOrEqualTo(String value) {
            addCriterion("ci_ext2 <=", value, "ciExt2");
            return (Criteria) this;
        }

        public Criteria andCiExt2Like(String value) {
            addCriterion("ci_ext2 like", value, "ciExt2");
            return (Criteria) this;
        }

        public Criteria andCiExt2NotLike(String value) {
            addCriterion("ci_ext2 not like", value, "ciExt2");
            return (Criteria) this;
        }

        public Criteria andCiExt2In(List<String> values) {
            addCriterion("ci_ext2 in", values, "ciExt2");
            return (Criteria) this;
        }

        public Criteria andCiExt2NotIn(List<String> values) {
            addCriterion("ci_ext2 not in", values, "ciExt2");
            return (Criteria) this;
        }

        public Criteria andCiExt2Between(String value1, String value2) {
            addCriterion("ci_ext2 between", value1, value2, "ciExt2");
            return (Criteria) this;
        }

        public Criteria andCiExt2NotBetween(String value1, String value2) {
            addCriterion("ci_ext2 not between", value1, value2, "ciExt2");
            return (Criteria) this;
        }

        public Criteria andCiExt3IsNull() {
            addCriterion("ci_ext3 is null");
            return (Criteria) this;
        }

        public Criteria andCiExt3IsNotNull() {
            addCriterion("ci_ext3 is not null");
            return (Criteria) this;
        }

        public Criteria andCiExt3EqualTo(String value) {
            addCriterion("ci_ext3 =", value, "ciExt3");
            return (Criteria) this;
        }

        public Criteria andCiExt3NotEqualTo(String value) {
            addCriterion("ci_ext3 <>", value, "ciExt3");
            return (Criteria) this;
        }

        public Criteria andCiExt3GreaterThan(String value) {
            addCriterion("ci_ext3 >", value, "ciExt3");
            return (Criteria) this;
        }

        public Criteria andCiExt3GreaterThanOrEqualTo(String value) {
            addCriterion("ci_ext3 >=", value, "ciExt3");
            return (Criteria) this;
        }

        public Criteria andCiExt3LessThan(String value) {
            addCriterion("ci_ext3 <", value, "ciExt3");
            return (Criteria) this;
        }

        public Criteria andCiExt3LessThanOrEqualTo(String value) {
            addCriterion("ci_ext3 <=", value, "ciExt3");
            return (Criteria) this;
        }

        public Criteria andCiExt3Like(String value) {
            addCriterion("ci_ext3 like", value, "ciExt3");
            return (Criteria) this;
        }

        public Criteria andCiExt3NotLike(String value) {
            addCriterion("ci_ext3 not like", value, "ciExt3");
            return (Criteria) this;
        }

        public Criteria andCiExt3In(List<String> values) {
            addCriterion("ci_ext3 in", values, "ciExt3");
            return (Criteria) this;
        }

        public Criteria andCiExt3NotIn(List<String> values) {
            addCriterion("ci_ext3 not in", values, "ciExt3");
            return (Criteria) this;
        }

        public Criteria andCiExt3Between(String value1, String value2) {
            addCriterion("ci_ext3 between", value1, value2, "ciExt3");
            return (Criteria) this;
        }

        public Criteria andCiExt3NotBetween(String value1, String value2) {
            addCriterion("ci_ext3 not between", value1, value2, "ciExt3");
            return (Criteria) this;
        }

        public Criteria andCiExt4IsNull() {
            addCriterion("ci_ext4 is null");
            return (Criteria) this;
        }

        public Criteria andCiExt4IsNotNull() {
            addCriterion("ci_ext4 is not null");
            return (Criteria) this;
        }

        public Criteria andCiExt4EqualTo(String value) {
            addCriterion("ci_ext4 =", value, "ciExt4");
            return (Criteria) this;
        }

        public Criteria andCiExt4NotEqualTo(String value) {
            addCriterion("ci_ext4 <>", value, "ciExt4");
            return (Criteria) this;
        }

        public Criteria andCiExt4GreaterThan(String value) {
            addCriterion("ci_ext4 >", value, "ciExt4");
            return (Criteria) this;
        }

        public Criteria andCiExt4GreaterThanOrEqualTo(String value) {
            addCriterion("ci_ext4 >=", value, "ciExt4");
            return (Criteria) this;
        }

        public Criteria andCiExt4LessThan(String value) {
            addCriterion("ci_ext4 <", value, "ciExt4");
            return (Criteria) this;
        }

        public Criteria andCiExt4LessThanOrEqualTo(String value) {
            addCriterion("ci_ext4 <=", value, "ciExt4");
            return (Criteria) this;
        }

        public Criteria andCiExt4Like(String value) {
            addCriterion("ci_ext4 like", value, "ciExt4");
            return (Criteria) this;
        }

        public Criteria andCiExt4NotLike(String value) {
            addCriterion("ci_ext4 not like", value, "ciExt4");
            return (Criteria) this;
        }

        public Criteria andCiExt4In(List<String> values) {
            addCriterion("ci_ext4 in", values, "ciExt4");
            return (Criteria) this;
        }

        public Criteria andCiExt4NotIn(List<String> values) {
            addCriterion("ci_ext4 not in", values, "ciExt4");
            return (Criteria) this;
        }

        public Criteria andCiExt4Between(String value1, String value2) {
            addCriterion("ci_ext4 between", value1, value2, "ciExt4");
            return (Criteria) this;
        }

        public Criteria andCiExt4NotBetween(String value1, String value2) {
            addCriterion("ci_ext4 not between", value1, value2, "ciExt4");
            return (Criteria) this;
        }

        public Criteria andCiExt5IsNull() {
            addCriterion("ci_ext5 is null");
            return (Criteria) this;
        }

        public Criteria andCiExt5IsNotNull() {
            addCriterion("ci_ext5 is not null");
            return (Criteria) this;
        }

        public Criteria andCiExt5EqualTo(String value) {
            addCriterion("ci_ext5 =", value, "ciExt5");
            return (Criteria) this;
        }

        public Criteria andCiExt5NotEqualTo(String value) {
            addCriterion("ci_ext5 <>", value, "ciExt5");
            return (Criteria) this;
        }

        public Criteria andCiExt5GreaterThan(String value) {
            addCriterion("ci_ext5 >", value, "ciExt5");
            return (Criteria) this;
        }

        public Criteria andCiExt5GreaterThanOrEqualTo(String value) {
            addCriterion("ci_ext5 >=", value, "ciExt5");
            return (Criteria) this;
        }

        public Criteria andCiExt5LessThan(String value) {
            addCriterion("ci_ext5 <", value, "ciExt5");
            return (Criteria) this;
        }

        public Criteria andCiExt5LessThanOrEqualTo(String value) {
            addCriterion("ci_ext5 <=", value, "ciExt5");
            return (Criteria) this;
        }

        public Criteria andCiExt5Like(String value) {
            addCriterion("ci_ext5 like", value, "ciExt5");
            return (Criteria) this;
        }

        public Criteria andCiExt5NotLike(String value) {
            addCriterion("ci_ext5 not like", value, "ciExt5");
            return (Criteria) this;
        }

        public Criteria andCiExt5In(List<String> values) {
            addCriterion("ci_ext5 in", values, "ciExt5");
            return (Criteria) this;
        }

        public Criteria andCiExt5NotIn(List<String> values) {
            addCriterion("ci_ext5 not in", values, "ciExt5");
            return (Criteria) this;
        }

        public Criteria andCiExt5Between(String value1, String value2) {
            addCriterion("ci_ext5 between", value1, value2, "ciExt5");
            return (Criteria) this;
        }

        public Criteria andCiExt5NotBetween(String value1, String value2) {
            addCriterion("ci_ext5 not between", value1, value2, "ciExt5");
            return (Criteria) this;
        }

        public Criteria andUiExt1IsNull() {
            addCriterion("ui_ext1 is null");
            return (Criteria) this;
        }

        public Criteria andUiExt1IsNotNull() {
            addCriterion("ui_ext1 is not null");
            return (Criteria) this;
        }

        public Criteria andUiExt1EqualTo(String value) {
            addCriterion("ui_ext1 =", value, "uiExt1");
            return (Criteria) this;
        }

        public Criteria andUiExt1NotEqualTo(String value) {
            addCriterion("ui_ext1 <>", value, "uiExt1");
            return (Criteria) this;
        }

        public Criteria andUiExt1GreaterThan(String value) {
            addCriterion("ui_ext1 >", value, "uiExt1");
            return (Criteria) this;
        }

        public Criteria andUiExt1GreaterThanOrEqualTo(String value) {
            addCriterion("ui_ext1 >=", value, "uiExt1");
            return (Criteria) this;
        }

        public Criteria andUiExt1LessThan(String value) {
            addCriterion("ui_ext1 <", value, "uiExt1");
            return (Criteria) this;
        }

        public Criteria andUiExt1LessThanOrEqualTo(String value) {
            addCriterion("ui_ext1 <=", value, "uiExt1");
            return (Criteria) this;
        }

        public Criteria andUiExt1Like(String value) {
            addCriterion("ui_ext1 like", value, "uiExt1");
            return (Criteria) this;
        }

        public Criteria andUiExt1NotLike(String value) {
            addCriterion("ui_ext1 not like", value, "uiExt1");
            return (Criteria) this;
        }

        public Criteria andUiExt1In(List<String> values) {
            addCriterion("ui_ext1 in", values, "uiExt1");
            return (Criteria) this;
        }

        public Criteria andUiExt1NotIn(List<String> values) {
            addCriterion("ui_ext1 not in", values, "uiExt1");
            return (Criteria) this;
        }

        public Criteria andUiExt1Between(String value1, String value2) {
            addCriterion("ui_ext1 between", value1, value2, "uiExt1");
            return (Criteria) this;
        }

        public Criteria andUiExt1NotBetween(String value1, String value2) {
            addCriterion("ui_ext1 not between", value1, value2, "uiExt1");
            return (Criteria) this;
        }

        public Criteria andUiExt2IsNull() {
            addCriterion("ui_ext2 is null");
            return (Criteria) this;
        }

        public Criteria andUiExt2IsNotNull() {
            addCriterion("ui_ext2 is not null");
            return (Criteria) this;
        }

        public Criteria andUiExt2EqualTo(String value) {
            addCriterion("ui_ext2 =", value, "uiExt2");
            return (Criteria) this;
        }

        public Criteria andUiExt2NotEqualTo(String value) {
            addCriterion("ui_ext2 <>", value, "uiExt2");
            return (Criteria) this;
        }

        public Criteria andUiExt2GreaterThan(String value) {
            addCriterion("ui_ext2 >", value, "uiExt2");
            return (Criteria) this;
        }

        public Criteria andUiExt2GreaterThanOrEqualTo(String value) {
            addCriterion("ui_ext2 >=", value, "uiExt2");
            return (Criteria) this;
        }

        public Criteria andUiExt2LessThan(String value) {
            addCriterion("ui_ext2 <", value, "uiExt2");
            return (Criteria) this;
        }

        public Criteria andUiExt2LessThanOrEqualTo(String value) {
            addCriterion("ui_ext2 <=", value, "uiExt2");
            return (Criteria) this;
        }

        public Criteria andUiExt2Like(String value) {
            addCriterion("ui_ext2 like", value, "uiExt2");
            return (Criteria) this;
        }

        public Criteria andUiExt2NotLike(String value) {
            addCriterion("ui_ext2 not like", value, "uiExt2");
            return (Criteria) this;
        }

        public Criteria andUiExt2In(List<String> values) {
            addCriterion("ui_ext2 in", values, "uiExt2");
            return (Criteria) this;
        }

        public Criteria andUiExt2NotIn(List<String> values) {
            addCriterion("ui_ext2 not in", values, "uiExt2");
            return (Criteria) this;
        }

        public Criteria andUiExt2Between(String value1, String value2) {
            addCriterion("ui_ext2 between", value1, value2, "uiExt2");
            return (Criteria) this;
        }

        public Criteria andUiExt2NotBetween(String value1, String value2) {
            addCriterion("ui_ext2 not between", value1, value2, "uiExt2");
            return (Criteria) this;
        }

        public Criteria andUiExt3IsNull() {
            addCriterion("ui_ext3 is null");
            return (Criteria) this;
        }

        public Criteria andUiExt3IsNotNull() {
            addCriterion("ui_ext3 is not null");
            return (Criteria) this;
        }

        public Criteria andUiExt3EqualTo(String value) {
            addCriterion("ui_ext3 =", value, "uiExt3");
            return (Criteria) this;
        }

        public Criteria andUiExt3NotEqualTo(String value) {
            addCriterion("ui_ext3 <>", value, "uiExt3");
            return (Criteria) this;
        }

        public Criteria andUiExt3GreaterThan(String value) {
            addCriterion("ui_ext3 >", value, "uiExt3");
            return (Criteria) this;
        }

        public Criteria andUiExt3GreaterThanOrEqualTo(String value) {
            addCriterion("ui_ext3 >=", value, "uiExt3");
            return (Criteria) this;
        }

        public Criteria andUiExt3LessThan(String value) {
            addCriterion("ui_ext3 <", value, "uiExt3");
            return (Criteria) this;
        }

        public Criteria andUiExt3LessThanOrEqualTo(String value) {
            addCriterion("ui_ext3 <=", value, "uiExt3");
            return (Criteria) this;
        }

        public Criteria andUiExt3Like(String value) {
            addCriterion("ui_ext3 like", value, "uiExt3");
            return (Criteria) this;
        }

        public Criteria andUiExt3NotLike(String value) {
            addCriterion("ui_ext3 not like", value, "uiExt3");
            return (Criteria) this;
        }

        public Criteria andUiExt3In(List<String> values) {
            addCriterion("ui_ext3 in", values, "uiExt3");
            return (Criteria) this;
        }

        public Criteria andUiExt3NotIn(List<String> values) {
            addCriterion("ui_ext3 not in", values, "uiExt3");
            return (Criteria) this;
        }

        public Criteria andUiExt3Between(String value1, String value2) {
            addCriterion("ui_ext3 between", value1, value2, "uiExt3");
            return (Criteria) this;
        }

        public Criteria andUiExt3NotBetween(String value1, String value2) {
            addCriterion("ui_ext3 not between", value1, value2, "uiExt3");
            return (Criteria) this;
        }

        public Criteria andUiExt4IsNull() {
            addCriterion("ui_ext4 is null");
            return (Criteria) this;
        }

        public Criteria andUiExt4IsNotNull() {
            addCriterion("ui_ext4 is not null");
            return (Criteria) this;
        }

        public Criteria andUiExt4EqualTo(String value) {
            addCriterion("ui_ext4 =", value, "uiExt4");
            return (Criteria) this;
        }

        public Criteria andUiExt4NotEqualTo(String value) {
            addCriterion("ui_ext4 <>", value, "uiExt4");
            return (Criteria) this;
        }

        public Criteria andUiExt4GreaterThan(String value) {
            addCriterion("ui_ext4 >", value, "uiExt4");
            return (Criteria) this;
        }

        public Criteria andUiExt4GreaterThanOrEqualTo(String value) {
            addCriterion("ui_ext4 >=", value, "uiExt4");
            return (Criteria) this;
        }

        public Criteria andUiExt4LessThan(String value) {
            addCriterion("ui_ext4 <", value, "uiExt4");
            return (Criteria) this;
        }

        public Criteria andUiExt4LessThanOrEqualTo(String value) {
            addCriterion("ui_ext4 <=", value, "uiExt4");
            return (Criteria) this;
        }

        public Criteria andUiExt4Like(String value) {
            addCriterion("ui_ext4 like", value, "uiExt4");
            return (Criteria) this;
        }

        public Criteria andUiExt4NotLike(String value) {
            addCriterion("ui_ext4 not like", value, "uiExt4");
            return (Criteria) this;
        }

        public Criteria andUiExt4In(List<String> values) {
            addCriterion("ui_ext4 in", values, "uiExt4");
            return (Criteria) this;
        }

        public Criteria andUiExt4NotIn(List<String> values) {
            addCriterion("ui_ext4 not in", values, "uiExt4");
            return (Criteria) this;
        }

        public Criteria andUiExt4Between(String value1, String value2) {
            addCriterion("ui_ext4 between", value1, value2, "uiExt4");
            return (Criteria) this;
        }

        public Criteria andUiExt4NotBetween(String value1, String value2) {
            addCriterion("ui_ext4 not between", value1, value2, "uiExt4");
            return (Criteria) this;
        }

        public Criteria andUiExt5IsNull() {
            addCriterion("ui_ext5 is null");
            return (Criteria) this;
        }

        public Criteria andUiExt5IsNotNull() {
            addCriterion("ui_ext5 is not null");
            return (Criteria) this;
        }

        public Criteria andUiExt5EqualTo(String value) {
            addCriterion("ui_ext5 =", value, "uiExt5");
            return (Criteria) this;
        }

        public Criteria andUiExt5NotEqualTo(String value) {
            addCriterion("ui_ext5 <>", value, "uiExt5");
            return (Criteria) this;
        }

        public Criteria andUiExt5GreaterThan(String value) {
            addCriterion("ui_ext5 >", value, "uiExt5");
            return (Criteria) this;
        }

        public Criteria andUiExt5GreaterThanOrEqualTo(String value) {
            addCriterion("ui_ext5 >=", value, "uiExt5");
            return (Criteria) this;
        }

        public Criteria andUiExt5LessThan(String value) {
            addCriterion("ui_ext5 <", value, "uiExt5");
            return (Criteria) this;
        }

        public Criteria andUiExt5LessThanOrEqualTo(String value) {
            addCriterion("ui_ext5 <=", value, "uiExt5");
            return (Criteria) this;
        }

        public Criteria andUiExt5Like(String value) {
            addCriterion("ui_ext5 like", value, "uiExt5");
            return (Criteria) this;
        }

        public Criteria andUiExt5NotLike(String value) {
            addCriterion("ui_ext5 not like", value, "uiExt5");
            return (Criteria) this;
        }

        public Criteria andUiExt5In(List<String> values) {
            addCriterion("ui_ext5 in", values, "uiExt5");
            return (Criteria) this;
        }

        public Criteria andUiExt5NotIn(List<String> values) {
            addCriterion("ui_ext5 not in", values, "uiExt5");
            return (Criteria) this;
        }

        public Criteria andUiExt5Between(String value1, String value2) {
            addCriterion("ui_ext5 between", value1, value2, "uiExt5");
            return (Criteria) this;
        }

        public Criteria andUiExt5NotBetween(String value1, String value2) {
            addCriterion("ui_ext5 not between", value1, value2, "uiExt5");
            return (Criteria) this;
        }

        public Criteria andGmtCreateIsNull() {
            addCriterion("gmt_create is null");
            return (Criteria) this;
        }

        public Criteria andGmtCreateIsNotNull() {
            addCriterion("gmt_create is not null");
            return (Criteria) this;
        }

        public Criteria andGmtCreateEqualTo(Date value) {
            addCriterion("gmt_create =", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateNotEqualTo(Date value) {
            addCriterion("gmt_create <>", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateGreaterThan(Date value) {
            addCriterion("gmt_create >", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateGreaterThanOrEqualTo(Date value) {
            addCriterion("gmt_create >=", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateLessThan(Date value) {
            addCriterion("gmt_create <", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateLessThanOrEqualTo(Date value) {
            addCriterion("gmt_create <=", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateIn(List<Date> values) {
            addCriterion("gmt_create in", values, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateNotIn(List<Date> values) {
            addCriterion("gmt_create not in", values, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateBetween(Date value1, Date value2) {
            addCriterion("gmt_create between", value1, value2, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateNotBetween(Date value1, Date value2) {
            addCriterion("gmt_create not between", value1, value2, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtModifyIsNull() {
            addCriterion("gmt_modify is null");
            return (Criteria) this;
        }

        public Criteria andGmtModifyIsNotNull() {
            addCriterion("gmt_modify is not null");
            return (Criteria) this;
        }

        public Criteria andGmtModifyEqualTo(Date value) {
            addCriterion("gmt_modify =", value, "gmtModify");
            return (Criteria) this;
        }

        public Criteria andGmtModifyNotEqualTo(Date value) {
            addCriterion("gmt_modify <>", value, "gmtModify");
            return (Criteria) this;
        }

        public Criteria andGmtModifyGreaterThan(Date value) {
            addCriterion("gmt_modify >", value, "gmtModify");
            return (Criteria) this;
        }

        public Criteria andGmtModifyGreaterThanOrEqualTo(Date value) {
            addCriterion("gmt_modify >=", value, "gmtModify");
            return (Criteria) this;
        }

        public Criteria andGmtModifyLessThan(Date value) {
            addCriterion("gmt_modify <", value, "gmtModify");
            return (Criteria) this;
        }

        public Criteria andGmtModifyLessThanOrEqualTo(Date value) {
            addCriterion("gmt_modify <=", value, "gmtModify");
            return (Criteria) this;
        }

        public Criteria andGmtModifyIn(List<Date> values) {
            addCriterion("gmt_modify in", values, "gmtModify");
            return (Criteria) this;
        }

        public Criteria andGmtModifyNotIn(List<Date> values) {
            addCriterion("gmt_modify not in", values, "gmtModify");
            return (Criteria) this;
        }

        public Criteria andGmtModifyBetween(Date value1, Date value2) {
            addCriterion("gmt_modify between", value1, value2, "gmtModify");
            return (Criteria) this;
        }

        public Criteria andGmtModifyNotBetween(Date value1, Date value2) {
            addCriterion("gmt_modify not between", value1, value2, "gmtModify");
            return (Criteria) this;
        }

        public Criteria andExchangeIdIsNull() {
            addCriterion("exchange_id is null");
            return (Criteria) this;
        }

        public Criteria andExchangeIdIsNotNull() {
            addCriterion("exchange_id is not null");
            return (Criteria) this;
        }

        public Criteria andExchangeIdEqualTo(Integer value) {
            addCriterion("exchange_id =", value, "exchangeId");
            return (Criteria) this;
        }

        public Criteria andExchangeIdNotEqualTo(Integer value) {
            addCriterion("exchange_id <>", value, "exchangeId");
            return (Criteria) this;
        }

        public Criteria andExchangeIdGreaterThan(Integer value) {
            addCriterion("exchange_id >", value, "exchangeId");
            return (Criteria) this;
        }

        public Criteria andExchangeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("exchange_id >=", value, "exchangeId");
            return (Criteria) this;
        }

        public Criteria andExchangeIdLessThan(Integer value) {
            addCriterion("exchange_id <", value, "exchangeId");
            return (Criteria) this;
        }

        public Criteria andExchangeIdLessThanOrEqualTo(Integer value) {
            addCriterion("exchange_id <=", value, "exchangeId");
            return (Criteria) this;
        }

        public Criteria andExchangeIdIn(List<Integer> values) {
            addCriterion("exchange_id in", values, "exchangeId");
            return (Criteria) this;
        }

        public Criteria andExchangeIdNotIn(List<Integer> values) {
            addCriterion("exchange_id not in", values, "exchangeId");
            return (Criteria) this;
        }

        public Criteria andExchangeIdBetween(Integer value1, Integer value2) {
            addCriterion("exchange_id between", value1, value2, "exchangeId");
            return (Criteria) this;
        }

        public Criteria andExchangeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("exchange_id not between", value1, value2, "exchangeId");
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
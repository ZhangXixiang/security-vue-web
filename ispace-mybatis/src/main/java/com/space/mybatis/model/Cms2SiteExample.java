package com.space.mybatis.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Cms2SiteExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public Cms2SiteExample() {
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

        public Criteria andConfigIdIsNull() {
            addCriterion("CONFIG_ID is null");
            return (Criteria) this;
        }

        public Criteria andConfigIdIsNotNull() {
            addCriterion("CONFIG_ID is not null");
            return (Criteria) this;
        }

        public Criteria andConfigIdEqualTo(Long value) {
            addCriterion("CONFIG_ID =", value, "configId");
            return (Criteria) this;
        }

        public Criteria andConfigIdNotEqualTo(Long value) {
            addCriterion("CONFIG_ID <>", value, "configId");
            return (Criteria) this;
        }

        public Criteria andConfigIdGreaterThan(Long value) {
            addCriterion("CONFIG_ID >", value, "configId");
            return (Criteria) this;
        }

        public Criteria andConfigIdGreaterThanOrEqualTo(Long value) {
            addCriterion("CONFIG_ID >=", value, "configId");
            return (Criteria) this;
        }

        public Criteria andConfigIdLessThan(Long value) {
            addCriterion("CONFIG_ID <", value, "configId");
            return (Criteria) this;
        }

        public Criteria andConfigIdLessThanOrEqualTo(Long value) {
            addCriterion("CONFIG_ID <=", value, "configId");
            return (Criteria) this;
        }

        public Criteria andConfigIdIn(List<Long> values) {
            addCriterion("CONFIG_ID in", values, "configId");
            return (Criteria) this;
        }

        public Criteria andConfigIdNotIn(List<Long> values) {
            addCriterion("CONFIG_ID not in", values, "configId");
            return (Criteria) this;
        }

        public Criteria andConfigIdBetween(Long value1, Long value2) {
            addCriterion("CONFIG_ID between", value1, value2, "configId");
            return (Criteria) this;
        }

        public Criteria andConfigIdNotBetween(Long value1, Long value2) {
            addCriterion("CONFIG_ID not between", value1, value2, "configId");
            return (Criteria) this;
        }

        public Criteria andFtpUploadIdIsNull() {
            addCriterion("FTP_UPLOAD_ID is null");
            return (Criteria) this;
        }

        public Criteria andFtpUploadIdIsNotNull() {
            addCriterion("FTP_UPLOAD_ID is not null");
            return (Criteria) this;
        }

        public Criteria andFtpUploadIdEqualTo(Long value) {
            addCriterion("FTP_UPLOAD_ID =", value, "ftpUploadId");
            return (Criteria) this;
        }

        public Criteria andFtpUploadIdNotEqualTo(Long value) {
            addCriterion("FTP_UPLOAD_ID <>", value, "ftpUploadId");
            return (Criteria) this;
        }

        public Criteria andFtpUploadIdGreaterThan(Long value) {
            addCriterion("FTP_UPLOAD_ID >", value, "ftpUploadId");
            return (Criteria) this;
        }

        public Criteria andFtpUploadIdGreaterThanOrEqualTo(Long value) {
            addCriterion("FTP_UPLOAD_ID >=", value, "ftpUploadId");
            return (Criteria) this;
        }

        public Criteria andFtpUploadIdLessThan(Long value) {
            addCriterion("FTP_UPLOAD_ID <", value, "ftpUploadId");
            return (Criteria) this;
        }

        public Criteria andFtpUploadIdLessThanOrEqualTo(Long value) {
            addCriterion("FTP_UPLOAD_ID <=", value, "ftpUploadId");
            return (Criteria) this;
        }

        public Criteria andFtpUploadIdIn(List<Long> values) {
            addCriterion("FTP_UPLOAD_ID in", values, "ftpUploadId");
            return (Criteria) this;
        }

        public Criteria andFtpUploadIdNotIn(List<Long> values) {
            addCriterion("FTP_UPLOAD_ID not in", values, "ftpUploadId");
            return (Criteria) this;
        }

        public Criteria andFtpUploadIdBetween(Long value1, Long value2) {
            addCriterion("FTP_UPLOAD_ID between", value1, value2, "ftpUploadId");
            return (Criteria) this;
        }

        public Criteria andFtpUploadIdNotBetween(Long value1, Long value2) {
            addCriterion("FTP_UPLOAD_ID not between", value1, value2, "ftpUploadId");
            return (Criteria) this;
        }

        public Criteria andDomainIsNull() {
            addCriterion("DOMAIN is null");
            return (Criteria) this;
        }

        public Criteria andDomainIsNotNull() {
            addCriterion("DOMAIN is not null");
            return (Criteria) this;
        }

        public Criteria andDomainEqualTo(String value) {
            addCriterion("DOMAIN =", value, "domain");
            return (Criteria) this;
        }

        public Criteria andDomainNotEqualTo(String value) {
            addCriterion("DOMAIN <>", value, "domain");
            return (Criteria) this;
        }

        public Criteria andDomainGreaterThan(String value) {
            addCriterion("DOMAIN >", value, "domain");
            return (Criteria) this;
        }

        public Criteria andDomainGreaterThanOrEqualTo(String value) {
            addCriterion("DOMAIN >=", value, "domain");
            return (Criteria) this;
        }

        public Criteria andDomainLessThan(String value) {
            addCriterion("DOMAIN <", value, "domain");
            return (Criteria) this;
        }

        public Criteria andDomainLessThanOrEqualTo(String value) {
            addCriterion("DOMAIN <=", value, "domain");
            return (Criteria) this;
        }

        public Criteria andDomainLike(String value) {
            addCriterion("DOMAIN like", value, "domain");
            return (Criteria) this;
        }

        public Criteria andDomainNotLike(String value) {
            addCriterion("DOMAIN not like", value, "domain");
            return (Criteria) this;
        }

        public Criteria andDomainIn(List<String> values) {
            addCriterion("DOMAIN in", values, "domain");
            return (Criteria) this;
        }

        public Criteria andDomainNotIn(List<String> values) {
            addCriterion("DOMAIN not in", values, "domain");
            return (Criteria) this;
        }

        public Criteria andDomainBetween(String value1, String value2) {
            addCriterion("DOMAIN between", value1, value2, "domain");
            return (Criteria) this;
        }

        public Criteria andDomainNotBetween(String value1, String value2) {
            addCriterion("DOMAIN not between", value1, value2, "domain");
            return (Criteria) this;
        }

        public Criteria andSitePathIsNull() {
            addCriterion("SITE_PATH is null");
            return (Criteria) this;
        }

        public Criteria andSitePathIsNotNull() {
            addCriterion("SITE_PATH is not null");
            return (Criteria) this;
        }

        public Criteria andSitePathEqualTo(String value) {
            addCriterion("SITE_PATH =", value, "sitePath");
            return (Criteria) this;
        }

        public Criteria andSitePathNotEqualTo(String value) {
            addCriterion("SITE_PATH <>", value, "sitePath");
            return (Criteria) this;
        }

        public Criteria andSitePathGreaterThan(String value) {
            addCriterion("SITE_PATH >", value, "sitePath");
            return (Criteria) this;
        }

        public Criteria andSitePathGreaterThanOrEqualTo(String value) {
            addCriterion("SITE_PATH >=", value, "sitePath");
            return (Criteria) this;
        }

        public Criteria andSitePathLessThan(String value) {
            addCriterion("SITE_PATH <", value, "sitePath");
            return (Criteria) this;
        }

        public Criteria andSitePathLessThanOrEqualTo(String value) {
            addCriterion("SITE_PATH <=", value, "sitePath");
            return (Criteria) this;
        }

        public Criteria andSitePathLike(String value) {
            addCriterion("SITE_PATH like", value, "sitePath");
            return (Criteria) this;
        }

        public Criteria andSitePathNotLike(String value) {
            addCriterion("SITE_PATH not like", value, "sitePath");
            return (Criteria) this;
        }

        public Criteria andSitePathIn(List<String> values) {
            addCriterion("SITE_PATH in", values, "sitePath");
            return (Criteria) this;
        }

        public Criteria andSitePathNotIn(List<String> values) {
            addCriterion("SITE_PATH not in", values, "sitePath");
            return (Criteria) this;
        }

        public Criteria andSitePathBetween(String value1, String value2) {
            addCriterion("SITE_PATH between", value1, value2, "sitePath");
            return (Criteria) this;
        }

        public Criteria andSitePathNotBetween(String value1, String value2) {
            addCriterion("SITE_PATH not between", value1, value2, "sitePath");
            return (Criteria) this;
        }

        public Criteria andSiteNameIsNull() {
            addCriterion("SITE_NAME is null");
            return (Criteria) this;
        }

        public Criteria andSiteNameIsNotNull() {
            addCriterion("SITE_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andSiteNameEqualTo(String value) {
            addCriterion("SITE_NAME =", value, "siteName");
            return (Criteria) this;
        }

        public Criteria andSiteNameNotEqualTo(String value) {
            addCriterion("SITE_NAME <>", value, "siteName");
            return (Criteria) this;
        }

        public Criteria andSiteNameGreaterThan(String value) {
            addCriterion("SITE_NAME >", value, "siteName");
            return (Criteria) this;
        }

        public Criteria andSiteNameGreaterThanOrEqualTo(String value) {
            addCriterion("SITE_NAME >=", value, "siteName");
            return (Criteria) this;
        }

        public Criteria andSiteNameLessThan(String value) {
            addCriterion("SITE_NAME <", value, "siteName");
            return (Criteria) this;
        }

        public Criteria andSiteNameLessThanOrEqualTo(String value) {
            addCriterion("SITE_NAME <=", value, "siteName");
            return (Criteria) this;
        }

        public Criteria andSiteNameLike(String value) {
            addCriterion("SITE_NAME like", value, "siteName");
            return (Criteria) this;
        }

        public Criteria andSiteNameNotLike(String value) {
            addCriterion("SITE_NAME not like", value, "siteName");
            return (Criteria) this;
        }

        public Criteria andSiteNameIn(List<String> values) {
            addCriterion("SITE_NAME in", values, "siteName");
            return (Criteria) this;
        }

        public Criteria andSiteNameNotIn(List<String> values) {
            addCriterion("SITE_NAME not in", values, "siteName");
            return (Criteria) this;
        }

        public Criteria andSiteNameBetween(String value1, String value2) {
            addCriterion("SITE_NAME between", value1, value2, "siteName");
            return (Criteria) this;
        }

        public Criteria andSiteNameNotBetween(String value1, String value2) {
            addCriterion("SITE_NAME not between", value1, value2, "siteName");
            return (Criteria) this;
        }

        public Criteria andShortNameIsNull() {
            addCriterion("SHORT_NAME is null");
            return (Criteria) this;
        }

        public Criteria andShortNameIsNotNull() {
            addCriterion("SHORT_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andShortNameEqualTo(String value) {
            addCriterion("SHORT_NAME =", value, "shortName");
            return (Criteria) this;
        }

        public Criteria andShortNameNotEqualTo(String value) {
            addCriterion("SHORT_NAME <>", value, "shortName");
            return (Criteria) this;
        }

        public Criteria andShortNameGreaterThan(String value) {
            addCriterion("SHORT_NAME >", value, "shortName");
            return (Criteria) this;
        }

        public Criteria andShortNameGreaterThanOrEqualTo(String value) {
            addCriterion("SHORT_NAME >=", value, "shortName");
            return (Criteria) this;
        }

        public Criteria andShortNameLessThan(String value) {
            addCriterion("SHORT_NAME <", value, "shortName");
            return (Criteria) this;
        }

        public Criteria andShortNameLessThanOrEqualTo(String value) {
            addCriterion("SHORT_NAME <=", value, "shortName");
            return (Criteria) this;
        }

        public Criteria andShortNameLike(String value) {
            addCriterion("SHORT_NAME like", value, "shortName");
            return (Criteria) this;
        }

        public Criteria andShortNameNotLike(String value) {
            addCriterion("SHORT_NAME not like", value, "shortName");
            return (Criteria) this;
        }

        public Criteria andShortNameIn(List<String> values) {
            addCriterion("SHORT_NAME in", values, "shortName");
            return (Criteria) this;
        }

        public Criteria andShortNameNotIn(List<String> values) {
            addCriterion("SHORT_NAME not in", values, "shortName");
            return (Criteria) this;
        }

        public Criteria andShortNameBetween(String value1, String value2) {
            addCriterion("SHORT_NAME between", value1, value2, "shortName");
            return (Criteria) this;
        }

        public Criteria andShortNameNotBetween(String value1, String value2) {
            addCriterion("SHORT_NAME not between", value1, value2, "shortName");
            return (Criteria) this;
        }

        public Criteria andProtocolIsNull() {
            addCriterion("PROTOCOL is null");
            return (Criteria) this;
        }

        public Criteria andProtocolIsNotNull() {
            addCriterion("PROTOCOL is not null");
            return (Criteria) this;
        }

        public Criteria andProtocolEqualTo(String value) {
            addCriterion("PROTOCOL =", value, "protocol");
            return (Criteria) this;
        }

        public Criteria andProtocolNotEqualTo(String value) {
            addCriterion("PROTOCOL <>", value, "protocol");
            return (Criteria) this;
        }

        public Criteria andProtocolGreaterThan(String value) {
            addCriterion("PROTOCOL >", value, "protocol");
            return (Criteria) this;
        }

        public Criteria andProtocolGreaterThanOrEqualTo(String value) {
            addCriterion("PROTOCOL >=", value, "protocol");
            return (Criteria) this;
        }

        public Criteria andProtocolLessThan(String value) {
            addCriterion("PROTOCOL <", value, "protocol");
            return (Criteria) this;
        }

        public Criteria andProtocolLessThanOrEqualTo(String value) {
            addCriterion("PROTOCOL <=", value, "protocol");
            return (Criteria) this;
        }

        public Criteria andProtocolLike(String value) {
            addCriterion("PROTOCOL like", value, "protocol");
            return (Criteria) this;
        }

        public Criteria andProtocolNotLike(String value) {
            addCriterion("PROTOCOL not like", value, "protocol");
            return (Criteria) this;
        }

        public Criteria andProtocolIn(List<String> values) {
            addCriterion("PROTOCOL in", values, "protocol");
            return (Criteria) this;
        }

        public Criteria andProtocolNotIn(List<String> values) {
            addCriterion("PROTOCOL not in", values, "protocol");
            return (Criteria) this;
        }

        public Criteria andProtocolBetween(String value1, String value2) {
            addCriterion("PROTOCOL between", value1, value2, "protocol");
            return (Criteria) this;
        }

        public Criteria andProtocolNotBetween(String value1, String value2) {
            addCriterion("PROTOCOL not between", value1, value2, "protocol");
            return (Criteria) this;
        }

        public Criteria andDynamicSuffixIsNull() {
            addCriterion("DYNAMIC_SUFFIX is null");
            return (Criteria) this;
        }

        public Criteria andDynamicSuffixIsNotNull() {
            addCriterion("DYNAMIC_SUFFIX is not null");
            return (Criteria) this;
        }

        public Criteria andDynamicSuffixEqualTo(String value) {
            addCriterion("DYNAMIC_SUFFIX =", value, "dynamicSuffix");
            return (Criteria) this;
        }

        public Criteria andDynamicSuffixNotEqualTo(String value) {
            addCriterion("DYNAMIC_SUFFIX <>", value, "dynamicSuffix");
            return (Criteria) this;
        }

        public Criteria andDynamicSuffixGreaterThan(String value) {
            addCriterion("DYNAMIC_SUFFIX >", value, "dynamicSuffix");
            return (Criteria) this;
        }

        public Criteria andDynamicSuffixGreaterThanOrEqualTo(String value) {
            addCriterion("DYNAMIC_SUFFIX >=", value, "dynamicSuffix");
            return (Criteria) this;
        }

        public Criteria andDynamicSuffixLessThan(String value) {
            addCriterion("DYNAMIC_SUFFIX <", value, "dynamicSuffix");
            return (Criteria) this;
        }

        public Criteria andDynamicSuffixLessThanOrEqualTo(String value) {
            addCriterion("DYNAMIC_SUFFIX <=", value, "dynamicSuffix");
            return (Criteria) this;
        }

        public Criteria andDynamicSuffixLike(String value) {
            addCriterion("DYNAMIC_SUFFIX like", value, "dynamicSuffix");
            return (Criteria) this;
        }

        public Criteria andDynamicSuffixNotLike(String value) {
            addCriterion("DYNAMIC_SUFFIX not like", value, "dynamicSuffix");
            return (Criteria) this;
        }

        public Criteria andDynamicSuffixIn(List<String> values) {
            addCriterion("DYNAMIC_SUFFIX in", values, "dynamicSuffix");
            return (Criteria) this;
        }

        public Criteria andDynamicSuffixNotIn(List<String> values) {
            addCriterion("DYNAMIC_SUFFIX not in", values, "dynamicSuffix");
            return (Criteria) this;
        }

        public Criteria andDynamicSuffixBetween(String value1, String value2) {
            addCriterion("DYNAMIC_SUFFIX between", value1, value2, "dynamicSuffix");
            return (Criteria) this;
        }

        public Criteria andDynamicSuffixNotBetween(String value1, String value2) {
            addCriterion("DYNAMIC_SUFFIX not between", value1, value2, "dynamicSuffix");
            return (Criteria) this;
        }

        public Criteria andStaticSuffixIsNull() {
            addCriterion("STATIC_SUFFIX is null");
            return (Criteria) this;
        }

        public Criteria andStaticSuffixIsNotNull() {
            addCriterion("STATIC_SUFFIX is not null");
            return (Criteria) this;
        }

        public Criteria andStaticSuffixEqualTo(String value) {
            addCriterion("STATIC_SUFFIX =", value, "staticSuffix");
            return (Criteria) this;
        }

        public Criteria andStaticSuffixNotEqualTo(String value) {
            addCriterion("STATIC_SUFFIX <>", value, "staticSuffix");
            return (Criteria) this;
        }

        public Criteria andStaticSuffixGreaterThan(String value) {
            addCriterion("STATIC_SUFFIX >", value, "staticSuffix");
            return (Criteria) this;
        }

        public Criteria andStaticSuffixGreaterThanOrEqualTo(String value) {
            addCriterion("STATIC_SUFFIX >=", value, "staticSuffix");
            return (Criteria) this;
        }

        public Criteria andStaticSuffixLessThan(String value) {
            addCriterion("STATIC_SUFFIX <", value, "staticSuffix");
            return (Criteria) this;
        }

        public Criteria andStaticSuffixLessThanOrEqualTo(String value) {
            addCriterion("STATIC_SUFFIX <=", value, "staticSuffix");
            return (Criteria) this;
        }

        public Criteria andStaticSuffixLike(String value) {
            addCriterion("STATIC_SUFFIX like", value, "staticSuffix");
            return (Criteria) this;
        }

        public Criteria andStaticSuffixNotLike(String value) {
            addCriterion("STATIC_SUFFIX not like", value, "staticSuffix");
            return (Criteria) this;
        }

        public Criteria andStaticSuffixIn(List<String> values) {
            addCriterion("STATIC_SUFFIX in", values, "staticSuffix");
            return (Criteria) this;
        }

        public Criteria andStaticSuffixNotIn(List<String> values) {
            addCriterion("STATIC_SUFFIX not in", values, "staticSuffix");
            return (Criteria) this;
        }

        public Criteria andStaticSuffixBetween(String value1, String value2) {
            addCriterion("STATIC_SUFFIX between", value1, value2, "staticSuffix");
            return (Criteria) this;
        }

        public Criteria andStaticSuffixNotBetween(String value1, String value2) {
            addCriterion("STATIC_SUFFIX not between", value1, value2, "staticSuffix");
            return (Criteria) this;
        }

        public Criteria andStaticDirIsNull() {
            addCriterion("STATIC_DIR is null");
            return (Criteria) this;
        }

        public Criteria andStaticDirIsNotNull() {
            addCriterion("STATIC_DIR is not null");
            return (Criteria) this;
        }

        public Criteria andStaticDirEqualTo(String value) {
            addCriterion("STATIC_DIR =", value, "staticDir");
            return (Criteria) this;
        }

        public Criteria andStaticDirNotEqualTo(String value) {
            addCriterion("STATIC_DIR <>", value, "staticDir");
            return (Criteria) this;
        }

        public Criteria andStaticDirGreaterThan(String value) {
            addCriterion("STATIC_DIR >", value, "staticDir");
            return (Criteria) this;
        }

        public Criteria andStaticDirGreaterThanOrEqualTo(String value) {
            addCriterion("STATIC_DIR >=", value, "staticDir");
            return (Criteria) this;
        }

        public Criteria andStaticDirLessThan(String value) {
            addCriterion("STATIC_DIR <", value, "staticDir");
            return (Criteria) this;
        }

        public Criteria andStaticDirLessThanOrEqualTo(String value) {
            addCriterion("STATIC_DIR <=", value, "staticDir");
            return (Criteria) this;
        }

        public Criteria andStaticDirLike(String value) {
            addCriterion("STATIC_DIR like", value, "staticDir");
            return (Criteria) this;
        }

        public Criteria andStaticDirNotLike(String value) {
            addCriterion("STATIC_DIR not like", value, "staticDir");
            return (Criteria) this;
        }

        public Criteria andStaticDirIn(List<String> values) {
            addCriterion("STATIC_DIR in", values, "staticDir");
            return (Criteria) this;
        }

        public Criteria andStaticDirNotIn(List<String> values) {
            addCriterion("STATIC_DIR not in", values, "staticDir");
            return (Criteria) this;
        }

        public Criteria andStaticDirBetween(String value1, String value2) {
            addCriterion("STATIC_DIR between", value1, value2, "staticDir");
            return (Criteria) this;
        }

        public Criteria andStaticDirNotBetween(String value1, String value2) {
            addCriterion("STATIC_DIR not between", value1, value2, "staticDir");
            return (Criteria) this;
        }

        public Criteria andIsIndexToRootIsNull() {
            addCriterion("IS_INDEX_TO_ROOT is null");
            return (Criteria) this;
        }

        public Criteria andIsIndexToRootIsNotNull() {
            addCriterion("IS_INDEX_TO_ROOT is not null");
            return (Criteria) this;
        }

        public Criteria andIsIndexToRootEqualTo(Long value) {
            addCriterion("IS_INDEX_TO_ROOT =", value, "isIndexToRoot");
            return (Criteria) this;
        }

        public Criteria andIsIndexToRootNotEqualTo(Long value) {
            addCriterion("IS_INDEX_TO_ROOT <>", value, "isIndexToRoot");
            return (Criteria) this;
        }

        public Criteria andIsIndexToRootGreaterThan(Long value) {
            addCriterion("IS_INDEX_TO_ROOT >", value, "isIndexToRoot");
            return (Criteria) this;
        }

        public Criteria andIsIndexToRootGreaterThanOrEqualTo(Long value) {
            addCriterion("IS_INDEX_TO_ROOT >=", value, "isIndexToRoot");
            return (Criteria) this;
        }

        public Criteria andIsIndexToRootLessThan(Long value) {
            addCriterion("IS_INDEX_TO_ROOT <", value, "isIndexToRoot");
            return (Criteria) this;
        }

        public Criteria andIsIndexToRootLessThanOrEqualTo(Long value) {
            addCriterion("IS_INDEX_TO_ROOT <=", value, "isIndexToRoot");
            return (Criteria) this;
        }

        public Criteria andIsIndexToRootIn(List<Long> values) {
            addCriterion("IS_INDEX_TO_ROOT in", values, "isIndexToRoot");
            return (Criteria) this;
        }

        public Criteria andIsIndexToRootNotIn(List<Long> values) {
            addCriterion("IS_INDEX_TO_ROOT not in", values, "isIndexToRoot");
            return (Criteria) this;
        }

        public Criteria andIsIndexToRootBetween(Long value1, Long value2) {
            addCriterion("IS_INDEX_TO_ROOT between", value1, value2, "isIndexToRoot");
            return (Criteria) this;
        }

        public Criteria andIsIndexToRootNotBetween(Long value1, Long value2) {
            addCriterion("IS_INDEX_TO_ROOT not between", value1, value2, "isIndexToRoot");
            return (Criteria) this;
        }

        public Criteria andIsStaticIndexIsNull() {
            addCriterion("IS_STATIC_INDEX is null");
            return (Criteria) this;
        }

        public Criteria andIsStaticIndexIsNotNull() {
            addCriterion("IS_STATIC_INDEX is not null");
            return (Criteria) this;
        }

        public Criteria andIsStaticIndexEqualTo(Long value) {
            addCriterion("IS_STATIC_INDEX =", value, "isStaticIndex");
            return (Criteria) this;
        }

        public Criteria andIsStaticIndexNotEqualTo(Long value) {
            addCriterion("IS_STATIC_INDEX <>", value, "isStaticIndex");
            return (Criteria) this;
        }

        public Criteria andIsStaticIndexGreaterThan(Long value) {
            addCriterion("IS_STATIC_INDEX >", value, "isStaticIndex");
            return (Criteria) this;
        }

        public Criteria andIsStaticIndexGreaterThanOrEqualTo(Long value) {
            addCriterion("IS_STATIC_INDEX >=", value, "isStaticIndex");
            return (Criteria) this;
        }

        public Criteria andIsStaticIndexLessThan(Long value) {
            addCriterion("IS_STATIC_INDEX <", value, "isStaticIndex");
            return (Criteria) this;
        }

        public Criteria andIsStaticIndexLessThanOrEqualTo(Long value) {
            addCriterion("IS_STATIC_INDEX <=", value, "isStaticIndex");
            return (Criteria) this;
        }

        public Criteria andIsStaticIndexIn(List<Long> values) {
            addCriterion("IS_STATIC_INDEX in", values, "isStaticIndex");
            return (Criteria) this;
        }

        public Criteria andIsStaticIndexNotIn(List<Long> values) {
            addCriterion("IS_STATIC_INDEX not in", values, "isStaticIndex");
            return (Criteria) this;
        }

        public Criteria andIsStaticIndexBetween(Long value1, Long value2) {
            addCriterion("IS_STATIC_INDEX between", value1, value2, "isStaticIndex");
            return (Criteria) this;
        }

        public Criteria andIsStaticIndexNotBetween(Long value1, Long value2) {
            addCriterion("IS_STATIC_INDEX not between", value1, value2, "isStaticIndex");
            return (Criteria) this;
        }

        public Criteria andLocaleAdminIsNull() {
            addCriterion("LOCALE_ADMIN is null");
            return (Criteria) this;
        }

        public Criteria andLocaleAdminIsNotNull() {
            addCriterion("LOCALE_ADMIN is not null");
            return (Criteria) this;
        }

        public Criteria andLocaleAdminEqualTo(String value) {
            addCriterion("LOCALE_ADMIN =", value, "localeAdmin");
            return (Criteria) this;
        }

        public Criteria andLocaleAdminNotEqualTo(String value) {
            addCriterion("LOCALE_ADMIN <>", value, "localeAdmin");
            return (Criteria) this;
        }

        public Criteria andLocaleAdminGreaterThan(String value) {
            addCriterion("LOCALE_ADMIN >", value, "localeAdmin");
            return (Criteria) this;
        }

        public Criteria andLocaleAdminGreaterThanOrEqualTo(String value) {
            addCriterion("LOCALE_ADMIN >=", value, "localeAdmin");
            return (Criteria) this;
        }

        public Criteria andLocaleAdminLessThan(String value) {
            addCriterion("LOCALE_ADMIN <", value, "localeAdmin");
            return (Criteria) this;
        }

        public Criteria andLocaleAdminLessThanOrEqualTo(String value) {
            addCriterion("LOCALE_ADMIN <=", value, "localeAdmin");
            return (Criteria) this;
        }

        public Criteria andLocaleAdminLike(String value) {
            addCriterion("LOCALE_ADMIN like", value, "localeAdmin");
            return (Criteria) this;
        }

        public Criteria andLocaleAdminNotLike(String value) {
            addCriterion("LOCALE_ADMIN not like", value, "localeAdmin");
            return (Criteria) this;
        }

        public Criteria andLocaleAdminIn(List<String> values) {
            addCriterion("LOCALE_ADMIN in", values, "localeAdmin");
            return (Criteria) this;
        }

        public Criteria andLocaleAdminNotIn(List<String> values) {
            addCriterion("LOCALE_ADMIN not in", values, "localeAdmin");
            return (Criteria) this;
        }

        public Criteria andLocaleAdminBetween(String value1, String value2) {
            addCriterion("LOCALE_ADMIN between", value1, value2, "localeAdmin");
            return (Criteria) this;
        }

        public Criteria andLocaleAdminNotBetween(String value1, String value2) {
            addCriterion("LOCALE_ADMIN not between", value1, value2, "localeAdmin");
            return (Criteria) this;
        }

        public Criteria andLocaleFrontIsNull() {
            addCriterion("LOCALE_FRONT is null");
            return (Criteria) this;
        }

        public Criteria andLocaleFrontIsNotNull() {
            addCriterion("LOCALE_FRONT is not null");
            return (Criteria) this;
        }

        public Criteria andLocaleFrontEqualTo(String value) {
            addCriterion("LOCALE_FRONT =", value, "localeFront");
            return (Criteria) this;
        }

        public Criteria andLocaleFrontNotEqualTo(String value) {
            addCriterion("LOCALE_FRONT <>", value, "localeFront");
            return (Criteria) this;
        }

        public Criteria andLocaleFrontGreaterThan(String value) {
            addCriterion("LOCALE_FRONT >", value, "localeFront");
            return (Criteria) this;
        }

        public Criteria andLocaleFrontGreaterThanOrEqualTo(String value) {
            addCriterion("LOCALE_FRONT >=", value, "localeFront");
            return (Criteria) this;
        }

        public Criteria andLocaleFrontLessThan(String value) {
            addCriterion("LOCALE_FRONT <", value, "localeFront");
            return (Criteria) this;
        }

        public Criteria andLocaleFrontLessThanOrEqualTo(String value) {
            addCriterion("LOCALE_FRONT <=", value, "localeFront");
            return (Criteria) this;
        }

        public Criteria andLocaleFrontLike(String value) {
            addCriterion("LOCALE_FRONT like", value, "localeFront");
            return (Criteria) this;
        }

        public Criteria andLocaleFrontNotLike(String value) {
            addCriterion("LOCALE_FRONT not like", value, "localeFront");
            return (Criteria) this;
        }

        public Criteria andLocaleFrontIn(List<String> values) {
            addCriterion("LOCALE_FRONT in", values, "localeFront");
            return (Criteria) this;
        }

        public Criteria andLocaleFrontNotIn(List<String> values) {
            addCriterion("LOCALE_FRONT not in", values, "localeFront");
            return (Criteria) this;
        }

        public Criteria andLocaleFrontBetween(String value1, String value2) {
            addCriterion("LOCALE_FRONT between", value1, value2, "localeFront");
            return (Criteria) this;
        }

        public Criteria andLocaleFrontNotBetween(String value1, String value2) {
            addCriterion("LOCALE_FRONT not between", value1, value2, "localeFront");
            return (Criteria) this;
        }

        public Criteria andTplSolutionIsNull() {
            addCriterion("TPL_SOLUTION is null");
            return (Criteria) this;
        }

        public Criteria andTplSolutionIsNotNull() {
            addCriterion("TPL_SOLUTION is not null");
            return (Criteria) this;
        }

        public Criteria andTplSolutionEqualTo(String value) {
            addCriterion("TPL_SOLUTION =", value, "tplSolution");
            return (Criteria) this;
        }

        public Criteria andTplSolutionNotEqualTo(String value) {
            addCriterion("TPL_SOLUTION <>", value, "tplSolution");
            return (Criteria) this;
        }

        public Criteria andTplSolutionGreaterThan(String value) {
            addCriterion("TPL_SOLUTION >", value, "tplSolution");
            return (Criteria) this;
        }

        public Criteria andTplSolutionGreaterThanOrEqualTo(String value) {
            addCriterion("TPL_SOLUTION >=", value, "tplSolution");
            return (Criteria) this;
        }

        public Criteria andTplSolutionLessThan(String value) {
            addCriterion("TPL_SOLUTION <", value, "tplSolution");
            return (Criteria) this;
        }

        public Criteria andTplSolutionLessThanOrEqualTo(String value) {
            addCriterion("TPL_SOLUTION <=", value, "tplSolution");
            return (Criteria) this;
        }

        public Criteria andTplSolutionLike(String value) {
            addCriterion("TPL_SOLUTION like", value, "tplSolution");
            return (Criteria) this;
        }

        public Criteria andTplSolutionNotLike(String value) {
            addCriterion("TPL_SOLUTION not like", value, "tplSolution");
            return (Criteria) this;
        }

        public Criteria andTplSolutionIn(List<String> values) {
            addCriterion("TPL_SOLUTION in", values, "tplSolution");
            return (Criteria) this;
        }

        public Criteria andTplSolutionNotIn(List<String> values) {
            addCriterion("TPL_SOLUTION not in", values, "tplSolution");
            return (Criteria) this;
        }

        public Criteria andTplSolutionBetween(String value1, String value2) {
            addCriterion("TPL_SOLUTION between", value1, value2, "tplSolution");
            return (Criteria) this;
        }

        public Criteria andTplSolutionNotBetween(String value1, String value2) {
            addCriterion("TPL_SOLUTION not between", value1, value2, "tplSolution");
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

        public Criteria andIsRelativePathIsNull() {
            addCriterion("IS_RELATIVE_PATH is null");
            return (Criteria) this;
        }

        public Criteria andIsRelativePathIsNotNull() {
            addCriterion("IS_RELATIVE_PATH is not null");
            return (Criteria) this;
        }

        public Criteria andIsRelativePathEqualTo(Long value) {
            addCriterion("IS_RELATIVE_PATH =", value, "isRelativePath");
            return (Criteria) this;
        }

        public Criteria andIsRelativePathNotEqualTo(Long value) {
            addCriterion("IS_RELATIVE_PATH <>", value, "isRelativePath");
            return (Criteria) this;
        }

        public Criteria andIsRelativePathGreaterThan(Long value) {
            addCriterion("IS_RELATIVE_PATH >", value, "isRelativePath");
            return (Criteria) this;
        }

        public Criteria andIsRelativePathGreaterThanOrEqualTo(Long value) {
            addCriterion("IS_RELATIVE_PATH >=", value, "isRelativePath");
            return (Criteria) this;
        }

        public Criteria andIsRelativePathLessThan(Long value) {
            addCriterion("IS_RELATIVE_PATH <", value, "isRelativePath");
            return (Criteria) this;
        }

        public Criteria andIsRelativePathLessThanOrEqualTo(Long value) {
            addCriterion("IS_RELATIVE_PATH <=", value, "isRelativePath");
            return (Criteria) this;
        }

        public Criteria andIsRelativePathIn(List<Long> values) {
            addCriterion("IS_RELATIVE_PATH in", values, "isRelativePath");
            return (Criteria) this;
        }

        public Criteria andIsRelativePathNotIn(List<Long> values) {
            addCriterion("IS_RELATIVE_PATH not in", values, "isRelativePath");
            return (Criteria) this;
        }

        public Criteria andIsRelativePathBetween(Long value1, Long value2) {
            addCriterion("IS_RELATIVE_PATH between", value1, value2, "isRelativePath");
            return (Criteria) this;
        }

        public Criteria andIsRelativePathNotBetween(Long value1, Long value2) {
            addCriterion("IS_RELATIVE_PATH not between", value1, value2, "isRelativePath");
            return (Criteria) this;
        }

        public Criteria andIsRecycleOnIsNull() {
            addCriterion("IS_RECYCLE_ON is null");
            return (Criteria) this;
        }

        public Criteria andIsRecycleOnIsNotNull() {
            addCriterion("IS_RECYCLE_ON is not null");
            return (Criteria) this;
        }

        public Criteria andIsRecycleOnEqualTo(Long value) {
            addCriterion("IS_RECYCLE_ON =", value, "isRecycleOn");
            return (Criteria) this;
        }

        public Criteria andIsRecycleOnNotEqualTo(Long value) {
            addCriterion("IS_RECYCLE_ON <>", value, "isRecycleOn");
            return (Criteria) this;
        }

        public Criteria andIsRecycleOnGreaterThan(Long value) {
            addCriterion("IS_RECYCLE_ON >", value, "isRecycleOn");
            return (Criteria) this;
        }

        public Criteria andIsRecycleOnGreaterThanOrEqualTo(Long value) {
            addCriterion("IS_RECYCLE_ON >=", value, "isRecycleOn");
            return (Criteria) this;
        }

        public Criteria andIsRecycleOnLessThan(Long value) {
            addCriterion("IS_RECYCLE_ON <", value, "isRecycleOn");
            return (Criteria) this;
        }

        public Criteria andIsRecycleOnLessThanOrEqualTo(Long value) {
            addCriterion("IS_RECYCLE_ON <=", value, "isRecycleOn");
            return (Criteria) this;
        }

        public Criteria andIsRecycleOnIn(List<Long> values) {
            addCriterion("IS_RECYCLE_ON in", values, "isRecycleOn");
            return (Criteria) this;
        }

        public Criteria andIsRecycleOnNotIn(List<Long> values) {
            addCriterion("IS_RECYCLE_ON not in", values, "isRecycleOn");
            return (Criteria) this;
        }

        public Criteria andIsRecycleOnBetween(Long value1, Long value2) {
            addCriterion("IS_RECYCLE_ON between", value1, value2, "isRecycleOn");
            return (Criteria) this;
        }

        public Criteria andIsRecycleOnNotBetween(Long value1, Long value2) {
            addCriterion("IS_RECYCLE_ON not between", value1, value2, "isRecycleOn");
            return (Criteria) this;
        }

        public Criteria andStaticRangeIsNull() {
            addCriterion("STATIC_RANGE is null");
            return (Criteria) this;
        }

        public Criteria andStaticRangeIsNotNull() {
            addCriterion("STATIC_RANGE is not null");
            return (Criteria) this;
        }

        public Criteria andStaticRangeEqualTo(Long value) {
            addCriterion("STATIC_RANGE =", value, "staticRange");
            return (Criteria) this;
        }

        public Criteria andStaticRangeNotEqualTo(Long value) {
            addCriterion("STATIC_RANGE <>", value, "staticRange");
            return (Criteria) this;
        }

        public Criteria andStaticRangeGreaterThan(Long value) {
            addCriterion("STATIC_RANGE >", value, "staticRange");
            return (Criteria) this;
        }

        public Criteria andStaticRangeGreaterThanOrEqualTo(Long value) {
            addCriterion("STATIC_RANGE >=", value, "staticRange");
            return (Criteria) this;
        }

        public Criteria andStaticRangeLessThan(Long value) {
            addCriterion("STATIC_RANGE <", value, "staticRange");
            return (Criteria) this;
        }

        public Criteria andStaticRangeLessThanOrEqualTo(Long value) {
            addCriterion("STATIC_RANGE <=", value, "staticRange");
            return (Criteria) this;
        }

        public Criteria andStaticRangeIn(List<Long> values) {
            addCriterion("STATIC_RANGE in", values, "staticRange");
            return (Criteria) this;
        }

        public Criteria andStaticRangeNotIn(List<Long> values) {
            addCriterion("STATIC_RANGE not in", values, "staticRange");
            return (Criteria) this;
        }

        public Criteria andStaticRangeBetween(Long value1, Long value2) {
            addCriterion("STATIC_RANGE between", value1, value2, "staticRange");
            return (Criteria) this;
        }

        public Criteria andStaticRangeNotBetween(Long value1, Long value2) {
            addCriterion("STATIC_RANGE not between", value1, value2, "staticRange");
            return (Criteria) this;
        }

        public Criteria andStaticPageIsNull() {
            addCriterion("STATIC_PAGE is null");
            return (Criteria) this;
        }

        public Criteria andStaticPageIsNotNull() {
            addCriterion("STATIC_PAGE is not null");
            return (Criteria) this;
        }

        public Criteria andStaticPageEqualTo(Long value) {
            addCriterion("STATIC_PAGE =", value, "staticPage");
            return (Criteria) this;
        }

        public Criteria andStaticPageNotEqualTo(Long value) {
            addCriterion("STATIC_PAGE <>", value, "staticPage");
            return (Criteria) this;
        }

        public Criteria andStaticPageGreaterThan(Long value) {
            addCriterion("STATIC_PAGE >", value, "staticPage");
            return (Criteria) this;
        }

        public Criteria andStaticPageGreaterThanOrEqualTo(Long value) {
            addCriterion("STATIC_PAGE >=", value, "staticPage");
            return (Criteria) this;
        }

        public Criteria andStaticPageLessThan(Long value) {
            addCriterion("STATIC_PAGE <", value, "staticPage");
            return (Criteria) this;
        }

        public Criteria andStaticPageLessThanOrEqualTo(Long value) {
            addCriterion("STATIC_PAGE <=", value, "staticPage");
            return (Criteria) this;
        }

        public Criteria andStaticPageIn(List<Long> values) {
            addCriterion("STATIC_PAGE in", values, "staticPage");
            return (Criteria) this;
        }

        public Criteria andStaticPageNotIn(List<Long> values) {
            addCriterion("STATIC_PAGE not in", values, "staticPage");
            return (Criteria) this;
        }

        public Criteria andStaticPageBetween(Long value1, Long value2) {
            addCriterion("STATIC_PAGE between", value1, value2, "staticPage");
            return (Criteria) this;
        }

        public Criteria andStaticPageNotBetween(Long value1, Long value2) {
            addCriterion("STATIC_PAGE not between", value1, value2, "staticPage");
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

        public Criteria andOverReviewIsNull() {
            addCriterion("OVER_REVIEW is null");
            return (Criteria) this;
        }

        public Criteria andOverReviewIsNotNull() {
            addCriterion("OVER_REVIEW is not null");
            return (Criteria) this;
        }

        public Criteria andOverReviewEqualTo(Long value) {
            addCriterion("OVER_REVIEW =", value, "overReview");
            return (Criteria) this;
        }

        public Criteria andOverReviewNotEqualTo(Long value) {
            addCriterion("OVER_REVIEW <>", value, "overReview");
            return (Criteria) this;
        }

        public Criteria andOverReviewGreaterThan(Long value) {
            addCriterion("OVER_REVIEW >", value, "overReview");
            return (Criteria) this;
        }

        public Criteria andOverReviewGreaterThanOrEqualTo(Long value) {
            addCriterion("OVER_REVIEW >=", value, "overReview");
            return (Criteria) this;
        }

        public Criteria andOverReviewLessThan(Long value) {
            addCriterion("OVER_REVIEW <", value, "overReview");
            return (Criteria) this;
        }

        public Criteria andOverReviewLessThanOrEqualTo(Long value) {
            addCriterion("OVER_REVIEW <=", value, "overReview");
            return (Criteria) this;
        }

        public Criteria andOverReviewIn(List<Long> values) {
            addCriterion("OVER_REVIEW in", values, "overReview");
            return (Criteria) this;
        }

        public Criteria andOverReviewNotIn(List<Long> values) {
            addCriterion("OVER_REVIEW not in", values, "overReview");
            return (Criteria) this;
        }

        public Criteria andOverReviewBetween(Long value1, Long value2) {
            addCriterion("OVER_REVIEW between", value1, value2, "overReview");
            return (Criteria) this;
        }

        public Criteria andOverReviewNotBetween(Long value1, Long value2) {
            addCriterion("OVER_REVIEW not between", value1, value2, "overReview");
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
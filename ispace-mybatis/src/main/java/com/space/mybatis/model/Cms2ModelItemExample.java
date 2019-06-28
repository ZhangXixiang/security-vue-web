package com.space.mybatis.model;

import java.util.ArrayList;
import java.util.List;

public class Cms2ModelItemExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public Cms2ModelItemExample() {
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

        public Criteria andModelIdIsNull() {
            addCriterion("MODEL_ID is null");
            return (Criteria) this;
        }

        public Criteria andModelIdIsNotNull() {
            addCriterion("MODEL_ID is not null");
            return (Criteria) this;
        }

        public Criteria andModelIdEqualTo(Long value) {
            addCriterion("MODEL_ID =", value, "modelId");
            return (Criteria) this;
        }

        public Criteria andModelIdNotEqualTo(Long value) {
            addCriterion("MODEL_ID <>", value, "modelId");
            return (Criteria) this;
        }

        public Criteria andModelIdGreaterThan(Long value) {
            addCriterion("MODEL_ID >", value, "modelId");
            return (Criteria) this;
        }

        public Criteria andModelIdGreaterThanOrEqualTo(Long value) {
            addCriterion("MODEL_ID >=", value, "modelId");
            return (Criteria) this;
        }

        public Criteria andModelIdLessThan(Long value) {
            addCriterion("MODEL_ID <", value, "modelId");
            return (Criteria) this;
        }

        public Criteria andModelIdLessThanOrEqualTo(Long value) {
            addCriterion("MODEL_ID <=", value, "modelId");
            return (Criteria) this;
        }

        public Criteria andModelIdIn(List<Long> values) {
            addCriterion("MODEL_ID in", values, "modelId");
            return (Criteria) this;
        }

        public Criteria andModelIdNotIn(List<Long> values) {
            addCriterion("MODEL_ID not in", values, "modelId");
            return (Criteria) this;
        }

        public Criteria andModelIdBetween(Long value1, Long value2) {
            addCriterion("MODEL_ID between", value1, value2, "modelId");
            return (Criteria) this;
        }

        public Criteria andModelIdNotBetween(Long value1, Long value2) {
            addCriterion("MODEL_ID not between", value1, value2, "modelId");
            return (Criteria) this;
        }

        public Criteria andFieldIsNull() {
            addCriterion("FIELD is null");
            return (Criteria) this;
        }

        public Criteria andFieldIsNotNull() {
            addCriterion("FIELD is not null");
            return (Criteria) this;
        }

        public Criteria andFieldEqualTo(String value) {
            addCriterion("FIELD =", value, "field");
            return (Criteria) this;
        }

        public Criteria andFieldNotEqualTo(String value) {
            addCriterion("FIELD <>", value, "field");
            return (Criteria) this;
        }

        public Criteria andFieldGreaterThan(String value) {
            addCriterion("FIELD >", value, "field");
            return (Criteria) this;
        }

        public Criteria andFieldGreaterThanOrEqualTo(String value) {
            addCriterion("FIELD >=", value, "field");
            return (Criteria) this;
        }

        public Criteria andFieldLessThan(String value) {
            addCriterion("FIELD <", value, "field");
            return (Criteria) this;
        }

        public Criteria andFieldLessThanOrEqualTo(String value) {
            addCriterion("FIELD <=", value, "field");
            return (Criteria) this;
        }

        public Criteria andFieldLike(String value) {
            addCriterion("FIELD like", value, "field");
            return (Criteria) this;
        }

        public Criteria andFieldNotLike(String value) {
            addCriterion("FIELD not like", value, "field");
            return (Criteria) this;
        }

        public Criteria andFieldIn(List<String> values) {
            addCriterion("FIELD in", values, "field");
            return (Criteria) this;
        }

        public Criteria andFieldNotIn(List<String> values) {
            addCriterion("FIELD not in", values, "field");
            return (Criteria) this;
        }

        public Criteria andFieldBetween(String value1, String value2) {
            addCriterion("FIELD between", value1, value2, "field");
            return (Criteria) this;
        }

        public Criteria andFieldNotBetween(String value1, String value2) {
            addCriterion("FIELD not between", value1, value2, "field");
            return (Criteria) this;
        }

        public Criteria andItemLabelIsNull() {
            addCriterion("ITEM_LABEL is null");
            return (Criteria) this;
        }

        public Criteria andItemLabelIsNotNull() {
            addCriterion("ITEM_LABEL is not null");
            return (Criteria) this;
        }

        public Criteria andItemLabelEqualTo(String value) {
            addCriterion("ITEM_LABEL =", value, "itemLabel");
            return (Criteria) this;
        }

        public Criteria andItemLabelNotEqualTo(String value) {
            addCriterion("ITEM_LABEL <>", value, "itemLabel");
            return (Criteria) this;
        }

        public Criteria andItemLabelGreaterThan(String value) {
            addCriterion("ITEM_LABEL >", value, "itemLabel");
            return (Criteria) this;
        }

        public Criteria andItemLabelGreaterThanOrEqualTo(String value) {
            addCriterion("ITEM_LABEL >=", value, "itemLabel");
            return (Criteria) this;
        }

        public Criteria andItemLabelLessThan(String value) {
            addCriterion("ITEM_LABEL <", value, "itemLabel");
            return (Criteria) this;
        }

        public Criteria andItemLabelLessThanOrEqualTo(String value) {
            addCriterion("ITEM_LABEL <=", value, "itemLabel");
            return (Criteria) this;
        }

        public Criteria andItemLabelLike(String value) {
            addCriterion("ITEM_LABEL like", value, "itemLabel");
            return (Criteria) this;
        }

        public Criteria andItemLabelNotLike(String value) {
            addCriterion("ITEM_LABEL not like", value, "itemLabel");
            return (Criteria) this;
        }

        public Criteria andItemLabelIn(List<String> values) {
            addCriterion("ITEM_LABEL in", values, "itemLabel");
            return (Criteria) this;
        }

        public Criteria andItemLabelNotIn(List<String> values) {
            addCriterion("ITEM_LABEL not in", values, "itemLabel");
            return (Criteria) this;
        }

        public Criteria andItemLabelBetween(String value1, String value2) {
            addCriterion("ITEM_LABEL between", value1, value2, "itemLabel");
            return (Criteria) this;
        }

        public Criteria andItemLabelNotBetween(String value1, String value2) {
            addCriterion("ITEM_LABEL not between", value1, value2, "itemLabel");
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

        public Criteria andTextSizeIsNull() {
            addCriterion("TEXT_SIZE is null");
            return (Criteria) this;
        }

        public Criteria andTextSizeIsNotNull() {
            addCriterion("TEXT_SIZE is not null");
            return (Criteria) this;
        }

        public Criteria andTextSizeEqualTo(String value) {
            addCriterion("TEXT_SIZE =", value, "textSize");
            return (Criteria) this;
        }

        public Criteria andTextSizeNotEqualTo(String value) {
            addCriterion("TEXT_SIZE <>", value, "textSize");
            return (Criteria) this;
        }

        public Criteria andTextSizeGreaterThan(String value) {
            addCriterion("TEXT_SIZE >", value, "textSize");
            return (Criteria) this;
        }

        public Criteria andTextSizeGreaterThanOrEqualTo(String value) {
            addCriterion("TEXT_SIZE >=", value, "textSize");
            return (Criteria) this;
        }

        public Criteria andTextSizeLessThan(String value) {
            addCriterion("TEXT_SIZE <", value, "textSize");
            return (Criteria) this;
        }

        public Criteria andTextSizeLessThanOrEqualTo(String value) {
            addCriterion("TEXT_SIZE <=", value, "textSize");
            return (Criteria) this;
        }

        public Criteria andTextSizeLike(String value) {
            addCriterion("TEXT_SIZE like", value, "textSize");
            return (Criteria) this;
        }

        public Criteria andTextSizeNotLike(String value) {
            addCriterion("TEXT_SIZE not like", value, "textSize");
            return (Criteria) this;
        }

        public Criteria andTextSizeIn(List<String> values) {
            addCriterion("TEXT_SIZE in", values, "textSize");
            return (Criteria) this;
        }

        public Criteria andTextSizeNotIn(List<String> values) {
            addCriterion("TEXT_SIZE not in", values, "textSize");
            return (Criteria) this;
        }

        public Criteria andTextSizeBetween(String value1, String value2) {
            addCriterion("TEXT_SIZE between", value1, value2, "textSize");
            return (Criteria) this;
        }

        public Criteria andTextSizeNotBetween(String value1, String value2) {
            addCriterion("TEXT_SIZE not between", value1, value2, "textSize");
            return (Criteria) this;
        }

        public Criteria andAreaRowsIsNull() {
            addCriterion("AREA_ROWS is null");
            return (Criteria) this;
        }

        public Criteria andAreaRowsIsNotNull() {
            addCriterion("AREA_ROWS is not null");
            return (Criteria) this;
        }

        public Criteria andAreaRowsEqualTo(String value) {
            addCriterion("AREA_ROWS =", value, "areaRows");
            return (Criteria) this;
        }

        public Criteria andAreaRowsNotEqualTo(String value) {
            addCriterion("AREA_ROWS <>", value, "areaRows");
            return (Criteria) this;
        }

        public Criteria andAreaRowsGreaterThan(String value) {
            addCriterion("AREA_ROWS >", value, "areaRows");
            return (Criteria) this;
        }

        public Criteria andAreaRowsGreaterThanOrEqualTo(String value) {
            addCriterion("AREA_ROWS >=", value, "areaRows");
            return (Criteria) this;
        }

        public Criteria andAreaRowsLessThan(String value) {
            addCriterion("AREA_ROWS <", value, "areaRows");
            return (Criteria) this;
        }

        public Criteria andAreaRowsLessThanOrEqualTo(String value) {
            addCriterion("AREA_ROWS <=", value, "areaRows");
            return (Criteria) this;
        }

        public Criteria andAreaRowsLike(String value) {
            addCriterion("AREA_ROWS like", value, "areaRows");
            return (Criteria) this;
        }

        public Criteria andAreaRowsNotLike(String value) {
            addCriterion("AREA_ROWS not like", value, "areaRows");
            return (Criteria) this;
        }

        public Criteria andAreaRowsIn(List<String> values) {
            addCriterion("AREA_ROWS in", values, "areaRows");
            return (Criteria) this;
        }

        public Criteria andAreaRowsNotIn(List<String> values) {
            addCriterion("AREA_ROWS not in", values, "areaRows");
            return (Criteria) this;
        }

        public Criteria andAreaRowsBetween(String value1, String value2) {
            addCriterion("AREA_ROWS between", value1, value2, "areaRows");
            return (Criteria) this;
        }

        public Criteria andAreaRowsNotBetween(String value1, String value2) {
            addCriterion("AREA_ROWS not between", value1, value2, "areaRows");
            return (Criteria) this;
        }

        public Criteria andAreaColsIsNull() {
            addCriterion("AREA_COLS is null");
            return (Criteria) this;
        }

        public Criteria andAreaColsIsNotNull() {
            addCriterion("AREA_COLS is not null");
            return (Criteria) this;
        }

        public Criteria andAreaColsEqualTo(String value) {
            addCriterion("AREA_COLS =", value, "areaCols");
            return (Criteria) this;
        }

        public Criteria andAreaColsNotEqualTo(String value) {
            addCriterion("AREA_COLS <>", value, "areaCols");
            return (Criteria) this;
        }

        public Criteria andAreaColsGreaterThan(String value) {
            addCriterion("AREA_COLS >", value, "areaCols");
            return (Criteria) this;
        }

        public Criteria andAreaColsGreaterThanOrEqualTo(String value) {
            addCriterion("AREA_COLS >=", value, "areaCols");
            return (Criteria) this;
        }

        public Criteria andAreaColsLessThan(String value) {
            addCriterion("AREA_COLS <", value, "areaCols");
            return (Criteria) this;
        }

        public Criteria andAreaColsLessThanOrEqualTo(String value) {
            addCriterion("AREA_COLS <=", value, "areaCols");
            return (Criteria) this;
        }

        public Criteria andAreaColsLike(String value) {
            addCriterion("AREA_COLS like", value, "areaCols");
            return (Criteria) this;
        }

        public Criteria andAreaColsNotLike(String value) {
            addCriterion("AREA_COLS not like", value, "areaCols");
            return (Criteria) this;
        }

        public Criteria andAreaColsIn(List<String> values) {
            addCriterion("AREA_COLS in", values, "areaCols");
            return (Criteria) this;
        }

        public Criteria andAreaColsNotIn(List<String> values) {
            addCriterion("AREA_COLS not in", values, "areaCols");
            return (Criteria) this;
        }

        public Criteria andAreaColsBetween(String value1, String value2) {
            addCriterion("AREA_COLS between", value1, value2, "areaCols");
            return (Criteria) this;
        }

        public Criteria andAreaColsNotBetween(String value1, String value2) {
            addCriterion("AREA_COLS not between", value1, value2, "areaCols");
            return (Criteria) this;
        }

        public Criteria andHelpPositionIsNull() {
            addCriterion("HELP_POSITION is null");
            return (Criteria) this;
        }

        public Criteria andHelpPositionIsNotNull() {
            addCriterion("HELP_POSITION is not null");
            return (Criteria) this;
        }

        public Criteria andHelpPositionEqualTo(Long value) {
            addCriterion("HELP_POSITION =", value, "helpPosition");
            return (Criteria) this;
        }

        public Criteria andHelpPositionNotEqualTo(Long value) {
            addCriterion("HELP_POSITION <>", value, "helpPosition");
            return (Criteria) this;
        }

        public Criteria andHelpPositionGreaterThan(Long value) {
            addCriterion("HELP_POSITION >", value, "helpPosition");
            return (Criteria) this;
        }

        public Criteria andHelpPositionGreaterThanOrEqualTo(Long value) {
            addCriterion("HELP_POSITION >=", value, "helpPosition");
            return (Criteria) this;
        }

        public Criteria andHelpPositionLessThan(Long value) {
            addCriterion("HELP_POSITION <", value, "helpPosition");
            return (Criteria) this;
        }

        public Criteria andHelpPositionLessThanOrEqualTo(Long value) {
            addCriterion("HELP_POSITION <=", value, "helpPosition");
            return (Criteria) this;
        }

        public Criteria andHelpPositionIn(List<Long> values) {
            addCriterion("HELP_POSITION in", values, "helpPosition");
            return (Criteria) this;
        }

        public Criteria andHelpPositionNotIn(List<Long> values) {
            addCriterion("HELP_POSITION not in", values, "helpPosition");
            return (Criteria) this;
        }

        public Criteria andHelpPositionBetween(Long value1, Long value2) {
            addCriterion("HELP_POSITION between", value1, value2, "helpPosition");
            return (Criteria) this;
        }

        public Criteria andHelpPositionNotBetween(Long value1, Long value2) {
            addCriterion("HELP_POSITION not between", value1, value2, "helpPosition");
            return (Criteria) this;
        }

        public Criteria andDataTypeIsNull() {
            addCriterion("DATA_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andDataTypeIsNotNull() {
            addCriterion("DATA_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andDataTypeEqualTo(Long value) {
            addCriterion("DATA_TYPE =", value, "dataType");
            return (Criteria) this;
        }

        public Criteria andDataTypeNotEqualTo(Long value) {
            addCriterion("DATA_TYPE <>", value, "dataType");
            return (Criteria) this;
        }

        public Criteria andDataTypeGreaterThan(Long value) {
            addCriterion("DATA_TYPE >", value, "dataType");
            return (Criteria) this;
        }

        public Criteria andDataTypeGreaterThanOrEqualTo(Long value) {
            addCriterion("DATA_TYPE >=", value, "dataType");
            return (Criteria) this;
        }

        public Criteria andDataTypeLessThan(Long value) {
            addCriterion("DATA_TYPE <", value, "dataType");
            return (Criteria) this;
        }

        public Criteria andDataTypeLessThanOrEqualTo(Long value) {
            addCriterion("DATA_TYPE <=", value, "dataType");
            return (Criteria) this;
        }

        public Criteria andDataTypeIn(List<Long> values) {
            addCriterion("DATA_TYPE in", values, "dataType");
            return (Criteria) this;
        }

        public Criteria andDataTypeNotIn(List<Long> values) {
            addCriterion("DATA_TYPE not in", values, "dataType");
            return (Criteria) this;
        }

        public Criteria andDataTypeBetween(Long value1, Long value2) {
            addCriterion("DATA_TYPE between", value1, value2, "dataType");
            return (Criteria) this;
        }

        public Criteria andDataTypeNotBetween(Long value1, Long value2) {
            addCriterion("DATA_TYPE not between", value1, value2, "dataType");
            return (Criteria) this;
        }

        public Criteria andIsSingleIsNull() {
            addCriterion("IS_SINGLE is null");
            return (Criteria) this;
        }

        public Criteria andIsSingleIsNotNull() {
            addCriterion("IS_SINGLE is not null");
            return (Criteria) this;
        }

        public Criteria andIsSingleEqualTo(Long value) {
            addCriterion("IS_SINGLE =", value, "isSingle");
            return (Criteria) this;
        }

        public Criteria andIsSingleNotEqualTo(Long value) {
            addCriterion("IS_SINGLE <>", value, "isSingle");
            return (Criteria) this;
        }

        public Criteria andIsSingleGreaterThan(Long value) {
            addCriterion("IS_SINGLE >", value, "isSingle");
            return (Criteria) this;
        }

        public Criteria andIsSingleGreaterThanOrEqualTo(Long value) {
            addCriterion("IS_SINGLE >=", value, "isSingle");
            return (Criteria) this;
        }

        public Criteria andIsSingleLessThan(Long value) {
            addCriterion("IS_SINGLE <", value, "isSingle");
            return (Criteria) this;
        }

        public Criteria andIsSingleLessThanOrEqualTo(Long value) {
            addCriterion("IS_SINGLE <=", value, "isSingle");
            return (Criteria) this;
        }

        public Criteria andIsSingleIn(List<Long> values) {
            addCriterion("IS_SINGLE in", values, "isSingle");
            return (Criteria) this;
        }

        public Criteria andIsSingleNotIn(List<Long> values) {
            addCriterion("IS_SINGLE not in", values, "isSingle");
            return (Criteria) this;
        }

        public Criteria andIsSingleBetween(Long value1, Long value2) {
            addCriterion("IS_SINGLE between", value1, value2, "isSingle");
            return (Criteria) this;
        }

        public Criteria andIsSingleNotBetween(Long value1, Long value2) {
            addCriterion("IS_SINGLE not between", value1, value2, "isSingle");
            return (Criteria) this;
        }

        public Criteria andIsChannelIsNull() {
            addCriterion("IS_CHANNEL is null");
            return (Criteria) this;
        }

        public Criteria andIsChannelIsNotNull() {
            addCriterion("IS_CHANNEL is not null");
            return (Criteria) this;
        }

        public Criteria andIsChannelEqualTo(Long value) {
            addCriterion("IS_CHANNEL =", value, "isChannel");
            return (Criteria) this;
        }

        public Criteria andIsChannelNotEqualTo(Long value) {
            addCriterion("IS_CHANNEL <>", value, "isChannel");
            return (Criteria) this;
        }

        public Criteria andIsChannelGreaterThan(Long value) {
            addCriterion("IS_CHANNEL >", value, "isChannel");
            return (Criteria) this;
        }

        public Criteria andIsChannelGreaterThanOrEqualTo(Long value) {
            addCriterion("IS_CHANNEL >=", value, "isChannel");
            return (Criteria) this;
        }

        public Criteria andIsChannelLessThan(Long value) {
            addCriterion("IS_CHANNEL <", value, "isChannel");
            return (Criteria) this;
        }

        public Criteria andIsChannelLessThanOrEqualTo(Long value) {
            addCriterion("IS_CHANNEL <=", value, "isChannel");
            return (Criteria) this;
        }

        public Criteria andIsChannelIn(List<Long> values) {
            addCriterion("IS_CHANNEL in", values, "isChannel");
            return (Criteria) this;
        }

        public Criteria andIsChannelNotIn(List<Long> values) {
            addCriterion("IS_CHANNEL not in", values, "isChannel");
            return (Criteria) this;
        }

        public Criteria andIsChannelBetween(Long value1, Long value2) {
            addCriterion("IS_CHANNEL between", value1, value2, "isChannel");
            return (Criteria) this;
        }

        public Criteria andIsChannelNotBetween(Long value1, Long value2) {
            addCriterion("IS_CHANNEL not between", value1, value2, "isChannel");
            return (Criteria) this;
        }

        public Criteria andIsCustomIsNull() {
            addCriterion("IS_CUSTOM is null");
            return (Criteria) this;
        }

        public Criteria andIsCustomIsNotNull() {
            addCriterion("IS_CUSTOM is not null");
            return (Criteria) this;
        }

        public Criteria andIsCustomEqualTo(Long value) {
            addCriterion("IS_CUSTOM =", value, "isCustom");
            return (Criteria) this;
        }

        public Criteria andIsCustomNotEqualTo(Long value) {
            addCriterion("IS_CUSTOM <>", value, "isCustom");
            return (Criteria) this;
        }

        public Criteria andIsCustomGreaterThan(Long value) {
            addCriterion("IS_CUSTOM >", value, "isCustom");
            return (Criteria) this;
        }

        public Criteria andIsCustomGreaterThanOrEqualTo(Long value) {
            addCriterion("IS_CUSTOM >=", value, "isCustom");
            return (Criteria) this;
        }

        public Criteria andIsCustomLessThan(Long value) {
            addCriterion("IS_CUSTOM <", value, "isCustom");
            return (Criteria) this;
        }

        public Criteria andIsCustomLessThanOrEqualTo(Long value) {
            addCriterion("IS_CUSTOM <=", value, "isCustom");
            return (Criteria) this;
        }

        public Criteria andIsCustomIn(List<Long> values) {
            addCriterion("IS_CUSTOM in", values, "isCustom");
            return (Criteria) this;
        }

        public Criteria andIsCustomNotIn(List<Long> values) {
            addCriterion("IS_CUSTOM not in", values, "isCustom");
            return (Criteria) this;
        }

        public Criteria andIsCustomBetween(Long value1, Long value2) {
            addCriterion("IS_CUSTOM between", value1, value2, "isCustom");
            return (Criteria) this;
        }

        public Criteria andIsCustomNotBetween(Long value1, Long value2) {
            addCriterion("IS_CUSTOM not between", value1, value2, "isCustom");
            return (Criteria) this;
        }

        public Criteria andIsDisplayIsNull() {
            addCriterion("IS_DISPLAY is null");
            return (Criteria) this;
        }

        public Criteria andIsDisplayIsNotNull() {
            addCriterion("IS_DISPLAY is not null");
            return (Criteria) this;
        }

        public Criteria andIsDisplayEqualTo(Long value) {
            addCriterion("IS_DISPLAY =", value, "isDisplay");
            return (Criteria) this;
        }

        public Criteria andIsDisplayNotEqualTo(Long value) {
            addCriterion("IS_DISPLAY <>", value, "isDisplay");
            return (Criteria) this;
        }

        public Criteria andIsDisplayGreaterThan(Long value) {
            addCriterion("IS_DISPLAY >", value, "isDisplay");
            return (Criteria) this;
        }

        public Criteria andIsDisplayGreaterThanOrEqualTo(Long value) {
            addCriterion("IS_DISPLAY >=", value, "isDisplay");
            return (Criteria) this;
        }

        public Criteria andIsDisplayLessThan(Long value) {
            addCriterion("IS_DISPLAY <", value, "isDisplay");
            return (Criteria) this;
        }

        public Criteria andIsDisplayLessThanOrEqualTo(Long value) {
            addCriterion("IS_DISPLAY <=", value, "isDisplay");
            return (Criteria) this;
        }

        public Criteria andIsDisplayIn(List<Long> values) {
            addCriterion("IS_DISPLAY in", values, "isDisplay");
            return (Criteria) this;
        }

        public Criteria andIsDisplayNotIn(List<Long> values) {
            addCriterion("IS_DISPLAY not in", values, "isDisplay");
            return (Criteria) this;
        }

        public Criteria andIsDisplayBetween(Long value1, Long value2) {
            addCriterion("IS_DISPLAY between", value1, value2, "isDisplay");
            return (Criteria) this;
        }

        public Criteria andIsDisplayNotBetween(Long value1, Long value2) {
            addCriterion("IS_DISPLAY not between", value1, value2, "isDisplay");
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
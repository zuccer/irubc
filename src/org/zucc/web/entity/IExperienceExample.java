package org.zucc.web.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class IExperienceExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer limitStart;

    protected Integer limitEnd;

    public IExperienceExample() {
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

    public void setLimitStart(Integer limitStart) {
        this.limitStart=limitStart;
    }

    public Integer getLimitStart() {
        return limitStart;
    }

    public void setLimitEnd(Integer limitEnd) {
        this.limitEnd=limitEnd;
    }

    public Integer getLimitEnd() {
        return limitEnd;
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andExpidIsNull() {
            addCriterion("expId is null");
            return (Criteria) this;
        }

        public Criteria andExpidIsNotNull() {
            addCriterion("expId is not null");
            return (Criteria) this;
        }

        public Criteria andExpidEqualTo(Long value) {
            addCriterion("expId =", value, "expid");
            return (Criteria) this;
        }

        public Criteria andExpidNotEqualTo(Long value) {
            addCriterion("expId <>", value, "expid");
            return (Criteria) this;
        }

        public Criteria andExpidGreaterThan(Long value) {
            addCriterion("expId >", value, "expid");
            return (Criteria) this;
        }

        public Criteria andExpidGreaterThanOrEqualTo(Long value) {
            addCriterion("expId >=", value, "expid");
            return (Criteria) this;
        }

        public Criteria andExpidLessThan(Long value) {
            addCriterion("expId <", value, "expid");
            return (Criteria) this;
        }

        public Criteria andExpidLessThanOrEqualTo(Long value) {
            addCriterion("expId <=", value, "expid");
            return (Criteria) this;
        }

        public Criteria andExpidIn(List<Long> values) {
            addCriterion("expId in", values, "expid");
            return (Criteria) this;
        }

        public Criteria andExpidNotIn(List<Long> values) {
            addCriterion("expId not in", values, "expid");
            return (Criteria) this;
        }

        public Criteria andExpidBetween(Long value1, Long value2) {
            addCriterion("expId between", value1, value2, "expid");
            return (Criteria) this;
        }

        public Criteria andExpidNotBetween(Long value1, Long value2) {
            addCriterion("expId not between", value1, value2, "expid");
            return (Criteria) this;
        }

        public Criteria andExpUseridIsNull() {
            addCriterion("exp_userId is null");
            return (Criteria) this;
        }

        public Criteria andExpUseridIsNotNull() {
            addCriterion("exp_userId is not null");
            return (Criteria) this;
        }

        public Criteria andExpUseridEqualTo(Long value) {
            addCriterion("exp_userId =", value, "expUserid");
            return (Criteria) this;
        }

        public Criteria andExpUseridNotEqualTo(Long value) {
            addCriterion("exp_userId <>", value, "expUserid");
            return (Criteria) this;
        }

        public Criteria andExpUseridGreaterThan(Long value) {
            addCriterion("exp_userId >", value, "expUserid");
            return (Criteria) this;
        }

        public Criteria andExpUseridGreaterThanOrEqualTo(Long value) {
            addCriterion("exp_userId >=", value, "expUserid");
            return (Criteria) this;
        }

        public Criteria andExpUseridLessThan(Long value) {
            addCriterion("exp_userId <", value, "expUserid");
            return (Criteria) this;
        }

        public Criteria andExpUseridLessThanOrEqualTo(Long value) {
            addCriterion("exp_userId <=", value, "expUserid");
            return (Criteria) this;
        }

        public Criteria andExpUseridIn(List<Long> values) {
            addCriterion("exp_userId in", values, "expUserid");
            return (Criteria) this;
        }

        public Criteria andExpUseridNotIn(List<Long> values) {
            addCriterion("exp_userId not in", values, "expUserid");
            return (Criteria) this;
        }

        public Criteria andExpUseridBetween(Long value1, Long value2) {
            addCriterion("exp_userId between", value1, value2, "expUserid");
            return (Criteria) this;
        }

        public Criteria andExpUseridNotBetween(Long value1, Long value2) {
            addCriterion("exp_userId not between", value1, value2, "expUserid");
            return (Criteria) this;
        }

        public Criteria andExpStartdateIsNull() {
            addCriterion("exp_startDate is null");
            return (Criteria) this;
        }

        public Criteria andExpStartdateIsNotNull() {
            addCriterion("exp_startDate is not null");
            return (Criteria) this;
        }

        public Criteria andExpStartdateEqualTo(Date value) {
            addCriterionForJDBCDate("exp_startDate =", value, "expStartdate");
            return (Criteria) this;
        }

        public Criteria andExpStartdateNotEqualTo(Date value) {
            addCriterionForJDBCDate("exp_startDate <>", value, "expStartdate");
            return (Criteria) this;
        }

        public Criteria andExpStartdateGreaterThan(Date value) {
            addCriterionForJDBCDate("exp_startDate >", value, "expStartdate");
            return (Criteria) this;
        }

        public Criteria andExpStartdateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("exp_startDate >=", value, "expStartdate");
            return (Criteria) this;
        }

        public Criteria andExpStartdateLessThan(Date value) {
            addCriterionForJDBCDate("exp_startDate <", value, "expStartdate");
            return (Criteria) this;
        }

        public Criteria andExpStartdateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("exp_startDate <=", value, "expStartdate");
            return (Criteria) this;
        }

        public Criteria andExpStartdateIn(List<Date> values) {
            addCriterionForJDBCDate("exp_startDate in", values, "expStartdate");
            return (Criteria) this;
        }

        public Criteria andExpStartdateNotIn(List<Date> values) {
            addCriterionForJDBCDate("exp_startDate not in", values, "expStartdate");
            return (Criteria) this;
        }

        public Criteria andExpStartdateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("exp_startDate between", value1, value2, "expStartdate");
            return (Criteria) this;
        }

        public Criteria andExpStartdateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("exp_startDate not between", value1, value2, "expStartdate");
            return (Criteria) this;
        }

        public Criteria andExpEnddateIsNull() {
            addCriterion("exp_endDate is null");
            return (Criteria) this;
        }

        public Criteria andExpEnddateIsNotNull() {
            addCriterion("exp_endDate is not null");
            return (Criteria) this;
        }

        public Criteria andExpEnddateEqualTo(Date value) {
            addCriterionForJDBCDate("exp_endDate =", value, "expEnddate");
            return (Criteria) this;
        }

        public Criteria andExpEnddateNotEqualTo(Date value) {
            addCriterionForJDBCDate("exp_endDate <>", value, "expEnddate");
            return (Criteria) this;
        }

        public Criteria andExpEnddateGreaterThan(Date value) {
            addCriterionForJDBCDate("exp_endDate >", value, "expEnddate");
            return (Criteria) this;
        }

        public Criteria andExpEnddateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("exp_endDate >=", value, "expEnddate");
            return (Criteria) this;
        }

        public Criteria andExpEnddateLessThan(Date value) {
            addCriterionForJDBCDate("exp_endDate <", value, "expEnddate");
            return (Criteria) this;
        }

        public Criteria andExpEnddateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("exp_endDate <=", value, "expEnddate");
            return (Criteria) this;
        }

        public Criteria andExpEnddateIn(List<Date> values) {
            addCriterionForJDBCDate("exp_endDate in", values, "expEnddate");
            return (Criteria) this;
        }

        public Criteria andExpEnddateNotIn(List<Date> values) {
            addCriterionForJDBCDate("exp_endDate not in", values, "expEnddate");
            return (Criteria) this;
        }

        public Criteria andExpEnddateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("exp_endDate between", value1, value2, "expEnddate");
            return (Criteria) this;
        }

        public Criteria andExpEnddateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("exp_endDate not between", value1, value2, "expEnddate");
            return (Criteria) this;
        }

        public Criteria andExpDescriptionIsNull() {
            addCriterion("exp_description is null");
            return (Criteria) this;
        }

        public Criteria andExpDescriptionIsNotNull() {
            addCriterion("exp_description is not null");
            return (Criteria) this;
        }

        public Criteria andExpDescriptionEqualTo(String value) {
            addCriterion("exp_description =", value, "expDescription");
            return (Criteria) this;
        }

        public Criteria andExpDescriptionNotEqualTo(String value) {
            addCriterion("exp_description <>", value, "expDescription");
            return (Criteria) this;
        }

        public Criteria andExpDescriptionGreaterThan(String value) {
            addCriterion("exp_description >", value, "expDescription");
            return (Criteria) this;
        }

        public Criteria andExpDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("exp_description >=", value, "expDescription");
            return (Criteria) this;
        }

        public Criteria andExpDescriptionLessThan(String value) {
            addCriterion("exp_description <", value, "expDescription");
            return (Criteria) this;
        }

        public Criteria andExpDescriptionLessThanOrEqualTo(String value) {
            addCriterion("exp_description <=", value, "expDescription");
            return (Criteria) this;
        }

        public Criteria andExpDescriptionLike(String value) {
            addCriterion("exp_description like", value, "expDescription");
            return (Criteria) this;
        }

        public Criteria andExpDescriptionNotLike(String value) {
            addCriterion("exp_description not like", value, "expDescription");
            return (Criteria) this;
        }

        public Criteria andExpDescriptionIn(List<String> values) {
            addCriterion("exp_description in", values, "expDescription");
            return (Criteria) this;
        }

        public Criteria andExpDescriptionNotIn(List<String> values) {
            addCriterion("exp_description not in", values, "expDescription");
            return (Criteria) this;
        }

        public Criteria andExpDescriptionBetween(String value1, String value2) {
            addCriterion("exp_description between", value1, value2, "expDescription");
            return (Criteria) this;
        }

        public Criteria andExpDescriptionNotBetween(String value1, String value2) {
            addCriterion("exp_description not between", value1, value2, "expDescription");
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
package org.zucc.web.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class IIntegralExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer limitStart;

    protected Integer limitEnd;

    public IIntegralExample() {
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

        public Criteria andIidIsNull() {
            addCriterion("iid is null");
            return (Criteria) this;
        }

        public Criteria andIidIsNotNull() {
            addCriterion("iid is not null");
            return (Criteria) this;
        }

        public Criteria andIidEqualTo(Long value) {
            addCriterion("iid =", value, "iid");
            return (Criteria) this;
        }

        public Criteria andIidNotEqualTo(Long value) {
            addCriterion("iid <>", value, "iid");
            return (Criteria) this;
        }

        public Criteria andIidGreaterThan(Long value) {
            addCriterion("iid >", value, "iid");
            return (Criteria) this;
        }

        public Criteria andIidGreaterThanOrEqualTo(Long value) {
            addCriterion("iid >=", value, "iid");
            return (Criteria) this;
        }

        public Criteria andIidLessThan(Long value) {
            addCriterion("iid <", value, "iid");
            return (Criteria) this;
        }

        public Criteria andIidLessThanOrEqualTo(Long value) {
            addCriterion("iid <=", value, "iid");
            return (Criteria) this;
        }

        public Criteria andIidIn(List<Long> values) {
            addCriterion("iid in", values, "iid");
            return (Criteria) this;
        }

        public Criteria andIidNotIn(List<Long> values) {
            addCriterion("iid not in", values, "iid");
            return (Criteria) this;
        }

        public Criteria andIidBetween(Long value1, Long value2) {
            addCriterion("iid between", value1, value2, "iid");
            return (Criteria) this;
        }

        public Criteria andIidNotBetween(Long value1, Long value2) {
            addCriterion("iid not between", value1, value2, "iid");
            return (Criteria) this;
        }

        public Criteria andIUseridIsNull() {
            addCriterion("i_userId is null");
            return (Criteria) this;
        }

        public Criteria andIUseridIsNotNull() {
            addCriterion("i_userId is not null");
            return (Criteria) this;
        }

        public Criteria andIUseridEqualTo(Long value) {
            addCriterion("i_userId =", value, "iUserid");
            return (Criteria) this;
        }

        public Criteria andIUseridNotEqualTo(Long value) {
            addCriterion("i_userId <>", value, "iUserid");
            return (Criteria) this;
        }

        public Criteria andIUseridGreaterThan(Long value) {
            addCriterion("i_userId >", value, "iUserid");
            return (Criteria) this;
        }

        public Criteria andIUseridGreaterThanOrEqualTo(Long value) {
            addCriterion("i_userId >=", value, "iUserid");
            return (Criteria) this;
        }

        public Criteria andIUseridLessThan(Long value) {
            addCriterion("i_userId <", value, "iUserid");
            return (Criteria) this;
        }

        public Criteria andIUseridLessThanOrEqualTo(Long value) {
            addCriterion("i_userId <=", value, "iUserid");
            return (Criteria) this;
        }

        public Criteria andIUseridIn(List<Long> values) {
            addCriterion("i_userId in", values, "iUserid");
            return (Criteria) this;
        }

        public Criteria andIUseridNotIn(List<Long> values) {
            addCriterion("i_userId not in", values, "iUserid");
            return (Criteria) this;
        }

        public Criteria andIUseridBetween(Long value1, Long value2) {
            addCriterion("i_userId between", value1, value2, "iUserid");
            return (Criteria) this;
        }

        public Criteria andIUseridNotBetween(Long value1, Long value2) {
            addCriterion("i_userId not between", value1, value2, "iUserid");
            return (Criteria) this;
        }

        public Criteria andIValueIsNull() {
            addCriterion("i_value is null");
            return (Criteria) this;
        }

        public Criteria andIValueIsNotNull() {
            addCriterion("i_value is not null");
            return (Criteria) this;
        }

        public Criteria andIValueEqualTo(Integer value) {
            addCriterion("i_value =", value, "iValue");
            return (Criteria) this;
        }

        public Criteria andIValueNotEqualTo(Integer value) {
            addCriterion("i_value <>", value, "iValue");
            return (Criteria) this;
        }

        public Criteria andIValueGreaterThan(Integer value) {
            addCriterion("i_value >", value, "iValue");
            return (Criteria) this;
        }

        public Criteria andIValueGreaterThanOrEqualTo(Integer value) {
            addCriterion("i_value >=", value, "iValue");
            return (Criteria) this;
        }

        public Criteria andIValueLessThan(Integer value) {
            addCriterion("i_value <", value, "iValue");
            return (Criteria) this;
        }

        public Criteria andIValueLessThanOrEqualTo(Integer value) {
            addCriterion("i_value <=", value, "iValue");
            return (Criteria) this;
        }

        public Criteria andIValueIn(List<Integer> values) {
            addCriterion("i_value in", values, "iValue");
            return (Criteria) this;
        }

        public Criteria andIValueNotIn(List<Integer> values) {
            addCriterion("i_value not in", values, "iValue");
            return (Criteria) this;
        }

        public Criteria andIValueBetween(Integer value1, Integer value2) {
            addCriterion("i_value between", value1, value2, "iValue");
            return (Criteria) this;
        }

        public Criteria andIValueNotBetween(Integer value1, Integer value2) {
            addCriterion("i_value not between", value1, value2, "iValue");
            return (Criteria) this;
        }

        public Criteria andIGettimeIsNull() {
            addCriterion("i_getTime is null");
            return (Criteria) this;
        }

        public Criteria andIGettimeIsNotNull() {
            addCriterion("i_getTime is not null");
            return (Criteria) this;
        }

        public Criteria andIGettimeEqualTo(Date value) {
            addCriterion("i_getTime =", value, "iGettime");
            return (Criteria) this;
        }

        public Criteria andIGettimeNotEqualTo(Date value) {
            addCriterion("i_getTime <>", value, "iGettime");
            return (Criteria) this;
        }

        public Criteria andIGettimeGreaterThan(Date value) {
            addCriterion("i_getTime >", value, "iGettime");
            return (Criteria) this;
        }

        public Criteria andIGettimeGreaterThanOrEqualTo(Date value) {
            addCriterion("i_getTime >=", value, "iGettime");
            return (Criteria) this;
        }

        public Criteria andIGettimeLessThan(Date value) {
            addCriterion("i_getTime <", value, "iGettime");
            return (Criteria) this;
        }

        public Criteria andIGettimeLessThanOrEqualTo(Date value) {
            addCriterion("i_getTime <=", value, "iGettime");
            return (Criteria) this;
        }

        public Criteria andIGettimeIn(List<Date> values) {
            addCriterion("i_getTime in", values, "iGettime");
            return (Criteria) this;
        }

        public Criteria andIGettimeNotIn(List<Date> values) {
            addCriterion("i_getTime not in", values, "iGettime");
            return (Criteria) this;
        }

        public Criteria andIGettimeBetween(Date value1, Date value2) {
            addCriterion("i_getTime between", value1, value2, "iGettime");
            return (Criteria) this;
        }

        public Criteria andIGettimeNotBetween(Date value1, Date value2) {
            addCriterion("i_getTime not between", value1, value2, "iGettime");
            return (Criteria) this;
        }

        public Criteria andICourseidIsNull() {
            addCriterion("i_courseId is null");
            return (Criteria) this;
        }

        public Criteria andICourseidIsNotNull() {
            addCriterion("i_courseId is not null");
            return (Criteria) this;
        }

        public Criteria andICourseidEqualTo(Long value) {
            addCriterion("i_courseId =", value, "iCourseid");
            return (Criteria) this;
        }

        public Criteria andICourseidNotEqualTo(Long value) {
            addCriterion("i_courseId <>", value, "iCourseid");
            return (Criteria) this;
        }

        public Criteria andICourseidGreaterThan(Long value) {
            addCriterion("i_courseId >", value, "iCourseid");
            return (Criteria) this;
        }

        public Criteria andICourseidGreaterThanOrEqualTo(Long value) {
            addCriterion("i_courseId >=", value, "iCourseid");
            return (Criteria) this;
        }

        public Criteria andICourseidLessThan(Long value) {
            addCriterion("i_courseId <", value, "iCourseid");
            return (Criteria) this;
        }

        public Criteria andICourseidLessThanOrEqualTo(Long value) {
            addCriterion("i_courseId <=", value, "iCourseid");
            return (Criteria) this;
        }

        public Criteria andICourseidIn(List<Long> values) {
            addCriterion("i_courseId in", values, "iCourseid");
            return (Criteria) this;
        }

        public Criteria andICourseidNotIn(List<Long> values) {
            addCriterion("i_courseId not in", values, "iCourseid");
            return (Criteria) this;
        }

        public Criteria andICourseidBetween(Long value1, Long value2) {
            addCriterion("i_courseId between", value1, value2, "iCourseid");
            return (Criteria) this;
        }

        public Criteria andICourseidNotBetween(Long value1, Long value2) {
            addCriterion("i_courseId not between", value1, value2, "iCourseid");
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
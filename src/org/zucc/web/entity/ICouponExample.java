package org.zucc.web.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class ICouponExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer limitStart;

    protected Integer limitEnd;

    public ICouponExample() {
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

        public Criteria andCouponidIsNull() {
            addCriterion("couponId is null");
            return (Criteria) this;
        }

        public Criteria andCouponidIsNotNull() {
            addCriterion("couponId is not null");
            return (Criteria) this;
        }

        public Criteria andCouponidEqualTo(Long value) {
            addCriterion("couponId =", value, "couponid");
            return (Criteria) this;
        }

        public Criteria andCouponidNotEqualTo(Long value) {
            addCriterion("couponId <>", value, "couponid");
            return (Criteria) this;
        }

        public Criteria andCouponidGreaterThan(Long value) {
            addCriterion("couponId >", value, "couponid");
            return (Criteria) this;
        }

        public Criteria andCouponidGreaterThanOrEqualTo(Long value) {
            addCriterion("couponId >=", value, "couponid");
            return (Criteria) this;
        }

        public Criteria andCouponidLessThan(Long value) {
            addCriterion("couponId <", value, "couponid");
            return (Criteria) this;
        }

        public Criteria andCouponidLessThanOrEqualTo(Long value) {
            addCriterion("couponId <=", value, "couponid");
            return (Criteria) this;
        }

        public Criteria andCouponidIn(List<Long> values) {
            addCriterion("couponId in", values, "couponid");
            return (Criteria) this;
        }

        public Criteria andCouponidNotIn(List<Long> values) {
            addCriterion("couponId not in", values, "couponid");
            return (Criteria) this;
        }

        public Criteria andCouponidBetween(Long value1, Long value2) {
            addCriterion("couponId between", value1, value2, "couponid");
            return (Criteria) this;
        }

        public Criteria andCouponidNotBetween(Long value1, Long value2) {
            addCriterion("couponId not between", value1, value2, "couponid");
            return (Criteria) this;
        }

        public Criteria andCouponmoneyIsNull() {
            addCriterion("couponMoney is null");
            return (Criteria) this;
        }

        public Criteria andCouponmoneyIsNotNull() {
            addCriterion("couponMoney is not null");
            return (Criteria) this;
        }

        public Criteria andCouponmoneyEqualTo(Double value) {
            addCriterion("couponMoney =", value, "couponmoney");
            return (Criteria) this;
        }

        public Criteria andCouponmoneyNotEqualTo(Double value) {
            addCriterion("couponMoney <>", value, "couponmoney");
            return (Criteria) this;
        }

        public Criteria andCouponmoneyGreaterThan(Double value) {
            addCriterion("couponMoney >", value, "couponmoney");
            return (Criteria) this;
        }

        public Criteria andCouponmoneyGreaterThanOrEqualTo(Double value) {
            addCriterion("couponMoney >=", value, "couponmoney");
            return (Criteria) this;
        }

        public Criteria andCouponmoneyLessThan(Double value) {
            addCriterion("couponMoney <", value, "couponmoney");
            return (Criteria) this;
        }

        public Criteria andCouponmoneyLessThanOrEqualTo(Double value) {
            addCriterion("couponMoney <=", value, "couponmoney");
            return (Criteria) this;
        }

        public Criteria andCouponmoneyIn(List<Double> values) {
            addCriterion("couponMoney in", values, "couponmoney");
            return (Criteria) this;
        }

        public Criteria andCouponmoneyNotIn(List<Double> values) {
            addCriterion("couponMoney not in", values, "couponmoney");
            return (Criteria) this;
        }

        public Criteria andCouponmoneyBetween(Double value1, Double value2) {
            addCriterion("couponMoney between", value1, value2, "couponmoney");
            return (Criteria) this;
        }

        public Criteria andCouponmoneyNotBetween(Double value1, Double value2) {
            addCriterion("couponMoney not between", value1, value2, "couponmoney");
            return (Criteria) this;
        }

        public Criteria andCouponenddateIsNull() {
            addCriterion("couponEndDate is null");
            return (Criteria) this;
        }

        public Criteria andCouponenddateIsNotNull() {
            addCriterion("couponEndDate is not null");
            return (Criteria) this;
        }

        public Criteria andCouponenddateEqualTo(Date value) {
            addCriterionForJDBCDate("couponEndDate =", value, "couponenddate");
            return (Criteria) this;
        }

        public Criteria andCouponenddateNotEqualTo(Date value) {
            addCriterionForJDBCDate("couponEndDate <>", value, "couponenddate");
            return (Criteria) this;
        }

        public Criteria andCouponenddateGreaterThan(Date value) {
            addCriterionForJDBCDate("couponEndDate >", value, "couponenddate");
            return (Criteria) this;
        }

        public Criteria andCouponenddateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("couponEndDate >=", value, "couponenddate");
            return (Criteria) this;
        }

        public Criteria andCouponenddateLessThan(Date value) {
            addCriterionForJDBCDate("couponEndDate <", value, "couponenddate");
            return (Criteria) this;
        }

        public Criteria andCouponenddateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("couponEndDate <=", value, "couponenddate");
            return (Criteria) this;
        }

        public Criteria andCouponenddateIn(List<Date> values) {
            addCriterionForJDBCDate("couponEndDate in", values, "couponenddate");
            return (Criteria) this;
        }

        public Criteria andCouponenddateNotIn(List<Date> values) {
            addCriterionForJDBCDate("couponEndDate not in", values, "couponenddate");
            return (Criteria) this;
        }

        public Criteria andCouponenddateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("couponEndDate between", value1, value2, "couponenddate");
            return (Criteria) this;
        }

        public Criteria andCouponenddateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("couponEndDate not between", value1, value2, "couponenddate");
            return (Criteria) this;
        }

        public Criteria andCouponUseridIsNull() {
            addCriterion("coupon_userId is null");
            return (Criteria) this;
        }

        public Criteria andCouponUseridIsNotNull() {
            addCriterion("coupon_userId is not null");
            return (Criteria) this;
        }

        public Criteria andCouponUseridEqualTo(Long value) {
            addCriterion("coupon_userId =", value, "couponUserid");
            return (Criteria) this;
        }

        public Criteria andCouponUseridNotEqualTo(Long value) {
            addCriterion("coupon_userId <>", value, "couponUserid");
            return (Criteria) this;
        }

        public Criteria andCouponUseridGreaterThan(Long value) {
            addCriterion("coupon_userId >", value, "couponUserid");
            return (Criteria) this;
        }

        public Criteria andCouponUseridGreaterThanOrEqualTo(Long value) {
            addCriterion("coupon_userId >=", value, "couponUserid");
            return (Criteria) this;
        }

        public Criteria andCouponUseridLessThan(Long value) {
            addCriterion("coupon_userId <", value, "couponUserid");
            return (Criteria) this;
        }

        public Criteria andCouponUseridLessThanOrEqualTo(Long value) {
            addCriterion("coupon_userId <=", value, "couponUserid");
            return (Criteria) this;
        }

        public Criteria andCouponUseridIn(List<Long> values) {
            addCriterion("coupon_userId in", values, "couponUserid");
            return (Criteria) this;
        }

        public Criteria andCouponUseridNotIn(List<Long> values) {
            addCriterion("coupon_userId not in", values, "couponUserid");
            return (Criteria) this;
        }

        public Criteria andCouponUseridBetween(Long value1, Long value2) {
            addCriterion("coupon_userId between", value1, value2, "couponUserid");
            return (Criteria) this;
        }

        public Criteria andCouponUseridNotBetween(Long value1, Long value2) {
            addCriterion("coupon_userId not between", value1, value2, "couponUserid");
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
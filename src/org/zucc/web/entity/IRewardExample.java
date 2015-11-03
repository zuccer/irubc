package org.zucc.web.entity;

import java.util.ArrayList;
import java.util.List;

public class IRewardExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer limitStart;

    protected Integer limitEnd;

    public IRewardExample() {
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

        public Criteria andRidIsNull() {
            addCriterion("rid is null");
            return (Criteria) this;
        }

        public Criteria andRidIsNotNull() {
            addCriterion("rid is not null");
            return (Criteria) this;
        }

        public Criteria andRidEqualTo(Long value) {
            addCriterion("rid =", value, "rid");
            return (Criteria) this;
        }

        public Criteria andRidNotEqualTo(Long value) {
            addCriterion("rid <>", value, "rid");
            return (Criteria) this;
        }

        public Criteria andRidGreaterThan(Long value) {
            addCriterion("rid >", value, "rid");
            return (Criteria) this;
        }

        public Criteria andRidGreaterThanOrEqualTo(Long value) {
            addCriterion("rid >=", value, "rid");
            return (Criteria) this;
        }

        public Criteria andRidLessThan(Long value) {
            addCriterion("rid <", value, "rid");
            return (Criteria) this;
        }

        public Criteria andRidLessThanOrEqualTo(Long value) {
            addCriterion("rid <=", value, "rid");
            return (Criteria) this;
        }

        public Criteria andRidIn(List<Long> values) {
            addCriterion("rid in", values, "rid");
            return (Criteria) this;
        }

        public Criteria andRidNotIn(List<Long> values) {
            addCriterion("rid not in", values, "rid");
            return (Criteria) this;
        }

        public Criteria andRidBetween(Long value1, Long value2) {
            addCriterion("rid between", value1, value2, "rid");
            return (Criteria) this;
        }

        public Criteria andRidNotBetween(Long value1, Long value2) {
            addCriterion("rid not between", value1, value2, "rid");
            return (Criteria) this;
        }

        public Criteria andRTeacheridIsNull() {
            addCriterion("r_teacherId is null");
            return (Criteria) this;
        }

        public Criteria andRTeacheridIsNotNull() {
            addCriterion("r_teacherId is not null");
            return (Criteria) this;
        }

        public Criteria andRTeacheridEqualTo(Long value) {
            addCriterion("r_teacherId =", value, "rTeacherid");
            return (Criteria) this;
        }

        public Criteria andRTeacheridNotEqualTo(Long value) {
            addCriterion("r_teacherId <>", value, "rTeacherid");
            return (Criteria) this;
        }

        public Criteria andRTeacheridGreaterThan(Long value) {
            addCriterion("r_teacherId >", value, "rTeacherid");
            return (Criteria) this;
        }

        public Criteria andRTeacheridGreaterThanOrEqualTo(Long value) {
            addCriterion("r_teacherId >=", value, "rTeacherid");
            return (Criteria) this;
        }

        public Criteria andRTeacheridLessThan(Long value) {
            addCriterion("r_teacherId <", value, "rTeacherid");
            return (Criteria) this;
        }

        public Criteria andRTeacheridLessThanOrEqualTo(Long value) {
            addCriterion("r_teacherId <=", value, "rTeacherid");
            return (Criteria) this;
        }

        public Criteria andRTeacheridIn(List<Long> values) {
            addCriterion("r_teacherId in", values, "rTeacherid");
            return (Criteria) this;
        }

        public Criteria andRTeacheridNotIn(List<Long> values) {
            addCriterion("r_teacherId not in", values, "rTeacherid");
            return (Criteria) this;
        }

        public Criteria andRTeacheridBetween(Long value1, Long value2) {
            addCriterion("r_teacherId between", value1, value2, "rTeacherid");
            return (Criteria) this;
        }

        public Criteria andRTeacheridNotBetween(Long value1, Long value2) {
            addCriterion("r_teacherId not between", value1, value2, "rTeacherid");
            return (Criteria) this;
        }

        public Criteria andRCourseidIsNull() {
            addCriterion("r_courseId is null");
            return (Criteria) this;
        }

        public Criteria andRCourseidIsNotNull() {
            addCriterion("r_courseId is not null");
            return (Criteria) this;
        }

        public Criteria andRCourseidEqualTo(Long value) {
            addCriterion("r_courseId =", value, "rCourseid");
            return (Criteria) this;
        }

        public Criteria andRCourseidNotEqualTo(Long value) {
            addCriterion("r_courseId <>", value, "rCourseid");
            return (Criteria) this;
        }

        public Criteria andRCourseidGreaterThan(Long value) {
            addCriterion("r_courseId >", value, "rCourseid");
            return (Criteria) this;
        }

        public Criteria andRCourseidGreaterThanOrEqualTo(Long value) {
            addCriterion("r_courseId >=", value, "rCourseid");
            return (Criteria) this;
        }

        public Criteria andRCourseidLessThan(Long value) {
            addCriterion("r_courseId <", value, "rCourseid");
            return (Criteria) this;
        }

        public Criteria andRCourseidLessThanOrEqualTo(Long value) {
            addCriterion("r_courseId <=", value, "rCourseid");
            return (Criteria) this;
        }

        public Criteria andRCourseidIn(List<Long> values) {
            addCriterion("r_courseId in", values, "rCourseid");
            return (Criteria) this;
        }

        public Criteria andRCourseidNotIn(List<Long> values) {
            addCriterion("r_courseId not in", values, "rCourseid");
            return (Criteria) this;
        }

        public Criteria andRCourseidBetween(Long value1, Long value2) {
            addCriterion("r_courseId between", value1, value2, "rCourseid");
            return (Criteria) this;
        }

        public Criteria andRCourseidNotBetween(Long value1, Long value2) {
            addCriterion("r_courseId not between", value1, value2, "rCourseid");
            return (Criteria) this;
        }

        public Criteria andRStateIsNull() {
            addCriterion("r_state is null");
            return (Criteria) this;
        }

        public Criteria andRStateIsNotNull() {
            addCriterion("r_state is not null");
            return (Criteria) this;
        }

        public Criteria andRStateEqualTo(Boolean value) {
            addCriterion("r_state =", value, "rState");
            return (Criteria) this;
        }

        public Criteria andRStateNotEqualTo(Boolean value) {
            addCriterion("r_state <>", value, "rState");
            return (Criteria) this;
        }

        public Criteria andRStateGreaterThan(Boolean value) {
            addCriterion("r_state >", value, "rState");
            return (Criteria) this;
        }

        public Criteria andRStateGreaterThanOrEqualTo(Boolean value) {
            addCriterion("r_state >=", value, "rState");
            return (Criteria) this;
        }

        public Criteria andRStateLessThan(Boolean value) {
            addCriterion("r_state <", value, "rState");
            return (Criteria) this;
        }

        public Criteria andRStateLessThanOrEqualTo(Boolean value) {
            addCriterion("r_state <=", value, "rState");
            return (Criteria) this;
        }

        public Criteria andRStateIn(List<Boolean> values) {
            addCriterion("r_state in", values, "rState");
            return (Criteria) this;
        }

        public Criteria andRStateNotIn(List<Boolean> values) {
            addCriterion("r_state not in", values, "rState");
            return (Criteria) this;
        }

        public Criteria andRStateBetween(Boolean value1, Boolean value2) {
            addCriterion("r_state between", value1, value2, "rState");
            return (Criteria) this;
        }

        public Criteria andRStateNotBetween(Boolean value1, Boolean value2) {
            addCriterion("r_state not between", value1, value2, "rState");
            return (Criteria) this;
        }

        public Criteria andRMoneyIsNull() {
            addCriterion("r_money is null");
            return (Criteria) this;
        }

        public Criteria andRMoneyIsNotNull() {
            addCriterion("r_money is not null");
            return (Criteria) this;
        }

        public Criteria andRMoneyEqualTo(Double value) {
            addCriterion("r_money =", value, "rMoney");
            return (Criteria) this;
        }

        public Criteria andRMoneyNotEqualTo(Double value) {
            addCriterion("r_money <>", value, "rMoney");
            return (Criteria) this;
        }

        public Criteria andRMoneyGreaterThan(Double value) {
            addCriterion("r_money >", value, "rMoney");
            return (Criteria) this;
        }

        public Criteria andRMoneyGreaterThanOrEqualTo(Double value) {
            addCriterion("r_money >=", value, "rMoney");
            return (Criteria) this;
        }

        public Criteria andRMoneyLessThan(Double value) {
            addCriterion("r_money <", value, "rMoney");
            return (Criteria) this;
        }

        public Criteria andRMoneyLessThanOrEqualTo(Double value) {
            addCriterion("r_money <=", value, "rMoney");
            return (Criteria) this;
        }

        public Criteria andRMoneyIn(List<Double> values) {
            addCriterion("r_money in", values, "rMoney");
            return (Criteria) this;
        }

        public Criteria andRMoneyNotIn(List<Double> values) {
            addCriterion("r_money not in", values, "rMoney");
            return (Criteria) this;
        }

        public Criteria andRMoneyBetween(Double value1, Double value2) {
            addCriterion("r_money between", value1, value2, "rMoney");
            return (Criteria) this;
        }

        public Criteria andRMoneyNotBetween(Double value1, Double value2) {
            addCriterion("r_money not between", value1, value2, "rMoney");
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
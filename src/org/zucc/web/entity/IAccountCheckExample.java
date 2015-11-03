package org.zucc.web.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class IAccountCheckExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer limitStart;

    protected Integer limitEnd;

    public IAccountCheckExample() {
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

        public Criteria andAccountCheckIdIsNull() {
            addCriterion("account_check_id is null");
            return (Criteria) this;
        }

        public Criteria andAccountCheckIdIsNotNull() {
            addCriterion("account_check_id is not null");
            return (Criteria) this;
        }

        public Criteria andAccountCheckIdEqualTo(Long value) {
            addCriterion("account_check_id =", value, "accountCheckId");
            return (Criteria) this;
        }

        public Criteria andAccountCheckIdNotEqualTo(Long value) {
            addCriterion("account_check_id <>", value, "accountCheckId");
            return (Criteria) this;
        }

        public Criteria andAccountCheckIdGreaterThan(Long value) {
            addCriterion("account_check_id >", value, "accountCheckId");
            return (Criteria) this;
        }

        public Criteria andAccountCheckIdGreaterThanOrEqualTo(Long value) {
            addCriterion("account_check_id >=", value, "accountCheckId");
            return (Criteria) this;
        }

        public Criteria andAccountCheckIdLessThan(Long value) {
            addCriterion("account_check_id <", value, "accountCheckId");
            return (Criteria) this;
        }

        public Criteria andAccountCheckIdLessThanOrEqualTo(Long value) {
            addCriterion("account_check_id <=", value, "accountCheckId");
            return (Criteria) this;
        }

        public Criteria andAccountCheckIdIn(List<Long> values) {
            addCriterion("account_check_id in", values, "accountCheckId");
            return (Criteria) this;
        }

        public Criteria andAccountCheckIdNotIn(List<Long> values) {
            addCriterion("account_check_id not in", values, "accountCheckId");
            return (Criteria) this;
        }

        public Criteria andAccountCheckIdBetween(Long value1, Long value2) {
            addCriterion("account_check_id between", value1, value2, "accountCheckId");
            return (Criteria) this;
        }

        public Criteria andAccountCheckIdNotBetween(Long value1, Long value2) {
            addCriterion("account_check_id not between", value1, value2, "accountCheckId");
            return (Criteria) this;
        }

        public Criteria andAccountCheckAccountidIsNull() {
            addCriterion("account_check_accountId is null");
            return (Criteria) this;
        }

        public Criteria andAccountCheckAccountidIsNotNull() {
            addCriterion("account_check_accountId is not null");
            return (Criteria) this;
        }

        public Criteria andAccountCheckAccountidEqualTo(Long value) {
            addCriterion("account_check_accountId =", value, "accountCheckAccountid");
            return (Criteria) this;
        }

        public Criteria andAccountCheckAccountidNotEqualTo(Long value) {
            addCriterion("account_check_accountId <>", value, "accountCheckAccountid");
            return (Criteria) this;
        }

        public Criteria andAccountCheckAccountidGreaterThan(Long value) {
            addCriterion("account_check_accountId >", value, "accountCheckAccountid");
            return (Criteria) this;
        }

        public Criteria andAccountCheckAccountidGreaterThanOrEqualTo(Long value) {
            addCriterion("account_check_accountId >=", value, "accountCheckAccountid");
            return (Criteria) this;
        }

        public Criteria andAccountCheckAccountidLessThan(Long value) {
            addCriterion("account_check_accountId <", value, "accountCheckAccountid");
            return (Criteria) this;
        }

        public Criteria andAccountCheckAccountidLessThanOrEqualTo(Long value) {
            addCriterion("account_check_accountId <=", value, "accountCheckAccountid");
            return (Criteria) this;
        }

        public Criteria andAccountCheckAccountidIn(List<Long> values) {
            addCriterion("account_check_accountId in", values, "accountCheckAccountid");
            return (Criteria) this;
        }

        public Criteria andAccountCheckAccountidNotIn(List<Long> values) {
            addCriterion("account_check_accountId not in", values, "accountCheckAccountid");
            return (Criteria) this;
        }

        public Criteria andAccountCheckAccountidBetween(Long value1, Long value2) {
            addCriterion("account_check_accountId between", value1, value2, "accountCheckAccountid");
            return (Criteria) this;
        }

        public Criteria andAccountCheckAccountidNotBetween(Long value1, Long value2) {
            addCriterion("account_check_accountId not between", value1, value2, "accountCheckAccountid");
            return (Criteria) this;
        }

        public Criteria andAccountCheckMoneyIsNull() {
            addCriterion("account_check_money is null");
            return (Criteria) this;
        }

        public Criteria andAccountCheckMoneyIsNotNull() {
            addCriterion("account_check_money is not null");
            return (Criteria) this;
        }

        public Criteria andAccountCheckMoneyEqualTo(Double value) {
            addCriterion("account_check_money =", value, "accountCheckMoney");
            return (Criteria) this;
        }

        public Criteria andAccountCheckMoneyNotEqualTo(Double value) {
            addCriterion("account_check_money <>", value, "accountCheckMoney");
            return (Criteria) this;
        }

        public Criteria andAccountCheckMoneyGreaterThan(Double value) {
            addCriterion("account_check_money >", value, "accountCheckMoney");
            return (Criteria) this;
        }

        public Criteria andAccountCheckMoneyGreaterThanOrEqualTo(Double value) {
            addCriterion("account_check_money >=", value, "accountCheckMoney");
            return (Criteria) this;
        }

        public Criteria andAccountCheckMoneyLessThan(Double value) {
            addCriterion("account_check_money <", value, "accountCheckMoney");
            return (Criteria) this;
        }

        public Criteria andAccountCheckMoneyLessThanOrEqualTo(Double value) {
            addCriterion("account_check_money <=", value, "accountCheckMoney");
            return (Criteria) this;
        }

        public Criteria andAccountCheckMoneyIn(List<Double> values) {
            addCriterion("account_check_money in", values, "accountCheckMoney");
            return (Criteria) this;
        }

        public Criteria andAccountCheckMoneyNotIn(List<Double> values) {
            addCriterion("account_check_money not in", values, "accountCheckMoney");
            return (Criteria) this;
        }

        public Criteria andAccountCheckMoneyBetween(Double value1, Double value2) {
            addCriterion("account_check_money between", value1, value2, "accountCheckMoney");
            return (Criteria) this;
        }

        public Criteria andAccountCheckMoneyNotBetween(Double value1, Double value2) {
            addCriterion("account_check_money not between", value1, value2, "accountCheckMoney");
            return (Criteria) this;
        }

        public Criteria andAccountCheckStateIsNull() {
            addCriterion("account_check_state is null");
            return (Criteria) this;
        }

        public Criteria andAccountCheckStateIsNotNull() {
            addCriterion("account_check_state is not null");
            return (Criteria) this;
        }

        public Criteria andAccountCheckStateEqualTo(Boolean value) {
            addCriterion("account_check_state =", value, "accountCheckState");
            return (Criteria) this;
        }

        public Criteria andAccountCheckStateNotEqualTo(Boolean value) {
            addCriterion("account_check_state <>", value, "accountCheckState");
            return (Criteria) this;
        }

        public Criteria andAccountCheckStateGreaterThan(Boolean value) {
            addCriterion("account_check_state >", value, "accountCheckState");
            return (Criteria) this;
        }

        public Criteria andAccountCheckStateGreaterThanOrEqualTo(Boolean value) {
            addCriterion("account_check_state >=", value, "accountCheckState");
            return (Criteria) this;
        }

        public Criteria andAccountCheckStateLessThan(Boolean value) {
            addCriterion("account_check_state <", value, "accountCheckState");
            return (Criteria) this;
        }

        public Criteria andAccountCheckStateLessThanOrEqualTo(Boolean value) {
            addCriterion("account_check_state <=", value, "accountCheckState");
            return (Criteria) this;
        }

        public Criteria andAccountCheckStateIn(List<Boolean> values) {
            addCriterion("account_check_state in", values, "accountCheckState");
            return (Criteria) this;
        }

        public Criteria andAccountCheckStateNotIn(List<Boolean> values) {
            addCriterion("account_check_state not in", values, "accountCheckState");
            return (Criteria) this;
        }

        public Criteria andAccountCheckStateBetween(Boolean value1, Boolean value2) {
            addCriterion("account_check_state between", value1, value2, "accountCheckState");
            return (Criteria) this;
        }

        public Criteria andAccountCheckStateNotBetween(Boolean value1, Boolean value2) {
            addCriterion("account_check_state not between", value1, value2, "accountCheckState");
            return (Criteria) this;
        }

        public Criteria andAccountCheckTimeIsNull() {
            addCriterion("account_check_time is null");
            return (Criteria) this;
        }

        public Criteria andAccountCheckTimeIsNotNull() {
            addCriterion("account_check_time is not null");
            return (Criteria) this;
        }

        public Criteria andAccountCheckTimeEqualTo(Date value) {
            addCriterion("account_check_time =", value, "accountCheckTime");
            return (Criteria) this;
        }

        public Criteria andAccountCheckTimeNotEqualTo(Date value) {
            addCriterion("account_check_time <>", value, "accountCheckTime");
            return (Criteria) this;
        }

        public Criteria andAccountCheckTimeGreaterThan(Date value) {
            addCriterion("account_check_time >", value, "accountCheckTime");
            return (Criteria) this;
        }

        public Criteria andAccountCheckTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("account_check_time >=", value, "accountCheckTime");
            return (Criteria) this;
        }

        public Criteria andAccountCheckTimeLessThan(Date value) {
            addCriterion("account_check_time <", value, "accountCheckTime");
            return (Criteria) this;
        }

        public Criteria andAccountCheckTimeLessThanOrEqualTo(Date value) {
            addCriterion("account_check_time <=", value, "accountCheckTime");
            return (Criteria) this;
        }

        public Criteria andAccountCheckTimeIn(List<Date> values) {
            addCriterion("account_check_time in", values, "accountCheckTime");
            return (Criteria) this;
        }

        public Criteria andAccountCheckTimeNotIn(List<Date> values) {
            addCriterion("account_check_time not in", values, "accountCheckTime");
            return (Criteria) this;
        }

        public Criteria andAccountCheckTimeBetween(Date value1, Date value2) {
            addCriterion("account_check_time between", value1, value2, "accountCheckTime");
            return (Criteria) this;
        }

        public Criteria andAccountCheckTimeNotBetween(Date value1, Date value2) {
            addCriterion("account_check_time not between", value1, value2, "accountCheckTime");
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
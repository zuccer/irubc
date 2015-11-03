package org.zucc.web.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class IAccountDetailExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer limitStart;

    protected Integer limitEnd;

    public IAccountDetailExample() {
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

        public Criteria andAccountDetailIdIsNull() {
            addCriterion("account_detail_id is null");
            return (Criteria) this;
        }

        public Criteria andAccountDetailIdIsNotNull() {
            addCriterion("account_detail_id is not null");
            return (Criteria) this;
        }

        public Criteria andAccountDetailIdEqualTo(Long value) {
            addCriterion("account_detail_id =", value, "accountDetailId");
            return (Criteria) this;
        }

        public Criteria andAccountDetailIdNotEqualTo(Long value) {
            addCriterion("account_detail_id <>", value, "accountDetailId");
            return (Criteria) this;
        }

        public Criteria andAccountDetailIdGreaterThan(Long value) {
            addCriterion("account_detail_id >", value, "accountDetailId");
            return (Criteria) this;
        }

        public Criteria andAccountDetailIdGreaterThanOrEqualTo(Long value) {
            addCriterion("account_detail_id >=", value, "accountDetailId");
            return (Criteria) this;
        }

        public Criteria andAccountDetailIdLessThan(Long value) {
            addCriterion("account_detail_id <", value, "accountDetailId");
            return (Criteria) this;
        }

        public Criteria andAccountDetailIdLessThanOrEqualTo(Long value) {
            addCriterion("account_detail_id <=", value, "accountDetailId");
            return (Criteria) this;
        }

        public Criteria andAccountDetailIdIn(List<Long> values) {
            addCriterion("account_detail_id in", values, "accountDetailId");
            return (Criteria) this;
        }

        public Criteria andAccountDetailIdNotIn(List<Long> values) {
            addCriterion("account_detail_id not in", values, "accountDetailId");
            return (Criteria) this;
        }

        public Criteria andAccountDetailIdBetween(Long value1, Long value2) {
            addCriterion("account_detail_id between", value1, value2, "accountDetailId");
            return (Criteria) this;
        }

        public Criteria andAccountDetailIdNotBetween(Long value1, Long value2) {
            addCriterion("account_detail_id not between", value1, value2, "accountDetailId");
            return (Criteria) this;
        }

        public Criteria andAccountIdIsNull() {
            addCriterion("account_id is null");
            return (Criteria) this;
        }

        public Criteria andAccountIdIsNotNull() {
            addCriterion("account_id is not null");
            return (Criteria) this;
        }

        public Criteria andAccountIdEqualTo(Long value) {
            addCriterion("account_id =", value, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdNotEqualTo(Long value) {
            addCriterion("account_id <>", value, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdGreaterThan(Long value) {
            addCriterion("account_id >", value, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdGreaterThanOrEqualTo(Long value) {
            addCriterion("account_id >=", value, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdLessThan(Long value) {
            addCriterion("account_id <", value, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdLessThanOrEqualTo(Long value) {
            addCriterion("account_id <=", value, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdIn(List<Long> values) {
            addCriterion("account_id in", values, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdNotIn(List<Long> values) {
            addCriterion("account_id not in", values, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdBetween(Long value1, Long value2) {
            addCriterion("account_id between", value1, value2, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdNotBetween(Long value1, Long value2) {
            addCriterion("account_id not between", value1, value2, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountMoneyIsNull() {
            addCriterion("account_money is null");
            return (Criteria) this;
        }

        public Criteria andAccountMoneyIsNotNull() {
            addCriterion("account_money is not null");
            return (Criteria) this;
        }

        public Criteria andAccountMoneyEqualTo(Double value) {
            addCriterion("account_money =", value, "accountMoney");
            return (Criteria) this;
        }

        public Criteria andAccountMoneyNotEqualTo(Double value) {
            addCriterion("account_money <>", value, "accountMoney");
            return (Criteria) this;
        }

        public Criteria andAccountMoneyGreaterThan(Double value) {
            addCriterion("account_money >", value, "accountMoney");
            return (Criteria) this;
        }

        public Criteria andAccountMoneyGreaterThanOrEqualTo(Double value) {
            addCriterion("account_money >=", value, "accountMoney");
            return (Criteria) this;
        }

        public Criteria andAccountMoneyLessThan(Double value) {
            addCriterion("account_money <", value, "accountMoney");
            return (Criteria) this;
        }

        public Criteria andAccountMoneyLessThanOrEqualTo(Double value) {
            addCriterion("account_money <=", value, "accountMoney");
            return (Criteria) this;
        }

        public Criteria andAccountMoneyIn(List<Double> values) {
            addCriterion("account_money in", values, "accountMoney");
            return (Criteria) this;
        }

        public Criteria andAccountMoneyNotIn(List<Double> values) {
            addCriterion("account_money not in", values, "accountMoney");
            return (Criteria) this;
        }

        public Criteria andAccountMoneyBetween(Double value1, Double value2) {
            addCriterion("account_money between", value1, value2, "accountMoney");
            return (Criteria) this;
        }

        public Criteria andAccountMoneyNotBetween(Double value1, Double value2) {
            addCriterion("account_money not between", value1, value2, "accountMoney");
            return (Criteria) this;
        }

        public Criteria andAccountCreatetimeIsNull() {
            addCriterion("account_createTime is null");
            return (Criteria) this;
        }

        public Criteria andAccountCreatetimeIsNotNull() {
            addCriterion("account_createTime is not null");
            return (Criteria) this;
        }

        public Criteria andAccountCreatetimeEqualTo(Date value) {
            addCriterion("account_createTime =", value, "accountCreatetime");
            return (Criteria) this;
        }

        public Criteria andAccountCreatetimeNotEqualTo(Date value) {
            addCriterion("account_createTime <>", value, "accountCreatetime");
            return (Criteria) this;
        }

        public Criteria andAccountCreatetimeGreaterThan(Date value) {
            addCriterion("account_createTime >", value, "accountCreatetime");
            return (Criteria) this;
        }

        public Criteria andAccountCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("account_createTime >=", value, "accountCreatetime");
            return (Criteria) this;
        }

        public Criteria andAccountCreatetimeLessThan(Date value) {
            addCriterion("account_createTime <", value, "accountCreatetime");
            return (Criteria) this;
        }

        public Criteria andAccountCreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("account_createTime <=", value, "accountCreatetime");
            return (Criteria) this;
        }

        public Criteria andAccountCreatetimeIn(List<Date> values) {
            addCriterion("account_createTime in", values, "accountCreatetime");
            return (Criteria) this;
        }

        public Criteria andAccountCreatetimeNotIn(List<Date> values) {
            addCriterion("account_createTime not in", values, "accountCreatetime");
            return (Criteria) this;
        }

        public Criteria andAccountCreatetimeBetween(Date value1, Date value2) {
            addCriterion("account_createTime between", value1, value2, "accountCreatetime");
            return (Criteria) this;
        }

        public Criteria andAccountCreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("account_createTime not between", value1, value2, "accountCreatetime");
            return (Criteria) this;
        }

        public Criteria andAccountStateIsNull() {
            addCriterion("account_state is null");
            return (Criteria) this;
        }

        public Criteria andAccountStateIsNotNull() {
            addCriterion("account_state is not null");
            return (Criteria) this;
        }

        public Criteria andAccountStateEqualTo(Boolean value) {
            addCriterion("account_state =", value, "accountState");
            return (Criteria) this;
        }

        public Criteria andAccountStateNotEqualTo(Boolean value) {
            addCriterion("account_state <>", value, "accountState");
            return (Criteria) this;
        }

        public Criteria andAccountStateGreaterThan(Boolean value) {
            addCriterion("account_state >", value, "accountState");
            return (Criteria) this;
        }

        public Criteria andAccountStateGreaterThanOrEqualTo(Boolean value) {
            addCriterion("account_state >=", value, "accountState");
            return (Criteria) this;
        }

        public Criteria andAccountStateLessThan(Boolean value) {
            addCriterion("account_state <", value, "accountState");
            return (Criteria) this;
        }

        public Criteria andAccountStateLessThanOrEqualTo(Boolean value) {
            addCriterion("account_state <=", value, "accountState");
            return (Criteria) this;
        }

        public Criteria andAccountStateIn(List<Boolean> values) {
            addCriterion("account_state in", values, "accountState");
            return (Criteria) this;
        }

        public Criteria andAccountStateNotIn(List<Boolean> values) {
            addCriterion("account_state not in", values, "accountState");
            return (Criteria) this;
        }

        public Criteria andAccountStateBetween(Boolean value1, Boolean value2) {
            addCriterion("account_state between", value1, value2, "accountState");
            return (Criteria) this;
        }

        public Criteria andAccountStateNotBetween(Boolean value1, Boolean value2) {
            addCriterion("account_state not between", value1, value2, "accountState");
            return (Criteria) this;
        }

        public Criteria andAccountTypeIsNull() {
            addCriterion("account_type is null");
            return (Criteria) this;
        }

        public Criteria andAccountTypeIsNotNull() {
            addCriterion("account_type is not null");
            return (Criteria) this;
        }

        public Criteria andAccountTypeEqualTo(Boolean value) {
            addCriterion("account_type =", value, "accountType");
            return (Criteria) this;
        }

        public Criteria andAccountTypeNotEqualTo(Boolean value) {
            addCriterion("account_type <>", value, "accountType");
            return (Criteria) this;
        }

        public Criteria andAccountTypeGreaterThan(Boolean value) {
            addCriterion("account_type >", value, "accountType");
            return (Criteria) this;
        }

        public Criteria andAccountTypeGreaterThanOrEqualTo(Boolean value) {
            addCriterion("account_type >=", value, "accountType");
            return (Criteria) this;
        }

        public Criteria andAccountTypeLessThan(Boolean value) {
            addCriterion("account_type <", value, "accountType");
            return (Criteria) this;
        }

        public Criteria andAccountTypeLessThanOrEqualTo(Boolean value) {
            addCriterion("account_type <=", value, "accountType");
            return (Criteria) this;
        }

        public Criteria andAccountTypeIn(List<Boolean> values) {
            addCriterion("account_type in", values, "accountType");
            return (Criteria) this;
        }

        public Criteria andAccountTypeNotIn(List<Boolean> values) {
            addCriterion("account_type not in", values, "accountType");
            return (Criteria) this;
        }

        public Criteria andAccountTypeBetween(Boolean value1, Boolean value2) {
            addCriterion("account_type between", value1, value2, "accountType");
            return (Criteria) this;
        }

        public Criteria andAccountTypeNotBetween(Boolean value1, Boolean value2) {
            addCriterion("account_type not between", value1, value2, "accountType");
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
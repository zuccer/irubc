package org.zucc.web.entity;

import java.util.ArrayList;
import java.util.List;

public class IAccountExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer limitStart;

    protected Integer limitEnd;

    public IAccountExample() {
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

        public Criteria andAidIsNull() {
            addCriterion("aid is null");
            return (Criteria) this;
        }

        public Criteria andAidIsNotNull() {
            addCriterion("aid is not null");
            return (Criteria) this;
        }

        public Criteria andAidEqualTo(Long value) {
            addCriterion("aid =", value, "aid");
            return (Criteria) this;
        }

        public Criteria andAidNotEqualTo(Long value) {
            addCriterion("aid <>", value, "aid");
            return (Criteria) this;
        }

        public Criteria andAidGreaterThan(Long value) {
            addCriterion("aid >", value, "aid");
            return (Criteria) this;
        }

        public Criteria andAidGreaterThanOrEqualTo(Long value) {
            addCriterion("aid >=", value, "aid");
            return (Criteria) this;
        }

        public Criteria andAidLessThan(Long value) {
            addCriterion("aid <", value, "aid");
            return (Criteria) this;
        }

        public Criteria andAidLessThanOrEqualTo(Long value) {
            addCriterion("aid <=", value, "aid");
            return (Criteria) this;
        }

        public Criteria andAidIn(List<Long> values) {
            addCriterion("aid in", values, "aid");
            return (Criteria) this;
        }

        public Criteria andAidNotIn(List<Long> values) {
            addCriterion("aid not in", values, "aid");
            return (Criteria) this;
        }

        public Criteria andAidBetween(Long value1, Long value2) {
            addCriterion("aid between", value1, value2, "aid");
            return (Criteria) this;
        }

        public Criteria andAidNotBetween(Long value1, Long value2) {
            addCriterion("aid not between", value1, value2, "aid");
            return (Criteria) this;
        }

        public Criteria andAUseridIsNull() {
            addCriterion("a_userId is null");
            return (Criteria) this;
        }

        public Criteria andAUseridIsNotNull() {
            addCriterion("a_userId is not null");
            return (Criteria) this;
        }

        public Criteria andAUseridEqualTo(Long value) {
            addCriterion("a_userId =", value, "aUserid");
            return (Criteria) this;
        }

        public Criteria andAUseridNotEqualTo(Long value) {
            addCriterion("a_userId <>", value, "aUserid");
            return (Criteria) this;
        }

        public Criteria andAUseridGreaterThan(Long value) {
            addCriterion("a_userId >", value, "aUserid");
            return (Criteria) this;
        }

        public Criteria andAUseridGreaterThanOrEqualTo(Long value) {
            addCriterion("a_userId >=", value, "aUserid");
            return (Criteria) this;
        }

        public Criteria andAUseridLessThan(Long value) {
            addCriterion("a_userId <", value, "aUserid");
            return (Criteria) this;
        }

        public Criteria andAUseridLessThanOrEqualTo(Long value) {
            addCriterion("a_userId <=", value, "aUserid");
            return (Criteria) this;
        }

        public Criteria andAUseridIn(List<Long> values) {
            addCriterion("a_userId in", values, "aUserid");
            return (Criteria) this;
        }

        public Criteria andAUseridNotIn(List<Long> values) {
            addCriterion("a_userId not in", values, "aUserid");
            return (Criteria) this;
        }

        public Criteria andAUseridBetween(Long value1, Long value2) {
            addCriterion("a_userId between", value1, value2, "aUserid");
            return (Criteria) this;
        }

        public Criteria andAUseridNotBetween(Long value1, Long value2) {
            addCriterion("a_userId not between", value1, value2, "aUserid");
            return (Criteria) this;
        }

        public Criteria andAMoneyIsNull() {
            addCriterion("a_money is null");
            return (Criteria) this;
        }

        public Criteria andAMoneyIsNotNull() {
            addCriterion("a_money is not null");
            return (Criteria) this;
        }

        public Criteria andAMoneyEqualTo(Double value) {
            addCriterion("a_money =", value, "aMoney");
            return (Criteria) this;
        }

        public Criteria andAMoneyNotEqualTo(Double value) {
            addCriterion("a_money <>", value, "aMoney");
            return (Criteria) this;
        }

        public Criteria andAMoneyGreaterThan(Double value) {
            addCriterion("a_money >", value, "aMoney");
            return (Criteria) this;
        }

        public Criteria andAMoneyGreaterThanOrEqualTo(Double value) {
            addCriterion("a_money >=", value, "aMoney");
            return (Criteria) this;
        }

        public Criteria andAMoneyLessThan(Double value) {
            addCriterion("a_money <", value, "aMoney");
            return (Criteria) this;
        }

        public Criteria andAMoneyLessThanOrEqualTo(Double value) {
            addCriterion("a_money <=", value, "aMoney");
            return (Criteria) this;
        }

        public Criteria andAMoneyIn(List<Double> values) {
            addCriterion("a_money in", values, "aMoney");
            return (Criteria) this;
        }

        public Criteria andAMoneyNotIn(List<Double> values) {
            addCriterion("a_money not in", values, "aMoney");
            return (Criteria) this;
        }

        public Criteria andAMoneyBetween(Double value1, Double value2) {
            addCriterion("a_money between", value1, value2, "aMoney");
            return (Criteria) this;
        }

        public Criteria andAMoneyNotBetween(Double value1, Double value2) {
            addCriterion("a_money not between", value1, value2, "aMoney");
            return (Criteria) this;
        }

        public Criteria andARewardMoneyIsNull() {
            addCriterion("a_reward_money is null");
            return (Criteria) this;
        }

        public Criteria andARewardMoneyIsNotNull() {
            addCriterion("a_reward_money is not null");
            return (Criteria) this;
        }

        public Criteria andARewardMoneyEqualTo(Double value) {
            addCriterion("a_reward_money =", value, "aRewardMoney");
            return (Criteria) this;
        }

        public Criteria andARewardMoneyNotEqualTo(Double value) {
            addCriterion("a_reward_money <>", value, "aRewardMoney");
            return (Criteria) this;
        }

        public Criteria andARewardMoneyGreaterThan(Double value) {
            addCriterion("a_reward_money >", value, "aRewardMoney");
            return (Criteria) this;
        }

        public Criteria andARewardMoneyGreaterThanOrEqualTo(Double value) {
            addCriterion("a_reward_money >=", value, "aRewardMoney");
            return (Criteria) this;
        }

        public Criteria andARewardMoneyLessThan(Double value) {
            addCriterion("a_reward_money <", value, "aRewardMoney");
            return (Criteria) this;
        }

        public Criteria andARewardMoneyLessThanOrEqualTo(Double value) {
            addCriterion("a_reward_money <=", value, "aRewardMoney");
            return (Criteria) this;
        }

        public Criteria andARewardMoneyIn(List<Double> values) {
            addCriterion("a_reward_money in", values, "aRewardMoney");
            return (Criteria) this;
        }

        public Criteria andARewardMoneyNotIn(List<Double> values) {
            addCriterion("a_reward_money not in", values, "aRewardMoney");
            return (Criteria) this;
        }

        public Criteria andARewardMoneyBetween(Double value1, Double value2) {
            addCriterion("a_reward_money between", value1, value2, "aRewardMoney");
            return (Criteria) this;
        }

        public Criteria andARewardMoneyNotBetween(Double value1, Double value2) {
            addCriterion("a_reward_money not between", value1, value2, "aRewardMoney");
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
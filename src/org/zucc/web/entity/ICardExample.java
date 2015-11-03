package org.zucc.web.entity;

import java.util.ArrayList;
import java.util.List;

public class ICardExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer limitStart;

    protected Integer limitEnd;

    public ICardExample() {
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

        public Criteria andCardidIsNull() {
            addCriterion("cardId is null");
            return (Criteria) this;
        }

        public Criteria andCardidIsNotNull() {
            addCriterion("cardId is not null");
            return (Criteria) this;
        }

        public Criteria andCardidEqualTo(Long value) {
            addCriterion("cardId =", value, "cardid");
            return (Criteria) this;
        }

        public Criteria andCardidNotEqualTo(Long value) {
            addCriterion("cardId <>", value, "cardid");
            return (Criteria) this;
        }

        public Criteria andCardidGreaterThan(Long value) {
            addCriterion("cardId >", value, "cardid");
            return (Criteria) this;
        }

        public Criteria andCardidGreaterThanOrEqualTo(Long value) {
            addCriterion("cardId >=", value, "cardid");
            return (Criteria) this;
        }

        public Criteria andCardidLessThan(Long value) {
            addCriterion("cardId <", value, "cardid");
            return (Criteria) this;
        }

        public Criteria andCardidLessThanOrEqualTo(Long value) {
            addCriterion("cardId <=", value, "cardid");
            return (Criteria) this;
        }

        public Criteria andCardidIn(List<Long> values) {
            addCriterion("cardId in", values, "cardid");
            return (Criteria) this;
        }

        public Criteria andCardidNotIn(List<Long> values) {
            addCriterion("cardId not in", values, "cardid");
            return (Criteria) this;
        }

        public Criteria andCardidBetween(Long value1, Long value2) {
            addCriterion("cardId between", value1, value2, "cardid");
            return (Criteria) this;
        }

        public Criteria andCardidNotBetween(Long value1, Long value2) {
            addCriterion("cardId not between", value1, value2, "cardid");
            return (Criteria) this;
        }

        public Criteria andCardnumIsNull() {
            addCriterion("cardNum is null");
            return (Criteria) this;
        }

        public Criteria andCardnumIsNotNull() {
            addCriterion("cardNum is not null");
            return (Criteria) this;
        }

        public Criteria andCardnumEqualTo(Integer value) {
            addCriterion("cardNum =", value, "cardnum");
            return (Criteria) this;
        }

        public Criteria andCardnumNotEqualTo(Integer value) {
            addCriterion("cardNum <>", value, "cardnum");
            return (Criteria) this;
        }

        public Criteria andCardnumGreaterThan(Integer value) {
            addCriterion("cardNum >", value, "cardnum");
            return (Criteria) this;
        }

        public Criteria andCardnumGreaterThanOrEqualTo(Integer value) {
            addCriterion("cardNum >=", value, "cardnum");
            return (Criteria) this;
        }

        public Criteria andCardnumLessThan(Integer value) {
            addCriterion("cardNum <", value, "cardnum");
            return (Criteria) this;
        }

        public Criteria andCardnumLessThanOrEqualTo(Integer value) {
            addCriterion("cardNum <=", value, "cardnum");
            return (Criteria) this;
        }

        public Criteria andCardnumIn(List<Integer> values) {
            addCriterion("cardNum in", values, "cardnum");
            return (Criteria) this;
        }

        public Criteria andCardnumNotIn(List<Integer> values) {
            addCriterion("cardNum not in", values, "cardnum");
            return (Criteria) this;
        }

        public Criteria andCardnumBetween(Integer value1, Integer value2) {
            addCriterion("cardNum between", value1, value2, "cardnum");
            return (Criteria) this;
        }

        public Criteria andCardnumNotBetween(Integer value1, Integer value2) {
            addCriterion("cardNum not between", value1, value2, "cardnum");
            return (Criteria) this;
        }

        public Criteria andAccountAidIsNull() {
            addCriterion("account_aid is null");
            return (Criteria) this;
        }

        public Criteria andAccountAidIsNotNull() {
            addCriterion("account_aid is not null");
            return (Criteria) this;
        }

        public Criteria andAccountAidEqualTo(Long value) {
            addCriterion("account_aid =", value, "accountAid");
            return (Criteria) this;
        }

        public Criteria andAccountAidNotEqualTo(Long value) {
            addCriterion("account_aid <>", value, "accountAid");
            return (Criteria) this;
        }

        public Criteria andAccountAidGreaterThan(Long value) {
            addCriterion("account_aid >", value, "accountAid");
            return (Criteria) this;
        }

        public Criteria andAccountAidGreaterThanOrEqualTo(Long value) {
            addCriterion("account_aid >=", value, "accountAid");
            return (Criteria) this;
        }

        public Criteria andAccountAidLessThan(Long value) {
            addCriterion("account_aid <", value, "accountAid");
            return (Criteria) this;
        }

        public Criteria andAccountAidLessThanOrEqualTo(Long value) {
            addCriterion("account_aid <=", value, "accountAid");
            return (Criteria) this;
        }

        public Criteria andAccountAidIn(List<Long> values) {
            addCriterion("account_aid in", values, "accountAid");
            return (Criteria) this;
        }

        public Criteria andAccountAidNotIn(List<Long> values) {
            addCriterion("account_aid not in", values, "accountAid");
            return (Criteria) this;
        }

        public Criteria andAccountAidBetween(Long value1, Long value2) {
            addCriterion("account_aid between", value1, value2, "accountAid");
            return (Criteria) this;
        }

        public Criteria andAccountAidNotBetween(Long value1, Long value2) {
            addCriterion("account_aid not between", value1, value2, "accountAid");
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
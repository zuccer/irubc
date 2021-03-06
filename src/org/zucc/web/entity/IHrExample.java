package org.zucc.web.entity;

import java.util.ArrayList;
import java.util.List;

public class IHrExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer limitStart;

    protected Integer limitEnd;

    public IHrExample() {
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

        public Criteria andHridIsNull() {
            addCriterion("hrId is null");
            return (Criteria) this;
        }

        public Criteria andHridIsNotNull() {
            addCriterion("hrId is not null");
            return (Criteria) this;
        }

        public Criteria andHridEqualTo(Long value) {
            addCriterion("hrId =", value, "hrid");
            return (Criteria) this;
        }

        public Criteria andHridNotEqualTo(Long value) {
            addCriterion("hrId <>", value, "hrid");
            return (Criteria) this;
        }

        public Criteria andHridGreaterThan(Long value) {
            addCriterion("hrId >", value, "hrid");
            return (Criteria) this;
        }

        public Criteria andHridGreaterThanOrEqualTo(Long value) {
            addCriterion("hrId >=", value, "hrid");
            return (Criteria) this;
        }

        public Criteria andHridLessThan(Long value) {
            addCriterion("hrId <", value, "hrid");
            return (Criteria) this;
        }

        public Criteria andHridLessThanOrEqualTo(Long value) {
            addCriterion("hrId <=", value, "hrid");
            return (Criteria) this;
        }

        public Criteria andHridIn(List<Long> values) {
            addCriterion("hrId in", values, "hrid");
            return (Criteria) this;
        }

        public Criteria andHridNotIn(List<Long> values) {
            addCriterion("hrId not in", values, "hrid");
            return (Criteria) this;
        }

        public Criteria andHridBetween(Long value1, Long value2) {
            addCriterion("hrId between", value1, value2, "hrid");
            return (Criteria) this;
        }

        public Criteria andHridNotBetween(Long value1, Long value2) {
            addCriterion("hrId not between", value1, value2, "hrid");
            return (Criteria) this;
        }

        public Criteria andHUseridIsNull() {
            addCriterion("h_userId is null");
            return (Criteria) this;
        }

        public Criteria andHUseridIsNotNull() {
            addCriterion("h_userId is not null");
            return (Criteria) this;
        }

        public Criteria andHUseridEqualTo(Long value) {
            addCriterion("h_userId =", value, "hUserid");
            return (Criteria) this;
        }

        public Criteria andHUseridNotEqualTo(Long value) {
            addCriterion("h_userId <>", value, "hUserid");
            return (Criteria) this;
        }

        public Criteria andHUseridGreaterThan(Long value) {
            addCriterion("h_userId >", value, "hUserid");
            return (Criteria) this;
        }

        public Criteria andHUseridGreaterThanOrEqualTo(Long value) {
            addCriterion("h_userId >=", value, "hUserid");
            return (Criteria) this;
        }

        public Criteria andHUseridLessThan(Long value) {
            addCriterion("h_userId <", value, "hUserid");
            return (Criteria) this;
        }

        public Criteria andHUseridLessThanOrEqualTo(Long value) {
            addCriterion("h_userId <=", value, "hUserid");
            return (Criteria) this;
        }

        public Criteria andHUseridIn(List<Long> values) {
            addCriterion("h_userId in", values, "hUserid");
            return (Criteria) this;
        }

        public Criteria andHUseridNotIn(List<Long> values) {
            addCriterion("h_userId not in", values, "hUserid");
            return (Criteria) this;
        }

        public Criteria andHUseridBetween(Long value1, Long value2) {
            addCriterion("h_userId between", value1, value2, "hUserid");
            return (Criteria) this;
        }

        public Criteria andHUseridNotBetween(Long value1, Long value2) {
            addCriterion("h_userId not between", value1, value2, "hUserid");
            return (Criteria) this;
        }

        public Criteria andHCompanyidIsNull() {
            addCriterion("h_companyId is null");
            return (Criteria) this;
        }

        public Criteria andHCompanyidIsNotNull() {
            addCriterion("h_companyId is not null");
            return (Criteria) this;
        }

        public Criteria andHCompanyidEqualTo(Long value) {
            addCriterion("h_companyId =", value, "hCompanyid");
            return (Criteria) this;
        }

        public Criteria andHCompanyidNotEqualTo(Long value) {
            addCriterion("h_companyId <>", value, "hCompanyid");
            return (Criteria) this;
        }

        public Criteria andHCompanyidGreaterThan(Long value) {
            addCriterion("h_companyId >", value, "hCompanyid");
            return (Criteria) this;
        }

        public Criteria andHCompanyidGreaterThanOrEqualTo(Long value) {
            addCriterion("h_companyId >=", value, "hCompanyid");
            return (Criteria) this;
        }

        public Criteria andHCompanyidLessThan(Long value) {
            addCriterion("h_companyId <", value, "hCompanyid");
            return (Criteria) this;
        }

        public Criteria andHCompanyidLessThanOrEqualTo(Long value) {
            addCriterion("h_companyId <=", value, "hCompanyid");
            return (Criteria) this;
        }

        public Criteria andHCompanyidIn(List<Long> values) {
            addCriterion("h_companyId in", values, "hCompanyid");
            return (Criteria) this;
        }

        public Criteria andHCompanyidNotIn(List<Long> values) {
            addCriterion("h_companyId not in", values, "hCompanyid");
            return (Criteria) this;
        }

        public Criteria andHCompanyidBetween(Long value1, Long value2) {
            addCriterion("h_companyId between", value1, value2, "hCompanyid");
            return (Criteria) this;
        }

        public Criteria andHCompanyidNotBetween(Long value1, Long value2) {
            addCriterion("h_companyId not between", value1, value2, "hCompanyid");
            return (Criteria) this;
        }

        public Criteria andHPositionIsNull() {
            addCriterion("h_position is null");
            return (Criteria) this;
        }

        public Criteria andHPositionIsNotNull() {
            addCriterion("h_position is not null");
            return (Criteria) this;
        }

        public Criteria andHPositionEqualTo(String value) {
            addCriterion("h_position =", value, "hPosition");
            return (Criteria) this;
        }

        public Criteria andHPositionNotEqualTo(String value) {
            addCriterion("h_position <>", value, "hPosition");
            return (Criteria) this;
        }

        public Criteria andHPositionGreaterThan(String value) {
            addCriterion("h_position >", value, "hPosition");
            return (Criteria) this;
        }

        public Criteria andHPositionGreaterThanOrEqualTo(String value) {
            addCriterion("h_position >=", value, "hPosition");
            return (Criteria) this;
        }

        public Criteria andHPositionLessThan(String value) {
            addCriterion("h_position <", value, "hPosition");
            return (Criteria) this;
        }

        public Criteria andHPositionLessThanOrEqualTo(String value) {
            addCriterion("h_position <=", value, "hPosition");
            return (Criteria) this;
        }

        public Criteria andHPositionLike(String value) {
            addCriterion("h_position like", value, "hPosition");
            return (Criteria) this;
        }

        public Criteria andHPositionNotLike(String value) {
            addCriterion("h_position not like", value, "hPosition");
            return (Criteria) this;
        }

        public Criteria andHPositionIn(List<String> values) {
            addCriterion("h_position in", values, "hPosition");
            return (Criteria) this;
        }

        public Criteria andHPositionNotIn(List<String> values) {
            addCriterion("h_position not in", values, "hPosition");
            return (Criteria) this;
        }

        public Criteria andHPositionBetween(String value1, String value2) {
            addCriterion("h_position between", value1, value2, "hPosition");
            return (Criteria) this;
        }

        public Criteria andHPositionNotBetween(String value1, String value2) {
            addCriterion("h_position not between", value1, value2, "hPosition");
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
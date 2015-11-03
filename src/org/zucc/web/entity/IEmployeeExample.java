package org.zucc.web.entity;

import java.util.ArrayList;
import java.util.List;

public class IEmployeeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer limitStart;

    protected Integer limitEnd;

    public IEmployeeExample() {
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

        public Criteria andEidIsNull() {
            addCriterion("eid is null");
            return (Criteria) this;
        }

        public Criteria andEidIsNotNull() {
            addCriterion("eid is not null");
            return (Criteria) this;
        }

        public Criteria andEidEqualTo(Long value) {
            addCriterion("eid =", value, "eid");
            return (Criteria) this;
        }

        public Criteria andEidNotEqualTo(Long value) {
            addCriterion("eid <>", value, "eid");
            return (Criteria) this;
        }

        public Criteria andEidGreaterThan(Long value) {
            addCriterion("eid >", value, "eid");
            return (Criteria) this;
        }

        public Criteria andEidGreaterThanOrEqualTo(Long value) {
            addCriterion("eid >=", value, "eid");
            return (Criteria) this;
        }

        public Criteria andEidLessThan(Long value) {
            addCriterion("eid <", value, "eid");
            return (Criteria) this;
        }

        public Criteria andEidLessThanOrEqualTo(Long value) {
            addCriterion("eid <=", value, "eid");
            return (Criteria) this;
        }

        public Criteria andEidIn(List<Long> values) {
            addCriterion("eid in", values, "eid");
            return (Criteria) this;
        }

        public Criteria andEidNotIn(List<Long> values) {
            addCriterion("eid not in", values, "eid");
            return (Criteria) this;
        }

        public Criteria andEidBetween(Long value1, Long value2) {
            addCriterion("eid between", value1, value2, "eid");
            return (Criteria) this;
        }

        public Criteria andEidNotBetween(Long value1, Long value2) {
            addCriterion("eid not between", value1, value2, "eid");
            return (Criteria) this;
        }

        public Criteria andEUseridIsNull() {
            addCriterion("e_userId is null");
            return (Criteria) this;
        }

        public Criteria andEUseridIsNotNull() {
            addCriterion("e_userId is not null");
            return (Criteria) this;
        }

        public Criteria andEUseridEqualTo(Long value) {
            addCriterion("e_userId =", value, "eUserid");
            return (Criteria) this;
        }

        public Criteria andEUseridNotEqualTo(Long value) {
            addCriterion("e_userId <>", value, "eUserid");
            return (Criteria) this;
        }

        public Criteria andEUseridGreaterThan(Long value) {
            addCriterion("e_userId >", value, "eUserid");
            return (Criteria) this;
        }

        public Criteria andEUseridGreaterThanOrEqualTo(Long value) {
            addCriterion("e_userId >=", value, "eUserid");
            return (Criteria) this;
        }

        public Criteria andEUseridLessThan(Long value) {
            addCriterion("e_userId <", value, "eUserid");
            return (Criteria) this;
        }

        public Criteria andEUseridLessThanOrEqualTo(Long value) {
            addCriterion("e_userId <=", value, "eUserid");
            return (Criteria) this;
        }

        public Criteria andEUseridIn(List<Long> values) {
            addCriterion("e_userId in", values, "eUserid");
            return (Criteria) this;
        }

        public Criteria andEUseridNotIn(List<Long> values) {
            addCriterion("e_userId not in", values, "eUserid");
            return (Criteria) this;
        }

        public Criteria andEUseridBetween(Long value1, Long value2) {
            addCriterion("e_userId between", value1, value2, "eUserid");
            return (Criteria) this;
        }

        public Criteria andEUseridNotBetween(Long value1, Long value2) {
            addCriterion("e_userId not between", value1, value2, "eUserid");
            return (Criteria) this;
        }

        public Criteria andECompanyidIsNull() {
            addCriterion("e_companyId is null");
            return (Criteria) this;
        }

        public Criteria andECompanyidIsNotNull() {
            addCriterion("e_companyId is not null");
            return (Criteria) this;
        }

        public Criteria andECompanyidEqualTo(Long value) {
            addCriterion("e_companyId =", value, "eCompanyid");
            return (Criteria) this;
        }

        public Criteria andECompanyidNotEqualTo(Long value) {
            addCriterion("e_companyId <>", value, "eCompanyid");
            return (Criteria) this;
        }

        public Criteria andECompanyidGreaterThan(Long value) {
            addCriterion("e_companyId >", value, "eCompanyid");
            return (Criteria) this;
        }

        public Criteria andECompanyidGreaterThanOrEqualTo(Long value) {
            addCriterion("e_companyId >=", value, "eCompanyid");
            return (Criteria) this;
        }

        public Criteria andECompanyidLessThan(Long value) {
            addCriterion("e_companyId <", value, "eCompanyid");
            return (Criteria) this;
        }

        public Criteria andECompanyidLessThanOrEqualTo(Long value) {
            addCriterion("e_companyId <=", value, "eCompanyid");
            return (Criteria) this;
        }

        public Criteria andECompanyidIn(List<Long> values) {
            addCriterion("e_companyId in", values, "eCompanyid");
            return (Criteria) this;
        }

        public Criteria andECompanyidNotIn(List<Long> values) {
            addCriterion("e_companyId not in", values, "eCompanyid");
            return (Criteria) this;
        }

        public Criteria andECompanyidBetween(Long value1, Long value2) {
            addCriterion("e_companyId between", value1, value2, "eCompanyid");
            return (Criteria) this;
        }

        public Criteria andECompanyidNotBetween(Long value1, Long value2) {
            addCriterion("e_companyId not between", value1, value2, "eCompanyid");
            return (Criteria) this;
        }

        public Criteria andEPositionIsNull() {
            addCriterion("e_position is null");
            return (Criteria) this;
        }

        public Criteria andEPositionIsNotNull() {
            addCriterion("e_position is not null");
            return (Criteria) this;
        }

        public Criteria andEPositionEqualTo(String value) {
            addCriterion("e_position =", value, "ePosition");
            return (Criteria) this;
        }

        public Criteria andEPositionNotEqualTo(String value) {
            addCriterion("e_position <>", value, "ePosition");
            return (Criteria) this;
        }

        public Criteria andEPositionGreaterThan(String value) {
            addCriterion("e_position >", value, "ePosition");
            return (Criteria) this;
        }

        public Criteria andEPositionGreaterThanOrEqualTo(String value) {
            addCriterion("e_position >=", value, "ePosition");
            return (Criteria) this;
        }

        public Criteria andEPositionLessThan(String value) {
            addCriterion("e_position <", value, "ePosition");
            return (Criteria) this;
        }

        public Criteria andEPositionLessThanOrEqualTo(String value) {
            addCriterion("e_position <=", value, "ePosition");
            return (Criteria) this;
        }

        public Criteria andEPositionLike(String value) {
            addCriterion("e_position like", value, "ePosition");
            return (Criteria) this;
        }

        public Criteria andEPositionNotLike(String value) {
            addCriterion("e_position not like", value, "ePosition");
            return (Criteria) this;
        }

        public Criteria andEPositionIn(List<String> values) {
            addCriterion("e_position in", values, "ePosition");
            return (Criteria) this;
        }

        public Criteria andEPositionNotIn(List<String> values) {
            addCriterion("e_position not in", values, "ePosition");
            return (Criteria) this;
        }

        public Criteria andEPositionBetween(String value1, String value2) {
            addCriterion("e_position between", value1, value2, "ePosition");
            return (Criteria) this;
        }

        public Criteria andEPositionNotBetween(String value1, String value2) {
            addCriterion("e_position not between", value1, value2, "ePosition");
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
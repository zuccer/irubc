package org.zucc.web.entity;

import java.util.ArrayList;
import java.util.List;

public class IProjectExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer limitStart;

    protected Integer limitEnd;

    public IProjectExample() {
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

        public Criteria andPidIsNull() {
            addCriterion("pid is null");
            return (Criteria) this;
        }

        public Criteria andPidIsNotNull() {
            addCriterion("pid is not null");
            return (Criteria) this;
        }

        public Criteria andPidEqualTo(Long value) {
            addCriterion("pid =", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidNotEqualTo(Long value) {
            addCriterion("pid <>", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidGreaterThan(Long value) {
            addCriterion("pid >", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidGreaterThanOrEqualTo(Long value) {
            addCriterion("pid >=", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidLessThan(Long value) {
            addCriterion("pid <", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidLessThanOrEqualTo(Long value) {
            addCriterion("pid <=", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidIn(List<Long> values) {
            addCriterion("pid in", values, "pid");
            return (Criteria) this;
        }

        public Criteria andPidNotIn(List<Long> values) {
            addCriterion("pid not in", values, "pid");
            return (Criteria) this;
        }

        public Criteria andPidBetween(Long value1, Long value2) {
            addCriterion("pid between", value1, value2, "pid");
            return (Criteria) this;
        }

        public Criteria andPidNotBetween(Long value1, Long value2) {
            addCriterion("pid not between", value1, value2, "pid");
            return (Criteria) this;
        }

        public Criteria andPnameIsNull() {
            addCriterion("pname is null");
            return (Criteria) this;
        }

        public Criteria andPnameIsNotNull() {
            addCriterion("pname is not null");
            return (Criteria) this;
        }

        public Criteria andPnameEqualTo(String value) {
            addCriterion("pname =", value, "pname");
            return (Criteria) this;
        }

        public Criteria andPnameNotEqualTo(String value) {
            addCriterion("pname <>", value, "pname");
            return (Criteria) this;
        }

        public Criteria andPnameGreaterThan(String value) {
            addCriterion("pname >", value, "pname");
            return (Criteria) this;
        }

        public Criteria andPnameGreaterThanOrEqualTo(String value) {
            addCriterion("pname >=", value, "pname");
            return (Criteria) this;
        }

        public Criteria andPnameLessThan(String value) {
            addCriterion("pname <", value, "pname");
            return (Criteria) this;
        }

        public Criteria andPnameLessThanOrEqualTo(String value) {
            addCriterion("pname <=", value, "pname");
            return (Criteria) this;
        }

        public Criteria andPnameLike(String value) {
            addCriterion("pname like", value, "pname");
            return (Criteria) this;
        }

        public Criteria andPnameNotLike(String value) {
            addCriterion("pname not like", value, "pname");
            return (Criteria) this;
        }

        public Criteria andPnameIn(List<String> values) {
            addCriterion("pname in", values, "pname");
            return (Criteria) this;
        }

        public Criteria andPnameNotIn(List<String> values) {
            addCriterion("pname not in", values, "pname");
            return (Criteria) this;
        }

        public Criteria andPnameBetween(String value1, String value2) {
            addCriterion("pname between", value1, value2, "pname");
            return (Criteria) this;
        }

        public Criteria andPnameNotBetween(String value1, String value2) {
            addCriterion("pname not between", value1, value2, "pname");
            return (Criteria) this;
        }

        public Criteria andPdescriptionIsNull() {
            addCriterion("pdescription is null");
            return (Criteria) this;
        }

        public Criteria andPdescriptionIsNotNull() {
            addCriterion("pdescription is not null");
            return (Criteria) this;
        }

        public Criteria andPdescriptionEqualTo(String value) {
            addCriterion("pdescription =", value, "pdescription");
            return (Criteria) this;
        }

        public Criteria andPdescriptionNotEqualTo(String value) {
            addCriterion("pdescription <>", value, "pdescription");
            return (Criteria) this;
        }

        public Criteria andPdescriptionGreaterThan(String value) {
            addCriterion("pdescription >", value, "pdescription");
            return (Criteria) this;
        }

        public Criteria andPdescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("pdescription >=", value, "pdescription");
            return (Criteria) this;
        }

        public Criteria andPdescriptionLessThan(String value) {
            addCriterion("pdescription <", value, "pdescription");
            return (Criteria) this;
        }

        public Criteria andPdescriptionLessThanOrEqualTo(String value) {
            addCriterion("pdescription <=", value, "pdescription");
            return (Criteria) this;
        }

        public Criteria andPdescriptionLike(String value) {
            addCriterion("pdescription like", value, "pdescription");
            return (Criteria) this;
        }

        public Criteria andPdescriptionNotLike(String value) {
            addCriterion("pdescription not like", value, "pdescription");
            return (Criteria) this;
        }

        public Criteria andPdescriptionIn(List<String> values) {
            addCriterion("pdescription in", values, "pdescription");
            return (Criteria) this;
        }

        public Criteria andPdescriptionNotIn(List<String> values) {
            addCriterion("pdescription not in", values, "pdescription");
            return (Criteria) this;
        }

        public Criteria andPdescriptionBetween(String value1, String value2) {
            addCriterion("pdescription between", value1, value2, "pdescription");
            return (Criteria) this;
        }

        public Criteria andPdescriptionNotBetween(String value1, String value2) {
            addCriterion("pdescription not between", value1, value2, "pdescription");
            return (Criteria) this;
        }

        public Criteria andPTeacheridIsNull() {
            addCriterion("p_teacherId is null");
            return (Criteria) this;
        }

        public Criteria andPTeacheridIsNotNull() {
            addCriterion("p_teacherId is not null");
            return (Criteria) this;
        }

        public Criteria andPTeacheridEqualTo(Long value) {
            addCriterion("p_teacherId =", value, "pTeacherid");
            return (Criteria) this;
        }

        public Criteria andPTeacheridNotEqualTo(Long value) {
            addCriterion("p_teacherId <>", value, "pTeacherid");
            return (Criteria) this;
        }

        public Criteria andPTeacheridGreaterThan(Long value) {
            addCriterion("p_teacherId >", value, "pTeacherid");
            return (Criteria) this;
        }

        public Criteria andPTeacheridGreaterThanOrEqualTo(Long value) {
            addCriterion("p_teacherId >=", value, "pTeacherid");
            return (Criteria) this;
        }

        public Criteria andPTeacheridLessThan(Long value) {
            addCriterion("p_teacherId <", value, "pTeacherid");
            return (Criteria) this;
        }

        public Criteria andPTeacheridLessThanOrEqualTo(Long value) {
            addCriterion("p_teacherId <=", value, "pTeacherid");
            return (Criteria) this;
        }

        public Criteria andPTeacheridIn(List<Long> values) {
            addCriterion("p_teacherId in", values, "pTeacherid");
            return (Criteria) this;
        }

        public Criteria andPTeacheridNotIn(List<Long> values) {
            addCriterion("p_teacherId not in", values, "pTeacherid");
            return (Criteria) this;
        }

        public Criteria andPTeacheridBetween(Long value1, Long value2) {
            addCriterion("p_teacherId between", value1, value2, "pTeacherid");
            return (Criteria) this;
        }

        public Criteria andPTeacheridNotBetween(Long value1, Long value2) {
            addCriterion("p_teacherId not between", value1, value2, "pTeacherid");
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
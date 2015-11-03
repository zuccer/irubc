package org.zucc.web.entity;

import java.util.ArrayList;
import java.util.List;

public class IClassroomExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer limitStart;

    protected Integer limitEnd;

    public IClassroomExample() {
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

        public Criteria andClassroomIdIsNull() {
            addCriterion("classroom_id is null");
            return (Criteria) this;
        }

        public Criteria andClassroomIdIsNotNull() {
            addCriterion("classroom_id is not null");
            return (Criteria) this;
        }

        public Criteria andClassroomIdEqualTo(Long value) {
            addCriterion("classroom_id =", value, "classroomId");
            return (Criteria) this;
        }

        public Criteria andClassroomIdNotEqualTo(Long value) {
            addCriterion("classroom_id <>", value, "classroomId");
            return (Criteria) this;
        }

        public Criteria andClassroomIdGreaterThan(Long value) {
            addCriterion("classroom_id >", value, "classroomId");
            return (Criteria) this;
        }

        public Criteria andClassroomIdGreaterThanOrEqualTo(Long value) {
            addCriterion("classroom_id >=", value, "classroomId");
            return (Criteria) this;
        }

        public Criteria andClassroomIdLessThan(Long value) {
            addCriterion("classroom_id <", value, "classroomId");
            return (Criteria) this;
        }

        public Criteria andClassroomIdLessThanOrEqualTo(Long value) {
            addCriterion("classroom_id <=", value, "classroomId");
            return (Criteria) this;
        }

        public Criteria andClassroomIdIn(List<Long> values) {
            addCriterion("classroom_id in", values, "classroomId");
            return (Criteria) this;
        }

        public Criteria andClassroomIdNotIn(List<Long> values) {
            addCriterion("classroom_id not in", values, "classroomId");
            return (Criteria) this;
        }

        public Criteria andClassroomIdBetween(Long value1, Long value2) {
            addCriterion("classroom_id between", value1, value2, "classroomId");
            return (Criteria) this;
        }

        public Criteria andClassroomIdNotBetween(Long value1, Long value2) {
            addCriterion("classroom_id not between", value1, value2, "classroomId");
            return (Criteria) this;
        }

        public Criteria andClassroomAddressIsNull() {
            addCriterion("classroom_address is null");
            return (Criteria) this;
        }

        public Criteria andClassroomAddressIsNotNull() {
            addCriterion("classroom_address is not null");
            return (Criteria) this;
        }

        public Criteria andClassroomAddressEqualTo(String value) {
            addCriterion("classroom_address =", value, "classroomAddress");
            return (Criteria) this;
        }

        public Criteria andClassroomAddressNotEqualTo(String value) {
            addCriterion("classroom_address <>", value, "classroomAddress");
            return (Criteria) this;
        }

        public Criteria andClassroomAddressGreaterThan(String value) {
            addCriterion("classroom_address >", value, "classroomAddress");
            return (Criteria) this;
        }

        public Criteria andClassroomAddressGreaterThanOrEqualTo(String value) {
            addCriterion("classroom_address >=", value, "classroomAddress");
            return (Criteria) this;
        }

        public Criteria andClassroomAddressLessThan(String value) {
            addCriterion("classroom_address <", value, "classroomAddress");
            return (Criteria) this;
        }

        public Criteria andClassroomAddressLessThanOrEqualTo(String value) {
            addCriterion("classroom_address <=", value, "classroomAddress");
            return (Criteria) this;
        }

        public Criteria andClassroomAddressLike(String value) {
            addCriterion("classroom_address like", value, "classroomAddress");
            return (Criteria) this;
        }

        public Criteria andClassroomAddressNotLike(String value) {
            addCriterion("classroom_address not like", value, "classroomAddress");
            return (Criteria) this;
        }

        public Criteria andClassroomAddressIn(List<String> values) {
            addCriterion("classroom_address in", values, "classroomAddress");
            return (Criteria) this;
        }

        public Criteria andClassroomAddressNotIn(List<String> values) {
            addCriterion("classroom_address not in", values, "classroomAddress");
            return (Criteria) this;
        }

        public Criteria andClassroomAddressBetween(String value1, String value2) {
            addCriterion("classroom_address between", value1, value2, "classroomAddress");
            return (Criteria) this;
        }

        public Criteria andClassroomAddressNotBetween(String value1, String value2) {
            addCriterion("classroom_address not between", value1, value2, "classroomAddress");
            return (Criteria) this;
        }

        public Criteria andClassroomCapacityIsNull() {
            addCriterion("classroom_capacity is null");
            return (Criteria) this;
        }

        public Criteria andClassroomCapacityIsNotNull() {
            addCriterion("classroom_capacity is not null");
            return (Criteria) this;
        }

        public Criteria andClassroomCapacityEqualTo(Integer value) {
            addCriterion("classroom_capacity =", value, "classroomCapacity");
            return (Criteria) this;
        }

        public Criteria andClassroomCapacityNotEqualTo(Integer value) {
            addCriterion("classroom_capacity <>", value, "classroomCapacity");
            return (Criteria) this;
        }

        public Criteria andClassroomCapacityGreaterThan(Integer value) {
            addCriterion("classroom_capacity >", value, "classroomCapacity");
            return (Criteria) this;
        }

        public Criteria andClassroomCapacityGreaterThanOrEqualTo(Integer value) {
            addCriterion("classroom_capacity >=", value, "classroomCapacity");
            return (Criteria) this;
        }

        public Criteria andClassroomCapacityLessThan(Integer value) {
            addCriterion("classroom_capacity <", value, "classroomCapacity");
            return (Criteria) this;
        }

        public Criteria andClassroomCapacityLessThanOrEqualTo(Integer value) {
            addCriterion("classroom_capacity <=", value, "classroomCapacity");
            return (Criteria) this;
        }

        public Criteria andClassroomCapacityIn(List<Integer> values) {
            addCriterion("classroom_capacity in", values, "classroomCapacity");
            return (Criteria) this;
        }

        public Criteria andClassroomCapacityNotIn(List<Integer> values) {
            addCriterion("classroom_capacity not in", values, "classroomCapacity");
            return (Criteria) this;
        }

        public Criteria andClassroomCapacityBetween(Integer value1, Integer value2) {
            addCriterion("classroom_capacity between", value1, value2, "classroomCapacity");
            return (Criteria) this;
        }

        public Criteria andClassroomCapacityNotBetween(Integer value1, Integer value2) {
            addCriterion("classroom_capacity not between", value1, value2, "classroomCapacity");
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
package org.zucc.web.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ITeacherAuthenticationExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer limitStart;

    protected Integer limitEnd;

    public ITeacherAuthenticationExample() {
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

        public Criteria andTAuthenticationIdIsNull() {
            addCriterion("t_authentication_id is null");
            return (Criteria) this;
        }

        public Criteria andTAuthenticationIdIsNotNull() {
            addCriterion("t_authentication_id is not null");
            return (Criteria) this;
        }

        public Criteria andTAuthenticationIdEqualTo(Long value) {
            addCriterion("t_authentication_id =", value, "tAuthenticationId");
            return (Criteria) this;
        }

        public Criteria andTAuthenticationIdNotEqualTo(Long value) {
            addCriterion("t_authentication_id <>", value, "tAuthenticationId");
            return (Criteria) this;
        }

        public Criteria andTAuthenticationIdGreaterThan(Long value) {
            addCriterion("t_authentication_id >", value, "tAuthenticationId");
            return (Criteria) this;
        }

        public Criteria andTAuthenticationIdGreaterThanOrEqualTo(Long value) {
            addCriterion("t_authentication_id >=", value, "tAuthenticationId");
            return (Criteria) this;
        }

        public Criteria andTAuthenticationIdLessThan(Long value) {
            addCriterion("t_authentication_id <", value, "tAuthenticationId");
            return (Criteria) this;
        }

        public Criteria andTAuthenticationIdLessThanOrEqualTo(Long value) {
            addCriterion("t_authentication_id <=", value, "tAuthenticationId");
            return (Criteria) this;
        }

        public Criteria andTAuthenticationIdIn(List<Long> values) {
            addCriterion("t_authentication_id in", values, "tAuthenticationId");
            return (Criteria) this;
        }

        public Criteria andTAuthenticationIdNotIn(List<Long> values) {
            addCriterion("t_authentication_id not in", values, "tAuthenticationId");
            return (Criteria) this;
        }

        public Criteria andTAuthenticationIdBetween(Long value1, Long value2) {
            addCriterion("t_authentication_id between", value1, value2, "tAuthenticationId");
            return (Criteria) this;
        }

        public Criteria andTAuthenticationIdNotBetween(Long value1, Long value2) {
            addCriterion("t_authentication_id not between", value1, value2, "tAuthenticationId");
            return (Criteria) this;
        }

        public Criteria andTAuthenticationTidIsNull() {
            addCriterion("t_authentication_tid is null");
            return (Criteria) this;
        }

        public Criteria andTAuthenticationTidIsNotNull() {
            addCriterion("t_authentication_tid is not null");
            return (Criteria) this;
        }

        public Criteria andTAuthenticationTidEqualTo(Long value) {
            addCriterion("t_authentication_tid =", value, "tAuthenticationTid");
            return (Criteria) this;
        }

        public Criteria andTAuthenticationTidNotEqualTo(Long value) {
            addCriterion("t_authentication_tid <>", value, "tAuthenticationTid");
            return (Criteria) this;
        }

        public Criteria andTAuthenticationTidGreaterThan(Long value) {
            addCriterion("t_authentication_tid >", value, "tAuthenticationTid");
            return (Criteria) this;
        }

        public Criteria andTAuthenticationTidGreaterThanOrEqualTo(Long value) {
            addCriterion("t_authentication_tid >=", value, "tAuthenticationTid");
            return (Criteria) this;
        }

        public Criteria andTAuthenticationTidLessThan(Long value) {
            addCriterion("t_authentication_tid <", value, "tAuthenticationTid");
            return (Criteria) this;
        }

        public Criteria andTAuthenticationTidLessThanOrEqualTo(Long value) {
            addCriterion("t_authentication_tid <=", value, "tAuthenticationTid");
            return (Criteria) this;
        }

        public Criteria andTAuthenticationTidIn(List<Long> values) {
            addCriterion("t_authentication_tid in", values, "tAuthenticationTid");
            return (Criteria) this;
        }

        public Criteria andTAuthenticationTidNotIn(List<Long> values) {
            addCriterion("t_authentication_tid not in", values, "tAuthenticationTid");
            return (Criteria) this;
        }

        public Criteria andTAuthenticationTidBetween(Long value1, Long value2) {
            addCriterion("t_authentication_tid between", value1, value2, "tAuthenticationTid");
            return (Criteria) this;
        }

        public Criteria andTAuthenticationTidNotBetween(Long value1, Long value2) {
            addCriterion("t_authentication_tid not between", value1, value2, "tAuthenticationTid");
            return (Criteria) this;
        }

        public Criteria andTAuthenticationStateIsNull() {
            addCriterion("t_authentication_state is null");
            return (Criteria) this;
        }

        public Criteria andTAuthenticationStateIsNotNull() {
            addCriterion("t_authentication_state is not null");
            return (Criteria) this;
        }

        public Criteria andTAuthenticationStateEqualTo(Boolean value) {
            addCriterion("t_authentication_state =", value, "tAuthenticationState");
            return (Criteria) this;
        }

        public Criteria andTAuthenticationStateNotEqualTo(Boolean value) {
            addCriterion("t_authentication_state <>", value, "tAuthenticationState");
            return (Criteria) this;
        }

        public Criteria andTAuthenticationStateGreaterThan(Boolean value) {
            addCriterion("t_authentication_state >", value, "tAuthenticationState");
            return (Criteria) this;
        }

        public Criteria andTAuthenticationStateGreaterThanOrEqualTo(Boolean value) {
            addCriterion("t_authentication_state >=", value, "tAuthenticationState");
            return (Criteria) this;
        }

        public Criteria andTAuthenticationStateLessThan(Boolean value) {
            addCriterion("t_authentication_state <", value, "tAuthenticationState");
            return (Criteria) this;
        }

        public Criteria andTAuthenticationStateLessThanOrEqualTo(Boolean value) {
            addCriterion("t_authentication_state <=", value, "tAuthenticationState");
            return (Criteria) this;
        }

        public Criteria andTAuthenticationStateIn(List<Boolean> values) {
            addCriterion("t_authentication_state in", values, "tAuthenticationState");
            return (Criteria) this;
        }

        public Criteria andTAuthenticationStateNotIn(List<Boolean> values) {
            addCriterion("t_authentication_state not in", values, "tAuthenticationState");
            return (Criteria) this;
        }

        public Criteria andTAuthenticationStateBetween(Boolean value1, Boolean value2) {
            addCriterion("t_authentication_state between", value1, value2, "tAuthenticationState");
            return (Criteria) this;
        }

        public Criteria andTAuthenticationStateNotBetween(Boolean value1, Boolean value2) {
            addCriterion("t_authentication_state not between", value1, value2, "tAuthenticationState");
            return (Criteria) this;
        }

        public Criteria andTAuthenticationUpdatetimeIsNull() {
            addCriterion("t_authentication_updateTime is null");
            return (Criteria) this;
        }

        public Criteria andTAuthenticationUpdatetimeIsNotNull() {
            addCriterion("t_authentication_updateTime is not null");
            return (Criteria) this;
        }

        public Criteria andTAuthenticationUpdatetimeEqualTo(Date value) {
            addCriterion("t_authentication_updateTime =", value, "tAuthenticationUpdatetime");
            return (Criteria) this;
        }

        public Criteria andTAuthenticationUpdatetimeNotEqualTo(Date value) {
            addCriterion("t_authentication_updateTime <>", value, "tAuthenticationUpdatetime");
            return (Criteria) this;
        }

        public Criteria andTAuthenticationUpdatetimeGreaterThan(Date value) {
            addCriterion("t_authentication_updateTime >", value, "tAuthenticationUpdatetime");
            return (Criteria) this;
        }

        public Criteria andTAuthenticationUpdatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("t_authentication_updateTime >=", value, "tAuthenticationUpdatetime");
            return (Criteria) this;
        }

        public Criteria andTAuthenticationUpdatetimeLessThan(Date value) {
            addCriterion("t_authentication_updateTime <", value, "tAuthenticationUpdatetime");
            return (Criteria) this;
        }

        public Criteria andTAuthenticationUpdatetimeLessThanOrEqualTo(Date value) {
            addCriterion("t_authentication_updateTime <=", value, "tAuthenticationUpdatetime");
            return (Criteria) this;
        }

        public Criteria andTAuthenticationUpdatetimeIn(List<Date> values) {
            addCriterion("t_authentication_updateTime in", values, "tAuthenticationUpdatetime");
            return (Criteria) this;
        }

        public Criteria andTAuthenticationUpdatetimeNotIn(List<Date> values) {
            addCriterion("t_authentication_updateTime not in", values, "tAuthenticationUpdatetime");
            return (Criteria) this;
        }

        public Criteria andTAuthenticationUpdatetimeBetween(Date value1, Date value2) {
            addCriterion("t_authentication_updateTime between", value1, value2, "tAuthenticationUpdatetime");
            return (Criteria) this;
        }

        public Criteria andTAuthenticationUpdatetimeNotBetween(Date value1, Date value2) {
            addCriterion("t_authentication_updateTime not between", value1, value2, "tAuthenticationUpdatetime");
            return (Criteria) this;
        }

        public Criteria andTAuthenticationAdminidIsNull() {
            addCriterion("t_authentication_adminId is null");
            return (Criteria) this;
        }

        public Criteria andTAuthenticationAdminidIsNotNull() {
            addCriterion("t_authentication_adminId is not null");
            return (Criteria) this;
        }

        public Criteria andTAuthenticationAdminidEqualTo(Long value) {
            addCriterion("t_authentication_adminId =", value, "tAuthenticationAdminid");
            return (Criteria) this;
        }

        public Criteria andTAuthenticationAdminidNotEqualTo(Long value) {
            addCriterion("t_authentication_adminId <>", value, "tAuthenticationAdminid");
            return (Criteria) this;
        }

        public Criteria andTAuthenticationAdminidGreaterThan(Long value) {
            addCriterion("t_authentication_adminId >", value, "tAuthenticationAdminid");
            return (Criteria) this;
        }

        public Criteria andTAuthenticationAdminidGreaterThanOrEqualTo(Long value) {
            addCriterion("t_authentication_adminId >=", value, "tAuthenticationAdminid");
            return (Criteria) this;
        }

        public Criteria andTAuthenticationAdminidLessThan(Long value) {
            addCriterion("t_authentication_adminId <", value, "tAuthenticationAdminid");
            return (Criteria) this;
        }

        public Criteria andTAuthenticationAdminidLessThanOrEqualTo(Long value) {
            addCriterion("t_authentication_adminId <=", value, "tAuthenticationAdminid");
            return (Criteria) this;
        }

        public Criteria andTAuthenticationAdminidIn(List<Long> values) {
            addCriterion("t_authentication_adminId in", values, "tAuthenticationAdminid");
            return (Criteria) this;
        }

        public Criteria andTAuthenticationAdminidNotIn(List<Long> values) {
            addCriterion("t_authentication_adminId not in", values, "tAuthenticationAdminid");
            return (Criteria) this;
        }

        public Criteria andTAuthenticationAdminidBetween(Long value1, Long value2) {
            addCriterion("t_authentication_adminId between", value1, value2, "tAuthenticationAdminid");
            return (Criteria) this;
        }

        public Criteria andTAuthenticationAdminidNotBetween(Long value1, Long value2) {
            addCriterion("t_authentication_adminId not between", value1, value2, "tAuthenticationAdminid");
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
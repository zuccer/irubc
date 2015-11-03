package org.zucc.web.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ICourseAuthenticationExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer limitStart;

    protected Integer limitEnd;

    public ICourseAuthenticationExample() {
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

        public Criteria andCourseAuthenticationIdIsNull() {
            addCriterion("course_authentication_id is null");
            return (Criteria) this;
        }

        public Criteria andCourseAuthenticationIdIsNotNull() {
            addCriterion("course_authentication_id is not null");
            return (Criteria) this;
        }

        public Criteria andCourseAuthenticationIdEqualTo(Long value) {
            addCriterion("course_authentication_id =", value, "courseAuthenticationId");
            return (Criteria) this;
        }

        public Criteria andCourseAuthenticationIdNotEqualTo(Long value) {
            addCriterion("course_authentication_id <>", value, "courseAuthenticationId");
            return (Criteria) this;
        }

        public Criteria andCourseAuthenticationIdGreaterThan(Long value) {
            addCriterion("course_authentication_id >", value, "courseAuthenticationId");
            return (Criteria) this;
        }

        public Criteria andCourseAuthenticationIdGreaterThanOrEqualTo(Long value) {
            addCriterion("course_authentication_id >=", value, "courseAuthenticationId");
            return (Criteria) this;
        }

        public Criteria andCourseAuthenticationIdLessThan(Long value) {
            addCriterion("course_authentication_id <", value, "courseAuthenticationId");
            return (Criteria) this;
        }

        public Criteria andCourseAuthenticationIdLessThanOrEqualTo(Long value) {
            addCriterion("course_authentication_id <=", value, "courseAuthenticationId");
            return (Criteria) this;
        }

        public Criteria andCourseAuthenticationIdIn(List<Long> values) {
            addCriterion("course_authentication_id in", values, "courseAuthenticationId");
            return (Criteria) this;
        }

        public Criteria andCourseAuthenticationIdNotIn(List<Long> values) {
            addCriterion("course_authentication_id not in", values, "courseAuthenticationId");
            return (Criteria) this;
        }

        public Criteria andCourseAuthenticationIdBetween(Long value1, Long value2) {
            addCriterion("course_authentication_id between", value1, value2, "courseAuthenticationId");
            return (Criteria) this;
        }

        public Criteria andCourseAuthenticationIdNotBetween(Long value1, Long value2) {
            addCriterion("course_authentication_id not between", value1, value2, "courseAuthenticationId");
            return (Criteria) this;
        }

        public Criteria andCourseAuthenticationCourseidIsNull() {
            addCriterion("course_authentication_courseId is null");
            return (Criteria) this;
        }

        public Criteria andCourseAuthenticationCourseidIsNotNull() {
            addCriterion("course_authentication_courseId is not null");
            return (Criteria) this;
        }

        public Criteria andCourseAuthenticationCourseidEqualTo(Long value) {
            addCriterion("course_authentication_courseId =", value, "courseAuthenticationCourseid");
            return (Criteria) this;
        }

        public Criteria andCourseAuthenticationCourseidNotEqualTo(Long value) {
            addCriterion("course_authentication_courseId <>", value, "courseAuthenticationCourseid");
            return (Criteria) this;
        }

        public Criteria andCourseAuthenticationCourseidGreaterThan(Long value) {
            addCriterion("course_authentication_courseId >", value, "courseAuthenticationCourseid");
            return (Criteria) this;
        }

        public Criteria andCourseAuthenticationCourseidGreaterThanOrEqualTo(Long value) {
            addCriterion("course_authentication_courseId >=", value, "courseAuthenticationCourseid");
            return (Criteria) this;
        }

        public Criteria andCourseAuthenticationCourseidLessThan(Long value) {
            addCriterion("course_authentication_courseId <", value, "courseAuthenticationCourseid");
            return (Criteria) this;
        }

        public Criteria andCourseAuthenticationCourseidLessThanOrEqualTo(Long value) {
            addCriterion("course_authentication_courseId <=", value, "courseAuthenticationCourseid");
            return (Criteria) this;
        }

        public Criteria andCourseAuthenticationCourseidIn(List<Long> values) {
            addCriterion("course_authentication_courseId in", values, "courseAuthenticationCourseid");
            return (Criteria) this;
        }

        public Criteria andCourseAuthenticationCourseidNotIn(List<Long> values) {
            addCriterion("course_authentication_courseId not in", values, "courseAuthenticationCourseid");
            return (Criteria) this;
        }

        public Criteria andCourseAuthenticationCourseidBetween(Long value1, Long value2) {
            addCriterion("course_authentication_courseId between", value1, value2, "courseAuthenticationCourseid");
            return (Criteria) this;
        }

        public Criteria andCourseAuthenticationCourseidNotBetween(Long value1, Long value2) {
            addCriterion("course_authentication_courseId not between", value1, value2, "courseAuthenticationCourseid");
            return (Criteria) this;
        }

        public Criteria andCourseAuthenticationStateIsNull() {
            addCriterion("course_authentication_state is null");
            return (Criteria) this;
        }

        public Criteria andCourseAuthenticationStateIsNotNull() {
            addCriterion("course_authentication_state is not null");
            return (Criteria) this;
        }

        public Criteria andCourseAuthenticationStateEqualTo(Boolean value) {
            addCriterion("course_authentication_state =", value, "courseAuthenticationState");
            return (Criteria) this;
        }

        public Criteria andCourseAuthenticationStateNotEqualTo(Boolean value) {
            addCriterion("course_authentication_state <>", value, "courseAuthenticationState");
            return (Criteria) this;
        }

        public Criteria andCourseAuthenticationStateGreaterThan(Boolean value) {
            addCriterion("course_authentication_state >", value, "courseAuthenticationState");
            return (Criteria) this;
        }

        public Criteria andCourseAuthenticationStateGreaterThanOrEqualTo(Boolean value) {
            addCriterion("course_authentication_state >=", value, "courseAuthenticationState");
            return (Criteria) this;
        }

        public Criteria andCourseAuthenticationStateLessThan(Boolean value) {
            addCriterion("course_authentication_state <", value, "courseAuthenticationState");
            return (Criteria) this;
        }

        public Criteria andCourseAuthenticationStateLessThanOrEqualTo(Boolean value) {
            addCriterion("course_authentication_state <=", value, "courseAuthenticationState");
            return (Criteria) this;
        }

        public Criteria andCourseAuthenticationStateIn(List<Boolean> values) {
            addCriterion("course_authentication_state in", values, "courseAuthenticationState");
            return (Criteria) this;
        }

        public Criteria andCourseAuthenticationStateNotIn(List<Boolean> values) {
            addCriterion("course_authentication_state not in", values, "courseAuthenticationState");
            return (Criteria) this;
        }

        public Criteria andCourseAuthenticationStateBetween(Boolean value1, Boolean value2) {
            addCriterion("course_authentication_state between", value1, value2, "courseAuthenticationState");
            return (Criteria) this;
        }

        public Criteria andCourseAuthenticationStateNotBetween(Boolean value1, Boolean value2) {
            addCriterion("course_authentication_state not between", value1, value2, "courseAuthenticationState");
            return (Criteria) this;
        }

        public Criteria andCourseAuthenticationUpdatetimeIsNull() {
            addCriterion("course_authentication_updateTime is null");
            return (Criteria) this;
        }

        public Criteria andCourseAuthenticationUpdatetimeIsNotNull() {
            addCriterion("course_authentication_updateTime is not null");
            return (Criteria) this;
        }

        public Criteria andCourseAuthenticationUpdatetimeEqualTo(Date value) {
            addCriterion("course_authentication_updateTime =", value, "courseAuthenticationUpdatetime");
            return (Criteria) this;
        }

        public Criteria andCourseAuthenticationUpdatetimeNotEqualTo(Date value) {
            addCriterion("course_authentication_updateTime <>", value, "courseAuthenticationUpdatetime");
            return (Criteria) this;
        }

        public Criteria andCourseAuthenticationUpdatetimeGreaterThan(Date value) {
            addCriterion("course_authentication_updateTime >", value, "courseAuthenticationUpdatetime");
            return (Criteria) this;
        }

        public Criteria andCourseAuthenticationUpdatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("course_authentication_updateTime >=", value, "courseAuthenticationUpdatetime");
            return (Criteria) this;
        }

        public Criteria andCourseAuthenticationUpdatetimeLessThan(Date value) {
            addCriterion("course_authentication_updateTime <", value, "courseAuthenticationUpdatetime");
            return (Criteria) this;
        }

        public Criteria andCourseAuthenticationUpdatetimeLessThanOrEqualTo(Date value) {
            addCriterion("course_authentication_updateTime <=", value, "courseAuthenticationUpdatetime");
            return (Criteria) this;
        }

        public Criteria andCourseAuthenticationUpdatetimeIn(List<Date> values) {
            addCriterion("course_authentication_updateTime in", values, "courseAuthenticationUpdatetime");
            return (Criteria) this;
        }

        public Criteria andCourseAuthenticationUpdatetimeNotIn(List<Date> values) {
            addCriterion("course_authentication_updateTime not in", values, "courseAuthenticationUpdatetime");
            return (Criteria) this;
        }

        public Criteria andCourseAuthenticationUpdatetimeBetween(Date value1, Date value2) {
            addCriterion("course_authentication_updateTime between", value1, value2, "courseAuthenticationUpdatetime");
            return (Criteria) this;
        }

        public Criteria andCourseAuthenticationUpdatetimeNotBetween(Date value1, Date value2) {
            addCriterion("course_authentication_updateTime not between", value1, value2, "courseAuthenticationUpdatetime");
            return (Criteria) this;
        }

        public Criteria andCourseAuthenticationAdminidIsNull() {
            addCriterion("course_authentication_adminId is null");
            return (Criteria) this;
        }

        public Criteria andCourseAuthenticationAdminidIsNotNull() {
            addCriterion("course_authentication_adminId is not null");
            return (Criteria) this;
        }

        public Criteria andCourseAuthenticationAdminidEqualTo(Long value) {
            addCriterion("course_authentication_adminId =", value, "courseAuthenticationAdminid");
            return (Criteria) this;
        }

        public Criteria andCourseAuthenticationAdminidNotEqualTo(Long value) {
            addCriterion("course_authentication_adminId <>", value, "courseAuthenticationAdminid");
            return (Criteria) this;
        }

        public Criteria andCourseAuthenticationAdminidGreaterThan(Long value) {
            addCriterion("course_authentication_adminId >", value, "courseAuthenticationAdminid");
            return (Criteria) this;
        }

        public Criteria andCourseAuthenticationAdminidGreaterThanOrEqualTo(Long value) {
            addCriterion("course_authentication_adminId >=", value, "courseAuthenticationAdminid");
            return (Criteria) this;
        }

        public Criteria andCourseAuthenticationAdminidLessThan(Long value) {
            addCriterion("course_authentication_adminId <", value, "courseAuthenticationAdminid");
            return (Criteria) this;
        }

        public Criteria andCourseAuthenticationAdminidLessThanOrEqualTo(Long value) {
            addCriterion("course_authentication_adminId <=", value, "courseAuthenticationAdminid");
            return (Criteria) this;
        }

        public Criteria andCourseAuthenticationAdminidIn(List<Long> values) {
            addCriterion("course_authentication_adminId in", values, "courseAuthenticationAdminid");
            return (Criteria) this;
        }

        public Criteria andCourseAuthenticationAdminidNotIn(List<Long> values) {
            addCriterion("course_authentication_adminId not in", values, "courseAuthenticationAdminid");
            return (Criteria) this;
        }

        public Criteria andCourseAuthenticationAdminidBetween(Long value1, Long value2) {
            addCriterion("course_authentication_adminId between", value1, value2, "courseAuthenticationAdminid");
            return (Criteria) this;
        }

        public Criteria andCourseAuthenticationAdminidNotBetween(Long value1, Long value2) {
            addCriterion("course_authentication_adminId not between", value1, value2, "courseAuthenticationAdminid");
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
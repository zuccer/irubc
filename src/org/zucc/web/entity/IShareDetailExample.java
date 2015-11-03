package org.zucc.web.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class IShareDetailExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer limitStart;

    protected Integer limitEnd;

    public IShareDetailExample() {
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

        public Criteria andShareDetailIdIsNull() {
            addCriterion("share_detail_id is null");
            return (Criteria) this;
        }

        public Criteria andShareDetailIdIsNotNull() {
            addCriterion("share_detail_id is not null");
            return (Criteria) this;
        }

        public Criteria andShareDetailIdEqualTo(Long value) {
            addCriterion("share_detail_id =", value, "shareDetailId");
            return (Criteria) this;
        }

        public Criteria andShareDetailIdNotEqualTo(Long value) {
            addCriterion("share_detail_id <>", value, "shareDetailId");
            return (Criteria) this;
        }

        public Criteria andShareDetailIdGreaterThan(Long value) {
            addCriterion("share_detail_id >", value, "shareDetailId");
            return (Criteria) this;
        }

        public Criteria andShareDetailIdGreaterThanOrEqualTo(Long value) {
            addCriterion("share_detail_id >=", value, "shareDetailId");
            return (Criteria) this;
        }

        public Criteria andShareDetailIdLessThan(Long value) {
            addCriterion("share_detail_id <", value, "shareDetailId");
            return (Criteria) this;
        }

        public Criteria andShareDetailIdLessThanOrEqualTo(Long value) {
            addCriterion("share_detail_id <=", value, "shareDetailId");
            return (Criteria) this;
        }

        public Criteria andShareDetailIdIn(List<Long> values) {
            addCriterion("share_detail_id in", values, "shareDetailId");
            return (Criteria) this;
        }

        public Criteria andShareDetailIdNotIn(List<Long> values) {
            addCriterion("share_detail_id not in", values, "shareDetailId");
            return (Criteria) this;
        }

        public Criteria andShareDetailIdBetween(Long value1, Long value2) {
            addCriterion("share_detail_id between", value1, value2, "shareDetailId");
            return (Criteria) this;
        }

        public Criteria andShareDetailIdNotBetween(Long value1, Long value2) {
            addCriterion("share_detail_id not between", value1, value2, "shareDetailId");
            return (Criteria) this;
        }

        public Criteria andShareUseidIsNull() {
            addCriterion("share_useId is null");
            return (Criteria) this;
        }

        public Criteria andShareUseidIsNotNull() {
            addCriterion("share_useId is not null");
            return (Criteria) this;
        }

        public Criteria andShareUseidEqualTo(Long value) {
            addCriterion("share_useId =", value, "shareUseid");
            return (Criteria) this;
        }

        public Criteria andShareUseidNotEqualTo(Long value) {
            addCriterion("share_useId <>", value, "shareUseid");
            return (Criteria) this;
        }

        public Criteria andShareUseidGreaterThan(Long value) {
            addCriterion("share_useId >", value, "shareUseid");
            return (Criteria) this;
        }

        public Criteria andShareUseidGreaterThanOrEqualTo(Long value) {
            addCriterion("share_useId >=", value, "shareUseid");
            return (Criteria) this;
        }

        public Criteria andShareUseidLessThan(Long value) {
            addCriterion("share_useId <", value, "shareUseid");
            return (Criteria) this;
        }

        public Criteria andShareUseidLessThanOrEqualTo(Long value) {
            addCriterion("share_useId <=", value, "shareUseid");
            return (Criteria) this;
        }

        public Criteria andShareUseidIn(List<Long> values) {
            addCriterion("share_useId in", values, "shareUseid");
            return (Criteria) this;
        }

        public Criteria andShareUseidNotIn(List<Long> values) {
            addCriterion("share_useId not in", values, "shareUseid");
            return (Criteria) this;
        }

        public Criteria andShareUseidBetween(Long value1, Long value2) {
            addCriterion("share_useId between", value1, value2, "shareUseid");
            return (Criteria) this;
        }

        public Criteria andShareUseidNotBetween(Long value1, Long value2) {
            addCriterion("share_useId not between", value1, value2, "shareUseid");
            return (Criteria) this;
        }

        public Criteria andShareCourseidIsNull() {
            addCriterion("share_courseId is null");
            return (Criteria) this;
        }

        public Criteria andShareCourseidIsNotNull() {
            addCriterion("share_courseId is not null");
            return (Criteria) this;
        }

        public Criteria andShareCourseidEqualTo(Long value) {
            addCriterion("share_courseId =", value, "shareCourseid");
            return (Criteria) this;
        }

        public Criteria andShareCourseidNotEqualTo(Long value) {
            addCriterion("share_courseId <>", value, "shareCourseid");
            return (Criteria) this;
        }

        public Criteria andShareCourseidGreaterThan(Long value) {
            addCriterion("share_courseId >", value, "shareCourseid");
            return (Criteria) this;
        }

        public Criteria andShareCourseidGreaterThanOrEqualTo(Long value) {
            addCriterion("share_courseId >=", value, "shareCourseid");
            return (Criteria) this;
        }

        public Criteria andShareCourseidLessThan(Long value) {
            addCriterion("share_courseId <", value, "shareCourseid");
            return (Criteria) this;
        }

        public Criteria andShareCourseidLessThanOrEqualTo(Long value) {
            addCriterion("share_courseId <=", value, "shareCourseid");
            return (Criteria) this;
        }

        public Criteria andShareCourseidIn(List<Long> values) {
            addCriterion("share_courseId in", values, "shareCourseid");
            return (Criteria) this;
        }

        public Criteria andShareCourseidNotIn(List<Long> values) {
            addCriterion("share_courseId not in", values, "shareCourseid");
            return (Criteria) this;
        }

        public Criteria andShareCourseidBetween(Long value1, Long value2) {
            addCriterion("share_courseId between", value1, value2, "shareCourseid");
            return (Criteria) this;
        }

        public Criteria andShareCourseidNotBetween(Long value1, Long value2) {
            addCriterion("share_courseId not between", value1, value2, "shareCourseid");
            return (Criteria) this;
        }

        public Criteria andShareEnrollIdIsNull() {
            addCriterion("share_enroll_id is null");
            return (Criteria) this;
        }

        public Criteria andShareEnrollIdIsNotNull() {
            addCriterion("share_enroll_id is not null");
            return (Criteria) this;
        }

        public Criteria andShareEnrollIdEqualTo(Long value) {
            addCriterion("share_enroll_id =", value, "shareEnrollId");
            return (Criteria) this;
        }

        public Criteria andShareEnrollIdNotEqualTo(Long value) {
            addCriterion("share_enroll_id <>", value, "shareEnrollId");
            return (Criteria) this;
        }

        public Criteria andShareEnrollIdGreaterThan(Long value) {
            addCriterion("share_enroll_id >", value, "shareEnrollId");
            return (Criteria) this;
        }

        public Criteria andShareEnrollIdGreaterThanOrEqualTo(Long value) {
            addCriterion("share_enroll_id >=", value, "shareEnrollId");
            return (Criteria) this;
        }

        public Criteria andShareEnrollIdLessThan(Long value) {
            addCriterion("share_enroll_id <", value, "shareEnrollId");
            return (Criteria) this;
        }

        public Criteria andShareEnrollIdLessThanOrEqualTo(Long value) {
            addCriterion("share_enroll_id <=", value, "shareEnrollId");
            return (Criteria) this;
        }

        public Criteria andShareEnrollIdIn(List<Long> values) {
            addCriterion("share_enroll_id in", values, "shareEnrollId");
            return (Criteria) this;
        }

        public Criteria andShareEnrollIdNotIn(List<Long> values) {
            addCriterion("share_enroll_id not in", values, "shareEnrollId");
            return (Criteria) this;
        }

        public Criteria andShareEnrollIdBetween(Long value1, Long value2) {
            addCriterion("share_enroll_id between", value1, value2, "shareEnrollId");
            return (Criteria) this;
        }

        public Criteria andShareEnrollIdNotBetween(Long value1, Long value2) {
            addCriterion("share_enroll_id not between", value1, value2, "shareEnrollId");
            return (Criteria) this;
        }

        public Criteria andShareCreatetimeIsNull() {
            addCriterion("share_createTime is null");
            return (Criteria) this;
        }

        public Criteria andShareCreatetimeIsNotNull() {
            addCriterion("share_createTime is not null");
            return (Criteria) this;
        }

        public Criteria andShareCreatetimeEqualTo(Date value) {
            addCriterion("share_createTime =", value, "shareCreatetime");
            return (Criteria) this;
        }

        public Criteria andShareCreatetimeNotEqualTo(Date value) {
            addCriterion("share_createTime <>", value, "shareCreatetime");
            return (Criteria) this;
        }

        public Criteria andShareCreatetimeGreaterThan(Date value) {
            addCriterion("share_createTime >", value, "shareCreatetime");
            return (Criteria) this;
        }

        public Criteria andShareCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("share_createTime >=", value, "shareCreatetime");
            return (Criteria) this;
        }

        public Criteria andShareCreatetimeLessThan(Date value) {
            addCriterion("share_createTime <", value, "shareCreatetime");
            return (Criteria) this;
        }

        public Criteria andShareCreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("share_createTime <=", value, "shareCreatetime");
            return (Criteria) this;
        }

        public Criteria andShareCreatetimeIn(List<Date> values) {
            addCriterion("share_createTime in", values, "shareCreatetime");
            return (Criteria) this;
        }

        public Criteria andShareCreatetimeNotIn(List<Date> values) {
            addCriterion("share_createTime not in", values, "shareCreatetime");
            return (Criteria) this;
        }

        public Criteria andShareCreatetimeBetween(Date value1, Date value2) {
            addCriterion("share_createTime between", value1, value2, "shareCreatetime");
            return (Criteria) this;
        }

        public Criteria andShareCreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("share_createTime not between", value1, value2, "shareCreatetime");
            return (Criteria) this;
        }

        public Criteria andShareMoneyStateIsNull() {
            addCriterion("share_money_state is null");
            return (Criteria) this;
        }

        public Criteria andShareMoneyStateIsNotNull() {
            addCriterion("share_money_state is not null");
            return (Criteria) this;
        }

        public Criteria andShareMoneyStateEqualTo(Boolean value) {
            addCriterion("share_money_state =", value, "shareMoneyState");
            return (Criteria) this;
        }

        public Criteria andShareMoneyStateNotEqualTo(Boolean value) {
            addCriterion("share_money_state <>", value, "shareMoneyState");
            return (Criteria) this;
        }

        public Criteria andShareMoneyStateGreaterThan(Boolean value) {
            addCriterion("share_money_state >", value, "shareMoneyState");
            return (Criteria) this;
        }

        public Criteria andShareMoneyStateGreaterThanOrEqualTo(Boolean value) {
            addCriterion("share_money_state >=", value, "shareMoneyState");
            return (Criteria) this;
        }

        public Criteria andShareMoneyStateLessThan(Boolean value) {
            addCriterion("share_money_state <", value, "shareMoneyState");
            return (Criteria) this;
        }

        public Criteria andShareMoneyStateLessThanOrEqualTo(Boolean value) {
            addCriterion("share_money_state <=", value, "shareMoneyState");
            return (Criteria) this;
        }

        public Criteria andShareMoneyStateIn(List<Boolean> values) {
            addCriterion("share_money_state in", values, "shareMoneyState");
            return (Criteria) this;
        }

        public Criteria andShareMoneyStateNotIn(List<Boolean> values) {
            addCriterion("share_money_state not in", values, "shareMoneyState");
            return (Criteria) this;
        }

        public Criteria andShareMoneyStateBetween(Boolean value1, Boolean value2) {
            addCriterion("share_money_state between", value1, value2, "shareMoneyState");
            return (Criteria) this;
        }

        public Criteria andShareMoneyStateNotBetween(Boolean value1, Boolean value2) {
            addCriterion("share_money_state not between", value1, value2, "shareMoneyState");
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
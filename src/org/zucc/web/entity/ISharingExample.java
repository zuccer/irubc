package org.zucc.web.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ISharingExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer limitStart;

    protected Integer limitEnd;

    public ISharingExample() {
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

        public Criteria andSidIsNull() {
            addCriterion("sid is null");
            return (Criteria) this;
        }

        public Criteria andSidIsNotNull() {
            addCriterion("sid is not null");
            return (Criteria) this;
        }

        public Criteria andSidEqualTo(Long value) {
            addCriterion("sid =", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidNotEqualTo(Long value) {
            addCriterion("sid <>", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidGreaterThan(Long value) {
            addCriterion("sid >", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidGreaterThanOrEqualTo(Long value) {
            addCriterion("sid >=", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidLessThan(Long value) {
            addCriterion("sid <", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidLessThanOrEqualTo(Long value) {
            addCriterion("sid <=", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidIn(List<Long> values) {
            addCriterion("sid in", values, "sid");
            return (Criteria) this;
        }

        public Criteria andSidNotIn(List<Long> values) {
            addCriterion("sid not in", values, "sid");
            return (Criteria) this;
        }

        public Criteria andSidBetween(Long value1, Long value2) {
            addCriterion("sid between", value1, value2, "sid");
            return (Criteria) this;
        }

        public Criteria andSidNotBetween(Long value1, Long value2) {
            addCriterion("sid not between", value1, value2, "sid");
            return (Criteria) this;
        }

        public Criteria andSUseridIsNull() {
            addCriterion("s_userId is null");
            return (Criteria) this;
        }

        public Criteria andSUseridIsNotNull() {
            addCriterion("s_userId is not null");
            return (Criteria) this;
        }

        public Criteria andSUseridEqualTo(Long value) {
            addCriterion("s_userId =", value, "sUserid");
            return (Criteria) this;
        }

        public Criteria andSUseridNotEqualTo(Long value) {
            addCriterion("s_userId <>", value, "sUserid");
            return (Criteria) this;
        }

        public Criteria andSUseridGreaterThan(Long value) {
            addCriterion("s_userId >", value, "sUserid");
            return (Criteria) this;
        }

        public Criteria andSUseridGreaterThanOrEqualTo(Long value) {
            addCriterion("s_userId >=", value, "sUserid");
            return (Criteria) this;
        }

        public Criteria andSUseridLessThan(Long value) {
            addCriterion("s_userId <", value, "sUserid");
            return (Criteria) this;
        }

        public Criteria andSUseridLessThanOrEqualTo(Long value) {
            addCriterion("s_userId <=", value, "sUserid");
            return (Criteria) this;
        }

        public Criteria andSUseridIn(List<Long> values) {
            addCriterion("s_userId in", values, "sUserid");
            return (Criteria) this;
        }

        public Criteria andSUseridNotIn(List<Long> values) {
            addCriterion("s_userId not in", values, "sUserid");
            return (Criteria) this;
        }

        public Criteria andSUseridBetween(Long value1, Long value2) {
            addCriterion("s_userId between", value1, value2, "sUserid");
            return (Criteria) this;
        }

        public Criteria andSUseridNotBetween(Long value1, Long value2) {
            addCriterion("s_userId not between", value1, value2, "sUserid");
            return (Criteria) this;
        }

        public Criteria andSCourseidIsNull() {
            addCriterion("s_courseId is null");
            return (Criteria) this;
        }

        public Criteria andSCourseidIsNotNull() {
            addCriterion("s_courseId is not null");
            return (Criteria) this;
        }

        public Criteria andSCourseidEqualTo(Long value) {
            addCriterion("s_courseId =", value, "sCourseid");
            return (Criteria) this;
        }

        public Criteria andSCourseidNotEqualTo(Long value) {
            addCriterion("s_courseId <>", value, "sCourseid");
            return (Criteria) this;
        }

        public Criteria andSCourseidGreaterThan(Long value) {
            addCriterion("s_courseId >", value, "sCourseid");
            return (Criteria) this;
        }

        public Criteria andSCourseidGreaterThanOrEqualTo(Long value) {
            addCriterion("s_courseId >=", value, "sCourseid");
            return (Criteria) this;
        }

        public Criteria andSCourseidLessThan(Long value) {
            addCriterion("s_courseId <", value, "sCourseid");
            return (Criteria) this;
        }

        public Criteria andSCourseidLessThanOrEqualTo(Long value) {
            addCriterion("s_courseId <=", value, "sCourseid");
            return (Criteria) this;
        }

        public Criteria andSCourseidIn(List<Long> values) {
            addCriterion("s_courseId in", values, "sCourseid");
            return (Criteria) this;
        }

        public Criteria andSCourseidNotIn(List<Long> values) {
            addCriterion("s_courseId not in", values, "sCourseid");
            return (Criteria) this;
        }

        public Criteria andSCourseidBetween(Long value1, Long value2) {
            addCriterion("s_courseId between", value1, value2, "sCourseid");
            return (Criteria) this;
        }

        public Criteria andSCourseidNotBetween(Long value1, Long value2) {
            addCriterion("s_courseId not between", value1, value2, "sCourseid");
            return (Criteria) this;
        }

        public Criteria andSCreatetimeIsNull() {
            addCriterion("s_createTime is null");
            return (Criteria) this;
        }

        public Criteria andSCreatetimeIsNotNull() {
            addCriterion("s_createTime is not null");
            return (Criteria) this;
        }

        public Criteria andSCreatetimeEqualTo(Date value) {
            addCriterion("s_createTime =", value, "sCreatetime");
            return (Criteria) this;
        }

        public Criteria andSCreatetimeNotEqualTo(Date value) {
            addCriterion("s_createTime <>", value, "sCreatetime");
            return (Criteria) this;
        }

        public Criteria andSCreatetimeGreaterThan(Date value) {
            addCriterion("s_createTime >", value, "sCreatetime");
            return (Criteria) this;
        }

        public Criteria andSCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("s_createTime >=", value, "sCreatetime");
            return (Criteria) this;
        }

        public Criteria andSCreatetimeLessThan(Date value) {
            addCriterion("s_createTime <", value, "sCreatetime");
            return (Criteria) this;
        }

        public Criteria andSCreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("s_createTime <=", value, "sCreatetime");
            return (Criteria) this;
        }

        public Criteria andSCreatetimeIn(List<Date> values) {
            addCriterion("s_createTime in", values, "sCreatetime");
            return (Criteria) this;
        }

        public Criteria andSCreatetimeNotIn(List<Date> values) {
            addCriterion("s_createTime not in", values, "sCreatetime");
            return (Criteria) this;
        }

        public Criteria andSCreatetimeBetween(Date value1, Date value2) {
            addCriterion("s_createTime between", value1, value2, "sCreatetime");
            return (Criteria) this;
        }

        public Criteria andSCreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("s_createTime not between", value1, value2, "sCreatetime");
            return (Criteria) this;
        }

        public Criteria andSUrlIsNull() {
            addCriterion("s_url is null");
            return (Criteria) this;
        }

        public Criteria andSUrlIsNotNull() {
            addCriterion("s_url is not null");
            return (Criteria) this;
        }

        public Criteria andSUrlEqualTo(String value) {
            addCriterion("s_url =", value, "sUrl");
            return (Criteria) this;
        }

        public Criteria andSUrlNotEqualTo(String value) {
            addCriterion("s_url <>", value, "sUrl");
            return (Criteria) this;
        }

        public Criteria andSUrlGreaterThan(String value) {
            addCriterion("s_url >", value, "sUrl");
            return (Criteria) this;
        }

        public Criteria andSUrlGreaterThanOrEqualTo(String value) {
            addCriterion("s_url >=", value, "sUrl");
            return (Criteria) this;
        }

        public Criteria andSUrlLessThan(String value) {
            addCriterion("s_url <", value, "sUrl");
            return (Criteria) this;
        }

        public Criteria andSUrlLessThanOrEqualTo(String value) {
            addCriterion("s_url <=", value, "sUrl");
            return (Criteria) this;
        }

        public Criteria andSUrlLike(String value) {
            addCriterion("s_url like", value, "sUrl");
            return (Criteria) this;
        }

        public Criteria andSUrlNotLike(String value) {
            addCriterion("s_url not like", value, "sUrl");
            return (Criteria) this;
        }

        public Criteria andSUrlIn(List<String> values) {
            addCriterion("s_url in", values, "sUrl");
            return (Criteria) this;
        }

        public Criteria andSUrlNotIn(List<String> values) {
            addCriterion("s_url not in", values, "sUrl");
            return (Criteria) this;
        }

        public Criteria andSUrlBetween(String value1, String value2) {
            addCriterion("s_url between", value1, value2, "sUrl");
            return (Criteria) this;
        }

        public Criteria andSUrlNotBetween(String value1, String value2) {
            addCriterion("s_url not between", value1, value2, "sUrl");
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
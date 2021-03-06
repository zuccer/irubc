package org.zucc.web.entity;

import java.util.ArrayList;
import java.util.List;

public class IFeedbackExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer limitStart;

    protected Integer limitEnd;

    public IFeedbackExample() {
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

        public Criteria andFeedbackIdIsNull() {
            addCriterion("feedback_id is null");
            return (Criteria) this;
        }

        public Criteria andFeedbackIdIsNotNull() {
            addCriterion("feedback_id is not null");
            return (Criteria) this;
        }

        public Criteria andFeedbackIdEqualTo(Long value) {
            addCriterion("feedback_id =", value, "feedbackId");
            return (Criteria) this;
        }

        public Criteria andFeedbackIdNotEqualTo(Long value) {
            addCriterion("feedback_id <>", value, "feedbackId");
            return (Criteria) this;
        }

        public Criteria andFeedbackIdGreaterThan(Long value) {
            addCriterion("feedback_id >", value, "feedbackId");
            return (Criteria) this;
        }

        public Criteria andFeedbackIdGreaterThanOrEqualTo(Long value) {
            addCriterion("feedback_id >=", value, "feedbackId");
            return (Criteria) this;
        }

        public Criteria andFeedbackIdLessThan(Long value) {
            addCriterion("feedback_id <", value, "feedbackId");
            return (Criteria) this;
        }

        public Criteria andFeedbackIdLessThanOrEqualTo(Long value) {
            addCriterion("feedback_id <=", value, "feedbackId");
            return (Criteria) this;
        }

        public Criteria andFeedbackIdIn(List<Long> values) {
            addCriterion("feedback_id in", values, "feedbackId");
            return (Criteria) this;
        }

        public Criteria andFeedbackIdNotIn(List<Long> values) {
            addCriterion("feedback_id not in", values, "feedbackId");
            return (Criteria) this;
        }

        public Criteria andFeedbackIdBetween(Long value1, Long value2) {
            addCriterion("feedback_id between", value1, value2, "feedbackId");
            return (Criteria) this;
        }

        public Criteria andFeedbackIdNotBetween(Long value1, Long value2) {
            addCriterion("feedback_id not between", value1, value2, "feedbackId");
            return (Criteria) this;
        }

        public Criteria andFeedbackUserIdIsNull() {
            addCriterion("feedback_user_id is null");
            return (Criteria) this;
        }

        public Criteria andFeedbackUserIdIsNotNull() {
            addCriterion("feedback_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andFeedbackUserIdEqualTo(Long value) {
            addCriterion("feedback_user_id =", value, "feedbackUserId");
            return (Criteria) this;
        }

        public Criteria andFeedbackUserIdNotEqualTo(Long value) {
            addCriterion("feedback_user_id <>", value, "feedbackUserId");
            return (Criteria) this;
        }

        public Criteria andFeedbackUserIdGreaterThan(Long value) {
            addCriterion("feedback_user_id >", value, "feedbackUserId");
            return (Criteria) this;
        }

        public Criteria andFeedbackUserIdGreaterThanOrEqualTo(Long value) {
            addCriterion("feedback_user_id >=", value, "feedbackUserId");
            return (Criteria) this;
        }

        public Criteria andFeedbackUserIdLessThan(Long value) {
            addCriterion("feedback_user_id <", value, "feedbackUserId");
            return (Criteria) this;
        }

        public Criteria andFeedbackUserIdLessThanOrEqualTo(Long value) {
            addCriterion("feedback_user_id <=", value, "feedbackUserId");
            return (Criteria) this;
        }

        public Criteria andFeedbackUserIdIn(List<Long> values) {
            addCriterion("feedback_user_id in", values, "feedbackUserId");
            return (Criteria) this;
        }

        public Criteria andFeedbackUserIdNotIn(List<Long> values) {
            addCriterion("feedback_user_id not in", values, "feedbackUserId");
            return (Criteria) this;
        }

        public Criteria andFeedbackUserIdBetween(Long value1, Long value2) {
            addCriterion("feedback_user_id between", value1, value2, "feedbackUserId");
            return (Criteria) this;
        }

        public Criteria andFeedbackUserIdNotBetween(Long value1, Long value2) {
            addCriterion("feedback_user_id not between", value1, value2, "feedbackUserId");
            return (Criteria) this;
        }

        public Criteria andFeedbackDetailIsNull() {
            addCriterion("feedback_detail is null");
            return (Criteria) this;
        }

        public Criteria andFeedbackDetailIsNotNull() {
            addCriterion("feedback_detail is not null");
            return (Criteria) this;
        }

        public Criteria andFeedbackDetailEqualTo(String value) {
            addCriterion("feedback_detail =", value, "feedbackDetail");
            return (Criteria) this;
        }

        public Criteria andFeedbackDetailNotEqualTo(String value) {
            addCriterion("feedback_detail <>", value, "feedbackDetail");
            return (Criteria) this;
        }

        public Criteria andFeedbackDetailGreaterThan(String value) {
            addCriterion("feedback_detail >", value, "feedbackDetail");
            return (Criteria) this;
        }

        public Criteria andFeedbackDetailGreaterThanOrEqualTo(String value) {
            addCriterion("feedback_detail >=", value, "feedbackDetail");
            return (Criteria) this;
        }

        public Criteria andFeedbackDetailLessThan(String value) {
            addCriterion("feedback_detail <", value, "feedbackDetail");
            return (Criteria) this;
        }

        public Criteria andFeedbackDetailLessThanOrEqualTo(String value) {
            addCriterion("feedback_detail <=", value, "feedbackDetail");
            return (Criteria) this;
        }

        public Criteria andFeedbackDetailLike(String value) {
            addCriterion("feedback_detail like", value, "feedbackDetail");
            return (Criteria) this;
        }

        public Criteria andFeedbackDetailNotLike(String value) {
            addCriterion("feedback_detail not like", value, "feedbackDetail");
            return (Criteria) this;
        }

        public Criteria andFeedbackDetailIn(List<String> values) {
            addCriterion("feedback_detail in", values, "feedbackDetail");
            return (Criteria) this;
        }

        public Criteria andFeedbackDetailNotIn(List<String> values) {
            addCriterion("feedback_detail not in", values, "feedbackDetail");
            return (Criteria) this;
        }

        public Criteria andFeedbackDetailBetween(String value1, String value2) {
            addCriterion("feedback_detail between", value1, value2, "feedbackDetail");
            return (Criteria) this;
        }

        public Criteria andFeedbackDetailNotBetween(String value1, String value2) {
            addCriterion("feedback_detail not between", value1, value2, "feedbackDetail");
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
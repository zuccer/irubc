package org.zucc.web.entity;

import java.util.ArrayList;
import java.util.List;

public class IColletionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer limitStart;

    protected Integer limitEnd;

    public IColletionExample() {
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

        public Criteria andCollectionidIsNull() {
            addCriterion("collectionId is null");
            return (Criteria) this;
        }

        public Criteria andCollectionidIsNotNull() {
            addCriterion("collectionId is not null");
            return (Criteria) this;
        }

        public Criteria andCollectionidEqualTo(Long value) {
            addCriterion("collectionId =", value, "collectionid");
            return (Criteria) this;
        }

        public Criteria andCollectionidNotEqualTo(Long value) {
            addCriterion("collectionId <>", value, "collectionid");
            return (Criteria) this;
        }

        public Criteria andCollectionidGreaterThan(Long value) {
            addCriterion("collectionId >", value, "collectionid");
            return (Criteria) this;
        }

        public Criteria andCollectionidGreaterThanOrEqualTo(Long value) {
            addCriterion("collectionId >=", value, "collectionid");
            return (Criteria) this;
        }

        public Criteria andCollectionidLessThan(Long value) {
            addCriterion("collectionId <", value, "collectionid");
            return (Criteria) this;
        }

        public Criteria andCollectionidLessThanOrEqualTo(Long value) {
            addCriterion("collectionId <=", value, "collectionid");
            return (Criteria) this;
        }

        public Criteria andCollectionidIn(List<Long> values) {
            addCriterion("collectionId in", values, "collectionid");
            return (Criteria) this;
        }

        public Criteria andCollectionidNotIn(List<Long> values) {
            addCriterion("collectionId not in", values, "collectionid");
            return (Criteria) this;
        }

        public Criteria andCollectionidBetween(Long value1, Long value2) {
            addCriterion("collectionId between", value1, value2, "collectionid");
            return (Criteria) this;
        }

        public Criteria andCollectionidNotBetween(Long value1, Long value2) {
            addCriterion("collectionId not between", value1, value2, "collectionid");
            return (Criteria) this;
        }

        public Criteria andColletionUseridIsNull() {
            addCriterion("colletion_userid is null");
            return (Criteria) this;
        }

        public Criteria andColletionUseridIsNotNull() {
            addCriterion("colletion_userid is not null");
            return (Criteria) this;
        }

        public Criteria andColletionUseridEqualTo(Long value) {
            addCriterion("colletion_userid =", value, "colletionUserid");
            return (Criteria) this;
        }

        public Criteria andColletionUseridNotEqualTo(Long value) {
            addCriterion("colletion_userid <>", value, "colletionUserid");
            return (Criteria) this;
        }

        public Criteria andColletionUseridGreaterThan(Long value) {
            addCriterion("colletion_userid >", value, "colletionUserid");
            return (Criteria) this;
        }

        public Criteria andColletionUseridGreaterThanOrEqualTo(Long value) {
            addCriterion("colletion_userid >=", value, "colletionUserid");
            return (Criteria) this;
        }

        public Criteria andColletionUseridLessThan(Long value) {
            addCriterion("colletion_userid <", value, "colletionUserid");
            return (Criteria) this;
        }

        public Criteria andColletionUseridLessThanOrEqualTo(Long value) {
            addCriterion("colletion_userid <=", value, "colletionUserid");
            return (Criteria) this;
        }

        public Criteria andColletionUseridIn(List<Long> values) {
            addCriterion("colletion_userid in", values, "colletionUserid");
            return (Criteria) this;
        }

        public Criteria andColletionUseridNotIn(List<Long> values) {
            addCriterion("colletion_userid not in", values, "colletionUserid");
            return (Criteria) this;
        }

        public Criteria andColletionUseridBetween(Long value1, Long value2) {
            addCriterion("colletion_userid between", value1, value2, "colletionUserid");
            return (Criteria) this;
        }

        public Criteria andColletionUseridNotBetween(Long value1, Long value2) {
            addCriterion("colletion_userid not between", value1, value2, "colletionUserid");
            return (Criteria) this;
        }

        public Criteria andColletionCourseIdIsNull() {
            addCriterion("colletion_course_id is null");
            return (Criteria) this;
        }

        public Criteria andColletionCourseIdIsNotNull() {
            addCriterion("colletion_course_id is not null");
            return (Criteria) this;
        }

        public Criteria andColletionCourseIdEqualTo(Long value) {
            addCriterion("colletion_course_id =", value, "colletionCourseId");
            return (Criteria) this;
        }

        public Criteria andColletionCourseIdNotEqualTo(Long value) {
            addCriterion("colletion_course_id <>", value, "colletionCourseId");
            return (Criteria) this;
        }

        public Criteria andColletionCourseIdGreaterThan(Long value) {
            addCriterion("colletion_course_id >", value, "colletionCourseId");
            return (Criteria) this;
        }

        public Criteria andColletionCourseIdGreaterThanOrEqualTo(Long value) {
            addCriterion("colletion_course_id >=", value, "colletionCourseId");
            return (Criteria) this;
        }

        public Criteria andColletionCourseIdLessThan(Long value) {
            addCriterion("colletion_course_id <", value, "colletionCourseId");
            return (Criteria) this;
        }

        public Criteria andColletionCourseIdLessThanOrEqualTo(Long value) {
            addCriterion("colletion_course_id <=", value, "colletionCourseId");
            return (Criteria) this;
        }

        public Criteria andColletionCourseIdIn(List<Long> values) {
            addCriterion("colletion_course_id in", values, "colletionCourseId");
            return (Criteria) this;
        }

        public Criteria andColletionCourseIdNotIn(List<Long> values) {
            addCriterion("colletion_course_id not in", values, "colletionCourseId");
            return (Criteria) this;
        }

        public Criteria andColletionCourseIdBetween(Long value1, Long value2) {
            addCriterion("colletion_course_id between", value1, value2, "colletionCourseId");
            return (Criteria) this;
        }

        public Criteria andColletionCourseIdNotBetween(Long value1, Long value2) {
            addCriterion("colletion_course_id not between", value1, value2, "colletionCourseId");
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
package org.zucc.web.entity;

import java.util.ArrayList;
import java.util.List;

public class ICourseTypeExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table i_course_type
     *
     * @mbggenerated Tue Nov 03 09:22:01 CST 2015
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table i_course_type
     *
     * @mbggenerated Tue Nov 03 09:22:01 CST 2015
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table i_course_type
     *
     * @mbggenerated Tue Nov 03 09:22:01 CST 2015
     */
    protected List<Criteria> oredCriteria;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table i_course_type
     *
     * @mbggenerated Tue Nov 03 09:22:01 CST 2015
     */
    protected Integer limitStart;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table i_course_type
     *
     * @mbggenerated Tue Nov 03 09:22:01 CST 2015
     */
    protected Integer limitEnd;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table i_course_type
     *
     * @mbggenerated Tue Nov 03 09:22:01 CST 2015
     */
    public ICourseTypeExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table i_course_type
     *
     * @mbggenerated Tue Nov 03 09:22:01 CST 2015
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table i_course_type
     *
     * @mbggenerated Tue Nov 03 09:22:01 CST 2015
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table i_course_type
     *
     * @mbggenerated Tue Nov 03 09:22:01 CST 2015
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table i_course_type
     *
     * @mbggenerated Tue Nov 03 09:22:01 CST 2015
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table i_course_type
     *
     * @mbggenerated Tue Nov 03 09:22:01 CST 2015
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table i_course_type
     *
     * @mbggenerated Tue Nov 03 09:22:01 CST 2015
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table i_course_type
     *
     * @mbggenerated Tue Nov 03 09:22:01 CST 2015
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table i_course_type
     *
     * @mbggenerated Tue Nov 03 09:22:01 CST 2015
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table i_course_type
     *
     * @mbggenerated Tue Nov 03 09:22:01 CST 2015
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table i_course_type
     *
     * @mbggenerated Tue Nov 03 09:22:01 CST 2015
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table i_course_type
     *
     * @mbggenerated Tue Nov 03 09:22:01 CST 2015
     */
    public void setLimitStart(Integer limitStart) {
        this.limitStart=limitStart;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table i_course_type
     *
     * @mbggenerated Tue Nov 03 09:22:01 CST 2015
     */
    public Integer getLimitStart() {
        return limitStart;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table i_course_type
     *
     * @mbggenerated Tue Nov 03 09:22:01 CST 2015
     */
    public void setLimitEnd(Integer limitEnd) {
        this.limitEnd=limitEnd;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table i_course_type
     *
     * @mbggenerated Tue Nov 03 09:22:01 CST 2015
     */
    public Integer getLimitEnd() {
        return limitEnd;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table i_course_type
     *
     * @mbggenerated Tue Nov 03 09:22:01 CST 2015
     */
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

        public Criteria andCourseTypeIdIsNull() {
            addCriterion("course_type_id is null");
            return (Criteria) this;
        }

        public Criteria andCourseTypeIdIsNotNull() {
            addCriterion("course_type_id is not null");
            return (Criteria) this;
        }

        public Criteria andCourseTypeIdEqualTo(Long value) {
            addCriterion("course_type_id =", value, "courseTypeId");
            return (Criteria) this;
        }

        public Criteria andCourseTypeIdNotEqualTo(Long value) {
            addCriterion("course_type_id <>", value, "courseTypeId");
            return (Criteria) this;
        }

        public Criteria andCourseTypeIdGreaterThan(Long value) {
            addCriterion("course_type_id >", value, "courseTypeId");
            return (Criteria) this;
        }

        public Criteria andCourseTypeIdGreaterThanOrEqualTo(Long value) {
            addCriterion("course_type_id >=", value, "courseTypeId");
            return (Criteria) this;
        }

        public Criteria andCourseTypeIdLessThan(Long value) {
            addCriterion("course_type_id <", value, "courseTypeId");
            return (Criteria) this;
        }

        public Criteria andCourseTypeIdLessThanOrEqualTo(Long value) {
            addCriterion("course_type_id <=", value, "courseTypeId");
            return (Criteria) this;
        }

        public Criteria andCourseTypeIdIn(List<Long> values) {
            addCriterion("course_type_id in", values, "courseTypeId");
            return (Criteria) this;
        }

        public Criteria andCourseTypeIdNotIn(List<Long> values) {
            addCriterion("course_type_id not in", values, "courseTypeId");
            return (Criteria) this;
        }

        public Criteria andCourseTypeIdBetween(Long value1, Long value2) {
            addCriterion("course_type_id between", value1, value2, "courseTypeId");
            return (Criteria) this;
        }

        public Criteria andCourseTypeIdNotBetween(Long value1, Long value2) {
            addCriterion("course_type_id not between", value1, value2, "courseTypeId");
            return (Criteria) this;
        }

        public Criteria andCourseTypeNameIsNull() {
            addCriterion("course_type_name is null");
            return (Criteria) this;
        }

        public Criteria andCourseTypeNameIsNotNull() {
            addCriterion("course_type_name is not null");
            return (Criteria) this;
        }

        public Criteria andCourseTypeNameEqualTo(String value) {
            addCriterion("course_type_name =", value, "courseTypeName");
            return (Criteria) this;
        }

        public Criteria andCourseTypeNameNotEqualTo(String value) {
            addCriterion("course_type_name <>", value, "courseTypeName");
            return (Criteria) this;
        }

        public Criteria andCourseTypeNameGreaterThan(String value) {
            addCriterion("course_type_name >", value, "courseTypeName");
            return (Criteria) this;
        }

        public Criteria andCourseTypeNameGreaterThanOrEqualTo(String value) {
            addCriterion("course_type_name >=", value, "courseTypeName");
            return (Criteria) this;
        }

        public Criteria andCourseTypeNameLessThan(String value) {
            addCriterion("course_type_name <", value, "courseTypeName");
            return (Criteria) this;
        }

        public Criteria andCourseTypeNameLessThanOrEqualTo(String value) {
            addCriterion("course_type_name <=", value, "courseTypeName");
            return (Criteria) this;
        }

        public Criteria andCourseTypeNameLike(String value) {
            addCriterion("course_type_name like", value, "courseTypeName");
            return (Criteria) this;
        }

        public Criteria andCourseTypeNameNotLike(String value) {
            addCriterion("course_type_name not like", value, "courseTypeName");
            return (Criteria) this;
        }

        public Criteria andCourseTypeNameIn(List<String> values) {
            addCriterion("course_type_name in", values, "courseTypeName");
            return (Criteria) this;
        }

        public Criteria andCourseTypeNameNotIn(List<String> values) {
            addCriterion("course_type_name not in", values, "courseTypeName");
            return (Criteria) this;
        }

        public Criteria andCourseTypeNameBetween(String value1, String value2) {
            addCriterion("course_type_name between", value1, value2, "courseTypeName");
            return (Criteria) this;
        }

        public Criteria andCourseTypeNameNotBetween(String value1, String value2) {
            addCriterion("course_type_name not between", value1, value2, "courseTypeName");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table i_course_type
     *
     * @mbggenerated do_not_delete_during_merge Tue Nov 03 09:22:01 CST 2015
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table i_course_type
     *
     * @mbggenerated Tue Nov 03 09:22:01 CST 2015
     */
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
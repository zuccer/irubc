package org.zucc.web.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ICommentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer limitStart;

    protected Integer limitEnd;

    public ICommentExample() {
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

        public Criteria andCommentidIsNull() {
            addCriterion("commentId is null");
            return (Criteria) this;
        }

        public Criteria andCommentidIsNotNull() {
            addCriterion("commentId is not null");
            return (Criteria) this;
        }

        public Criteria andCommentidEqualTo(Long value) {
            addCriterion("commentId =", value, "commentid");
            return (Criteria) this;
        }

        public Criteria andCommentidNotEqualTo(Long value) {
            addCriterion("commentId <>", value, "commentid");
            return (Criteria) this;
        }

        public Criteria andCommentidGreaterThan(Long value) {
            addCriterion("commentId >", value, "commentid");
            return (Criteria) this;
        }

        public Criteria andCommentidGreaterThanOrEqualTo(Long value) {
            addCriterion("commentId >=", value, "commentid");
            return (Criteria) this;
        }

        public Criteria andCommentidLessThan(Long value) {
            addCriterion("commentId <", value, "commentid");
            return (Criteria) this;
        }

        public Criteria andCommentidLessThanOrEqualTo(Long value) {
            addCriterion("commentId <=", value, "commentid");
            return (Criteria) this;
        }

        public Criteria andCommentidIn(List<Long> values) {
            addCriterion("commentId in", values, "commentid");
            return (Criteria) this;
        }

        public Criteria andCommentidNotIn(List<Long> values) {
            addCriterion("commentId not in", values, "commentid");
            return (Criteria) this;
        }

        public Criteria andCommentidBetween(Long value1, Long value2) {
            addCriterion("commentId between", value1, value2, "commentid");
            return (Criteria) this;
        }

        public Criteria andCommentidNotBetween(Long value1, Long value2) {
            addCriterion("commentId not between", value1, value2, "commentid");
            return (Criteria) this;
        }

        public Criteria andCommentCourseidIsNull() {
            addCriterion("comment_courseId is null");
            return (Criteria) this;
        }

        public Criteria andCommentCourseidIsNotNull() {
            addCriterion("comment_courseId is not null");
            return (Criteria) this;
        }

        public Criteria andCommentCourseidEqualTo(Long value) {
            addCriterion("comment_courseId =", value, "commentCourseid");
            return (Criteria) this;
        }

        public Criteria andCommentCourseidNotEqualTo(Long value) {
            addCriterion("comment_courseId <>", value, "commentCourseid");
            return (Criteria) this;
        }

        public Criteria andCommentCourseidGreaterThan(Long value) {
            addCriterion("comment_courseId >", value, "commentCourseid");
            return (Criteria) this;
        }

        public Criteria andCommentCourseidGreaterThanOrEqualTo(Long value) {
            addCriterion("comment_courseId >=", value, "commentCourseid");
            return (Criteria) this;
        }

        public Criteria andCommentCourseidLessThan(Long value) {
            addCriterion("comment_courseId <", value, "commentCourseid");
            return (Criteria) this;
        }

        public Criteria andCommentCourseidLessThanOrEqualTo(Long value) {
            addCriterion("comment_courseId <=", value, "commentCourseid");
            return (Criteria) this;
        }

        public Criteria andCommentCourseidIn(List<Long> values) {
            addCriterion("comment_courseId in", values, "commentCourseid");
            return (Criteria) this;
        }

        public Criteria andCommentCourseidNotIn(List<Long> values) {
            addCriterion("comment_courseId not in", values, "commentCourseid");
            return (Criteria) this;
        }

        public Criteria andCommentCourseidBetween(Long value1, Long value2) {
            addCriterion("comment_courseId between", value1, value2, "commentCourseid");
            return (Criteria) this;
        }

        public Criteria andCommentCourseidNotBetween(Long value1, Long value2) {
            addCriterion("comment_courseId not between", value1, value2, "commentCourseid");
            return (Criteria) this;
        }

        public Criteria andCommentUseridIsNull() {
            addCriterion("comment_userId is null");
            return (Criteria) this;
        }

        public Criteria andCommentUseridIsNotNull() {
            addCriterion("comment_userId is not null");
            return (Criteria) this;
        }

        public Criteria andCommentUseridEqualTo(Long value) {
            addCriterion("comment_userId =", value, "commentUserid");
            return (Criteria) this;
        }

        public Criteria andCommentUseridNotEqualTo(Long value) {
            addCriterion("comment_userId <>", value, "commentUserid");
            return (Criteria) this;
        }

        public Criteria andCommentUseridGreaterThan(Long value) {
            addCriterion("comment_userId >", value, "commentUserid");
            return (Criteria) this;
        }

        public Criteria andCommentUseridGreaterThanOrEqualTo(Long value) {
            addCriterion("comment_userId >=", value, "commentUserid");
            return (Criteria) this;
        }

        public Criteria andCommentUseridLessThan(Long value) {
            addCriterion("comment_userId <", value, "commentUserid");
            return (Criteria) this;
        }

        public Criteria andCommentUseridLessThanOrEqualTo(Long value) {
            addCriterion("comment_userId <=", value, "commentUserid");
            return (Criteria) this;
        }

        public Criteria andCommentUseridIn(List<Long> values) {
            addCriterion("comment_userId in", values, "commentUserid");
            return (Criteria) this;
        }

        public Criteria andCommentUseridNotIn(List<Long> values) {
            addCriterion("comment_userId not in", values, "commentUserid");
            return (Criteria) this;
        }

        public Criteria andCommentUseridBetween(Long value1, Long value2) {
            addCriterion("comment_userId between", value1, value2, "commentUserid");
            return (Criteria) this;
        }

        public Criteria andCommentUseridNotBetween(Long value1, Long value2) {
            addCriterion("comment_userId not between", value1, value2, "commentUserid");
            return (Criteria) this;
        }

        public Criteria andCommentDescriptionIsNull() {
            addCriterion("comment_description is null");
            return (Criteria) this;
        }

        public Criteria andCommentDescriptionIsNotNull() {
            addCriterion("comment_description is not null");
            return (Criteria) this;
        }

        public Criteria andCommentDescriptionEqualTo(String value) {
            addCriterion("comment_description =", value, "commentDescription");
            return (Criteria) this;
        }

        public Criteria andCommentDescriptionNotEqualTo(String value) {
            addCriterion("comment_description <>", value, "commentDescription");
            return (Criteria) this;
        }

        public Criteria andCommentDescriptionGreaterThan(String value) {
            addCriterion("comment_description >", value, "commentDescription");
            return (Criteria) this;
        }

        public Criteria andCommentDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("comment_description >=", value, "commentDescription");
            return (Criteria) this;
        }

        public Criteria andCommentDescriptionLessThan(String value) {
            addCriterion("comment_description <", value, "commentDescription");
            return (Criteria) this;
        }

        public Criteria andCommentDescriptionLessThanOrEqualTo(String value) {
            addCriterion("comment_description <=", value, "commentDescription");
            return (Criteria) this;
        }

        public Criteria andCommentDescriptionLike(String value) {
            addCriterion("comment_description like", value, "commentDescription");
            return (Criteria) this;
        }

        public Criteria andCommentDescriptionNotLike(String value) {
            addCriterion("comment_description not like", value, "commentDescription");
            return (Criteria) this;
        }

        public Criteria andCommentDescriptionIn(List<String> values) {
            addCriterion("comment_description in", values, "commentDescription");
            return (Criteria) this;
        }

        public Criteria andCommentDescriptionNotIn(List<String> values) {
            addCriterion("comment_description not in", values, "commentDescription");
            return (Criteria) this;
        }

        public Criteria andCommentDescriptionBetween(String value1, String value2) {
            addCriterion("comment_description between", value1, value2, "commentDescription");
            return (Criteria) this;
        }

        public Criteria andCommentDescriptionNotBetween(String value1, String value2) {
            addCriterion("comment_description not between", value1, value2, "commentDescription");
            return (Criteria) this;
        }

        public Criteria andCommentCreatetimeIsNull() {
            addCriterion("comment_createTime is null");
            return (Criteria) this;
        }

        public Criteria andCommentCreatetimeIsNotNull() {
            addCriterion("comment_createTime is not null");
            return (Criteria) this;
        }

        public Criteria andCommentCreatetimeEqualTo(Date value) {
            addCriterion("comment_createTime =", value, "commentCreatetime");
            return (Criteria) this;
        }

        public Criteria andCommentCreatetimeNotEqualTo(Date value) {
            addCriterion("comment_createTime <>", value, "commentCreatetime");
            return (Criteria) this;
        }

        public Criteria andCommentCreatetimeGreaterThan(Date value) {
            addCriterion("comment_createTime >", value, "commentCreatetime");
            return (Criteria) this;
        }

        public Criteria andCommentCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("comment_createTime >=", value, "commentCreatetime");
            return (Criteria) this;
        }

        public Criteria andCommentCreatetimeLessThan(Date value) {
            addCriterion("comment_createTime <", value, "commentCreatetime");
            return (Criteria) this;
        }

        public Criteria andCommentCreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("comment_createTime <=", value, "commentCreatetime");
            return (Criteria) this;
        }

        public Criteria andCommentCreatetimeIn(List<Date> values) {
            addCriterion("comment_createTime in", values, "commentCreatetime");
            return (Criteria) this;
        }

        public Criteria andCommentCreatetimeNotIn(List<Date> values) {
            addCriterion("comment_createTime not in", values, "commentCreatetime");
            return (Criteria) this;
        }

        public Criteria andCommentCreatetimeBetween(Date value1, Date value2) {
            addCriterion("comment_createTime between", value1, value2, "commentCreatetime");
            return (Criteria) this;
        }

        public Criteria andCommentCreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("comment_createTime not between", value1, value2, "commentCreatetime");
            return (Criteria) this;
        }

        public Criteria andCommentCourseScoreIsNull() {
            addCriterion("comment_course_score is null");
            return (Criteria) this;
        }

        public Criteria andCommentCourseScoreIsNotNull() {
            addCriterion("comment_course_score is not null");
            return (Criteria) this;
        }

        public Criteria andCommentCourseScoreEqualTo(Integer value) {
            addCriterion("comment_course_score =", value, "commentCourseScore");
            return (Criteria) this;
        }

        public Criteria andCommentCourseScoreNotEqualTo(Integer value) {
            addCriterion("comment_course_score <>", value, "commentCourseScore");
            return (Criteria) this;
        }

        public Criteria andCommentCourseScoreGreaterThan(Integer value) {
            addCriterion("comment_course_score >", value, "commentCourseScore");
            return (Criteria) this;
        }

        public Criteria andCommentCourseScoreGreaterThanOrEqualTo(Integer value) {
            addCriterion("comment_course_score >=", value, "commentCourseScore");
            return (Criteria) this;
        }

        public Criteria andCommentCourseScoreLessThan(Integer value) {
            addCriterion("comment_course_score <", value, "commentCourseScore");
            return (Criteria) this;
        }

        public Criteria andCommentCourseScoreLessThanOrEqualTo(Integer value) {
            addCriterion("comment_course_score <=", value, "commentCourseScore");
            return (Criteria) this;
        }

        public Criteria andCommentCourseScoreIn(List<Integer> values) {
            addCriterion("comment_course_score in", values, "commentCourseScore");
            return (Criteria) this;
        }

        public Criteria andCommentCourseScoreNotIn(List<Integer> values) {
            addCriterion("comment_course_score not in", values, "commentCourseScore");
            return (Criteria) this;
        }

        public Criteria andCommentCourseScoreBetween(Integer value1, Integer value2) {
            addCriterion("comment_course_score between", value1, value2, "commentCourseScore");
            return (Criteria) this;
        }

        public Criteria andCommentCourseScoreNotBetween(Integer value1, Integer value2) {
            addCriterion("comment_course_score not between", value1, value2, "commentCourseScore");
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
package org.zucc.web.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class IAnnouncementExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer limitStart;

    protected Integer limitEnd;

    public IAnnouncementExample() {
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

        public Criteria andAnnouncementIdIsNull() {
            addCriterion("announcement_id is null");
            return (Criteria) this;
        }

        public Criteria andAnnouncementIdIsNotNull() {
            addCriterion("announcement_id is not null");
            return (Criteria) this;
        }

        public Criteria andAnnouncementIdEqualTo(Long value) {
            addCriterion("announcement_id =", value, "announcementId");
            return (Criteria) this;
        }

        public Criteria andAnnouncementIdNotEqualTo(Long value) {
            addCriterion("announcement_id <>", value, "announcementId");
            return (Criteria) this;
        }

        public Criteria andAnnouncementIdGreaterThan(Long value) {
            addCriterion("announcement_id >", value, "announcementId");
            return (Criteria) this;
        }

        public Criteria andAnnouncementIdGreaterThanOrEqualTo(Long value) {
            addCriterion("announcement_id >=", value, "announcementId");
            return (Criteria) this;
        }

        public Criteria andAnnouncementIdLessThan(Long value) {
            addCriterion("announcement_id <", value, "announcementId");
            return (Criteria) this;
        }

        public Criteria andAnnouncementIdLessThanOrEqualTo(Long value) {
            addCriterion("announcement_id <=", value, "announcementId");
            return (Criteria) this;
        }

        public Criteria andAnnouncementIdIn(List<Long> values) {
            addCriterion("announcement_id in", values, "announcementId");
            return (Criteria) this;
        }

        public Criteria andAnnouncementIdNotIn(List<Long> values) {
            addCriterion("announcement_id not in", values, "announcementId");
            return (Criteria) this;
        }

        public Criteria andAnnouncementIdBetween(Long value1, Long value2) {
            addCriterion("announcement_id between", value1, value2, "announcementId");
            return (Criteria) this;
        }

        public Criteria andAnnouncementIdNotBetween(Long value1, Long value2) {
            addCriterion("announcement_id not between", value1, value2, "announcementId");
            return (Criteria) this;
        }

        public Criteria andAnnouncementImageIsNull() {
            addCriterion("announcement_image is null");
            return (Criteria) this;
        }

        public Criteria andAnnouncementImageIsNotNull() {
            addCriterion("announcement_image is not null");
            return (Criteria) this;
        }

        public Criteria andAnnouncementImageEqualTo(String value) {
            addCriterion("announcement_image =", value, "announcementImage");
            return (Criteria) this;
        }

        public Criteria andAnnouncementImageNotEqualTo(String value) {
            addCriterion("announcement_image <>", value, "announcementImage");
            return (Criteria) this;
        }

        public Criteria andAnnouncementImageGreaterThan(String value) {
            addCriterion("announcement_image >", value, "announcementImage");
            return (Criteria) this;
        }

        public Criteria andAnnouncementImageGreaterThanOrEqualTo(String value) {
            addCriterion("announcement_image >=", value, "announcementImage");
            return (Criteria) this;
        }

        public Criteria andAnnouncementImageLessThan(String value) {
            addCriterion("announcement_image <", value, "announcementImage");
            return (Criteria) this;
        }

        public Criteria andAnnouncementImageLessThanOrEqualTo(String value) {
            addCriterion("announcement_image <=", value, "announcementImage");
            return (Criteria) this;
        }

        public Criteria andAnnouncementImageLike(String value) {
            addCriterion("announcement_image like", value, "announcementImage");
            return (Criteria) this;
        }

        public Criteria andAnnouncementImageNotLike(String value) {
            addCriterion("announcement_image not like", value, "announcementImage");
            return (Criteria) this;
        }

        public Criteria andAnnouncementImageIn(List<String> values) {
            addCriterion("announcement_image in", values, "announcementImage");
            return (Criteria) this;
        }

        public Criteria andAnnouncementImageNotIn(List<String> values) {
            addCriterion("announcement_image not in", values, "announcementImage");
            return (Criteria) this;
        }

        public Criteria andAnnouncementImageBetween(String value1, String value2) {
            addCriterion("announcement_image between", value1, value2, "announcementImage");
            return (Criteria) this;
        }

        public Criteria andAnnouncementImageNotBetween(String value1, String value2) {
            addCriterion("announcement_image not between", value1, value2, "announcementImage");
            return (Criteria) this;
        }

        public Criteria andAnnouncementUrlIsNull() {
            addCriterion("announcement_url is null");
            return (Criteria) this;
        }

        public Criteria andAnnouncementUrlIsNotNull() {
            addCriterion("announcement_url is not null");
            return (Criteria) this;
        }

        public Criteria andAnnouncementUrlEqualTo(String value) {
            addCriterion("announcement_url =", value, "announcementUrl");
            return (Criteria) this;
        }

        public Criteria andAnnouncementUrlNotEqualTo(String value) {
            addCriterion("announcement_url <>", value, "announcementUrl");
            return (Criteria) this;
        }

        public Criteria andAnnouncementUrlGreaterThan(String value) {
            addCriterion("announcement_url >", value, "announcementUrl");
            return (Criteria) this;
        }

        public Criteria andAnnouncementUrlGreaterThanOrEqualTo(String value) {
            addCriterion("announcement_url >=", value, "announcementUrl");
            return (Criteria) this;
        }

        public Criteria andAnnouncementUrlLessThan(String value) {
            addCriterion("announcement_url <", value, "announcementUrl");
            return (Criteria) this;
        }

        public Criteria andAnnouncementUrlLessThanOrEqualTo(String value) {
            addCriterion("announcement_url <=", value, "announcementUrl");
            return (Criteria) this;
        }

        public Criteria andAnnouncementUrlLike(String value) {
            addCriterion("announcement_url like", value, "announcementUrl");
            return (Criteria) this;
        }

        public Criteria andAnnouncementUrlNotLike(String value) {
            addCriterion("announcement_url not like", value, "announcementUrl");
            return (Criteria) this;
        }

        public Criteria andAnnouncementUrlIn(List<String> values) {
            addCriterion("announcement_url in", values, "announcementUrl");
            return (Criteria) this;
        }

        public Criteria andAnnouncementUrlNotIn(List<String> values) {
            addCriterion("announcement_url not in", values, "announcementUrl");
            return (Criteria) this;
        }

        public Criteria andAnnouncementUrlBetween(String value1, String value2) {
            addCriterion("announcement_url between", value1, value2, "announcementUrl");
            return (Criteria) this;
        }

        public Criteria andAnnouncementUrlNotBetween(String value1, String value2) {
            addCriterion("announcement_url not between", value1, value2, "announcementUrl");
            return (Criteria) this;
        }

        public Criteria andAnnouncementDescriptionIsNull() {
            addCriterion("announcement_description is null");
            return (Criteria) this;
        }

        public Criteria andAnnouncementDescriptionIsNotNull() {
            addCriterion("announcement_description is not null");
            return (Criteria) this;
        }

        public Criteria andAnnouncementDescriptionEqualTo(String value) {
            addCriterion("announcement_description =", value, "announcementDescription");
            return (Criteria) this;
        }

        public Criteria andAnnouncementDescriptionNotEqualTo(String value) {
            addCriterion("announcement_description <>", value, "announcementDescription");
            return (Criteria) this;
        }

        public Criteria andAnnouncementDescriptionGreaterThan(String value) {
            addCriterion("announcement_description >", value, "announcementDescription");
            return (Criteria) this;
        }

        public Criteria andAnnouncementDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("announcement_description >=", value, "announcementDescription");
            return (Criteria) this;
        }

        public Criteria andAnnouncementDescriptionLessThan(String value) {
            addCriterion("announcement_description <", value, "announcementDescription");
            return (Criteria) this;
        }

        public Criteria andAnnouncementDescriptionLessThanOrEqualTo(String value) {
            addCriterion("announcement_description <=", value, "announcementDescription");
            return (Criteria) this;
        }

        public Criteria andAnnouncementDescriptionLike(String value) {
            addCriterion("announcement_description like", value, "announcementDescription");
            return (Criteria) this;
        }

        public Criteria andAnnouncementDescriptionNotLike(String value) {
            addCriterion("announcement_description not like", value, "announcementDescription");
            return (Criteria) this;
        }

        public Criteria andAnnouncementDescriptionIn(List<String> values) {
            addCriterion("announcement_description in", values, "announcementDescription");
            return (Criteria) this;
        }

        public Criteria andAnnouncementDescriptionNotIn(List<String> values) {
            addCriterion("announcement_description not in", values, "announcementDescription");
            return (Criteria) this;
        }

        public Criteria andAnnouncementDescriptionBetween(String value1, String value2) {
            addCriterion("announcement_description between", value1, value2, "announcementDescription");
            return (Criteria) this;
        }

        public Criteria andAnnouncementDescriptionNotBetween(String value1, String value2) {
            addCriterion("announcement_description not between", value1, value2, "announcementDescription");
            return (Criteria) this;
        }

        public Criteria andAnnouncementCreatetimeIsNull() {
            addCriterion("announcement_createTime is null");
            return (Criteria) this;
        }

        public Criteria andAnnouncementCreatetimeIsNotNull() {
            addCriterion("announcement_createTime is not null");
            return (Criteria) this;
        }

        public Criteria andAnnouncementCreatetimeEqualTo(Date value) {
            addCriterion("announcement_createTime =", value, "announcementCreatetime");
            return (Criteria) this;
        }

        public Criteria andAnnouncementCreatetimeNotEqualTo(Date value) {
            addCriterion("announcement_createTime <>", value, "announcementCreatetime");
            return (Criteria) this;
        }

        public Criteria andAnnouncementCreatetimeGreaterThan(Date value) {
            addCriterion("announcement_createTime >", value, "announcementCreatetime");
            return (Criteria) this;
        }

        public Criteria andAnnouncementCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("announcement_createTime >=", value, "announcementCreatetime");
            return (Criteria) this;
        }

        public Criteria andAnnouncementCreatetimeLessThan(Date value) {
            addCriterion("announcement_createTime <", value, "announcementCreatetime");
            return (Criteria) this;
        }

        public Criteria andAnnouncementCreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("announcement_createTime <=", value, "announcementCreatetime");
            return (Criteria) this;
        }

        public Criteria andAnnouncementCreatetimeIn(List<Date> values) {
            addCriterion("announcement_createTime in", values, "announcementCreatetime");
            return (Criteria) this;
        }

        public Criteria andAnnouncementCreatetimeNotIn(List<Date> values) {
            addCriterion("announcement_createTime not in", values, "announcementCreatetime");
            return (Criteria) this;
        }

        public Criteria andAnnouncementCreatetimeBetween(Date value1, Date value2) {
            addCriterion("announcement_createTime between", value1, value2, "announcementCreatetime");
            return (Criteria) this;
        }

        public Criteria andAnnouncementCreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("announcement_createTime not between", value1, value2, "announcementCreatetime");
            return (Criteria) this;
        }

        public Criteria andAnnouncementAdminIdIsNull() {
            addCriterion("announcement_admin_id is null");
            return (Criteria) this;
        }

        public Criteria andAnnouncementAdminIdIsNotNull() {
            addCriterion("announcement_admin_id is not null");
            return (Criteria) this;
        }

        public Criteria andAnnouncementAdminIdEqualTo(Long value) {
            addCriterion("announcement_admin_id =", value, "announcementAdminId");
            return (Criteria) this;
        }

        public Criteria andAnnouncementAdminIdNotEqualTo(Long value) {
            addCriterion("announcement_admin_id <>", value, "announcementAdminId");
            return (Criteria) this;
        }

        public Criteria andAnnouncementAdminIdGreaterThan(Long value) {
            addCriterion("announcement_admin_id >", value, "announcementAdminId");
            return (Criteria) this;
        }

        public Criteria andAnnouncementAdminIdGreaterThanOrEqualTo(Long value) {
            addCriterion("announcement_admin_id >=", value, "announcementAdminId");
            return (Criteria) this;
        }

        public Criteria andAnnouncementAdminIdLessThan(Long value) {
            addCriterion("announcement_admin_id <", value, "announcementAdminId");
            return (Criteria) this;
        }

        public Criteria andAnnouncementAdminIdLessThanOrEqualTo(Long value) {
            addCriterion("announcement_admin_id <=", value, "announcementAdminId");
            return (Criteria) this;
        }

        public Criteria andAnnouncementAdminIdIn(List<Long> values) {
            addCriterion("announcement_admin_id in", values, "announcementAdminId");
            return (Criteria) this;
        }

        public Criteria andAnnouncementAdminIdNotIn(List<Long> values) {
            addCriterion("announcement_admin_id not in", values, "announcementAdminId");
            return (Criteria) this;
        }

        public Criteria andAnnouncementAdminIdBetween(Long value1, Long value2) {
            addCriterion("announcement_admin_id between", value1, value2, "announcementAdminId");
            return (Criteria) this;
        }

        public Criteria andAnnouncementAdminIdNotBetween(Long value1, Long value2) {
            addCriterion("announcement_admin_id not between", value1, value2, "announcementAdminId");
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
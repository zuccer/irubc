package org.zucc.web.entity;

import java.util.ArrayList;
import java.util.List;

public class IEnrollExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer limitStart;

    protected Integer limitEnd;

    public IEnrollExample() {
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

        public Criteria andEnrollIdIsNull() {
            addCriterion("enroll_id is null");
            return (Criteria) this;
        }

        public Criteria andEnrollIdIsNotNull() {
            addCriterion("enroll_id is not null");
            return (Criteria) this;
        }

        public Criteria andEnrollIdEqualTo(Long value) {
            addCriterion("enroll_id =", value, "enrollId");
            return (Criteria) this;
        }

        public Criteria andEnrollIdNotEqualTo(Long value) {
            addCriterion("enroll_id <>", value, "enrollId");
            return (Criteria) this;
        }

        public Criteria andEnrollIdGreaterThan(Long value) {
            addCriterion("enroll_id >", value, "enrollId");
            return (Criteria) this;
        }

        public Criteria andEnrollIdGreaterThanOrEqualTo(Long value) {
            addCriterion("enroll_id >=", value, "enrollId");
            return (Criteria) this;
        }

        public Criteria andEnrollIdLessThan(Long value) {
            addCriterion("enroll_id <", value, "enrollId");
            return (Criteria) this;
        }

        public Criteria andEnrollIdLessThanOrEqualTo(Long value) {
            addCriterion("enroll_id <=", value, "enrollId");
            return (Criteria) this;
        }

        public Criteria andEnrollIdIn(List<Long> values) {
            addCriterion("enroll_id in", values, "enrollId");
            return (Criteria) this;
        }

        public Criteria andEnrollIdNotIn(List<Long> values) {
            addCriterion("enroll_id not in", values, "enrollId");
            return (Criteria) this;
        }

        public Criteria andEnrollIdBetween(Long value1, Long value2) {
            addCriterion("enroll_id between", value1, value2, "enrollId");
            return (Criteria) this;
        }

        public Criteria andEnrollIdNotBetween(Long value1, Long value2) {
            addCriterion("enroll_id not between", value1, value2, "enrollId");
            return (Criteria) this;
        }

        public Criteria andEnrollCourseidIsNull() {
            addCriterion("enroll_courseId is null");
            return (Criteria) this;
        }

        public Criteria andEnrollCourseidIsNotNull() {
            addCriterion("enroll_courseId is not null");
            return (Criteria) this;
        }

        public Criteria andEnrollCourseidEqualTo(Long value) {
            addCriterion("enroll_courseId =", value, "enrollCourseid");
            return (Criteria) this;
        }

        public Criteria andEnrollCourseidNotEqualTo(Long value) {
            addCriterion("enroll_courseId <>", value, "enrollCourseid");
            return (Criteria) this;
        }

        public Criteria andEnrollCourseidGreaterThan(Long value) {
            addCriterion("enroll_courseId >", value, "enrollCourseid");
            return (Criteria) this;
        }

        public Criteria andEnrollCourseidGreaterThanOrEqualTo(Long value) {
            addCriterion("enroll_courseId >=", value, "enrollCourseid");
            return (Criteria) this;
        }

        public Criteria andEnrollCourseidLessThan(Long value) {
            addCriterion("enroll_courseId <", value, "enrollCourseid");
            return (Criteria) this;
        }

        public Criteria andEnrollCourseidLessThanOrEqualTo(Long value) {
            addCriterion("enroll_courseId <=", value, "enrollCourseid");
            return (Criteria) this;
        }

        public Criteria andEnrollCourseidIn(List<Long> values) {
            addCriterion("enroll_courseId in", values, "enrollCourseid");
            return (Criteria) this;
        }

        public Criteria andEnrollCourseidNotIn(List<Long> values) {
            addCriterion("enroll_courseId not in", values, "enrollCourseid");
            return (Criteria) this;
        }

        public Criteria andEnrollCourseidBetween(Long value1, Long value2) {
            addCriterion("enroll_courseId between", value1, value2, "enrollCourseid");
            return (Criteria) this;
        }

        public Criteria andEnrollCourseidNotBetween(Long value1, Long value2) {
            addCriterion("enroll_courseId not between", value1, value2, "enrollCourseid");
            return (Criteria) this;
        }

        public Criteria andEnrollUseridIsNull() {
            addCriterion("enroll_userId is null");
            return (Criteria) this;
        }

        public Criteria andEnrollUseridIsNotNull() {
            addCriterion("enroll_userId is not null");
            return (Criteria) this;
        }

        public Criteria andEnrollUseridEqualTo(Long value) {
            addCriterion("enroll_userId =", value, "enrollUserid");
            return (Criteria) this;
        }

        public Criteria andEnrollUseridNotEqualTo(Long value) {
            addCriterion("enroll_userId <>", value, "enrollUserid");
            return (Criteria) this;
        }

        public Criteria andEnrollUseridGreaterThan(Long value) {
            addCriterion("enroll_userId >", value, "enrollUserid");
            return (Criteria) this;
        }

        public Criteria andEnrollUseridGreaterThanOrEqualTo(Long value) {
            addCriterion("enroll_userId >=", value, "enrollUserid");
            return (Criteria) this;
        }

        public Criteria andEnrollUseridLessThan(Long value) {
            addCriterion("enroll_userId <", value, "enrollUserid");
            return (Criteria) this;
        }

        public Criteria andEnrollUseridLessThanOrEqualTo(Long value) {
            addCriterion("enroll_userId <=", value, "enrollUserid");
            return (Criteria) this;
        }

        public Criteria andEnrollUseridIn(List<Long> values) {
            addCriterion("enroll_userId in", values, "enrollUserid");
            return (Criteria) this;
        }

        public Criteria andEnrollUseridNotIn(List<Long> values) {
            addCriterion("enroll_userId not in", values, "enrollUserid");
            return (Criteria) this;
        }

        public Criteria andEnrollUseridBetween(Long value1, Long value2) {
            addCriterion("enroll_userId between", value1, value2, "enrollUserid");
            return (Criteria) this;
        }

        public Criteria andEnrollUseridNotBetween(Long value1, Long value2) {
            addCriterion("enroll_userId not between", value1, value2, "enrollUserid");
            return (Criteria) this;
        }

        public Criteria andEnrollQuestionIsNull() {
            addCriterion("enroll_question is null");
            return (Criteria) this;
        }

        public Criteria andEnrollQuestionIsNotNull() {
            addCriterion("enroll_question is not null");
            return (Criteria) this;
        }

        public Criteria andEnrollQuestionEqualTo(String value) {
            addCriterion("enroll_question =", value, "enrollQuestion");
            return (Criteria) this;
        }

        public Criteria andEnrollQuestionNotEqualTo(String value) {
            addCriterion("enroll_question <>", value, "enrollQuestion");
            return (Criteria) this;
        }

        public Criteria andEnrollQuestionGreaterThan(String value) {
            addCriterion("enroll_question >", value, "enrollQuestion");
            return (Criteria) this;
        }

        public Criteria andEnrollQuestionGreaterThanOrEqualTo(String value) {
            addCriterion("enroll_question >=", value, "enrollQuestion");
            return (Criteria) this;
        }

        public Criteria andEnrollQuestionLessThan(String value) {
            addCriterion("enroll_question <", value, "enrollQuestion");
            return (Criteria) this;
        }

        public Criteria andEnrollQuestionLessThanOrEqualTo(String value) {
            addCriterion("enroll_question <=", value, "enrollQuestion");
            return (Criteria) this;
        }

        public Criteria andEnrollQuestionLike(String value) {
            addCriterion("enroll_question like", value, "enrollQuestion");
            return (Criteria) this;
        }

        public Criteria andEnrollQuestionNotLike(String value) {
            addCriterion("enroll_question not like", value, "enrollQuestion");
            return (Criteria) this;
        }

        public Criteria andEnrollQuestionIn(List<String> values) {
            addCriterion("enroll_question in", values, "enrollQuestion");
            return (Criteria) this;
        }

        public Criteria andEnrollQuestionNotIn(List<String> values) {
            addCriterion("enroll_question not in", values, "enrollQuestion");
            return (Criteria) this;
        }

        public Criteria andEnrollQuestionBetween(String value1, String value2) {
            addCriterion("enroll_question between", value1, value2, "enrollQuestion");
            return (Criteria) this;
        }

        public Criteria andEnrollQuestionNotBetween(String value1, String value2) {
            addCriterion("enroll_question not between", value1, value2, "enrollQuestion");
            return (Criteria) this;
        }

        public Criteria andEnrollPhoneIsNull() {
            addCriterion("enroll_phone is null");
            return (Criteria) this;
        }

        public Criteria andEnrollPhoneIsNotNull() {
            addCriterion("enroll_phone is not null");
            return (Criteria) this;
        }

        public Criteria andEnrollPhoneEqualTo(String value) {
            addCriterion("enroll_phone =", value, "enrollPhone");
            return (Criteria) this;
        }

        public Criteria andEnrollPhoneNotEqualTo(String value) {
            addCriterion("enroll_phone <>", value, "enrollPhone");
            return (Criteria) this;
        }

        public Criteria andEnrollPhoneGreaterThan(String value) {
            addCriterion("enroll_phone >", value, "enrollPhone");
            return (Criteria) this;
        }

        public Criteria andEnrollPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("enroll_phone >=", value, "enrollPhone");
            return (Criteria) this;
        }

        public Criteria andEnrollPhoneLessThan(String value) {
            addCriterion("enroll_phone <", value, "enrollPhone");
            return (Criteria) this;
        }

        public Criteria andEnrollPhoneLessThanOrEqualTo(String value) {
            addCriterion("enroll_phone <=", value, "enrollPhone");
            return (Criteria) this;
        }

        public Criteria andEnrollPhoneLike(String value) {
            addCriterion("enroll_phone like", value, "enrollPhone");
            return (Criteria) this;
        }

        public Criteria andEnrollPhoneNotLike(String value) {
            addCriterion("enroll_phone not like", value, "enrollPhone");
            return (Criteria) this;
        }

        public Criteria andEnrollPhoneIn(List<String> values) {
            addCriterion("enroll_phone in", values, "enrollPhone");
            return (Criteria) this;
        }

        public Criteria andEnrollPhoneNotIn(List<String> values) {
            addCriterion("enroll_phone not in", values, "enrollPhone");
            return (Criteria) this;
        }

        public Criteria andEnrollPhoneBetween(String value1, String value2) {
            addCriterion("enroll_phone between", value1, value2, "enrollPhone");
            return (Criteria) this;
        }

        public Criteria andEnrollPhoneNotBetween(String value1, String value2) {
            addCriterion("enroll_phone not between", value1, value2, "enrollPhone");
            return (Criteria) this;
        }

        public Criteria andEnrollNameIsNull() {
            addCriterion("enroll_name is null");
            return (Criteria) this;
        }

        public Criteria andEnrollNameIsNotNull() {
            addCriterion("enroll_name is not null");
            return (Criteria) this;
        }

        public Criteria andEnrollNameEqualTo(String value) {
            addCriterion("enroll_name =", value, "enrollName");
            return (Criteria) this;
        }

        public Criteria andEnrollNameNotEqualTo(String value) {
            addCriterion("enroll_name <>", value, "enrollName");
            return (Criteria) this;
        }

        public Criteria andEnrollNameGreaterThan(String value) {
            addCriterion("enroll_name >", value, "enrollName");
            return (Criteria) this;
        }

        public Criteria andEnrollNameGreaterThanOrEqualTo(String value) {
            addCriterion("enroll_name >=", value, "enrollName");
            return (Criteria) this;
        }

        public Criteria andEnrollNameLessThan(String value) {
            addCriterion("enroll_name <", value, "enrollName");
            return (Criteria) this;
        }

        public Criteria andEnrollNameLessThanOrEqualTo(String value) {
            addCriterion("enroll_name <=", value, "enrollName");
            return (Criteria) this;
        }

        public Criteria andEnrollNameLike(String value) {
            addCriterion("enroll_name like", value, "enrollName");
            return (Criteria) this;
        }

        public Criteria andEnrollNameNotLike(String value) {
            addCriterion("enroll_name not like", value, "enrollName");
            return (Criteria) this;
        }

        public Criteria andEnrollNameIn(List<String> values) {
            addCriterion("enroll_name in", values, "enrollName");
            return (Criteria) this;
        }

        public Criteria andEnrollNameNotIn(List<String> values) {
            addCriterion("enroll_name not in", values, "enrollName");
            return (Criteria) this;
        }

        public Criteria andEnrollNameBetween(String value1, String value2) {
            addCriterion("enroll_name between", value1, value2, "enrollName");
            return (Criteria) this;
        }

        public Criteria andEnrollNameNotBetween(String value1, String value2) {
            addCriterion("enroll_name not between", value1, value2, "enrollName");
            return (Criteria) this;
        }

        public Criteria andEnrollCompanyIsNull() {
            addCriterion("enroll_company is null");
            return (Criteria) this;
        }

        public Criteria andEnrollCompanyIsNotNull() {
            addCriterion("enroll_company is not null");
            return (Criteria) this;
        }

        public Criteria andEnrollCompanyEqualTo(String value) {
            addCriterion("enroll_company =", value, "enrollCompany");
            return (Criteria) this;
        }

        public Criteria andEnrollCompanyNotEqualTo(String value) {
            addCriterion("enroll_company <>", value, "enrollCompany");
            return (Criteria) this;
        }

        public Criteria andEnrollCompanyGreaterThan(String value) {
            addCriterion("enroll_company >", value, "enrollCompany");
            return (Criteria) this;
        }

        public Criteria andEnrollCompanyGreaterThanOrEqualTo(String value) {
            addCriterion("enroll_company >=", value, "enrollCompany");
            return (Criteria) this;
        }

        public Criteria andEnrollCompanyLessThan(String value) {
            addCriterion("enroll_company <", value, "enrollCompany");
            return (Criteria) this;
        }

        public Criteria andEnrollCompanyLessThanOrEqualTo(String value) {
            addCriterion("enroll_company <=", value, "enrollCompany");
            return (Criteria) this;
        }

        public Criteria andEnrollCompanyLike(String value) {
            addCriterion("enroll_company like", value, "enrollCompany");
            return (Criteria) this;
        }

        public Criteria andEnrollCompanyNotLike(String value) {
            addCriterion("enroll_company not like", value, "enrollCompany");
            return (Criteria) this;
        }

        public Criteria andEnrollCompanyIn(List<String> values) {
            addCriterion("enroll_company in", values, "enrollCompany");
            return (Criteria) this;
        }

        public Criteria andEnrollCompanyNotIn(List<String> values) {
            addCriterion("enroll_company not in", values, "enrollCompany");
            return (Criteria) this;
        }

        public Criteria andEnrollCompanyBetween(String value1, String value2) {
            addCriterion("enroll_company between", value1, value2, "enrollCompany");
            return (Criteria) this;
        }

        public Criteria andEnrollCompanyNotBetween(String value1, String value2) {
            addCriterion("enroll_company not between", value1, value2, "enrollCompany");
            return (Criteria) this;
        }

        public Criteria andEnrollPositionIsNull() {
            addCriterion("enroll_position is null");
            return (Criteria) this;
        }

        public Criteria andEnrollPositionIsNotNull() {
            addCriterion("enroll_position is not null");
            return (Criteria) this;
        }

        public Criteria andEnrollPositionEqualTo(String value) {
            addCriterion("enroll_position =", value, "enrollPosition");
            return (Criteria) this;
        }

        public Criteria andEnrollPositionNotEqualTo(String value) {
            addCriterion("enroll_position <>", value, "enrollPosition");
            return (Criteria) this;
        }

        public Criteria andEnrollPositionGreaterThan(String value) {
            addCriterion("enroll_position >", value, "enrollPosition");
            return (Criteria) this;
        }

        public Criteria andEnrollPositionGreaterThanOrEqualTo(String value) {
            addCriterion("enroll_position >=", value, "enrollPosition");
            return (Criteria) this;
        }

        public Criteria andEnrollPositionLessThan(String value) {
            addCriterion("enroll_position <", value, "enrollPosition");
            return (Criteria) this;
        }

        public Criteria andEnrollPositionLessThanOrEqualTo(String value) {
            addCriterion("enroll_position <=", value, "enrollPosition");
            return (Criteria) this;
        }

        public Criteria andEnrollPositionLike(String value) {
            addCriterion("enroll_position like", value, "enrollPosition");
            return (Criteria) this;
        }

        public Criteria andEnrollPositionNotLike(String value) {
            addCriterion("enroll_position not like", value, "enrollPosition");
            return (Criteria) this;
        }

        public Criteria andEnrollPositionIn(List<String> values) {
            addCriterion("enroll_position in", values, "enrollPosition");
            return (Criteria) this;
        }

        public Criteria andEnrollPositionNotIn(List<String> values) {
            addCriterion("enroll_position not in", values, "enrollPosition");
            return (Criteria) this;
        }

        public Criteria andEnrollPositionBetween(String value1, String value2) {
            addCriterion("enroll_position between", value1, value2, "enrollPosition");
            return (Criteria) this;
        }

        public Criteria andEnrollPositionNotBetween(String value1, String value2) {
            addCriterion("enroll_position not between", value1, value2, "enrollPosition");
            return (Criteria) this;
        }

        public Criteria andEnrollEmailIsNull() {
            addCriterion("enroll_email is null");
            return (Criteria) this;
        }

        public Criteria andEnrollEmailIsNotNull() {
            addCriterion("enroll_email is not null");
            return (Criteria) this;
        }

        public Criteria andEnrollEmailEqualTo(String value) {
            addCriterion("enroll_email =", value, "enrollEmail");
            return (Criteria) this;
        }

        public Criteria andEnrollEmailNotEqualTo(String value) {
            addCriterion("enroll_email <>", value, "enrollEmail");
            return (Criteria) this;
        }

        public Criteria andEnrollEmailGreaterThan(String value) {
            addCriterion("enroll_email >", value, "enrollEmail");
            return (Criteria) this;
        }

        public Criteria andEnrollEmailGreaterThanOrEqualTo(String value) {
            addCriterion("enroll_email >=", value, "enrollEmail");
            return (Criteria) this;
        }

        public Criteria andEnrollEmailLessThan(String value) {
            addCriterion("enroll_email <", value, "enrollEmail");
            return (Criteria) this;
        }

        public Criteria andEnrollEmailLessThanOrEqualTo(String value) {
            addCriterion("enroll_email <=", value, "enrollEmail");
            return (Criteria) this;
        }

        public Criteria andEnrollEmailLike(String value) {
            addCriterion("enroll_email like", value, "enrollEmail");
            return (Criteria) this;
        }

        public Criteria andEnrollEmailNotLike(String value) {
            addCriterion("enroll_email not like", value, "enrollEmail");
            return (Criteria) this;
        }

        public Criteria andEnrollEmailIn(List<String> values) {
            addCriterion("enroll_email in", values, "enrollEmail");
            return (Criteria) this;
        }

        public Criteria andEnrollEmailNotIn(List<String> values) {
            addCriterion("enroll_email not in", values, "enrollEmail");
            return (Criteria) this;
        }

        public Criteria andEnrollEmailBetween(String value1, String value2) {
            addCriterion("enroll_email between", value1, value2, "enrollEmail");
            return (Criteria) this;
        }

        public Criteria andEnrollEmailNotBetween(String value1, String value2) {
            addCriterion("enroll_email not between", value1, value2, "enrollEmail");
            return (Criteria) this;
        }

        public Criteria andEnrollMoneyIsNull() {
            addCriterion("enroll_money is null");
            return (Criteria) this;
        }

        public Criteria andEnrollMoneyIsNotNull() {
            addCriterion("enroll_money is not null");
            return (Criteria) this;
        }

        public Criteria andEnrollMoneyEqualTo(Double value) {
            addCriterion("enroll_money =", value, "enrollMoney");
            return (Criteria) this;
        }

        public Criteria andEnrollMoneyNotEqualTo(Double value) {
            addCriterion("enroll_money <>", value, "enrollMoney");
            return (Criteria) this;
        }

        public Criteria andEnrollMoneyGreaterThan(Double value) {
            addCriterion("enroll_money >", value, "enrollMoney");
            return (Criteria) this;
        }

        public Criteria andEnrollMoneyGreaterThanOrEqualTo(Double value) {
            addCriterion("enroll_money >=", value, "enrollMoney");
            return (Criteria) this;
        }

        public Criteria andEnrollMoneyLessThan(Double value) {
            addCriterion("enroll_money <", value, "enrollMoney");
            return (Criteria) this;
        }

        public Criteria andEnrollMoneyLessThanOrEqualTo(Double value) {
            addCriterion("enroll_money <=", value, "enrollMoney");
            return (Criteria) this;
        }

        public Criteria andEnrollMoneyIn(List<Double> values) {
            addCriterion("enroll_money in", values, "enrollMoney");
            return (Criteria) this;
        }

        public Criteria andEnrollMoneyNotIn(List<Double> values) {
            addCriterion("enroll_money not in", values, "enrollMoney");
            return (Criteria) this;
        }

        public Criteria andEnrollMoneyBetween(Double value1, Double value2) {
            addCriterion("enroll_money between", value1, value2, "enrollMoney");
            return (Criteria) this;
        }

        public Criteria andEnrollMoneyNotBetween(Double value1, Double value2) {
            addCriterion("enroll_money not between", value1, value2, "enrollMoney");
            return (Criteria) this;
        }

        public Criteria andEnrollPayStateIsNull() {
            addCriterion("enroll_pay_state is null");
            return (Criteria) this;
        }

        public Criteria andEnrollPayStateIsNotNull() {
            addCriterion("enroll_pay_state is not null");
            return (Criteria) this;
        }

        public Criteria andEnrollPayStateEqualTo(Boolean value) {
            addCriterion("enroll_pay_state =", value, "enrollPayState");
            return (Criteria) this;
        }

        public Criteria andEnrollPayStateNotEqualTo(Boolean value) {
            addCriterion("enroll_pay_state <>", value, "enrollPayState");
            return (Criteria) this;
        }

        public Criteria andEnrollPayStateGreaterThan(Boolean value) {
            addCriterion("enroll_pay_state >", value, "enrollPayState");
            return (Criteria) this;
        }

        public Criteria andEnrollPayStateGreaterThanOrEqualTo(Boolean value) {
            addCriterion("enroll_pay_state >=", value, "enrollPayState");
            return (Criteria) this;
        }

        public Criteria andEnrollPayStateLessThan(Boolean value) {
            addCriterion("enroll_pay_state <", value, "enrollPayState");
            return (Criteria) this;
        }

        public Criteria andEnrollPayStateLessThanOrEqualTo(Boolean value) {
            addCriterion("enroll_pay_state <=", value, "enrollPayState");
            return (Criteria) this;
        }

        public Criteria andEnrollPayStateIn(List<Boolean> values) {
            addCriterion("enroll_pay_state in", values, "enrollPayState");
            return (Criteria) this;
        }

        public Criteria andEnrollPayStateNotIn(List<Boolean> values) {
            addCriterion("enroll_pay_state not in", values, "enrollPayState");
            return (Criteria) this;
        }

        public Criteria andEnrollPayStateBetween(Boolean value1, Boolean value2) {
            addCriterion("enroll_pay_state between", value1, value2, "enrollPayState");
            return (Criteria) this;
        }

        public Criteria andEnrollPayStateNotBetween(Boolean value1, Boolean value2) {
            addCriterion("enroll_pay_state not between", value1, value2, "enrollPayState");
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
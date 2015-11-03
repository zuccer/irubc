package org.zucc.web.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class ICourseExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer limitStart;

    protected Integer limitEnd;

    public ICourseExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andCCidIsNull() {
            addCriterion("c_cid is null");
            return (Criteria) this;
        }

        public Criteria andCCidIsNotNull() {
            addCriterion("c_cid is not null");
            return (Criteria) this;
        }

        public Criteria andCCidEqualTo(Long value) {
            addCriterion("c_cid =", value, "cCid");
            return (Criteria) this;
        }

        public Criteria andCCidNotEqualTo(Long value) {
            addCriterion("c_cid <>", value, "cCid");
            return (Criteria) this;
        }

        public Criteria andCCidGreaterThan(Long value) {
            addCriterion("c_cid >", value, "cCid");
            return (Criteria) this;
        }

        public Criteria andCCidGreaterThanOrEqualTo(Long value) {
            addCriterion("c_cid >=", value, "cCid");
            return (Criteria) this;
        }

        public Criteria andCCidLessThan(Long value) {
            addCriterion("c_cid <", value, "cCid");
            return (Criteria) this;
        }

        public Criteria andCCidLessThanOrEqualTo(Long value) {
            addCriterion("c_cid <=", value, "cCid");
            return (Criteria) this;
        }

        public Criteria andCCidIn(List<Long> values) {
            addCriterion("c_cid in", values, "cCid");
            return (Criteria) this;
        }

        public Criteria andCCidNotIn(List<Long> values) {
            addCriterion("c_cid not in", values, "cCid");
            return (Criteria) this;
        }

        public Criteria andCCidBetween(Long value1, Long value2) {
            addCriterion("c_cid between", value1, value2, "cCid");
            return (Criteria) this;
        }

        public Criteria andCCidNotBetween(Long value1, Long value2) {
            addCriterion("c_cid not between", value1, value2, "cCid");
            return (Criteria) this;
        }

        public Criteria andCCnameIsNull() {
            addCriterion("c_cname is null");
            return (Criteria) this;
        }

        public Criteria andCCnameIsNotNull() {
            addCriterion("c_cname is not null");
            return (Criteria) this;
        }

        public Criteria andCCnameEqualTo(String value) {
            addCriterion("c_cname =", value, "cCname");
            return (Criteria) this;
        }

        public Criteria andCCnameNotEqualTo(String value) {
            addCriterion("c_cname <>", value, "cCname");
            return (Criteria) this;
        }

        public Criteria andCCnameGreaterThan(String value) {
            addCriterion("c_cname >", value, "cCname");
            return (Criteria) this;
        }

        public Criteria andCCnameGreaterThanOrEqualTo(String value) {
            addCriterion("c_cname >=", value, "cCname");
            return (Criteria) this;
        }

        public Criteria andCCnameLessThan(String value) {
            addCriterion("c_cname <", value, "cCname");
            return (Criteria) this;
        }

        public Criteria andCCnameLessThanOrEqualTo(String value) {
            addCriterion("c_cname <=", value, "cCname");
            return (Criteria) this;
        }

        public Criteria andCCnameLike(String value) {
            addCriterion("c_cname like", value, "cCname");
            return (Criteria) this;
        }

        public Criteria andCCnameNotLike(String value) {
            addCriterion("c_cname not like", value, "cCname");
            return (Criteria) this;
        }

        public Criteria andCCnameIn(List<String> values) {
            addCriterion("c_cname in", values, "cCname");
            return (Criteria) this;
        }

        public Criteria andCCnameNotIn(List<String> values) {
            addCriterion("c_cname not in", values, "cCname");
            return (Criteria) this;
        }

        public Criteria andCCnameBetween(String value1, String value2) {
            addCriterion("c_cname between", value1, value2, "cCname");
            return (Criteria) this;
        }

        public Criteria andCCnameNotBetween(String value1, String value2) {
            addCriterion("c_cname not between", value1, value2, "cCname");
            return (Criteria) this;
        }

        public Criteria andCPriceIsNull() {
            addCriterion("c_price is null");
            return (Criteria) this;
        }

        public Criteria andCPriceIsNotNull() {
            addCriterion("c_price is not null");
            return (Criteria) this;
        }

        public Criteria andCPriceEqualTo(Double value) {
            addCriterion("c_price =", value, "cPrice");
            return (Criteria) this;
        }

        public Criteria andCPriceNotEqualTo(Double value) {
            addCriterion("c_price <>", value, "cPrice");
            return (Criteria) this;
        }

        public Criteria andCPriceGreaterThan(Double value) {
            addCriterion("c_price >", value, "cPrice");
            return (Criteria) this;
        }

        public Criteria andCPriceGreaterThanOrEqualTo(Double value) {
            addCriterion("c_price >=", value, "cPrice");
            return (Criteria) this;
        }

        public Criteria andCPriceLessThan(Double value) {
            addCriterion("c_price <", value, "cPrice");
            return (Criteria) this;
        }

        public Criteria andCPriceLessThanOrEqualTo(Double value) {
            addCriterion("c_price <=", value, "cPrice");
            return (Criteria) this;
        }

        public Criteria andCPriceIn(List<Double> values) {
            addCriterion("c_price in", values, "cPrice");
            return (Criteria) this;
        }

        public Criteria andCPriceNotIn(List<Double> values) {
            addCriterion("c_price not in", values, "cPrice");
            return (Criteria) this;
        }

        public Criteria andCPriceBetween(Double value1, Double value2) {
            addCriterion("c_price between", value1, value2, "cPrice");
            return (Criteria) this;
        }

        public Criteria andCPriceNotBetween(Double value1, Double value2) {
            addCriterion("c_price not between", value1, value2, "cPrice");
            return (Criteria) this;
        }

        public Criteria andCAddressIsNull() {
            addCriterion("c_address is null");
            return (Criteria) this;
        }

        public Criteria andCAddressIsNotNull() {
            addCriterion("c_address is not null");
            return (Criteria) this;
        }

        public Criteria andCAddressEqualTo(String value) {
            addCriterion("c_address =", value, "cAddress");
            return (Criteria) this;
        }

        public Criteria andCAddressNotEqualTo(String value) {
            addCriterion("c_address <>", value, "cAddress");
            return (Criteria) this;
        }

        public Criteria andCAddressGreaterThan(String value) {
            addCriterion("c_address >", value, "cAddress");
            return (Criteria) this;
        }

        public Criteria andCAddressGreaterThanOrEqualTo(String value) {
            addCriterion("c_address >=", value, "cAddress");
            return (Criteria) this;
        }

        public Criteria andCAddressLessThan(String value) {
            addCriterion("c_address <", value, "cAddress");
            return (Criteria) this;
        }

        public Criteria andCAddressLessThanOrEqualTo(String value) {
            addCriterion("c_address <=", value, "cAddress");
            return (Criteria) this;
        }

        public Criteria andCAddressLike(String value) {
            addCriterion("c_address like", value, "cAddress");
            return (Criteria) this;
        }

        public Criteria andCAddressNotLike(String value) {
            addCriterion("c_address not like", value, "cAddress");
            return (Criteria) this;
        }

        public Criteria andCAddressIn(List<String> values) {
            addCriterion("c_address in", values, "cAddress");
            return (Criteria) this;
        }

        public Criteria andCAddressNotIn(List<String> values) {
            addCriterion("c_address not in", values, "cAddress");
            return (Criteria) this;
        }

        public Criteria andCAddressBetween(String value1, String value2) {
            addCriterion("c_address between", value1, value2, "cAddress");
            return (Criteria) this;
        }

        public Criteria andCAddressNotBetween(String value1, String value2) {
            addCriterion("c_address not between", value1, value2, "cAddress");
            return (Criteria) this;
        }

        public Criteria andCCollectionIsNull() {
            addCriterion("c_collection is null");
            return (Criteria) this;
        }

        public Criteria andCCollectionIsNotNull() {
            addCriterion("c_collection is not null");
            return (Criteria) this;
        }

        public Criteria andCCollectionEqualTo(Integer value) {
            addCriterion("c_collection =", value, "cCollection");
            return (Criteria) this;
        }

        public Criteria andCCollectionNotEqualTo(Integer value) {
            addCriterion("c_collection <>", value, "cCollection");
            return (Criteria) this;
        }

        public Criteria andCCollectionGreaterThan(Integer value) {
            addCriterion("c_collection >", value, "cCollection");
            return (Criteria) this;
        }

        public Criteria andCCollectionGreaterThanOrEqualTo(Integer value) {
            addCriterion("c_collection >=", value, "cCollection");
            return (Criteria) this;
        }

        public Criteria andCCollectionLessThan(Integer value) {
            addCriterion("c_collection <", value, "cCollection");
            return (Criteria) this;
        }

        public Criteria andCCollectionLessThanOrEqualTo(Integer value) {
            addCriterion("c_collection <=", value, "cCollection");
            return (Criteria) this;
        }

        public Criteria andCCollectionIn(List<Integer> values) {
            addCriterion("c_collection in", values, "cCollection");
            return (Criteria) this;
        }

        public Criteria andCCollectionNotIn(List<Integer> values) {
            addCriterion("c_collection not in", values, "cCollection");
            return (Criteria) this;
        }

        public Criteria andCCollectionBetween(Integer value1, Integer value2) {
            addCriterion("c_collection between", value1, value2, "cCollection");
            return (Criteria) this;
        }

        public Criteria andCCollectionNotBetween(Integer value1, Integer value2) {
            addCriterion("c_collection not between", value1, value2, "cCollection");
            return (Criteria) this;
        }

        public Criteria andCTeacheridIsNull() {
            addCriterion("c_teacherId is null");
            return (Criteria) this;
        }

        public Criteria andCTeacheridIsNotNull() {
            addCriterion("c_teacherId is not null");
            return (Criteria) this;
        }

        public Criteria andCTeacheridEqualTo(Long value) {
            addCriterion("c_teacherId =", value, "cTeacherid");
            return (Criteria) this;
        }

        public Criteria andCTeacheridNotEqualTo(Long value) {
            addCriterion("c_teacherId <>", value, "cTeacherid");
            return (Criteria) this;
        }

        public Criteria andCTeacheridGreaterThan(Long value) {
            addCriterion("c_teacherId >", value, "cTeacherid");
            return (Criteria) this;
        }

        public Criteria andCTeacheridGreaterThanOrEqualTo(Long value) {
            addCriterion("c_teacherId >=", value, "cTeacherid");
            return (Criteria) this;
        }

        public Criteria andCTeacheridLessThan(Long value) {
            addCriterion("c_teacherId <", value, "cTeacherid");
            return (Criteria) this;
        }

        public Criteria andCTeacheridLessThanOrEqualTo(Long value) {
            addCriterion("c_teacherId <=", value, "cTeacherid");
            return (Criteria) this;
        }

        public Criteria andCTeacheridIn(List<Long> values) {
            addCriterion("c_teacherId in", values, "cTeacherid");
            return (Criteria) this;
        }

        public Criteria andCTeacheridNotIn(List<Long> values) {
            addCriterion("c_teacherId not in", values, "cTeacherid");
            return (Criteria) this;
        }

        public Criteria andCTeacheridBetween(Long value1, Long value2) {
            addCriterion("c_teacherId between", value1, value2, "cTeacherid");
            return (Criteria) this;
        }

        public Criteria andCTeacheridNotBetween(Long value1, Long value2) {
            addCriterion("c_teacherId not between", value1, value2, "cTeacherid");
            return (Criteria) this;
        }

        public Criteria andCDescriptionIsNull() {
            addCriterion("c_description is null");
            return (Criteria) this;
        }

        public Criteria andCDescriptionIsNotNull() {
            addCriterion("c_description is not null");
            return (Criteria) this;
        }

        public Criteria andCDescriptionEqualTo(String value) {
            addCriterion("c_description =", value, "cDescription");
            return (Criteria) this;
        }

        public Criteria andCDescriptionNotEqualTo(String value) {
            addCriterion("c_description <>", value, "cDescription");
            return (Criteria) this;
        }

        public Criteria andCDescriptionGreaterThan(String value) {
            addCriterion("c_description >", value, "cDescription");
            return (Criteria) this;
        }

        public Criteria andCDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("c_description >=", value, "cDescription");
            return (Criteria) this;
        }

        public Criteria andCDescriptionLessThan(String value) {
            addCriterion("c_description <", value, "cDescription");
            return (Criteria) this;
        }

        public Criteria andCDescriptionLessThanOrEqualTo(String value) {
            addCriterion("c_description <=", value, "cDescription");
            return (Criteria) this;
        }

        public Criteria andCDescriptionLike(String value) {
            addCriterion("c_description like", value, "cDescription");
            return (Criteria) this;
        }

        public Criteria andCDescriptionNotLike(String value) {
            addCriterion("c_description not like", value, "cDescription");
            return (Criteria) this;
        }

        public Criteria andCDescriptionIn(List<String> values) {
            addCriterion("c_description in", values, "cDescription");
            return (Criteria) this;
        }

        public Criteria andCDescriptionNotIn(List<String> values) {
            addCriterion("c_description not in", values, "cDescription");
            return (Criteria) this;
        }

        public Criteria andCDescriptionBetween(String value1, String value2) {
            addCriterion("c_description between", value1, value2, "cDescription");
            return (Criteria) this;
        }

        public Criteria andCDescriptionNotBetween(String value1, String value2) {
            addCriterion("c_description not between", value1, value2, "cDescription");
            return (Criteria) this;
        }

        public Criteria andCSimpleDescriptionIsNull() {
            addCriterion("c_simple_description is null");
            return (Criteria) this;
        }

        public Criteria andCSimpleDescriptionIsNotNull() {
            addCriterion("c_simple_description is not null");
            return (Criteria) this;
        }

        public Criteria andCSimpleDescriptionEqualTo(String value) {
            addCriterion("c_simple_description =", value, "cSimpleDescription");
            return (Criteria) this;
        }

        public Criteria andCSimpleDescriptionNotEqualTo(String value) {
            addCriterion("c_simple_description <>", value, "cSimpleDescription");
            return (Criteria) this;
        }

        public Criteria andCSimpleDescriptionGreaterThan(String value) {
            addCriterion("c_simple_description >", value, "cSimpleDescription");
            return (Criteria) this;
        }

        public Criteria andCSimpleDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("c_simple_description >=", value, "cSimpleDescription");
            return (Criteria) this;
        }

        public Criteria andCSimpleDescriptionLessThan(String value) {
            addCriterion("c_simple_description <", value, "cSimpleDescription");
            return (Criteria) this;
        }

        public Criteria andCSimpleDescriptionLessThanOrEqualTo(String value) {
            addCriterion("c_simple_description <=", value, "cSimpleDescription");
            return (Criteria) this;
        }

        public Criteria andCSimpleDescriptionLike(String value) {
            addCriterion("c_simple_description like", value, "cSimpleDescription");
            return (Criteria) this;
        }

        public Criteria andCSimpleDescriptionNotLike(String value) {
            addCriterion("c_simple_description not like", value, "cSimpleDescription");
            return (Criteria) this;
        }

        public Criteria andCSimpleDescriptionIn(List<String> values) {
            addCriterion("c_simple_description in", values, "cSimpleDescription");
            return (Criteria) this;
        }

        public Criteria andCSimpleDescriptionNotIn(List<String> values) {
            addCriterion("c_simple_description not in", values, "cSimpleDescription");
            return (Criteria) this;
        }

        public Criteria andCSimpleDescriptionBetween(String value1, String value2) {
            addCriterion("c_simple_description between", value1, value2, "cSimpleDescription");
            return (Criteria) this;
        }

        public Criteria andCSimpleDescriptionNotBetween(String value1, String value2) {
            addCriterion("c_simple_description not between", value1, value2, "cSimpleDescription");
            return (Criteria) this;
        }

        public Criteria andCCourseminnumIsNull() {
            addCriterion("c_courseMinNum is null");
            return (Criteria) this;
        }

        public Criteria andCCourseminnumIsNotNull() {
            addCriterion("c_courseMinNum is not null");
            return (Criteria) this;
        }

        public Criteria andCCourseminnumEqualTo(Integer value) {
            addCriterion("c_courseMinNum =", value, "cCourseminnum");
            return (Criteria) this;
        }

        public Criteria andCCourseminnumNotEqualTo(Integer value) {
            addCriterion("c_courseMinNum <>", value, "cCourseminnum");
            return (Criteria) this;
        }

        public Criteria andCCourseminnumGreaterThan(Integer value) {
            addCriterion("c_courseMinNum >", value, "cCourseminnum");
            return (Criteria) this;
        }

        public Criteria andCCourseminnumGreaterThanOrEqualTo(Integer value) {
            addCriterion("c_courseMinNum >=", value, "cCourseminnum");
            return (Criteria) this;
        }

        public Criteria andCCourseminnumLessThan(Integer value) {
            addCriterion("c_courseMinNum <", value, "cCourseminnum");
            return (Criteria) this;
        }

        public Criteria andCCourseminnumLessThanOrEqualTo(Integer value) {
            addCriterion("c_courseMinNum <=", value, "cCourseminnum");
            return (Criteria) this;
        }

        public Criteria andCCourseminnumIn(List<Integer> values) {
            addCriterion("c_courseMinNum in", values, "cCourseminnum");
            return (Criteria) this;
        }

        public Criteria andCCourseminnumNotIn(List<Integer> values) {
            addCriterion("c_courseMinNum not in", values, "cCourseminnum");
            return (Criteria) this;
        }

        public Criteria andCCourseminnumBetween(Integer value1, Integer value2) {
            addCriterion("c_courseMinNum between", value1, value2, "cCourseminnum");
            return (Criteria) this;
        }

        public Criteria andCCourseminnumNotBetween(Integer value1, Integer value2) {
            addCriterion("c_courseMinNum not between", value1, value2, "cCourseminnum");
            return (Criteria) this;
        }

        public Criteria andCCoursemaxnumIsNull() {
            addCriterion("c_courseMaxNum is null");
            return (Criteria) this;
        }

        public Criteria andCCoursemaxnumIsNotNull() {
            addCriterion("c_courseMaxNum is not null");
            return (Criteria) this;
        }

        public Criteria andCCoursemaxnumEqualTo(Integer value) {
            addCriterion("c_courseMaxNum =", value, "cCoursemaxnum");
            return (Criteria) this;
        }

        public Criteria andCCoursemaxnumNotEqualTo(Integer value) {
            addCriterion("c_courseMaxNum <>", value, "cCoursemaxnum");
            return (Criteria) this;
        }

        public Criteria andCCoursemaxnumGreaterThan(Integer value) {
            addCriterion("c_courseMaxNum >", value, "cCoursemaxnum");
            return (Criteria) this;
        }

        public Criteria andCCoursemaxnumGreaterThanOrEqualTo(Integer value) {
            addCriterion("c_courseMaxNum >=", value, "cCoursemaxnum");
            return (Criteria) this;
        }

        public Criteria andCCoursemaxnumLessThan(Integer value) {
            addCriterion("c_courseMaxNum <", value, "cCoursemaxnum");
            return (Criteria) this;
        }

        public Criteria andCCoursemaxnumLessThanOrEqualTo(Integer value) {
            addCriterion("c_courseMaxNum <=", value, "cCoursemaxnum");
            return (Criteria) this;
        }

        public Criteria andCCoursemaxnumIn(List<Integer> values) {
            addCriterion("c_courseMaxNum in", values, "cCoursemaxnum");
            return (Criteria) this;
        }

        public Criteria andCCoursemaxnumNotIn(List<Integer> values) {
            addCriterion("c_courseMaxNum not in", values, "cCoursemaxnum");
            return (Criteria) this;
        }

        public Criteria andCCoursemaxnumBetween(Integer value1, Integer value2) {
            addCriterion("c_courseMaxNum between", value1, value2, "cCoursemaxnum");
            return (Criteria) this;
        }

        public Criteria andCCoursemaxnumNotBetween(Integer value1, Integer value2) {
            addCriterion("c_courseMaxNum not between", value1, value2, "cCoursemaxnum");
            return (Criteria) this;
        }

        public Criteria andCCoursenumIsNull() {
            addCriterion("c_courseNum is null");
            return (Criteria) this;
        }

        public Criteria andCCoursenumIsNotNull() {
            addCriterion("c_courseNum is not null");
            return (Criteria) this;
        }

        public Criteria andCCoursenumEqualTo(Integer value) {
            addCriterion("c_courseNum =", value, "cCoursenum");
            return (Criteria) this;
        }

        public Criteria andCCoursenumNotEqualTo(Integer value) {
            addCriterion("c_courseNum <>", value, "cCoursenum");
            return (Criteria) this;
        }

        public Criteria andCCoursenumGreaterThan(Integer value) {
            addCriterion("c_courseNum >", value, "cCoursenum");
            return (Criteria) this;
        }

        public Criteria andCCoursenumGreaterThanOrEqualTo(Integer value) {
            addCriterion("c_courseNum >=", value, "cCoursenum");
            return (Criteria) this;
        }

        public Criteria andCCoursenumLessThan(Integer value) {
            addCriterion("c_courseNum <", value, "cCoursenum");
            return (Criteria) this;
        }

        public Criteria andCCoursenumLessThanOrEqualTo(Integer value) {
            addCriterion("c_courseNum <=", value, "cCoursenum");
            return (Criteria) this;
        }

        public Criteria andCCoursenumIn(List<Integer> values) {
            addCriterion("c_courseNum in", values, "cCoursenum");
            return (Criteria) this;
        }

        public Criteria andCCoursenumNotIn(List<Integer> values) {
            addCriterion("c_courseNum not in", values, "cCoursenum");
            return (Criteria) this;
        }

        public Criteria andCCoursenumBetween(Integer value1, Integer value2) {
            addCriterion("c_courseNum between", value1, value2, "cCoursenum");
            return (Criteria) this;
        }

        public Criteria andCCoursenumNotBetween(Integer value1, Integer value2) {
            addCriterion("c_courseNum not between", value1, value2, "cCoursenum");
            return (Criteria) this;
        }

        public Criteria andCStarttimeIsNull() {
            addCriterion("c_startTime is null");
            return (Criteria) this;
        }

        public Criteria andCStarttimeIsNotNull() {
            addCriterion("c_startTime is not null");
            return (Criteria) this;
        }

        public Criteria andCStarttimeEqualTo(Date value) {
            addCriterion("c_startTime =", value, "cStarttime");
            return (Criteria) this;
        }

        public Criteria andCStarttimeNotEqualTo(Date value) {
            addCriterion("c_startTime <>", value, "cStarttime");
            return (Criteria) this;
        }

        public Criteria andCStarttimeGreaterThan(Date value) {
            addCriterion("c_startTime >", value, "cStarttime");
            return (Criteria) this;
        }

        public Criteria andCStarttimeGreaterThanOrEqualTo(Date value) {
            addCriterion("c_startTime >=", value, "cStarttime");
            return (Criteria) this;
        }

        public Criteria andCStarttimeLessThan(Date value) {
            addCriterion("c_startTime <", value, "cStarttime");
            return (Criteria) this;
        }

        public Criteria andCStarttimeLessThanOrEqualTo(Date value) {
            addCriterion("c_startTime <=", value, "cStarttime");
            return (Criteria) this;
        }

        public Criteria andCStarttimeIn(List<Date> values) {
            addCriterion("c_startTime in", values, "cStarttime");
            return (Criteria) this;
        }

        public Criteria andCStarttimeNotIn(List<Date> values) {
            addCriterion("c_startTime not in", values, "cStarttime");
            return (Criteria) this;
        }

        public Criteria andCStarttimeBetween(Date value1, Date value2) {
            addCriterion("c_startTime between", value1, value2, "cStarttime");
            return (Criteria) this;
        }

        public Criteria andCStarttimeNotBetween(Date value1, Date value2) {
            addCriterion("c_startTime not between", value1, value2, "cStarttime");
            return (Criteria) this;
        }

        public Criteria andCEndtimeIsNull() {
            addCriterion("c_endTime is null");
            return (Criteria) this;
        }

        public Criteria andCEndtimeIsNotNull() {
            addCriterion("c_endTime is not null");
            return (Criteria) this;
        }

        public Criteria andCEndtimeEqualTo(Date value) {
            addCriterion("c_endTime =", value, "cEndtime");
            return (Criteria) this;
        }

        public Criteria andCEndtimeNotEqualTo(Date value) {
            addCriterion("c_endTime <>", value, "cEndtime");
            return (Criteria) this;
        }

        public Criteria andCEndtimeGreaterThan(Date value) {
            addCriterion("c_endTime >", value, "cEndtime");
            return (Criteria) this;
        }

        public Criteria andCEndtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("c_endTime >=", value, "cEndtime");
            return (Criteria) this;
        }

        public Criteria andCEndtimeLessThan(Date value) {
            addCriterion("c_endTime <", value, "cEndtime");
            return (Criteria) this;
        }

        public Criteria andCEndtimeLessThanOrEqualTo(Date value) {
            addCriterion("c_endTime <=", value, "cEndtime");
            return (Criteria) this;
        }

        public Criteria andCEndtimeIn(List<Date> values) {
            addCriterion("c_endTime in", values, "cEndtime");
            return (Criteria) this;
        }

        public Criteria andCEndtimeNotIn(List<Date> values) {
            addCriterion("c_endTime not in", values, "cEndtime");
            return (Criteria) this;
        }

        public Criteria andCEndtimeBetween(Date value1, Date value2) {
            addCriterion("c_endTime between", value1, value2, "cEndtime");
            return (Criteria) this;
        }

        public Criteria andCEndtimeNotBetween(Date value1, Date value2) {
            addCriterion("c_endTime not between", value1, value2, "cEndtime");
            return (Criteria) this;
        }

        public Criteria andCThumbnailIsNull() {
            addCriterion("c_thumbnail is null");
            return (Criteria) this;
        }

        public Criteria andCThumbnailIsNotNull() {
            addCriterion("c_thumbnail is not null");
            return (Criteria) this;
        }

        public Criteria andCThumbnailEqualTo(String value) {
            addCriterion("c_thumbnail =", value, "cThumbnail");
            return (Criteria) this;
        }

        public Criteria andCThumbnailNotEqualTo(String value) {
            addCriterion("c_thumbnail <>", value, "cThumbnail");
            return (Criteria) this;
        }

        public Criteria andCThumbnailGreaterThan(String value) {
            addCriterion("c_thumbnail >", value, "cThumbnail");
            return (Criteria) this;
        }

        public Criteria andCThumbnailGreaterThanOrEqualTo(String value) {
            addCriterion("c_thumbnail >=", value, "cThumbnail");
            return (Criteria) this;
        }

        public Criteria andCThumbnailLessThan(String value) {
            addCriterion("c_thumbnail <", value, "cThumbnail");
            return (Criteria) this;
        }

        public Criteria andCThumbnailLessThanOrEqualTo(String value) {
            addCriterion("c_thumbnail <=", value, "cThumbnail");
            return (Criteria) this;
        }

        public Criteria andCThumbnailLike(String value) {
            addCriterion("c_thumbnail like", value, "cThumbnail");
            return (Criteria) this;
        }

        public Criteria andCThumbnailNotLike(String value) {
            addCriterion("c_thumbnail not like", value, "cThumbnail");
            return (Criteria) this;
        }

        public Criteria andCThumbnailIn(List<String> values) {
            addCriterion("c_thumbnail in", values, "cThumbnail");
            return (Criteria) this;
        }

        public Criteria andCThumbnailNotIn(List<String> values) {
            addCriterion("c_thumbnail not in", values, "cThumbnail");
            return (Criteria) this;
        }

        public Criteria andCThumbnailBetween(String value1, String value2) {
            addCriterion("c_thumbnail between", value1, value2, "cThumbnail");
            return (Criteria) this;
        }

        public Criteria andCThumbnailNotBetween(String value1, String value2) {
            addCriterion("c_thumbnail not between", value1, value2, "cThumbnail");
            return (Criteria) this;
        }

        public Criteria andCImageoneIsNull() {
            addCriterion("c_imageOne is null");
            return (Criteria) this;
        }

        public Criteria andCImageoneIsNotNull() {
            addCriterion("c_imageOne is not null");
            return (Criteria) this;
        }

        public Criteria andCImageoneEqualTo(String value) {
            addCriterion("c_imageOne =", value, "cImageone");
            return (Criteria) this;
        }

        public Criteria andCImageoneNotEqualTo(String value) {
            addCriterion("c_imageOne <>", value, "cImageone");
            return (Criteria) this;
        }

        public Criteria andCImageoneGreaterThan(String value) {
            addCriterion("c_imageOne >", value, "cImageone");
            return (Criteria) this;
        }

        public Criteria andCImageoneGreaterThanOrEqualTo(String value) {
            addCriterion("c_imageOne >=", value, "cImageone");
            return (Criteria) this;
        }

        public Criteria andCImageoneLessThan(String value) {
            addCriterion("c_imageOne <", value, "cImageone");
            return (Criteria) this;
        }

        public Criteria andCImageoneLessThanOrEqualTo(String value) {
            addCriterion("c_imageOne <=", value, "cImageone");
            return (Criteria) this;
        }

        public Criteria andCImageoneLike(String value) {
            addCriterion("c_imageOne like", value, "cImageone");
            return (Criteria) this;
        }

        public Criteria andCImageoneNotLike(String value) {
            addCriterion("c_imageOne not like", value, "cImageone");
            return (Criteria) this;
        }

        public Criteria andCImageoneIn(List<String> values) {
            addCriterion("c_imageOne in", values, "cImageone");
            return (Criteria) this;
        }

        public Criteria andCImageoneNotIn(List<String> values) {
            addCriterion("c_imageOne not in", values, "cImageone");
            return (Criteria) this;
        }

        public Criteria andCImageoneBetween(String value1, String value2) {
            addCriterion("c_imageOne between", value1, value2, "cImageone");
            return (Criteria) this;
        }

        public Criteria andCImageoneNotBetween(String value1, String value2) {
            addCriterion("c_imageOne not between", value1, value2, "cImageone");
            return (Criteria) this;
        }

        public Criteria andCImagetwoIsNull() {
            addCriterion("c_imageTwo is null");
            return (Criteria) this;
        }

        public Criteria andCImagetwoIsNotNull() {
            addCriterion("c_imageTwo is not null");
            return (Criteria) this;
        }

        public Criteria andCImagetwoEqualTo(String value) {
            addCriterion("c_imageTwo =", value, "cImagetwo");
            return (Criteria) this;
        }

        public Criteria andCImagetwoNotEqualTo(String value) {
            addCriterion("c_imageTwo <>", value, "cImagetwo");
            return (Criteria) this;
        }

        public Criteria andCImagetwoGreaterThan(String value) {
            addCriterion("c_imageTwo >", value, "cImagetwo");
            return (Criteria) this;
        }

        public Criteria andCImagetwoGreaterThanOrEqualTo(String value) {
            addCriterion("c_imageTwo >=", value, "cImagetwo");
            return (Criteria) this;
        }

        public Criteria andCImagetwoLessThan(String value) {
            addCriterion("c_imageTwo <", value, "cImagetwo");
            return (Criteria) this;
        }

        public Criteria andCImagetwoLessThanOrEqualTo(String value) {
            addCriterion("c_imageTwo <=", value, "cImagetwo");
            return (Criteria) this;
        }

        public Criteria andCImagetwoLike(String value) {
            addCriterion("c_imageTwo like", value, "cImagetwo");
            return (Criteria) this;
        }

        public Criteria andCImagetwoNotLike(String value) {
            addCriterion("c_imageTwo not like", value, "cImagetwo");
            return (Criteria) this;
        }

        public Criteria andCImagetwoIn(List<String> values) {
            addCriterion("c_imageTwo in", values, "cImagetwo");
            return (Criteria) this;
        }

        public Criteria andCImagetwoNotIn(List<String> values) {
            addCriterion("c_imageTwo not in", values, "cImagetwo");
            return (Criteria) this;
        }

        public Criteria andCImagetwoBetween(String value1, String value2) {
            addCriterion("c_imageTwo between", value1, value2, "cImagetwo");
            return (Criteria) this;
        }

        public Criteria andCImagetwoNotBetween(String value1, String value2) {
            addCriterion("c_imageTwo not between", value1, value2, "cImagetwo");
            return (Criteria) this;
        }

        public Criteria andCImagethreeIsNull() {
            addCriterion("c_imageThree is null");
            return (Criteria) this;
        }

        public Criteria andCImagethreeIsNotNull() {
            addCriterion("c_imageThree is not null");
            return (Criteria) this;
        }

        public Criteria andCImagethreeEqualTo(String value) {
            addCriterion("c_imageThree =", value, "cImagethree");
            return (Criteria) this;
        }

        public Criteria andCImagethreeNotEqualTo(String value) {
            addCriterion("c_imageThree <>", value, "cImagethree");
            return (Criteria) this;
        }

        public Criteria andCImagethreeGreaterThan(String value) {
            addCriterion("c_imageThree >", value, "cImagethree");
            return (Criteria) this;
        }

        public Criteria andCImagethreeGreaterThanOrEqualTo(String value) {
            addCriterion("c_imageThree >=", value, "cImagethree");
            return (Criteria) this;
        }

        public Criteria andCImagethreeLessThan(String value) {
            addCriterion("c_imageThree <", value, "cImagethree");
            return (Criteria) this;
        }

        public Criteria andCImagethreeLessThanOrEqualTo(String value) {
            addCriterion("c_imageThree <=", value, "cImagethree");
            return (Criteria) this;
        }

        public Criteria andCImagethreeLike(String value) {
            addCriterion("c_imageThree like", value, "cImagethree");
            return (Criteria) this;
        }

        public Criteria andCImagethreeNotLike(String value) {
            addCriterion("c_imageThree not like", value, "cImagethree");
            return (Criteria) this;
        }

        public Criteria andCImagethreeIn(List<String> values) {
            addCriterion("c_imageThree in", values, "cImagethree");
            return (Criteria) this;
        }

        public Criteria andCImagethreeNotIn(List<String> values) {
            addCriterion("c_imageThree not in", values, "cImagethree");
            return (Criteria) this;
        }

        public Criteria andCImagethreeBetween(String value1, String value2) {
            addCriterion("c_imageThree between", value1, value2, "cImagethree");
            return (Criteria) this;
        }

        public Criteria andCImagethreeNotBetween(String value1, String value2) {
            addCriterion("c_imageThree not between", value1, value2, "cImagethree");
            return (Criteria) this;
        }

        public Criteria andCUseridIsNull() {
            addCriterion("c_userId is null");
            return (Criteria) this;
        }

        public Criteria andCUseridIsNotNull() {
            addCriterion("c_userId is not null");
            return (Criteria) this;
        }

        public Criteria andCUseridEqualTo(Long value) {
            addCriterion("c_userId =", value, "cUserid");
            return (Criteria) this;
        }

        public Criteria andCUseridNotEqualTo(Long value) {
            addCriterion("c_userId <>", value, "cUserid");
            return (Criteria) this;
        }

        public Criteria andCUseridGreaterThan(Long value) {
            addCriterion("c_userId >", value, "cUserid");
            return (Criteria) this;
        }

        public Criteria andCUseridGreaterThanOrEqualTo(Long value) {
            addCriterion("c_userId >=", value, "cUserid");
            return (Criteria) this;
        }

        public Criteria andCUseridLessThan(Long value) {
            addCriterion("c_userId <", value, "cUserid");
            return (Criteria) this;
        }

        public Criteria andCUseridLessThanOrEqualTo(Long value) {
            addCriterion("c_userId <=", value, "cUserid");
            return (Criteria) this;
        }

        public Criteria andCUseridIn(List<Long> values) {
            addCriterion("c_userId in", values, "cUserid");
            return (Criteria) this;
        }

        public Criteria andCUseridNotIn(List<Long> values) {
            addCriterion("c_userId not in", values, "cUserid");
            return (Criteria) this;
        }

        public Criteria andCUseridBetween(Long value1, Long value2) {
            addCriterion("c_userId between", value1, value2, "cUserid");
            return (Criteria) this;
        }

        public Criteria andCUseridNotBetween(Long value1, Long value2) {
            addCriterion("c_userId not between", value1, value2, "cUserid");
            return (Criteria) this;
        }

        public Criteria andCClassroomIdIsNull() {
            addCriterion("c_classroom_id is null");
            return (Criteria) this;
        }

        public Criteria andCClassroomIdIsNotNull() {
            addCriterion("c_classroom_id is not null");
            return (Criteria) this;
        }

        public Criteria andCClassroomIdEqualTo(Long value) {
            addCriterion("c_classroom_id =", value, "cClassroomId");
            return (Criteria) this;
        }

        public Criteria andCClassroomIdNotEqualTo(Long value) {
            addCriterion("c_classroom_id <>", value, "cClassroomId");
            return (Criteria) this;
        }

        public Criteria andCClassroomIdGreaterThan(Long value) {
            addCriterion("c_classroom_id >", value, "cClassroomId");
            return (Criteria) this;
        }

        public Criteria andCClassroomIdGreaterThanOrEqualTo(Long value) {
            addCriterion("c_classroom_id >=", value, "cClassroomId");
            return (Criteria) this;
        }

        public Criteria andCClassroomIdLessThan(Long value) {
            addCriterion("c_classroom_id <", value, "cClassroomId");
            return (Criteria) this;
        }

        public Criteria andCClassroomIdLessThanOrEqualTo(Long value) {
            addCriterion("c_classroom_id <=", value, "cClassroomId");
            return (Criteria) this;
        }

        public Criteria andCClassroomIdIn(List<Long> values) {
            addCriterion("c_classroom_id in", values, "cClassroomId");
            return (Criteria) this;
        }

        public Criteria andCClassroomIdNotIn(List<Long> values) {
            addCriterion("c_classroom_id not in", values, "cClassroomId");
            return (Criteria) this;
        }

        public Criteria andCClassroomIdBetween(Long value1, Long value2) {
            addCriterion("c_classroom_id between", value1, value2, "cClassroomId");
            return (Criteria) this;
        }

        public Criteria andCClassroomIdNotBetween(Long value1, Long value2) {
            addCriterion("c_classroom_id not between", value1, value2, "cClassroomId");
            return (Criteria) this;
        }

        public Criteria andCCoursetypeIdIsNull() {
            addCriterion("c_coursetype_id is null");
            return (Criteria) this;
        }

        public Criteria andCCoursetypeIdIsNotNull() {
            addCriterion("c_coursetype_id is not null");
            return (Criteria) this;
        }

        public Criteria andCCoursetypeIdEqualTo(Long value) {
            addCriterion("c_coursetype_id =", value, "cCoursetypeId");
            return (Criteria) this;
        }

        public Criteria andCCoursetypeIdNotEqualTo(Long value) {
            addCriterion("c_coursetype_id <>", value, "cCoursetypeId");
            return (Criteria) this;
        }

        public Criteria andCCoursetypeIdGreaterThan(Long value) {
            addCriterion("c_coursetype_id >", value, "cCoursetypeId");
            return (Criteria) this;
        }

        public Criteria andCCoursetypeIdGreaterThanOrEqualTo(Long value) {
            addCriterion("c_coursetype_id >=", value, "cCoursetypeId");
            return (Criteria) this;
        }

        public Criteria andCCoursetypeIdLessThan(Long value) {
            addCriterion("c_coursetype_id <", value, "cCoursetypeId");
            return (Criteria) this;
        }

        public Criteria andCCoursetypeIdLessThanOrEqualTo(Long value) {
            addCriterion("c_coursetype_id <=", value, "cCoursetypeId");
            return (Criteria) this;
        }

        public Criteria andCCoursetypeIdIn(List<Long> values) {
            addCriterion("c_coursetype_id in", values, "cCoursetypeId");
            return (Criteria) this;
        }

        public Criteria andCCoursetypeIdNotIn(List<Long> values) {
            addCriterion("c_coursetype_id not in", values, "cCoursetypeId");
            return (Criteria) this;
        }

        public Criteria andCCoursetypeIdBetween(Long value1, Long value2) {
            addCriterion("c_coursetype_id between", value1, value2, "cCoursetypeId");
            return (Criteria) this;
        }

        public Criteria andCCoursetypeIdNotBetween(Long value1, Long value2) {
            addCriterion("c_coursetype_id not between", value1, value2, "cCoursetypeId");
            return (Criteria) this;
        }

        public Criteria andCClassstartdateIsNull() {
            addCriterion("c_classStartDate is null");
            return (Criteria) this;
        }

        public Criteria andCClassstartdateIsNotNull() {
            addCriterion("c_classStartDate is not null");
            return (Criteria) this;
        }

        public Criteria andCClassstartdateEqualTo(Date value) {
            addCriterionForJDBCDate("c_classStartDate =", value, "cClassstartdate");
            return (Criteria) this;
        }

        public Criteria andCClassstartdateNotEqualTo(Date value) {
            addCriterionForJDBCDate("c_classStartDate <>", value, "cClassstartdate");
            return (Criteria) this;
        }

        public Criteria andCClassstartdateGreaterThan(Date value) {
            addCriterionForJDBCDate("c_classStartDate >", value, "cClassstartdate");
            return (Criteria) this;
        }

        public Criteria andCClassstartdateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("c_classStartDate >=", value, "cClassstartdate");
            return (Criteria) this;
        }

        public Criteria andCClassstartdateLessThan(Date value) {
            addCriterionForJDBCDate("c_classStartDate <", value, "cClassstartdate");
            return (Criteria) this;
        }

        public Criteria andCClassstartdateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("c_classStartDate <=", value, "cClassstartdate");
            return (Criteria) this;
        }

        public Criteria andCClassstartdateIn(List<Date> values) {
            addCriterionForJDBCDate("c_classStartDate in", values, "cClassstartdate");
            return (Criteria) this;
        }

        public Criteria andCClassstartdateNotIn(List<Date> values) {
            addCriterionForJDBCDate("c_classStartDate not in", values, "cClassstartdate");
            return (Criteria) this;
        }

        public Criteria andCClassstartdateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("c_classStartDate between", value1, value2, "cClassstartdate");
            return (Criteria) this;
        }

        public Criteria andCClassstartdateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("c_classStartDate not between", value1, value2, "cClassstartdate");
            return (Criteria) this;
        }

        public Criteria andCClassenddateIsNull() {
            addCriterion("c_classEndDate is null");
            return (Criteria) this;
        }

        public Criteria andCClassenddateIsNotNull() {
            addCriterion("c_classEndDate is not null");
            return (Criteria) this;
        }

        public Criteria andCClassenddateEqualTo(Date value) {
            addCriterionForJDBCDate("c_classEndDate =", value, "cClassenddate");
            return (Criteria) this;
        }

        public Criteria andCClassenddateNotEqualTo(Date value) {
            addCriterionForJDBCDate("c_classEndDate <>", value, "cClassenddate");
            return (Criteria) this;
        }

        public Criteria andCClassenddateGreaterThan(Date value) {
            addCriterionForJDBCDate("c_classEndDate >", value, "cClassenddate");
            return (Criteria) this;
        }

        public Criteria andCClassenddateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("c_classEndDate >=", value, "cClassenddate");
            return (Criteria) this;
        }

        public Criteria andCClassenddateLessThan(Date value) {
            addCriterionForJDBCDate("c_classEndDate <", value, "cClassenddate");
            return (Criteria) this;
        }

        public Criteria andCClassenddateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("c_classEndDate <=", value, "cClassenddate");
            return (Criteria) this;
        }

        public Criteria andCClassenddateIn(List<Date> values) {
            addCriterionForJDBCDate("c_classEndDate in", values, "cClassenddate");
            return (Criteria) this;
        }

        public Criteria andCClassenddateNotIn(List<Date> values) {
            addCriterionForJDBCDate("c_classEndDate not in", values, "cClassenddate");
            return (Criteria) this;
        }

        public Criteria andCClassenddateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("c_classEndDate between", value1, value2, "cClassenddate");
            return (Criteria) this;
        }

        public Criteria andCClassenddateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("c_classEndDate not between", value1, value2, "cClassenddate");
            return (Criteria) this;
        }

        public Criteria andCClassstarttimeIsNull() {
            addCriterion("c_classStartTime is null");
            return (Criteria) this;
        }

        public Criteria andCClassstarttimeIsNotNull() {
            addCriterion("c_classStartTime is not null");
            return (Criteria) this;
        }

        public Criteria andCClassstarttimeEqualTo(Date value) {
            addCriterion("c_classStartTime =", value, "cClassstarttime");
            return (Criteria) this;
        }

        public Criteria andCClassstarttimeNotEqualTo(Date value) {
            addCriterion("c_classStartTime <>", value, "cClassstarttime");
            return (Criteria) this;
        }

        public Criteria andCClassstarttimeGreaterThan(Date value) {
            addCriterion("c_classStartTime >", value, "cClassstarttime");
            return (Criteria) this;
        }

        public Criteria andCClassstarttimeGreaterThanOrEqualTo(Date value) {
            addCriterion("c_classStartTime >=", value, "cClassstarttime");
            return (Criteria) this;
        }

        public Criteria andCClassstarttimeLessThan(Date value) {
            addCriterion("c_classStartTime <", value, "cClassstarttime");
            return (Criteria) this;
        }

        public Criteria andCClassstarttimeLessThanOrEqualTo(Date value) {
            addCriterion("c_classStartTime <=", value, "cClassstarttime");
            return (Criteria) this;
        }

        public Criteria andCClassstarttimeIn(List<Date> values) {
            addCriterion("c_classStartTime in", values, "cClassstarttime");
            return (Criteria) this;
        }

        public Criteria andCClassstarttimeNotIn(List<Date> values) {
            addCriterion("c_classStartTime not in", values, "cClassstarttime");
            return (Criteria) this;
        }

        public Criteria andCClassstarttimeBetween(Date value1, Date value2) {
            addCriterion("c_classStartTime between", value1, value2, "cClassstarttime");
            return (Criteria) this;
        }

        public Criteria andCClassstarttimeNotBetween(Date value1, Date value2) {
            addCriterion("c_classStartTime not between", value1, value2, "cClassstarttime");
            return (Criteria) this;
        }

        public Criteria andCClassendtimeIsNull() {
            addCriterion("c_classEndTime is null");
            return (Criteria) this;
        }

        public Criteria andCClassendtimeIsNotNull() {
            addCriterion("c_classEndTime is not null");
            return (Criteria) this;
        }

        public Criteria andCClassendtimeEqualTo(Date value) {
            addCriterion("c_classEndTime =", value, "cClassendtime");
            return (Criteria) this;
        }

        public Criteria andCClassendtimeNotEqualTo(Date value) {
            addCriterion("c_classEndTime <>", value, "cClassendtime");
            return (Criteria) this;
        }

        public Criteria andCClassendtimeGreaterThan(Date value) {
            addCriterion("c_classEndTime >", value, "cClassendtime");
            return (Criteria) this;
        }

        public Criteria andCClassendtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("c_classEndTime >=", value, "cClassendtime");
            return (Criteria) this;
        }

        public Criteria andCClassendtimeLessThan(Date value) {
            addCriterion("c_classEndTime <", value, "cClassendtime");
            return (Criteria) this;
        }

        public Criteria andCClassendtimeLessThanOrEqualTo(Date value) {
            addCriterion("c_classEndTime <=", value, "cClassendtime");
            return (Criteria) this;
        }

        public Criteria andCClassendtimeIn(List<Date> values) {
            addCriterion("c_classEndTime in", values, "cClassendtime");
            return (Criteria) this;
        }

        public Criteria andCClassendtimeNotIn(List<Date> values) {
            addCriterion("c_classEndTime not in", values, "cClassendtime");
            return (Criteria) this;
        }

        public Criteria andCClassendtimeBetween(Date value1, Date value2) {
            addCriterion("c_classEndTime between", value1, value2, "cClassendtime");
            return (Criteria) this;
        }

        public Criteria andCClassendtimeNotBetween(Date value1, Date value2) {
            addCriterion("c_classEndTime not between", value1, value2, "cClassendtime");
            return (Criteria) this;
        }

        public Criteria andCRecommendIsNull() {
            addCriterion("c_recommend is null");
            return (Criteria) this;
        }

        public Criteria andCRecommendIsNotNull() {
            addCriterion("c_recommend is not null");
            return (Criteria) this;
        }

        public Criteria andCRecommendEqualTo(Boolean value) {
            addCriterion("c_recommend =", value, "cRecommend");
            return (Criteria) this;
        }

        public Criteria andCRecommendNotEqualTo(Boolean value) {
            addCriterion("c_recommend <>", value, "cRecommend");
            return (Criteria) this;
        }

        public Criteria andCRecommendGreaterThan(Boolean value) {
            addCriterion("c_recommend >", value, "cRecommend");
            return (Criteria) this;
        }

        public Criteria andCRecommendGreaterThanOrEqualTo(Boolean value) {
            addCriterion("c_recommend >=", value, "cRecommend");
            return (Criteria) this;
        }

        public Criteria andCRecommendLessThan(Boolean value) {
            addCriterion("c_recommend <", value, "cRecommend");
            return (Criteria) this;
        }

        public Criteria andCRecommendLessThanOrEqualTo(Boolean value) {
            addCriterion("c_recommend <=", value, "cRecommend");
            return (Criteria) this;
        }

        public Criteria andCRecommendIn(List<Boolean> values) {
            addCriterion("c_recommend in", values, "cRecommend");
            return (Criteria) this;
        }

        public Criteria andCRecommendNotIn(List<Boolean> values) {
            addCriterion("c_recommend not in", values, "cRecommend");
            return (Criteria) this;
        }

        public Criteria andCRecommendBetween(Boolean value1, Boolean value2) {
            addCriterion("c_recommend between", value1, value2, "cRecommend");
            return (Criteria) this;
        }

        public Criteria andCRecommendNotBetween(Boolean value1, Boolean value2) {
            addCriterion("c_recommend not between", value1, value2, "cRecommend");
            return (Criteria) this;
        }

        public Criteria andCScheduleIsNull() {
            addCriterion("c_schedule is null");
            return (Criteria) this;
        }

        public Criteria andCScheduleIsNotNull() {
            addCriterion("c_schedule is not null");
            return (Criteria) this;
        }

        public Criteria andCScheduleEqualTo(Boolean value) {
            addCriterion("c_schedule =", value, "cSchedule");
            return (Criteria) this;
        }

        public Criteria andCScheduleNotEqualTo(Boolean value) {
            addCriterion("c_schedule <>", value, "cSchedule");
            return (Criteria) this;
        }

        public Criteria andCScheduleGreaterThan(Boolean value) {
            addCriterion("c_schedule >", value, "cSchedule");
            return (Criteria) this;
        }

        public Criteria andCScheduleGreaterThanOrEqualTo(Boolean value) {
            addCriterion("c_schedule >=", value, "cSchedule");
            return (Criteria) this;
        }

        public Criteria andCScheduleLessThan(Boolean value) {
            addCriterion("c_schedule <", value, "cSchedule");
            return (Criteria) this;
        }

        public Criteria andCScheduleLessThanOrEqualTo(Boolean value) {
            addCriterion("c_schedule <=", value, "cSchedule");
            return (Criteria) this;
        }

        public Criteria andCScheduleIn(List<Boolean> values) {
            addCriterion("c_schedule in", values, "cSchedule");
            return (Criteria) this;
        }

        public Criteria andCScheduleNotIn(List<Boolean> values) {
            addCriterion("c_schedule not in", values, "cSchedule");
            return (Criteria) this;
        }

        public Criteria andCScheduleBetween(Boolean value1, Boolean value2) {
            addCriterion("c_schedule between", value1, value2, "cSchedule");
            return (Criteria) this;
        }

        public Criteria andCScheduleNotBetween(Boolean value1, Boolean value2) {
            addCriterion("c_schedule not between", value1, value2, "cSchedule");
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
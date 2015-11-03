package org.zucc.web.entity;

import java.util.ArrayList;
import java.util.List;

public class ITeacherExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer limitStart;

    protected Integer limitEnd;

    public ITeacherExample() {
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

        public Criteria andTidIsNull() {
            addCriterion("tid is null");
            return (Criteria) this;
        }

        public Criteria andTidIsNotNull() {
            addCriterion("tid is not null");
            return (Criteria) this;
        }

        public Criteria andTidEqualTo(Long value) {
            addCriterion("tid =", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidNotEqualTo(Long value) {
            addCriterion("tid <>", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidGreaterThan(Long value) {
            addCriterion("tid >", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidGreaterThanOrEqualTo(Long value) {
            addCriterion("tid >=", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidLessThan(Long value) {
            addCriterion("tid <", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidLessThanOrEqualTo(Long value) {
            addCriterion("tid <=", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidIn(List<Long> values) {
            addCriterion("tid in", values, "tid");
            return (Criteria) this;
        }

        public Criteria andTidNotIn(List<Long> values) {
            addCriterion("tid not in", values, "tid");
            return (Criteria) this;
        }

        public Criteria andTidBetween(Long value1, Long value2) {
            addCriterion("tid between", value1, value2, "tid");
            return (Criteria) this;
        }

        public Criteria andTidNotBetween(Long value1, Long value2) {
            addCriterion("tid not between", value1, value2, "tid");
            return (Criteria) this;
        }

        public Criteria andTUseridIsNull() {
            addCriterion("t_userId is null");
            return (Criteria) this;
        }

        public Criteria andTUseridIsNotNull() {
            addCriterion("t_userId is not null");
            return (Criteria) this;
        }

        public Criteria andTUseridEqualTo(Long value) {
            addCriterion("t_userId =", value, "tUserid");
            return (Criteria) this;
        }

        public Criteria andTUseridNotEqualTo(Long value) {
            addCriterion("t_userId <>", value, "tUserid");
            return (Criteria) this;
        }

        public Criteria andTUseridGreaterThan(Long value) {
            addCriterion("t_userId >", value, "tUserid");
            return (Criteria) this;
        }

        public Criteria andTUseridGreaterThanOrEqualTo(Long value) {
            addCriterion("t_userId >=", value, "tUserid");
            return (Criteria) this;
        }

        public Criteria andTUseridLessThan(Long value) {
            addCriterion("t_userId <", value, "tUserid");
            return (Criteria) this;
        }

        public Criteria andTUseridLessThanOrEqualTo(Long value) {
            addCriterion("t_userId <=", value, "tUserid");
            return (Criteria) this;
        }

        public Criteria andTUseridIn(List<Long> values) {
            addCriterion("t_userId in", values, "tUserid");
            return (Criteria) this;
        }

        public Criteria andTUseridNotIn(List<Long> values) {
            addCriterion("t_userId not in", values, "tUserid");
            return (Criteria) this;
        }

        public Criteria andTUseridBetween(Long value1, Long value2) {
            addCriterion("t_userId between", value1, value2, "tUserid");
            return (Criteria) this;
        }

        public Criteria andTUseridNotBetween(Long value1, Long value2) {
            addCriterion("t_userId not between", value1, value2, "tUserid");
            return (Criteria) this;
        }

        public Criteria andTImageIsNull() {
            addCriterion("t_image is null");
            return (Criteria) this;
        }

        public Criteria andTImageIsNotNull() {
            addCriterion("t_image is not null");
            return (Criteria) this;
        }

        public Criteria andTImageEqualTo(String value) {
            addCriterion("t_image =", value, "tImage");
            return (Criteria) this;
        }

        public Criteria andTImageNotEqualTo(String value) {
            addCriterion("t_image <>", value, "tImage");
            return (Criteria) this;
        }

        public Criteria andTImageGreaterThan(String value) {
            addCriterion("t_image >", value, "tImage");
            return (Criteria) this;
        }

        public Criteria andTImageGreaterThanOrEqualTo(String value) {
            addCriterion("t_image >=", value, "tImage");
            return (Criteria) this;
        }

        public Criteria andTImageLessThan(String value) {
            addCriterion("t_image <", value, "tImage");
            return (Criteria) this;
        }

        public Criteria andTImageLessThanOrEqualTo(String value) {
            addCriterion("t_image <=", value, "tImage");
            return (Criteria) this;
        }

        public Criteria andTImageLike(String value) {
            addCriterion("t_image like", value, "tImage");
            return (Criteria) this;
        }

        public Criteria andTImageNotLike(String value) {
            addCriterion("t_image not like", value, "tImage");
            return (Criteria) this;
        }

        public Criteria andTImageIn(List<String> values) {
            addCriterion("t_image in", values, "tImage");
            return (Criteria) this;
        }

        public Criteria andTImageNotIn(List<String> values) {
            addCriterion("t_image not in", values, "tImage");
            return (Criteria) this;
        }

        public Criteria andTImageBetween(String value1, String value2) {
            addCriterion("t_image between", value1, value2, "tImage");
            return (Criteria) this;
        }

        public Criteria andTImageNotBetween(String value1, String value2) {
            addCriterion("t_image not between", value1, value2, "tImage");
            return (Criteria) this;
        }

        public Criteria andTTypeidIsNull() {
            addCriterion("t_typeId is null");
            return (Criteria) this;
        }

        public Criteria andTTypeidIsNotNull() {
            addCriterion("t_typeId is not null");
            return (Criteria) this;
        }

        public Criteria andTTypeidEqualTo(Long value) {
            addCriterion("t_typeId =", value, "tTypeid");
            return (Criteria) this;
        }

        public Criteria andTTypeidNotEqualTo(Long value) {
            addCriterion("t_typeId <>", value, "tTypeid");
            return (Criteria) this;
        }

        public Criteria andTTypeidGreaterThan(Long value) {
            addCriterion("t_typeId >", value, "tTypeid");
            return (Criteria) this;
        }

        public Criteria andTTypeidGreaterThanOrEqualTo(Long value) {
            addCriterion("t_typeId >=", value, "tTypeid");
            return (Criteria) this;
        }

        public Criteria andTTypeidLessThan(Long value) {
            addCriterion("t_typeId <", value, "tTypeid");
            return (Criteria) this;
        }

        public Criteria andTTypeidLessThanOrEqualTo(Long value) {
            addCriterion("t_typeId <=", value, "tTypeid");
            return (Criteria) this;
        }

        public Criteria andTTypeidIn(List<Long> values) {
            addCriterion("t_typeId in", values, "tTypeid");
            return (Criteria) this;
        }

        public Criteria andTTypeidNotIn(List<Long> values) {
            addCriterion("t_typeId not in", values, "tTypeid");
            return (Criteria) this;
        }

        public Criteria andTTypeidBetween(Long value1, Long value2) {
            addCriterion("t_typeId between", value1, value2, "tTypeid");
            return (Criteria) this;
        }

        public Criteria andTTypeidNotBetween(Long value1, Long value2) {
            addCriterion("t_typeId not between", value1, value2, "tTypeid");
            return (Criteria) this;
        }

        public Criteria andTCardImageIsNull() {
            addCriterion("t_card_image is null");
            return (Criteria) this;
        }

        public Criteria andTCardImageIsNotNull() {
            addCriterion("t_card_image is not null");
            return (Criteria) this;
        }

        public Criteria andTCardImageEqualTo(String value) {
            addCriterion("t_card_image =", value, "tCardImage");
            return (Criteria) this;
        }

        public Criteria andTCardImageNotEqualTo(String value) {
            addCriterion("t_card_image <>", value, "tCardImage");
            return (Criteria) this;
        }

        public Criteria andTCardImageGreaterThan(String value) {
            addCriterion("t_card_image >", value, "tCardImage");
            return (Criteria) this;
        }

        public Criteria andTCardImageGreaterThanOrEqualTo(String value) {
            addCriterion("t_card_image >=", value, "tCardImage");
            return (Criteria) this;
        }

        public Criteria andTCardImageLessThan(String value) {
            addCriterion("t_card_image <", value, "tCardImage");
            return (Criteria) this;
        }

        public Criteria andTCardImageLessThanOrEqualTo(String value) {
            addCriterion("t_card_image <=", value, "tCardImage");
            return (Criteria) this;
        }

        public Criteria andTCardImageLike(String value) {
            addCriterion("t_card_image like", value, "tCardImage");
            return (Criteria) this;
        }

        public Criteria andTCardImageNotLike(String value) {
            addCriterion("t_card_image not like", value, "tCardImage");
            return (Criteria) this;
        }

        public Criteria andTCardImageIn(List<String> values) {
            addCriterion("t_card_image in", values, "tCardImage");
            return (Criteria) this;
        }

        public Criteria andTCardImageNotIn(List<String> values) {
            addCriterion("t_card_image not in", values, "tCardImage");
            return (Criteria) this;
        }

        public Criteria andTCardImageBetween(String value1, String value2) {
            addCriterion("t_card_image between", value1, value2, "tCardImage");
            return (Criteria) this;
        }

        public Criteria andTCardImageNotBetween(String value1, String value2) {
            addCriterion("t_card_image not between", value1, value2, "tCardImage");
            return (Criteria) this;
        }

        public Criteria andTSimpleDescriptionIsNull() {
            addCriterion("t_simple_description is null");
            return (Criteria) this;
        }

        public Criteria andTSimpleDescriptionIsNotNull() {
            addCriterion("t_simple_description is not null");
            return (Criteria) this;
        }

        public Criteria andTSimpleDescriptionEqualTo(String value) {
            addCriterion("t_simple_description =", value, "tSimpleDescription");
            return (Criteria) this;
        }

        public Criteria andTSimpleDescriptionNotEqualTo(String value) {
            addCriterion("t_simple_description <>", value, "tSimpleDescription");
            return (Criteria) this;
        }

        public Criteria andTSimpleDescriptionGreaterThan(String value) {
            addCriterion("t_simple_description >", value, "tSimpleDescription");
            return (Criteria) this;
        }

        public Criteria andTSimpleDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("t_simple_description >=", value, "tSimpleDescription");
            return (Criteria) this;
        }

        public Criteria andTSimpleDescriptionLessThan(String value) {
            addCriterion("t_simple_description <", value, "tSimpleDescription");
            return (Criteria) this;
        }

        public Criteria andTSimpleDescriptionLessThanOrEqualTo(String value) {
            addCriterion("t_simple_description <=", value, "tSimpleDescription");
            return (Criteria) this;
        }

        public Criteria andTSimpleDescriptionLike(String value) {
            addCriterion("t_simple_description like", value, "tSimpleDescription");
            return (Criteria) this;
        }

        public Criteria andTSimpleDescriptionNotLike(String value) {
            addCriterion("t_simple_description not like", value, "tSimpleDescription");
            return (Criteria) this;
        }

        public Criteria andTSimpleDescriptionIn(List<String> values) {
            addCriterion("t_simple_description in", values, "tSimpleDescription");
            return (Criteria) this;
        }

        public Criteria andTSimpleDescriptionNotIn(List<String> values) {
            addCriterion("t_simple_description not in", values, "tSimpleDescription");
            return (Criteria) this;
        }

        public Criteria andTSimpleDescriptionBetween(String value1, String value2) {
            addCriterion("t_simple_description between", value1, value2, "tSimpleDescription");
            return (Criteria) this;
        }

        public Criteria andTSimpleDescriptionNotBetween(String value1, String value2) {
            addCriterion("t_simple_description not between", value1, value2, "tSimpleDescription");
            return (Criteria) this;
        }

        public Criteria andTDescriptionIsNull() {
            addCriterion("t_description is null");
            return (Criteria) this;
        }

        public Criteria andTDescriptionIsNotNull() {
            addCriterion("t_description is not null");
            return (Criteria) this;
        }

        public Criteria andTDescriptionEqualTo(String value) {
            addCriterion("t_description =", value, "tDescription");
            return (Criteria) this;
        }

        public Criteria andTDescriptionNotEqualTo(String value) {
            addCriterion("t_description <>", value, "tDescription");
            return (Criteria) this;
        }

        public Criteria andTDescriptionGreaterThan(String value) {
            addCriterion("t_description >", value, "tDescription");
            return (Criteria) this;
        }

        public Criteria andTDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("t_description >=", value, "tDescription");
            return (Criteria) this;
        }

        public Criteria andTDescriptionLessThan(String value) {
            addCriterion("t_description <", value, "tDescription");
            return (Criteria) this;
        }

        public Criteria andTDescriptionLessThanOrEqualTo(String value) {
            addCriterion("t_description <=", value, "tDescription");
            return (Criteria) this;
        }

        public Criteria andTDescriptionLike(String value) {
            addCriterion("t_description like", value, "tDescription");
            return (Criteria) this;
        }

        public Criteria andTDescriptionNotLike(String value) {
            addCriterion("t_description not like", value, "tDescription");
            return (Criteria) this;
        }

        public Criteria andTDescriptionIn(List<String> values) {
            addCriterion("t_description in", values, "tDescription");
            return (Criteria) this;
        }

        public Criteria andTDescriptionNotIn(List<String> values) {
            addCriterion("t_description not in", values, "tDescription");
            return (Criteria) this;
        }

        public Criteria andTDescriptionBetween(String value1, String value2) {
            addCriterion("t_description between", value1, value2, "tDescription");
            return (Criteria) this;
        }

        public Criteria andTDescriptionNotBetween(String value1, String value2) {
            addCriterion("t_description not between", value1, value2, "tDescription");
            return (Criteria) this;
        }

        public Criteria andTTagsIsNull() {
            addCriterion("t_tags is null");
            return (Criteria) this;
        }

        public Criteria andTTagsIsNotNull() {
            addCriterion("t_tags is not null");
            return (Criteria) this;
        }

        public Criteria andTTagsEqualTo(String value) {
            addCriterion("t_tags =", value, "tTags");
            return (Criteria) this;
        }

        public Criteria andTTagsNotEqualTo(String value) {
            addCriterion("t_tags <>", value, "tTags");
            return (Criteria) this;
        }

        public Criteria andTTagsGreaterThan(String value) {
            addCriterion("t_tags >", value, "tTags");
            return (Criteria) this;
        }

        public Criteria andTTagsGreaterThanOrEqualTo(String value) {
            addCriterion("t_tags >=", value, "tTags");
            return (Criteria) this;
        }

        public Criteria andTTagsLessThan(String value) {
            addCriterion("t_tags <", value, "tTags");
            return (Criteria) this;
        }

        public Criteria andTTagsLessThanOrEqualTo(String value) {
            addCriterion("t_tags <=", value, "tTags");
            return (Criteria) this;
        }

        public Criteria andTTagsLike(String value) {
            addCriterion("t_tags like", value, "tTags");
            return (Criteria) this;
        }

        public Criteria andTTagsNotLike(String value) {
            addCriterion("t_tags not like", value, "tTags");
            return (Criteria) this;
        }

        public Criteria andTTagsIn(List<String> values) {
            addCriterion("t_tags in", values, "tTags");
            return (Criteria) this;
        }

        public Criteria andTTagsNotIn(List<String> values) {
            addCriterion("t_tags not in", values, "tTags");
            return (Criteria) this;
        }

        public Criteria andTTagsBetween(String value1, String value2) {
            addCriterion("t_tags between", value1, value2, "tTags");
            return (Criteria) this;
        }

        public Criteria andTTagsNotBetween(String value1, String value2) {
            addCriterion("t_tags not between", value1, value2, "tTags");
            return (Criteria) this;
        }

        public Criteria andTCertificateimageIsNull() {
            addCriterion("t_certificateImage is null");
            return (Criteria) this;
        }

        public Criteria andTCertificateimageIsNotNull() {
            addCriterion("t_certificateImage is not null");
            return (Criteria) this;
        }

        public Criteria andTCertificateimageEqualTo(String value) {
            addCriterion("t_certificateImage =", value, "tCertificateimage");
            return (Criteria) this;
        }

        public Criteria andTCertificateimageNotEqualTo(String value) {
            addCriterion("t_certificateImage <>", value, "tCertificateimage");
            return (Criteria) this;
        }

        public Criteria andTCertificateimageGreaterThan(String value) {
            addCriterion("t_certificateImage >", value, "tCertificateimage");
            return (Criteria) this;
        }

        public Criteria andTCertificateimageGreaterThanOrEqualTo(String value) {
            addCriterion("t_certificateImage >=", value, "tCertificateimage");
            return (Criteria) this;
        }

        public Criteria andTCertificateimageLessThan(String value) {
            addCriterion("t_certificateImage <", value, "tCertificateimage");
            return (Criteria) this;
        }

        public Criteria andTCertificateimageLessThanOrEqualTo(String value) {
            addCriterion("t_certificateImage <=", value, "tCertificateimage");
            return (Criteria) this;
        }

        public Criteria andTCertificateimageLike(String value) {
            addCriterion("t_certificateImage like", value, "tCertificateimage");
            return (Criteria) this;
        }

        public Criteria andTCertificateimageNotLike(String value) {
            addCriterion("t_certificateImage not like", value, "tCertificateimage");
            return (Criteria) this;
        }

        public Criteria andTCertificateimageIn(List<String> values) {
            addCriterion("t_certificateImage in", values, "tCertificateimage");
            return (Criteria) this;
        }

        public Criteria andTCertificateimageNotIn(List<String> values) {
            addCriterion("t_certificateImage not in", values, "tCertificateimage");
            return (Criteria) this;
        }

        public Criteria andTCertificateimageBetween(String value1, String value2) {
            addCriterion("t_certificateImage between", value1, value2, "tCertificateimage");
            return (Criteria) this;
        }

        public Criteria andTCertificateimageNotBetween(String value1, String value2) {
            addCriterion("t_certificateImage not between", value1, value2, "tCertificateimage");
            return (Criteria) this;
        }

        public Criteria andTTageIsNull() {
            addCriterion("t_tage is null");
            return (Criteria) this;
        }

        public Criteria andTTageIsNotNull() {
            addCriterion("t_tage is not null");
            return (Criteria) this;
        }

        public Criteria andTTageEqualTo(Integer value) {
            addCriterion("t_tage =", value, "tTage");
            return (Criteria) this;
        }

        public Criteria andTTageNotEqualTo(Integer value) {
            addCriterion("t_tage <>", value, "tTage");
            return (Criteria) this;
        }

        public Criteria andTTageGreaterThan(Integer value) {
            addCriterion("t_tage >", value, "tTage");
            return (Criteria) this;
        }

        public Criteria andTTageGreaterThanOrEqualTo(Integer value) {
            addCriterion("t_tage >=", value, "tTage");
            return (Criteria) this;
        }

        public Criteria andTTageLessThan(Integer value) {
            addCriterion("t_tage <", value, "tTage");
            return (Criteria) this;
        }

        public Criteria andTTageLessThanOrEqualTo(Integer value) {
            addCriterion("t_tage <=", value, "tTage");
            return (Criteria) this;
        }

        public Criteria andTTageIn(List<Integer> values) {
            addCriterion("t_tage in", values, "tTage");
            return (Criteria) this;
        }

        public Criteria andTTageNotIn(List<Integer> values) {
            addCriterion("t_tage not in", values, "tTage");
            return (Criteria) this;
        }

        public Criteria andTTageBetween(Integer value1, Integer value2) {
            addCriterion("t_tage between", value1, value2, "tTage");
            return (Criteria) this;
        }

        public Criteria andTTageNotBetween(Integer value1, Integer value2) {
            addCriterion("t_tage not between", value1, value2, "tTage");
            return (Criteria) this;
        }

        public Criteria andTRealNameIsNull() {
            addCriterion("t_real_name is null");
            return (Criteria) this;
        }

        public Criteria andTRealNameIsNotNull() {
            addCriterion("t_real_name is not null");
            return (Criteria) this;
        }

        public Criteria andTRealNameEqualTo(String value) {
            addCriterion("t_real_name =", value, "tRealName");
            return (Criteria) this;
        }

        public Criteria andTRealNameNotEqualTo(String value) {
            addCriterion("t_real_name <>", value, "tRealName");
            return (Criteria) this;
        }

        public Criteria andTRealNameGreaterThan(String value) {
            addCriterion("t_real_name >", value, "tRealName");
            return (Criteria) this;
        }

        public Criteria andTRealNameGreaterThanOrEqualTo(String value) {
            addCriterion("t_real_name >=", value, "tRealName");
            return (Criteria) this;
        }

        public Criteria andTRealNameLessThan(String value) {
            addCriterion("t_real_name <", value, "tRealName");
            return (Criteria) this;
        }

        public Criteria andTRealNameLessThanOrEqualTo(String value) {
            addCriterion("t_real_name <=", value, "tRealName");
            return (Criteria) this;
        }

        public Criteria andTRealNameLike(String value) {
            addCriterion("t_real_name like", value, "tRealName");
            return (Criteria) this;
        }

        public Criteria andTRealNameNotLike(String value) {
            addCriterion("t_real_name not like", value, "tRealName");
            return (Criteria) this;
        }

        public Criteria andTRealNameIn(List<String> values) {
            addCriterion("t_real_name in", values, "tRealName");
            return (Criteria) this;
        }

        public Criteria andTRealNameNotIn(List<String> values) {
            addCriterion("t_real_name not in", values, "tRealName");
            return (Criteria) this;
        }

        public Criteria andTRealNameBetween(String value1, String value2) {
            addCriterion("t_real_name between", value1, value2, "tRealName");
            return (Criteria) this;
        }

        public Criteria andTRealNameNotBetween(String value1, String value2) {
            addCriterion("t_real_name not between", value1, value2, "tRealName");
            return (Criteria) this;
        }

        public Criteria andTContactIsNull() {
            addCriterion("t_contact is null");
            return (Criteria) this;
        }

        public Criteria andTContactIsNotNull() {
            addCriterion("t_contact is not null");
            return (Criteria) this;
        }

        public Criteria andTContactEqualTo(String value) {
            addCriterion("t_contact =", value, "tContact");
            return (Criteria) this;
        }

        public Criteria andTContactNotEqualTo(String value) {
            addCriterion("t_contact <>", value, "tContact");
            return (Criteria) this;
        }

        public Criteria andTContactGreaterThan(String value) {
            addCriterion("t_contact >", value, "tContact");
            return (Criteria) this;
        }

        public Criteria andTContactGreaterThanOrEqualTo(String value) {
            addCriterion("t_contact >=", value, "tContact");
            return (Criteria) this;
        }

        public Criteria andTContactLessThan(String value) {
            addCriterion("t_contact <", value, "tContact");
            return (Criteria) this;
        }

        public Criteria andTContactLessThanOrEqualTo(String value) {
            addCriterion("t_contact <=", value, "tContact");
            return (Criteria) this;
        }

        public Criteria andTContactLike(String value) {
            addCriterion("t_contact like", value, "tContact");
            return (Criteria) this;
        }

        public Criteria andTContactNotLike(String value) {
            addCriterion("t_contact not like", value, "tContact");
            return (Criteria) this;
        }

        public Criteria andTContactIn(List<String> values) {
            addCriterion("t_contact in", values, "tContact");
            return (Criteria) this;
        }

        public Criteria andTContactNotIn(List<String> values) {
            addCriterion("t_contact not in", values, "tContact");
            return (Criteria) this;
        }

        public Criteria andTContactBetween(String value1, String value2) {
            addCriterion("t_contact between", value1, value2, "tContact");
            return (Criteria) this;
        }

        public Criteria andTContactNotBetween(String value1, String value2) {
            addCriterion("t_contact not between", value1, value2, "tContact");
            return (Criteria) this;
        }

        public Criteria andTStateIsNull() {
            addCriterion("t_state is null");
            return (Criteria) this;
        }

        public Criteria andTStateIsNotNull() {
            addCriterion("t_state is not null");
            return (Criteria) this;
        }

        public Criteria andTStateEqualTo(Boolean value) {
            addCriterion("t_state =", value, "tState");
            return (Criteria) this;
        }

        public Criteria andTStateNotEqualTo(Boolean value) {
            addCriterion("t_state <>", value, "tState");
            return (Criteria) this;
        }

        public Criteria andTStateGreaterThan(Boolean value) {
            addCriterion("t_state >", value, "tState");
            return (Criteria) this;
        }

        public Criteria andTStateGreaterThanOrEqualTo(Boolean value) {
            addCriterion("t_state >=", value, "tState");
            return (Criteria) this;
        }

        public Criteria andTStateLessThan(Boolean value) {
            addCriterion("t_state <", value, "tState");
            return (Criteria) this;
        }

        public Criteria andTStateLessThanOrEqualTo(Boolean value) {
            addCriterion("t_state <=", value, "tState");
            return (Criteria) this;
        }

        public Criteria andTStateIn(List<Boolean> values) {
            addCriterion("t_state in", values, "tState");
            return (Criteria) this;
        }

        public Criteria andTStateNotIn(List<Boolean> values) {
            addCriterion("t_state not in", values, "tState");
            return (Criteria) this;
        }

        public Criteria andTStateBetween(Boolean value1, Boolean value2) {
            addCriterion("t_state between", value1, value2, "tState");
            return (Criteria) this;
        }

        public Criteria andTStateNotBetween(Boolean value1, Boolean value2) {
            addCriterion("t_state not between", value1, value2, "tState");
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
package com.tsjg.core.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MagUserdefinedExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MagUserdefinedExample() {
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

        public Criteria andMagUserdefinedIdIsNull() {
            addCriterion("mag_userdefined_id is null");
            return (Criteria) this;
        }

        public Criteria andMagUserdefinedIdIsNotNull() {
            addCriterion("mag_userdefined_id is not null");
            return (Criteria) this;
        }

        public Criteria andMagUserdefinedIdEqualTo(Integer value) {
            addCriterion("mag_userdefined_id =", value, "magUserdefinedId");
            return (Criteria) this;
        }

        public Criteria andMagUserdefinedIdNotEqualTo(Integer value) {
            addCriterion("mag_userdefined_id <>", value, "magUserdefinedId");
            return (Criteria) this;
        }

        public Criteria andMagUserdefinedIdGreaterThan(Integer value) {
            addCriterion("mag_userdefined_id >", value, "magUserdefinedId");
            return (Criteria) this;
        }

        public Criteria andMagUserdefinedIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("mag_userdefined_id >=", value, "magUserdefinedId");
            return (Criteria) this;
        }

        public Criteria andMagUserdefinedIdLessThan(Integer value) {
            addCriterion("mag_userdefined_id <", value, "magUserdefinedId");
            return (Criteria) this;
        }

        public Criteria andMagUserdefinedIdLessThanOrEqualTo(Integer value) {
            addCriterion("mag_userdefined_id <=", value, "magUserdefinedId");
            return (Criteria) this;
        }

        public Criteria andMagUserdefinedIdIn(List<Integer> values) {
            addCriterion("mag_userdefined_id in", values, "magUserdefinedId");
            return (Criteria) this;
        }

        public Criteria andMagUserdefinedIdNotIn(List<Integer> values) {
            addCriterion("mag_userdefined_id not in", values, "magUserdefinedId");
            return (Criteria) this;
        }

        public Criteria andMagUserdefinedIdBetween(Integer value1, Integer value2) {
            addCriterion("mag_userdefined_id between", value1, value2, "magUserdefinedId");
            return (Criteria) this;
        }

        public Criteria andMagUserdefinedIdNotBetween(Integer value1, Integer value2) {
            addCriterion("mag_userdefined_id not between", value1, value2, "magUserdefinedId");
            return (Criteria) this;
        }

        public Criteria andMagUdTitleIsNull() {
            addCriterion("mag_ud_title is null");
            return (Criteria) this;
        }

        public Criteria andMagUdTitleIsNotNull() {
            addCriterion("mag_ud_title is not null");
            return (Criteria) this;
        }

        public Criteria andMagUdTitleEqualTo(String value) {
            addCriterion("mag_ud_title =", value, "magUdTitle");
            return (Criteria) this;
        }

        public Criteria andMagUdTitleNotEqualTo(String value) {
            addCriterion("mag_ud_title <>", value, "magUdTitle");
            return (Criteria) this;
        }

        public Criteria andMagUdTitleGreaterThan(String value) {
            addCriterion("mag_ud_title >", value, "magUdTitle");
            return (Criteria) this;
        }

        public Criteria andMagUdTitleGreaterThanOrEqualTo(String value) {
            addCriterion("mag_ud_title >=", value, "magUdTitle");
            return (Criteria) this;
        }

        public Criteria andMagUdTitleLessThan(String value) {
            addCriterion("mag_ud_title <", value, "magUdTitle");
            return (Criteria) this;
        }

        public Criteria andMagUdTitleLessThanOrEqualTo(String value) {
            addCriterion("mag_ud_title <=", value, "magUdTitle");
            return (Criteria) this;
        }

        public Criteria andMagUdTitleLike(String value) {
            addCriterion("mag_ud_title like", value, "magUdTitle");
            return (Criteria) this;
        }

        public Criteria andMagUdTitleNotLike(String value) {
            addCriterion("mag_ud_title not like", value, "magUdTitle");
            return (Criteria) this;
        }

        public Criteria andMagUdTitleIn(List<String> values) {
            addCriterion("mag_ud_title in", values, "magUdTitle");
            return (Criteria) this;
        }

        public Criteria andMagUdTitleNotIn(List<String> values) {
            addCriterion("mag_ud_title not in", values, "magUdTitle");
            return (Criteria) this;
        }

        public Criteria andMagUdTitleBetween(String value1, String value2) {
            addCriterion("mag_ud_title between", value1, value2, "magUdTitle");
            return (Criteria) this;
        }

        public Criteria andMagUdTitleNotBetween(String value1, String value2) {
            addCriterion("mag_ud_title not between", value1, value2, "magUdTitle");
            return (Criteria) this;
        }

        public Criteria andMagUdCompetentIsNull() {
            addCriterion("mag_ud_competent is null");
            return (Criteria) this;
        }

        public Criteria andMagUdCompetentIsNotNull() {
            addCriterion("mag_ud_competent is not null");
            return (Criteria) this;
        }

        public Criteria andMagUdCompetentEqualTo(String value) {
            addCriterion("mag_ud_competent =", value, "magUdCompetent");
            return (Criteria) this;
        }

        public Criteria andMagUdCompetentNotEqualTo(String value) {
            addCriterion("mag_ud_competent <>", value, "magUdCompetent");
            return (Criteria) this;
        }

        public Criteria andMagUdCompetentGreaterThan(String value) {
            addCriterion("mag_ud_competent >", value, "magUdCompetent");
            return (Criteria) this;
        }

        public Criteria andMagUdCompetentGreaterThanOrEqualTo(String value) {
            addCriterion("mag_ud_competent >=", value, "magUdCompetent");
            return (Criteria) this;
        }

        public Criteria andMagUdCompetentLessThan(String value) {
            addCriterion("mag_ud_competent <", value, "magUdCompetent");
            return (Criteria) this;
        }

        public Criteria andMagUdCompetentLessThanOrEqualTo(String value) {
            addCriterion("mag_ud_competent <=", value, "magUdCompetent");
            return (Criteria) this;
        }

        public Criteria andMagUdCompetentLike(String value) {
            addCriterion("mag_ud_competent like", value, "magUdCompetent");
            return (Criteria) this;
        }

        public Criteria andMagUdCompetentNotLike(String value) {
            addCriterion("mag_ud_competent not like", value, "magUdCompetent");
            return (Criteria) this;
        }

        public Criteria andMagUdCompetentIn(List<String> values) {
            addCriterion("mag_ud_competent in", values, "magUdCompetent");
            return (Criteria) this;
        }

        public Criteria andMagUdCompetentNotIn(List<String> values) {
            addCriterion("mag_ud_competent not in", values, "magUdCompetent");
            return (Criteria) this;
        }

        public Criteria andMagUdCompetentBetween(String value1, String value2) {
            addCriterion("mag_ud_competent between", value1, value2, "magUdCompetent");
            return (Criteria) this;
        }

        public Criteria andMagUdCompetentNotBetween(String value1, String value2) {
            addCriterion("mag_ud_competent not between", value1, value2, "magUdCompetent");
            return (Criteria) this;
        }

        public Criteria andMagUdHostunitIsNull() {
            addCriterion("mag_ud_hostunit is null");
            return (Criteria) this;
        }

        public Criteria andMagUdHostunitIsNotNull() {
            addCriterion("mag_ud_hostunit is not null");
            return (Criteria) this;
        }

        public Criteria andMagUdHostunitEqualTo(String value) {
            addCriterion("mag_ud_hostunit =", value, "magUdHostunit");
            return (Criteria) this;
        }

        public Criteria andMagUdHostunitNotEqualTo(String value) {
            addCriterion("mag_ud_hostunit <>", value, "magUdHostunit");
            return (Criteria) this;
        }

        public Criteria andMagUdHostunitGreaterThan(String value) {
            addCriterion("mag_ud_hostunit >", value, "magUdHostunit");
            return (Criteria) this;
        }

        public Criteria andMagUdHostunitGreaterThanOrEqualTo(String value) {
            addCriterion("mag_ud_hostunit >=", value, "magUdHostunit");
            return (Criteria) this;
        }

        public Criteria andMagUdHostunitLessThan(String value) {
            addCriterion("mag_ud_hostunit <", value, "magUdHostunit");
            return (Criteria) this;
        }

        public Criteria andMagUdHostunitLessThanOrEqualTo(String value) {
            addCriterion("mag_ud_hostunit <=", value, "magUdHostunit");
            return (Criteria) this;
        }

        public Criteria andMagUdHostunitLike(String value) {
            addCriterion("mag_ud_hostunit like", value, "magUdHostunit");
            return (Criteria) this;
        }

        public Criteria andMagUdHostunitNotLike(String value) {
            addCriterion("mag_ud_hostunit not like", value, "magUdHostunit");
            return (Criteria) this;
        }

        public Criteria andMagUdHostunitIn(List<String> values) {
            addCriterion("mag_ud_hostunit in", values, "magUdHostunit");
            return (Criteria) this;
        }

        public Criteria andMagUdHostunitNotIn(List<String> values) {
            addCriterion("mag_ud_hostunit not in", values, "magUdHostunit");
            return (Criteria) this;
        }

        public Criteria andMagUdHostunitBetween(String value1, String value2) {
            addCriterion("mag_ud_hostunit between", value1, value2, "magUdHostunit");
            return (Criteria) this;
        }

        public Criteria andMagUdHostunitNotBetween(String value1, String value2) {
            addCriterion("mag_ud_hostunit not between", value1, value2, "magUdHostunit");
            return (Criteria) this;
        }

        public Criteria andMagUdMailnumIsNull() {
            addCriterion("mag_ud_mailnum is null");
            return (Criteria) this;
        }

        public Criteria andMagUdMailnumIsNotNull() {
            addCriterion("mag_ud_mailnum is not null");
            return (Criteria) this;
        }

        public Criteria andMagUdMailnumEqualTo(String value) {
            addCriterion("mag_ud_mailnum =", value, "magUdMailnum");
            return (Criteria) this;
        }

        public Criteria andMagUdMailnumNotEqualTo(String value) {
            addCriterion("mag_ud_mailnum <>", value, "magUdMailnum");
            return (Criteria) this;
        }

        public Criteria andMagUdMailnumGreaterThan(String value) {
            addCriterion("mag_ud_mailnum >", value, "magUdMailnum");
            return (Criteria) this;
        }

        public Criteria andMagUdMailnumGreaterThanOrEqualTo(String value) {
            addCriterion("mag_ud_mailnum >=", value, "magUdMailnum");
            return (Criteria) this;
        }

        public Criteria andMagUdMailnumLessThan(String value) {
            addCriterion("mag_ud_mailnum <", value, "magUdMailnum");
            return (Criteria) this;
        }

        public Criteria andMagUdMailnumLessThanOrEqualTo(String value) {
            addCriterion("mag_ud_mailnum <=", value, "magUdMailnum");
            return (Criteria) this;
        }

        public Criteria andMagUdMailnumLike(String value) {
            addCriterion("mag_ud_mailnum like", value, "magUdMailnum");
            return (Criteria) this;
        }

        public Criteria andMagUdMailnumNotLike(String value) {
            addCriterion("mag_ud_mailnum not like", value, "magUdMailnum");
            return (Criteria) this;
        }

        public Criteria andMagUdMailnumIn(List<String> values) {
            addCriterion("mag_ud_mailnum in", values, "magUdMailnum");
            return (Criteria) this;
        }

        public Criteria andMagUdMailnumNotIn(List<String> values) {
            addCriterion("mag_ud_mailnum not in", values, "magUdMailnum");
            return (Criteria) this;
        }

        public Criteria andMagUdMailnumBetween(String value1, String value2) {
            addCriterion("mag_ud_mailnum between", value1, value2, "magUdMailnum");
            return (Criteria) this;
        }

        public Criteria andMagUdMailnumNotBetween(String value1, String value2) {
            addCriterion("mag_ud_mailnum not between", value1, value2, "magUdMailnum");
            return (Criteria) this;
        }

        public Criteria andMagUdCnIsNull() {
            addCriterion("mag_ud_cn is null");
            return (Criteria) this;
        }

        public Criteria andMagUdCnIsNotNull() {
            addCriterion("mag_ud_cn is not null");
            return (Criteria) this;
        }

        public Criteria andMagUdCnEqualTo(String value) {
            addCriterion("mag_ud_cn =", value, "magUdCn");
            return (Criteria) this;
        }

        public Criteria andMagUdCnNotEqualTo(String value) {
            addCriterion("mag_ud_cn <>", value, "magUdCn");
            return (Criteria) this;
        }

        public Criteria andMagUdCnGreaterThan(String value) {
            addCriterion("mag_ud_cn >", value, "magUdCn");
            return (Criteria) this;
        }

        public Criteria andMagUdCnGreaterThanOrEqualTo(String value) {
            addCriterion("mag_ud_cn >=", value, "magUdCn");
            return (Criteria) this;
        }

        public Criteria andMagUdCnLessThan(String value) {
            addCriterion("mag_ud_cn <", value, "magUdCn");
            return (Criteria) this;
        }

        public Criteria andMagUdCnLessThanOrEqualTo(String value) {
            addCriterion("mag_ud_cn <=", value, "magUdCn");
            return (Criteria) this;
        }

        public Criteria andMagUdCnLike(String value) {
            addCriterion("mag_ud_cn like", value, "magUdCn");
            return (Criteria) this;
        }

        public Criteria andMagUdCnNotLike(String value) {
            addCriterion("mag_ud_cn not like", value, "magUdCn");
            return (Criteria) this;
        }

        public Criteria andMagUdCnIn(List<String> values) {
            addCriterion("mag_ud_cn in", values, "magUdCn");
            return (Criteria) this;
        }

        public Criteria andMagUdCnNotIn(List<String> values) {
            addCriterion("mag_ud_cn not in", values, "magUdCn");
            return (Criteria) this;
        }

        public Criteria andMagUdCnBetween(String value1, String value2) {
            addCriterion("mag_ud_cn between", value1, value2, "magUdCn");
            return (Criteria) this;
        }

        public Criteria andMagUdCnNotBetween(String value1, String value2) {
            addCriterion("mag_ud_cn not between", value1, value2, "magUdCn");
            return (Criteria) this;
        }

        public Criteria andMagIssnIsNull() {
            addCriterion("mag_issn is null");
            return (Criteria) this;
        }

        public Criteria andMagIssnIsNotNull() {
            addCriterion("mag_issn is not null");
            return (Criteria) this;
        }

        public Criteria andMagIssnEqualTo(String value) {
            addCriterion("mag_issn =", value, "magIssn");
            return (Criteria) this;
        }

        public Criteria andMagIssnNotEqualTo(String value) {
            addCriterion("mag_issn <>", value, "magIssn");
            return (Criteria) this;
        }

        public Criteria andMagIssnGreaterThan(String value) {
            addCriterion("mag_issn >", value, "magIssn");
            return (Criteria) this;
        }

        public Criteria andMagIssnGreaterThanOrEqualTo(String value) {
            addCriterion("mag_issn >=", value, "magIssn");
            return (Criteria) this;
        }

        public Criteria andMagIssnLessThan(String value) {
            addCriterion("mag_issn <", value, "magIssn");
            return (Criteria) this;
        }

        public Criteria andMagIssnLessThanOrEqualTo(String value) {
            addCriterion("mag_issn <=", value, "magIssn");
            return (Criteria) this;
        }

        public Criteria andMagIssnLike(String value) {
            addCriterion("mag_issn like", value, "magIssn");
            return (Criteria) this;
        }

        public Criteria andMagIssnNotLike(String value) {
            addCriterion("mag_issn not like", value, "magIssn");
            return (Criteria) this;
        }

        public Criteria andMagIssnIn(List<String> values) {
            addCriterion("mag_issn in", values, "magIssn");
            return (Criteria) this;
        }

        public Criteria andMagIssnNotIn(List<String> values) {
            addCriterion("mag_issn not in", values, "magIssn");
            return (Criteria) this;
        }

        public Criteria andMagIssnBetween(String value1, String value2) {
            addCriterion("mag_issn between", value1, value2, "magIssn");
            return (Criteria) this;
        }

        public Criteria andMagIssnNotBetween(String value1, String value2) {
            addCriterion("mag_issn not between", value1, value2, "magIssn");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Integer value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Integer value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Integer value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Integer value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Integer> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Integer> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Integer value1, Integer value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andMagJgTimeIsNull() {
            addCriterion("mag_jg_time is null");
            return (Criteria) this;
        }

        public Criteria andMagJgTimeIsNotNull() {
            addCriterion("mag_jg_time is not null");
            return (Criteria) this;
        }

        public Criteria andMagJgTimeEqualTo(Date value) {
            addCriterion("mag_jg_time =", value, "magJgTime");
            return (Criteria) this;
        }

        public Criteria andMagJgTimeNotEqualTo(Date value) {
            addCriterion("mag_jg_time <>", value, "magJgTime");
            return (Criteria) this;
        }

        public Criteria andMagJgTimeGreaterThan(Date value) {
            addCriterion("mag_jg_time >", value, "magJgTime");
            return (Criteria) this;
        }

        public Criteria andMagJgTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("mag_jg_time >=", value, "magJgTime");
            return (Criteria) this;
        }

        public Criteria andMagJgTimeLessThan(Date value) {
            addCriterion("mag_jg_time <", value, "magJgTime");
            return (Criteria) this;
        }

        public Criteria andMagJgTimeLessThanOrEqualTo(Date value) {
            addCriterion("mag_jg_time <=", value, "magJgTime");
            return (Criteria) this;
        }

        public Criteria andMagJgTimeIn(List<Date> values) {
            addCriterion("mag_jg_time in", values, "magJgTime");
            return (Criteria) this;
        }

        public Criteria andMagJgTimeNotIn(List<Date> values) {
            addCriterion("mag_jg_time not in", values, "magJgTime");
            return (Criteria) this;
        }

        public Criteria andMagJgTimeBetween(Date value1, Date value2) {
            addCriterion("mag_jg_time between", value1, value2, "magJgTime");
            return (Criteria) this;
        }

        public Criteria andMagJgTimeNotBetween(Date value1, Date value2) {
            addCriterion("mag_jg_time not between", value1, value2, "magJgTime");
            return (Criteria) this;
        }

        public Criteria andIsgetIsNull() {
            addCriterion("isget is null");
            return (Criteria) this;
        }

        public Criteria andIsgetIsNotNull() {
            addCriterion("isget is not null");
            return (Criteria) this;
        }

        public Criteria andIsgetEqualTo(Integer value) {
            addCriterion("isget =", value, "isget");
            return (Criteria) this;
        }

        public Criteria andIsgetNotEqualTo(Integer value) {
            addCriterion("isget <>", value, "isget");
            return (Criteria) this;
        }

        public Criteria andIsgetGreaterThan(Integer value) {
            addCriterion("isget >", value, "isget");
            return (Criteria) this;
        }

        public Criteria andIsgetGreaterThanOrEqualTo(Integer value) {
            addCriterion("isget >=", value, "isget");
            return (Criteria) this;
        }

        public Criteria andIsgetLessThan(Integer value) {
            addCriterion("isget <", value, "isget");
            return (Criteria) this;
        }

        public Criteria andIsgetLessThanOrEqualTo(Integer value) {
            addCriterion("isget <=", value, "isget");
            return (Criteria) this;
        }

        public Criteria andIsgetIn(List<Integer> values) {
            addCriterion("isget in", values, "isget");
            return (Criteria) this;
        }

        public Criteria andIsgetNotIn(List<Integer> values) {
            addCriterion("isget not in", values, "isget");
            return (Criteria) this;
        }

        public Criteria andIsgetBetween(Integer value1, Integer value2) {
            addCriterion("isget between", value1, value2, "isget");
            return (Criteria) this;
        }

        public Criteria andIsgetNotBetween(Integer value1, Integer value2) {
            addCriterion("isget not between", value1, value2, "isget");
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
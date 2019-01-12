package com.tsjg.core.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MagExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MagExample() {
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

        public Criteria andMagIdIsNull() {
            addCriterion("mag_id is null");
            return (Criteria) this;
        }

        public Criteria andMagIdIsNotNull() {
            addCriterion("mag_id is not null");
            return (Criteria) this;
        }

        public Criteria andMagIdEqualTo(Integer value) {
            addCriterion("mag_id =", value, "magId");
            return (Criteria) this;
        }

        public Criteria andMagIdNotEqualTo(Integer value) {
            addCriterion("mag_id <>", value, "magId");
            return (Criteria) this;
        }

        public Criteria andMagIdGreaterThan(Integer value) {
            addCriterion("mag_id >", value, "magId");
            return (Criteria) this;
        }

        public Criteria andMagIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("mag_id >=", value, "magId");
            return (Criteria) this;
        }

        public Criteria andMagIdLessThan(Integer value) {
            addCriterion("mag_id <", value, "magId");
            return (Criteria) this;
        }

        public Criteria andMagIdLessThanOrEqualTo(Integer value) {
            addCriterion("mag_id <=", value, "magId");
            return (Criteria) this;
        }

        public Criteria andMagIdIn(List<Integer> values) {
            addCriterion("mag_id in", values, "magId");
            return (Criteria) this;
        }

        public Criteria andMagIdNotIn(List<Integer> values) {
            addCriterion("mag_id not in", values, "magId");
            return (Criteria) this;
        }

        public Criteria andMagIdBetween(Integer value1, Integer value2) {
            addCriterion("mag_id between", value1, value2, "magId");
            return (Criteria) this;
        }

        public Criteria andMagIdNotBetween(Integer value1, Integer value2) {
            addCriterion("mag_id not between", value1, value2, "magId");
            return (Criteria) this;
        }

        public Criteria andMagTitleIsNull() {
            addCriterion("mag_title is null");
            return (Criteria) this;
        }

        public Criteria andMagTitleIsNotNull() {
            addCriterion("mag_title is not null");
            return (Criteria) this;
        }

        public Criteria andMagTitleEqualTo(String value) {
            addCriterion("mag_title =", value, "magTitle");
            return (Criteria) this;
        }

        public Criteria andMagTitleNotEqualTo(String value) {
            addCriterion("mag_title <>", value, "magTitle");
            return (Criteria) this;
        }

        public Criteria andMagTitleGreaterThan(String value) {
            addCriterion("mag_title >", value, "magTitle");
            return (Criteria) this;
        }

        public Criteria andMagTitleGreaterThanOrEqualTo(String value) {
            addCriterion("mag_title >=", value, "magTitle");
            return (Criteria) this;
        }

        public Criteria andMagTitleLessThan(String value) {
            addCriterion("mag_title <", value, "magTitle");
            return (Criteria) this;
        }

        public Criteria andMagTitleLessThanOrEqualTo(String value) {
            addCriterion("mag_title <=", value, "magTitle");
            return (Criteria) this;
        }

        public Criteria andMagTitleLike(String value) {
            addCriterion("mag_title like", value, "magTitle");
            return (Criteria) this;
        }

        public Criteria andMagTitleNotLike(String value) {
            addCriterion("mag_title not like", value, "magTitle");
            return (Criteria) this;
        }

        public Criteria andMagTitleIn(List<String> values) {
            addCriterion("mag_title in", values, "magTitle");
            return (Criteria) this;
        }

        public Criteria andMagTitleNotIn(List<String> values) {
            addCriterion("mag_title not in", values, "magTitle");
            return (Criteria) this;
        }

        public Criteria andMagTitleBetween(String value1, String value2) {
            addCriterion("mag_title between", value1, value2, "magTitle");
            return (Criteria) this;
        }

        public Criteria andMagTitleNotBetween(String value1, String value2) {
            addCriterion("mag_title not between", value1, value2, "magTitle");
            return (Criteria) this;
        }

        public Criteria andMagCompetentIsNull() {
            addCriterion("mag_competent is null");
            return (Criteria) this;
        }

        public Criteria andMagCompetentIsNotNull() {
            addCriterion("mag_competent is not null");
            return (Criteria) this;
        }

        public Criteria andMagCompetentEqualTo(String value) {
            addCriterion("mag_competent =", value, "magCompetent");
            return (Criteria) this;
        }

        public Criteria andMagCompetentNotEqualTo(String value) {
            addCriterion("mag_competent <>", value, "magCompetent");
            return (Criteria) this;
        }

        public Criteria andMagCompetentGreaterThan(String value) {
            addCriterion("mag_competent >", value, "magCompetent");
            return (Criteria) this;
        }

        public Criteria andMagCompetentGreaterThanOrEqualTo(String value) {
            addCriterion("mag_competent >=", value, "magCompetent");
            return (Criteria) this;
        }

        public Criteria andMagCompetentLessThan(String value) {
            addCriterion("mag_competent <", value, "magCompetent");
            return (Criteria) this;
        }

        public Criteria andMagCompetentLessThanOrEqualTo(String value) {
            addCriterion("mag_competent <=", value, "magCompetent");
            return (Criteria) this;
        }

        public Criteria andMagCompetentLike(String value) {
            addCriterion("mag_competent like", value, "magCompetent");
            return (Criteria) this;
        }

        public Criteria andMagCompetentNotLike(String value) {
            addCriterion("mag_competent not like", value, "magCompetent");
            return (Criteria) this;
        }

        public Criteria andMagCompetentIn(List<String> values) {
            addCriterion("mag_competent in", values, "magCompetent");
            return (Criteria) this;
        }

        public Criteria andMagCompetentNotIn(List<String> values) {
            addCriterion("mag_competent not in", values, "magCompetent");
            return (Criteria) this;
        }

        public Criteria andMagCompetentBetween(String value1, String value2) {
            addCriterion("mag_competent between", value1, value2, "magCompetent");
            return (Criteria) this;
        }

        public Criteria andMagCompetentNotBetween(String value1, String value2) {
            addCriterion("mag_competent not between", value1, value2, "magCompetent");
            return (Criteria) this;
        }

        public Criteria andMagHostunitIsNull() {
            addCriterion("mag_hostunit is null");
            return (Criteria) this;
        }

        public Criteria andMagHostunitIsNotNull() {
            addCriterion("mag_hostunit is not null");
            return (Criteria) this;
        }

        public Criteria andMagHostunitEqualTo(String value) {
            addCriterion("mag_hostunit =", value, "magHostunit");
            return (Criteria) this;
        }

        public Criteria andMagHostunitNotEqualTo(String value) {
            addCriterion("mag_hostunit <>", value, "magHostunit");
            return (Criteria) this;
        }

        public Criteria andMagHostunitGreaterThan(String value) {
            addCriterion("mag_hostunit >", value, "magHostunit");
            return (Criteria) this;
        }

        public Criteria andMagHostunitGreaterThanOrEqualTo(String value) {
            addCriterion("mag_hostunit >=", value, "magHostunit");
            return (Criteria) this;
        }

        public Criteria andMagHostunitLessThan(String value) {
            addCriterion("mag_hostunit <", value, "magHostunit");
            return (Criteria) this;
        }

        public Criteria andMagHostunitLessThanOrEqualTo(String value) {
            addCriterion("mag_hostunit <=", value, "magHostunit");
            return (Criteria) this;
        }

        public Criteria andMagHostunitLike(String value) {
            addCriterion("mag_hostunit like", value, "magHostunit");
            return (Criteria) this;
        }

        public Criteria andMagHostunitNotLike(String value) {
            addCriterion("mag_hostunit not like", value, "magHostunit");
            return (Criteria) this;
        }

        public Criteria andMagHostunitIn(List<String> values) {
            addCriterion("mag_hostunit in", values, "magHostunit");
            return (Criteria) this;
        }

        public Criteria andMagHostunitNotIn(List<String> values) {
            addCriterion("mag_hostunit not in", values, "magHostunit");
            return (Criteria) this;
        }

        public Criteria andMagHostunitBetween(String value1, String value2) {
            addCriterion("mag_hostunit between", value1, value2, "magHostunit");
            return (Criteria) this;
        }

        public Criteria andMagHostunitNotBetween(String value1, String value2) {
            addCriterion("mag_hostunit not between", value1, value2, "magHostunit");
            return (Criteria) this;
        }

        public Criteria andMagMailnumIsNull() {
            addCriterion("mag_mailnum is null");
            return (Criteria) this;
        }

        public Criteria andMagMailnumIsNotNull() {
            addCriterion("mag_mailnum is not null");
            return (Criteria) this;
        }

        public Criteria andMagMailnumEqualTo(String value) {
            addCriterion("mag_mailnum =", value, "magMailnum");
            return (Criteria) this;
        }

        public Criteria andMagMailnumNotEqualTo(String value) {
            addCriterion("mag_mailnum <>", value, "magMailnum");
            return (Criteria) this;
        }

        public Criteria andMagMailnumGreaterThan(String value) {
            addCriterion("mag_mailnum >", value, "magMailnum");
            return (Criteria) this;
        }

        public Criteria andMagMailnumGreaterThanOrEqualTo(String value) {
            addCriterion("mag_mailnum >=", value, "magMailnum");
            return (Criteria) this;
        }

        public Criteria andMagMailnumLessThan(String value) {
            addCriterion("mag_mailnum <", value, "magMailnum");
            return (Criteria) this;
        }

        public Criteria andMagMailnumLessThanOrEqualTo(String value) {
            addCriterion("mag_mailnum <=", value, "magMailnum");
            return (Criteria) this;
        }

        public Criteria andMagMailnumLike(String value) {
            addCriterion("mag_mailnum like", value, "magMailnum");
            return (Criteria) this;
        }

        public Criteria andMagMailnumNotLike(String value) {
            addCriterion("mag_mailnum not like", value, "magMailnum");
            return (Criteria) this;
        }

        public Criteria andMagMailnumIn(List<String> values) {
            addCriterion("mag_mailnum in", values, "magMailnum");
            return (Criteria) this;
        }

        public Criteria andMagMailnumNotIn(List<String> values) {
            addCriterion("mag_mailnum not in", values, "magMailnum");
            return (Criteria) this;
        }

        public Criteria andMagMailnumBetween(String value1, String value2) {
            addCriterion("mag_mailnum between", value1, value2, "magMailnum");
            return (Criteria) this;
        }

        public Criteria andMagMailnumNotBetween(String value1, String value2) {
            addCriterion("mag_mailnum not between", value1, value2, "magMailnum");
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

        public Criteria andMagCnIsNull() {
            addCriterion("mag_cn is null");
            return (Criteria) this;
        }

        public Criteria andMagCnIsNotNull() {
            addCriterion("mag_cn is not null");
            return (Criteria) this;
        }

        public Criteria andMagCnEqualTo(String value) {
            addCriterion("mag_cn =", value, "magCn");
            return (Criteria) this;
        }

        public Criteria andMagCnNotEqualTo(String value) {
            addCriterion("mag_cn <>", value, "magCn");
            return (Criteria) this;
        }

        public Criteria andMagCnGreaterThan(String value) {
            addCriterion("mag_cn >", value, "magCn");
            return (Criteria) this;
        }

        public Criteria andMagCnGreaterThanOrEqualTo(String value) {
            addCriterion("mag_cn >=", value, "magCn");
            return (Criteria) this;
        }

        public Criteria andMagCnLessThan(String value) {
            addCriterion("mag_cn <", value, "magCn");
            return (Criteria) this;
        }

        public Criteria andMagCnLessThanOrEqualTo(String value) {
            addCriterion("mag_cn <=", value, "magCn");
            return (Criteria) this;
        }

        public Criteria andMagCnLike(String value) {
            addCriterion("mag_cn like", value, "magCn");
            return (Criteria) this;
        }

        public Criteria andMagCnNotLike(String value) {
            addCriterion("mag_cn not like", value, "magCn");
            return (Criteria) this;
        }

        public Criteria andMagCnIn(List<String> values) {
            addCriterion("mag_cn in", values, "magCn");
            return (Criteria) this;
        }

        public Criteria andMagCnNotIn(List<String> values) {
            addCriterion("mag_cn not in", values, "magCn");
            return (Criteria) this;
        }

        public Criteria andMagCnBetween(String value1, String value2) {
            addCriterion("mag_cn between", value1, value2, "magCn");
            return (Criteria) this;
        }

        public Criteria andMagCnNotBetween(String value1, String value2) {
            addCriterion("mag_cn not between", value1, value2, "magCn");
            return (Criteria) this;
        }

        public Criteria andMagPubcycleIsNull() {
            addCriterion("mag_pubcycle is null");
            return (Criteria) this;
        }

        public Criteria andMagPubcycleIsNotNull() {
            addCriterion("mag_pubcycle is not null");
            return (Criteria) this;
        }

        public Criteria andMagPubcycleEqualTo(String value) {
            addCriterion("mag_pubcycle =", value, "magPubcycle");
            return (Criteria) this;
        }

        public Criteria andMagPubcycleNotEqualTo(String value) {
            addCriterion("mag_pubcycle <>", value, "magPubcycle");
            return (Criteria) this;
        }

        public Criteria andMagPubcycleGreaterThan(String value) {
            addCriterion("mag_pubcycle >", value, "magPubcycle");
            return (Criteria) this;
        }

        public Criteria andMagPubcycleGreaterThanOrEqualTo(String value) {
            addCriterion("mag_pubcycle >=", value, "magPubcycle");
            return (Criteria) this;
        }

        public Criteria andMagPubcycleLessThan(String value) {
            addCriterion("mag_pubcycle <", value, "magPubcycle");
            return (Criteria) this;
        }

        public Criteria andMagPubcycleLessThanOrEqualTo(String value) {
            addCriterion("mag_pubcycle <=", value, "magPubcycle");
            return (Criteria) this;
        }

        public Criteria andMagPubcycleLike(String value) {
            addCriterion("mag_pubcycle like", value, "magPubcycle");
            return (Criteria) this;
        }

        public Criteria andMagPubcycleNotLike(String value) {
            addCriterion("mag_pubcycle not like", value, "magPubcycle");
            return (Criteria) this;
        }

        public Criteria andMagPubcycleIn(List<String> values) {
            addCriterion("mag_pubcycle in", values, "magPubcycle");
            return (Criteria) this;
        }

        public Criteria andMagPubcycleNotIn(List<String> values) {
            addCriterion("mag_pubcycle not in", values, "magPubcycle");
            return (Criteria) this;
        }

        public Criteria andMagPubcycleBetween(String value1, String value2) {
            addCriterion("mag_pubcycle between", value1, value2, "magPubcycle");
            return (Criteria) this;
        }

        public Criteria andMagPubcycleNotBetween(String value1, String value2) {
            addCriterion("mag_pubcycle not between", value1, value2, "magPubcycle");
            return (Criteria) this;
        }

        public Criteria andMagIntroIsNull() {
            addCriterion("mag_intro is null");
            return (Criteria) this;
        }

        public Criteria andMagIntroIsNotNull() {
            addCriterion("mag_intro is not null");
            return (Criteria) this;
        }

        public Criteria andMagIntroEqualTo(String value) {
            addCriterion("mag_intro =", value, "magIntro");
            return (Criteria) this;
        }

        public Criteria andMagIntroNotEqualTo(String value) {
            addCriterion("mag_intro <>", value, "magIntro");
            return (Criteria) this;
        }

        public Criteria andMagIntroGreaterThan(String value) {
            addCriterion("mag_intro >", value, "magIntro");
            return (Criteria) this;
        }

        public Criteria andMagIntroGreaterThanOrEqualTo(String value) {
            addCriterion("mag_intro >=", value, "magIntro");
            return (Criteria) this;
        }

        public Criteria andMagIntroLessThan(String value) {
            addCriterion("mag_intro <", value, "magIntro");
            return (Criteria) this;
        }

        public Criteria andMagIntroLessThanOrEqualTo(String value) {
            addCriterion("mag_intro <=", value, "magIntro");
            return (Criteria) this;
        }

        public Criteria andMagIntroLike(String value) {
            addCriterion("mag_intro like", value, "magIntro");
            return (Criteria) this;
        }

        public Criteria andMagIntroNotLike(String value) {
            addCriterion("mag_intro not like", value, "magIntro");
            return (Criteria) this;
        }

        public Criteria andMagIntroIn(List<String> values) {
            addCriterion("mag_intro in", values, "magIntro");
            return (Criteria) this;
        }

        public Criteria andMagIntroNotIn(List<String> values) {
            addCriterion("mag_intro not in", values, "magIntro");
            return (Criteria) this;
        }

        public Criteria andMagIntroBetween(String value1, String value2) {
            addCriterion("mag_intro between", value1, value2, "magIntro");
            return (Criteria) this;
        }

        public Criteria andMagIntroNotBetween(String value1, String value2) {
            addCriterion("mag_intro not between", value1, value2, "magIntro");
            return (Criteria) this;
        }

        public Criteria andMagPriceIsNull() {
            addCriterion("mag_price is null");
            return (Criteria) this;
        }

        public Criteria andMagPriceIsNotNull() {
            addCriterion("mag_price is not null");
            return (Criteria) this;
        }

        public Criteria andMagPriceEqualTo(String value) {
            addCriterion("mag_price =", value, "magPrice");
            return (Criteria) this;
        }

        public Criteria andMagPriceNotEqualTo(String value) {
            addCriterion("mag_price <>", value, "magPrice");
            return (Criteria) this;
        }

        public Criteria andMagPriceGreaterThan(String value) {
            addCriterion("mag_price >", value, "magPrice");
            return (Criteria) this;
        }

        public Criteria andMagPriceGreaterThanOrEqualTo(String value) {
            addCriterion("mag_price >=", value, "magPrice");
            return (Criteria) this;
        }

        public Criteria andMagPriceLessThan(String value) {
            addCriterion("mag_price <", value, "magPrice");
            return (Criteria) this;
        }

        public Criteria andMagPriceLessThanOrEqualTo(String value) {
            addCriterion("mag_price <=", value, "magPrice");
            return (Criteria) this;
        }

        public Criteria andMagPriceLike(String value) {
            addCriterion("mag_price like", value, "magPrice");
            return (Criteria) this;
        }

        public Criteria andMagPriceNotLike(String value) {
            addCriterion("mag_price not like", value, "magPrice");
            return (Criteria) this;
        }

        public Criteria andMagPriceIn(List<String> values) {
            addCriterion("mag_price in", values, "magPrice");
            return (Criteria) this;
        }

        public Criteria andMagPriceNotIn(List<String> values) {
            addCriterion("mag_price not in", values, "magPrice");
            return (Criteria) this;
        }

        public Criteria andMagPriceBetween(String value1, String value2) {
            addCriterion("mag_price between", value1, value2, "magPrice");
            return (Criteria) this;
        }

        public Criteria andMagPriceNotBetween(String value1, String value2) {
            addCriterion("mag_price not between", value1, value2, "magPrice");
            return (Criteria) this;
        }

        public Criteria andMagImgurlIsNull() {
            addCriterion("mag_imgurl is null");
            return (Criteria) this;
        }

        public Criteria andMagImgurlIsNotNull() {
            addCriterion("mag_imgurl is not null");
            return (Criteria) this;
        }

        public Criteria andMagImgurlEqualTo(String value) {
            addCriterion("mag_imgurl =", value, "magImgurl");
            return (Criteria) this;
        }

        public Criteria andMagImgurlNotEqualTo(String value) {
            addCriterion("mag_imgurl <>", value, "magImgurl");
            return (Criteria) this;
        }

        public Criteria andMagImgurlGreaterThan(String value) {
            addCriterion("mag_imgurl >", value, "magImgurl");
            return (Criteria) this;
        }

        public Criteria andMagImgurlGreaterThanOrEqualTo(String value) {
            addCriterion("mag_imgurl >=", value, "magImgurl");
            return (Criteria) this;
        }

        public Criteria andMagImgurlLessThan(String value) {
            addCriterion("mag_imgurl <", value, "magImgurl");
            return (Criteria) this;
        }

        public Criteria andMagImgurlLessThanOrEqualTo(String value) {
            addCriterion("mag_imgurl <=", value, "magImgurl");
            return (Criteria) this;
        }

        public Criteria andMagImgurlLike(String value) {
            addCriterion("mag_imgurl like", value, "magImgurl");
            return (Criteria) this;
        }

        public Criteria andMagImgurlNotLike(String value) {
            addCriterion("mag_imgurl not like", value, "magImgurl");
            return (Criteria) this;
        }

        public Criteria andMagImgurlIn(List<String> values) {
            addCriterion("mag_imgurl in", values, "magImgurl");
            return (Criteria) this;
        }

        public Criteria andMagImgurlNotIn(List<String> values) {
            addCriterion("mag_imgurl not in", values, "magImgurl");
            return (Criteria) this;
        }

        public Criteria andMagImgurlBetween(String value1, String value2) {
            addCriterion("mag_imgurl between", value1, value2, "magImgurl");
            return (Criteria) this;
        }

        public Criteria andMagImgurlNotBetween(String value1, String value2) {
            addCriterion("mag_imgurl not between", value1, value2, "magImgurl");
            return (Criteria) this;
        }

        public Criteria andMagCategoryIdIsNull() {
            addCriterion("mag_category_id is null");
            return (Criteria) this;
        }

        public Criteria andMagCategoryIdIsNotNull() {
            addCriterion("mag_category_id is not null");
            return (Criteria) this;
        }

        public Criteria andMagCategoryIdEqualTo(String value) {
            addCriterion("mag_category_id =", value, "magCategoryId");
            return (Criteria) this;
        }

        public Criteria andMagCategoryIdNotEqualTo(String value) {
            addCriterion("mag_category_id <>", value, "magCategoryId");
            return (Criteria) this;
        }

        public Criteria andMagCategoryIdGreaterThan(String value) {
            addCriterion("mag_category_id >", value, "magCategoryId");
            return (Criteria) this;
        }

        public Criteria andMagCategoryIdGreaterThanOrEqualTo(String value) {
            addCriterion("mag_category_id >=", value, "magCategoryId");
            return (Criteria) this;
        }

        public Criteria andMagCategoryIdLessThan(String value) {
            addCriterion("mag_category_id <", value, "magCategoryId");
            return (Criteria) this;
        }

        public Criteria andMagCategoryIdLessThanOrEqualTo(String value) {
            addCriterion("mag_category_id <=", value, "magCategoryId");
            return (Criteria) this;
        }

        public Criteria andMagCategoryIdLike(String value) {
            addCriterion("mag_category_id like", value, "magCategoryId");
            return (Criteria) this;
        }

        public Criteria andMagCategoryIdNotLike(String value) {
            addCriterion("mag_category_id not like", value, "magCategoryId");
            return (Criteria) this;
        }

        public Criteria andMagCategoryIdIn(List<String> values) {
            addCriterion("mag_category_id in", values, "magCategoryId");
            return (Criteria) this;
        }

        public Criteria andMagCategoryIdNotIn(List<String> values) {
            addCriterion("mag_category_id not in", values, "magCategoryId");
            return (Criteria) this;
        }

        public Criteria andMagCategoryIdBetween(String value1, String value2) {
            addCriterion("mag_category_id between", value1, value2, "magCategoryId");
            return (Criteria) this;
        }

        public Criteria andMagCategoryIdNotBetween(String value1, String value2) {
            addCriterion("mag_category_id not between", value1, value2, "magCategoryId");
            return (Criteria) this;
        }

        public Criteria andMagAddtimeIsNull() {
            addCriterion("mag_addtime is null");
            return (Criteria) this;
        }

        public Criteria andMagAddtimeIsNotNull() {
            addCriterion("mag_addtime is not null");
            return (Criteria) this;
        }

        public Criteria andMagAddtimeEqualTo(Date value) {
            addCriterion("mag_addtime =", value, "magAddtime");
            return (Criteria) this;
        }

        public Criteria andMagAddtimeNotEqualTo(Date value) {
            addCriterion("mag_addtime <>", value, "magAddtime");
            return (Criteria) this;
        }

        public Criteria andMagAddtimeGreaterThan(Date value) {
            addCriterion("mag_addtime >", value, "magAddtime");
            return (Criteria) this;
        }

        public Criteria andMagAddtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("mag_addtime >=", value, "magAddtime");
            return (Criteria) this;
        }

        public Criteria andMagAddtimeLessThan(Date value) {
            addCriterion("mag_addtime <", value, "magAddtime");
            return (Criteria) this;
        }

        public Criteria andMagAddtimeLessThanOrEqualTo(Date value) {
            addCriterion("mag_addtime <=", value, "magAddtime");
            return (Criteria) this;
        }

        public Criteria andMagAddtimeIn(List<Date> values) {
            addCriterion("mag_addtime in", values, "magAddtime");
            return (Criteria) this;
        }

        public Criteria andMagAddtimeNotIn(List<Date> values) {
            addCriterion("mag_addtime not in", values, "magAddtime");
            return (Criteria) this;
        }

        public Criteria andMagAddtimeBetween(Date value1, Date value2) {
            addCriterion("mag_addtime between", value1, value2, "magAddtime");
            return (Criteria) this;
        }

        public Criteria andMagAddtimeNotBetween(Date value1, Date value2) {
            addCriterion("mag_addtime not between", value1, value2, "magAddtime");
            return (Criteria) this;
        }

        public Criteria andMagNumIsNull() {
            addCriterion("mag_num is null");
            return (Criteria) this;
        }

        public Criteria andMagNumIsNotNull() {
            addCriterion("mag_num is not null");
            return (Criteria) this;
        }

        public Criteria andMagNumEqualTo(Integer value) {
            addCriterion("mag_num =", value, "magNum");
            return (Criteria) this;
        }

        public Criteria andMagNumNotEqualTo(Integer value) {
            addCriterion("mag_num <>", value, "magNum");
            return (Criteria) this;
        }

        public Criteria andMagNumGreaterThan(Integer value) {
            addCriterion("mag_num >", value, "magNum");
            return (Criteria) this;
        }

        public Criteria andMagNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("mag_num >=", value, "magNum");
            return (Criteria) this;
        }

        public Criteria andMagNumLessThan(Integer value) {
            addCriterion("mag_num <", value, "magNum");
            return (Criteria) this;
        }

        public Criteria andMagNumLessThanOrEqualTo(Integer value) {
            addCriterion("mag_num <=", value, "magNum");
            return (Criteria) this;
        }

        public Criteria andMagNumIn(List<Integer> values) {
            addCriterion("mag_num in", values, "magNum");
            return (Criteria) this;
        }

        public Criteria andMagNumNotIn(List<Integer> values) {
            addCriterion("mag_num not in", values, "magNum");
            return (Criteria) this;
        }

        public Criteria andMagNumBetween(Integer value1, Integer value2) {
            addCriterion("mag_num between", value1, value2, "magNum");
            return (Criteria) this;
        }

        public Criteria andMagNumNotBetween(Integer value1, Integer value2) {
            addCriterion("mag_num not between", value1, value2, "magNum");
            return (Criteria) this;
        }

        public Criteria andMagIsgetIsNull() {
            addCriterion("mag_isget is null");
            return (Criteria) this;
        }

        public Criteria andMagIsgetIsNotNull() {
            addCriterion("mag_isget is not null");
            return (Criteria) this;
        }

        public Criteria andMagIsgetEqualTo(Integer value) {
            addCriterion("mag_isget =", value, "magIsget");
            return (Criteria) this;
        }

        public Criteria andMagIsgetNotEqualTo(Integer value) {
            addCriterion("mag_isget <>", value, "magIsget");
            return (Criteria) this;
        }

        public Criteria andMagIsgetGreaterThan(Integer value) {
            addCriterion("mag_isget >", value, "magIsget");
            return (Criteria) this;
        }

        public Criteria andMagIsgetGreaterThanOrEqualTo(Integer value) {
            addCriterion("mag_isget >=", value, "magIsget");
            return (Criteria) this;
        }

        public Criteria andMagIsgetLessThan(Integer value) {
            addCriterion("mag_isget <", value, "magIsget");
            return (Criteria) this;
        }

        public Criteria andMagIsgetLessThanOrEqualTo(Integer value) {
            addCriterion("mag_isget <=", value, "magIsget");
            return (Criteria) this;
        }

        public Criteria andMagIsgetIn(List<Integer> values) {
            addCriterion("mag_isget in", values, "magIsget");
            return (Criteria) this;
        }

        public Criteria andMagIsgetNotIn(List<Integer> values) {
            addCriterion("mag_isget not in", values, "magIsget");
            return (Criteria) this;
        }

        public Criteria andMagIsgetBetween(Integer value1, Integer value2) {
            addCriterion("mag_isget between", value1, value2, "magIsget");
            return (Criteria) this;
        }

        public Criteria andMagIsgetNotBetween(Integer value1, Integer value2) {
            addCriterion("mag_isget not between", value1, value2, "magIsget");
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
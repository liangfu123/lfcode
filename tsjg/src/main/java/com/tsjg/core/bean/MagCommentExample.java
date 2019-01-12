package com.tsjg.core.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MagCommentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MagCommentExample() {
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

        public Criteria andMcIdIsNull() {
            addCriterion("mc_id is null");
            return (Criteria) this;
        }

        public Criteria andMcIdIsNotNull() {
            addCriterion("mc_id is not null");
            return (Criteria) this;
        }

        public Criteria andMcIdEqualTo(Integer value) {
            addCriterion("mc_id =", value, "mcId");
            return (Criteria) this;
        }

        public Criteria andMcIdNotEqualTo(Integer value) {
            addCriterion("mc_id <>", value, "mcId");
            return (Criteria) this;
        }

        public Criteria andMcIdGreaterThan(Integer value) {
            addCriterion("mc_id >", value, "mcId");
            return (Criteria) this;
        }

        public Criteria andMcIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("mc_id >=", value, "mcId");
            return (Criteria) this;
        }

        public Criteria andMcIdLessThan(Integer value) {
            addCriterion("mc_id <", value, "mcId");
            return (Criteria) this;
        }

        public Criteria andMcIdLessThanOrEqualTo(Integer value) {
            addCriterion("mc_id <=", value, "mcId");
            return (Criteria) this;
        }

        public Criteria andMcIdIn(List<Integer> values) {
            addCriterion("mc_id in", values, "mcId");
            return (Criteria) this;
        }

        public Criteria andMcIdNotIn(List<Integer> values) {
            addCriterion("mc_id not in", values, "mcId");
            return (Criteria) this;
        }

        public Criteria andMcIdBetween(Integer value1, Integer value2) {
            addCriterion("mc_id between", value1, value2, "mcId");
            return (Criteria) this;
        }

        public Criteria andMcIdNotBetween(Integer value1, Integer value2) {
            addCriterion("mc_id not between", value1, value2, "mcId");
            return (Criteria) this;
        }

        public Criteria andMcContentIsNull() {
            addCriterion("mc_content is null");
            return (Criteria) this;
        }

        public Criteria andMcContentIsNotNull() {
            addCriterion("mc_content is not null");
            return (Criteria) this;
        }

        public Criteria andMcContentEqualTo(String value) {
            addCriterion("mc_content =", value, "mcContent");
            return (Criteria) this;
        }

        public Criteria andMcContentNotEqualTo(String value) {
            addCriterion("mc_content <>", value, "mcContent");
            return (Criteria) this;
        }

        public Criteria andMcContentGreaterThan(String value) {
            addCriterion("mc_content >", value, "mcContent");
            return (Criteria) this;
        }

        public Criteria andMcContentGreaterThanOrEqualTo(String value) {
            addCriterion("mc_content >=", value, "mcContent");
            return (Criteria) this;
        }

        public Criteria andMcContentLessThan(String value) {
            addCriterion("mc_content <", value, "mcContent");
            return (Criteria) this;
        }

        public Criteria andMcContentLessThanOrEqualTo(String value) {
            addCriterion("mc_content <=", value, "mcContent");
            return (Criteria) this;
        }

        public Criteria andMcContentLike(String value) {
            addCriterion("mc_content like", value, "mcContent");
            return (Criteria) this;
        }

        public Criteria andMcContentNotLike(String value) {
            addCriterion("mc_content not like", value, "mcContent");
            return (Criteria) this;
        }

        public Criteria andMcContentIn(List<String> values) {
            addCriterion("mc_content in", values, "mcContent");
            return (Criteria) this;
        }

        public Criteria andMcContentNotIn(List<String> values) {
            addCriterion("mc_content not in", values, "mcContent");
            return (Criteria) this;
        }

        public Criteria andMcContentBetween(String value1, String value2) {
            addCriterion("mc_content between", value1, value2, "mcContent");
            return (Criteria) this;
        }

        public Criteria andMcContentNotBetween(String value1, String value2) {
            addCriterion("mc_content not between", value1, value2, "mcContent");
            return (Criteria) this;
        }

        public Criteria andMcTimeIsNull() {
            addCriterion("mc_time is null");
            return (Criteria) this;
        }

        public Criteria andMcTimeIsNotNull() {
            addCriterion("mc_time is not null");
            return (Criteria) this;
        }

        public Criteria andMcTimeEqualTo(Date value) {
            addCriterion("mc_time =", value, "mcTime");
            return (Criteria) this;
        }

        public Criteria andMcTimeNotEqualTo(Date value) {
            addCriterion("mc_time <>", value, "mcTime");
            return (Criteria) this;
        }

        public Criteria andMcTimeGreaterThan(Date value) {
            addCriterion("mc_time >", value, "mcTime");
            return (Criteria) this;
        }

        public Criteria andMcTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("mc_time >=", value, "mcTime");
            return (Criteria) this;
        }

        public Criteria andMcTimeLessThan(Date value) {
            addCriterion("mc_time <", value, "mcTime");
            return (Criteria) this;
        }

        public Criteria andMcTimeLessThanOrEqualTo(Date value) {
            addCriterion("mc_time <=", value, "mcTime");
            return (Criteria) this;
        }

        public Criteria andMcTimeIn(List<Date> values) {
            addCriterion("mc_time in", values, "mcTime");
            return (Criteria) this;
        }

        public Criteria andMcTimeNotIn(List<Date> values) {
            addCriterion("mc_time not in", values, "mcTime");
            return (Criteria) this;
        }

        public Criteria andMcTimeBetween(Date value1, Date value2) {
            addCriterion("mc_time between", value1, value2, "mcTime");
            return (Criteria) this;
        }

        public Criteria andMcTimeNotBetween(Date value1, Date value2) {
            addCriterion("mc_time not between", value1, value2, "mcTime");
            return (Criteria) this;
        }

        public Criteria andMcNouseIsNull() {
            addCriterion("mc_nouse is null");
            return (Criteria) this;
        }

        public Criteria andMcNouseIsNotNull() {
            addCriterion("mc_nouse is not null");
            return (Criteria) this;
        }

        public Criteria andMcNouseEqualTo(Integer value) {
            addCriterion("mc_nouse =", value, "mcNouse");
            return (Criteria) this;
        }

        public Criteria andMcNouseNotEqualTo(Integer value) {
            addCriterion("mc_nouse <>", value, "mcNouse");
            return (Criteria) this;
        }

        public Criteria andMcNouseGreaterThan(Integer value) {
            addCriterion("mc_nouse >", value, "mcNouse");
            return (Criteria) this;
        }

        public Criteria andMcNouseGreaterThanOrEqualTo(Integer value) {
            addCriterion("mc_nouse >=", value, "mcNouse");
            return (Criteria) this;
        }

        public Criteria andMcNouseLessThan(Integer value) {
            addCriterion("mc_nouse <", value, "mcNouse");
            return (Criteria) this;
        }

        public Criteria andMcNouseLessThanOrEqualTo(Integer value) {
            addCriterion("mc_nouse <=", value, "mcNouse");
            return (Criteria) this;
        }

        public Criteria andMcNouseIn(List<Integer> values) {
            addCriterion("mc_nouse in", values, "mcNouse");
            return (Criteria) this;
        }

        public Criteria andMcNouseNotIn(List<Integer> values) {
            addCriterion("mc_nouse not in", values, "mcNouse");
            return (Criteria) this;
        }

        public Criteria andMcNouseBetween(Integer value1, Integer value2) {
            addCriterion("mc_nouse between", value1, value2, "mcNouse");
            return (Criteria) this;
        }

        public Criteria andMcNouseNotBetween(Integer value1, Integer value2) {
            addCriterion("mc_nouse not between", value1, value2, "mcNouse");
            return (Criteria) this;
        }

        public Criteria andMcBeuseIsNull() {
            addCriterion("mc_beuse is null");
            return (Criteria) this;
        }

        public Criteria andMcBeuseIsNotNull() {
            addCriterion("mc_beuse is not null");
            return (Criteria) this;
        }

        public Criteria andMcBeuseEqualTo(Integer value) {
            addCriterion("mc_beuse =", value, "mcBeuse");
            return (Criteria) this;
        }

        public Criteria andMcBeuseNotEqualTo(Integer value) {
            addCriterion("mc_beuse <>", value, "mcBeuse");
            return (Criteria) this;
        }

        public Criteria andMcBeuseGreaterThan(Integer value) {
            addCriterion("mc_beuse >", value, "mcBeuse");
            return (Criteria) this;
        }

        public Criteria andMcBeuseGreaterThanOrEqualTo(Integer value) {
            addCriterion("mc_beuse >=", value, "mcBeuse");
            return (Criteria) this;
        }

        public Criteria andMcBeuseLessThan(Integer value) {
            addCriterion("mc_beuse <", value, "mcBeuse");
            return (Criteria) this;
        }

        public Criteria andMcBeuseLessThanOrEqualTo(Integer value) {
            addCriterion("mc_beuse <=", value, "mcBeuse");
            return (Criteria) this;
        }

        public Criteria andMcBeuseIn(List<Integer> values) {
            addCriterion("mc_beuse in", values, "mcBeuse");
            return (Criteria) this;
        }

        public Criteria andMcBeuseNotIn(List<Integer> values) {
            addCriterion("mc_beuse not in", values, "mcBeuse");
            return (Criteria) this;
        }

        public Criteria andMcBeuseBetween(Integer value1, Integer value2) {
            addCriterion("mc_beuse between", value1, value2, "mcBeuse");
            return (Criteria) this;
        }

        public Criteria andMcBeuseNotBetween(Integer value1, Integer value2) {
            addCriterion("mc_beuse not between", value1, value2, "mcBeuse");
            return (Criteria) this;
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
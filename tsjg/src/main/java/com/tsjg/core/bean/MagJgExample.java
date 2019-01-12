package com.tsjg.core.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MagJgExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MagJgExample() {
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

        public Criteria andMagjgIdIsNull() {
            addCriterion("magjg_id is null");
            return (Criteria) this;
        }

        public Criteria andMagjgIdIsNotNull() {
            addCriterion("magjg_id is not null");
            return (Criteria) this;
        }

        public Criteria andMagjgIdEqualTo(Integer value) {
            addCriterion("magjg_id =", value, "magjgId");
            return (Criteria) this;
        }

        public Criteria andMagjgIdNotEqualTo(Integer value) {
            addCriterion("magjg_id <>", value, "magjgId");
            return (Criteria) this;
        }

        public Criteria andMagjgIdGreaterThan(Integer value) {
            addCriterion("magjg_id >", value, "magjgId");
            return (Criteria) this;
        }

        public Criteria andMagjgIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("magjg_id >=", value, "magjgId");
            return (Criteria) this;
        }

        public Criteria andMagjgIdLessThan(Integer value) {
            addCriterion("magjg_id <", value, "magjgId");
            return (Criteria) this;
        }

        public Criteria andMagjgIdLessThanOrEqualTo(Integer value) {
            addCriterion("magjg_id <=", value, "magjgId");
            return (Criteria) this;
        }

        public Criteria andMagjgIdIn(List<Integer> values) {
            addCriterion("magjg_id in", values, "magjgId");
            return (Criteria) this;
        }

        public Criteria andMagjgIdNotIn(List<Integer> values) {
            addCriterion("magjg_id not in", values, "magjgId");
            return (Criteria) this;
        }

        public Criteria andMagjgIdBetween(Integer value1, Integer value2) {
            addCriterion("magjg_id between", value1, value2, "magjgId");
            return (Criteria) this;
        }

        public Criteria andMagjgIdNotBetween(Integer value1, Integer value2) {
            addCriterion("magjg_id not between", value1, value2, "magjgId");
            return (Criteria) this;
        }

        public Criteria andMagjgTimeIsNull() {
            addCriterion("magjg_time is null");
            return (Criteria) this;
        }

        public Criteria andMagjgTimeIsNotNull() {
            addCriterion("magjg_time is not null");
            return (Criteria) this;
        }

        public Criteria andMagjgTimeEqualTo(Date value) {
            addCriterion("magjg_time =", value, "magjgTime");
            return (Criteria) this;
        }

        public Criteria andMagjgTimeNotEqualTo(Date value) {
            addCriterion("magjg_time <>", value, "magjgTime");
            return (Criteria) this;
        }

        public Criteria andMagjgTimeGreaterThan(Date value) {
            addCriterion("magjg_time >", value, "magjgTime");
            return (Criteria) this;
        }

        public Criteria andMagjgTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("magjg_time >=", value, "magjgTime");
            return (Criteria) this;
        }

        public Criteria andMagjgTimeLessThan(Date value) {
            addCriterion("magjg_time <", value, "magjgTime");
            return (Criteria) this;
        }

        public Criteria andMagjgTimeLessThanOrEqualTo(Date value) {
            addCriterion("magjg_time <=", value, "magjgTime");
            return (Criteria) this;
        }

        public Criteria andMagjgTimeIn(List<Date> values) {
            addCriterion("magjg_time in", values, "magjgTime");
            return (Criteria) this;
        }

        public Criteria andMagjgTimeNotIn(List<Date> values) {
            addCriterion("magjg_time not in", values, "magjgTime");
            return (Criteria) this;
        }

        public Criteria andMagjgTimeBetween(Date value1, Date value2) {
            addCriterion("magjg_time between", value1, value2, "magjgTime");
            return (Criteria) this;
        }

        public Criteria andMagjgTimeNotBetween(Date value1, Date value2) {
            addCriterion("magjg_time not between", value1, value2, "magjgTime");
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
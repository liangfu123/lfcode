package com.tsjg.core.bean;

import java.util.ArrayList;
import java.util.List;

public class MagCollectionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MagCollectionExample() {
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

        public Criteria andMagCollectionIdIsNull() {
            addCriterion("mag_collection_id is null");
            return (Criteria) this;
        }

        public Criteria andMagCollectionIdIsNotNull() {
            addCriterion("mag_collection_id is not null");
            return (Criteria) this;
        }

        public Criteria andMagCollectionIdEqualTo(Integer value) {
            addCriterion("mag_collection_id =", value, "magCollectionId");
            return (Criteria) this;
        }

        public Criteria andMagCollectionIdNotEqualTo(Integer value) {
            addCriterion("mag_collection_id <>", value, "magCollectionId");
            return (Criteria) this;
        }

        public Criteria andMagCollectionIdGreaterThan(Integer value) {
            addCriterion("mag_collection_id >", value, "magCollectionId");
            return (Criteria) this;
        }

        public Criteria andMagCollectionIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("mag_collection_id >=", value, "magCollectionId");
            return (Criteria) this;
        }

        public Criteria andMagCollectionIdLessThan(Integer value) {
            addCriterion("mag_collection_id <", value, "magCollectionId");
            return (Criteria) this;
        }

        public Criteria andMagCollectionIdLessThanOrEqualTo(Integer value) {
            addCriterion("mag_collection_id <=", value, "magCollectionId");
            return (Criteria) this;
        }

        public Criteria andMagCollectionIdIn(List<Integer> values) {
            addCriterion("mag_collection_id in", values, "magCollectionId");
            return (Criteria) this;
        }

        public Criteria andMagCollectionIdNotIn(List<Integer> values) {
            addCriterion("mag_collection_id not in", values, "magCollectionId");
            return (Criteria) this;
        }

        public Criteria andMagCollectionIdBetween(Integer value1, Integer value2) {
            addCriterion("mag_collection_id between", value1, value2, "magCollectionId");
            return (Criteria) this;
        }

        public Criteria andMagCollectionIdNotBetween(Integer value1, Integer value2) {
            addCriterion("mag_collection_id not between", value1, value2, "magCollectionId");
            return (Criteria) this;
        }

        public Criteria andIssnIsNull() {
            addCriterion("issn is null");
            return (Criteria) this;
        }

        public Criteria andIssnIsNotNull() {
            addCriterion("issn is not null");
            return (Criteria) this;
        }

        public Criteria andIssnEqualTo(String value) {
            addCriterion("issn =", value, "issn");
            return (Criteria) this;
        }

        public Criteria andIssnNotEqualTo(String value) {
            addCriterion("issn <>", value, "issn");
            return (Criteria) this;
        }

        public Criteria andIssnGreaterThan(String value) {
            addCriterion("issn >", value, "issn");
            return (Criteria) this;
        }

        public Criteria andIssnGreaterThanOrEqualTo(String value) {
            addCriterion("issn >=", value, "issn");
            return (Criteria) this;
        }

        public Criteria andIssnLessThan(String value) {
            addCriterion("issn <", value, "issn");
            return (Criteria) this;
        }

        public Criteria andIssnLessThanOrEqualTo(String value) {
            addCriterion("issn <=", value, "issn");
            return (Criteria) this;
        }

        public Criteria andIssnLike(String value) {
            addCriterion("issn like", value, "issn");
            return (Criteria) this;
        }

        public Criteria andIssnNotLike(String value) {
            addCriterion("issn not like", value, "issn");
            return (Criteria) this;
        }

        public Criteria andIssnIn(List<String> values) {
            addCriterion("issn in", values, "issn");
            return (Criteria) this;
        }

        public Criteria andIssnNotIn(List<String> values) {
            addCriterion("issn not in", values, "issn");
            return (Criteria) this;
        }

        public Criteria andIssnBetween(String value1, String value2) {
            addCriterion("issn between", value1, value2, "issn");
            return (Criteria) this;
        }

        public Criteria andIssnNotBetween(String value1, String value2) {
            addCriterion("issn not between", value1, value2, "issn");
            return (Criteria) this;
        }

        public Criteria andMagLocationIsNull() {
            addCriterion("mag_location is null");
            return (Criteria) this;
        }

        public Criteria andMagLocationIsNotNull() {
            addCriterion("mag_location is not null");
            return (Criteria) this;
        }

        public Criteria andMagLocationEqualTo(String value) {
            addCriterion("mag_location =", value, "magLocation");
            return (Criteria) this;
        }

        public Criteria andMagLocationNotEqualTo(String value) {
            addCriterion("mag_location <>", value, "magLocation");
            return (Criteria) this;
        }

        public Criteria andMagLocationGreaterThan(String value) {
            addCriterion("mag_location >", value, "magLocation");
            return (Criteria) this;
        }

        public Criteria andMagLocationGreaterThanOrEqualTo(String value) {
            addCriterion("mag_location >=", value, "magLocation");
            return (Criteria) this;
        }

        public Criteria andMagLocationLessThan(String value) {
            addCriterion("mag_location <", value, "magLocation");
            return (Criteria) this;
        }

        public Criteria andMagLocationLessThanOrEqualTo(String value) {
            addCriterion("mag_location <=", value, "magLocation");
            return (Criteria) this;
        }

        public Criteria andMagLocationLike(String value) {
            addCriterion("mag_location like", value, "magLocation");
            return (Criteria) this;
        }

        public Criteria andMagLocationNotLike(String value) {
            addCriterion("mag_location not like", value, "magLocation");
            return (Criteria) this;
        }

        public Criteria andMagLocationIn(List<String> values) {
            addCriterion("mag_location in", values, "magLocation");
            return (Criteria) this;
        }

        public Criteria andMagLocationNotIn(List<String> values) {
            addCriterion("mag_location not in", values, "magLocation");
            return (Criteria) this;
        }

        public Criteria andMagLocationBetween(String value1, String value2) {
            addCriterion("mag_location between", value1, value2, "magLocation");
            return (Criteria) this;
        }

        public Criteria andMagLocationNotBetween(String value1, String value2) {
            addCriterion("mag_location not between", value1, value2, "magLocation");
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
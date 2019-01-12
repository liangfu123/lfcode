package com.tsjg.core.bean;

import java.util.ArrayList;
import java.util.List;

public class BookCollectionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BookCollectionExample() {
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

        public Criteria andBookCollectionIdIsNull() {
            addCriterion("book_collection_id is null");
            return (Criteria) this;
        }

        public Criteria andBookCollectionIdIsNotNull() {
            addCriterion("book_collection_id is not null");
            return (Criteria) this;
        }

        public Criteria andBookCollectionIdEqualTo(Integer value) {
            addCriterion("book_collection_id =", value, "bookCollectionId");
            return (Criteria) this;
        }

        public Criteria andBookCollectionIdNotEqualTo(Integer value) {
            addCriterion("book_collection_id <>", value, "bookCollectionId");
            return (Criteria) this;
        }

        public Criteria andBookCollectionIdGreaterThan(Integer value) {
            addCriterion("book_collection_id >", value, "bookCollectionId");
            return (Criteria) this;
        }

        public Criteria andBookCollectionIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("book_collection_id >=", value, "bookCollectionId");
            return (Criteria) this;
        }

        public Criteria andBookCollectionIdLessThan(Integer value) {
            addCriterion("book_collection_id <", value, "bookCollectionId");
            return (Criteria) this;
        }

        public Criteria andBookCollectionIdLessThanOrEqualTo(Integer value) {
            addCriterion("book_collection_id <=", value, "bookCollectionId");
            return (Criteria) this;
        }

        public Criteria andBookCollectionIdIn(List<Integer> values) {
            addCriterion("book_collection_id in", values, "bookCollectionId");
            return (Criteria) this;
        }

        public Criteria andBookCollectionIdNotIn(List<Integer> values) {
            addCriterion("book_collection_id not in", values, "bookCollectionId");
            return (Criteria) this;
        }

        public Criteria andBookCollectionIdBetween(Integer value1, Integer value2) {
            addCriterion("book_collection_id between", value1, value2, "bookCollectionId");
            return (Criteria) this;
        }

        public Criteria andBookCollectionIdNotBetween(Integer value1, Integer value2) {
            addCriterion("book_collection_id not between", value1, value2, "bookCollectionId");
            return (Criteria) this;
        }

        public Criteria andIsbnIsNull() {
            addCriterion("isbn is null");
            return (Criteria) this;
        }

        public Criteria andIsbnIsNotNull() {
            addCriterion("isbn is not null");
            return (Criteria) this;
        }

        public Criteria andIsbnEqualTo(String value) {
            addCriterion("isbn =", value, "isbn");
            return (Criteria) this;
        }

        public Criteria andIsbnNotEqualTo(String value) {
            addCriterion("isbn <>", value, "isbn");
            return (Criteria) this;
        }

        public Criteria andIsbnGreaterThan(String value) {
            addCriterion("isbn >", value, "isbn");
            return (Criteria) this;
        }

        public Criteria andIsbnGreaterThanOrEqualTo(String value) {
            addCriterion("isbn >=", value, "isbn");
            return (Criteria) this;
        }

        public Criteria andIsbnLessThan(String value) {
            addCriterion("isbn <", value, "isbn");
            return (Criteria) this;
        }

        public Criteria andIsbnLessThanOrEqualTo(String value) {
            addCriterion("isbn <=", value, "isbn");
            return (Criteria) this;
        }

        public Criteria andIsbnLike(String value) {
            addCriterion("isbn like", value, "isbn");
            return (Criteria) this;
        }

        public Criteria andIsbnNotLike(String value) {
            addCriterion("isbn not like", value, "isbn");
            return (Criteria) this;
        }

        public Criteria andIsbnIn(List<String> values) {
            addCriterion("isbn in", values, "isbn");
            return (Criteria) this;
        }

        public Criteria andIsbnNotIn(List<String> values) {
            addCriterion("isbn not in", values, "isbn");
            return (Criteria) this;
        }

        public Criteria andIsbnBetween(String value1, String value2) {
            addCriterion("isbn between", value1, value2, "isbn");
            return (Criteria) this;
        }

        public Criteria andIsbnNotBetween(String value1, String value2) {
            addCriterion("isbn not between", value1, value2, "isbn");
            return (Criteria) this;
        }

        public Criteria andBookLocationIsNull() {
            addCriterion("book_location is null");
            return (Criteria) this;
        }

        public Criteria andBookLocationIsNotNull() {
            addCriterion("book_location is not null");
            return (Criteria) this;
        }

        public Criteria andBookLocationEqualTo(String value) {
            addCriterion("book_location =", value, "bookLocation");
            return (Criteria) this;
        }

        public Criteria andBookLocationNotEqualTo(String value) {
            addCriterion("book_location <>", value, "bookLocation");
            return (Criteria) this;
        }

        public Criteria andBookLocationGreaterThan(String value) {
            addCriterion("book_location >", value, "bookLocation");
            return (Criteria) this;
        }

        public Criteria andBookLocationGreaterThanOrEqualTo(String value) {
            addCriterion("book_location >=", value, "bookLocation");
            return (Criteria) this;
        }

        public Criteria andBookLocationLessThan(String value) {
            addCriterion("book_location <", value, "bookLocation");
            return (Criteria) this;
        }

        public Criteria andBookLocationLessThanOrEqualTo(String value) {
            addCriterion("book_location <=", value, "bookLocation");
            return (Criteria) this;
        }

        public Criteria andBookLocationLike(String value) {
            addCriterion("book_location like", value, "bookLocation");
            return (Criteria) this;
        }

        public Criteria andBookLocationNotLike(String value) {
            addCriterion("book_location not like", value, "bookLocation");
            return (Criteria) this;
        }

        public Criteria andBookLocationIn(List<String> values) {
            addCriterion("book_location in", values, "bookLocation");
            return (Criteria) this;
        }

        public Criteria andBookLocationNotIn(List<String> values) {
            addCriterion("book_location not in", values, "bookLocation");
            return (Criteria) this;
        }

        public Criteria andBookLocationBetween(String value1, String value2) {
            addCriterion("book_location between", value1, value2, "bookLocation");
            return (Criteria) this;
        }

        public Criteria andBookLocationNotBetween(String value1, String value2) {
            addCriterion("book_location not between", value1, value2, "bookLocation");
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
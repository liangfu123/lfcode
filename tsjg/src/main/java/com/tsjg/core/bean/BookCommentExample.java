package com.tsjg.core.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BookCommentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BookCommentExample() {
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

        public Criteria andBcIdIsNull() {
            addCriterion("bc_id is null");
            return (Criteria) this;
        }

        public Criteria andBcIdIsNotNull() {
            addCriterion("bc_id is not null");
            return (Criteria) this;
        }

        public Criteria andBcIdEqualTo(Integer value) {
            addCriterion("bc_id =", value, "bcId");
            return (Criteria) this;
        }

        public Criteria andBcIdNotEqualTo(Integer value) {
            addCriterion("bc_id <>", value, "bcId");
            return (Criteria) this;
        }

        public Criteria andBcIdGreaterThan(Integer value) {
            addCriterion("bc_id >", value, "bcId");
            return (Criteria) this;
        }

        public Criteria andBcIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("bc_id >=", value, "bcId");
            return (Criteria) this;
        }

        public Criteria andBcIdLessThan(Integer value) {
            addCriterion("bc_id <", value, "bcId");
            return (Criteria) this;
        }

        public Criteria andBcIdLessThanOrEqualTo(Integer value) {
            addCriterion("bc_id <=", value, "bcId");
            return (Criteria) this;
        }

        public Criteria andBcIdIn(List<Integer> values) {
            addCriterion("bc_id in", values, "bcId");
            return (Criteria) this;
        }

        public Criteria andBcIdNotIn(List<Integer> values) {
            addCriterion("bc_id not in", values, "bcId");
            return (Criteria) this;
        }

        public Criteria andBcIdBetween(Integer value1, Integer value2) {
            addCriterion("bc_id between", value1, value2, "bcId");
            return (Criteria) this;
        }

        public Criteria andBcIdNotBetween(Integer value1, Integer value2) {
            addCriterion("bc_id not between", value1, value2, "bcId");
            return (Criteria) this;
        }

        public Criteria andBcContentIsNull() {
            addCriterion("bc_content is null");
            return (Criteria) this;
        }

        public Criteria andBcContentIsNotNull() {
            addCriterion("bc_content is not null");
            return (Criteria) this;
        }

        public Criteria andBcContentEqualTo(String value) {
            addCriterion("bc_content =", value, "bcContent");
            return (Criteria) this;
        }

        public Criteria andBcContentNotEqualTo(String value) {
            addCriterion("bc_content <>", value, "bcContent");
            return (Criteria) this;
        }

        public Criteria andBcContentGreaterThan(String value) {
            addCriterion("bc_content >", value, "bcContent");
            return (Criteria) this;
        }

        public Criteria andBcContentGreaterThanOrEqualTo(String value) {
            addCriterion("bc_content >=", value, "bcContent");
            return (Criteria) this;
        }

        public Criteria andBcContentLessThan(String value) {
            addCriterion("bc_content <", value, "bcContent");
            return (Criteria) this;
        }

        public Criteria andBcContentLessThanOrEqualTo(String value) {
            addCriterion("bc_content <=", value, "bcContent");
            return (Criteria) this;
        }

        public Criteria andBcContentLike(String value) {
            addCriterion("bc_content like", value, "bcContent");
            return (Criteria) this;
        }

        public Criteria andBcContentNotLike(String value) {
            addCriterion("bc_content not like", value, "bcContent");
            return (Criteria) this;
        }

        public Criteria andBcContentIn(List<String> values) {
            addCriterion("bc_content in", values, "bcContent");
            return (Criteria) this;
        }

        public Criteria andBcContentNotIn(List<String> values) {
            addCriterion("bc_content not in", values, "bcContent");
            return (Criteria) this;
        }

        public Criteria andBcContentBetween(String value1, String value2) {
            addCriterion("bc_content between", value1, value2, "bcContent");
            return (Criteria) this;
        }

        public Criteria andBcContentNotBetween(String value1, String value2) {
            addCriterion("bc_content not between", value1, value2, "bcContent");
            return (Criteria) this;
        }

        public Criteria andBcTimeIsNull() {
            addCriterion("bc_time is null");
            return (Criteria) this;
        }

        public Criteria andBcTimeIsNotNull() {
            addCriterion("bc_time is not null");
            return (Criteria) this;
        }

        public Criteria andBcTimeEqualTo(Date value) {
            addCriterion("bc_time =", value, "bcTime");
            return (Criteria) this;
        }

        public Criteria andBcTimeNotEqualTo(Date value) {
            addCriterion("bc_time <>", value, "bcTime");
            return (Criteria) this;
        }

        public Criteria andBcTimeGreaterThan(Date value) {
            addCriterion("bc_time >", value, "bcTime");
            return (Criteria) this;
        }

        public Criteria andBcTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("bc_time >=", value, "bcTime");
            return (Criteria) this;
        }

        public Criteria andBcTimeLessThan(Date value) {
            addCriterion("bc_time <", value, "bcTime");
            return (Criteria) this;
        }

        public Criteria andBcTimeLessThanOrEqualTo(Date value) {
            addCriterion("bc_time <=", value, "bcTime");
            return (Criteria) this;
        }

        public Criteria andBcTimeIn(List<Date> values) {
            addCriterion("bc_time in", values, "bcTime");
            return (Criteria) this;
        }

        public Criteria andBcTimeNotIn(List<Date> values) {
            addCriterion("bc_time not in", values, "bcTime");
            return (Criteria) this;
        }

        public Criteria andBcTimeBetween(Date value1, Date value2) {
            addCriterion("bc_time between", value1, value2, "bcTime");
            return (Criteria) this;
        }

        public Criteria andBcTimeNotBetween(Date value1, Date value2) {
            addCriterion("bc_time not between", value1, value2, "bcTime");
            return (Criteria) this;
        }

        public Criteria andBcNouseIsNull() {
            addCriterion("bc_nouse is null");
            return (Criteria) this;
        }

        public Criteria andBcNouseIsNotNull() {
            addCriterion("bc_nouse is not null");
            return (Criteria) this;
        }

        public Criteria andBcNouseEqualTo(Integer value) {
            addCriterion("bc_nouse =", value, "bcNouse");
            return (Criteria) this;
        }

        public Criteria andBcNouseNotEqualTo(Integer value) {
            addCriterion("bc_nouse <>", value, "bcNouse");
            return (Criteria) this;
        }

        public Criteria andBcNouseGreaterThan(Integer value) {
            addCriterion("bc_nouse >", value, "bcNouse");
            return (Criteria) this;
        }

        public Criteria andBcNouseGreaterThanOrEqualTo(Integer value) {
            addCriterion("bc_nouse >=", value, "bcNouse");
            return (Criteria) this;
        }

        public Criteria andBcNouseLessThan(Integer value) {
            addCriterion("bc_nouse <", value, "bcNouse");
            return (Criteria) this;
        }

        public Criteria andBcNouseLessThanOrEqualTo(Integer value) {
            addCriterion("bc_nouse <=", value, "bcNouse");
            return (Criteria) this;
        }

        public Criteria andBcNouseIn(List<Integer> values) {
            addCriterion("bc_nouse in", values, "bcNouse");
            return (Criteria) this;
        }

        public Criteria andBcNouseNotIn(List<Integer> values) {
            addCriterion("bc_nouse not in", values, "bcNouse");
            return (Criteria) this;
        }

        public Criteria andBcNouseBetween(Integer value1, Integer value2) {
            addCriterion("bc_nouse between", value1, value2, "bcNouse");
            return (Criteria) this;
        }

        public Criteria andBcNouseNotBetween(Integer value1, Integer value2) {
            addCriterion("bc_nouse not between", value1, value2, "bcNouse");
            return (Criteria) this;
        }

        public Criteria andBcBeuseIsNull() {
            addCriterion("bc_beuse is null");
            return (Criteria) this;
        }

        public Criteria andBcBeuseIsNotNull() {
            addCriterion("bc_beuse is not null");
            return (Criteria) this;
        }

        public Criteria andBcBeuseEqualTo(Integer value) {
            addCriterion("bc_beuse =", value, "bcBeuse");
            return (Criteria) this;
        }

        public Criteria andBcBeuseNotEqualTo(Integer value) {
            addCriterion("bc_beuse <>", value, "bcBeuse");
            return (Criteria) this;
        }

        public Criteria andBcBeuseGreaterThan(Integer value) {
            addCriterion("bc_beuse >", value, "bcBeuse");
            return (Criteria) this;
        }

        public Criteria andBcBeuseGreaterThanOrEqualTo(Integer value) {
            addCriterion("bc_beuse >=", value, "bcBeuse");
            return (Criteria) this;
        }

        public Criteria andBcBeuseLessThan(Integer value) {
            addCriterion("bc_beuse <", value, "bcBeuse");
            return (Criteria) this;
        }

        public Criteria andBcBeuseLessThanOrEqualTo(Integer value) {
            addCriterion("bc_beuse <=", value, "bcBeuse");
            return (Criteria) this;
        }

        public Criteria andBcBeuseIn(List<Integer> values) {
            addCriterion("bc_beuse in", values, "bcBeuse");
            return (Criteria) this;
        }

        public Criteria andBcBeuseNotIn(List<Integer> values) {
            addCriterion("bc_beuse not in", values, "bcBeuse");
            return (Criteria) this;
        }

        public Criteria andBcBeuseBetween(Integer value1, Integer value2) {
            addCriterion("bc_beuse between", value1, value2, "bcBeuse");
            return (Criteria) this;
        }

        public Criteria andBcBeuseNotBetween(Integer value1, Integer value2) {
            addCriterion("bc_beuse not between", value1, value2, "bcBeuse");
            return (Criteria) this;
        }

        public Criteria andBookIdIsNull() {
            addCriterion("book_id is null");
            return (Criteria) this;
        }

        public Criteria andBookIdIsNotNull() {
            addCriterion("book_id is not null");
            return (Criteria) this;
        }

        public Criteria andBookIdEqualTo(Integer value) {
            addCriterion("book_id =", value, "bookId");
            return (Criteria) this;
        }

        public Criteria andBookIdNotEqualTo(Integer value) {
            addCriterion("book_id <>", value, "bookId");
            return (Criteria) this;
        }

        public Criteria andBookIdGreaterThan(Integer value) {
            addCriterion("book_id >", value, "bookId");
            return (Criteria) this;
        }

        public Criteria andBookIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("book_id >=", value, "bookId");
            return (Criteria) this;
        }

        public Criteria andBookIdLessThan(Integer value) {
            addCriterion("book_id <", value, "bookId");
            return (Criteria) this;
        }

        public Criteria andBookIdLessThanOrEqualTo(Integer value) {
            addCriterion("book_id <=", value, "bookId");
            return (Criteria) this;
        }

        public Criteria andBookIdIn(List<Integer> values) {
            addCriterion("book_id in", values, "bookId");
            return (Criteria) this;
        }

        public Criteria andBookIdNotIn(List<Integer> values) {
            addCriterion("book_id not in", values, "bookId");
            return (Criteria) this;
        }

        public Criteria andBookIdBetween(Integer value1, Integer value2) {
            addCriterion("book_id between", value1, value2, "bookId");
            return (Criteria) this;
        }

        public Criteria andBookIdNotBetween(Integer value1, Integer value2) {
            addCriterion("book_id not between", value1, value2, "bookId");
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
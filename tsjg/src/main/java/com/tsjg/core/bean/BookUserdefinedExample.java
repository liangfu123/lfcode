package com.tsjg.core.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BookUserdefinedExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BookUserdefinedExample() {
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

        public Criteria andBookUserdefinedIdIsNull() {
            addCriterion("book_userdefined_id is null");
            return (Criteria) this;
        }

        public Criteria andBookUserdefinedIdIsNotNull() {
            addCriterion("book_userdefined_id is not null");
            return (Criteria) this;
        }

        public Criteria andBookUserdefinedIdEqualTo(Integer value) {
            addCriterion("book_userdefined_id =", value, "bookUserdefinedId");
            return (Criteria) this;
        }

        public Criteria andBookUserdefinedIdNotEqualTo(Integer value) {
            addCriterion("book_userdefined_id <>", value, "bookUserdefinedId");
            return (Criteria) this;
        }

        public Criteria andBookUserdefinedIdGreaterThan(Integer value) {
            addCriterion("book_userdefined_id >", value, "bookUserdefinedId");
            return (Criteria) this;
        }

        public Criteria andBookUserdefinedIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("book_userdefined_id >=", value, "bookUserdefinedId");
            return (Criteria) this;
        }

        public Criteria andBookUserdefinedIdLessThan(Integer value) {
            addCriterion("book_userdefined_id <", value, "bookUserdefinedId");
            return (Criteria) this;
        }

        public Criteria andBookUserdefinedIdLessThanOrEqualTo(Integer value) {
            addCriterion("book_userdefined_id <=", value, "bookUserdefinedId");
            return (Criteria) this;
        }

        public Criteria andBookUserdefinedIdIn(List<Integer> values) {
            addCriterion("book_userdefined_id in", values, "bookUserdefinedId");
            return (Criteria) this;
        }

        public Criteria andBookUserdefinedIdNotIn(List<Integer> values) {
            addCriterion("book_userdefined_id not in", values, "bookUserdefinedId");
            return (Criteria) this;
        }

        public Criteria andBookUserdefinedIdBetween(Integer value1, Integer value2) {
            addCriterion("book_userdefined_id between", value1, value2, "bookUserdefinedId");
            return (Criteria) this;
        }

        public Criteria andBookUserdefinedIdNotBetween(Integer value1, Integer value2) {
            addCriterion("book_userdefined_id not between", value1, value2, "bookUserdefinedId");
            return (Criteria) this;
        }

        public Criteria andBookUdNameIsNull() {
            addCriterion("book_ud_name is null");
            return (Criteria) this;
        }

        public Criteria andBookUdNameIsNotNull() {
            addCriterion("book_ud_name is not null");
            return (Criteria) this;
        }

        public Criteria andBookUdNameEqualTo(String value) {
            addCriterion("book_ud_name =", value, "bookUdName");
            return (Criteria) this;
        }

        public Criteria andBookUdNameNotEqualTo(String value) {
            addCriterion("book_ud_name <>", value, "bookUdName");
            return (Criteria) this;
        }

        public Criteria andBookUdNameGreaterThan(String value) {
            addCriterion("book_ud_name >", value, "bookUdName");
            return (Criteria) this;
        }

        public Criteria andBookUdNameGreaterThanOrEqualTo(String value) {
            addCriterion("book_ud_name >=", value, "bookUdName");
            return (Criteria) this;
        }

        public Criteria andBookUdNameLessThan(String value) {
            addCriterion("book_ud_name <", value, "bookUdName");
            return (Criteria) this;
        }

        public Criteria andBookUdNameLessThanOrEqualTo(String value) {
            addCriterion("book_ud_name <=", value, "bookUdName");
            return (Criteria) this;
        }

        public Criteria andBookUdNameLike(String value) {
            addCriterion("book_ud_name like", value, "bookUdName");
            return (Criteria) this;
        }

        public Criteria andBookUdNameNotLike(String value) {
            addCriterion("book_ud_name not like", value, "bookUdName");
            return (Criteria) this;
        }

        public Criteria andBookUdNameIn(List<String> values) {
            addCriterion("book_ud_name in", values, "bookUdName");
            return (Criteria) this;
        }

        public Criteria andBookUdNameNotIn(List<String> values) {
            addCriterion("book_ud_name not in", values, "bookUdName");
            return (Criteria) this;
        }

        public Criteria andBookUdNameBetween(String value1, String value2) {
            addCriterion("book_ud_name between", value1, value2, "bookUdName");
            return (Criteria) this;
        }

        public Criteria andBookUdNameNotBetween(String value1, String value2) {
            addCriterion("book_ud_name not between", value1, value2, "bookUdName");
            return (Criteria) this;
        }

        public Criteria andBookUdAuthorIsNull() {
            addCriterion("book_ud_author is null");
            return (Criteria) this;
        }

        public Criteria andBookUdAuthorIsNotNull() {
            addCriterion("book_ud_author is not null");
            return (Criteria) this;
        }

        public Criteria andBookUdAuthorEqualTo(String value) {
            addCriterion("book_ud_author =", value, "bookUdAuthor");
            return (Criteria) this;
        }

        public Criteria andBookUdAuthorNotEqualTo(String value) {
            addCriterion("book_ud_author <>", value, "bookUdAuthor");
            return (Criteria) this;
        }

        public Criteria andBookUdAuthorGreaterThan(String value) {
            addCriterion("book_ud_author >", value, "bookUdAuthor");
            return (Criteria) this;
        }

        public Criteria andBookUdAuthorGreaterThanOrEqualTo(String value) {
            addCriterion("book_ud_author >=", value, "bookUdAuthor");
            return (Criteria) this;
        }

        public Criteria andBookUdAuthorLessThan(String value) {
            addCriterion("book_ud_author <", value, "bookUdAuthor");
            return (Criteria) this;
        }

        public Criteria andBookUdAuthorLessThanOrEqualTo(String value) {
            addCriterion("book_ud_author <=", value, "bookUdAuthor");
            return (Criteria) this;
        }

        public Criteria andBookUdAuthorLike(String value) {
            addCriterion("book_ud_author like", value, "bookUdAuthor");
            return (Criteria) this;
        }

        public Criteria andBookUdAuthorNotLike(String value) {
            addCriterion("book_ud_author not like", value, "bookUdAuthor");
            return (Criteria) this;
        }

        public Criteria andBookUdAuthorIn(List<String> values) {
            addCriterion("book_ud_author in", values, "bookUdAuthor");
            return (Criteria) this;
        }

        public Criteria andBookUdAuthorNotIn(List<String> values) {
            addCriterion("book_ud_author not in", values, "bookUdAuthor");
            return (Criteria) this;
        }

        public Criteria andBookUdAuthorBetween(String value1, String value2) {
            addCriterion("book_ud_author between", value1, value2, "bookUdAuthor");
            return (Criteria) this;
        }

        public Criteria andBookUdAuthorNotBetween(String value1, String value2) {
            addCriterion("book_ud_author not between", value1, value2, "bookUdAuthor");
            return (Criteria) this;
        }

        public Criteria andBookUdPublishIsNull() {
            addCriterion("book_ud_publish is null");
            return (Criteria) this;
        }

        public Criteria andBookUdPublishIsNotNull() {
            addCriterion("book_ud_publish is not null");
            return (Criteria) this;
        }

        public Criteria andBookUdPublishEqualTo(String value) {
            addCriterion("book_ud_publish =", value, "bookUdPublish");
            return (Criteria) this;
        }

        public Criteria andBookUdPublishNotEqualTo(String value) {
            addCriterion("book_ud_publish <>", value, "bookUdPublish");
            return (Criteria) this;
        }

        public Criteria andBookUdPublishGreaterThan(String value) {
            addCriterion("book_ud_publish >", value, "bookUdPublish");
            return (Criteria) this;
        }

        public Criteria andBookUdPublishGreaterThanOrEqualTo(String value) {
            addCriterion("book_ud_publish >=", value, "bookUdPublish");
            return (Criteria) this;
        }

        public Criteria andBookUdPublishLessThan(String value) {
            addCriterion("book_ud_publish <", value, "bookUdPublish");
            return (Criteria) this;
        }

        public Criteria andBookUdPublishLessThanOrEqualTo(String value) {
            addCriterion("book_ud_publish <=", value, "bookUdPublish");
            return (Criteria) this;
        }

        public Criteria andBookUdPublishLike(String value) {
            addCriterion("book_ud_publish like", value, "bookUdPublish");
            return (Criteria) this;
        }

        public Criteria andBookUdPublishNotLike(String value) {
            addCriterion("book_ud_publish not like", value, "bookUdPublish");
            return (Criteria) this;
        }

        public Criteria andBookUdPublishIn(List<String> values) {
            addCriterion("book_ud_publish in", values, "bookUdPublish");
            return (Criteria) this;
        }

        public Criteria andBookUdPublishNotIn(List<String> values) {
            addCriterion("book_ud_publish not in", values, "bookUdPublish");
            return (Criteria) this;
        }

        public Criteria andBookUdPublishBetween(String value1, String value2) {
            addCriterion("book_ud_publish between", value1, value2, "bookUdPublish");
            return (Criteria) this;
        }

        public Criteria andBookUdPublishNotBetween(String value1, String value2) {
            addCriterion("book_ud_publish not between", value1, value2, "bookUdPublish");
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

        public Criteria andBookUdPubtimeIsNull() {
            addCriterion("book_ud_pubtime is null");
            return (Criteria) this;
        }

        public Criteria andBookUdPubtimeIsNotNull() {
            addCriterion("book_ud_pubtime is not null");
            return (Criteria) this;
        }

        public Criteria andBookUdPubtimeEqualTo(Date value) {
            addCriterion("book_ud_pubtime =", value, "bookUdPubtime");
            return (Criteria) this;
        }

        public Criteria andBookUdPubtimeNotEqualTo(Date value) {
            addCriterion("book_ud_pubtime <>", value, "bookUdPubtime");
            return (Criteria) this;
        }

        public Criteria andBookUdPubtimeGreaterThan(Date value) {
            addCriterion("book_ud_pubtime >", value, "bookUdPubtime");
            return (Criteria) this;
        }

        public Criteria andBookUdPubtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("book_ud_pubtime >=", value, "bookUdPubtime");
            return (Criteria) this;
        }

        public Criteria andBookUdPubtimeLessThan(Date value) {
            addCriterion("book_ud_pubtime <", value, "bookUdPubtime");
            return (Criteria) this;
        }

        public Criteria andBookUdPubtimeLessThanOrEqualTo(Date value) {
            addCriterion("book_ud_pubtime <=", value, "bookUdPubtime");
            return (Criteria) this;
        }

        public Criteria andBookUdPubtimeIn(List<Date> values) {
            addCriterion("book_ud_pubtime in", values, "bookUdPubtime");
            return (Criteria) this;
        }

        public Criteria andBookUdPubtimeNotIn(List<Date> values) {
            addCriterion("book_ud_pubtime not in", values, "bookUdPubtime");
            return (Criteria) this;
        }

        public Criteria andBookUdPubtimeBetween(Date value1, Date value2) {
            addCriterion("book_ud_pubtime between", value1, value2, "bookUdPubtime");
            return (Criteria) this;
        }

        public Criteria andBookUdPubtimeNotBetween(Date value1, Date value2) {
            addCriterion("book_ud_pubtime not between", value1, value2, "bookUdPubtime");
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

        public Criteria andBookJgTimeIsNull() {
            addCriterion("book_jg_time is null");
            return (Criteria) this;
        }

        public Criteria andBookJgTimeIsNotNull() {
            addCriterion("book_jg_time is not null");
            return (Criteria) this;
        }

        public Criteria andBookJgTimeEqualTo(Date value) {
            addCriterion("book_jg_time =", value, "bookJgTime");
            return (Criteria) this;
        }

        public Criteria andBookJgTimeNotEqualTo(Date value) {
            addCriterion("book_jg_time <>", value, "bookJgTime");
            return (Criteria) this;
        }

        public Criteria andBookJgTimeGreaterThan(Date value) {
            addCriterion("book_jg_time >", value, "bookJgTime");
            return (Criteria) this;
        }

        public Criteria andBookJgTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("book_jg_time >=", value, "bookJgTime");
            return (Criteria) this;
        }

        public Criteria andBookJgTimeLessThan(Date value) {
            addCriterion("book_jg_time <", value, "bookJgTime");
            return (Criteria) this;
        }

        public Criteria andBookJgTimeLessThanOrEqualTo(Date value) {
            addCriterion("book_jg_time <=", value, "bookJgTime");
            return (Criteria) this;
        }

        public Criteria andBookJgTimeIn(List<Date> values) {
            addCriterion("book_jg_time in", values, "bookJgTime");
            return (Criteria) this;
        }

        public Criteria andBookJgTimeNotIn(List<Date> values) {
            addCriterion("book_jg_time not in", values, "bookJgTime");
            return (Criteria) this;
        }

        public Criteria andBookJgTimeBetween(Date value1, Date value2) {
            addCriterion("book_jg_time between", value1, value2, "bookJgTime");
            return (Criteria) this;
        }

        public Criteria andBookJgTimeNotBetween(Date value1, Date value2) {
            addCriterion("book_jg_time not between", value1, value2, "bookJgTime");
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
package com.tsjg.core.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BookExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BookExample() {
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

        public Criteria andBookNameIsNull() {
            addCriterion("book_name is null");
            return (Criteria) this;
        }

        public Criteria andBookNameIsNotNull() {
            addCriterion("book_name is not null");
            return (Criteria) this;
        }

        public Criteria andBookNameEqualTo(String value) {
            addCriterion("book_name =", value, "bookName");
            return (Criteria) this;
        }

        public Criteria andBookNameNotEqualTo(String value) {
            addCriterion("book_name <>", value, "bookName");
            return (Criteria) this;
        }

        public Criteria andBookNameGreaterThan(String value) {
            addCriterion("book_name >", value, "bookName");
            return (Criteria) this;
        }

        public Criteria andBookNameGreaterThanOrEqualTo(String value) {
            addCriterion("book_name >=", value, "bookName");
            return (Criteria) this;
        }

        public Criteria andBookNameLessThan(String value) {
            addCriterion("book_name <", value, "bookName");
            return (Criteria) this;
        }

        public Criteria andBookNameLessThanOrEqualTo(String value) {
            addCriterion("book_name <=", value, "bookName");
            return (Criteria) this;
        }

        public Criteria andBookNameLike(String value) {
            addCriterion("book_name like", value, "bookName");
            return (Criteria) this;
        }

        public Criteria andBookNameNotLike(String value) {
            addCriterion("book_name not like", value, "bookName");
            return (Criteria) this;
        }

        public Criteria andBookNameIn(List<String> values) {
            addCriterion("book_name in", values, "bookName");
            return (Criteria) this;
        }

        public Criteria andBookNameNotIn(List<String> values) {
            addCriterion("book_name not in", values, "bookName");
            return (Criteria) this;
        }

        public Criteria andBookNameBetween(String value1, String value2) {
            addCriterion("book_name between", value1, value2, "bookName");
            return (Criteria) this;
        }

        public Criteria andBookNameNotBetween(String value1, String value2) {
            addCriterion("book_name not between", value1, value2, "bookName");
            return (Criteria) this;
        }

        public Criteria andBookAuthorIsNull() {
            addCriterion("book_author is null");
            return (Criteria) this;
        }

        public Criteria andBookAuthorIsNotNull() {
            addCriterion("book_author is not null");
            return (Criteria) this;
        }

        public Criteria andBookAuthorEqualTo(String value) {
            addCriterion("book_author =", value, "bookAuthor");
            return (Criteria) this;
        }

        public Criteria andBookAuthorNotEqualTo(String value) {
            addCriterion("book_author <>", value, "bookAuthor");
            return (Criteria) this;
        }

        public Criteria andBookAuthorGreaterThan(String value) {
            addCriterion("book_author >", value, "bookAuthor");
            return (Criteria) this;
        }

        public Criteria andBookAuthorGreaterThanOrEqualTo(String value) {
            addCriterion("book_author >=", value, "bookAuthor");
            return (Criteria) this;
        }

        public Criteria andBookAuthorLessThan(String value) {
            addCriterion("book_author <", value, "bookAuthor");
            return (Criteria) this;
        }

        public Criteria andBookAuthorLessThanOrEqualTo(String value) {
            addCriterion("book_author <=", value, "bookAuthor");
            return (Criteria) this;
        }

        public Criteria andBookAuthorLike(String value) {
            addCriterion("book_author like", value, "bookAuthor");
            return (Criteria) this;
        }

        public Criteria andBookAuthorNotLike(String value) {
            addCriterion("book_author not like", value, "bookAuthor");
            return (Criteria) this;
        }

        public Criteria andBookAuthorIn(List<String> values) {
            addCriterion("book_author in", values, "bookAuthor");
            return (Criteria) this;
        }

        public Criteria andBookAuthorNotIn(List<String> values) {
            addCriterion("book_author not in", values, "bookAuthor");
            return (Criteria) this;
        }

        public Criteria andBookAuthorBetween(String value1, String value2) {
            addCriterion("book_author between", value1, value2, "bookAuthor");
            return (Criteria) this;
        }

        public Criteria andBookAuthorNotBetween(String value1, String value2) {
            addCriterion("book_author not between", value1, value2, "bookAuthor");
            return (Criteria) this;
        }

        public Criteria andBookSummaryIsNull() {
            addCriterion("book_summary is null");
            return (Criteria) this;
        }

        public Criteria andBookSummaryIsNotNull() {
            addCriterion("book_summary is not null");
            return (Criteria) this;
        }

        public Criteria andBookSummaryEqualTo(String value) {
            addCriterion("book_summary =", value, "bookSummary");
            return (Criteria) this;
        }

        public Criteria andBookSummaryNotEqualTo(String value) {
            addCriterion("book_summary <>", value, "bookSummary");
            return (Criteria) this;
        }

        public Criteria andBookSummaryGreaterThan(String value) {
            addCriterion("book_summary >", value, "bookSummary");
            return (Criteria) this;
        }

        public Criteria andBookSummaryGreaterThanOrEqualTo(String value) {
            addCriterion("book_summary >=", value, "bookSummary");
            return (Criteria) this;
        }

        public Criteria andBookSummaryLessThan(String value) {
            addCriterion("book_summary <", value, "bookSummary");
            return (Criteria) this;
        }

        public Criteria andBookSummaryLessThanOrEqualTo(String value) {
            addCriterion("book_summary <=", value, "bookSummary");
            return (Criteria) this;
        }

        public Criteria andBookSummaryLike(String value) {
            addCriterion("book_summary like", value, "bookSummary");
            return (Criteria) this;
        }

        public Criteria andBookSummaryNotLike(String value) {
            addCriterion("book_summary not like", value, "bookSummary");
            return (Criteria) this;
        }

        public Criteria andBookSummaryIn(List<String> values) {
            addCriterion("book_summary in", values, "bookSummary");
            return (Criteria) this;
        }

        public Criteria andBookSummaryNotIn(List<String> values) {
            addCriterion("book_summary not in", values, "bookSummary");
            return (Criteria) this;
        }

        public Criteria andBookSummaryBetween(String value1, String value2) {
            addCriterion("book_summary between", value1, value2, "bookSummary");
            return (Criteria) this;
        }

        public Criteria andBookSummaryNotBetween(String value1, String value2) {
            addCriterion("book_summary not between", value1, value2, "bookSummary");
            return (Criteria) this;
        }

        public Criteria andBookPublishIsNull() {
            addCriterion("book_publish is null");
            return (Criteria) this;
        }

        public Criteria andBookPublishIsNotNull() {
            addCriterion("book_publish is not null");
            return (Criteria) this;
        }

        public Criteria andBookPublishEqualTo(String value) {
            addCriterion("book_publish =", value, "bookPublish");
            return (Criteria) this;
        }

        public Criteria andBookPublishNotEqualTo(String value) {
            addCriterion("book_publish <>", value, "bookPublish");
            return (Criteria) this;
        }

        public Criteria andBookPublishGreaterThan(String value) {
            addCriterion("book_publish >", value, "bookPublish");
            return (Criteria) this;
        }

        public Criteria andBookPublishGreaterThanOrEqualTo(String value) {
            addCriterion("book_publish >=", value, "bookPublish");
            return (Criteria) this;
        }

        public Criteria andBookPublishLessThan(String value) {
            addCriterion("book_publish <", value, "bookPublish");
            return (Criteria) this;
        }

        public Criteria andBookPublishLessThanOrEqualTo(String value) {
            addCriterion("book_publish <=", value, "bookPublish");
            return (Criteria) this;
        }

        public Criteria andBookPublishLike(String value) {
            addCriterion("book_publish like", value, "bookPublish");
            return (Criteria) this;
        }

        public Criteria andBookPublishNotLike(String value) {
            addCriterion("book_publish not like", value, "bookPublish");
            return (Criteria) this;
        }

        public Criteria andBookPublishIn(List<String> values) {
            addCriterion("book_publish in", values, "bookPublish");
            return (Criteria) this;
        }

        public Criteria andBookPublishNotIn(List<String> values) {
            addCriterion("book_publish not in", values, "bookPublish");
            return (Criteria) this;
        }

        public Criteria andBookPublishBetween(String value1, String value2) {
            addCriterion("book_publish between", value1, value2, "bookPublish");
            return (Criteria) this;
        }

        public Criteria andBookPublishNotBetween(String value1, String value2) {
            addCriterion("book_publish not between", value1, value2, "bookPublish");
            return (Criteria) this;
        }

        public Criteria andBookPubtimeIsNull() {
            addCriterion("book_pubtime is null");
            return (Criteria) this;
        }

        public Criteria andBookPubtimeIsNotNull() {
            addCriterion("book_pubtime is not null");
            return (Criteria) this;
        }

        public Criteria andBookPubtimeEqualTo(String value) {
            addCriterion("book_pubtime =", value, "bookPubtime");
            return (Criteria) this;
        }

        public Criteria andBookPubtimeNotEqualTo(String value) {
            addCriterion("book_pubtime <>", value, "bookPubtime");
            return (Criteria) this;
        }

        public Criteria andBookPubtimeGreaterThan(String value) {
            addCriterion("book_pubtime >", value, "bookPubtime");
            return (Criteria) this;
        }

        public Criteria andBookPubtimeGreaterThanOrEqualTo(String value) {
            addCriterion("book_pubtime >=", value, "bookPubtime");
            return (Criteria) this;
        }

        public Criteria andBookPubtimeLessThan(String value) {
            addCriterion("book_pubtime <", value, "bookPubtime");
            return (Criteria) this;
        }

        public Criteria andBookPubtimeLessThanOrEqualTo(String value) {
            addCriterion("book_pubtime <=", value, "bookPubtime");
            return (Criteria) this;
        }

        public Criteria andBookPubtimeLike(String value) {
            addCriterion("book_pubtime like", value, "bookPubtime");
            return (Criteria) this;
        }

        public Criteria andBookPubtimeNotLike(String value) {
            addCriterion("book_pubtime not like", value, "bookPubtime");
            return (Criteria) this;
        }

        public Criteria andBookPubtimeIn(List<String> values) {
            addCriterion("book_pubtime in", values, "bookPubtime");
            return (Criteria) this;
        }

        public Criteria andBookPubtimeNotIn(List<String> values) {
            addCriterion("book_pubtime not in", values, "bookPubtime");
            return (Criteria) this;
        }

        public Criteria andBookPubtimeBetween(String value1, String value2) {
            addCriterion("book_pubtime between", value1, value2, "bookPubtime");
            return (Criteria) this;
        }

        public Criteria andBookPubtimeNotBetween(String value1, String value2) {
            addCriterion("book_pubtime not between", value1, value2, "bookPubtime");
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

        public Criteria andBookNumberpageIsNull() {
            addCriterion("book_numberpage is null");
            return (Criteria) this;
        }

        public Criteria andBookNumberpageIsNotNull() {
            addCriterion("book_numberpage is not null");
            return (Criteria) this;
        }

        public Criteria andBookNumberpageEqualTo(String value) {
            addCriterion("book_numberpage =", value, "bookNumberpage");
            return (Criteria) this;
        }

        public Criteria andBookNumberpageNotEqualTo(String value) {
            addCriterion("book_numberpage <>", value, "bookNumberpage");
            return (Criteria) this;
        }

        public Criteria andBookNumberpageGreaterThan(String value) {
            addCriterion("book_numberpage >", value, "bookNumberpage");
            return (Criteria) this;
        }

        public Criteria andBookNumberpageGreaterThanOrEqualTo(String value) {
            addCriterion("book_numberpage >=", value, "bookNumberpage");
            return (Criteria) this;
        }

        public Criteria andBookNumberpageLessThan(String value) {
            addCriterion("book_numberpage <", value, "bookNumberpage");
            return (Criteria) this;
        }

        public Criteria andBookNumberpageLessThanOrEqualTo(String value) {
            addCriterion("book_numberpage <=", value, "bookNumberpage");
            return (Criteria) this;
        }

        public Criteria andBookNumberpageLike(String value) {
            addCriterion("book_numberpage like", value, "bookNumberpage");
            return (Criteria) this;
        }

        public Criteria andBookNumberpageNotLike(String value) {
            addCriterion("book_numberpage not like", value, "bookNumberpage");
            return (Criteria) this;
        }

        public Criteria andBookNumberpageIn(List<String> values) {
            addCriterion("book_numberpage in", values, "bookNumberpage");
            return (Criteria) this;
        }

        public Criteria andBookNumberpageNotIn(List<String> values) {
            addCriterion("book_numberpage not in", values, "bookNumberpage");
            return (Criteria) this;
        }

        public Criteria andBookNumberpageBetween(String value1, String value2) {
            addCriterion("book_numberpage between", value1, value2, "bookNumberpage");
            return (Criteria) this;
        }

        public Criteria andBookNumberpageNotBetween(String value1, String value2) {
            addCriterion("book_numberpage not between", value1, value2, "bookNumberpage");
            return (Criteria) this;
        }

        public Criteria andBookPriceIsNull() {
            addCriterion("book_price is null");
            return (Criteria) this;
        }

        public Criteria andBookPriceIsNotNull() {
            addCriterion("book_price is not null");
            return (Criteria) this;
        }

        public Criteria andBookPriceEqualTo(String value) {
            addCriterion("book_price =", value, "bookPrice");
            return (Criteria) this;
        }

        public Criteria andBookPriceNotEqualTo(String value) {
            addCriterion("book_price <>", value, "bookPrice");
            return (Criteria) this;
        }

        public Criteria andBookPriceGreaterThan(String value) {
            addCriterion("book_price >", value, "bookPrice");
            return (Criteria) this;
        }

        public Criteria andBookPriceGreaterThanOrEqualTo(String value) {
            addCriterion("book_price >=", value, "bookPrice");
            return (Criteria) this;
        }

        public Criteria andBookPriceLessThan(String value) {
            addCriterion("book_price <", value, "bookPrice");
            return (Criteria) this;
        }

        public Criteria andBookPriceLessThanOrEqualTo(String value) {
            addCriterion("book_price <=", value, "bookPrice");
            return (Criteria) this;
        }

        public Criteria andBookPriceLike(String value) {
            addCriterion("book_price like", value, "bookPrice");
            return (Criteria) this;
        }

        public Criteria andBookPriceNotLike(String value) {
            addCriterion("book_price not like", value, "bookPrice");
            return (Criteria) this;
        }

        public Criteria andBookPriceIn(List<String> values) {
            addCriterion("book_price in", values, "bookPrice");
            return (Criteria) this;
        }

        public Criteria andBookPriceNotIn(List<String> values) {
            addCriterion("book_price not in", values, "bookPrice");
            return (Criteria) this;
        }

        public Criteria andBookPriceBetween(String value1, String value2) {
            addCriterion("book_price between", value1, value2, "bookPrice");
            return (Criteria) this;
        }

        public Criteria andBookPriceNotBetween(String value1, String value2) {
            addCriterion("book_price not between", value1, value2, "bookPrice");
            return (Criteria) this;
        }

        public Criteria andBookImgurlIsNull() {
            addCriterion("book_imgurl is null");
            return (Criteria) this;
        }

        public Criteria andBookImgurlIsNotNull() {
            addCriterion("book_imgurl is not null");
            return (Criteria) this;
        }

        public Criteria andBookImgurlEqualTo(String value) {
            addCriterion("book_imgurl =", value, "bookImgurl");
            return (Criteria) this;
        }

        public Criteria andBookImgurlNotEqualTo(String value) {
            addCriterion("book_imgurl <>", value, "bookImgurl");
            return (Criteria) this;
        }

        public Criteria andBookImgurlGreaterThan(String value) {
            addCriterion("book_imgurl >", value, "bookImgurl");
            return (Criteria) this;
        }

        public Criteria andBookImgurlGreaterThanOrEqualTo(String value) {
            addCriterion("book_imgurl >=", value, "bookImgurl");
            return (Criteria) this;
        }

        public Criteria andBookImgurlLessThan(String value) {
            addCriterion("book_imgurl <", value, "bookImgurl");
            return (Criteria) this;
        }

        public Criteria andBookImgurlLessThanOrEqualTo(String value) {
            addCriterion("book_imgurl <=", value, "bookImgurl");
            return (Criteria) this;
        }

        public Criteria andBookImgurlLike(String value) {
            addCriterion("book_imgurl like", value, "bookImgurl");
            return (Criteria) this;
        }

        public Criteria andBookImgurlNotLike(String value) {
            addCriterion("book_imgurl not like", value, "bookImgurl");
            return (Criteria) this;
        }

        public Criteria andBookImgurlIn(List<String> values) {
            addCriterion("book_imgurl in", values, "bookImgurl");
            return (Criteria) this;
        }

        public Criteria andBookImgurlNotIn(List<String> values) {
            addCriterion("book_imgurl not in", values, "bookImgurl");
            return (Criteria) this;
        }

        public Criteria andBookImgurlBetween(String value1, String value2) {
            addCriterion("book_imgurl between", value1, value2, "bookImgurl");
            return (Criteria) this;
        }

        public Criteria andBookImgurlNotBetween(String value1, String value2) {
            addCriterion("book_imgurl not between", value1, value2, "bookImgurl");
            return (Criteria) this;
        }

        public Criteria andBookNumIsNull() {
            addCriterion("book_num is null");
            return (Criteria) this;
        }

        public Criteria andBookNumIsNotNull() {
            addCriterion("book_num is not null");
            return (Criteria) this;
        }

        public Criteria andBookNumEqualTo(Integer value) {
            addCriterion("book_num =", value, "bookNum");
            return (Criteria) this;
        }

        public Criteria andBookNumNotEqualTo(Integer value) {
            addCriterion("book_num <>", value, "bookNum");
            return (Criteria) this;
        }

        public Criteria andBookNumGreaterThan(Integer value) {
            addCriterion("book_num >", value, "bookNum");
            return (Criteria) this;
        }

        public Criteria andBookNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("book_num >=", value, "bookNum");
            return (Criteria) this;
        }

        public Criteria andBookNumLessThan(Integer value) {
            addCriterion("book_num <", value, "bookNum");
            return (Criteria) this;
        }

        public Criteria andBookNumLessThanOrEqualTo(Integer value) {
            addCriterion("book_num <=", value, "bookNum");
            return (Criteria) this;
        }

        public Criteria andBookNumIn(List<Integer> values) {
            addCriterion("book_num in", values, "bookNum");
            return (Criteria) this;
        }

        public Criteria andBookNumNotIn(List<Integer> values) {
            addCriterion("book_num not in", values, "bookNum");
            return (Criteria) this;
        }

        public Criteria andBookNumBetween(Integer value1, Integer value2) {
            addCriterion("book_num between", value1, value2, "bookNum");
            return (Criteria) this;
        }

        public Criteria andBookNumNotBetween(Integer value1, Integer value2) {
            addCriterion("book_num not between", value1, value2, "bookNum");
            return (Criteria) this;
        }

        public Criteria andBookAddtimeIsNull() {
            addCriterion("book_addtime is null");
            return (Criteria) this;
        }

        public Criteria andBookAddtimeIsNotNull() {
            addCriterion("book_addtime is not null");
            return (Criteria) this;
        }

        public Criteria andBookAddtimeEqualTo(Date value) {
            addCriterion("book_addtime =", value, "bookAddtime");
            return (Criteria) this;
        }

        public Criteria andBookAddtimeNotEqualTo(Date value) {
            addCriterion("book_addtime <>", value, "bookAddtime");
            return (Criteria) this;
        }

        public Criteria andBookAddtimeGreaterThan(Date value) {
            addCriterion("book_addtime >", value, "bookAddtime");
            return (Criteria) this;
        }

        public Criteria andBookAddtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("book_addtime >=", value, "bookAddtime");
            return (Criteria) this;
        }

        public Criteria andBookAddtimeLessThan(Date value) {
            addCriterion("book_addtime <", value, "bookAddtime");
            return (Criteria) this;
        }

        public Criteria andBookAddtimeLessThanOrEqualTo(Date value) {
            addCriterion("book_addtime <=", value, "bookAddtime");
            return (Criteria) this;
        }

        public Criteria andBookAddtimeIn(List<Date> values) {
            addCriterion("book_addtime in", values, "bookAddtime");
            return (Criteria) this;
        }

        public Criteria andBookAddtimeNotIn(List<Date> values) {
            addCriterion("book_addtime not in", values, "bookAddtime");
            return (Criteria) this;
        }

        public Criteria andBookAddtimeBetween(Date value1, Date value2) {
            addCriterion("book_addtime between", value1, value2, "bookAddtime");
            return (Criteria) this;
        }

        public Criteria andBookAddtimeNotBetween(Date value1, Date value2) {
            addCriterion("book_addtime not between", value1, value2, "bookAddtime");
            return (Criteria) this;
        }

        public Criteria andBookCnclassLetterIsNull() {
            addCriterion("book_cnclass_letter is null");
            return (Criteria) this;
        }

        public Criteria andBookCnclassLetterIsNotNull() {
            addCriterion("book_cnclass_letter is not null");
            return (Criteria) this;
        }

        public Criteria andBookCnclassLetterEqualTo(String value) {
            addCriterion("book_cnclass_letter =", value, "bookCnclassLetter");
            return (Criteria) this;
        }

        public Criteria andBookCnclassLetterNotEqualTo(String value) {
            addCriterion("book_cnclass_letter <>", value, "bookCnclassLetter");
            return (Criteria) this;
        }

        public Criteria andBookCnclassLetterGreaterThan(String value) {
            addCriterion("book_cnclass_letter >", value, "bookCnclassLetter");
            return (Criteria) this;
        }

        public Criteria andBookCnclassLetterGreaterThanOrEqualTo(String value) {
            addCriterion("book_cnclass_letter >=", value, "bookCnclassLetter");
            return (Criteria) this;
        }

        public Criteria andBookCnclassLetterLessThan(String value) {
            addCriterion("book_cnclass_letter <", value, "bookCnclassLetter");
            return (Criteria) this;
        }

        public Criteria andBookCnclassLetterLessThanOrEqualTo(String value) {
            addCriterion("book_cnclass_letter <=", value, "bookCnclassLetter");
            return (Criteria) this;
        }

        public Criteria andBookCnclassLetterLike(String value) {
            addCriterion("book_cnclass_letter like", value, "bookCnclassLetter");
            return (Criteria) this;
        }

        public Criteria andBookCnclassLetterNotLike(String value) {
            addCriterion("book_cnclass_letter not like", value, "bookCnclassLetter");
            return (Criteria) this;
        }

        public Criteria andBookCnclassLetterIn(List<String> values) {
            addCriterion("book_cnclass_letter in", values, "bookCnclassLetter");
            return (Criteria) this;
        }

        public Criteria andBookCnclassLetterNotIn(List<String> values) {
            addCriterion("book_cnclass_letter not in", values, "bookCnclassLetter");
            return (Criteria) this;
        }

        public Criteria andBookCnclassLetterBetween(String value1, String value2) {
            addCriterion("book_cnclass_letter between", value1, value2, "bookCnclassLetter");
            return (Criteria) this;
        }

        public Criteria andBookCnclassLetterNotBetween(String value1, String value2) {
            addCriterion("book_cnclass_letter not between", value1, value2, "bookCnclassLetter");
            return (Criteria) this;
        }

        public Criteria andBookSubjectIdIsNull() {
            addCriterion("book_subject_id is null");
            return (Criteria) this;
        }

        public Criteria andBookSubjectIdIsNotNull() {
            addCriterion("book_subject_id is not null");
            return (Criteria) this;
        }

        public Criteria andBookSubjectIdEqualTo(Integer value) {
            addCriterion("book_subject_id =", value, "bookSubjectId");
            return (Criteria) this;
        }

        public Criteria andBookSubjectIdNotEqualTo(Integer value) {
            addCriterion("book_subject_id <>", value, "bookSubjectId");
            return (Criteria) this;
        }

        public Criteria andBookSubjectIdGreaterThan(Integer value) {
            addCriterion("book_subject_id >", value, "bookSubjectId");
            return (Criteria) this;
        }

        public Criteria andBookSubjectIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("book_subject_id >=", value, "bookSubjectId");
            return (Criteria) this;
        }

        public Criteria andBookSubjectIdLessThan(Integer value) {
            addCriterion("book_subject_id <", value, "bookSubjectId");
            return (Criteria) this;
        }

        public Criteria andBookSubjectIdLessThanOrEqualTo(Integer value) {
            addCriterion("book_subject_id <=", value, "bookSubjectId");
            return (Criteria) this;
        }

        public Criteria andBookSubjectIdIn(List<Integer> values) {
            addCriterion("book_subject_id in", values, "bookSubjectId");
            return (Criteria) this;
        }

        public Criteria andBookSubjectIdNotIn(List<Integer> values) {
            addCriterion("book_subject_id not in", values, "bookSubjectId");
            return (Criteria) this;
        }

        public Criteria andBookSubjectIdBetween(Integer value1, Integer value2) {
            addCriterion("book_subject_id between", value1, value2, "bookSubjectId");
            return (Criteria) this;
        }

        public Criteria andBookSubjectIdNotBetween(Integer value1, Integer value2) {
            addCriterion("book_subject_id not between", value1, value2, "bookSubjectId");
            return (Criteria) this;
        }

        public Criteria andBookCategoryIdIsNull() {
            addCriterion("book_category_id is null");
            return (Criteria) this;
        }

        public Criteria andBookCategoryIdIsNotNull() {
            addCriterion("book_category_id is not null");
            return (Criteria) this;
        }

        public Criteria andBookCategoryIdEqualTo(Integer value) {
            addCriterion("book_category_id =", value, "bookCategoryId");
            return (Criteria) this;
        }

        public Criteria andBookCategoryIdNotEqualTo(Integer value) {
            addCriterion("book_category_id <>", value, "bookCategoryId");
            return (Criteria) this;
        }

        public Criteria andBookCategoryIdGreaterThan(Integer value) {
            addCriterion("book_category_id >", value, "bookCategoryId");
            return (Criteria) this;
        }

        public Criteria andBookCategoryIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("book_category_id >=", value, "bookCategoryId");
            return (Criteria) this;
        }

        public Criteria andBookCategoryIdLessThan(Integer value) {
            addCriterion("book_category_id <", value, "bookCategoryId");
            return (Criteria) this;
        }

        public Criteria andBookCategoryIdLessThanOrEqualTo(Integer value) {
            addCriterion("book_category_id <=", value, "bookCategoryId");
            return (Criteria) this;
        }

        public Criteria andBookCategoryIdIn(List<Integer> values) {
            addCriterion("book_category_id in", values, "bookCategoryId");
            return (Criteria) this;
        }

        public Criteria andBookCategoryIdNotIn(List<Integer> values) {
            addCriterion("book_category_id not in", values, "bookCategoryId");
            return (Criteria) this;
        }

        public Criteria andBookCategoryIdBetween(Integer value1, Integer value2) {
            addCriterion("book_category_id between", value1, value2, "bookCategoryId");
            return (Criteria) this;
        }

        public Criteria andBookCategoryIdNotBetween(Integer value1, Integer value2) {
            addCriterion("book_category_id not between", value1, value2, "bookCategoryId");
            return (Criteria) this;
        }

        public Criteria andBookIsgetIsNull() {
            addCriterion("book_isget is null");
            return (Criteria) this;
        }

        public Criteria andBookIsgetIsNotNull() {
            addCriterion("book_isget is not null");
            return (Criteria) this;
        }

        public Criteria andBookIsgetEqualTo(Integer value) {
            addCriterion("book_isget =", value, "bookIsget");
            return (Criteria) this;
        }

        public Criteria andBookIsgetNotEqualTo(Integer value) {
            addCriterion("book_isget <>", value, "bookIsget");
            return (Criteria) this;
        }

        public Criteria andBookIsgetGreaterThan(Integer value) {
            addCriterion("book_isget >", value, "bookIsget");
            return (Criteria) this;
        }

        public Criteria andBookIsgetGreaterThanOrEqualTo(Integer value) {
            addCriterion("book_isget >=", value, "bookIsget");
            return (Criteria) this;
        }

        public Criteria andBookIsgetLessThan(Integer value) {
            addCriterion("book_isget <", value, "bookIsget");
            return (Criteria) this;
        }

        public Criteria andBookIsgetLessThanOrEqualTo(Integer value) {
            addCriterion("book_isget <=", value, "bookIsget");
            return (Criteria) this;
        }

        public Criteria andBookIsgetIn(List<Integer> values) {
            addCriterion("book_isget in", values, "bookIsget");
            return (Criteria) this;
        }

        public Criteria andBookIsgetNotIn(List<Integer> values) {
            addCriterion("book_isget not in", values, "bookIsget");
            return (Criteria) this;
        }

        public Criteria andBookIsgetBetween(Integer value1, Integer value2) {
            addCriterion("book_isget between", value1, value2, "bookIsget");
            return (Criteria) this;
        }

        public Criteria andBookIsgetNotBetween(Integer value1, Integer value2) {
            addCriterion("book_isget not between", value1, value2, "bookIsget");
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
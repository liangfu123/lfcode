package com.tsjg.core.bean;

public class BookCategory {
    private Integer bookCategoryId;

    private String bookCategoryName;

    public Integer getBookCategoryId() {
        return bookCategoryId;
    }

    public void setBookCategoryId(Integer bookCategoryId) {
        this.bookCategoryId = bookCategoryId;
    }

    public String getBookCategoryName() {
        return bookCategoryName;
    }

    public void setBookCategoryName(String bookCategoryName) {
        this.bookCategoryName = bookCategoryName == null ? null : bookCategoryName.trim();
    }
}
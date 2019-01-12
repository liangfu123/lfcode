package com.tsjg.core.bean;

import java.util.Date;

public class BookJg {
    private Integer bookjgId;

    private Date bookjgTime;

    private String isbn;

    private Integer userId;

    private Integer isget;

    public Integer getBookjgId() {
        return bookjgId;
    }

    public void setBookjgId(Integer bookjgId) {
        this.bookjgId = bookjgId;
    }

    public Date getBookjgTime() {
        return bookjgTime;
    }

    public void setBookjgTime(Date bookjgTime) {
        this.bookjgTime = bookjgTime;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn == null ? null : isbn.trim();
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getIsget() {
        return isget;
    }

    public void setIsget(Integer isget) {
        this.isget = isget;
    }
}
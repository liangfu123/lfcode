package com.tsjg.core.bean;

public class BookSubject {
    private Integer bookSubjectId;

    private String bookSubjectName;

    public Integer getBookSubjectId() {
        return bookSubjectId;
    }

    public void setBookSubjectId(Integer bookSubjectId) {
        this.bookSubjectId = bookSubjectId;
    }

    public String getBookSubjectName() {
        return bookSubjectName;
    }

    public void setBookSubjectName(String bookSubjectName) {
        this.bookSubjectName = bookSubjectName == null ? null : bookSubjectName.trim();
    }
}
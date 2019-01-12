package com.tsjg.core.bean;

public class BookCollection {
    private Integer bookCollectionId;

    private String isbn;

    private String bookLocation;

    public Integer getBookCollectionId() {
        return bookCollectionId;
    }

    public void setBookCollectionId(Integer bookCollectionId) {
        this.bookCollectionId = bookCollectionId;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn == null ? null : isbn.trim();
    }

    public String getBookLocation() {
        return bookLocation;
    }

    public void setBookLocation(String bookLocation) {
        this.bookLocation = bookLocation == null ? null : bookLocation.trim();
    }
}
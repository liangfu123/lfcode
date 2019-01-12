package com.tsjg.core.bean;

public class BookPurchase {
    private Integer bookPurchaseId;

    private String isbn;

    public Integer getBookPurchaseId() {
        return bookPurchaseId;
    }

    public void setBookPurchaseId(Integer bookPurchaseId) {
        this.bookPurchaseId = bookPurchaseId;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn == null ? null : isbn.trim();
    }
}
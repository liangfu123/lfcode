package com.tsjg.core.bean;

public class MyBookPurchase {
    private Integer bookPurchaseId;

    private String isbn;
    
    private Book book;

	public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
	}

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

    
@Override
	public String toString() {
		return "BookPurchase [bookPurchaseId=" + bookPurchaseId + ", isbn="
				+ isbn + ", book=" + book + ", pageNo="
				+ pageNo + ", startRow=" + startRow + ", pageSize=" + pageSize
				+ "]";
	}

/*************************page****************************/
	
	private Integer pageNo = 1;//int
	
	private Integer startRow;//null
	
	private Integer pageSize = 10;
	
	
	public Integer getStartRow() {
		return startRow;
	}
	public void setStartRow(Integer startRow) {
		this.startRow = startRow;
	}
	public Integer getPageSize() {
		return pageSize;
	}
	public void setPageSize(Integer pageSize) {
		
		this.startRow = (pageNo - 1)*pageSize;
		this.pageSize = pageSize;
	}
	public Integer getPageNo() {
		return pageNo;
	}
	public void setPageNo(Integer pageNo) {
		
		this.startRow = (pageNo - 1)*pageSize;
		this.pageNo = pageNo;
	}
    
}
package com.tsjg.core.bean;

import java.util.Date;

public class Book {
    private Integer bookId;

    private String bookName;

    private String bookAuthor;

    private String bookSummary;

    private String bookPublish;

    private String bookPubtime;

    private String isbn;

    private String bookNumberpage;

    private String bookPrice;

    private String bookImgurl;

    private Integer bookNum;

    private Date bookAddtime;
    
    private String bookCnclassLetter;

    private Integer bookSubjectId;

	private Integer bookCategoryId;

    private Integer bookIsget;
    
    private String bookSubjectName;
    
    private String bookCategoryName;
    
    private String bookCnclassName;

	private BookJg bookJg;
	
    public String getBookCnclassLetter() {
		return bookCnclassLetter;
	}

	public void setBookCnclassLetter(String bookCnclassLetter) {
		this.bookCnclassLetter = bookCnclassLetter;
	}

	public String getBookCnclassName() {
		return bookCnclassName;
	}

	public void setBookCnclassName(String bookCnclassName) {
		this.bookCnclassName = bookCnclassName;
	}

	public String getBookSubjectName() {
		return bookSubjectName;
	}

	public void setBookSubjectName(String bookSubjectName) {
		this.bookSubjectName = bookSubjectName;
	}

	public String getBookCategoryName() {
		return bookCategoryName;
	}

	public void setBookCategoryName(String bookCategoryName) {
		this.bookCategoryName = bookCategoryName;
	}

    public BookJg getBookJg() {
		return bookJg;
	}

	public void setBookJg(BookJg bookJg) {
		this.bookJg = bookJg;
	}

    public Integer getBookId() {
        return bookId;
    }

    public void setBookId(Integer bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName == null ? null : bookName.trim();
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor == null ? null : bookAuthor.trim();
    }

    public String getBookSummary() {
        return bookSummary;
    }

    public void setBookSummary(String bookSummary) {
        this.bookSummary = bookSummary == null ? null : bookSummary.trim();
    }

    public String getBookPublish() {
        return bookPublish;
    }

    public void setBookPublish(String bookPublish) {
        this.bookPublish = bookPublish == null ? null : bookPublish.trim();
    }

    public String getBookPubtime() {
        return bookPubtime;
    }

    public void setBookPubtime(String bookPubtime) {
        this.bookPubtime = bookPubtime == null ? null : bookPubtime.trim();
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn == null ? null : isbn.trim();
    }

    public String getBookNumberpage() {
        return bookNumberpage;
    }

    public void setBookNumberpage(String bookNumberpage) {
        this.bookNumberpage = bookNumberpage == null ? null : bookNumberpage.trim();
    }

    public String getBookPrice() {
        return bookPrice;
    }

    public void setBookPrice(String bookPrice) {
        this.bookPrice = bookPrice == null ? null : bookPrice.trim();
    }

    public String getBookImgurl() {
        return bookImgurl;
    }

    public void setBookImgurl(String bookImgurl) {
        this.bookImgurl = bookImgurl == null ? null : bookImgurl.trim();
    }

    public Integer getBookNum() {
        return bookNum;
    }

    public void setBookNum(Integer bookNum) {
        this.bookNum = bookNum;
    }

    public Date getBookAddtime() {
        return bookAddtime;
    }

    public void setBookAddtime(Date bookAddtime) {
        this.bookAddtime = bookAddtime;
    }

    public Integer getBookSubjectId() {
        return bookSubjectId;
    }

    public void setBookSubjectId(Integer bookSubjectId) {
        this.bookSubjectId = bookSubjectId;
    }

    public Integer getBookCategoryId() {
        return bookCategoryId;
    }

    public void setBookCategoryId(Integer bookCategoryId) {
        this.bookCategoryId = bookCategoryId;
    }

    public Integer getBookIsget() {
        return bookIsget;
    }

    public void setBookIsget(Integer bookIsget) {
        this.bookIsget = bookIsget;
    }
    
/*************************page****************************/
	
	//页号:1,2,3,4......
	private Integer pageNo = 1;//int
	//每一页开始行:0,10,20......
	private Integer startRow;//null
	//每页记录数:默认一次查询10条记录
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
		//计算一次开始行
		this.startRow = (pageNo - 1)*pageSize;
		this.pageSize = pageSize;
	}
	public Integer getPageNo() {
		return pageNo;
	}
	public void setPageNo(Integer pageNo) {
		//计算一次开始行
		this.startRow = (pageNo - 1)*pageSize;
		this.pageNo = pageNo;
	}
}
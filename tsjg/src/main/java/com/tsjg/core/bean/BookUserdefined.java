package com.tsjg.core.bean;

import java.util.Date;

public class BookUserdefined {
    private Integer bookUserdefinedId;

    private String bookUdName;

    private String bookUdAuthor;

    private String bookUdPublish;

    private String isbn;

    private Date bookUdPubtime;

    private Integer userId;

    private Date bookJgTime;

    private Integer isget;

    public Integer getBookUserdefinedId() {
        return bookUserdefinedId;
    }

    public void setBookUserdefinedId(Integer bookUserdefinedId) {
        this.bookUserdefinedId = bookUserdefinedId;
    }

    public String getBookUdName() {
        return bookUdName;
    }

    public void setBookUdName(String bookUdName) {
        this.bookUdName = bookUdName == null ? null : bookUdName.trim();
    }

    public String getBookUdAuthor() {
        return bookUdAuthor;
    }

    public void setBookUdAuthor(String bookUdAuthor) {
        this.bookUdAuthor = bookUdAuthor == null ? null : bookUdAuthor.trim();
    }

    public String getBookUdPublish() {
        return bookUdPublish;
    }

    public void setBookUdPublish(String bookUdPublish) {
        this.bookUdPublish = bookUdPublish == null ? null : bookUdPublish.trim();
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn == null ? null : isbn.trim();
    }

    public Date getBookUdPubtime() {
        return bookUdPubtime;
    }

    public void setBookUdPubtime(Date bookUdPubtime) {
        this.bookUdPubtime = bookUdPubtime;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Date getBookJgTime() {
        return bookJgTime;
    }

    public void setBookJgTime(Date bookJgTime) {
        this.bookJgTime = bookJgTime;
    }

    public Integer getIsget() {
        return isget;
    }

    public void setIsget(Integer isget) {
        this.isget = isget;
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
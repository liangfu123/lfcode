package com.tsjg.core.bean;

import java.util.Date;

public class BookComment {
    private Integer bcId;

    private String bcContent;

    private Date bcTime;

    private Integer bcNouse;

    private Integer bcBeuse;

    private Integer bookId;

    private Integer userId;
    
    private String username;

    public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public Integer getBcId() {
        return bcId;
    }

    public void setBcId(Integer bcId) {
        this.bcId = bcId;
    }

    public String getBcContent() {
        return bcContent;
    }

    public void setBcContent(String bcContent) {
        this.bcContent = bcContent == null ? null : bcContent.trim();
    }

    public Date getBcTime() {
        return bcTime;
    }

    public void setBcTime(Date bcTime) {
        this.bcTime = bcTime;
    }

    public Integer getBcNouse() {
        return bcNouse;
    }

    public void setBcNouse(Integer bcNouse) {
        this.bcNouse = bcNouse;
    }

    public Integer getBcBeuse() {
        return bcBeuse;
    }

    public void setBcBeuse(Integer bcBeuse) {
        this.bcBeuse = bcBeuse;
    }

    public Integer getBookId() {
        return bookId;
    }

    public void setBookId(Integer bookId) {
        this.bookId = bookId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }
}
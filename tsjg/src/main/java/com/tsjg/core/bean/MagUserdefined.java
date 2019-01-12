package com.tsjg.core.bean;

import java.util.Date;

public class MagUserdefined {
    private Integer magUserdefinedId;

    private String magUdTitle;

    private String magUdCompetent;

    private String magUdHostunit;

    private String magUdMailnum;

    private String magUdCn;

    private String magIssn;

    private Integer userId;

    private Date magJgTime;

    private Integer isget;

    public Integer getMagUserdefinedId() {
        return magUserdefinedId;
    }

    public void setMagUserdefinedId(Integer magUserdefinedId) {
        this.magUserdefinedId = magUserdefinedId;
    }

    public String getMagUdTitle() {
        return magUdTitle;
    }

    public void setMagUdTitle(String magUdTitle) {
        this.magUdTitle = magUdTitle == null ? null : magUdTitle.trim();
    }

    public String getMagUdCompetent() {
        return magUdCompetent;
    }

    public void setMagUdCompetent(String magUdCompetent) {
        this.magUdCompetent = magUdCompetent == null ? null : magUdCompetent.trim();
    }

    public String getMagUdHostunit() {
        return magUdHostunit;
    }

    public void setMagUdHostunit(String magUdHostunit) {
        this.magUdHostunit = magUdHostunit == null ? null : magUdHostunit.trim();
    }

    public String getMagUdMailnum() {
        return magUdMailnum;
    }

    public void setMagUdMailnum(String magUdMailnum) {
        this.magUdMailnum = magUdMailnum == null ? null : magUdMailnum.trim();
    }

    public String getMagUdCn() {
        return magUdCn;
    }

    public void setMagUdCn(String magUdCn) {
        this.magUdCn = magUdCn == null ? null : magUdCn.trim();
    }

    public String getMagIssn() {
        return magIssn;
    }

    public void setMagIssn(String magIssn) {
        this.magIssn = magIssn == null ? null : magIssn.trim();
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Date getMagJgTime() {
        return magJgTime;
    }

    public void setMagJgTime(Date magJgTime) {
        this.magJgTime = magJgTime;
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
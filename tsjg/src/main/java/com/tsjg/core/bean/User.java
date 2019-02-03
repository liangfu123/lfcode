package com.tsjg.core.bean;

import java.io.Serializable;

@SuppressWarnings("serial")
public class User implements Serializable {
    private Integer userId;

    private String username;

    private String password;

    private Integer isadministrator;

    private String realname;

    private String sex;

    private String phone;

    private String email;

    private String qq;

    private String type;

    private String college;

    private Integer isReview;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public Integer getIsadministrator() {
        return isadministrator;
    }

    public void setIsadministrator(Integer isadministrator) {
        this.isadministrator = isadministrator;
    }

    public String getRealname() {
        return realname;
    }

    public void setRealname(String realname) {
        this.realname = realname == null ? null : realname.trim();
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getQq() {
        return qq;
    }

    public void setQq(String qq) {
        this.qq = qq == null ? null : qq.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getCollege() {
        return college;
    }

    public void setCollege(String college) {
        this.college = college == null ? null : college.trim();
    }

    public Integer getIsReview() {
        return isReview;
    }

    public void setIsReview(Integer isReview) {
        this.isReview = isReview;
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
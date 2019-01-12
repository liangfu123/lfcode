package com.tsjg.core.bean;

import java.util.Date;

public class Mag {
    private Integer magId;

    private String magTitle;

    private String magCompetent;

    private String magHostunit;

    private String magMailnum;

    private String magIssn;

    private String magCn;

    private String magPubcycle;

    private String magIntro;

    private String magPrice;

    private String magImgurl;

    private String magCategoryId;

    private Date magAddtime;

    private Integer magNum;

    private Integer magIsget;
    
    private MagJg magJg;
    
    private String magCategoryName;
    
    public String getMagCategoryName() {
		return magCategoryName;
	}

	public void setMagCategoryName(String magCategoryName) {
		this.magCategoryName = magCategoryName;
	}

	public MagJg getMagJg() {
		return magJg;
	}

	public void setMagJg(MagJg magJg) {
		this.magJg = magJg;
	}

	public Integer getMagId() {
        return magId;
    }

    public void setMagId(Integer magId) {
        this.magId = magId;
    }

    public String getMagTitle() {
        return magTitle;
    }

    public void setMagTitle(String magTitle) {
        this.magTitle = magTitle == null ? null : magTitle.trim();
    }

    public String getMagCompetent() {
        return magCompetent;
    }

    public void setMagCompetent(String magCompetent) {
        this.magCompetent = magCompetent == null ? null : magCompetent.trim();
    }

    public String getMagHostunit() {
        return magHostunit;
    }

    public void setMagHostunit(String magHostunit) {
        this.magHostunit = magHostunit == null ? null : magHostunit.trim();
    }

    public String getMagMailnum() {
        return magMailnum;
    }

    public void setMagMailnum(String magMailnum) {
        this.magMailnum = magMailnum == null ? null : magMailnum.trim();
    }

    public String getMagIssn() {
        return magIssn;
    }

    public void setMagIssn(String magIssn) {
        this.magIssn = magIssn == null ? null : magIssn.trim();
    }

    public String getMagCn() {
        return magCn;
    }

    public void setMagCn(String magCn) {
        this.magCn = magCn == null ? null : magCn.trim();
    }

    public String getMagPubcycle() {
        return magPubcycle;
    }

    public void setMagPubcycle(String magPubcycle) {
        this.magPubcycle = magPubcycle == null ? null : magPubcycle.trim();
    }

    public String getMagIntro() {
        return magIntro;
    }

    public void setMagIntro(String magIntro) {
        this.magIntro = magIntro == null ? null : magIntro.trim();
    }

    public String getMagPrice() {
        return magPrice;
    }

    public void setMagPrice(String magPrice) {
        this.magPrice = magPrice == null ? null : magPrice.trim();
    }

    public String getMagImgurl() {
        return magImgurl;
    }

    public void setMagImgurl(String magImgurl) {
        this.magImgurl = magImgurl == null ? null : magImgurl.trim();
    }

    public String getMagCategoryId() {
        return magCategoryId;
    }

    public void setMagCategoryId(String magCategoryId) {
        this.magCategoryId = magCategoryId == null ? null : magCategoryId.trim();
    }

    public Date getMagAddtime() {
        return magAddtime;
    }

    public void setMagAddtime(Date magAddtime) {
        this.magAddtime = magAddtime;
    }

    public Integer getMagNum() {
        return magNum;
    }

    public void setMagNum(Integer magNum) {
        this.magNum = magNum;
    }

    public Integer getMagIsget() {
        return magIsget;
    }

    public void setMagIsget(Integer magIsget) {
        this.magIsget = magIsget;
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
package com.tsjg.core.bean;

public class MagPurchase {
    private Integer magPurchaseId;

    private String magIssn;

    private Mag mag;
    
    public Mag getMag() {
		return mag;
	}

	public void setMag(Mag mag) {
		this.mag = mag;
	}

	public Integer getMagPurchaseId() {
        return magPurchaseId;
    }

    public void setMagPurchaseId(Integer magPurchaseId) {
        this.magPurchaseId = magPurchaseId;
    }

    public String getMagIssn() {
        return magIssn;
    }

    public void setMagIssn(String magIssn) {
        this.magIssn = magIssn == null ? null : magIssn.trim();
    }
    
@Override
	public String toString() {
		return "MagPurchase [magPurchaseId=" + magPurchaseId + ", magIssn="
				+ magIssn + ", mag=" + mag + ", pageNo=" + pageNo
				+ ", startRow=" + startRow + ", pageSize=" + pageSize + "]";
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
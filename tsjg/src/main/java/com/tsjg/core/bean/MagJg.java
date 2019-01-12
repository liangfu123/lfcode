package com.tsjg.core.bean;

import java.util.Date;

public class MagJg {
    private Integer magjgId;

    private Date magjgTime;

    private String magIssn;

    private Integer userId;

    private Integer isget;

    public Integer getMagjgId() {
        return magjgId;
    }

    public void setMagjgId(Integer magjgId) {
        this.magjgId = magjgId;
    }

    public Date getMagjgTime() {
        return magjgTime;
    }

    public void setMagjgTime(Date magjgTime) {
        this.magjgTime = magjgTime;
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

    public Integer getIsget() {
        return isget;
    }

    public void setIsget(Integer isget) {
        this.isget = isget;
    }
}
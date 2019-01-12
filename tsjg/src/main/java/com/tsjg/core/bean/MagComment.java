package com.tsjg.core.bean;

import java.util.Date;

public class MagComment {
    private Integer mcId;

    private String mcContent;

    private Date mcTime;

    private Integer mcNouse;

    private Integer mcBeuse;

    private Integer magId;

    private Integer userId;
    
    private String username;

    public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public Integer getMcId() {
        return mcId;
    }

    public void setMcId(Integer mcId) {
        this.mcId = mcId;
    }

    public String getMcContent() {
        return mcContent;
    }

    public void setMcContent(String mcContent) {
        this.mcContent = mcContent == null ? null : mcContent.trim();
    }

    public Date getMcTime() {
        return mcTime;
    }

    public void setMcTime(Date mcTime) {
        this.mcTime = mcTime;
    }

    public Integer getMcNouse() {
        return mcNouse;
    }

    public void setMcNouse(Integer mcNouse) {
        this.mcNouse = mcNouse;
    }

    public Integer getMcBeuse() {
        return mcBeuse;
    }

    public void setMcBeuse(Integer mcBeuse) {
        this.mcBeuse = mcBeuse;
    }

    public Integer getMagId() {
        return magId;
    }

    public void setMagId(Integer magId) {
        this.magId = magId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }
}
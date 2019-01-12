package com.tsjg.core.bean;

public class MagCategory {
    private Integer magCategoryId;

    private String magCategoryName;

    public Integer getMagCategoryId() {
        return magCategoryId;
    }

    public void setMagCategoryId(Integer magCategoryId) {
        this.magCategoryId = magCategoryId;
    }

    public String getMagCategoryName() {
        return magCategoryName;
    }

    public void setMagCategoryName(String magCategoryName) {
        this.magCategoryName = magCategoryName == null ? null : magCategoryName.trim();
    }
}
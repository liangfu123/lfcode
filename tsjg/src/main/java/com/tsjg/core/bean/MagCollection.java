package com.tsjg.core.bean;

public class MagCollection {
    private Integer magCollectionId;

    private String issn;

    private String magLocation;

    public Integer getMagCollectionId() {
        return magCollectionId;
    }

    public void setMagCollectionId(Integer magCollectionId) {
        this.magCollectionId = magCollectionId;
    }

    public String getIssn() {
        return issn;
    }

    public void setIssn(String issn) {
        this.issn = issn == null ? null : issn.trim();
    }

    public String getMagLocation() {
        return magLocation;
    }

    public void setMagLocation(String magLocation) {
        this.magLocation = magLocation == null ? null : magLocation.trim();
    }
}
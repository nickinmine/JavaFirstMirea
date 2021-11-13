package ru.mirea.task16;

public class Product extends Person {
    private Products productName;
    private float percentValue;
    private String openDate;
    private String closeDate;
    private float sum;
    private long accountID;

    Product() {
        this.productName = null;
        this.percentValue = 0f;
        this.sum = 0f;
        this.accountID = 0l;
        this.openDate = "";
        this.closeDate = "";
    }

    Product(Products productName, float percentValue, float sum, String openDate, String closeDate) {
        this.productName = productName;
        this.percentValue = percentValue;
        this.sum = sum;
        this.openDate = openDate;
        this.closeDate = closeDate;
    }

    public void setAccountID(long accountID) {
        this.accountID = accountID;
    }

    public Products getProductName() {
        return this.productName;
    }

    public float getPercentValue() {
        return this.percentValue;
    }

    public long getAccountID() {
        return this.accountID;
    }

    public String getOpenDate() {
        return this.openDate;
    }

    public String getCloseDate() {
        return this.closeDate;
    }
}
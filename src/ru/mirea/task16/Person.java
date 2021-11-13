package ru.mirea.task16;

public class Person {
    private String personName, openDate, closeDate;
    private Products productName;

    Person() {
        this.personName = "";
        this.productName = null;
        this.openDate = "";
        this.closeDate = "";
    }

    public void setOperatorName(String personName) {
        this.personName = personName;
    }

    public void setCustomerName(String personName) {
        this.personName = personName;
    }

    public void setProductName(Products productName) {
        this.productName = productName;
    }

    public String getOperatorName() {
        return this.personName;
    }

    public String getCustomerName() {
        return this.personName;
    }

    public Products getProductName() {
        return this.productName;
    }

    public void openProduct(Products productName, String openDate, String closeDate) {
        this.productName = productName;
        this.openDate = openDate;
        this.closeDate = closeDate;
    }
}
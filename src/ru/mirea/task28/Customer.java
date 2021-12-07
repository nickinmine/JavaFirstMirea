package ru.mirea.task28;

public class Customer {
    protected String name;
    protected int accountNum;
    protected float account;

    Customer() {
        this.name = "";
        this.accountNum = 0;
        this.account = 0;
    }
    
    Customer(String name, int accountNum, float account){
        this.name = name;
        this.accountNum = accountNum;
        this.account = account;
    }
    
    public void setName(String name) { this.name = name; }

    public void setAccountNum(int accountNum) { this.accountNum = accountNum; }

    public void setAccount(float account) { this.account = account; }
    
    public String getName() { return name; }
    
    public int getAccountNum() { return accountNum; }
    
    public float getAccount() { return account; }

    static class AdditionalAccount extends Customer {
        protected float account;
        public AdditionalAccount(float account) { this.account = account; }

        public float getAccount() { return account; }

        public void setAccount(float account) { this.account = account; }
    }

    public static void main(String[] args) {
        Customer.AdditionalAccount customerAccount = new Customer.AdditionalAccount(4566.245f);
        System.out.println(customerAccount.getAccount());
    }
}
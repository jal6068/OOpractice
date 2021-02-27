package com;

public class Account {

    private int accountId;
    private int customerId;
    private String accountType;
    private double accountBalance;

    public Account(int accountId, int customerId, String accountType, double accountBalance) {
        this.accountId = accountId;
        this.customerId = customerId;
        this.accountType = accountType;
        this.accountBalance = accountBalance;
    }

    public int getAccountId() {

        return accountId;
    }

    public void setAccountId(int accountId) {

        this.accountId = accountId;
    }

    public int getCustomerId() {

        return customerId;
    }

    public void setCustomerId(int customerId) {

        this.customerId = customerId;
    }

    public String getAccountType() {

        return accountType;
    }

    public void setAccountType(String accountType) {

        this.accountType = accountType;
    }

    public double getAccountBalance() {

        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {

        this.accountBalance = accountBalance;
    }

}

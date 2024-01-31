package com.krishna.bos;

import java.util.UUID;

public class Transaction {
    private String transactionId;
    private Account account;
    private String date;
    private double amount;

    public Transaction(Account account, String date, double amount) {
        this.transactionId = UUID.randomUUID().toString();
        this.account = account;
        this.date = date;
        this.amount = amount;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "transactionId='" + transactionId + '\'' +
                ", account=" + account +
                ", date='" + date + '\'' +
                ", amount=" + amount +
                "}\n";
    }
}

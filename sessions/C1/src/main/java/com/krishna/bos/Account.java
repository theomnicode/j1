package com.krishna.bos;

import java.util.ArrayList;

public class Account implements OverDraft, AdvATM{
    private String accoutNo;
    private String accountName;
    private double balance;
    private ArrayList<Transaction> transactions = new ArrayList<>();

    public String getAccoutNo() {
        return accoutNo;
    }

    public void setAccoutNo(String accoutNo) {
        this.accoutNo = accoutNo;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public double getBalance() {
        return balance;
    }

    public ArrayList<Transaction> getTransactions(double amount) {
        ArrayList<Transaction> filteredTransactions = new ArrayList<>();
        for(Transaction trans:transactions){
            if(trans.getAmount() <= amount){
                filteredTransactions.add(trans);
            }
        }
        return filteredTransactions;
    }

    public ArrayList<Transaction> getTransactions(Filter filter) {
        ArrayList<Transaction> filteredTransactions = new ArrayList<>();
        for(Transaction trans:transactions){
            if(filter.isRequired(trans)){
                filteredTransactions.add(trans);
            }
        }
        return filteredTransactions;
    }
    public double withdraw(double amount, String date){
        Transaction transaction = new Transaction(this, date, -amount);
        this.balance-=amount;
        this.transactions.add(transaction);
        return balance;
    }
    public boolean onlineTransfer(){
        //TODO Online Transfer
        return true;
    }
    public double deposite(double amount, String date){
        Transaction transaction = new Transaction(this, date, amount);
        this.balance+=amount;
        this.transactions.add(transaction);
        return balance;
    }
    public double overdraft(){
        //TODO overtraft;
        return balance;
    }
    public ArrayList<Transaction> getStatement(){
        return transactions;
    }

    public boolean emailStatement(){
        //TODO email statement
        return true;
    }

    @Override
    public String toString() {
        return "Account{" +
                "accoutNo='" + accoutNo + '\'' +
                ", accountName='" + accountName + '\'' +
                '}';
    }
}

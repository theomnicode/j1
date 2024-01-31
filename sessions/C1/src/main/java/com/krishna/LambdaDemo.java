package com.krishna;

import com.krishna.bos.*;

public class LambdaDemo {
    public static void main(String[] args) {
        Account acc = new Account();
        Account acc2 = new Account();

        acc.setAccoutNo("AC100011");
        acc.setAccountName("Geetha");
        acc.deposite(1000,"01-01-2024");
        acc.deposite(5000,"02-01-2024");
        acc.deposite(2000,"02-01-2024");
        acc.deposite(50000,"03-01-2024");
        acc.deposite(10000,"04-01-2024");
        acc.deposite(100,"16-01-2024");

        acc.withdraw(100,"16-01-2024");
        acc.withdraw(5000,"17-01-2024");
        acc.withdraw(6000,"18-01-2024");
        acc.withdraw(500,"01-01-2024");
        acc.withdraw(1000,"12-01-2024");



        System.out.println(acc.getTransactions((trans)->trans.getAmount()>5000));

        System.out.println(acc.getTransactions(DepositFilter::filter));
    }
}

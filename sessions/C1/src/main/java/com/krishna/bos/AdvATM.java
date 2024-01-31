package com.krishna.bos;

import java.util.ArrayList;

public interface AdvATM {
    public double withdraw(double amount, String date);
    public double deposite(double amount, String date);
    public ArrayList<Transaction> getStatement();
}

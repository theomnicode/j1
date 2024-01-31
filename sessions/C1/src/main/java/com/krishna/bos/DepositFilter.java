package com.krishna.bos;

public class DepositFilter{
    public static boolean filter(Transaction trans) {
        return trans.getAmount()>0;
    }
}

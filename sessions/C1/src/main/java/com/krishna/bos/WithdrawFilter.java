package com.krishna.bos;

public class WithdrawFilter implements  Filter{
    @Override
    public boolean isRequired(Transaction trans) {
        return trans.getAmount()<0;
    }
}

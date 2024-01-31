package com.krishna.bos;
@FunctionalInterface
public interface Filter {
    boolean isRequired(Transaction trans);
}

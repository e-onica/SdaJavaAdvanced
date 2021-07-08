package com.sda.billapp;

public interface PayableType {

    int getValue();
    CurrencyType currencyType();
    boolean isFake();

}

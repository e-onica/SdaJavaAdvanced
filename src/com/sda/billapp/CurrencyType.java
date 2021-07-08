package com.sda.billapp;

public enum CurrencyType {
    EUR("euro"),
    USD("dolar"),
    RON("leu");
    private String name;

    CurrencyType(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}

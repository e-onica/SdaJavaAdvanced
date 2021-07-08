package com.sda.billapp;

import java.util.ArrayList;
import java.util.List;

public class Payment {

    private double amountCollected;
    private Bill bill;
    private List<PayableType> payableTypeList = new ArrayList();

    public Payment(double amountCollected, Bill bill) {
        this.amountCollected = amountCollected;
        this.bill = bill;
    }

    public double getAmountCollected() {
        return amountCollected;
    }

    public void setAmountCollected(double amountCollected) {
        this.amountCollected = amountCollected;
    }

    public Bill getBill() {
        return bill;
    }

    public void setBill(Bill bill) {
        this.bill = bill;
    }

    public boolean isBillPayed(){
        return amountCollected >= bill.getAmount();
    }
    public void addNewPayableType(PayableType payableType){
        if(payableType.isFake()) {
            payableTypeList.add(payableType);
        }
        amountCollected += payableType.getValue();
    }
}

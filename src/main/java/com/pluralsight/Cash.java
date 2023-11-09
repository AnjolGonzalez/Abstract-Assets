package com.pluralsight;

public class Cash extends Asset{
    public double cash;
    public Cash(String dateAcquired, String description, double originalCost, double cash) {
        super(dateAcquired, description, originalCost);
        this.cash = cash;
    }
    public double value() {
        return originalCost;
    }
}

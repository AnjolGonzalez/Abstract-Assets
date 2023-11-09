package com.pluralsight;

public class Cash extends Asset{
    public Cash(String dateAcquired, String description, double originalCost) {
        super(dateAcquired, description, originalCost);
    }
    public double value() {
        return originalCost;
    }
}

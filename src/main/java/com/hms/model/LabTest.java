package com.hms.model;

public class LabTest {
    protected String title;
    protected double cost;
    protected boolean isAvailable;

    public LabTest(String title, double cost, boolean isAvailable) {
        this.title = title;
        this.cost = cost;
        this.isAvailable = isAvailable;
    }

    public String returnLabTestInfo() {
        return "Test name: " + this.title + "\n"
                + "Cost: " + this.cost + "\n"
                + "Availability:  " + this.isAvailable;
    }
}

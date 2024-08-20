package com.hms.model;

/**
 * @Atia Azmi
 */
public class PathologicalTest {

    public String title;
    double cost;
    boolean isAvailable;

    // Corrected constructor
    public PathologicalTest(String title, double cost, boolean isAvailable) {
        this.title = title;
        this.cost = cost;
        this.isAvailable = isAvailable;
    }
    public String returnLabTestInfo() {
        String output = "Test name: " + this.title + "\n"
                + "Cost: " + this.cost + "\n"
                + "Availability:  " + this.isAvailable;
        return output;
    }
//    void search(String title) {
//        if (this.title.equals(title)) {
//            System.out.println(returnLabTestInfo());
//        } else {
//            System.out.println("Not found");
//        }
//    }
}

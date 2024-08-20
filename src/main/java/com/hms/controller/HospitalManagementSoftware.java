package com.hms.controller;

import com.hms.model.PathologicalTest;
import com.hms.view.Home;

/**
 * @Atia Azmi
 */
public class HospitalManagementSoftware {

    public static void main(String[] args) {
        System.out.println("Showing the Home Page");
        new Home().setVisible(true);
        PathologicalTest pathologicalTest = new PathologicalTest("CBC", 1.0, false);
        System.out.println(pathologicalTest.returnLabTestInfo());
    }
}

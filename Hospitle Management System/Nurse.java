package com.company.Hospital;

public class Nurse extends HospitalStaff {

    // Attributes
    private String shiftTimings;

    // Constructor
    public Nurse(int staffId, String name, String department, String shiftTimings) {
        super(staffId, name, department);
        this.shiftTimings = shiftTimings;
    }

    // Overriding work method to define nurse's role
    @Override
    public void work() {
        System.out.println(getName() + " is assisting doctors, caring for patients, and managing medications.");
    }

    // Overriding toString method for better readability
    @Override
    public String toString() {
        return super.toString() + " Nurse { Shift Timing: " + shiftTimings + " }";
    }
}

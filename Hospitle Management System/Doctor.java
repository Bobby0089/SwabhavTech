package com.company.Hospital;

import java.util.Arrays; // Import for array conversion

public class Doctor extends HospitalStaff {
    
    // Attributes
    private String specialization;
    private String[] patientsNames;
    
    // Constructor
    public Doctor(int staffId, String name, String department, String specialization, String[] patientsNames) {
        super(staffId, name, department);
        this.specialization = specialization;
        this.patientsNames = Arrays.copyOf(patientsNames, patientsNames.length); // Defensive Copy
    }

    // Overriding work method to define doctor's role
    @Override
    public void work() {
        System.out.println(getName() + " is diagnosing patients, prescribing treatments, and conducting medical procedures.");
    }

    // Overriding toString method for better readability
    @Override
    public String toString() {
        return super.toString() + " Doctor { Specialization: " + specialization + 
               ", Patients Names: " + Arrays.toString(patientsNames) + " }";
    }
}

package com.company.Hospital;

public abstract class HospitalStaff {
    
    // Attributes
    private int staffId;
    private String name;
    private String department;
    
    // Constructor
    public HospitalStaff(int staffId, String name, String department) {
        this.staffId = staffId;
        this.name = name;
        this.department = department;
    }
    
    // Getters
    public int getStaffId() {
        return staffId;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    // Setter for department (if needed)
    public void setDepartment(String department) {
        this.department = department;
    }

    // Abstract method to be implemented by subclasses
    public abstract void work();
    
    // toString method for object representation
    @Override
    public String toString() {
        return "HospitalStaff { Staff Id: " + staffId + ", Name: " + name + ", Department: " + department + " }";
    }
}

package com.company.Hospital;

import java.util.Scanner;

public class HospitalStaffTest {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of staff members you want to add: ");
        int numberOfStaff = sc.nextInt();
        HospitalStaff[] staffMembers = new HospitalStaff[numberOfStaff];

        for (int i = 0; i < numberOfStaff; i++) {
            int staffId = validateStaffId(sc, staffMembers, i);
            sc.nextLine(); // Consume newline character

            System.out.println("Enter name of staff member " + (i + 1) + ": ");
            String staffName = sc.nextLine();

            System.out.println("Enter department: ");
            String staffDepartment = sc.nextLine();

            String choice;
            while (true) {
                System.out.println("Doctor or Nurse: ");
                choice = sc.nextLine();

                if (choice.equalsIgnoreCase("doctor") || choice.equalsIgnoreCase("nurse")) {
                    break; // Valid choice
                } else {
                    System.out.println("Invalid choice! Please enter 'Doctor' or 'Nurse'.");
                }
            }

            if (choice.equalsIgnoreCase("doctor")) {
                staffMembers[i] = createDoctor(sc, staffId, staffName, staffDepartment);
            } else {
                staffMembers[i] = createNurse(sc, staffId, staffName, staffDepartment);
            }
        }

        // Printing Hospital Staff
        for (HospitalStaff staff : staffMembers) {
            System.out.println(staff);
            staff.work();
            System.out.println();
        }

        // Closing scanner
        sc.close();
    }

    private static int validateStaffId(Scanner sc, HospitalStaff[] staffMembers, int index) {
        int staffId;
        boolean isValid;
        do {
            System.out.println("Enter Staff ID number: ");
            staffId = sc.nextInt();

            isValid = true;
            if (staffId < 0) {
                System.out.println("Error: ID number cannot be negative. Try again.");
                isValid = false;
            } else {
                for (int j = 0; j < index; j++) {
                    if (staffMembers[j].getStaffId() == staffId) {
                        System.out.println("Error: ID number already taken. Try again.");
                        isValid = false;
                        break;
                    }
                }
            }
        } while (!isValid);
        return staffId;
    }

    private static Doctor createDoctor(Scanner sc, int staffId, String name, String department) {
        System.out.println("Enter Specialization of Doctor: ");
        String doctorSpecialization = sc.nextLine();

        // Input Validation for Number of Patients
        int numPatients;
        do {
            System.out.println("Enter number of patients (must be >= 0): ");
            while (!sc.hasNextInt()) {
                System.out.println("Invalid input. Please enter a valid number.");
                sc.next(); // Discard invalid input
            }
            numPatients = sc.nextInt();
            sc.nextLine(); // Consume newline
        } while (numPatients < 0);

        String[] patients = new String[numPatients];
        for (int j = 0; j < numPatients; j++) {
            System.out.println("Enter Patient Name #" + (j + 1) + ": ");
            patients[j] = sc.nextLine();
        }

        return new Doctor(staffId, name, department, doctorSpecialization, patients);
    }

    private static Nurse createNurse(Scanner sc, int staffId, String staffName, String staffDepartment) {
        System.out.println("Enter shift timing: ");
        String timing = sc.nextLine();

        return new Nurse(staffId, staffName, staffDepartment, timing);
    }
}

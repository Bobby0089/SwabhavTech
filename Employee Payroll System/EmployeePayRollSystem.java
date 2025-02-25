package com.company.test;

import java.util.Scanner;
import com.company.module.Employee;
import com.company.module.JobRole;
import com.company.module.PayRoll;

public class EmployeePayRollSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PayRoll payroll = new PayRoll();

        // Adding Employees via User Input
        addEmployees(scanner, payroll);

        // Display All Employees
        payroll.displayAllEmployees();

        // Search Employees by Role
        searchEmployeesByRole(scanner, payroll);
        
        scanner.close();
    }

    private static void addEmployees(Scanner scanner, PayRoll payroll) {
        for (int i = 0; i < 5; i++) {
            int id = getValidEmployeeId(scanner, payroll);
            scanner.nextLine(); // Consume newline character

            System.out.println("Enter Employee Name:");
            String name = scanner.nextLine();

            double salary = getValidSalary(scanner);

            JobRole role = getValidJobRole(scanner);

            // Create and add employee to the payroll system
            Employee employee = new Employee(id, name, salary, role);
            payroll.addEmployee(employee);
        }
    }

    private static int getValidEmployeeId(Scanner scanner, PayRoll payroll) {
        int id;
        boolean isUnique;
        do {
            System.out.println("Enter Employee ID:");
            id = scanner.nextInt();
            isUnique = payroll.isUniqueId(id);

            if (id < 0) {
                System.out.println("Error: Employee ID cannot be negative. Try again.");
            } else if (!isUnique) {
                System.out.println("Error: Employee ID must be unique. Try again.");
            }
        } while (id < 0 || !isUnique);
        return id;
    }

    private static double getValidSalary(Scanner scanner) {
        double salary;
        do {
            System.out.println("Enter Employee Salary:");
            salary = scanner.nextDouble();
            if (salary < 0) {
                System.out.println("Error: Salary cannot be negative. Try again.");
            }
        } while (salary < 0);
        return salary;
    }

    private static JobRole getValidJobRole(Scanner scanner) {
        JobRole role = null;
        boolean validRole = false;

        do {
            try {
                System.out.println("Enter Employee Role (MANAGER, DEVELOPER, DESIGNER, TESTER, HR):");
                role = JobRole.valueOf(scanner.next().toUpperCase());
                validRole = true;
            } catch (IllegalArgumentException e) {
                System.out.println("Error: Invalid role entered. Please try again.");
            }
        } while (!validRole);

        return role;
    }

    private static void searchEmployeesByRole(Scanner scanner, PayRoll payroll) {
        System.out.println("\nEnter a role to search employees:");
        JobRole searchRole = getValidJobRole(scanner);
        payroll.searchByRole(searchRole);
    }
}
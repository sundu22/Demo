package CompetitionSystem;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Management {
    private List<Employee> employees;
    private Scanner scanner;

    public Management() {
        employees = new ArrayList<>();
        scanner = new Scanner(System.in);
    }

    public void run() {
        boolean exit = false;
        while (!exit) {
            System.out.println("\n--- Management System ---");
            System.out.println("1 - Add Employee");
            System.out.println("2 - List Employees");
            System.out.println("3 - Delete Employee");
            System.out.println("4 - Exit");
            System.out.print("Select an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    addEmployee();
                    break;
                case 2:
                    listEmployees();
                    break;
                case 3:
                    deleteEmployee();
                    break;
                case 4:
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }

        System.out.println("Exiting System...");
        scanner.close();
    }

    private void addEmployee() {
        System.out.print("Enter Employee Name: ");
        String name = scanner.nextLine();
        Employee employee = new Employee(name);
        employees.add(employee);
        System.out.println(name + " added successfully.");
    }

    private void listEmployees() {
        if (employees.isEmpty()) {
            System.out.println("No employees available.");
        } else {
            for (Employee employee : employees) {
                System.out.println(employee); // Assuming toString() in Employee class is overridden
            }
        }
    }

    private void deleteEmployee() {
        System.out.print("Enter Employee Name to delete: ");
        String name = scanner.nextLine();
        employees.removeIf(employee -> employee.getName().equals(name));
        System.out.println(name + " deleted successfully.");
    }

    public static void main(String[] args) {
        Management system = new Management();
        system.run();
    }
}

class Employee {
    private String name;

    public Employee(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Employee: " + name;
    }
}

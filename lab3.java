package oopslab;

import java.util.Scanner;

class Student {
    // Private instance variables
    private String usn;
    private String name;
    private String branch;
    private String phone;

    // Constructor to initialize Student object
    public Student(String usn, String name, String branch, String phone) {
        this.usn = usn;
        this.name = name;
        this.branch = branch;
        this.phone = phone;
    }

    // Method to print student details
    public void printDetails() {
        System.out.printf("%-15s %-20s %-15s %-15s\n", usn, name, branch, phone);
    }
}

public class lab3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user for the number of students
        System.out.print("Enter the number of students: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // To consume the newline character

        // Create an array of Student objects
        Student[] students = new Student[n];

        // Take input for each student's details
        for (int i = 0; i < n; i++) {
            System.out.println("Enter details for Student " + (i + 1) + ":");
            System.out.print("USN: ");
            String usn = scanner.nextLine();
            System.out.print("Name: ");
            String name = scanner.nextLine();
            System.out.print("Branch: ");
            String branch = scanner.nextLine();
            System.out.print("Phone: ");
            String phone = scanner.nextLine();

            // Create a new Student object and add it to the array
            students[i] = new Student(usn, name, branch, phone);
        }

        // Print the student details with suitable headings
        System.out.println("\nStudent Details:");
        System.out.printf("%-15s %-20s %-15s %-15s\n", "USN", "Name", "Branch", "Phone");
        System.out.println("------------------------------------------------------------");

        // Print the details of each student
        for (int i = 0; i < n; i++) {
            students[i].printDetails();
        }

        scanner.close();
    }
}

import java.util.ArrayList;
import java.util.Scanner;

// Superclass: Staff
class Staff {
    protected String staffId;
    protected String name;
    protected String phone;
    protected double salary;

    public Staff(String staffId, String name, String phone, double salary) {
        this.staffId = staffId;
        this.name = name;
        this.phone = phone;
        this.salary = salary;
    }

    public void display() {
        System.out.println("Staff ID: " + staffId);
        System.out.println("Name: " + name);
        System.out.println("Phone: " + phone);
        System.out.println("Salary: " + salary);
    }
}

// Subclass: Teaching
class Teaching extends Staff {
    private String domain;
    private int publications;

    public Teaching(String staffId, String name, String phone, double salary, String domain, int publications) {
        super(staffId, name, phone, salary);
        this.domain = domain;
        this.publications = publications;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Domain: " + domain);
        System.out.println("Publications: " + publications);
    }
}

// Subclass: Technical
class Technical extends Staff {
    private String skills;

    public Technical(String staffId, String name, String phone, double salary, String skills) {
        super(staffId, name, phone, salary);
        this.skills = skills;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Skills: " + skills);
    }
}

// Subclass: Contract
class Contract extends Staff {
    private int period; // in months

    public Contract(String staffId, String name, String phone, double salary, int period) {
        super(staffId, name, phone, salary);
        this.period = period;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Contract Period: " + period + " months");
    }
}

// Main class
public class StaffManagement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Staff> staffList = new ArrayList<>();

        // Input and create Teaching staff objects
        System.out.println("Enter details for Teaching staff:");
        for (int i = 1; i <= 3; i++) {
            System.out.println("Teaching Staff " + i + ":");
            System.out.print("Staff ID: ");
            String staffId = scanner.next();
            System.out.print("Name: ");
            String name = scanner.next();
            System.out.print("Phone: ");
            String phone = scanner.next();
            System.out.print("Salary: ");
            double salary = scanner.nextDouble();
            System.out.print("Domain: ");
            String domain = scanner.next();
            System.out.print("Publications: ");
            int publications = scanner.nextInt();
            staffList.add(new Teaching(staffId, name, phone, salary, domain, publications));
        }

        // Input and create Technical staff objects
        System.out.println("\nEnter details for Technical staff:");
        for (int i = 1; i <= 3; i++) {
            System.out.println("Technical Staff " + i + ":");
            System.out.print("Staff ID: ");
            String staffId = scanner.next();
            System.out.print("Name: ");
            String name = scanner.next();
            System.out.print("Phone: ");
            String phone = scanner.next();
            System.out.print("Salary: ");
            double salary = scanner.nextDouble();
            System.out.print("Skills: ");
            String skills = scanner.next();
            staffList.add(new Technical(staffId, name, phone, salary, skills));
        }

        // Input and create Contract staff objects
        System.out.println("\nEnter details for Contract staff:");
        for (int i = 1; i <= 3; i++) {
            System.out.println("Contract Staff " + i + ":");
            System.out.print("Staff ID: ");
            String staffId = scanner.next();
            System.out.print("Name: ");
            String name = scanner.next();
            System.out.print("Phone: ");
            String phone = scanner.next();
            System.out.print("Salary: ");
            double salary = scanner.nextDouble();
            System.out.print("Contract Period (months): ");
            int period = scanner.nextInt();
            staffList.add(new Contract(staffId, name, phone, salary, period));
        }

        // Display all staff details
        System.out.println("\nDisplaying all staff details:");
        for (Staff staff : staffList) {
            staff.display();
            System.out.println("-----------------------------");
        }

        scanner.close();
    }
}

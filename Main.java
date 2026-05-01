
interface Gross {
    double calculateGross();
}


class Employee {
    int empId;
    String name;
    double basic;

    // Constructor
    Employee(int empId, String name, double basic) {
        this.empId = empId;
        this.name = name;
        this.basic = basic;
    }

    void displayEmployee() {
        System.out.println("Employee ID: " + empId);
        System.out.println("Name: " + name);
        System.out.println("Basic Salary: " + basic);
    }
}


class Salary extends Employee implements Gross {
    double hra, da;

    Salary(int empId, String name, double basic, double hra, double da) {
        super(empId, name, basic);
        this.hra = hra;
        this.da = da;
    }

    
    public double calculateGross() {
        return basic + hra + da;
    }

    void displaySalary() {
        displayEmployee();
        System.out.println("HRA: " + hra);
        System.out.println("DA: " + da);
        System.out.println("Gross Salary: " + calculateGross());
    }
}


public class Main
 {
    public static void main(String[] args) {
        Salary s = new Salary(101, "Ansh", 20000, 5000, 3000);
        s.displaySalary();
    }
}
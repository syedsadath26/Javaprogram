class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Person Constructor");
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

class Employee extends Person {
    int empId;
    double basicSalary;

    Employee(String name, int age, int empId, double salary) {
        super(name, age);
        this.empId = empId;
        basicSalary = salary;
        System.out.println("Employee Constructor");
    }

    void display() {
        super.display();
        System.out.println("Employee ID: " + empId);
        System.out.println("Basic Salary: " + basicSalary);
    }
}

class Manager extends Employee {
    String department;
    double bonus;

    Manager(String name, int age, int empId,
            double salary, String department, double bonus) {

        super(name, age, empId, salary);
        this.department = department;
        this.bonus = bonus;
        System.out.println("Manager Constructor");
    }

    void calculateSalary() {
        System.out.println("Department: " + department);
        System.out.println("Total Salary: Rs. "
                + (basicSalary + bonus));
    }
}

public class ManagerTest {
    public static void main(String[] args) {

        Manager m = new Manager(
            "Vani", 20, 101, 30000, "Cyber Security", 5000
        );

        System.out.println();
        m.display();
        m.calculateSalary();
    }
}
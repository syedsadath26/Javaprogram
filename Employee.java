class Employee {
    int id;
    String name;
    double basicSalary;

    Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        basicSalary = salary;
    }

    double calculateSalary() {
        return basicSalary;
    }

    void display() {
        System.out.println("Employee ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Salary: Rs. " + calculateSalary());
        System.out.println();
    }
}

class PermanentEmployee extends Employee {

    PermanentEmployee(int id, String name, double salary) {
        super(id, name, salary);
    }

    @Override
    double calculateSalary() {
        return basicSalary + 5000 + 2000;
    }
}

class ContractEmployee extends Employee {
    int hours;
    double hourlyRate;

    ContractEmployee(int id, String name,
                     double salary, int hours, double rate) {
        super(id, name, salary);
        this.hours = hours;
        hourlyRate = rate;
    }

    @Override
    double calculateSalary() {
        return hours * hourlyRate;
    }
}

class EmployeeTest {
    public static void main(String[] args) {

        Employee[] employees = {
            new PermanentEmployee(101, "Vani", 20000),
            new ContractEmployee(102, "Anu", 10000, 100, 200)
        };

        for (Employee e : employees) {
            e.display();
        }
    }
}
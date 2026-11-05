class Person {
    private String name;
    private int age;

    static int count = 0;
    final static String COLLEGE = "CIT North Campus";

    Person(String name, int age) {
        this.name = name;
        this.age = age;
        count++;
    }

    String getName() {
        return name;
    }

    int getAge() {
        return age;
    }

    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    void displayDetails(String message) {
        System.out.println(message);
        displayDetails();
    }
}

class Student extends Person {
    private int usn;

    Student(String name, int age, int usn) {
        super(name, age);
        this.usn = usn;
    }

    @Override
    void displayDetails() {
        System.out.println("Student: " + getName());
        System.out.println("Age: " + getAge());
        System.out.println("USN: " + usn);
    }
}

class Faculty extends Person {
    private String subject;

    Faculty(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    @Override
    void displayDetails() {
        System.out.println("Faculty: " + getName());
        System.out.println("Subject: " + subject);
    }
}

class Administrator extends Person {
    private String role;

    Administrator(String name, int age, String role) {
        super(name, age);
        this.role = role;
    }

    @Override
    void displayDetails() {
        System.out.println("Administrator: " + getName());
        System.out.println("Role: " + role);
    }
}

public class CollegeManagement {

    static class Department {
        void display() {
            System.out.println("Department: Cyber Security");
        }
    }

    public static void main(String[] args) {

        Person[] people = {
            new Student("Vani", 20, 101),
            new Faculty("Ramesh", 40, "Java"),
            new Administrator("Anu", 35, "Manager")
        };

        System.out.println("College: " + Person.COLLEGE);
        System.out.println();

        for (Person p : people) {
            p.displayDetails();
            System.out.println();
        }

        Department d = new Department();
        d.display();

        System.out.println("Total People: " + Person.count);
    }
}
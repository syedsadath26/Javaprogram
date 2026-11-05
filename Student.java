class Student {
    String name;
    int age;
    int marks;

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Marks: " + marks);
        System.out.println();
    }

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Vani";
        s1.age = 20;
        s1.marks = 85;

        Student s2 = new Student();
        s2.name = "Anu";
        s2.age = 20;
        s2.marks = 90;

        s1.display();
        s2.display();
    }
}
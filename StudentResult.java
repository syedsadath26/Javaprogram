class StudentResult {
    private String usn;
    private String name;
    private int m1, m2, m3;

    static int studentCount = 0;
    final int MAX_MARKS = 100;

    StudentResult(String usn, String name, int m1, int m2, int m3) {
        this.usn = usn;
        this.name = name;

        if (validMarks(m1) && validMarks(m2) && validMarks(m3)) {
            this.m1 = m1;
            this.m2 = m2;
            this.m3 = m3;
        } else {
            System.out.println("Invalid marks!");
        }

        studentCount++;
    }

    boolean validMarks(int marks) {
        return marks >= 0 && marks <= MAX_MARKS;
    }

    String getName() {
        return name;
    }

    String getUSN() {
        return usn;
    }

    int calculateTotal() {
        return m1 + m2 + m3;
    }

    double calculateAverage() {
        return calculateTotal() / 3.0;
    }

    void display() {
        System.out.println("USN: " + usn);
        System.out.println("Name: " + name);
    }

    void display(boolean result) {
        display();
        System.out.println("Total: " + calculateTotal());
        System.out.println("Average: " + calculateAverage());
    }

    public static void main(String[] args) {
        StudentResult s1 = new StudentResult(
            "1CI26CS001", "Vani", 85, 90, 95
        );

        s1.display();
        System.out.println();
        s1.display(true);

        System.out.println("Total Students: " + studentCount);
    }
}
class Circle {
    double radius;

    void calculateCircumference() {
        double circumference = 2 * Math.PI * radius;
        System.out.println("Circumference of Circle = " + circumference);
    }

    public static void main(String[] args) {
        Circle c = new Circle();

        c.radius = 5;

        c.calculateCircumference();
    }
}
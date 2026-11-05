class Shape {
    void area() {
        System.out.println("Area of Shape");
    }
}

class Circle extends Shape {
    double radius = 5;

    @Override
    void area() {
        System.out.println("Circle Area: " + (Math.PI * radius * radius));
    }
}

class Rectangle extends Shape {
    int length = 10, breadth = 5;

    @Override
    void area() {
        System.out.println("Rectangle Area: " + (length * breadth));
    }
}

class Triangle extends Shape {
    int base = 10, height = 5;

    @Override
    void area() {
        System.out.println("Triangle Area: " + (0.5 * base * height));
    }
}

public class ShapeDemo {
    public static void main(String[] args) {

        Shape[] shapes = {
            new Circle(),
            new Rectangle(),
            new Triangle()
        };

        for (Shape s : shapes) {
            s.area();
        }
    }
}
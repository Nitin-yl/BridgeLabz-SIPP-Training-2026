package Main.java.oops_practice.oops_pratices.org.example.story_base_codebase;

abstract class Shape {

    public abstract double area();

    public abstract double perimeter();
}

class Circle extends Shape {

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }

    @Override
    public double perimeter() {
        return 2 * Math.PI * radius;
    }
}

class Rectangle extends Shape {

    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double area() {
        return length * width;
    }

    @Override
    public double perimeter() {
        return 2 * (length + width);
    }
}

class Triangle extends Shape {

    private double a;
    private double b;
    private double c;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double area() {
        double s = (a + b + c) / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    @Override
    public double perimeter() {
        return a + b + c;
    }
}

public class ShapeDemo {

    public static void main(String[] args) {

        Shape[] shapes = {
                new Circle(7),
                new Rectangle(10, 5),
                new Triangle(3, 4, 5)
        };

        System.out.println("Shape Report");
        System.out.println("-------------------------------------------");
        System.out.printf("%-12s %-12s %-12s%n", "Shape", "Area", "Perimeter");

        for (Shape shape : shapes) {

            String name = shape.getClass().getSimpleName();

            System.out.printf("%-12s %-12.2f %-12.2f%n",
                    name,
                    shape.area(),
                    shape.perimeter());
        }
    }
}
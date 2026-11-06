
class Shape {

    void calculateArea() {
        System.out.println("Calculating area of shape");
    }
}
class Circle extends Shape {

    double radius;

    Circle(double r) {
        radius = r;
    }

    @Override
    void calculateArea() {
        double area = 3.14 * radius * radius;
        System.out.println("Area of Circle: " + area);
    }
}

class Rectangle extends Shape {

    double length, breadth;

    Rectangle(double l, double b) {
        length = l;
        breadth = b;
    }

    @Override
    void calculateArea() {
        double area = length * breadth;
        System.out.println("Area of Rectangle: " + area);
    }
}

class Triangle extends Shape {

    double base, height;

    Triangle(double b, double h) {
        base = b;
        height = h;
    }

    @Override
    void calculateArea() {
        double area = 0.5 * base * height;
        System.out.println("Area of Triangle: " + area);
    }
}

public class Main {

    public static void main(String[] args) {

        Shape s;

        s = new Circle(5);
        s.calculateArea();

        s = new Rectangle(10, 5);
        s.calculateArea();

        s = new Triangle(8, 6);
        s.calculateArea();
    }
}

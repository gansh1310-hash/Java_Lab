
class Shape {
    void calculateArea() {
        System.out.println("Area not defined");
    }
}


class Square extends Shape {
    double side;

    Square(double side) {
        this.side = side;
    }

    void calculateArea() {
        double area = side * side;
        System.out.println("Area of Square: " + area);
    }
}


class Rectangle extends Shape {
    double length, width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    void calculateArea() {
        double area = length * width;
        System.out.println("Area of Rectangle: " + area);
    }
}


class Circle extends Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    void calculateArea() {
        double area = Math.PI * radius * radius;
        System.out.println("Area of Circle: " + area);
    }
}

public class Main {
    public static void main(String[] args) {
        Shape s1 = new Square(4);
        Shape s2 = new Rectangle(5, 3);
        Shape s3 = new Circle(2.5);

        s1.calculateArea();
        s2.calculateArea();
        s3.calculateArea();
    }
}
class Shape {
    void area() {
        System.out.println("Area of shape");
    }
}

class Square extends Shape {
    int side = 4;

    void area() {
        System.out.println("Area of Square = " + (side * side));
    }
}

class Rectangle extends Shape {
    int length = 5;
    int breadth = 3;

    void area() {
        System.out.println("Area of Rectangle = " + (length * breadth));
    }
}

class Circle extends Shape {
    int radius = 3;

    void area() {
        System.out.println("Area of Circle = " + (3.14 * radius * radius));
    }
}

public class Main {
    public static void main(String[] args) {

        Square s = new Square();
        s.area();

        Rectangle r = new Rectangle();
        r.area();

        Circle c = new Circle();
        c.area();
    }
}
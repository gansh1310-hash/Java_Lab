class Calculator {

    // Method with 2 integers
    int add(int a, int b) {
        return a + b;
    }

    // Method with 3 integers
    int add(int a, int b, int c) {
        return a + b + c;
    }

    // Method with double parameters
    double add(double a, double b) {
        return a + b;
    }
}

public class MethodOverloading {
    public static void main(String[] args) {
        Calculator obj = new Calculator();

        System.out.println("Sum of 2 integers: " + obj.add(10, 20));
        System.out.println("Sum of 3 integers: " + obj.add(10, 20, 30));
        System.out.println("Sum of 2 doubles: " + obj.add(5.5, 6.5));
    }
}
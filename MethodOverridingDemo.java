// Parent class
class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

// Child class
class Dog extends Animal {
    // Overriding the sound() method
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

// Main class
public class MethodOverridingDemo {
    public static void main(String[] args) {
        Animal obj = new Dog();  // Upcasting
        obj.sound();             // Calls Dog's method
    }
}
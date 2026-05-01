class OuterClass {

    int outerData = 10;


    class InnerClass {

        void display() {
            System.out.println("Inside Inner Class");
            System.out.println("Outer data = " + outerData);
        }
    }
}

public class Main {
    public static void main(String[] args) {

        
        OuterClass outer = new OuterClass();
        OuterClass.InnerClass inner = outer.new InnerClass();

        inner.display();
    }
}
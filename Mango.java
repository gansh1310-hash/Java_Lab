// Interface Mango
interface Mango {
    void showSeason();   // abstract method
}

// Class Winter implementing Mango
class Winter implements Mango {
    public void showSeason() {
        System.out.println("Mango is not available in Winter season.");
    }
}

// Class Summer implementing Mango
class Summer implements Mango {
    public void showSeason() {
        System.out.println("Mango is available in Summer season.");
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        Mango m1 = new Winter();   // reference of interface
        Mango m2 = new Summer();

        m1.showSeason();
        m2.showSeason();
    }
}
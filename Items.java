import java.util.Scanner;

class Item {
    int code;
    float price;


    void getData(int c, float p) {
        code = c;
        price = p;
    }

    
    void display() {
        System.out.println(code + "\t\t" + price);
    }
}

public class Items {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Item[] items = new Item[5];
        float totalPrice = 0;


        for (int i = 0; i < 5; i++) {
            items[i] = new Item();
        }

    
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter code for item " + (i + 1) + ":");
            int code = sc.nextInt();

            System.out.println("Enter price for item " + (i + 1) + ":");
            float price = sc.nextFloat();

            items[i].getData(code, price);
        }

        
        System.out.println("\nCode\t\tPrice");
        System.out.println("----------------------");

        for (int i = 0; i < 5; i++) {
            items[i].display();
            totalPrice += items[i].price;
        }
        System.out.println("----------------------");
        System.out.println("Total Price = " + totalPrice);

        sc.close();
    }
}
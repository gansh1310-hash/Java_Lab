import java.util.Scanner;

class Tender {
    int cost;
    String companyName;

    // Method to accept data
    void accept() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Company Name: ");
        companyName = sc.nextLine();
        System.out.print("Enter Cost: ");
        cost = sc.nextInt();
        sc.nextLine(); // clear buffer
    }

    // Method to display data
    void display() {
        System.out.println("Company: " + companyName + ", Cost: " + cost);
    }
}

public class Main1 {
    public static void main(String[] args) {
        Tender t[] = new Tender[5];

        // Create objects
        for (int i = 0; i < 5; i++) {
            t[i] = new Tender();
            System.out.println("\nEnter details for Tender " + (i + 1));
            t[i].accept();
        }

        // Find minimum cost
        int minCost = t[0].cost;
        int index = 0;

        for (int i = 1; i < 5; i++) {
            if (t[i].cost < minCost) {
                minCost = t[i].cost;
                index = i;
            }
        }

        System.out.println("\nCompany with Minimum Cost:");
        System.out.println("Company Name: " + t[index].companyName);
        System.out.println("Cost: " + t[index].cost);
    }
}
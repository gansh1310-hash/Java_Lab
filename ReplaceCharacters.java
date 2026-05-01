import java.util.Scanner;

public class ReplaceCharacters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input string
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        // Replace 'd' with 'f'
        String result = str.replace('d', 'f');

        // Output result
        System.out.println("Updated string: " + result);

        sc.close();
    }
}
import java.util.Scanner;

class divisiblebyfive {


    divisiblebyfive (int number) {
        if (number % 5 == 0) {
            System.out.println(number + " is divisible by 5");
        } else {
            System.out.println(number + " is not divisible by 5");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        sc.close();
        int num = sc.nextInt();
        divisiblebyfive obj = new divisiblebyfive(num);
    
    }
}
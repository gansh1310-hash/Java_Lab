class Factorial {

    
    int calculateFactorial(int n) {
        int fact = 1;

        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }

        return fact;
    }

    public static void main(String[] args) {

        int number = 5; 

        Factorial obj = new Factorial();

        int result = obj.calculateFactorial(number);

        System.out.println("Factorial of " + number + " is: " + result);
    }
}
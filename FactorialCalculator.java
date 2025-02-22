import java.util.Scanner;

public class FactorialCalculator {

    public static void main(String[] args) {
        int number = getNonNegativeInteger();

        long result = calculateFactorial(number);

        System.out.println("The factorial of " + number + " is: " + result);
    }

    public static int getNonNegativeInteger() {
        Scanner scanner = new Scanner(System.in);
        int n;

        System.out.print("Enter a non-negative integer: ");
        while (true) {
            if (scanner.hasNextInt()) {
                n = scanner.nextInt();
                if (n >= 0) {
                    break;
                } else {
                    System.out.print("Please enter a non-negative integer: ");
                }
            } else {
                System.out.print("Invalid input. Please enter a non-negative integer: ");
                scanner.next(); 
            }
        }

        return n;
    }

    public static long calculateFactorial(int n) {
        long factorial = 1;

        if (n == 0) {
            return factorial;
        }

        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }

        return factorial;
    }

}
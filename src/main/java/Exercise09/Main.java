package Exercise09;

import java.util.Scanner;

public class Main {
    public static int fibonacci(int n) {
        if (n == 0) {
            return 0;
        }

        if (n == 1) {
            return 1;
        }

        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input a number: ");

        while (!scanner.hasNextInt()) {
            System.out.println("Invalid input! Please try again.");
            scanner.next();
        }

        int number = scanner.nextInt();

        System.out.println("Fi(" + number +"): " + fibonacci(number));
    }
}
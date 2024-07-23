package Exercise29;

import java.util.Scanner;

public class Main {
    private static int getValidInt(Scanner scanner) {
        System.out.println("Enter a number: ");

        while (!scanner.hasNextInt()) {
            System.out.println("\nInvalid input. Please try again.");
            scanner.next();
        }

        return scanner.nextInt();
    }

    private static int forLoopFactorial(int n) {
        int result = 1;

        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    private static int whileLoopFactorial(int n) {
        int result = 1;
        int i = 1;

        while (i <= n) {
            result *= i;
            i++;
        }
        return result;
    }

    private static int doWhileLoopFactorial(int n) {
        int result = 1;
        int i = 1;

        do {
            result *= i;
            i++;
        } while (i <= n);
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = getValidInt(scanner);

        System.out.println("For loop factorial: " + forLoopFactorial(number));
        System.out.println("While loop factorial: " + whileLoopFactorial(number));
        System.out.println("Do while loop factorial: " + doWhileLoopFactorial(number));
    }
}

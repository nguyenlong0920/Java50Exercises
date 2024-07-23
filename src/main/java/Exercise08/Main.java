package Exercise08;

import java.util.Scanner;

import static java.lang.Math.sqrt;

public class Main {
    public static boolean checkPrime(int n) {
        for (int i = 2; i <= sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input a number: ");

        while (!scanner.hasNextInt()) {
            System.out.println("Invalid input. Please try again.");
            scanner.next();
        }

        int number = scanner.nextInt();

        if (number == 0 || number == 1) {
            System.out.println("This is not a prime number.");
        }

        for (int i = 2; i <= number; i++) {
            if (checkPrime(i)) {
                System.out.println(i);
            }
        }
    }
}

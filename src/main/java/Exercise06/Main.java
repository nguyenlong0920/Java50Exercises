package Exercise06;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input a positive integer: ");

        while (!scanner.hasNextInt()) {
            System.out.println("Invalid input. Try again.");
            scanner.next();
        }

        int a = scanner.nextInt();

        int sum = 0;

        for (int i = 0; i <= a; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }

        System.out.println("The sum is: " + sum);

        scanner.close();
    }
}

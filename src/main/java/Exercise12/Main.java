package Exercise12;

import java.util.Scanner;

public class Main {
    private static int getValidInt(Scanner scanner, String prompt) {
        System.out.println(prompt);
        while (!scanner.hasNextInt()) {
            System.out.println("Invalid input. Please try again.");
            scanner.next(); // Clear invalid input
        }
        return scanner.nextInt();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = getValidInt(scanner, "Input n: ");

        int max = Integer.MIN_VALUE;

        int[] array = new int[n];

        for (int i = 0; i < n; i++) {
            array[i] = getValidInt(scanner, "Input a number: ");

            if (array[i] > max) {
                max = array[i];
            }
        }

        System.out.println("The biggest number is: " + max);

        scanner.close();
    }
}

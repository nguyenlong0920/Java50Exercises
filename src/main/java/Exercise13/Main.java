package Exercise13;

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

        int n = getValidInt(scanner, "Enter n: ");

        int[] array = new int[n];

        int min = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            array[i] = getValidInt(scanner, "Enter a number: ");
            if (array[i] < min) {
                min = array[i];
            }
        }

        System.out.println("The smallest number is: " + min);

        scanner.close();
    }
}

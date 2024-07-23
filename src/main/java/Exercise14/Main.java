package Exercise14;

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

        int number = getValidInt(scanner, "Input n: ");

        int[] array = new int[number];

        for (int i = array.length - 1; i >= 0; i--) {
            array[i] = getValidInt(scanner, "Please enter a number: ");
        }

        System.out.println("Original array: ");
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }

        System.out.println();

        System.out.println("Inverted array: ");
        for (int i : array) {
            System.out.print(i + " ");
        }

        scanner.close();
    }
}

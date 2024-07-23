package Exercise11;

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

        int n = getValidInt(scanner,"Input n: ");

        double average = 0;

        int[] array = new int[n];

        for (int i = 0; i < n; i++) {
            array[i] = getValidInt(scanner,"Input a number: ");
            average += array[i];
        }

        System.out.println("The average is: " + average/n);

        scanner.close();
    }
}

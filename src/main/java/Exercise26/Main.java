package Exercise26;

import java.util.Scanner;

public class Main {
    private static int getValidInt(Scanner scanner, String prompt) {
        System.out.println(prompt);

        while (!scanner.hasNextInt()) {
            System.out.println("\nInvalid input. Please try again.");
            scanner.next();
        }

        return scanner.nextInt();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = getValidInt(scanner, "Enter A: ");
        int b = getValidInt(scanner, "Enter B: ");
        int c = getValidInt(scanner, "Enter C: ");

        double delta = b * b - 4 * a * c;

        if (delta < 0) {
            System.out.println("\nInvalid input. Please try again.");
        }

        if (delta == 0) {
            System.out.println("x1 = x2 = " + (-b / (2 * a)));
        }

        if (delta > 0) {
            System.out.println("x1 = " + (-b + Math.sqrt(delta)) / (2 * a));
            System.out.println("x2 = " + (-b - Math.sqrt(delta)) / (2 * a));
        }

        scanner.close();
    }
}

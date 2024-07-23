package Exercise04;

import java.util.Scanner;

public class Main {
    private static double getValidDouble(Scanner scanner, String prompt) {
        System.out.println(prompt);
        while (!scanner.hasNextDouble()) {
            System.out.println("Invalid input. Please try again.");
            scanner.next(); // Clear the invalid input
        }

        return scanner.nextDouble();
    }

    private static boolean isTriangle(double a, double b, double c) {
        return (a + b) > c && (a + c) > b && (b + c) > a;
    }

    private static boolean isRightTriangle(double a, double b, double c) {
        return a * a == (b * b + c * c) || b * b == (a * a + c * c) || c * c == (a * a + b * b);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double a = getValidDouble(scanner, "Input a:");
        double b = getValidDouble(scanner, "Input b:");
        double c = getValidDouble(scanner, "Input c:");

        System.out.println("This is" + (isTriangle(a, b, c) && isRightTriangle(a, b, c) ? " " : " not ") + "a right triangle.");

        scanner.close();
    }
}
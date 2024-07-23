package Exercise33;

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

    private static int lcm(int a, int b) {
        return Math.abs(a * b) / gcd(a, b);
    }

    private static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = getValidInt(scanner, "Enter A: ");
        int b = getValidInt(scanner, "Enter B: ");

        System.out.println("Least Common Multiplier: " + lcm(a, b));
        System.out.println("Greatest Common Divider: " + gcd(a, b));
    }
}

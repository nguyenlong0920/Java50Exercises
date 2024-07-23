package Exercise28;

import java.util.Scanner;

public class Main {
    private static double getValidDouble(Scanner scanner, String prompt) {
        System.out.println(prompt);

        while (!scanner.hasNextDouble()) {
            System.out.println("\nInvalid input. Please try again.");
            scanner.next();
        }

        return scanner.nextDouble();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double a = getValidDouble(scanner, "Enter A: ");
        double b = getValidDouble(scanner, "Enter B: ");
        System.out.println("Choose operator +, -, *, /");
        char operator = scanner.next().charAt(0);

        switch (operator) {
            case '+':
                System.out.println(a + b);
                break;
            case '-':
                System.out.println(a - b);
            case '*':
                System.out.println(a * b);
                break;
            case '/':
                if (b != 0) {
                    System.out.println(a / b);
                } else {
                    System.out.println("Error: Division by zero.");
                }
                break;
            default:
                System.out.println("Error: Invalid operator.");
                break;
        }

        scanner.close();
    }
}

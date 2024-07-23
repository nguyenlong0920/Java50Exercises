package Exercise27;

import java.util.Scanner;

public class Main {
    private static int getValidInt(Scanner scanner) {
        System.out.println("Please enter number of subject: ");

        while (!scanner.hasNextInt()) {
            System.out.println("\nInvalid input. Please try again.");
            scanner.next();
        }

        return scanner.nextInt();
    }

    private static double getValidDouble(Scanner scanner) {
        System.out.println("Please enter subject grade: ");

        while (!scanner.hasNextDouble()) {
            System.out.println("\nInvalid input. Please try again.");
            scanner.next();
        }

        return scanner.nextDouble();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = getValidInt(scanner);

        double average = 0;

        for (int i = 0; i < n; i++) {
            double subject = getValidDouble(scanner);
            average += subject;
        }

        average /= n;

        if (average >= 8.0) {
            System.out.println("Average grade: A");
        } else if (average >= 6.0) {
            System.out.println("Average grade: B");
        } else if (average >= 4.0) {
            System.out.println("Average grade: C");
        } else {
            System.out.println("Average grade: D");
        }

        scanner.close();
    }
}

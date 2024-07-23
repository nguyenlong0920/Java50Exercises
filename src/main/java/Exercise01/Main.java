package Exercise01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input an integer: ");
        while (!scanner.hasNextInt()) {
            System.out.println("Invalid input. Please try again.");
            scanner.next();
        }
        int number = scanner.nextInt();
        String result = (number >= 0) ? "This is a positive integer" : "This is a negative integer";
        System.out.println(result);

        scanner.close();
    }
}
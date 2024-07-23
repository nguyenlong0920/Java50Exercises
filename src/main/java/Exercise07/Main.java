package Exercise07;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input an integer: ");

        while (!scanner.hasNextInt()) {
            System.out.println("Invalid input. Try again.");
            scanner.next();
        }

        int number = scanner.nextInt();

        for (int i = 1; i <= 20; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
        }

        scanner.close();
    }
}

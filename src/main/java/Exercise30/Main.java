package Exercise30;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    private static int getValidInt(Scanner scanner) {
        System.out.println("Enter a number: ");

        while (!scanner.hasNextInt()) {
            System.out.println("\nInvalid input. Please try again.");
            scanner.next();
        }

        return scanner.nextInt();
    }

    private static int[] forLoopFibonacci(int n) {
        int[] result = new int[n];
        result[0] = 0;
        result[1] = 1;

        for (int i = 2; i < n; i++) {
            result[i] = result[i - 1] + result[i - 2];
        }

        return result;
    }

    private static int[] whileLoopFibonacci(int n) {
        int[] result = new int[n];
        result[0] = 0;
        result[1] = 1;
        int i = 2;

        while (i < n) {
            result[i] = result[i - 1] + result[i - 2];
            i++;
        }

        return result;
    }

    private static int[] doWhileLoopFibonacci(int n) {
        int[] result = new int[n];
        result[0] = 0;
        result[1] = 1;
        int i = 2;

        do {
            result[i] = result[i - 1] + result[i - 2];
            i++;
        } while (i < n);

        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = getValidInt(scanner);

        System.out.println("For loop fibonacci: ");
        System.out.println(Arrays.toString(forLoopFibonacci(number)));
        System.out.println("While loop fibonacci: ");
        System.out.println(Arrays.toString(whileLoopFibonacci(number)));
        System.out.println("Do while loop fibonacci: ");
        System.out.println(Arrays.toString(doWhileLoopFibonacci(number)));
    }
}

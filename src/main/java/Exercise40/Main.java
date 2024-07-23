package Exercise40;

import java.util.Scanner;

public class Main {
    private static int factorial (int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter n: ");
        int n = scanner.nextInt();

        int sum = 0;
        for (int i = 1; i < n; i++) {
            sum += factorial(i);
        }

        System.out.println("Sum of factorials is: " + sum);
    }
}

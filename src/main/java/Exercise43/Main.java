package Exercise43;

import java.util.Scanner;

public class Main {
    private static int factorial(int n) {
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

        System.out.println("Enter x: ");
        int x = scanner.nextInt();

        System.out.println("Enter k: ");
        int k = scanner.nextInt();

        double sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += factorial(i) / (Math.pow(x, i) + Math.pow(-1, i + 1) * Math.pow(k, i));
        }

        System.out.println("Sum: " + sum);
    }
}

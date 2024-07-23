package Exercise42;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter n: ");
        int n = scanner.nextInt();

        double sum = 0.0;

        for (int i = 1; i < n; i++) {
            sum += (double) i / (i + 1);
        }

        System.out.println("Sum: " + sum);
    }
}

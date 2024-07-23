package Exercise41;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter n:");
        int n = scanner.nextInt();

        int sum = 0;

        for (int i = 0; i < n; i++) {
            if ((n % 2 == 0 && i % 2 == 0) || (n % 2 != 0 && i % 2 != 0)) {
                sum += i;
            }
        }

        System.out.println((n % 2 == 0 ? "Even sum: " : "Odd sum: ") + sum);
    }
}

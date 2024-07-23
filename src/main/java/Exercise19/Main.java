package Exercise19;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input string: ");

        String s = scanner.nextLine();

        System.out.println("Input character: ");
        char c = scanner.next().charAt(0);

        int total = 0;

        for (char ch : s.toCharArray()) {
            if (ch == c) {
                total += 1;
            }
        }

        System.out.println("Total of " + total + " characters: " + c);

        scanner.close();
    }
}
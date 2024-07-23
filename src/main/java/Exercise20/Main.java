package Exercise20;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input string:");
        String s = scanner.nextLine();
        System.out.println((s.matches("^[A-Z]\\S{0,18}[0-9]$") ? "Valid" : "Invalid") + " input!");

        scanner.close();
    }
}
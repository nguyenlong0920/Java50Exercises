package Exercise18;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input string: ");

        String s = scanner.nextLine();

        System.out.println(s.matches(".*\\d.*") ? "YES" : "NO");

        scanner.close();
    }
}
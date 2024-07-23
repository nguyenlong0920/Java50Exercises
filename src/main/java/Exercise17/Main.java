package Exercise17;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input string: ");

        String s = scanner.nextLine();

        System.out.println("Input character: ");

        char c = scanner.next().charAt(0);

        System.out.println(!s.contains(Character.toString(c)) ? "Not exist" : s.indexOf(c));

        scanner.close();
    }
}
package Exercise32;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a character: ");
        char character = scanner.next().charAt(0);

        System.out.println("ASCII index: " + (int) character);
    }
}

package Exercise31;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number: ");
        String s = scanner.nextLine();

        System.out.println("String to integer using parseInt: ");
        System.out.println(Integer.parseInt(s));

        System.out.println("String to integer using valueOf: ");
        System.out.println(Integer.valueOf(s));
    }
}

package Exercise50;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first string: ");
        String str1 = scanner.nextLine();

        System.out.println("Enter the second string: ");
        String str2 = scanner.nextLine();

        if (str1.length() > str2.length()) {
            str1 = str1.substring(str1.length() - str2.length());
        } else if (str2.length() > str1.length()) {
            str2 = str2.substring(str2.length() - str1.length());
        }

        String result = str1 + str2;
        System.out.println("Concatenated result: " + result);
    }
}

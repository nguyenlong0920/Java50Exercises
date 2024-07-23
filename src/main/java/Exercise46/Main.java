package Exercise46;

import java.util.Scanner;

public class Main {
    public static void checkReverseStrings(String str1, String str2) {
        if (str1.length() != str2.length()) {
            System.out.println("KO");
            return;
        }

        StringBuilder reverseStr2 = new StringBuilder(str2).reverse();

        if (str1.contentEquals(reverseStr2)) {
            System.out.println("OK");
        } else {
            System.out.println("KO");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input first string: ");
        String str1 = scanner.nextLine();
        System.out.println("Input second string: ");
        String str2 = scanner.nextLine();

        checkReverseStrings(str1, str2);

        scanner.close();
    }
}

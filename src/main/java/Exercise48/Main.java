package Exercise48;

import java.util.Scanner;

public class Main {
    public static String reverseWords(String input) {
        input = input.trim();

        if (input.isEmpty()) {
            return "";
        }

        StringBuilder reversed = new StringBuilder();

        String[] words = input.split(" ");

        for (int i = words.length - 1; i >= 0; i--) {
            reversed.append(words[i]);
            if (i != 0) {
                reversed.append(" ");
            }
        }

        return reversed.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String input = scanner.nextLine();

        System.out.println(reverseWords(input));

        scanner.close();
    }
}

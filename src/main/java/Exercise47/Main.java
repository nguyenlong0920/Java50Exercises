package Exercise47;

import java.util.Scanner;

public class Main {
    public static void countVowelsAndConsonants(String input) {
        int vowelsCount = 0;
        int consonantsCount = 0;

        for (char c : input.toLowerCase().toCharArray()) {
            switch (c) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    vowelsCount++;
                    break;
                default:
                    if (Character.isLetter(c)) {
                        consonantsCount++;
                    }
                    break;
            }
        }

        System.out.println("Vowels count: " + vowelsCount);
        System.out.println("Consonants count: " + consonantsCount);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter string: ");
        String input = scanner.nextLine();
        countVowelsAndConsonants(input);

        scanner.close();
    }
}

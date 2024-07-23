package Exercise02;

import java.util.Scanner;

public class Main {
    private static final String[] units = {
            "", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten",
            "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"
    };

    private static final String[] tens = {
            "", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"
    };

    public static String numberToWords(int number) {
        if (number == 0 || number == 1000000) {
            return number == 0 ? "zero" : "one million";
        }

        String words = "";

        if (number < 20) {
            words = units[number];
        } else if (number < 100) {
            words = tens[number / 10] + " " + units[number % 10];
        } else if (number < 1000) {
            words = units[number / 100] + " hundred and " + numberToWords(number % 100);
        } else if (number < 10000) {
            words = units[number / 1000] + " thousand " + numberToWords(number % 1000);
        } else if (number < 1000000) {
            words = numberToWords(number / 1000) + " thousand " + numberToWords(number % 1000);
        }

        return words;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input an integer: ");
        while (!scanner.hasNextInt()) {
            System.out.println("Invalid input. Please try again.");
            scanner.next();
        }
        int number = scanner.nextInt();

        if (number < 0 || number > 1000000) {
            System.out.println("Number out of range");
        } else {
            System.out.println(numberToWords(number));
        }

        scanner.close();
    }
}
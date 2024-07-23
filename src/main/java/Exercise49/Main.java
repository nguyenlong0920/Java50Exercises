package Exercise49;

import java.util.Scanner;

public class Main {
    public static char findSecondMostFrequentCharacter(String input) {
        int[] count = new int[256];
        char[] chars = input.toLowerCase().toCharArray();

        for (char c : chars) {
            count[c]++;
        }

        int firstMax = 0, secondMax = 0;
        for (int i = 0; i < 256; i++) {
            if (count[i] > count[firstMax]) {
                secondMax = firstMax;
                firstMax = i;
            } else if (count[i] > count[secondMax] && count[i] != count[firstMax]) {
                secondMax = i;
            }
        }

        if (count[secondMax] == 0) {
            return 0;
        }

        return (char) secondMax;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a string: ");
        String input = scanner.nextLine();

        char result = findSecondMostFrequentCharacter(input);
        if (result != 0) {
            System.out.println("The second most frequent character is: " + result);
        } else {
            System.out.println("No second most frequent character found.");
        }

        scanner.close();
    }
}

package Exercise45;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void findDuplicateCharacters(String input) {
        Map<Character, Integer> charCountMap = new HashMap<>();
        char[] chars = input.toLowerCase().toCharArray();

        for (char c : chars) {
            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
        }

        boolean hasDuplicates = false;
        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey());
                hasDuplicates = true;
            }
        }

        if (!hasDuplicates) {
            System.out.println("NO");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input a string: ");
        String input = scanner.nextLine();

        findDuplicateCharacters(input);

        scanner.close();
    }
}

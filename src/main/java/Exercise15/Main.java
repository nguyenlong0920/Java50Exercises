package Exercise15;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] code = new String[5];

        for (int i = 0; i < 5; i++) {
            System.out.println("Input code: ");

            code[i] = scanner.nextLine();

            if (code[i].matches("00[2-5]L[0-9]{4}")) {
                System.out.println(code[i] + " is a valid code");
            } else {
                System.out.println(code[i] + " is not a valid code");
                break;
            }
        }

        scanner.close();
    }
}
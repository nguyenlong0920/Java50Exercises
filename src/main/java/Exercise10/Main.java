package Exercise10;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 1; i <= 5; i++) {
            System.out.println("Input Student ID:");
            String studentID = scanner.nextLine();
            System.out.println(studentID + " is" + (studentID.matches("B170[1-9]{4}") ? " " : " not ") + "a valid input!");
        }

        scanner.close();
    }
}
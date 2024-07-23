package Exercise05;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input Student ID: ");
        String studentID = scanner.nextLine();

        System.out.println((studentID.matches("B[1-9]{7}") ? "Valid" : "Invalid") + " input!");

        scanner.close();
    }
}

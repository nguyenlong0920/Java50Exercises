package Exercise23;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
    private static int getValidInt(Scanner scanner, String prompt) {
        System.out.println(prompt);

        while (!scanner.hasNextInt()) {
            System.out.println("\nInvalid input. Please try again.");
            scanner.next();
        }

        return scanner.nextInt();
    }

    private static String getValidPhoneNumber(Scanner scanner) {
        System.out.println("Enter phone number: ");

        String phone;
        while (true) {
            phone = scanner.next();
            if (phone.matches("0\\d{9}")) {
                break;
            } else {
                System.out.println("\nInvalid phone number. Please try again.");
            }
        }

        return phone;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<Integer, Student> students = new TreeMap<>();

        int n = getValidInt(scanner, "Enter number of students: ");

        for (int i = 0; i < n; i++) {
            int id = getValidInt(scanner, "Enter student id: ");
            scanner.nextLine();
            System.out.println("Enter student name: ");
            String name = scanner.nextLine();
            System.out.println("Enter student address: ");
            String address = scanner.nextLine();
            String phone = getValidPhoneNumber(scanner);

            Student student = new Student(id, name, address, phone);

            students.put(id, student);
        }

        System.out.printf("\n%-5s%-20s%-25s%-10s\n", "ID", "Name", "Address", "Phone");
        students.forEach((id, student) -> System.out.println(student));

        scanner.close();
    }
}

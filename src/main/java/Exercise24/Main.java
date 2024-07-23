package Exercise24;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    private static int getValidInt(Scanner scanner, String prompt) {
        System.out.println(prompt);

        while (!scanner.hasNextInt()) {
            System.out.println("\nInvalid input. Please try again.");
            scanner.next();
        }

        return scanner.nextInt();
    }

    private static String getValidDate(Scanner scanner, String prompt) {
        System.out.println(prompt);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate date;
        while (true) {
            String dateString = scanner.next();
            try {
                date = LocalDate.parse(dateString, formatter);
                break;
            } catch (DateTimeParseException e) {
                System.out.println("\nInvalid date. Please try again.");
            }
        }

        return date.format(formatter);
    }

    private static boolean isDateAfter(String date, String referenceDate) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate inputDate = LocalDate.parse(date, formatter);
        LocalDate refDate = LocalDate.parse(referenceDate, formatter);
        return inputDate.isAfter(refDate);
    }

    private static String getValidFutureDate(Scanner scanner, String prompt, String referenceDate) {
        String date;
        while (true) {
            date = getValidDate(scanner, prompt);
            if (isDateAfter(date, referenceDate)) {
                break;
            } else {
                System.out.println("The date cannot be before the reference date.");
            }
        }
        return date;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = getValidInt(scanner, "Enter number of food: ");

        Map<Integer, Food> foods = new HashMap<>();

        for (int i = 0; i < number; i++) {
            int id = getValidInt(scanner, "Enter id of food: ");
            System.out.println("Enter food name: ");
            String name = scanner.next();
            String manufactureDate = getValidDate(scanner, "Enter manufacture date: ");
            String expirationDate = getValidFutureDate(scanner, "Enter expiration date: ", manufactureDate);

            Food food = new Food(id, name, manufactureDate, expirationDate);
            foods.put(id, food);
        }

        for (Food food : foods.values()) {
            System.out.println(food);
        }

        int idCheck;
        while (true) {
            idCheck = getValidInt(scanner, "Food ID expiration check: ");
            scanner.nextLine();
            if (foods.containsKey(idCheck)) {
                break;
            } else {
                System.out.println("Food ID not found! Please enter a valid ID.");
            }
        }

        Food foodToCheck = foods.get(idCheck);
        String dateCheck = getValidFutureDate(scanner, "Food expiration date check: ", foodToCheck.getManufactureDate());

        if (foodToCheck.checkExpirationDate(dateCheck)) {
            System.out.println("The food has expired!");
        } else {
            System.out.println("The food has not expired!");
        }

        scanner.close();
    }
}

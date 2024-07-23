package Exercise34;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static ArrayList<Hotel> hotels = new ArrayList<>();

    private static int getValidInt(Scanner scanner, String prompt) {
        System.out.println(prompt);

        while (!scanner.hasNextInt()) {
            System.out.println("\nInvalid input. Please try again.");
            scanner.next();
        }

        return scanner.nextInt();
    }

    private static String getValidID(Scanner scanner, String prompt) {
        System.out.println(prompt);

        String id;
        while (true) {
            id = scanner.next();
            if (id.matches("0\\d{11}")) {
                break;
            } else {
                System.out.println("\nInvalid ID. Please try again.");
            }
        }

        return id;
    }
    
    private static boolean findID(String id) {
        boolean found = false;
        for (Hotel hotel : hotels) {
            if (hotel.getPersonId().equals(id)) {
                found = true;
            }
        }
        return found;
    }

    private static void deleteID(String id) {
        hotels.removeIf(hotel -> hotel.getPersonId().equals(id));
    }

    private static int priceID(String id) {
        int price = 0;
        for (Hotel hotel : hotels) {
            if (hotel.getPersonId().equals(id)) {
                price = hotel.price();
            }
        }
        return price;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = getValidInt(scanner, "Number of customer: ");

        for (int i = 0; i < n; i++) {
            int day = getValidInt(scanner, "Number of day: ");
            System.out.println("Enter room type: ");
            char type = scanner.next().charAt(0);

            System.out.println("Enter name: ");
            String name = scanner.next();
            int age = getValidInt(scanner, "Age: ");
            String id = getValidID(scanner, "Enter ID: ");

            Person person = new Person(name,age, id);
            Hotel hotel = new Hotel(day, type, person);

            hotels.add(hotel);
        }

        for (Hotel hotel : hotels) {
            System.out.println(hotel);
        }

        String deleteID;
        do {
            deleteID = getValidID(scanner, "Enter ID to delete: ");
        } while (!findID(deleteID));
        deleteID(deleteID);

        for (Hotel hotel : hotels) {
            System.out.println(hotel);
        }

        String priceID;
        do {
            priceID = getValidID(scanner, "Enter ID to price: ");
        } while (!findID(priceID));
        System.out.println("Price: " + priceID(priceID));

        scanner.close();
    }
}

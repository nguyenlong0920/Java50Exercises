package Exercise22;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    private static int getValidInt(Scanner scanner, String prompt) {
        System.out.println(prompt);

        while (!scanner.hasNextInt()) {
            System.out.println("\nInvalid input. Please try again.");
            scanner.next();
        }

        return scanner.nextInt();
    }

    private static double getValidDouble(Scanner scanner) {
        System.out.println("Enter disc price: ");

        while (!scanner.hasNextDouble()) {
            System.out.println("\nInvalid input. Please try again.");
            scanner.next();
        }

        return scanner.nextDouble();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<CD> discs = new ArrayList<>();
        Set<Integer> discIds = new HashSet<>();

        int n = getValidInt(scanner, "Enter number of discs: ");

        int index = 0;

        while (index < n) {
            int id;
            do {
                id = getValidInt(scanner, "Enter disc id: ");
                if (discIds.contains(id)) {
                    System.out.println("ID already exists. Please enter a different ID.");
                }
            } while (discIds.contains(id));

            System.out.println("Enter disc name: ");
            scanner.nextLine();
            String name = scanner.nextLine();
            System.out.println("Enter disc singer: ");
            String singer = scanner.nextLine();
            int number = getValidInt(scanner, "Enter number of songs: ");
            double price = getValidDouble(scanner);
            scanner.nextLine();

            CD disc = new CD(id, name, singer, number, price);
            discs.add(disc);
            discIds.add(id);
            index++;

            System.out.println("Do you want to add more discs: Y or N");
            String option = scanner.nextLine();
            if (option.equalsIgnoreCase("N")) {
                break;
            }
        }

        int numberOfDiscs = 0;
        double total = 0;

        for (CD disc : discs) {
            numberOfDiscs++;
            total += disc.getPrice();
        }

        System.out.println("Number of discs: " + numberOfDiscs);
        System.out.println("Total price: " + total);

        scanner.close();
    }
}

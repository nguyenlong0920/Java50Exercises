package Exercise35;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static ArrayList<Customer> customers = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Number of customer: ");
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Customer ID: ");
            int id = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Customer name: ");
            String name = scanner.nextLine();
            System.out.println("Customer address: ");
            String address = scanner.nextLine();
            System.out.println("Before number: ");
            int before = scanner.nextInt();
            System.out.println("After number: ");
            int after = scanner.nextInt();

            Bill bill = new Bill(before, after);
            Customer customer = new Customer(id, name, address, bill);
            customers.add(customer);
        }

        for (Customer customer : customers) {
            System.out.println(customer);
        }

        scanner.close();
    }
}

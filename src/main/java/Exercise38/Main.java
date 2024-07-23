package Exercise38;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input a Float: ");
        float a = scanner.nextFloat();
        System.out.println("Input a Double: ");
        double b = scanner.nextDouble();

        System.out.println("Add: " + a + " + " + b + " = " + (a + b));
        System.out.println("Subtract: " + a + " - " + b + " = " + (a - b));
        System.out.println("Multiply: " + a + " * " + b + " = " + (a * b));
        System.out.println("Divide: " + a + " / " + b + " = " + (a / b));
        System.out.println("Remainder: " + a + " % " + b + " = " + (a % b));
    }
}

package Exercise36;

import java.util.Scanner;

public class Main {
    private static ComplexNumber add (ComplexNumber x, ComplexNumber y) {
        double a = x.getReal() + y.getReal();
        double b = x.getImaginary() + y.getImaginary();

        return new ComplexNumber(a, b);
    }

    private static ComplexNumber multiply (ComplexNumber x, ComplexNumber y) {
        double a = x.getReal();
        double b = x.getImaginary();
        double c = y.getReal();
        double d = y.getImaginary();

        return new ComplexNumber(a * c - b * d, a * d + b * c);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input first complex number: ");
        ComplexNumber num1 = new ComplexNumber(scanner.nextDouble(), scanner.nextDouble());

        System.out.println("Input second complex number: ");
        ComplexNumber num2 = new ComplexNumber(scanner.nextDouble(), scanner.nextDouble());

        System.out.println("Complex number 1: " + num1);
        System.out.println("Complex number 2: " + num2);

        System.out.println("Addition: " + add (num1, num2));
        System.out.println("Multiplication: " + multiply (num1, num2));
    }
}

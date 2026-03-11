package calculadora.com;

import calculadora.com.Calculator;

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);


        System.out.println("║     CALCULADORA TDD      ║");


        System.out.print("Introduce el primer número:  ");
        double a = scanner.nextDouble();

        System.out.print("Introduce el segundo número: ");
        double b = scanner.nextDouble();

        System.out.println("\n──── Resultados ────");
        System.out.printf("%-15s %.2f + %.2f = %.2f%n", "Suma:",        a, b, calculator.add(a, b));
        System.out.printf("%-15s %.2f - %.2f = %.2f%n", "Resta:",       a, b, calculator.subtract(a, b));
        System.out.printf("%-15s %.2f * %.2f = %.2f%n", "Multiplicar:", a, b, calculator.multiply(a, b));

        if (b != 0) {
            System.out.printf("%-15s %.2f / %.2f = %.2f%n", "Dividir:", a, b, calculator.divide(a, b));
        } else {
            System.out.println("Dividir:        No se puede dividir entre cero.");
        }

        System.out.println("────────────────────");
        scanner.close();
    }
}
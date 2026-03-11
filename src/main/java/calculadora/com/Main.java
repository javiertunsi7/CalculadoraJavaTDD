package calculadora.com;

import calculadora.com.Calculator;

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);


        System.out.println("║     CALCULADORA TDD      ║");


        System.out.print("Introduce el primer número:  ");
        double opertation1 = scanner.nextDouble();

        System.out.print("Introduce el segundo número: ");
        double operation2 = scanner.nextDouble();

        System.out.println("\n──── Resultados ────");
        System.out.printf("%-15s %.2f + %.2f = %.2f%n", "Suma:",        opertation1, operation2, calculator.add(opertation1,operation2));
        System.out.printf("%-15s %.2f - %.2f = %.2f%n", "Resta:",       opertation1, operation2, calculator.subtract(opertation1, operation2));
        System.out.printf("%-15s %.2f * %.2f = %.2f%n", "Multiplicar:", opertation1, operation2, calculator.multiply(opertation1, operation2));

        if (operation2 != 0) {
            System.out.printf("%-15s %.2f / %.2f = %.2f%n", "Dividir:", opertation1, operation2, calculator.divide(opertation1, operation2));
        } else {
            System.out.println("Dividir:        No se puede dividir entre cero.");
        }

        System.out.println("────────────────────");
        scanner.close();
    }
}
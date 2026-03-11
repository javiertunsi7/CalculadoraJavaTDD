package com.calculadora;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * TDD test suite for Calculator class.
 * Tests are written against ICalculator interface (DIP).
 * Grouped by operation using @Nested for readability.
 */
@DisplayName("Calculator Tests")
class CalculatorTest {

    private ICalculator calculator;

    @BeforeEach
    void setUp() {
        calculator = new Calculator();
    }

    // ─────────────────────────────────────────
    // ADD
    // ─────────────────────────────────────────
    @Nested
    @DisplayName("add()")
    class AddTests {

        @Test
        @DisplayName("Two positive numbers return correct sum")
        void add_twoPositiveNumbers_returnsCorrectSum() {
            double result = calculator.add(3, 5);
            assertEquals(8, result);
        }

        @Test
        @DisplayName("Positive and negative number return correct sum")
        void add_positiveAndNegativeNumber_returnsCorrectSum() {
            double result = calculator.add(10, -4);
            assertEquals(6, result);
        }

        @Test
        @DisplayName("Two negative numbers return correct sum")
        void add_twoNegativeNumbers_returnsCorrectSum() {
            double result = calculator.add(-3, -7);
            assertEquals(-10, result);
        }

        @Test
        @DisplayName("Adding zero returns the same number")
        void add_withZero_returnsSameNumber() {
            double result = calculator.add(5, 0);
            assertEquals(5, result);
        }
    }

    // ─────────────────────────────────────────
    // SUBTRACT
    // ─────────────────────────────────────────
    @Nested
    @DisplayName("subtract()")
    class SubtractTests {

        @Test
        @DisplayName("Two positive numbers return correct difference")
        void subtract_twoPositiveNumbers_returnsCorrectDifference() {
            double result = calculator.subtract(10, 4);
            assertEquals(6, result);
        }

        @Test
        @DisplayName("Subtracting larger from smaller returns negative result")
        void subtract_smallerFromLarger_returnsNegativeResult() {
            double result = calculator.subtract(3, 8);
            assertEquals(-5, result);
        }

        @Test
        @DisplayName("Two negative numbers return correct difference")
        void subtract_twoNegativeNumbers_returnsCorrectDifference() {
            double result = calculator.subtract(-5, -3);
            assertEquals(-2, result);
        }

        @Test
        @DisplayName("Subtracting zero returns the same number")
        void subtract_withZero_returnsSameNumber() {
            double result = calculator.subtract(7, 0);
            assertEquals(7, result);
        }
    }

    // ─────────────────────────────────────────
    // MULTIPLY
    // ─────────────────────────────────────────
    @Nested
    @DisplayName("multiply()")
    class MultiplyTests {

        @Test
        @DisplayName("Two positive numbers return correct product")
        void multiply_twoPositiveNumbers_returnsCorrectProduct() {
            double result = calculator.multiply(4, 5);
            assertEquals(20, result);
        }

        @Test
        @DisplayName("Positive and negative number return negative product")
        void multiply_positiveAndNegativeNumber_returnsNegativeProduct() {
            double result = calculator.multiply(6, -3);
            assertEquals(-18, result);
        }

        @Test
        @DisplayName("Multiplying by zero returns zero")
        void multiply_byZero_returnsZero() {
            double result = calculator.multiply(99, 0);
            assertEquals(0, result);
        }

        @Test
        @DisplayName("Two negative numbers return positive product")
        void multiply_twoNegativeNumbers_returnsPositiveProduct() {
            double result = calculator.multiply(-4, -5);
            assertEquals(20, result);
        }
    }

    // ─────────────────────────────────────────
    // DIVIDE
    // ─────────────────────────────────────────
    @Nested
    @DisplayName("divide()")
    class DivideTests {

        @Test
        @DisplayName("Two positive numbers return correct quotient")
        void divide_twoPositiveNumbers_returnsCorrectQuotient() {
            double result = calculator.divide(10, 2);
            assertEquals(5, result);
        }

        @Test
        @DisplayName("Division results in decimal value")
        void divide_resultsInDecimal_returnsCorrectQuotient() {
            double result = calculator.divide(7, 2);
            assertEquals(3.5, result);
        }

        @Test
        @DisplayName("Negative dividend returns negative quotient")
        void divide_negativeDividend_returnsNegativeQuotient() {
            double result = calculator.divide(-9, 3);
            assertEquals(-3, result);
        }

        @Test
        @DisplayName("Division by zero throws ArithmeticException")
        void divide_byZero_throwsArithmeticException() {
            ArithmeticException exception = assertThrows(
                ArithmeticException.class,
                () -> calculator.divide(10, 0)
            );
            assertEquals("Division by zero is not allowed", exception.getMessage());
        }
    }
}

package test.calculadora;

import calculadora.com.Calculator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Calculator Tests")
class CalculatorTest {

    private Calculator calculator;

    @BeforeEach
    void setUp() {
        calculator = new Calculator();
    }

    // ─── ADD ────────────────────────────────────────────────

    @Test
    @DisplayName("Add: two positive numbers")
    void add_twoPositiveNumbers_returnsCorrectSum() {
        double result = calculator.add(3, 5);
        assertEquals(8, result);
    }

    @Test
    @DisplayName("Add: positive and negative number")
    void add_positiveAndNegativeNumber_returnsCorrectSum() {
        double result = calculator.add(10, -4);
        assertEquals(6, result);
    }

    @Test
    @DisplayName("Add: two negative numbers")
    void add_twoNegativeNumbers_returnsCorrectSum() {
        double result = calculator.add(-3, -7);
        assertEquals(-10, result);
    }

    @Test
    @DisplayName("Add: with zero")
    void add_withZero_returnsSameNumber() {
        double result = calculator.add(5, 0);
        assertEquals(5, result);
    }
}
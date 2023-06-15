package com.example.Lab1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest(classes = Lab1Application.class)
public class CalculatorTests {

    Calculator calculator;

    @BeforeEach
    void setUp() {
        calculator = new Calculator();
    }

    @Test
    @DisplayName("Testing add method")
    void testAdd() {
        assertEquals(4, calculator.add(2,2));
    }

    @Test
    @DisplayName("Testing subtract method")
    void testSubtract() {
        assertEquals(6, calculator.subtract(8,2));
    }

    @Test
    @DisplayName("Testing multiply method")
    void testMultiply() {
        assertEquals(16, calculator.multiply(8,2));
    }

    @Test
    @DisplayName("Testing when multiplying with zero the test should return zero")
    void testMultiplyWithZeroShouldReturnZero() {
        assertEquals(0, calculator.multiply(0, 8));
        assertEquals(0, calculator.multiply(6, 0));
    }

    @Test
    @DisplayName("Testing divide method")
    void testDivide() {
        assertEquals(4, calculator.divide(8,2));
    }

    @Test
    @DisplayName("Testing squareRootOf method")
    void testSquareRootOf() {
        assertEquals(4, (calculator.squareRootOf(16)));
    }

    @Test
    @DisplayName("Testing getArea method")
    void testGetArea() {
        assertEquals(50.27, (calculator.getArea(4)));
    }

    @Test
    @DisplayName("Testing getCircumference method")
    void testGetCircumference() {
        assertEquals(31.42, (calculator.getCircumference(5)));
    }

}

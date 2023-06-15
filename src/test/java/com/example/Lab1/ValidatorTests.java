package com.example.Lab1;

import org.junit.jupiter.api.*;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = Lab1Application.class)
public class ValidatorTests {

    static Validator validator;

    @BeforeEach
    void setUp() {
        validator = new Validator();
    }

    @Test
    @DisplayName("Test for a valid phone number")
    void phoneNumberValid() {
        boolean result = validator.isPhoneNumberValid("0707858585");
        Assertions.assertTrue(result);
    }

    @Test
    @DisplayName("Test should not validate phone number that does not start with zero")
    void phoneNumberWithoutZeroPrefix() {
        boolean result = validator.isPhoneNumberValid("7075858585");
        Assertions.assertFalse(result);
    }

    @Test
    @DisplayName("Test should not validate phone number with less than six numbers")
    void phoneNumberShouldHaveMoreThanSixNumbers() {
        boolean result = validator.isPhoneNumberValid("07075");
        Assertions.assertFalse(result);
    }

    @Test
    @DisplayName("Test should not validate phone number with more than ten numbers")
    void phoneNumberShouldHaveLessThanTenNumbers() {
        boolean result = validator.isPhoneNumberValid("070758585893");
        Assertions.assertFalse(result);
    }

    @Test
    @DisplayName("Test should validate phone number six to ten numbers")
    void phoneNumberShouldHaveSixToTenNumbers() {
        boolean result = validator.isPhoneNumberValid("07078533");
        Assertions.assertTrue(result);
    }

    @Test
    @DisplayName("Phone number should not contain letters")
    void phoneNumberShouldNotContainLetters() {
        boolean result = validator.isPhoneNumberValid("07075858m89");
        Assertions.assertFalse(result);
    }

    @Test
    @DisplayName("Phone number should not contain special characters")
    void phoneNumberShouldNotContainSpecialCharacters() {
        boolean result = validator.isPhoneNumberValid("07075858!89");
        Assertions.assertFalse(result);
    }

    @Test
    @DisplayName("You should not be able to enter an emty string")
    void phoneNumberShouldNotBeEmty() {
        boolean result = validator.isPhoneNumberValid("");
        Assertions.assertFalse(result);
    }
}

// - Metoden för validering av telefonnummer verkar bara ha två tester (som dessutom testar samma telefonnummer).
//   Kravet är minst 8 tester av den metoden och all funktionalitet/alla krav enligt metoden behöver testas.

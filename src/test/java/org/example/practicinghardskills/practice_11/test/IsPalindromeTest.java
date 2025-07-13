package org.example.practicinghardskills.practice_11.test;

import org.example.practicinghardskills.practice_11.StringProcessor;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

public class IsPalindromeTest extends StringProcessorTest{


    /**
     * Тесты для проверки, является ли палиндромом:
     * положительные кейсы:
     *     - чётное кол-во: "abba" -> true
     *     - нечётное кол-во: "hah" -> true
     * негативные кейсы:
     *     - "john" -> false
     * corner cases:
     *     - "" -> true
     *     - "a" -> true
     *     - null -> IllegalArgumentException
     */

    @ParameterizedTest
    @ValueSource(strings = {"abba", "hah", "", "a"})
    public void userCanCheckIfValidStringIsPalindrome(String initialString) {
        boolean actualResult = stringProcessor.isPalindrome(initialString);
        assertTrue(actualResult);
    }

    @Test
    public void userCanCheckIfValidStringIsNotPalindrome() {
        String initialString = "john";
        boolean actualResult = stringProcessor.isPalindrome(initialString);

        assertFalse(actualResult);
    }

    @Test
    public void userCannotCheckIfNullStringIsPalindrome() {
        assertThrows(IllegalArgumentException.class, () -> {
            stringProcessor.reverse(null);
        }, "Checking if null string is palindrome should lead to IllegalArgumentException");
    }

}

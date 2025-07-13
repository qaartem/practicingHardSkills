package org.example.practicinghardskills.practice_11.test;

import org.example.practicinghardskills.practice_11.StringProcessor;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.Arguments;


import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

@DisplayName("Class StringProcessor, method reverse")
public class ReverseStringTest extends StringProcessorTest{
    /**
     * Тесты для переворота строки:
     * happy path: "sasha" -> "ahsas"
     * corner cases:
     *     "" -> ""
     *     "a" -> "a"
     *     null -> IllegalArgument Exception
     */

    public static Stream<Arguments> validStringsToReverse() {
        return Stream.of(
                // happy path: "sasha" -> "ahsas"
                Arguments.of("sasha", "ahsas"),

                // corner case: пустая строка
                Arguments.of("", ""),

                // corner case: одна буква
                Arguments.of("a", "a")
        );
    }

    @ParameterizedTest
    @MethodSource("validStringsToReverse")
    public void userCanReverseValidString(String initialString, String expectedString) {
        String reversedString = stringProcessor.reverse(initialString);

        assertEquals(expectedString, reversedString,
                "We expected result " + expectedString + ", but happened " + reversedString);
    }

    @Test
    public void userCannotReverseNullString() {
        assertThrows(IllegalArgumentException.class, () -> {
            stringProcessor.reverse(null);
        }, "Reversing of null string should lead to IllegalArgumentException");
    }
}

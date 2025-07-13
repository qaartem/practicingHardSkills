package org.example.practicinghardskills.practice_11;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MethodsTests {
    // 1 Task
    @Test
    void testIsEvenWithEvenNum()
    {
        assertTrue(Methods.isEven(2));
    }

    @Test
    void testIsEvenWithNotEvenNum()
    {
        assertFalse(Methods.isEven(3));
    }

    @Test
    void testIsEvenWithZero()
    {
        assertTrue(Methods.isEven(0));
    }

    @Test
    void testIsEvenWithNegativeNum()
    {
        assertTrue(Methods.isEven(-2));
    }

    //2 task
    @Test
    void testIsCountVowelsWithRegularString()
    {
        assertEquals(2, Methods.countVowels("hello"));
    }

    @Test
    void testIsCountVowelsWithRegular2String()
    {
        assertEquals(2, Methods.countVowels("java"));
    }

    @Test
    void testIsCountVowelsWithUpperCase()
    {
        assertEquals(5, Methods.countVowels("AEIOU"));
    }

    @Test
    void testIsCountVowelsWithNull()
    {
        assertThrows(IllegalArgumentException.class, ()-> Methods.countVowels(null));
    }

    @Test
    void testIsCountVowelsWithoutVowels()
    {
        assertEquals(0, Methods.countVowels("rtplk"));
    }

    //3 task
    @Test
    void testIsReversedString()
    {
        assertEquals("gnirts", Methods.reverse("string"));
    }

    @Test
    void testIsReversedEmptyString()
    {
        assertEquals("", Methods.reverse(""));
    }

    @Test
    void testIsReversedNullString()
    {
        assertNull(Methods.reverse(null));
    }

    //4 task
    @Test
    void testIsMaxNumber()
    {
        assertEquals(7, Methods.findMax(new int[]{3, 5, 7, 2}));
    }

    @Test
    void testIsMaxNumberWithNegativeNumber()
    {
        assertEquals(7, Methods.findMax(new int[]{-3, 5, 7, 2}));
    }

    @Test
    void testIsMaxNumberWithAllNegativeNumbers()
    {
        assertEquals(-2, Methods.findMax(new int[]{-3, -5, -7, -2}));
    }

    @Test
    void testIsMaxNumberWithEmptyArray()
    {
        assertThrows(RuntimeException.class, ()-> Methods.findMax(new int[]{}));
    }

    //5 task
    @Test
    void testIsLeapYearTrue()
    {
        assertTrue(Methods.isLeapYear(2020));
        assertTrue(Methods.isLeapYear(2000));
        assertTrue(Methods.isLeapYear(1600));
    }

    @Test
    void testIsLeapYearFalse()
    {
        assertFalse(Methods.isLeapYear(1900));
        assertFalse(Methods.isLeapYear(2100));
    }

    //6 task
    @Test
    void testIsValidEmailTrue()
    {
        assertTrue(Methods.isValidEmail("test@example.com"));
    }

    @Test
    void testIsValidEmailFalse()
    {
        assertFalse(Methods.isValidEmail("bad@.com"));
        assertFalse(Methods.isValidEmail("no-at-symbol"));
    }

    @Test
    void testIsValidEmailNull()
    {
        assertFalse(Methods.isValidEmail(null));

    }

    //7 task
    @Test
    void testFactorialOfSmallNums()
    {
        assertEquals(1, Methods.factorial(0));
        assertEquals(1, Methods.factorial(1));
        assertEquals(120, Methods.factorial(5));
        assertEquals(5040, Methods.factorial(7));

    }

    @Test
    void testFactorialOfNegativeNums()
    {
        assertThrows(IllegalArgumentException.class, ()-> Methods.factorial(-1));

    }

    //8 task

    @Test
    void testIsSecondMaxNumber()
    {
        assertEquals(5, Methods.findSecondMax(new int[]{3, 5, 7, 2}));
    }

    @Test
    void testIsSecondMaxNumberWithTheSameNums()
    {
        assertEquals(5, Methods.findSecondMax(new int[]{5, 5, 1}));
    }

    @Test
    void testIsSecondMaxNumberWithAllTheSameNums()
    {
        assertThrows(RuntimeException.class, ()-> Methods.findSecondMax(new int[]{1}));
    }

    //9 task

    @Test
    void testCountWords()
    {
        assertEquals(2, Methods.countWords("Hello world"));
    }

    @Test
    void testCountWordsWithEmptyString()
    {
        assertEquals(0, Methods.countWords(""));
    }

    @Test
    void testCountWordsWithNull()
    {
        assertThrows(NullPointerException.class, ()-> Methods.countWords(null));
    }

    @Test
    void testCountWordsWithSpaces()
    {
        assertEquals(2, Methods.countWords("Hello               world              "));
    }
}

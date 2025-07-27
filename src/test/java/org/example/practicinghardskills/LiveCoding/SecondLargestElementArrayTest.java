package org.example.practicinghardskills.LiveCoding;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class SecondLargestElementArrayTest {

    @Test
    void secondLargestElement() {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        assertEquals(9, SecondLargestElementArray.secondLargestElement(array));
    }

    @Test
    void secondLargestElementStream() {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        assertEquals(9, SecondLargestElementArray.secondLargestElementStream(array));
    }
}
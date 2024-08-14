package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class JavaPractiseMainTest {

    @Test
    public void testStringTimes() {
        // Test case 1: General case with multiple repetitions
        assertEquals("HiHi", JavaPractiseMain.stringTimes("Hi", 2), "Expected 'HiHi'");

        // Test case 2: Single repetition
        assertEquals("Hi", JavaPractiseMain.stringTimes("Hi", 1), "Expected 'Hi'");

        // Test case 3: No repetition
        assertEquals("", JavaPractiseMain.stringTimes("Hi", 0), "Expected empty string");

        // Test case 4: Multiple repetitions with different string
        assertEquals("HelloHelloHello", JavaPractiseMain.stringTimes("Hello", 3), "Expected 'HelloHelloHello'");
    }

    @Test
    public void testFrontTimes() {
        // Test case 1: General case with string length greater than 3
        assertEquals("ChoCho", JavaPractiseMain.frontTimes("Chocolate", 2), "Expected 'ChoCho'");

        // Test case 2: String shorter than 3 characters
        assertEquals("AbAb", JavaPractiseMain.frontTimes("Ab", 2), "Expected 'AbAb'");

        // Test case 3: Exact 3 characters
        assertEquals("ChoChoCho", JavaPractiseMain.frontTimes("Cho", 3), "Expected 'ChoChoCho'");

        // Test case 4: No repetition
        assertEquals("", JavaPractiseMain.frontTimes("Chocolate", 0), "Expected empty string");
    }

    @Test
    public void testCountXX() {
        // Test case 1: General case with multiple "xx"
        assertEquals(2, JavaPractiseMain.countXX("abcxxdxx"), "Expected 2 occurrences of 'xx'");

        // Test case 2: Single "xx"
        assertEquals(1, JavaPractiseMain.countXX("abcxxdef"), "Expected 1 occurrence of 'xx'");

        // Test case 3: No "xx"
        assertEquals(0, JavaPractiseMain.countXX("abcdef"), "Expected 0 occurrences of 'xx'");

        // Test case 4: Consecutive "xx"
        assertEquals(3, JavaPractiseMain.countXX("xxxx"), "Expected 3 occurrences of 'xx' (overlapping)");
    }
}


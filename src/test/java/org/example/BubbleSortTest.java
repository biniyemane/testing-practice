package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class BubbleSortTest {

    @Test
    public void testBubbleSort() {
        // Test case 1: General case with random elements
        int[] array = {5, 3, 8, 4, 2};
        int[] expected = {2, 3, 4, 5, 8};
        BubbleSort.bubbleSort(array);
        assertArrayEquals(expected, array, "The array should be sorted in ascending order");

        // Test case 2: Array with already sorted elements
        int[] sortedArray = {1, 2, 3, 4, 5};
        int[] expectedSorted = {1, 2, 3, 4, 5};
        BubbleSort.bubbleSort(sortedArray);
        assertArrayEquals(expectedSorted, sortedArray, "The already sorted array should remain unchanged");

        // Test case 3: Array with all elements the same
        int[] identicalArray = {7, 7, 7, 7, 7};
        int[] expectedIdentical = {7, 7, 7, 7, 7};
        BubbleSort.bubbleSort(identicalArray);
        assertArrayEquals(expectedIdentical, identicalArray, "The array with all identical elements should remain unchanged");

        // Test case 4: Array with a single element
        int[] singleElementArray = {42};
        int[] expectedSingle = {42};
        BubbleSort.bubbleSort(singleElementArray);
        assertArrayEquals(expectedSingle, singleElementArray, "The array with a single element should remain unchanged");

        // Test case 5: Empty array
        int[] emptyArray = {};
        int[] expectedEmpty = {};
        BubbleSort.bubbleSort(emptyArray);
        assertArrayEquals(expectedEmpty, emptyArray, "The empty array should remain unchanged");
    }
}


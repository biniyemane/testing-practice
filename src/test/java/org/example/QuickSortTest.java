package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class QuickSortTest {

    @Test
    public void testQuickSort() {
        // Test case 1: General case with random elements
        int[] array = {4, 1, 3, 9, 7};
        int[] expected = {1, 3, 4, 7, 9};
        QuickSort.quickSort(array, 0, array.length - 1);
        assertArrayEquals(expected, array, "The array should be sorted in ascending order");

        // Test case 2: Array with already sorted elements
        int[] sortedArray = {1, 2, 3, 4, 5};
        int[] expectedSorted = {1, 2, 3, 4, 5};
        QuickSort.quickSort(sortedArray, 0, sortedArray.length - 1);
        assertArrayEquals(expectedSorted, sortedArray, "The already sorted array should remain unchanged");

        // Test case 3: Array with all elements the same
        int[] identicalArray = {7, 7, 7, 7, 7};
        int[] expectedIdentical = {7, 7, 7, 7, 7};
        QuickSort.quickSort(identicalArray, 0, identicalArray.length - 1);
        assertArrayEquals(expectedIdentical, identicalArray, "The array with all identical elements should remain unchanged");

        // Test case 4: Array with a single element
        int[] singleElementArray = {42};
        int[] expectedSingle = {42};
        QuickSort.quickSort(singleElementArray, 0, singleElementArray.length - 1);
        assertArrayEquals(expectedSingle, singleElementArray, "The array with a single element should remain unchanged");

        // Test case 5: Empty array
        int[] emptyArray = {};
        int[] expectedEmpty = {};
        QuickSort.quickSort(emptyArray, 0, emptyArray.length - 1);
        assertArrayEquals(expectedEmpty, emptyArray, "The empty array should remain unchanged");
    }
}


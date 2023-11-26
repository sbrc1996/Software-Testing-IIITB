package org.example;

import junit.framework.TestCase;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertNotEquals;

public class InsertionSortTest extends TestCase {

    @Test
    public void testSort() {
        InsertionSort insertionSort = new InsertionSort();

        // Test case 1: Random unsorted array
        int[] arr1 = {4, 2, 7, 1, 9};
        int[] expected1 = {1, 2, 4, 7, 9};
        insertionSort.sort(arr1);
        assertArrayEquals(expected1, arr1);

        // Test case 2: Sorted array
        int[] arr2 = {1, 2, 3, 4, 5};
        int[] expected2 = {1, 2, 3, 4, 5};
        insertionSort.sort(arr2);
        assertArrayEquals(expected2, arr2);

        // Test case 3: Reverse sorted array
        int[] arr3 = {5, 4, 3, 2, 1};
        int[] expected3 = {1, 2, 3, 4, 5};
        insertionSort.sort(arr3);
        assertArrayEquals(expected3, arr3);

        // Test case 4: Array with duplicate elements
        int[] arr4 = {3, 2, 1, 2, 3};
        int[] expected4 = {1, 2, 2, 3, 3};
        insertionSort.sort(arr4);
        assertArrayEquals(expected4, arr4);

        // Test case 5: Array with negative numbers
        int[] arr5 = {-4, 2, -7, 1, 9};
        int[] expected5 = {-7, -4, 1, 2, 9};
        insertionSort.sort(arr5);
        assertArrayEquals(expected5, arr5);

        // Test case 6: Empty array
        int[] arr6 = {};
        int[] expected6 = {};
        insertionSort.sort(arr6);
        assertArrayEquals(expected6, arr6);

        // Test case for assertNotEquals
        int[] arr7 = {1, 2, 3};
        int[] invalidExpected = {1, 3, 2}; // Incorrect expected result
        insertionSort.sort(arr7);
        assertNotEquals(invalidExpected, arr7);

    }
}
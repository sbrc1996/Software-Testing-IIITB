package org.example;

import junit.framework.TestCase;
import org.junit.Test;

import static org.junit.Assert.assertNotEquals;

public class RottenOrangesTest extends TestCase {

    @Test
    public void testOrangesRotting() {
        RottenOranges rottenOranges = new RottenOranges();

        // Test case 1: Regular case
        int[][] grid1 = {
                {2, 1, 1},
                {1, 1, 0},
                {0, 1, 1}
        };
        int result1 = rottenOranges.orangesRotting(grid1);
        assertEquals(4, result1);

        // Test case 2: No rotten oranges initially
        int[][] grid2 = {
                {1, 1, 1},
                {1, 1, 1},
                {1, 1, 1}
        };
        int result2 = rottenOranges.orangesRotting(grid2);
        assertEquals(-1, result2);

        // Test case 3: All oranges are initially rotten
        int[][] grid3 = {
                {2, 2, 2},
                {2, 2, 2},
                {2, 2, 2}
        };
        int result3 = rottenOranges.orangesRotting(grid3);
        assertEquals(0, result3);

        // Test case 4: Some oranges cannot be rotten
        int[][] grid4 = {
                {2, 1, 1},
                {0, 1, 1},
                {1, 0, 1}
        };
        int result4 = rottenOranges.orangesRotting(grid4);
        assertEquals(-1, result4);

        // Test case 5: Some oranges cannot be rotten
        int[][] grid5 = {
                {2, 1, 1},
                {1, 0, 1},
                {0, 1, 1}
        };
        int result5 = rottenOranges.orangesRotting(grid5);
        assertEquals(5, result5);

        // Test case for assertNotEquals
        int[][] grid6 = {
                {2, 1, 1},
                {1, 1, 0},
                {0, 1, 1}
        };
        int invalidExpected = 3; // Incorrect expected result
        int result6 = rottenOranges.orangesRotting(grid6);
        assertNotEquals(invalidExpected, result6);
    }
}
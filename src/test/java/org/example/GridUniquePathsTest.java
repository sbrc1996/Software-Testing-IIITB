package org.example;

import junit.framework.TestCase;
import org.junit.Test;

import static org.junit.Assert.assertNotEquals;

public class GridUniquePathsTest extends TestCase {

    @Test
    public void testMazeObstacles() {
        GridUniquePaths gridUniquePaths = new GridUniquePaths();

        // Test case 1: No obstacles
        int[][] maze1 = {
                {0, 0, 0},
                {0, 0, 0},
                {0, 0, 0}
        };
        int result1 = gridUniquePaths.mazeObstacles(3, 3, maze1);
        assertEquals(6, result1);

        // Test case 2: Obstacle in the middle
        int[][] maze2 = {
                {0, 0, 0},
                {0, -1, 0},
                {0, 0, 0}
        };
        int result2 = gridUniquePaths.mazeObstacles(3, 3, maze2);
        assertEquals(2, result2);

        // Test case 3: Obstacle in the top-left corner
        int[][] maze3 = {
                {-1, 0, 0},
                {0, 0, 0},
                {0, 0, 0}
        };
        int result3 = gridUniquePaths.mazeObstacles(3, 3, maze3);
        assertEquals(0, result3);

        // Test case 4: Obstacle in the bottom-right corner
        int[][] maze4 = {
                {0, 0, 0},
                {0, 0, 0},
                {0, 0, -1}
        };
        int result4 = gridUniquePaths.mazeObstacles(3, 3, maze4);
        assertEquals(0, result4);

        // Test case 5: Large grid without obstacles
        int[][] maze5 = new int[10][10];
        int result5 = gridUniquePaths.mazeObstacles(10, 10, maze5);
        assertEquals(48620, result5);

        // Test case for assertNotEquals
        int[][] maze6 = {
                {0, 0, 0},
                {0, -1, 0},
                {0, 0, 0}
        };
        int invalidExpected = 5; // Incorrect expected result
        int result6 = gridUniquePaths.mazeObstacles(3, 3, maze6);
        assertNotEquals(invalidExpected, result6);
    }
}
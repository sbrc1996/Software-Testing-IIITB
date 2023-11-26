package org.example;

import junit.framework.TestCase;
import org.junit.Test;

import static org.junit.Assert.assertNotEquals;

public class ShipCapacityDdaysTest extends TestCase {

    @Test
    public void testLeastWeightCapacity() {
        ShipCapacityDdays shipCapacityDdays = new ShipCapacityDdays();

        // Test case 1: Regular case
        int[] weights1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int d1 = 5;
        int result1 = shipCapacityDdays.leastWeightCapacity(weights1, d1);
        assertEquals(15, result1);

        // Test case 2: Smallest possible weights array
        int[] weights2 = {1};
        int d2 = 1;
        int result2 = shipCapacityDdays.leastWeightCapacity(weights2, d2);
        assertEquals(1, result2);

        // Test case 3: All weights can be shipped in one day
        int[] weights3 = {5, 4, 3, 2, 1};
        int d3 = 1;
        int result3 = shipCapacityDdays.leastWeightCapacity(weights3, d3);
        assertEquals(15, result3);

        // Test case 4: Single weight requiring multiple days
        int[] weights4 = {7, 8, 9, 10};
        int d4 = 2;
        int result4 = shipCapacityDdays.leastWeightCapacity(weights4, d4);
        assertNotEquals(17, result4);

        // Test case 5: Multiple weights requiring multiple days
        int[] weights5 = {3, 2, 2, 4, 1, 4};
        int d5 = 3;
        int result5 = shipCapacityDdays.leastWeightCapacity(weights5, d5);
        assertEquals(6, result5);

        // Test case for assertNotEquals
        int[] weights6 = {1, 2, 3, 4, 5};
        int invalidExpected = 10; // Incorrect expected result
        int result6 = shipCapacityDdays.leastWeightCapacity(weights6, d1);
        assertNotEquals(invalidExpected, result6);
    }
}
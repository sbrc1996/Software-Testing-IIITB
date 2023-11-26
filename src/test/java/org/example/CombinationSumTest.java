package org.example;

import junit.framework.TestCase;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertNotEquals;

public class CombinationSumTest extends TestCase {

    @Test
    public void testCombinationSum2() {
        CombinationSum combinationSum = new CombinationSum();

        // Test case 1
        int[] candidates1 = {10, 1, 2, 7, 6, 1, 5};
        int target1 = 8;
        List<List<Integer>> expected1 = new ArrayList<>();
        expected1.add(Arrays.asList(1, 1, 6));
        expected1.add(Arrays.asList(1, 2, 5));
        expected1.add(Arrays.asList(1, 7));
        expected1.add(Arrays.asList(2, 6));
        List<List<Integer>> result1 = combinationSum.combinationSum2(candidates1, target1);
        assertEquals(expected1, result1);

        // Test case 2
        int[] candidates2 = {2, 5, 2, 1, 2};
        int target2 = 5;
        List<List<Integer>> expected2 = new ArrayList<>();
        expected2.add(Arrays.asList(1, 2, 2));
        expected2.add(Arrays.asList(5));
        List<List<Integer>> result2 = combinationSum.combinationSum2(candidates2, target2);
        assertEquals(expected2, result2);

        // Test case for assertNotEquals
        int[] candidates3 = {2, 3, 5};
        int target3 = 8;
        List<List<Integer>> invalidExpected = new ArrayList<>();
        invalidExpected.add(Arrays.asList(2, 3, 3)); // Incorrect expected result
        List<List<Integer>> result3 = combinationSum.combinationSum2(candidates3, target3);
        assertNotEquals(invalidExpected, result3);
    }
}
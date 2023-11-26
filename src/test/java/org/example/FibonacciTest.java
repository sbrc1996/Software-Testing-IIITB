package org.example;

import junit.framework.TestCase;
import org.junit.Test;

import static org.junit.Assert.assertNotEquals;

public class FibonacciTest extends TestCase {

    @Test
    public void testF() {
        Fibonacci fibonacci = new Fibonacci();

        // Test case 1: Base case
        int result1 = fibonacci.fib(0);
        assertEquals(0, result1);

        // Test case 2: Base case
        int result2 = fibonacci.fib(1);
        assertEquals(1, result2);

        // Test case 3: Common case
        int result3 = fibonacci.fib(5);
        assertEquals(5, result3);

        // Test case 4: Common case
        int result4 = fibonacci.fib(8);
        assertEquals(21, result4);

        // Test case 5: Edge case with a negative input
        int result5 = fibonacci.fib(-3);
        assertEquals(-1, result5); // Fibonacci of a negative number is undefined

        // Test case 6: Large input
        int result6 = fibonacci.fib(20);
        assertEquals(6765, result6);

        // Test case 10: Wrong Answer
        int result10 = fibonacci.fib(99);
        assertNotEquals(135, result10);

        // Test case 11: Wrong Answer
        int[] dp11 = new int[1000];
        int result11 = fibonacci.fib(10);
        assertNotEquals(58, result11);

    }
}
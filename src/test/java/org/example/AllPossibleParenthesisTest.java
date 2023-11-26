package org.example;

import junit.framework.TestCase;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertNotEquals;

public class AllPossibleParenthesisTest extends TestCase {

    @Test
    public void testGenerateParenthesis() {
        AllPossibleParenthesis allPossibleParenthesis = new AllPossibleParenthesis();

        List<String> expected1 = Arrays.asList("(())", "()()");
        List<String> result1 = allPossibleParenthesis.generateParenthesis(2);
        assertEquals(expected1, result1);

        List<String> expected2 = Arrays.asList("(((())))", "((()()))", "((())())", "((()))()", "(()(()))", "(()()())", "(()())()", "(())(())", "(())()()", "()((()))", "()(()())", "()(())()", "()()(())", "()()()()");
        List<String> result2 = allPossibleParenthesis.generateParenthesis(4);
        assertEquals(expected2, result2);

        List<String> expected3 = Arrays.asList("");
        List<String> result3 = allPossibleParenthesis.generateParenthesis(1);
        assertNotEquals(expected3,result3);

    }
}
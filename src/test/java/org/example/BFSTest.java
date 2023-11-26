package org.example;

import junit.framework.TestCase;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertNotEquals;

public class BFSTest extends TestCase {

    @Test
    public void testBfsOfGraph() {
        BFS bfs = new BFS();

//        // Test case 1
//        int V1 = 4;
//        ArrayList<ArrayList<Integer>> adj1 = new ArrayList<>();
//        adj1.add(new ArrayList<>(List.of(1, 2)));
//        adj1.add(new ArrayList<>(List.of(0, 3)));
//        adj1.add(new ArrayList<>(List.of(0, 3)));
//        adj1.add(new ArrayList<>(List.of(1, 2, 4)));
//        ArrayList<Integer> result1 = bfs.bfsOfGraph(V1, adj1);
//        ArrayList<Integer> expected1 = new ArrayList<>(List.of(0, 1, 2, 3, 4));
//        assertEquals(expected1, result1);

        // Test case 2
        int V2 = 6;
        ArrayList<ArrayList<Integer>> adj2 = new ArrayList<>();
        adj2.add(new ArrayList<>(List.of(1, 2)));
        adj2.add(new ArrayList<>(List.of(0, 3, 4)));
        adj2.add(new ArrayList<>(List.of(0, 5)));
        adj2.add(new ArrayList<>(List.of(1, 5)));
        adj2.add(new ArrayList<>(List.of(1)));
        adj2.add(new ArrayList<>(List.of(2, 3)));
        ArrayList<Integer> result2 = bfs.bfsOfGraph(V2, adj2);
        ArrayList<Integer> expected2 = new ArrayList<>(List.of(0, 1, 2, 3, 4, 5));
        assertEquals(expected2, result2);

        // Test case for assertNotEquals
        int V3 = 3;
        ArrayList<ArrayList<Integer>> adj3 = new ArrayList<>();
        adj3.add(new ArrayList<>(List.of(1, 2)));
        adj3.add(new ArrayList<>(List.of(0)));
        adj3.add(new ArrayList<>(List.of(0)));
        ArrayList<Integer> result3 = bfs.bfsOfGraph(V3, adj3);
        ArrayList<Integer> invalidExpected = new ArrayList<>(List.of(0, 2, 1));     // Incorrect expected result
        assertNotEquals(invalidExpected, result3);




    }


}
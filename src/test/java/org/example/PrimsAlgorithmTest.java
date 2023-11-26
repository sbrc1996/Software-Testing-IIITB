package org.example;

import junit.framework.TestCase;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertNotEquals;

public class PrimsAlgorithmTest extends TestCase {

    @Test
    public void testSpanningTree() {
        PrimsAlgorithm primsAlgorithm = new PrimsAlgorithm();

        // Test case 1: Regular case
        int V1 = 9;
        ArrayList<ArrayList<ArrayList<Integer>>> adjGraph1 = new ArrayList<ArrayList<ArrayList<Integer>>>();
        int[][] edges1 =  {{0,1,4},{1,7,11},{0,7,8},{1,2,8},{2,8,2},{2,3,7},{2,5,4},{7,8,7},{7,6,1},{8,6,6},{6,5,2},{5,3,14},{3,4,9},{5,4,10}};

        for (int i = 0; i < V1; i++) {
            adjGraph1.add(new ArrayList<ArrayList<Integer>>());
        }

        for (int i = 0; i < edges1.length; i++) {
            int u = edges1[i][0];
            int v = edges1[i][1];
            int w = edges1[i][2];

            ArrayList<Integer> tmp1 = new ArrayList<Integer>();
            ArrayList<Integer> tmp2 = new ArrayList<Integer>();
            tmp1.add(v);
            tmp1.add(w);

            tmp2.add(u);
            tmp2.add(w);

            adjGraph1.get(u).add(tmp1);
            adjGraph1.get(v).add(tmp2);
        }
        int result1 = primsAlgorithm.spanningTree(V1, adjGraph1);
        assertEquals(37, result1);


        //Test Case 2: No Edges
        int V2 = 3;
        ArrayList<ArrayList<ArrayList<Integer>>> adjGraph2 = new ArrayList<ArrayList<ArrayList<Integer>>>();
        int[][] edges2 =  {{0,0,0}, {1,1,0}, {2,2,0} };

        for (int i = 0; i < V2; i++) {
            adjGraph2.add(new ArrayList<ArrayList<Integer>>());
        }

        for (int i = 0; i < edges2.length; i++) {
            int u = edges2[i][0];
            int v = edges2[i][1];
            int w = edges2[i][2];

            ArrayList<Integer> tmp1 = new ArrayList<Integer>();
            ArrayList<Integer> tmp2 = new ArrayList<Integer>();
            tmp1.add(v);
            tmp1.add(w);

            tmp2.add(u);
            tmp2.add(w);

            adjGraph2.get(u).add(tmp1);
            adjGraph2.get(v).add(tmp2);
        }
        int result2 = primsAlgorithm.spanningTree(V2, adjGraph2);
        assertEquals(0, result2);

        //Test Case 3: Wrong Answer
        int V3 =5;
        ArrayList<ArrayList<ArrayList<Integer>>> adjGraph3 = new ArrayList<ArrayList<ArrayList<Integer>>>();
        int[][] edges3 =  {{0,4,8},{0,3,7},{0,1,3},{4,3,3},{1,3,4},{1,2,1},{3,2,2} };

        for (int i = 0; i < V3; i++) {
            adjGraph3.add(new ArrayList<ArrayList<Integer>>());
        }
        for (int i = 0; i < edges3.length; i++) {
            int u = edges3[i][0];
            int v = edges3[i][1];
            int w = edges3[i][2];

            ArrayList<Integer> tmp1 = new ArrayList<Integer>();
            ArrayList<Integer> tmp2 = new ArrayList<Integer>();
            tmp1.add(v);
            tmp1.add(w);

            tmp2.add(u);
            tmp2.add(w);

            adjGraph3.get(u).add(tmp1);
            adjGraph3.get(v).add(tmp2);
        }
        int result3 = primsAlgorithm.spanningTree(V3, adjGraph3);
        assertNotEquals(22, result3);

    }
}
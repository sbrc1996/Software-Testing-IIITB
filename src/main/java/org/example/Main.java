package org.example;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Project to show Unit and Mutation Testing for Course Software Testing !");

        int arr[] = { 12, 11, 13, 5, 6 };
        InsertionSort ins = new InsertionSort();
        System.out.print("The array before Insertion sort : ");
        ins.printArray(arr);
        System.out.println();

        ins.sort(arr);

        System.out.print("The array after Insertion sort : ");
        ins.printArray(arr);
        System.out.println();

        SelectionSort sel = new SelectionSort();
        int arr1[] = {64,25,12,22,11};
        System.out.print("The array before Selection sort : ");
        sel.printArray(arr1);
        System.out.println();

        sel.sort(arr1);

        System.out.print("The array after Selection sort : ");
        sel.printArray(arr1);

        MergeSort ms = new MergeSort();
        int arr2[] =  { 12, 11, 13, 5, 6, 7 };
        System.out.print("The array before Merge sort : ");
        ms.printArray(arr2);
        System.out.println();

        ms.sort(arr2,0, arr2.length-1);
        System.out.print("The array after Merge sort : ");
        ms.printArray(arr2);

        System.out.println("Algorithm to implement Binary Search..");
        BinarySearch bs = new BinarySearch();
        int arr3[] =  { 2, 3, 4, 10, 40 };
        int n = arr3.length;
        int x = 10;
        int result = bs.binarySearch(arr3, x);
        if (result == -1)
            System.out.println("Element is not present in array");
        else
            System.out.println("Element is present at "+ "index " + result);

        System.out.println("Given weights of packages. Find out the least-weight capacity so that you can ship all the packages within ‘d’ days...");
        ShipCapacityDdays sc = new ShipCapacityDdays();
        int weights[] = {5, 4, 5, 2, 3, 4, 5, 6};
        int d = 5;
        int ans = sc.leastWeightCapacity(weights, d);
        System.out.println("The minimum capacity should be: " + ans);

        System.out.println("Given an integer generate all possible balanced parenthesis..");
        AllPossibleParenthesis app = new AllPossibleParenthesis();
        int value = 3;
        List<String> list = app.generateParenthesis(value);
        for(String s : list){
            System.out.print(s + ", ");
        }
        System.out.println();

        System.out.println("Given candidates and a target find all the unique combinations to generate sum of target.");
        int[] candidates = {10,1,2,7,6,1,5};
        int target = 8;
        CombinationSum cs = new CombinationSum();
        List <List<Integer>> ll = cs.combinationSum2(candidates,target);
        for(List<Integer> l : ll){
            System.out.print(l+" , ");
        }
        System.out.println();

        ArrayList <ArrayList< Integer >> adj = new ArrayList < > ();
        for (int i = 0; i < 5; i++) {
            adj.add(new ArrayList < > ());
        }
        adj.get(0).add(1);
        adj.get(1).add(0);
        adj.get(0).add(4);
        adj.get(4).add(0);
        adj.get(1).add(2);
        adj.get(2).add(1);
        adj.get(1).add(3);
        adj.get(3).add(1);

        System.out.println("Print the BFS Traversal of a Graph..");
        BFS bfs = new BFS();
        ArrayList < Integer > solution = bfs.bfsOfGraph(5, adj);
        for(int i = 0;i<solution.size();i++) {
            System.out.print(solution.get(i)+" ");
        }
        System.out.println();

        System.out.println("Print the DFS Traversal of a Graph..");
        DFS dfs = new DFS();
        ArrayList < Integer > answer = dfs.dfsOfGraph(5, adj);
        for(int i = 0;i<answer.size();i++) {
            System.out.print(answer.get(i)+" ");
        }

        System.out.println("Print the minimum time taken for the Oranges to Rot..");
        RottenOranges ro = new RottenOranges();
        int oranges[][]={ {2,1,1} , {1,1,0} , {0,1,1} };
        int rotting = ro.orangesRotting(oranges);
        System.out.println("Minimum Number of Minutes Required "+rotting);

        System.out.println("Print the Fibonacci Value for a given number");
        Fibonacci fibbo = new Fibonacci();
        int fibValue = 9;
        System.out.println(fibbo.fib(fibValue));

        System.out.println("Count the Total Number of ways to Bottom Right Corner..");
        GridUniquePaths gup = new GridUniquePaths();
        int[][] maze = {
                {0, 0, 0},
                {0, -1, 0},
                {0, 0, 0}
        };
        int row = maze.length;
        int col = maze[0].length;
        System.out.println(gup.mazeObstacles(row,col,maze));




    }
}
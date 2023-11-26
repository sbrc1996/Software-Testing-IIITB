package org.example;

import java.util.Arrays;

public class Fibonacci {
    public int fibUtil(int n, int[] dp){
        //base case..
        if(n<=1)
            return n;

        if(dp[n]!= -1)
            return dp[n];

        return dp[n]= fibUtil(n-1,dp) + fibUtil(n-2,dp);
    }

    public int fib(int n){
        //base case
        if(n == 0 || n == 1)
            return n;
        if(n < 0)
            return -1;

        //if n > 1..
        int[] dp = new int[n+1];
        Arrays.fill(dp,-1);
        dp[0] = 0;
        dp[1] = 1;
        return fibUtil(n,dp);
    }
}

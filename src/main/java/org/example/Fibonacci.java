package org.example;

public class Fibonacci {
    public int f(int n, int[] dp){
        if(n<=1) return n;

        if(dp[n]!= -1) return dp[n];
        return dp[n]= f(n-1,dp) + f(n-2,dp);
    }
}

package com.example.demo.codingtest.test;

import java.util.*;
public class Main {
    static Integer[] dp;
    static int n;
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        dp = new Integer[n+1];
        dp[0] = dp[1] = 0;
        System.out.print(recur(n));
    }
    static int recur(int i){
        if(dp[i]==null){
        if(i % 6 ==0){
            dp[i] = Math.min(Math.min(recur(i/3),recur(i/2)),recur(i-1))+1;
        }
        else if(i % 3 ==0){
            dp[i] = Math.min(recur(i/3), recur(i-1))+1;
        }else if(i % 2 == 0){
            dp[i] = Math.min(recur(i/2), recur(i-1))+1;
        }else{
            dp[i] = recur(i-1)+1;
         }
        }
        return dp[i];
    }
}

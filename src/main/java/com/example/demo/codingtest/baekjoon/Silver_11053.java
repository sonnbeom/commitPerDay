package com.example.demo.codingtest.baekjoon;

import java.util.*;
public class Main {
    static int[] dp;
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        dp = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        for(int i = 0 ; i< n; i++){
            dp[i] = 1;
            for(int j = 0; j < i; j++){
                if(arr[j] < arr[i]){
                    dp[i] = Math.max(dp[i], dp[j]+1);
                }
            }
        }
        int max = 1;
        for(int v: dp){
            max = Math.max(max, v);
        }
        System.out.print(max);
    }
}

package com.example.demo.codingtest.baekjoon;

import java.util.*;
public class Main {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N+1];
        int[] dp = new int[N+1];
        for(int i = 1; i<=N; i++){
            arr[i] = sc.nextInt();
        }
        for(int i = 1; i<=N; i++){
            for(int j = 1; j <= i; j++){
                dp[i] = Math.max(dp[i-j] + arr[j],dp[i]);
            }
        }
        System.out.print(dp[N]);
    }
}

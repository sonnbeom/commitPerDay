package com.example.demo.codingtest.baekjoon;

import java.util.*;
public class Main {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[]arr = new int[N];
        int[]dp = new int[N];
        for(int i = 0; i < N; i++){
            arr[i] = sc.nextInt();
        }
        for(int i =0; i < N; i++){
            dp[i] = 1;
            for(int j = 0; j < i; j++){
                if(arr[j] < arr[i]){
                    dp[i] = Math.max(dp[i], dp[j]+1);
                }
            }
        }
        int max = 1;
        for(int i : dp){
            max = Math.max(max, i);
        }
        System.out.print(max);
    }
}


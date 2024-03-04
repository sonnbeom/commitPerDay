package com.example.demo.codingtest.baekjoon;

import java.util.*;
public class Silevr3_14501 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] time = new int[n];
        int[] pay = new int[n];
        for(int i = 0; i < n; i++){
            time[i] = sc.nextInt();
            pay[i] = sc.nextInt();
        }
        int[]dp = new int[n+1];
        for(int i = 0; i < n; i++){
            if(i+time[i]<n){
                dp[i+time[i]] = Math.max(dp[i+time[i]], dp[i]+pay[i]);
            }
            dp[i+1] = Math.max(dp[i], dp[i+1]);
        }
        System.out.println(dp[n]);
    }
}

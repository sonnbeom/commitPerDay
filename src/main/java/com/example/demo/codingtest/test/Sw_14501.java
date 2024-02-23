package com.example.demo.codingtest.test;

import java.util.*;
public class Sw_14501 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] day = new int[N+1];
        int[] price = new int[N+1];
        int[] dp = new int[N+1];
        for(int i = 1; i <= N; i++){
            day[i] = sc.nextInt();
            price[i] = sc.nextInt();
        }
        int max = 0;
        for(int i = 1; i <= N; i++){
        int rest = i;
            for(int j = 1; j < i; j++){
                if(day[j]<=rest){
                    dp[j] = Math.max(max, max+price[j]);
                    rest -= day[j];
                }
            }
        }
    }
}

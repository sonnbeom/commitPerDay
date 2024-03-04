package com.example.demo.codingtest.baekjoon;

import java.util.*;
public class Main {
    static int RED = 0;
    static int GREEN = 1;
    static int BLUE = 2;
    static int DP[][];
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        DP = new int[N][3];
        for(int i = 0; i < N; i++){
          DP[i][RED] = sc.nextInt();
          DP[i][GREEN] = sc.nextInt();
          DP[i][BLUE] = sc.nextInt();
        }
        for(int i =1; i<N; i++){
            DP[i][RED] = Math.min(DP[i-1][GREEN],DP[i-1][BLUE]) + DP[i][RED];
            DP[i][BLUE] = Math.min(DP[i-1][GREEN],DP[i-1][RED]) + DP[i][BLUE];
            DP[i][GREEN] = Math.min(DP[i-1][RED],DP[i-1][BLUE]) + DP[i][GREEN];
        }
        int min = Math.min(DP[N-1][GREEN], Math.min(DP[N-1][RED],DP[N-1][BLUE]));
        System.out.println(min);
    }
}




package com.example.demo.codingtest.baekjoon;

import java.util.*;
public class Silver1_1149 {
    final static int Red = 0;
    final static int Green = 1;
    final static int Blue = 2;

    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[][] cost = new int[N][3];

        for(int i = 0; i < N; i++){
            cost[i][Red] = sc.nextInt();
            cost[i][Green] = sc.nextInt();
            cost[i][Blue] = sc.nextInt();
        }
        for(int i = 1; i<N; i++){
            cost[i][Red] = Math.min(cost[i-1][Blue], cost[i-1][Green]) + cost[i][Red];
            cost[i][Blue] = Math.min(cost[i-1][Red], cost[i-1][Green]) + cost[i][Blue];
            cost[i][Green] = Math.min(cost[i-1][Blue], cost[i-1][Red]) + cost[i][Green];
        }
        int min = Math.min(Math.min(cost[N-1][Red], cost[N-1][Blue]), cost[N-1][Green]);
        System.out.println(min);
    }
}



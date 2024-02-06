package com.example.demo.codingtest.baekjoon;

import java.util.*;
public class Silver3_15651 {
    static int N;
    static int M;
    static int arr[];

    static StringBuilder sb = new StringBuilder();
    public static void main(String[]args){
        Scanner sc =new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        arr = new int[8];

        dfs(0);
        System.out.println(sb);
    }
    static void dfs(int depth){
        if (depth==M){
            for (int i = 0; i < M; i++) {
                sb.append(arr[i]+ " ");
            }
            sb.append("\n");
            return;
        }

        for (int i = 1; i <= N; i++) {
            arr[depth] = i;
            dfs(depth+1);
        }
    }
}

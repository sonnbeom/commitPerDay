package com.example.demo.codingtest.baekjoon;

import java.util.*;
public class Silver3_15652 {
    static int N;
    static int M;

    static int[] arr;

    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        arr = new int[M+1];

        dfs(1,0);
        System.out.println(sb);
    }
    static void dfs(int at, int depth){
        if (M==depth){
            for (int i = 0; i < M; i++) {
                sb.append(arr[i]+" ");
            }
            sb.append("\n");
            return;
        }
        for (int i = at; i <= N; i++) {
            arr[depth] = at;
            dfs(i, depth+1);
        }
    }
}

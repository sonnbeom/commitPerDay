package com.example.demo.codingtest.baekjoon;

import java.util.*;
public class Main {
    static int N;
    static int M;

    static int[] arr;

    static StringBuilder sb;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        arr = new int[M];
        sb = new StringBuilder();
        dfs(1,0);
        System.out.print(sb);
    }
    static void dfs(int at, int depth){
        if(depth ==M){
            for(int i : arr){
                sb.append(i+" ");
            }
            sb.append("\n");
            return;
        }
        for(int i =at; i<=N; i++){
            arr[depth] = i;
            dfs(i, depth+1);
        }
    }
}


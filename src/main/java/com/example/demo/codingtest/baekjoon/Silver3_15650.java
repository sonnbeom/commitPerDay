package com.example.demo.codingtest.baekjoon;

import java.util.*;
public class Main {
    static int N;
    static int M;
    static int[] arr;
    static StringBuilder sb;
    /*
    * for문 돌아서 자신의 node 제거 visited true
    *
    * */
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();

        arr = new int[M];
        sb = new StringBuilder();
        dfs(1,0);
        System.out.println(sb);
    }
    static void dfs(int at, int depth){
        if(depth == M){
            for(int i: arr){
            sb.append(i+ " ");
            }
            sb.append("\n");
            return;
        }

        for (int i = at; i<N; i++){
            arr[depth] = i+1;
            dfs(i+1, depth+1);
        }

    }
}

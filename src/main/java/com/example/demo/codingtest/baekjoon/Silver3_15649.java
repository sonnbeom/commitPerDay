package com.example.demo.codingtest.baekjoon;

import java.util.*;
public class Silver3_15649 {
    static int N;
    static int M;
    static boolean[] visited;
    static int[] arr;
    static StringBuilder sb;
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        visited = new boolean[N+1];
        arr = new int[N+1];
        sb = new StringBuilder();
        recur(1);
        System.out.print(sb);
    }
    static void recur(int at){
        if(at == M){
            for(int i: arr){
                sb.append(i+" ");
            }
            sb.append("\n");
            return;
        }
        for(int i =1; i<=N; i++){
            if(visited[i]==false){
                arr[at] = i;
                visited[i] = true;
                recur(i+1);
                visited[i] = false;
            }
        }
    }
}

package com.example.demo.codingtest.baekjoon;


import java.util.*;
public class Main {
    static int N;
    static int M;
    static boolean[] visited;
    static int[][] map;
    static int count;
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        visited = new boolean[N+1];
        map = new int[N+1][N+1];
        count = 0;
        for(int i = 0; i < M; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            map[a][b] = map[b][a] = 1;
        }
        for(int i = 1; i <=N; i++){
            if(visited[i]==false){
                dfs(i);
                count++;
            }
        }
        System.out.print(count);
    }
    static void dfs(int node){
        visited[node] = true;
        for(int i = 1; i <= N; i++){
            if(map[node][i]==1 && !visited[i]){
                dfs(i);
            }
        }
    }
}

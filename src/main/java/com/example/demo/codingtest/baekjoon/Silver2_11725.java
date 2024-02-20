package com.example.demo.codingtest.baekjoon;


import java.util.*;
public class Main {
    static int N;
    static boolean[] visited;
    static ArrayList<Integer>[]list;
    static int[] parent;
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        list = new ArrayList[N+1];
        visited = new boolean[N+1];
        parent = new int[N+1];
        for(int i = 1; i <=N; i++){
            list[i] = new ArrayList<>();
        }
        for(int i = 1; i < N; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            list[a].add(b);
            list[b].add(a);
        }
        dfs(1);
        for(int i =2; i<=N; i++){
            System.out.println(parent[i]);
        }

    }
    static void dfs(int node){
        visited[node] = true;
        for(int num : list[node]){
            if(!visited[num]){
                parent[num] = node;
                dfs(num);
            }
        }
    }
}

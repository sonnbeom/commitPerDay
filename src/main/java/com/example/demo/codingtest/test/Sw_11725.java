package com.example.demo.codingtest.test;

import java.util.*;
public class Main {
    static int[] parent;
    static int node;
    static boolean[] visited;
    static ArrayList<Integer>[] list;
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        node = sc.nextInt();
        list = new ArrayList[node+1];
        parent = new int[node+1];
        visited = new boolean[node+1];
        for(int i = 0; i <= node; i++){
            list[i] = new ArrayList<>();
        }
        for(int i = 0; i < node-1; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            list[a].add(b);
            list[b].add(a);
        }
        dfs(1);
        for(int i = 2; i<= node; i++){
            System.out.println(parent[i]);
        }
    }
    static void dfs(int node){
        visited[node] = true;
        for(int v: list[node]){
            if(!visited[v]){
                parent[v] = node;
                dfs(v);
            }
        }
    }
}
package com.example.demo.codingtest.baekjoon;

import java.util.*;
public class Main {
    static int nodeCount;
    static int edgeCount;
    static int start;
    static int[][] arr;
    static boolean[] visited;
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        nodeCount = sc.nextInt();
        edgeCount = sc.nextInt();
        start = sc.nextInt();
        arr = new int[nodeCount+1][nodeCount+1];
        visited = new boolean[nodeCount+1];
        for(int i = 0; i < edgeCount; i++){
            int fi = sc.nextInt();
            int se = sc.nextInt();
            arr[fi][se] = arr[se][fi] = 1;
        }
        dfs(start);
        visited = new boolean[nodeCount+1];
        System.out.println();
        bfs();
    }
    static void dfs(int at){
        visited[at] = true;
        System.out.print(start+" ");
        for(int i =1; i <= nodeCount; i++){
            if(visited[i]==false && arr[start][i]==1){
                dfs(i);
            }
        }
    }
    static void bfs(){
        Queue<Integer>queue = new LinkedList<>();
        queue.add(start);
        while(!queue.isEmpty()){
            int tmp = queue.poll();
            for(int i = 1; i <= nodeCount; i++){
                if(!visited[i] && arr[start][i] == 1){
                    queue.add(i);
                    visited[i] = true;
                }
            }
        }
    }
}

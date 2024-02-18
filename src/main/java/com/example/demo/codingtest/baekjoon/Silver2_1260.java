package com.example.demo.codingtest.baekjoon;

import java.util.*;
public class Silver2_1260 {
    static int nodeCount;
    static int edgeCount;
    static int start;
    static boolean[] visited;
    static int[][]arr;
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        nodeCount = sc.nextInt();
        edgeCount = sc.nextInt();
        start = sc.nextInt();
        arr = new int[nodeCount+1][nodeCount+1];
        visited = new boolean[nodeCount+1];
        for(int i = 0; i<edgeCount; i++){
            int fi = sc.nextInt();
            int se = sc.nextInt();
            arr[fi][se] = arr[se][fi] = 1;
        }
        dfs(start);
        System.out.println();
        visited = new boolean[nodeCount+1];
        bfs(start);

    }
    static void dfs(int start){
        visited[start] = true;
        System.out.print(start+" ");
        for(int i = 1; i<nodeCount; i++){
            if(arr[start][i]==1 && visited[i]==false){
                dfs(i);
            }
        }
    }
    static void bfs(int start){
        Queue<Integer> queue = new LinkedList<>();
        queue.add(start);
        visited[start] = true;
        System.out.print(start+" ");
        while(!queue.isEmpty()){
            int tmp = queue.poll();
            for(int i = 1; i< nodeCount; i++){
                if(arr[tmp][i]==1 && visited[i]==false){
                    visited[i] = true;
                    queue.add(i);
                    System.out.print(i+" ");
                }
            }
        }
    }

}

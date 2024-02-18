package com.example.demo.codingtest.baekjoon;

import java.util.*;
public class Main {
    static int node;
    static int edge;
    static int start;
    static boolean[] visited;
    static int[][] arr;

    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        node = sc.nextInt();
        edge = sc.nextInt();
        start = sc.nextInt();
        arr = new int[node+1][node+1];
        visited = new boolean[node+1];
        for(int i = 0; i<edge; i++){
            int fi = sc.nextInt();
            int se = sc.nextInt();
            arr[fi][se] = arr[se][fi] = 1;
        }
        dfs(start);
        System.out.println();
        visited = new boolean[node+1];
        bfs();
    }
    static void dfs(int start){
        visited[start] = true;
        System.out.print(start+" ");
        for(int i =1; i< node+1; i++){
            if(arr[start][i]==1 && visited[i]==false){
                dfs(i);
            }
        }
    }
    static void bfs(){
        visited[start] = true;
        Queue<Integer> queue = new LinkedList<>();
        queue.add(start);
        System.out.print(start+" ");
        int tmp;
        while(!queue.isEmpty()){
            tmp = queue.poll();
            for(int i = 1; i<node+1; i++){
                if(arr[tmp][i]==1 && visited[i]==false){
                    queue.add(i);
                    visited[i] = true;
                    System.out.print(i+" ");
                }
            }
        }
    }
}

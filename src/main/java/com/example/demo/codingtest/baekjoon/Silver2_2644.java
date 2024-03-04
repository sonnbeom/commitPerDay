package com.example.demo.codingtest.baekjoon;

import java.util.*;
public class Main {
    static int node;
    static int[][] map;
    static int[] visited;
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        node = sc.nextInt();
        int fi = sc.nextInt();
        int se = sc.nextInt();
        int edge = sc.nextInt();
        map = new int[node+1][node+1];
        visited = new int[node+1];
        for(int i = 0; i < edge; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            map[a][b] = map[b][a] = 1;
        }
        bfs(fi);
        if(visited[se] == 0){
            System.out.print(-1);
        }else{
            System.out.print(visited[se]);
        }
    }
    static void bfs(int start){
        Queue<Integer> queue = new LinkedList<>();
        queue.add(start);
        visited[start] = 0;
        while(!queue.isEmpty()){
            int tmp = queue.poll();
            for(int i = 1; i <= node; i++){
                if(visited[i] == 0 && map[tmp][i]==1){
                    visited[i] = visited[tmp] + 1;
                    queue.add(i);

                }
            }
        }
    }
}

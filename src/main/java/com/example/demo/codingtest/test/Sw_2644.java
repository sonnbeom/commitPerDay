package com.example.demo.codingtest.test;

import java.util.*;
public class Main {
    static int node;
    static int edge;
    static int[][] map;
    static int[] dp;
    static boolean[] visited;

    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        node = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();
        edge = sc.nextInt();
        map = new int[node+1][node+1];
        dp = new int[node+1];
        visited = new boolean[node+1];
        for(int i = 0; i < edge; i++){
            int fi = sc.nextInt();
            int se = sc.nextInt();
            map[fi][se] = map[se][fi] = 1;
        }
        for(int i = 1; i <= node; i++){
            dp[i] = -1;
        }
        bfs(x);
        System.out.print(dp[y]);
    }
    static void bfs(int x){
        Queue<Integer>queue = new LinkedList<>();
        queue.add(x);
        dp[x] = 0;

        while(!queue.isEmpty()){
            int tmp = queue.poll();
            for(int i = 1; i <= node; i++){
                if(map[tmp][i]==1 && dp[i] == -1){
                    dp[i] = dp[tmp] + 1;
                    queue.add(i);33
                }
            }

        }
    }
}

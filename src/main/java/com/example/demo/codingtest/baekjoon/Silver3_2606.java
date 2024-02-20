package com.example.demo.codingtest.baekjoon;

import java.util.*;
public class Main {
    static int node;
    static int edge;
    static int count;
    static int[][] map;
    static boolean[] visited;
   public static void main(String[]args){
       Scanner sc = new Scanner(System.in);
       node = sc.nextInt();
       edge= sc.nextInt();
       count = 0;
       map = new int[node+1][node+1];
       visited = new boolean[node+1];
       for(int i = 0; i < edge; i++){
           int a = sc.nextInt();
           int b = sc.nextInt();
           map[a][b] = map[b][a] = 1;
       }
       dfs(1);
       System.out.print(count);
   }
   static void dfs(int depth){
       visited[depth] = true;
       for(int i = 1; i <= node; i++){
           if(map[depth][i] == 1 && !visited[i]){
               count ++;
               dfs(i);
           }
       }
   }

}

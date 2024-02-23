package com.example.demo.codingtest.baekjoon;


import java.util.Scanner;

public class Main {
    static int M;
    static int N;
    static int[][]map;
    static boolean[][] visited;
    static int[] aj = {0, 0,-1,1};
    static int[] al = {-1, 1,0,0};
    static int count;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i = 0; i < t; i++){
            M = sc.nextInt();
            N = sc.nextInt();
            map = new int[N][M];
            visited = new boolean[N][M];
            count = 0;
            int k = sc.nextInt();
            for(int j = 0; j < k; j++){
                int a = sc.nextInt();
                int b = sc.nextInt();
                map[b][a] = 1;
            }
            for(int j = 0; j < N; j++){
                for(int l = 0; l < M; l++){
                    if(map[j][l] == 1 && !visited[j][l]){
                        count++;
                        dfs(j,l);
                    }
                }
            }
            System.out.println(count);
        }
    }
    static void dfs(int j, int l){
        visited[j][l] = true;
        for(int i = 0; i < 4; i++){
            int nowJ = j + aj[i];
            int nowL = l + al[i];
            if(nowJ < N && nowJ >= 0 && nowL < M && nowL >= 0){
                if(map[nowJ][nowL] == 1 && !visited[nowJ][nowL]){
                    dfs(nowJ, nowL);
                }
            }
        }
    }

}

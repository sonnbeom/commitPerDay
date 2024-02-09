package com.example.demo.codingtest.baekjoon;

import java.util.*;
public class Silver2_1012 {
    static int M;
    static int N;
    static int[][] map;
    static boolean[][]visit;
    static StringBuilder sb = new StringBuilder();
    static int count;
    static int[] dirX = {0,0,-1,1};
    static int[] dirY = {-1,1,0,0};
    static int nowX, nowY;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();
        for (int i = 0; i < t; i++) {
            M = sc.nextInt();
            N = sc.nextInt();
            int k =sc.nextInt();
            map = new int[N][M];
            visit = new boolean[N][M];
            for (int j = 0; j < k; j++) {
                int fi = sc.nextInt();
                int se = sc.nextInt();
                map[se][fi] = 1;
            }
            count = 0;
            for (int j = 0; j < N; j++) {
                for (int l = 0; l < M; l++) {
                    if (map[j][l]==1 && !visit[j][l]){
                        count++;
                        DFS(l,j);
                    }
                }
            }
            sb.append(count).append("\n");
        }
        System.out.println(sb);

    }
    static void DFS(int x, int y){
        visit[y][x] = true;
        for (int i = 0; i < 4; i++) {
            nowX = x + dirX[i];
            nowY = y + dirY[i];
            if (RangeCheck() && map[nowY][nowX]==1 && visit[nowY][nowX] == false){
                DFS(nowX, nowY);
            }
        }
    }
    static boolean RangeCheck(){
        return (nowX < M && nowY < N && nowX >= 0 && nowY >= 0);
    }
}

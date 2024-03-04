package com.example.demo.codingtest.test;

import java.util.*;
public class Sw_2178 {
    static int[][] map;
    static boolean[][] visited;
    static int N;
    static int M;
    static int[] ax = {0, 0, -1, 1};
    static int[] ay = {-1, 1, 0, 0};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        map = new int[N][M];
        visited = new boolean[N][M];
        for (int i = 0; i < N; i++) {
            String input = sc.next();
            for (int j = 0; j < M; j++){
                map[i][j] = input.charAt(j) - '0';
            }
        }
        bfs();
        System.out.print(map[N-1][M-1]);
    }
    static void bfs(){
        visited[0][0] = true;
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[] {0,0});
        int[] tmp = new int[2];
        while(!queue.isEmpty()){
            tmp = queue.poll();
            int x = tmp[0];
            int y = tmp[1];
            for(int i = 0; i<4; i++){
                int nowX = x+ax[i];
                int nowY = x+ax[i];
                if(nowX >= 0 && nowX < M && nowY >=0 && nowY < N){
                    if(map[nowY][nowX]==1 && !visited[nowY][nowX]){
                        visited[nowY][nowX] = true;
                        map[nowY][nowX] += map[y][x];
                        queue.add(new int[] {nowX, nowY});
                    }
                }
            }
        }
    }
}

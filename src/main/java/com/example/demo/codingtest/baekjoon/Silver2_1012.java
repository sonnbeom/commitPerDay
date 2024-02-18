package com.example.demo.codingtest.baekjoon;

import java.util.*;
public class Main {
    static int M;
    static int N;
    static int[][] map;
    static boolean[][]visited;
    static int count;
    static int[] ax = {0,0,-1,1};
    static int[] ay = {-1,1,0,0};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int i=0; i<T; i++){
            M = sc.nextInt();
            N = sc.nextInt();
            int k = sc.nextInt();
            map = new int[N][M];
            count = 0;
            visited = new boolean[N][M];
            for(int j =0; j<k; j++){
                int fi = sc.nextInt();
                int se = sc.nextInt();
                map[se][fi] = 1;
            }
            for(int j =0; j<N; j++){
                for(int l=0; l<M; l++){
                    if(map[j][l]==1 && visited[j][l]==false){
                        count ++;
                        bfs(l,j);
                    }
                }
            }
            System.out.println(count);
        }

    }
    static void bfs(int x, int y){
        if(checkRange(x,y) && visited[y][x] == false && map[y][x]==1){
            visited[y][x] = true;
            for(int i=0; i<4; i++){
                int nowX = x + ax[i];
                int nowY = y + ay[i];
                bfs(nowX, nowY);
            }
        }
    }
    static boolean checkRange(int x, int y){
        return(x>=0 && x<M && y>=0 && y<N);
    }
}

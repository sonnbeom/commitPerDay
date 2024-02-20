package com.example.demo.codingtest.baekjoon;

import java.util.*;
public class Main {
    static int[][] map;
    static boolean[][] visited;
    static int N;
    static int[] ax = {0,0,-1,1};
    static int[] ay = {-1,1,0,0};
    static int[] areaCount;
    static int max;
    static int count;
    /*
    *할 때마다 visited 초기화
    **/
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        map = new int[N][N];
        max = 0;

        for(int i = 0; i < N; i++){
            for(int j = 0; j < N; j++){
                int input = sc.nextInt();
                map[i][j] = input;
                max = Math.max(input, max);
            }
        }
        areaCount = new int[max+1];
        for(int height = 0; height <= max; height++){
            count = 0;
            visited = new boolean[N][N];
            for(int i = 0; i < N; i++){
                for(int j = 0; j < N; j++){
                    if(map[i][j] > height && !visited[i][j]){
                        dfs(i,j, height);
                        count ++;
                    }
                }
            }
            areaCount[height] = count;
        }
        int poolCount = 0;
        for(int v: areaCount){
            poolCount = Math.max(poolCount, v);
        }
        System.out.print(poolCount);
    }
    static void dfs(int x, int y, int height){
        visited[x][y] = true;
        for(int i = 0; i< 4; i++){
            int nowX = x + ax[i];
            int nowY = y + ay[i];
            if(rangeCheck(nowX,nowY) && map[nowX][nowY] > height && visited[nowX][nowY] == false){
                dfs(nowX, nowY, height);
            }
        }
    }
    static boolean rangeCheck(int x, int y){
        return(x >= 0 && y >= 0&& x < N && y <N);
    }
}

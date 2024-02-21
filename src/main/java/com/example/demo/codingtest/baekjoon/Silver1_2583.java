package com.example.demo.codingtest.baekjoon;

import java.util.*;
public class Main {
    static int N;
    static int M;
    static int[][] map;
    static boolean[][] visited;
    static int[] ax = {0,0,-1,1};
    static int[] ay = {-1,1,0,0};

    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        M = sc.nextInt();
        N = sc.nextInt();
        int k = sc.nextInt();
        map = new int[M][N];
        visited = new boolean[M][N];
        ArrayList<Integer> list = new ArrayList<>();
        for(int i =0; i < k; i++){
            int lx = sc.nextInt();
            int ly = sc.nextInt();
            int rx = sc.nextInt();
            int ry = sc.nextInt();
            for(int j = ly; j < ry; j++){
                for(int l = lx; l < rx; l++){
                    map[j][l] = 1;
                }
            }
        }
        int count = 0;
        for(int i = 0; i < M; i++){
            for(int j = 0; j < N; j++){
                if(map[i][j] ==0 && visited[i][j] == false){
                    count ++;
                    int width = bfs(i,j);
                    list.add(width);
                }
            }
        }
        Collections.sort(list);
        System.out.println(count);
        for(int v : list){
            System.out.print(v+" ");
        }
    }
    static int bfs(int x, int y){
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[] {x,y});
        visited[x][y] = true;
        int width = 1;
        while(!queue.isEmpty()){
            int[] data = queue.poll();
            x = data[0];
            y = data[1];
            for(int i = 0; i < 4; i++){
                int nowX = x + ax[i];
                int nowY = y + ay[i];
                if(rangeCheck(nowX,nowY) && visited[nowX][nowY] == false && map[nowX][nowY] ==0){
                    visited[nowX][nowY] = true;
                    width++;
                    queue.add(new int[] {nowX,nowY});
                }
            }

        }
        return width;
    }
    static boolean rangeCheck(int x, int y){
        return (x >= 0 && y >= 0 && x < M && y < N);
    }
}

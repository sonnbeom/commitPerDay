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
        for(int i = 0; i < k; i++){
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
        ArrayList<Integer> sizeList = new ArrayList<>();
        for(int i = 0; i < M; i++){
            for(int j = 0; j < N; j++){
                if(!visited[i][j] && map[i][j] ==0){
                    count++;
                    int width = bfs(i,j);
                    sizeList.add(width);
                }
            }
        }
        Collections.sort(sizeList);
        System.out.println(count);
        for(int v: sizeList){
            System.out.print(v+" ");
        }
    }
    static int bfs(int x, int y){
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[] {x,y});
        visited[x][y] = true;
        int widthCount = 1;
        while(!queue.isEmpty()){
            int[] data = queue.poll();
            int tx = data[0];
            int ty = data[1];
            for(int i = 0; i < 4; i++){
                int nowX = tx + ax[i];
                int nowY = ty + ay[i];
                if(nowX >= 0 && nowY >= 0 && nowX < M && nowY < N){
                    if(map[nowX][nowY] == 0 && !visited[nowX][nowY]){
                        visited[nowX][nowY] = true;
                        widthCount++;
                        queue.add(new int[] {nowX, nowY});
                    }
                }
            }
        }
        return widthCount;
    }

}

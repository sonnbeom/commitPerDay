package com.example.demo.codingtest.test;



import java.util.*;
public class Main {
    static int N;
    static int M;
    static boolean[][] visit;
    static int[][] miro;
    static int[] ax = {0,0,-1,1};
    static int[] ay = {-1,1,0,0};
    //좌우상하
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        miro = new int[N][M];
        visit = new boolean[N][M];
        for(int i =0; i<N; i++){
            String input = sc.next();
            for(int j =0; j<M; j++){
                miro[i][j] = input.charAt(j) - '0';
            }
        }
        bfs();
        System.out.println(miro[N-1][M-1]);
    }
    static void bfs(){
        visit[0][0] = true;
        int y,x = 0;
        int nowX, nowY = 0;
        Queue<int[]> queue = new LinkedList<int[]>();
        int[] first = {0,0};
        queue.add(first);
        int[] tmp = new int[2];

        while(!queue.isEmpty()){
            tmp = queue.poll();
            x = tmp[1];
            y = tmp[0];
            for(int i =0; i<4; i++){
                nowX = x + ax[i];
                nowY = y + ay[i];
                if(check(nowX, nowY) && miro[nowY][nowX]==1 && visit[nowY][nowX] == false){
                    visit[nowY][nowX] = true;
                    miro[nowY][nowX] += miro[y][x];
                    queue.add(new int[] {nowY, nowX});
                }
            }
        }

    }
    static boolean check(int nowX, int nowY){
        return (nowX>=0 && nowX<M && nowY>=0 && nowY<N);
    }
}

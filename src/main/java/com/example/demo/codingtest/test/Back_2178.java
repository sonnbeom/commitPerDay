package com.example.demo.codingtest.test;



import java.util.*;
public class Back_2178 {
    static int N;
    static int M;
    static boolean[][] visit;
    static int[][] miro;
    static int[] x = {0,0,-1,1};
    static int[] y = {-1,1,0,0};
    //좌우상하
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        miro = new int[N][M];
        visit = new boolean[N][M];
        for(int i =0; i<N; i++){
            String input = sc.next();
            for(int j =0; i<M; j++){
                miro[i][j] = input.charAt(j) - '0';
            }
        }
        bfs();
    }
    static void bfs(){
        Queue queue = new LinkedList<int[]>();


    }
}

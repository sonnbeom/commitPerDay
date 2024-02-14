package com.example.demo.codingtest.test;


import java.util.*;
public class Main {
    static boolean[][] visit;
    static int[] x = {0,0,-1,1};
    static int[] y = {-1,1,0,0};
    //좌우 상하
    static int[][]arr;
    static int N,M,K;
    static int count;
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i = 0; i<t; i++){
            M = sc.nextInt();
            N = sc.nextInt();
            K = sc.nextInt();
            arr = new int[N][M];
            visit = new boolean[N][M];
            count = 0;

            for(int j = 0; j<K; j++){
                int fi = sc.nextInt();
                int se = sc.nextInt();
                arr[se][fi] = 1;
            }
            for(int j = 0; j < N; j++) {
                for (int l = 0; l < M; l++) {
                    if (arr[j][l] == 1 && visit[j][l]==false) {
                        changeStatus(j,l);
                        count++;
                    }
                }
            }
            System.out.println(count);
        }
    }

    static void changeStatus(int garo, int sero){
        if(rangeCheck(garo, sero) && visit[garo][sero]== false && arr[garo][sero]==1){
            visit[garo][sero] = true;
            for(int i=0; i<4; i++){
               int nextGaro = garo + x[i];
               int nextSero = sero + y[i];
               changeStatus(nextGaro, nextSero);
            }
        }
    }
    static boolean rangeCheck(int sero, int garo){
        if(garo>=0 && sero>=0 && garo<M && sero<N){
            return true;
        }else{
            return false;
        }
    }
}

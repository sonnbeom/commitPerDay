package com.example.demo.codingtest.test;

import java.util.*;
public class SW_2578 {
    static boolean[][] visited;
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int[][] bingo = new int[5][5];
        visited = new boolean[5][5];
        for(int i = 0; i < 5; i++){
            for(int j = 0 ; j < 5; j++){
                bingo[i][j] = sc.nextInt();
            }
        }
        for(int i = 0; ; i++){
            for(int j = 0; j < 5; j++){
                int num = sc.nextInt();
                for(int l = 0; l < 5; l++){
                    for(int k = 0; k < 5; k++){
                        if(bingo[l][k] == num && !visited[l][k]){
                            visited[l][k]= true;
                        }
                    }
                }

            }
        }

    }
    static void sayBingo(){
        for
    }
}
/*
* 숫자 받으면 이중 for문 돌아서
* 해당 숫자가 있다 vistit
*
* */

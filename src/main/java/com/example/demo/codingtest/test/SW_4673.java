package com.example.demo.codingtest.test;

import java.util.*;
public class Main {
    static int[][] arr;
    static int num;
    static int bingoCount;

    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        arr = new int[5][5];
        num = 0;
        bingoCount = 0;
        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 5; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 5; j++){
                num++;
                bingo(sc.nextInt());
                bingoCheck();
                if(bingoCount >= 3){
                    System.out.print(num);
                }
            }
        }
    }
    static void bingo(int num){
        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 5; j++){
                if(arr[i][j]==num){
                    arr[i][j] = 0;
                }
            }
        }
    }
    static void bingoCheck(){
        int x = 0;
        int y = 0;
        int rxy = 0;
        int lxy = 0;

        for(int i = 0; i < 5; i++){
            x = 0;
            y = 0;
            for(int j = 0; j < 5; j++){
                x += arr[i][j];
                y += arr[j][i];
                if(i==j){
                    rxy += arr[i][j];
                }
                if(4-j==i){
                    lxy += arr[i][j];
                }
            }
            if(x == 0){
                bingoCount++;
            } if(y == 0){
                bingoCount++;
            } if(rxy == 0){
                bingoCount++;
            } if(lxy == 0){
                bingoCount++;
            }
        }
    }
}

//import java.util.*;
//
//public static void main(String[]args){}

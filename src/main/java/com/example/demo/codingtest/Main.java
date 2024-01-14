package com.example.demo.codingtest;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        /*
        * 5줄의 단어 입력
        * 각 줄에는 최소 1개 최대 15개
        * */
       char[][] arr = new char[5][15];

        for (int i = 0; i < 5; i++) {
            String input = sc.next();
            for (int j = 0; j < input.length(); j++) {
                arr[i][j] = input.charAt(j);
            }
        }
        for (int i = 0; i < 15; i++) {
            for (int j = 0; j < 5; j++) {
                if(arr[j][i] == '\0'){
                    continue;
                }
                System.out.print(arr[j][i]);
            }
        }
    }
}
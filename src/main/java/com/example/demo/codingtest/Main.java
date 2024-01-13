package com.example.demo.codingtest;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int M = scanner.nextInt();

        //2차원 배열의 초기화
        int[][] Aarray = new int [N][M];
        int[][] Barray = new int [N][M];

        for(int i=0; i<N;i++) {
            for(int j=0; j<M; j++) {
                Aarray[i][j] = scanner.nextInt(); //입력받은 숫자를 2차원 배열에 넣기
            }
        }

        for(int i=0; i<N;i++) {
            for(int j=0; j<M; j++) {
                Barray[i][j] = scanner.nextInt(); //입력받은 숫자를 2차원 배열에 넣기
            }
        }

        //A 배열과 B 배열 더하기
        int[][] result = new int [N][M];
        for(int i=0; i<N; i++) {
            for(int j=0; j<M; j++) {
                result[i][j] = Aarray[i][j]+ Barray[i][j];
            }
        }

        //출력

        for(int i=0; i<N; i++) {
            for(int j=0; j<M; j++) {
                System.out.print(result[i][j]+" ");
            }
            System.out.println();
        }
    }
}
package com.example.demo.codingtest.baekjoon;

import java.util.*;
public class Silver2_1012 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int a = 0; a < t; a++) {
            int m = sc.nextInt();
            int n = sc.nextInt();
            int k = sc.nextInt();
            int count = 0;
            int[][] arr = new int[n][m];
            for (int j = 0; j < k; j++) {
                int garo = sc.nextInt();
                int sero = sc.nextInt();
                arr[garo][sero] = 1;
            }
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    if (j==0){
                     // 우측만 체크
                    }else if (j==m-1) {
                        //좌측만 체크
                    } else if (i==n-1||j==0) {
                        //맨 하단+ 맨 좌측 우측 한번만 체크
                    } else if (i==n-1) {
                        //한칸 우측, 본인 한칸 더 우측을 0으로
                    }else{
                        //대각 좌, 대각 우를 체크하자
                    }
                }
            }
            System.out.println(count);
            }
        }
    }
}

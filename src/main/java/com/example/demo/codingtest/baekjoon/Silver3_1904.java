package com.example.demo.codingtest.baekjoon;

import java.util.*;

public class Silver3_1904 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        /*
        * n t
        * 1 1
        * 2 2
        * 3 3
        * 4 5 0011 0000 1001 1111
        * 5 8 1 하나 10000 00100 00001 1 3개 00111 10011 11001 11000  11111
        * 6
        *
        *  An = A(n-1) + A(n-2)
        * */
        int[] arr = new int[1000001];
        arr[0] = 0;
        arr[1] = 1;
        arr[2] = 2;
        for (int i = 1; i <= n; i++) {
            arr[i+2] = (arr[i+1] + arr[i]) / 15746 ;
        }
        System.out.println(arr[n+2]);
    }
}

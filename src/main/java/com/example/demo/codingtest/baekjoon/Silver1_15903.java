package com.example.demo.codingtest.baekjoon;

import java.util.*;
public class Main {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        long[] num = new long[n];
        for(int i = 0; i<n; i++){
            num[i] = sc.nextInt();
        }

        for(int i = 0; i < m; i ++){
            Arrays.sort(num);
            long sum =  num[0] + num[1];
            num[0] = num[1] = sum;
        }
        long answer = 0;
        for(long v : num){
            answer += v;
        }
        System.out.print(answer);
    }
}

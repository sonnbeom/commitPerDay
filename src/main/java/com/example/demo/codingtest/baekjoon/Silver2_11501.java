package com.example.demo.codingtest.baekjoon;

import java.util.*;
public class Main {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int i = 0; i < T; i++){
            int N = sc.nextInt();
            int[] arr = new int[N];
            long sum = 0;
            for(int j = 0; j < N; j++){
                arr[j] = sc.nextInt();
            }
            int max = arr[N-1];
            for(int j = N-2; j >= 0; j--){
                if(arr[j] <= max){
                    sum += max -arr[j];
                }else{
                    max = arr[j];
                }
            }
            System.out.println(sum);
        }
    }
}

package com.example.demo.codingtest.baekjoon;

import java.util.*;
public class Main {
   public static void main(String[]args){
       Scanner sc = new Scanner(System.in);
       int T = sc.nextInt();
       for(int i = 0; i < T; i++){
           int n = sc.nextInt();
           long[] arr = new long[101];
           arr[0] =0;
           arr[1] = arr[2] = arr[3] = 1;
           for(int j = 4; j <= n; j++){
               arr[j] = arr[j-2] + arr[j-3];
           }
           System.out.println(arr[n]);
       }
   }
}
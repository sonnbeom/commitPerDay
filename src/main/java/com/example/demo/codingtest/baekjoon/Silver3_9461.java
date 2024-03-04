package com.example.demo.codingtest.baekjoon;

import java.util.*;
public class Main {
   public static void main(String[]args){
       Scanner sc = new Scanner(System.in);
       int T =sc.nextInt();
       for(int i = 0; i < T; i++){
           int N = sc.nextInt();
           long[] dp = new long[N+1];
           dp[0] = 0;
           dp[1] = dp[2] = dp[3] = 1;
           for(int j = 4; j <= N; j++){
               dp[j] = dp[j-2] + dp[j-3];
           }
           System.out.println(dp[N]);
       }
   }
}


/*
dp5 0 1 2 3 4
dp 4 dp 2 dp1
dp4
* 1 1
* 2 1
* 3 1
* 4 2
* 5 2
* 6 3
* 7 4
* 8 5
* 9 7
* 10 9
*
* 4  2 1
* ar[7] = arr[5] arr[4]
* dp[n] = dp[n-2] dp[n-3]
* */
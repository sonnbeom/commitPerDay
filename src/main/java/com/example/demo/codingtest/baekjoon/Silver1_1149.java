package com.example.demo.codingtest.baekjoon;

import java.util.Scanner;

public class Silver1_1149 {
    static int dp[];
    public static void main(String[] args) {
        /*
        * 배열 어디다 담아둬야 할 듯하다
        * dp[] 첫번째 빨강 두번째 파랑, 초록 세번째 빨강 초록, 파랑 셋 중에 미니멈
        * 첫번째 작은 수 n-1번째에 1번이었으면 2, 3 중에 작은 숫자 고르기
        * 카운트라는 것을 둬야 겄다
        * if 현재 count가 1이라면
        * dp[n] = Math.min(dp[n-1]+arr[2],dp[n-1]+arr[3])
        *  * if 현재 count가 2이라면
         * dp[n] = Math.min(dp[n-1]+arr[1],dp[n-1]+arr[3])
         *  *  * if 현재 count가 3이라면
         * dp[n] = Math.min(dp[n-1]+arr[1],dp[n-1]+arr[2])
         * 첫번째 두번째가 문제다
         * 1 5 10
         * 10 100 200
         * */
        int[] arr1 = new int[3];
        int[] arr2= new int[3];
        int[] input = new int[3];
        int count = 0;
        dp = new  int[1001];
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 3; j++) {
                input[j] = sc.nextInt();
                if (i==0){
                    arr1[j] = input[j];
                }
                if (i==1){
                    arr2[j] = input[j];
                    //작은 값을 구해야 한다 1 23/ 2 13/ 3 12
                    //math.min 값을 하면 답을 못 구한다.

                }
            }
            if(count==0){
                dp[i] = Math.min(dp[i-1]+input[1],dp[i-1]+input[2]);
            }else if (count==1) {
                dp[i] = Math.min(dp[i-1]+input[0],dp[i-1]+input[2]);
            }else if (count==2) {
                dp[i] = Math.min(dp[i-1]+input[0],dp[i-1]+input[1]);
            }
        }
    }
}

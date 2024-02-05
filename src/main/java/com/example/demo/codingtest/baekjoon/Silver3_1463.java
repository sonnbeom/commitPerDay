package com.example.demo.codingtest.baekjoon;

import java.util.*;
public class Silver3_1463 {
    static Integer[] dp;
    // n번째 배열을 null일 경우 재귀함수가 호출되므로 int가 아닌 Integer를 적었습니다.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        dp = new Integer[n+1];
        dp[0] = dp[1] = 0;
        //if문을 탈출할 수 있게 0번째와 첫번째 배열의 값을 넣어줍니다.
        System.out.println(recur(n));
    }
    static int recur(int n){
        if (dp[n] == null){
            if (n%6==0){
                dp[n] = Math.min(Math.min(recur(n/3), recur(n/2)), recur(n-1))+1;
            }else if (n%3==0) {
                dp[n] = Math.min(recur(n/3), recur(n-1))+1;
            }else if (n%2==0) {
                dp[n] = Math.min(recur(n/2), recur(n-1))+1;
            }else {
                dp[n] = recur(n-1)+1;
            }
        }
        return dp[n];
    }
}

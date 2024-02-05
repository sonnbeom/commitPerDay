package com.example.demo.codingtest.baekjoon;

import java.util.*;
public class Silver3_1463 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int result = dfs(n);
        System.out.println();
    }
    static int dfs(int n){

        if (n%6==0){
            return Math.min(Math.min(dfs(n/3), dfs(n/2)), dfs(n-1))+1;
        }else if (n%3==0) {
            return Math.min(dfs(n/3), dfs(n-1))+1;
        } else if (n%2==0) {
            return Math.min(dfs(n/2), dfs(n-1))+1;
        }else {
            return dfs(n-1)+1;
        }
    }
}

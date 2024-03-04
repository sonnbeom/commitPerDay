package com.example.demo.codingtest.test;



import java.util.*;

public class Main {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] DP = new int[10000001];
        DP[0]=0;
        DP[1]=1;
        DP[2]=2;
        for(int i = 3; i<=N; i++){
            DP[i] = (DP[i-1] + DP[i-2])%15746;
        }
        System.out.println(DP[N]);
    }
}

/*
* n t
* 1 1
* 2 2
* 3 3
* 4 5
* 5 8
* */

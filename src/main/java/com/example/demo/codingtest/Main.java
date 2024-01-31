package com.example.demo.codingtest;



import java.util.Scanner;

public class Main {
    static int N;
    static int M;

    static StringBuilder st = new StringBuilder();

    static int[] arr;

    public static void main(String[]args){
       Scanner sc = new Scanner(System.in);
       N = sc.nextInt();
       M = sc.nextInt();

       arr = new int[M];

       dfs(1,0);
       System.out.println(st);

    }
    static void dfs(int at, int depth){

        if (depth==M){
            for(int num: arr){
                st.append(num).append(" ");
            }
            st.append("\n");
            return;
        }


        for (int i = at; i < N; i++) {
            arr[depth] = i;
            dfs(i+1, depth+1);
        }

    }
}
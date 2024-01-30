package com.example.demo.codingtest;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


public class Main {
    static int[] arr;
    static boolean[] visit;
    static StringBuilder st;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        arr = new int[m];
        visit = new boolean[m];

        dfs(n, m, 0);


    }
    private static void dfs(int n, int m, int depth){

        if (depth==m){
            for(int num: arr){
                st.append(num).append(" ");
            }
            st.append("\n");
            return;
        }

        for(int i=0; i<n; i++){
            if (!visit[i]) {
                visit[i] = true;
                arr[depth] = i+1;
                dfs(n,m,depth+1);
                visit[i] = false;

            }
        }
    }

}


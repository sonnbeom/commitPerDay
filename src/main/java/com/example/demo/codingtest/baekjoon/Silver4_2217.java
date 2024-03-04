package com.example.demo.codingtest.baekjoon;

import java.util.*;
public class Silver4_2217 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Integer arr[] = new Integer[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr, Collections.reverseOrder());
        int max = 0;
        for(int i = 0; i < n; i++){
            max = Math.max(max, arr[i]*(i+1));
        }
        System.out.println(max);


        /*
        * 10 20 30 40 50
        *
        *
        * 50 40 30 20 10
        * 50
        * 80
        * 90
        * 80
        *
        * */
    }
}

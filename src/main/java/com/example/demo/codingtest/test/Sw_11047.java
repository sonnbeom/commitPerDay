package com.example.demo.codingtest.test;

import java.util.*;
public class Main {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        int[] arr = new int[n];
        int count = 0;

        for(int i = n-1; i >=0 ; i--){
            arr[i] = sc.nextInt();
        }

        for(int i = 0; i < n; i++){
            if(k >= arr[i]){
                int rest = k / arr[i];
                count += rest;
                k = k % arr[i];
            }
        }
        System.out.print(count);
    }
}

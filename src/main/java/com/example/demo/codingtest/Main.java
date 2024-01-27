package com.example.demo.codingtest;


import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int l = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i <n ; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);

        int count = 0;
        int num = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i]>num){
                num = arr[i]+l-1;
                count++;
            }
        }System.out.println(count);
    }
}
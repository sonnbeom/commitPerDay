package com.example.demo.codingtest;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Integer[] arr = new Integer[n];
        int min = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr, Comparator.reverseOrder());
        for (int i = 0; i < n; i++) {
            int max = arr[i]+i+1;
            if (max>min){
                min = max;
            }
        }
        System.out.println(min+1);
    }
}
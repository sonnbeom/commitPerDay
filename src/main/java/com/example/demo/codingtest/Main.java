package com.example.demo.codingtest;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] sensorArray = new int[n];
        for (int i = 0; i < n; i++) {
            sensorArray[i] = sc.nextInt();
        }

        Arrays.sort(sensorArray);

        Integer[] diff = new Integer[n-1];
        for (int i = 0; i < n-1; i++) {
            diff[i] = sensorArray[i+1] - sensorArray[i];
        }

        Arrays.sort(diff, Collections.reverseOrder());
        int sum = 0;
        for (int i = k-1; i < n-1; i++) {
            sum += diff[i];
        }
        System.out.println(sum);
    }
}
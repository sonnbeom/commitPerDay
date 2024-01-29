package com.example.demo.codingtest;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        if(k >= n) {
            System.out.println(0);
            return;
        }
        int[] sensorArray = new int[n];
        for (int i = 0; i < n; i++) {
            sensorArray[i] = sc.nextInt();
        }
        // 센서의 거리를 오름차순으로 정렬 -> 센서의 거리 차이 중 가장 큰 값을 알기 위함
        Arrays.sort(sensorArray);
        // 센서의 거리 차이만큼 배열에 담아줍니다. 차이가 작은 순으로 정렬되어있습니다.
        Integer[] diff = new Integer[n-1];
        for (int i = 0; i < n-1; i++) {
            diff[i] = sensorArray[i+1] - sensorArray[i];
        }
        // 차이 배열을 내림차순으로 정렬합니다.
        Arrays.sort(diff, Collections.reverseOrder());
        int sum = 0;
        // 집중국의 갯수에 따라 수신 가능 영역 길이의 합이 감소합니다.
        // 집중국이 2개라면 1개, 집중국이 3개라면 2개가 감소하기 때문에 k-1로 두었습니다.
        // diff 배열 크기가 n-1이기 때문에 i < n-1로 두었습니다.
        for (int i = k-1; i < n-1; i++) {
            sum += diff[i];
        }
        System.out.println(sum);
    }
}
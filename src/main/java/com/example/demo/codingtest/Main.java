package com.example.demo.codingtest;


import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        /*
        * */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] time = new int[n][2];

        for (int i = 0; i < n; i++) {
            time[i][0] = sc.nextInt();
            time[i][1] = sc.nextInt();
        }
        Arrays.sort(time, new Comparator<int[]>() {
            // compare 메소드가 양수를 반환화면 두 요소의 위치를 바꾼다
            //아래 방식은 오름차순 정렬이다 1 2 3.... 이런 식
            @Override
            public int compare(int[] o1, int[] o2) {
                if (o1[1]==o2[1]){
                    return o1[0] - o2[0];
                }
                return o1[1] - o2[1];
            }
        });

        int count = 0;
        int endTime = 0;

        for (int i = 0; i < n; i++) {
            if (endTime <= time[i][0]){
                count++;
                endTime = time[i][1];
            }
        }
        System.out.println(count);

    }
}
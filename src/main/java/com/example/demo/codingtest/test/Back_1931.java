package com.example.demo.codingtest.test;

import java.util.*;
public class Back_1931 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[][]time = new int[N][2];
        for(int i =0; i<N; i++){
            time[i][0] = sc.nextInt();
            time[i][1] = sc.nextInt();
        }
        Arrays.sort(time, new Comparator<int[]>(){
            @Override
            public int compare(int[]o1, int[]o2){
                if(o1[1]==o2[1]){
                    return o1[0] - o2[0];
                }
                return o1[1] - o2[1];
            }
        });
        int count = 0;
        int prevEndTime = 0;
        for(int i=0; i<N; i++){
            if(prevEndTime<=time[i][0]){
                prevEndTime = time[i][1];
                count++;
            }
        }
        System.out.println(count);
    }
}


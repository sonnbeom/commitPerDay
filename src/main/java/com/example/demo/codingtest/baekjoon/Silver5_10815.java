package com.example.demo.codingtest.baekjoon;

import java.util.*;
public class Main {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        Map<Integer, Integer>map = new HashMap<>();
        int N = sc.nextInt();
        for(int i = 0; i<N; i++){
            int input = sc.nextInt();
            map.put(input, input);
        }
        int M = sc.nextInt();
        for(int i = 0; i < M; i++){
            int input = sc.nextInt();
            if(map.containsKey(input)){
                System.out.print(1+" ");
            }else{
                System.out.print(0+" ");
            }
        }
    }
}

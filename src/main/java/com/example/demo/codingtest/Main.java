package com.example.demo.codingtest;

import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int input = sc.nextInt();
            map.put(input, input);
        }
        int m = sc.nextInt();
        for (int i = 0; i < m; i++) {
            int input = sc.nextInt();
            boolean contain =  map.containsKey(input);
            if (contain){
                System.out.println(1);
            }else {
                System.out.println(0);
            }
        }
    }
}



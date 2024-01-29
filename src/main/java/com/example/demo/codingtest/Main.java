package com.example.demo.codingtest;


import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            set.add(sc.nextInt());
        }

        int m = sc.nextInt();
        int[] card = new int[m];
        for (int i = 0; i < m; i++) {
            card[i] = sc.nextInt();
        }
        for (int i = 0; i < m; i++) {
            if (set.contains(card[i])){
                card[i] = 1;
            }else
                card[i] = 0;
        }
        for (int i = 0; i < m; i++) {
            System.out.print(card[i]+" ");
        }
    }
}

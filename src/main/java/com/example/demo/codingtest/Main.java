package com.example.demo.codingtest;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        String c = String.valueOf(a);
        String d = String.valueOf(b);

        String minC = c.replace("6","5");
        String minD = d.replace("6","5");
        String maxC = c.replace("5","6");
        String maxD = d.replace("5","6");

        int min = Integer.parseInt(minC) + Integer.parseInt(minD);
        int max = Integer.parseInt(maxC) + Integer.parseInt(maxD);

        System.out.println(min +" "+ max);
    }
}
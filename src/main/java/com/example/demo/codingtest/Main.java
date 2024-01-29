package com.example.demo.codingtest;


import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String seat = sc.next();
        seat = seat.replaceAll("LL","S");

        int index = seat.lastIndexOf("S");
        int cupCount = index+2;

        if (cupCount >= n){
            System.out.println(n);
        }else {
            System.out.println(cupCount);
        }
    }
}

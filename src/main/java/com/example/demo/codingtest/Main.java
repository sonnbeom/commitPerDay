package com.example.demo.codingtest;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        sc.close();

        String A = "AAAA";
        String B = "BB";

        //
        s = s.replaceAll("XXXX",A);
        s = s.replaceAll("XX",B);
        if (s.contains("X")){
            s = "-1";
        }
        System.out.println(s);
    }
}
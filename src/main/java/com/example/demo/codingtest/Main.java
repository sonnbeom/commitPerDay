package com.example.demo.codingtest;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i <n ; i++) {
            int rest = sc.nextInt();

            int qua = rest/25;
            rest %= 25;

            int dim = rest/10;
            rest %= 10;

            int nick = rest/5;
            rest %= 5;

            int penn = rest/1;
            System.out.println(qua+" "+dim+" "+nick+" "+penn);
        }
    }
}
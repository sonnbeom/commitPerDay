package com.example.demo.codingtest;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int taro = sc.nextInt();
        int price = 1000;
        int result = 0;
        int rest = 0;
        result = price-taro;
        if (result>=500){
            rest += result/500;
            result = result % 500;
        }if (result>=100){
            rest += result/100;
            result = result % 100;
        }
        if (result>=50){
            rest += result/50;
            result = result % 50;
        }
        if (result>=10){
            rest += result/10;
            result = result % 10;
        }
        if (result>=5){
            rest += result/5;
            result = result % 5;
        }
        if (result>=1){
            rest += result/1;
        }
        System.out.println(rest);
    }
}
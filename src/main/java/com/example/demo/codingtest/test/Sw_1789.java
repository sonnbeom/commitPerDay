package com.example.demo.codingtest.test;

import java.util.*;
public class Main {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        long start = 0;
        int count = 0;
        for(int i = 1; ; i++){
            start += i;
            count = i;
            if(start > N){
                break;
            }
        }
        System.out.print(count-1);
    }
}

/*
*  5
* 1 start = 1 count = 1
* 2 start = 3 count = 2
* 3 start = 6 count = 3
* coun
* */
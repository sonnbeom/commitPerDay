package com.example.demo.codingtest.test;


import java.util.*;
public class Main {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        long S = sc.nextLong();
        long sum = 0;
        int count = 0;
        for(int i=1; ;i++){
            sum += i;
            count = i;
            if(sum>S){
                break;
            }
        }
        System.out.println(count-1);
    }
}

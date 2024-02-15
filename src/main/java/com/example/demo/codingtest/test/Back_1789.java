package com.example.demo.codingtest.test;







import java.util.*;
public class Main {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        long S = sc.nextLong();
        long sum = 0L;
        int N = 0;

        for(int i =0; ; i++){
            sum += i;
            if(sum>S){
                N=i-1;
                break;
            }
        }System.out.println(N);
    }
}

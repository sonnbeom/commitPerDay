package com.example.demo.codingtest.baekjoon;

import java.util.*;
public class Silver2_16953 {
    static int count;
    static int impossible = -1;
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b= sc.nextInt();

        int result = minCount(a,b);
        if(result != impossible){
            System.out.println(count+1);
        }else{
            System.out.println(impossible);
        }
    }
    static int minCount(int start, int result) {
        while(result > start){
            if ((result - 1) % 10 == 0) {
                result = (result - 1) / 10;
                count ++;
            }else if (result % 2 == 0) {
                count ++;
                result = result / 2;
            }else{
                return impossible;
            }
        }
        if(start == result){
            return count+1;
        }else{
            return impossible;
        }
    }
}


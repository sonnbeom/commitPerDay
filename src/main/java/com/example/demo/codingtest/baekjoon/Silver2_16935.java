package com.example.demo.codingtest.baekjoon;

import java.util.*;
public class Main {
    static int count;
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        count = 0;
        int result = minCount(A,B);
        if(result == -1){
            System.out.print(-1);
        }else{
            System.out.print(count+1);
        }
    }
    static int minCount(int A, int B){
        while(A < B){
            if((B-1)%10==0){
                B = (B-1) / 10;
                count ++;
            }else if(B%2 == 0){
                B = B / 2;
                count++;
            }else{
                break;
            }
        }
        if(A==B){
            return count;
        }else{
            return -1;
        }
    }

}

package com.example.demo.codingtest;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Long num = sc.nextLong();
        /*
        * 1. 4,294,967,295가 최댓값이므로 Long 타입을 써줍니다.
        * 2. 공차를 1로 작은 숫자부터 더합니다
        * 3. 주어진 숫자보다 합이 클 경우 멈춥니다.
        * 4. 한번 더 더해지지 않을 경우 최대 갯수 N개로 자연수의 합S를 구현한 것이므로
        * 5. count에서 -1를 진행하고 출력합니다.
        * */
        Long comNum = 0L;
        int count = 0;
        for (int i = 1; ; i++) {
            if (comNum>num){
                break;
            }
            comNum += i;
            count++;
        }
        System.out.println(count-1);
        sc.close();
    }
}
/*
* 1234
* 9
* 1 2 3 4
* */
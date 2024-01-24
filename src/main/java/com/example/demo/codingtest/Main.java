package com.example.demo.codingtest;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int j = sc.nextInt();
        //스크린과 바구니를 배열로 생각하기 설명을 위해 적어놓은 것이니 screen과 basket은 지우셔도 됩니다.
        int[] screen = new int[n];
        int[] basket = new int[m];
        int left = 0;
        int right = left + m -1;
        // 주어진 사과의 위치(apple)와 바구니의 위치 차이(left 혹은 right)를 출력하기 위해 전역변수 설정
        int distance = 0;
        for (int i = 0; i < j; i++) {
            int apple = sc.nextInt()-1;
            if (left>apple){
                int diff = left-apple;
                left-=diff;
                right-=diff;
                distance += diff;
            } else if (apple>right) {
                int diff = apple-right;
                left += diff;
                right += diff;
                distance += diff;
            }
        }
        System.out.println(distance);
    }
}
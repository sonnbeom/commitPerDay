package com.example.demo.codingtest;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int a = 0;
        int b = 0;
        int c = 0;
        int rest = 0;

        if (t%10 != 0){
            System.out.println(-1);
        }else {
            //t가 300이 넘지 않는다면 0이 할당됩니다.
            a = t/300;
            //t가 300이 넘지 않는다면 t값이 그대로 t에 할당됩니다.
            t %= 300;
            //t가 60이 넘지 않는다면 0이 할당됩니다.
            b = t/60;
            //t가 60이 넘지 않는다면 t값이 그대로 t에 할당됩니다.
            t %= 60;
            //if문에서 10으로 나누어 떨어지는 정수임을 확인했기에 t에서 10만 나눠줍니다.
            c = t/10;
            System.out.println(a+" "+b+" "+c);
        }
    }
}
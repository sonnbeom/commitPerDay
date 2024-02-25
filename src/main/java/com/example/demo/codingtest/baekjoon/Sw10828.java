package com.example.demo.codingtest.baekjoon;

import java.util.*;
public class Main {
    static int count;
    static StringBuilder sb;
    static int[] stack;
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sb = new StringBuilder();
        stack = new int[n];
        count = 0;
        for(int i = 0; i < n; i++){
            String input = sc.next();
            if(input.equals("push")){
                int num = sc.nextInt();
                push(num);
            }else if(input.equals("pop")){
                int pop = pop();
                sb.append(pop).append("\n");
            }else if(input.equals("size")){
                sb.append(count).append("\n");
            }else if(input.equals("empty")){
                sb.append(empty()).append("\n");
            }else if(input.equals("top")){
                sb.append(top()).append("\n");
            }
        }
        System.out.print(sb);
    }
    static int pop(){
        if(count == 0){
            return -1;
        }
        else{
            int v = stack[count-1];
            stack[count-1] = 0;
            count--;
            return v;
        }

    }
    static int empty(){
        if(count == 0){
            return 1;
        }else{
            return 0;
        }
    }
    static int top(){
        if(count == 0){
            return -1;
        }else{
            return stack[count-1];
        }
    }
    static void push(int n){
        stack[count] = n;
        count++;
    }


}

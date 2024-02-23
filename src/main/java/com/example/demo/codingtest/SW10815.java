package com.example.demo.codingtest;

import java.util.*;
public class Main {
    public static void main(String[]args){
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        Map<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i < n; i++){
            int input = sc.nextInt();
            map.put(input, input);
        }
        int m = sc.nextInt();
        for(int i = 0; i < m; i++){
            int input = sc.nextInt();
            if(map.containsKey(input)){
                System.out.print(1+" ");
            }else{
                System.out.print(0+" ");
            }
        }
    }
}

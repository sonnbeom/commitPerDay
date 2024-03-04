package com.example.demo.codingtest.baekjoon;

import java.util.*;
public class Silver5_1316 {
    static Map<Character, Character> map;
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;

        for(int i = 0; i < n; i++){
            map = new HashMap<>();
            String input = sc.next();
            count += printCount(input);
        }
        System.out.print(count);
    }
    static int printCount(String input){
        int t = 0;
        for(int i = 0; i < input.length(); i++){
            char c = input.charAt(i);
            char a = '2';
            if(a == c){

            }else if(!map.containsKey(c)){
                map.put(c,c);
                a = c;
            }else{
                t ++;
            }
        }
        if(t == 0){
            return 1;
        }
        return 0;
    }
}

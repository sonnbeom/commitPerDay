package com.example.demo.codingtest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();

        StringTokenizer str1 = new StringTokenizer(s,"1");
        StringTokenizer str0 = new StringTokenizer(s,"0");

        int min =  Math.min(str1.countTokens(), str0.countTokens());

        System.out.println(min);
    }
}
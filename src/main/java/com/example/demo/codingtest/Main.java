package com.example.demo.codingtest;


import java.util.Scanner;

public class Main {
    static long arr[];
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        arr = new long[101];
        arr[1] = 1;
        arr[2] = 1;
        arr[3] = 1;

        for (int i = 0; i < n; i++) {
            int p = sc.nextInt();
            if (p<4){
                System.out.println(arr[p]);
            }else {
                long ans = pr(p);
                System.out.println(ans);
            }
        }
    }
    private static long pr(int p) {
        for (int i = 4; i <= p; i++) {
            arr[i] = arr[i-2] + arr[i-3];
        }
        return arr[p];
    }
}



//   A = An-2  An -3
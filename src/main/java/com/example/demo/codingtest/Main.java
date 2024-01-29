package com.example.demo.codingtest;


import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        int[] levelArr = new int[n];

        for (int i = 0; i < n; i++) {
            levelArr[i] = sc.nextInt();
        }

        int sum = 0;
        /* index가 0부터 시작하므로 n-1부터 시작합니다
        * diff<=0일 때 배열 i번째에서 i-1번째를 빼면 음수가 나옵니다. 이를 Math.abs()을 통해 절댓값으로 감쌉니다.
        * i-1번째가 i번째보다 최소 1이 작아야하므로 차이에 1을 더해줍니다.
        * i-1번째 숫자의 차이+1만큼을 빼주어 배열의 오름차순을 만듭니다.
        * */
        for (int i = n-1; i >= 1; i--) {
            int diff = levelArr[i] - levelArr[i-1];
            if (diff<=0){
                int num = Math.abs(diff)+1;
                sum += num;
                levelArr[i-1] -= num;
            }
        }
        System.out.println(sum);
    }
}
/*
* 5
* 5
* 5
*
* */
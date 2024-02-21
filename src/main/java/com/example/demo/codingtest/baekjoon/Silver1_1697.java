package com.example.demo.codingtest.baekjoon;


import java.util.*;
public class Main {
    static int N;
    static int K;
    static int[] visited;
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        K = sc.nextInt();
        visited = new int[100001];
        int result = bfs();
        System.out.print(result);
    }
    static int bfs(){
        Queue<Integer> queue = new LinkedList<>();
        queue.add(N);
        visited[N] = 1;

        while(!queue.isEmpty()){
            int tmp = queue.poll();
            if(tmp ==  K){
                return visited[tmp]-1;
            }
            if(tmp*2 <= 100000 && visited[tmp*2]==0){
                visited[tmp*2] = visited[tmp]+1;
                queue.add(tmp*2);
            }
            if(tmp-1 >= 0 && visited[tmp-1]==0){
                visited[tmp-1] = visited[tmp] + 1;
                queue.add(tmp-1);
            }
            if(tmp+1 <= 100000 && visited[tmp+1] == 0){
                visited[tmp+1] = visited[tmp] + 1;
                queue.add(tmp+1);
            }
        }return 0;
    }
}

package com.example.demo.codingtest.baekjoon;

import java.util.*;
public class Silver2_1260 {
    static ArrayList<Integer>[] arr;
    static boolean[] visit;
    //인접리스트
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nodeCount = sc.nextInt();
        int edgeCount = sc.nextInt();
        int startNode = sc.nextInt();
        visit = new boolean[nodeCount+1];
        arr = new ArrayList[nodeCount+1];

        for(int i =0; i<= nodeCount; i++){
            arr[i] = new ArrayList<>();
        }

        for(int i = 0; i<edgeCount; i++){
            int first = sc.nextInt();
            int second = sc.nextInt();
            arr[first].add(second);
            arr[second].add(first);
        }
        for(int i =1; i<=nodeCount; i++){
            Collections.sort(arr[i]);
        }

        DFS(startNode);

        visit = new boolean[nodeCount+1];
        System.out.println();

        BFS(startNode);
    }
    static void DFS(int startNode){
        visit[startNode] = true;
        System.out.print(startNode+" ");
        for(int nextNode : arr[startNode]){
            if(!visit[nextNode]){
                DFS(nextNode);
            }
        }
    }
    static void BFS(int startNode){
        visit[startNode] = true;
        Queue<Integer> queue= new LinkedList<>();
        queue.add(startNode);
        while(!queue.isEmpty()){
            startNode = queue.poll();
            System.out.print(startNode+" ");
            for(int nextNode: arr[startNode]){
                if(!visit[nextNode]) {
                    queue.add(nextNode);
                    visit[nextNode] = true;
                }
            }
        }
    }
}

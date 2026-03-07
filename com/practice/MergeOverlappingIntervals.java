package com.practice;

import java.util.ArrayList;
import java.util.Scanner;

public class MergeOverlappingIntervals {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int[][] arr = new int[m][2];
        System.out.println("Enter intervals!");
        for(int i = 0 ; i < m ; i++ ){
            for(int j = 0 ; j < 2 ; j++ ){
                arr[i][j] = sc.nextInt();
            }
        }
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0 ; i<m-1 ; i++){
            if(arr[i][1]>arr[i+1][0]){
                list.add(arr[i][0]);
                list.add(arr[i+1][1]);
                i++;
            }
            else {
                list.add(arr[i][0]);
                list.add(arr[i][1]);                
            }
        }
        if(list.get(list.size()-1)<arr[m-1][0]){
            list.add(arr[m-1][0]);
            list.add(arr[m-1][1]);
        }
        System.out.println(list);
        sc.close();
    }
}

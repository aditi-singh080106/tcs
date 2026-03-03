package com.practice;

import java.util.Scanner;

public class StudentPassMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] matrix = new int[n][m];
        for(int i = 0; i < n; i++){
            for(int j = 0 ; j < m ; j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        int count =0;
        for(int i = 0 ; i < n ; i++){
            int sum = 0;
            for(int j = 0 ; j < m ; j++){
                sum+=matrix[i][j];
            }
            sum/=m;
            if(sum>50) count++;
        }
        System.out.println(count);
        sc.close();
    }
}

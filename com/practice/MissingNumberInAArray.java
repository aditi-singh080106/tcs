package com.practice;

import java.util.Scanner;

public class MissingNumberInAArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr =  new int[n];
        int sum = 0;
        System.out.println("Enter elements :");
        for(int  i = 0 ; i < n ; i ++ ){
            arr[i] = sc.nextInt();
            sum+=arr[i];
        }
        System.out.println((((n+1)*n)/2)-sum);
        sc.close();
    }
}

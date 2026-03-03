package com.practice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class CrypticNumber {
    public static boolean isDivisibleBy7(int num){
        if(num%7==0) return true;
        return false;
    }
    public static boolean isNotDivisible5(int num){
        if(num%5!=0) return true;
        return false;
    }
    public static boolean isNotPalindrome(int num){
        // reverse the number 
        int sum = 0 , temp = num;
        while(temp!=0){
            sum*=10;
            int ld = temp%10;
            sum+=ld;
            temp/=10;
        }
        if(num!=sum) return true;
        return false;
    }
    public static boolean repeatingDigit(int num){
        HashSet<Integer> set = new HashSet<>();
        while(num!=0){
            int val = num%10;
            if(set.contains(val)) return false;
            else set.add(val);
            num/=10;
        }
        return true;
    }
    public static void main(String[] args) {
        // taking input
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter lower limit : ");
        int l = sc.nextInt();
        System.out.println("Enter upper limit");
        int r = sc.nextInt();
        int count = 0 ;
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i = l ; i <= r ; i++ ){
            if(isDivisibleBy7(i) && isNotDivisible5(i) && isNotPalindrome(i) && repeatingDigit(i)){
                count++;
                arr.add(i);
            }
        }
        if(count == 0 ) System.out.println(-1);
        else {
            System.out.println(count);
            System.out.println(arr);
        }
        sc.close();
        
    }
}

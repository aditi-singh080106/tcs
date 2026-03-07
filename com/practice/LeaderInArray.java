package com.practice;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class LeaderInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        Stack<Integer> st = new Stack<>();
        System.out.println("Enter elements in array");
        for(int i = 0 ; i  < n ; i++ ){
            nums[i]=sc.nextInt();
        }
        // using a max variable
        int max = Integer.MIN_VALUE;
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i = n-1 ; i >= 0 ; i-- ){
            if(max<nums[i]){
                max = nums[i];
                arr.add(nums[i]);
            }
        }
        for(int i = n-1 ; i >= 0 ; i-- ){
            if(st.isEmpty()){
                // for first case
                st.push(nums[i]);
            }
            else if(st.peek()<=nums[i]){
                st.push(nums[i]);
            }
        }
        System.out.println(st.size());
        for(int ele : st){
            System.out.print(ele+" ");
        }
        sc.close();
    }
}

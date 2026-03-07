package com.practice;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
public class LongestSubstringWithoutRepeatingCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        Set<Character> set = new HashSet<>();
        int left = 0 , maxLen = 0;
        //apprach 1
        for(int right = 0 ; right < s.length() ; right++){
            while(set.contains(s.charAt(right))){
                set.remove(s.charAt(left));
                left++;
            }
            set.add(s.charAt(right));
            maxLen = Math.max(maxLen,right-left+1);
        }
        
        System.out.println(maxLen);
        sc.close();
    }
}

package Arrays;

import java.util.Scanner;

public class MaximumValue {
    public static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number elements");
        int n = sc.nextInt();
        int[] nums = new int[n];
        int max = Integer.MIN_VALUE;
        System.out.println("Enter elements:");
        for(int i = 0 ; i < n ; i++){
            nums[i] = sc.nextInt();
            max = Math.max(max,nums[i]);
        }
        System.out.println("Maximum value is:"+max);
    }
}

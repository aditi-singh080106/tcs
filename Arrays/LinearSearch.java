package Arrays;

import java.util.Scanner;

public class LinearSearch {
    public static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number elements");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter elements:");
        for(int i = 0 ; i < n ; i++){
            nums[i] = sc.nextInt();
        }
        System.out.println("Enter target value:");
        int target = sc.nextInt();
        for(int i = 0 ; i < n ; i++ ){
            if(nums[i]==target){
                System.out.println("Element found at position : "+(i+1));
                break;
            }
        }
    }

    public static class SecondMaximum {
    }
}

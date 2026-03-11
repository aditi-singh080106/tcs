package Arrays;

import java.util.Scanner;

public class SwapPartOfArray {
    public static void swap(int[] nums , int st , int end){
        int i = st-1 , j = end -1 ;
        while(i<j){
            int temp = nums[i];
            nums[i++]=nums[j];
            nums[j--]=temp;
        }
    }
    public static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number elements");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter elements:");
        for(int i = 0 ; i < n ; i++){
            nums[i] = sc.nextInt();
        }
        System.out.println("Enter start point : ");
        int st = sc.nextInt();
        System.out.println("Enter end point : ");
        int end = sc.nextInt();
        if(st>0 && end <= n ) swap(nums,st,end);
        for(int ele : nums ){
            System.out.print(ele+" ");
        }
    }
}

package Arrays;

import java.util.Scanner;

public class SecondMaximum {
    public static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number elements");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        int max = Integer.MIN_VALUE , smax = Integer.MIN_VALUE ;
        for(int i = 0 ; i < n ; i++ ){
            if(nums[i]>max){
                smax=max;
                max=nums[i];
            }
            if(nums[i]>smax && nums[i] < max){
                smax=nums[i];
            }
        }
        System.out.println("Maximum is : "+max);
        System.out.println("Second maximum is : "+smax);
    }
}

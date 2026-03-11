package Arrays;

import java.util.Scanner;

public class PairSum {
    public static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number elements");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter elements:");
        for(int i = 0 ; i < n ; i++){
            nums[i] = sc.nextInt();
        }
        System.out.println("Enter the target :");
        int target = sc.nextInt();
        for(int i = 0 ; i < n ; i++ ){
            int rem = target - nums[i];
            boolean flag = false;
            for(int j = i+1 ; j <n ; j++){
                if(nums[j]==rem){
                    System.out.println("The pair is : "+nums[i]+" and "+nums[j]);
                    flag=true;
                }
                if(flag) break;
            }
            if(flag) break;
        }
    }
}

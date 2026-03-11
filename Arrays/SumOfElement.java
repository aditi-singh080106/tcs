package Arrays;

import java.util.Scanner;

public class SumOfElement {
    public static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number elements");
        int n = sc.nextInt();
        int[] nums = new int[n];
        int sum = 0;
        System.out.println("Enter elements:");
        for(int i = 0 ; i < n ; i++){
            nums[i] = sc.nextInt();
            sum+=nums[i];
        }
        System.out.println("Sum is : "+sum);
    }
}

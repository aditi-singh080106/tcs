package Arrays;

import java.util.Scanner;

public class StudentMarks {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of student:");
        int n = sc.nextInt();
        int[] marks = new int[n];
        System.out.println("Enter Marks of students : ");
        for(int i = 0 ; i < n ; i++ ){
            marks[i] = sc.nextInt();
        }
        System.out.println("Student pass nad fail marks and roll number:");
        for(int i = 0 ; i < n ; i++ ){
            if(marks[i]>35){
                System.out.println("Marks of the student is "+marks[i]);
            }
            else{
                System.out.println("Student roll number is "+(i+1));
            }
        }
    }
}

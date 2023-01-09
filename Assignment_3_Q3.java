package ITER;
import java.util.Scanner;
public class Assignment_3_Q3 {
    // Question 3

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter first number : ");
        int a=sc.nextInt();
        System.out.println("enter second number : ");
        int b=sc.nextInt();
        System.out.println("enter third number : ");
        int c=sc.nextInt();
        if(a>b && b>c){
            System.out.println("Decreasing");
        }
        else if(a<b && b<c) {
            System.out.println("Increasing");
        }
        else {
            System.out.println("Decreasing");
        }
    }
}

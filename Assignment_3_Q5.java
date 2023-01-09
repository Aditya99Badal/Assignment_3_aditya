package ITER;
import java.util.Scanner;
public class Assignment_3_Q5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a year");
        int a=sc.nextInt();
        if((a%4==0 && a%100!=0)||(a%400==0)){
            System.out.println("This year is a leap year");
        }
        else{
            System.out.println("This year is not a leap year");
        }
    }
}

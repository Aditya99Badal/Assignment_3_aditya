package ITER;
import java.util.Scanner;
public class Assignment_3_Q6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the amount of electricity consumed in units");
        int a=sc.nextInt();
        if(a<50){
            System.out.println(a*3);
        }
        else if(a<200){
            System.out.println((49*3.0)+((a-49)*4.8));
        }
        else if(a<400) {
            System.out.println((49 * 3.0) + (150 * 4.8) + ((a-199) * 5.8));
        }
        else{
            System.out.println((49 * 3.0) + (150 * 4.8) + (200 * 5.8) + ((a - 400) * 6.2));
        }
    }
}

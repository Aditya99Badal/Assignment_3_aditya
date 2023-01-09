package ITER;
import java.util.Scanner;
public class Assignment_3_Q4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int min=1;
        int max=9;
        int a=(int)(Math.random()*(max-min+1))+min;
        System.out.println("Enter user number: ");
        int b=sc.nextInt();
        int c=++b;
        if(a==b){
            System.out.println("You got it right");
        }else if((a==--b)||(a==++c)){
            System.out.println("Almost got it");
        }else{
            System.out.println("You got it wrong");
        }
        System.out.println("Computer guesses: "+a);
    }
}

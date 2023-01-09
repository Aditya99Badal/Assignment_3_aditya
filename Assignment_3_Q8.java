package ITER;
import java.util.Scanner;
public class Assignment_3_Q8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the point of x axis");
        double a=sc.nextDouble();
        System.out.println("enter the point of y axis");
        double b=sc.nextDouble();
        if(a<0 && b<0){
            System.out.println("("+a+","+b+")"+" is in quadrant III");
        }
        else if(a>0 &&b>0){
            System.out.println("("+a+","+b+")"+" is in quadrant I");
        }
        else if(a<0 && b>0){
            System.out.println("("+a+","+b+")"+" is in quadrant II");
        }
        else if(a>0 && b<0){
            System.out.println("("+a+","+b+")"+" is in quadrant IV");
        }
        else if(a==0){
            System.out.println("("+a+","+b+")"+" is on the y axis");
        }
        else{
            System.out.println("("+a+","+b+")"+" is on the x axis");
        }
    }
}

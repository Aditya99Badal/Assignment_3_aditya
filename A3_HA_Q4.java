package ITER;
import java.util.Scanner;
public class A3_HA_Q4 {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print(" Enter an Integer ");
            int num = sc.nextInt();
            System.out.println(" Is " + num + " divisible by 5 and 6 ? " + ((num % 5 == 0)
                    && (num % 6 == 0)));
            System.out.println(" Is " + num + " divisible by 5 and 6 ? " + ((num % 5 == 0)
                    || (num % 6 == 0)));
            System.out.println(" Is " + num + " divisible by 5 and 6 ? " + ((num % 5 == 0)
                    ^ (num % 6 == 0)));
            sc.close();
        }
    }

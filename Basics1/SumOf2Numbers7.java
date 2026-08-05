package Basics1;
import java.util.Scanner;
public class SumOf2Numbers7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter 1st number : ");
        float a=input.nextFloat();
        System.out.println("enter 2nd number : ");
        float b =input.nextFloat();
        float sum=a+b;
        System.out.println("sum is : "+sum);
    }
}

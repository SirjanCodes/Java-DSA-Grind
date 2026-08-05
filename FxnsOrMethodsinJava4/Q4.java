package FxnsOrMethodsinJava4;
//Q.Write a program to print the sum of two numbers entered by user by defining your own method.
import java.util.*;
public class Q4 {
    static double sum(double a,double b){
        double sum=a+b;
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter 1st number: ");
        double n1=sc.nextDouble();
        System.out.println("enter 2nd number ");
        double n2=sc.nextDouble();
        System.out.println("the sum of these 2 numbers is: "+sum(n1,n2));
    }
}
//rest easy/basic questions:-product of 2 numbers, circumference and area of circle, etc.
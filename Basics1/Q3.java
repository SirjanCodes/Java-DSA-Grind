package Basics1;
//Q.Calculate simple interest
import java.util.Scanner;
public class Q3 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter value of principle: ");
        double p=input.nextDouble();
        System.out.println("enter value of rate: ");
        double r=input.nextDouble();
        System.out.println("enter value of time: ");
        double t = input.nextDouble();
        double s=(p*r*t)/100;
        System.out.println("Simple Interest is: "+s);
    }
}

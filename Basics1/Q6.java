package Basics1;
//Q.Swap 2 numbers.
import java.util.Scanner;
public class Q6 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter 1st number: ");
        int a = input.nextInt();
        System.out.println("enter 2nd number: ");
        int b=input.nextInt();
        System.out.println(a);//before swapping
        System.out.println(b);
        //1st method:-using a variable
        int temp=a;
        a=b;
        b=temp;
        System.out.println(a);
        System.out.println(b);//after swapping
        //2nd method:-without using any variable
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println(a);
        System.out.println(b);
    }
}

package ConditionalsAndLoops2;
import java.util.Scanner;
public class Conditionals1 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter salary: ");
        int a=input.nextInt();
        if(a>75000){
            a=a+2000;
            System.out.println("salary after bonus is: "+a);
        }
        else{
            a+=1000;
            System.out.println("salary after bonus is: "+a);
        }
        System.out.println("enter amount: ");
        int b=input.nextInt();
        if(b>75000){
            b+=3000;
            System.out.println("salary after bonus is: "+b);
        }
        else if(b>50000){
            b+=2000;
            System.out.println("salary after bonus is: "+b);
        }
        else{
            b+=1000;
            System.out.println("salary after bonus is: "+b);
        }
    }
}

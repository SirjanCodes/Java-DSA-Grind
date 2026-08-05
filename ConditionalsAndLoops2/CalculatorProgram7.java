package ConditionalsAndLoops2;
import java.util.Scanner;
public class CalculatorProgram7 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter 1st number: ");
        double n1=input.nextDouble();
        System.out.println("enter 2nd number");
        double n2=input.nextDouble();
        System.out.println("enter operator: ");
        char ch=input.next().trim().charAt(0);
        if(ch=='+'){
            System.out.println(n1+n2);
        }
        if(ch=='-'){
            System.out.println(n1-n2);
        }
        if(ch=='*'){
            System.out.println(n1*n2);
        }
        if(ch=='/'){
            if(n2!=0){ //remember this:-just for more logic and deep understanding
                System.out.println(n1/n2);
            }
            else{
                System.out.println("not applicable");
            }
        }
        if(ch=='%'){
            System.out.println(n1%n2);
        }
        if(ch!='+' && ch!='-' && ch!='*' && ch!='/' && ch!='%'){ //write this for better deep understanding,&&
            System.out.println("invalid operator!!!");
        }
    }
}

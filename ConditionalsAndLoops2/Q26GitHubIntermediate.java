package ConditionalsAndLoops2;
//Q.Factorial Program
import java.util.Scanner;
public class Q26GitHubIntermediate {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter number: ");
        int n=input.nextInt();
        if(n<0){
            System.out.println("factorial is undefined");
            return;
        }
        int fact=1;
        for(int i=n;i>=1;i--){
            fact=fact*i;
        }
        System.out.println("factorial is: "+fact);
        //factorial of 0 is 1
    }
}

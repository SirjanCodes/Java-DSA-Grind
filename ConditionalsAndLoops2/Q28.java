package ConditionalsAndLoops2;
//Q.Find if a number is Palindrome or not.
import java.util.Scanner;
public class Q28 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter number: ");
        int n=input.nextInt();
        int num=n; //this we gotta store coz by the time loop finishes, n goes to 0 so output will be wrong
        int ans=0;
        while(n>0){
            int rem=n%10;
            n=n/10;
            ans=ans*10+rem;
        }
        if(num==ans){
            System.out.println("number is a palindrome");
        }
        else{
            System.out.println("number is not a palindrome");
        }
    }
}

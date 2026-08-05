package ConditionalsAndLoops2;
import java.util.Scanner;
public class ReverseNumber6 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter number: ");
        int n=input.nextInt();
        int ans=0;
        while(n>0){
            int rem=n%10;
            n=n/10;
            ans=ans*10+rem;
        }
        System.out.println(ans);
    }
}
//see dry run in register for better understanding
package ConditionalsAndLoops2;
//Q.Power program.
import java.util.Scanner;
public class Q27 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter number: ");
        int a=input.nextInt();
        System.out.println("enter power: ");
        int b=input.nextInt();
        int ans=1;
        for(int i=1;i<=b;i++){
            ans=ans*a;
        }
        System.out.println("answe is: "+ans);
    }
}

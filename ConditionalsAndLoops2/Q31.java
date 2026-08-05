package ConditionalsAndLoops2;
//Q.Leap year or not.
//remember 2 conditions:-divisible by 4 and if divisible by 100 then must be divisible by 400.
import java.util.Scanner;
public class Q31 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter year: ");
        int n=input.nextInt();
        if(n%4==0){
            System.out.println("this is a leap year");
        }
        else{
            System.out.println("this is not a leap year");
        }
        if(n%100==0){
            if(n%400==0){
                System.out.println("this is a leap year");
            }
        }
        else{
            System.out.println("this is not a leap year");
        }
    }
}

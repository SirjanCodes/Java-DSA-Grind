package ConditionalsAndLoops2;
/*Q.WAP to print sum of negative numbers,sum of positive even numbers and sum of positive odd numbers from a
 list of number entered by user. The list terminates when user enters 0*/
import java.util.Scanner;
/*Q.Print sum of negative numbers, sum of positive even numbers and also sum of positive odd numbers until
user enters 0*/
public class Q33 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int sum=0;
        int add=0;
        int plus=0;
        System.out.println("enter numbers: ");
        while(true){
            int n=input.nextInt();
            if(n==0){
                break;
            }
            if(n<0){
                sum=sum+n;
            }
            if(n>0 && n%2==0){
                add=add+n;
            }
            if(n>0 && n%2!=0){
                plus=plus+n;
            }
        }
        System.out.println("sum of negative number is: "+sum);
        System.out.println("sum of positive even numbers is: "+add);
        System.out.println("sum of positive odd numbers is: "+plus);
    }
}

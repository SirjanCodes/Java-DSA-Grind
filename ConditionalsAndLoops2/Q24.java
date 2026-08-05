package ConditionalsAndLoops2;
//Q.Take number inputs until user enters 0 and print the sum.
import java.util.Scanner;
public class Q24 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("start entering numbers: ");
        int sum=0;
        while(true){ //remember this
            int n=input.nextInt(); //this is inside so that we can write numbers again and again
            if(n==0){
                break; //stops program at given condition
            }
                sum=sum+n;
        }
        System.out.println("sum is: "+sum);
    }
}

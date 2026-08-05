package ConditionalsAndLoops2;
//Q.Perfect Number or not.
import java.util.Scanner;
public class Q30 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter number: ");
        int n=input.nextInt();
        int num=n;
        int sum=0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                sum=sum+i;
            }
        }
        if(sum==2*num){
            System.out.println("number is a perfect number"); //6,28,496
        }
        else{
            System.out.println("number is not a perfect number");
        }
    }
}

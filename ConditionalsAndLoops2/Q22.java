package ConditionalsAndLoops2;
//Q.Subtract product and sum of digits of an Integer.
import java.util.Scanner;
public class Q22 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter number: ");
        int n=input.nextInt();
        int sum=0;
        int product=1;
        while(n>0){
            int rem=n%10;
            sum=sum+rem;
            product=product*rem;
            n=n/10; //dont forget this,no silly mistake again and again
        }
        int ans=product-sum;
        System.out.println(ans);
    }
}

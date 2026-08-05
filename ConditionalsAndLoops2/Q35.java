package ConditionalsAndLoops2;
//Q.HCF of 2 numbers.
import java.util.Scanner;
public class Q35 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter 1st number: ");
        int n1=input.nextInt();
        System.out.println("enter 2nd number: ");
        int n2=input.nextInt();
        int min=Math.min(n1,n2);
        while(true){ //or we can use, while(min>0) for deeper calculations
            if(n1%min==0 && n2%min==0){ //just opposite logic of lcm
                System.out.println("hcf of the 2 number is: "+min);
                break;
            }
            min--;
        }
    }
}

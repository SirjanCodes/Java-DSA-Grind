package ConditionalsAndLoops2;
import java.util.Scanner;
public class CountingOccurences5 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter number: ");
        int n=input.nextInt(); //45536
        System.out.println("enter the integer you want the count of: ");
        int x=input.nextInt(); //5
        int count=0;
        while(n>0){
            int rem=n%10; //last digit
            if(rem==x){
                count++;
            }
            n=n/10; //np silly mistake
        }
        System.out.println("count of the number "+x+" is: "+count);
    }
}
//see dry run in register for better understanding
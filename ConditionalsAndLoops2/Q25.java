package ConditionalsAndLoops2;
//Q.Take inputs till user enter 0 and print the largest number.
import java.util.Scanner;
public class Q25 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("start entering numbers: ");
        int max=0;
        while(true){
            int n=input.nextInt();
            if(n==0){
                break;
            }
            if(n>max) { //simple logic
                max=n;
            }
        }
        System.out.println("largest number is: "+max);
    }
}

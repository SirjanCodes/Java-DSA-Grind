package Basics1;
//Q.Print largest number out of 2 numbers.
import java.util.Scanner;
public class Q4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter 1st number: ");
        int a = input.nextInt();
        System.out.println("enter 2nd number: ");
        int b=input.nextInt();
        if(a==b){
            System.out.println("both numbers are equal");
        }
        if(a>b){
            System.out.println("1st number is greater than 2nd number");
        }
        if(b>a){
            System.out.println("2nd number is greater than 1st number");
        }
    }
}

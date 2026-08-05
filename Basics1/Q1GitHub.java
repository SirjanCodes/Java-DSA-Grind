package Basics1;
//Q.Print whether number is even or odd
import java.util.Scanner;
public class Q1GitHub {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter number: ");
        int a = input.nextInt();
        if(a%2==0){
            System.out.println("number is even");
        }
        else{
            System.out.println("number is odd");
        }
    }
}

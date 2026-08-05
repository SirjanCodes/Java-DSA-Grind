package FxnsOrMethodsinJava4;
//Q.Write a program to print the factorial of a number by defining a method named 'Factorial'.
import java.util.*;
public class Q6 {
    static void factorial(int n){
        if(n<0){
            System.out.println("the facorial of this number is undefined");
            return;
        }
        int fact=1;
            for (int i = n; i >= 1; i--) {
                fact = fact * i;
            }
        System.out.println("the factorial of this number is: "+fact);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        factorial(0);
        //remember factorial of 0 is 1
    }
}

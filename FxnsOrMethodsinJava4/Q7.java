package FxnsOrMethodsinJava4;
//Q.Write a function to find if a number is a palindrome or not. Take number as parameter.
import java.util.*;
public class Q7 {
    static void check(int n){
        int n1=n; //use this to avoid destroying the evidence as this happens in several codes :- armstrong
        int ans=0;
        while(n1>0){
            int rem=n1%10;
            n1=n1/10;
            ans=ans*10+rem;
        }
        System.out.println("the reverse of this number is: "+ans);
        if(ans==n){
            System.out.println("this number is a palindrome");
        }
        else{
            System.out.println("this number is not a palindrome");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        check(7997);
    }
}

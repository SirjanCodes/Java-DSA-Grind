package FxnsOrMethodsinJava4;
//Q.Define a program to find out whether a given number is even or odd.
import java.util.*;
public class Q2 {
    static void check(int n){
        if(n%2==0){
            System.out.println("this is an even number");
        }
        else{
            System.out.println("this is an odd number");
        }
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        check(0); //or we could assign the value in the starting, remember 0 is an even number
    }
}

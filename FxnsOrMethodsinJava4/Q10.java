package FxnsOrMethodsinJava4;
//Q.Write a function that returns the sum of first n natural numbers.
import java.util.*;
public class Q10 {
    static void natural(int n){
        int sum=0;
        for(int i=1;i<=n;i++){ //for whole number:-i=0
            sum=sum+i;
        }
        System.out.println("the sum of first "+n+"natural numbers is: "+sum);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        natural(5); //1+2+3+4+5
    }
}

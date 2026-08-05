package FxnsOrMethodsinJava4;
//Q.Write a function that returns all prime numbers between two given numbers.
import java.util.*;
public class Q9 {
    static void prime(int a,int b){
        for(int i=a;i<=b;i++){
            if(i<=1){ //no silly mistake, dont forget this coz PM starts from 2
                continue; //this keyword means to skip the given condition nd move on
            }
            int j; //here, j works as c in the prime number question, just like c=2
            for(j=2;j<i;j++){
                if(i%j==0){ //same logic
                    break;
                }
            }
            if(i==j){ //logic for printing, same as we did previously, just way of writing is different
                System.out.println(i);
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the first number: ");
        int n1=sc.nextInt();
        System.out.println("enter the second number: ");
        int n2=sc.nextInt();
            prime(n1, n2);
    }
}

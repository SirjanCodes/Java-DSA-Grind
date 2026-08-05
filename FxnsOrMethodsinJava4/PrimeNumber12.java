package FxnsOrMethodsinJava4;
import java.util.*;
public class PrimeNumber12 {
    static void prime(int n) {
        if(n<2){ //prime number starts from 2
            System.out.println("this is not a prime number");
            return; //IMP:-this plays a very big role:-whenever u think infinite loop can be there just use this
        }
       int c=2;
        while(c*c<=n){ //logic:-square root
            if(n%c==0){
                System.out.println("this is not a prime number");
                return;
            }
           c++;
        }
        System.out.println("this is a prime number");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number: ");
        int n=sc.nextInt();
        prime(n);
    }
}

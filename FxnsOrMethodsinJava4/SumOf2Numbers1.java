package FxnsOrMethodsinJava4;
import java.util.Scanner;
public class SumOf2Numbers1 {
    static void sum(){ /*again as we know static is used to use this method in main without making its object
    ,void is the return type*/
        Scanner input=new Scanner(System.in); //iske andrr hi ye likhna pdega vrrna input nhi le payenge
        System.out.println("enter 1st number: ");
        double n1=input.nextDouble();
        System.out.println("enter 2nd number: ");
        double n2=input.nextDouble();
        double sum=n1+n2;
        System.out.println("the sum of the 2 number is: "+sum);
    }
    public static void main(String[] args) {
        sum(); //calling the fxn, we call fxns as methods in java
    }
}
/*or we can do in basic style also:some initial part like taking input in main and other in method
also we can do this using return type int as well*/
package Basics1;
//Q.Currency in Rs to USD.
import java.util.Scanner;
public class Q5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter amount in rs: ");
        double r = input.nextDouble();
        System.out.println("enter current exchange rate: ");
        double c = input.nextDouble();
        double d = r/c; //formula:-Rs=USD*current exchange rate
        System.out.println("amount in dollars is: "+d);
    }
}

package Basics1;
//Q.Armstrong number or not.
import java.util.Scanner;
public class Q9 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter number: ");
    int n=input.nextInt();
    int n1=n; //backups are made for no complications and desired output
    int n2=n;
    int digits=0;
    while(n1>0){ //for number of digits to use in power
        digits++;
        n1=n1/10;
    }
    int armsum=0;
    while(n2>0){ //for sum
        int rem=n2%10;
        armsum=armsum + (int) Math.pow(rem,digits); //remember syntax:-here,(int) Math.pow(base,exponent)
        n2=n2/10;
    }
    if(armsum==n){
        System.out.println("number is an armstrong number"); //1634
    }
    else{
        System.out.println("number is not an armstrong number");
    }
    }
}
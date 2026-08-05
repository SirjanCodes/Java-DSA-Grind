package ConditionalsAndLoops2;
//Q.Print all factors of a number.
import java.util.Scanner;
public class Q23 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter number: ");
        int n=input.nextInt();
        for(int i=1;i<=n;i++){
            if(n%i==0){
                System.out.println(i);
            }
        }
    }
}

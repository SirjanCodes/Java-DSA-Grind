package ConditionalsAndLoops2;
import java.util.Scanner;
public class Loops2 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        for(int i=1;i<=10;i++){
            System.out.println("hello world");
        }
        System.out.println("enter number: ");
        int n=input.nextInt();
        for(int i=1;i<=n;i++){
            System.out.println(i);
        }
        int i=1;
        while(i<=5){ //print numbers from 1 to 5 using while loop
            System.out.println(i);
            i++;
        }
        int a=1;
        do{ //first 'do' will be executed then while condition
            System.out.println("hello world");
        }
        while(a!=1);
    }
}

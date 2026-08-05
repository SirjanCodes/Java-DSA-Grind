package ConditionalsAndLoops2;
import java.util.Scanner;
public class LargestOf3Numbers3 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter 1st number: ");
        int a=input.nextInt();
        System.out.println("enter 2nd number: ");
        int b=input.nextInt();
        System.out.println("enter 3rd number: ");
        int c=input.nextInt();
        //1st method
       if(a>=b && a>=c){
            System.out.println("a is the greatest");
        }
        else if(b>=a && b>=c){
            System.out.println("b is the greatest");
        }
        else{
            System.out.println("c is the greatest");
        }
        //2nd method using 3rd variable
        int max=a;
        if(b>max){
            max=b; //no silly mistake
        }
        if(c>max){ //else if use mtt krna vrrna answer jidhar condition milegi pehli,udhr hi rukk jayega
            max=c;
        }
        System.out.println(max);
        //3rd method
        System.out.println(Math.max(c,Math.max(a,b)));
    }
}

package FxnsOrMethodsinJava4;
/*Q.Define two methods to print the maximum and the minimum number respectively among three numbers entered
by the user*/
import java.util.*;
public class Q1GitHub {
    static void max(int a,int b,int c){
        int max=Math.max(a,b);
        System.out.println("maximum number is: "+Math.max(max,c));
    }
    static void min(int a,int b,int c){
        int min=Math.min(a,b);
        System.out.println("minimum number is: "+Math.min(min,c));
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter 1st number: ");
        int a=sc.nextInt();
        System.out.println("enter 2nd number: ");
        int b=sc.nextInt();
        System.out.println("enter 3rd number: ");
        int c=sc.nextInt();
        max(a,b,c);
        min(a,b,c);
        //can be solved by other 2 methods too
    }
}

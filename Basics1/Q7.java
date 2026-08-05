package Basics1;
//Q.Print fibonacci series upto n numbers.
import java.util.Scanner;
public class Q7 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        //0,1,1,2,3,5,8,13,.......,n
        System.out.println("enter nth term: ");
        int n=input.nextInt();
        int a=0;
        int b=1;
        for(int i=1;i<=n;i++){ //i=1 to get desired output
            System.out.println(a+" "); /*ye islie aaya starting mai jis sey a ki value start mai 0 rehke firr
            update hoti rahe and wapas loop laggne pe print hoti rahe*/
            int nextTerm=a+b; //logic
            a=b;
            b=nextTerm;
        }
    }
}
//see dry run in register for better understanding
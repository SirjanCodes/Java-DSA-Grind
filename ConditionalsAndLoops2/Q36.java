package ConditionalsAndLoops2;
//Q.LCM of 2 numbers.
import java.util.Scanner;
public class Q36 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter 1st number: "); //306
        int n1 = input.nextInt();
        System.out.println("enter 2nd number: "); //657
        int n2 = input.nextInt();
        int max=Math.max(n1,n2);
        while(true){
            if(max%n1==0 && max%n2==0){ //see logic
                System.out.println("lcm of the 2 number is: "+max );
                break;
            }
            max++;
        }
    }
}

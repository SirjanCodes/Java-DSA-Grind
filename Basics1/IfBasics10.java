package Basics1;
import java.util.Scanner;
public class IfBasics10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        if(true){
            System.out.println("hello world");
        }
        if(false){
            System.out.println("alright"); //not be printed as we are already saying its false
        }
        System.out.println("enter number: ");
        int a = input.nextInt();
        if(a>0){
            System.out.println("phuck");
        }
    }
}

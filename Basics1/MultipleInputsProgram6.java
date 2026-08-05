package Basics1;
import java.util.Scanner;
public class MultipleInputsProgram6 {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        System.out.println(a);
        String name = input.next();
        System.out.println(name);
        float marks=input.nextFloat();
        System.out.println(marks);
        char ch=input.next().trim().charAt(0); //remember syntax:-trim()
        System.out.println(ch);
    }
}

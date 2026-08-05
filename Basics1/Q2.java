package Basics1;
//Q.Print a greeting msg for a particular name.
import java.util.Scanner;
public class Q2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter name: ");
        String name = input.nextLine();
        System.out.println("Namaste "+name);
    }
}

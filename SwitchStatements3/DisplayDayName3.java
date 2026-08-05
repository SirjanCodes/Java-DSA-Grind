package SwitchStatements3;
import java.util.Scanner;
public class DisplayDayName3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter number: ");
        int n = input.nextInt();
        switch (n) { //enhanced/advanced switch syntax:
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");
            default -> System.out.println("please enter a valid number between 1 and 7");}
        //we can also use if-else if:
        /*if (n == 1) {
            System.out.println("Monday");
        } else if (n == 2) {
            System.out.println("Tuesday");
        } else if (n == 3) {
            System.out.println("Wednesday");
        } else if (n == 4) {
            System.out.println("Thursday");
        } else if (n == 5) {
            System.out.println("Friday");
        } else if (n == 6) {
            System.out.println("Saturday");
        } else if (n == 7) {
            System.out.println("Sunday");
        } else {
            System.out.println("please enter a valid number between 1 and 7");
        }*/
    }
}

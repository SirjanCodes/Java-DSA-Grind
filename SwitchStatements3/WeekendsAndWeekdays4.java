package SwitchStatements3;
import java.util.Scanner;
public class WeekendsAndWeekdays4 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter day: ");
        String day=input.nextLine();
        switch (day){ //using advanced switch
            case "Monday","Tuesday","Wednesday","Thursday","Friday" -> System.out.println("this is a weekday");
            case "Saturday","Sunday" -> System.out.println("this is a weekend");
            default -> System.out.println("please enter a valid day");
        }
    }
}

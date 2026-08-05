package SwitchStatements3;
import java.util.Scanner;
public class DescribeFruit2 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter fruit: ");
        String fruit=input.nextLine();
        switch(fruit){ //remember syntax:-case,break,default(dont forget specially this)
            case "apple":
                System.out.println("Red fruit");
                break;
            case "orange":
                System.out.println("same name as its colour");
                break;
            case "mango":
                System.out.println("king of all the fruits");
                break;
            default:
                System.out.println("please enter a valid fruit");
        }
    }
}

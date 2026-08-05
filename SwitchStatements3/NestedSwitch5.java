package SwitchStatements3;
import java.util.Scanner;
public class NestedSwitch5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter id: ");
        int empId=sc.nextInt();
        System.out.println("enter department: ");
        String department=sc.next();
        switch(empId){
            case 1:
                System.out.println("Sirjan Singh Bhalla");
                break;
            case 2:
                System.out.println("Aditya Chaurasia");
                break;
            case 3:
                System.out.println("Shorya Tyagi"); //dont forget to write statement of first switch
            switch(department){ //see syntax of enhanced switch once
                case "IT":
                    System.out.println("IT Department");
                    break;
                case "Management":
                    System.out.println("Management Department");
                    break;
                default:
                    System.out.println("please enter a valid department");
                    break;
            }
            break; //dont forget this, we cant put this before nested switch coz then it will be unreachable
            default:
                System.out.println("please enter a valid id");
                break;
        }
    }
}

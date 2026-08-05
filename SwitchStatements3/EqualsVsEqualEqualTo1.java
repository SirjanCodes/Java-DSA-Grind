package SwitchStatements3;
import java.util.Scanner;
public class EqualsVsEqualEqualTo1 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String a="Mango";
        String b="Mango";
        String c="Apple";
        String d=input.nextLine();
        System.out.println(a==b);
        System.out.println(a==c);
        if(d=="Strawberry"){ //this will not work, strictly for strings only
            System.out.println("alright");
        }
        if(d.equals("Strawberry")){ //this will work, strictly for strings only
            System.out.println("ok");
        }
    }
}

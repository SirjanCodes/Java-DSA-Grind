package FxnsOrMethodsinJava4;
import java.util.Scanner;
public class Greeting2 {
    static void greet(){
        Scanner input=new Scanner(System.in);
        System.out.println("enter name: ");
        String name=input.nextLine();
        System.out.println("नमस्ते "+name);
    }
    public static void main(String[] args) {
greet();
    }
}

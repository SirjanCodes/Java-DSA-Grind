package Basics1; //Basics is an identifier
import java.util.Scanner;
public class LiteralsAndIdentifiers5 { //name of this java class is an identifier
    public static void main(String[] args) { //main() is an identifier
        Scanner input = new Scanner(System.in);
        int a = 10; //here 'a' is identifier and 10 is literal
        int b=244_000_000; //also comma cant be used here so we use _ to print high number(if required)
        System.out.println(b);
    }
}

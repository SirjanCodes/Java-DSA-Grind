package Basics1;
import java.util.Scanner; //Scanner is present in this package:-java.util
public class Input2 {
    public static void main(String [] args){
        Scanner input=new Scanner(System.in); /*Scanner is a class which helps us take input using input variable
    by making its object,just like s.out, s.in is there which helps us take input from the keyboard
    ,we can take input from file too:-System.out.println(FileInputStream);
    ,for better understanding, hold control and see each of its working*/
        System.out.println(input.nextInt()); //see syntax for integer
        System.out.println(input.next()); //for String
        System.out.println(input.nextLine()); //for full String
    }
}

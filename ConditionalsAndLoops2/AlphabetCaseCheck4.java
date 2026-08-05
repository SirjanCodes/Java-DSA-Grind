package ConditionalsAndLoops2;
import java.util.Scanner;
public class AlphabetCaseCheck4 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter alphabet: ");
        char ch=input.next().trim().charAt(0); //trim():-to remove extra space before characters
        String name="Sirjan";
        System.out.println(name.charAt(2)); //just see once working of this
        if(ch>='a' && ch<='z'){ //with numbers also we can do like below or vice versa or both numbers or letters
            System.out.println("case is lower case");
        }
        else if(ch>=65 && ch<=90){ //+25
            System.out.println("case is upper case");
        }
        else{
            System.out.println("undefined ");
        }
    }
}


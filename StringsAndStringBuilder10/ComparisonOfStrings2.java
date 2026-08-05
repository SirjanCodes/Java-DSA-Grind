package StringsAndStringBuilder10;
import java.util.*;
public class ComparisonOfStrings2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a="Sirjan";
        String b="Sirjan";
        System.out.println(a==b); /*'==' is a comparator which tells if both reference variables are pointing
        to the same object(T/F), which is true in this case due to the object present in String Pool*/
        String c=new String("Sirjan"); /*to create different objects of same value:-new keyword:-
        creates new objects outside the String Pool inside the heap, but we dont use this much coz we wanna
        utilize the String Pool*/
        System.out.println(a==c); //here, false coz both are different, one inside String Pool, one not
        System.out.println(a.equals(c)); /*here, true coz .equals() method only cares about the value, not its
        position or something else*/
    }
}

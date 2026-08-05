package StringsAndStringBuilder10;
import java.util.*;
public class Operators5 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println('a'+'b'); //ASCII Values
        System.out.println("a"+"b"); /*String, '-'(minus) cannot be used in Strings, only used in primitives,
        whereas '+' operator is also used for primitives only or if at least one String object is present and
        this + operator is intentionally overloaded in Strings in Java for their concatenation*/
        System.out.println("a"+'b');
        System.out.println('a'+"b");
        System.out.println((char)('a'+3)); //Type Casting
        System.out.println("a"+1); //basic thing:-integer will be converted to Integer which will call toString()
        System.out.println("Kunal"+new ArrayList<>());
        /*simple logic:-if its a string then its value will be added to the output, if object:-toString() method
        to convert them into string and then print*/
        System.out.println("Kunal"+new Integer(69));
       /* System.out.println(new ArrayList<>()+new Integer(70)); //error:-plus can only be used with primitives
       or there should be atleast one object of String DT, just like below:-*/
        System.out.println(" "+new ArrayList<>()+new Integer(70));
        //OR:-
        System.out.println(new ArrayList<>()+" "+new Integer(70));
    }
}

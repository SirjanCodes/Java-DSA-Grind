package StringsAndStringBuilder10;
import java.util.*;
public class Output3 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println(56); /*internal working for printing:-printStream uses "valueOf" which calls
        toString() method for any DT:- return null or .toString():-to convert any value to string and then print
        it, hold control and press on each sout and see its whole working ,these are present in language package
        made by developers to make our lives easier and understand better*/
        System.out.println("Kunal");
        System.out.println(new int[]{2,3,4,5,6,7}); //object:-curently using the inbuilt toString method
        System.out.println(Arrays.toString(new int[]{2,3,4,5,6,7})); /*now using the Arrays toString() method
         made by us*/
        String a=null; //toString() method:-directly returning null, default value of a String
        System.out.println(a);
        //understaning using wrapper class:-
        Integer num=new Integer(69);
        System.out.println(num.toString()); //internally this toString() method is used to print anything
        System.out.println(num);
    }
}

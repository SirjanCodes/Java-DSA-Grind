package StringsAndStringBuilder10;
import java.util.*;
public class Basics1 {
    //String:-collection of characters, cannot be modified/changed:-immutable behaviour(for security reasons)
    public static void main(String[] args) { /*command line arguments(whatever we r writing in java terminal
    , like filename and all) are stored in this String of arguments*/
            Scanner sc = new Scanner(System.in);
        String name= "Sirjan"; /*here, String:-DT, name:-reference variable & "Sirjan":-object of String type.
        String starts from capital S:-everything starting with a capital letter is a class, so String is a class
        , String Class:-grp of properties and fxns*/
        String word=sc.next();
        System.out.println(word);
        String city=sc.nextLine();
        System.out.println(city);
        String a = "Sirjan";
        System.out.println(a);
        a="Singh"; /*here, we didnt change or modify the object, we created a new one, previous value will go
         to garbage*/
        System.out.println(a);
    }
}

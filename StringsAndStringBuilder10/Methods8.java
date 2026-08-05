package StringsAndStringBuilder10;
import java.util.*;
public class Methods8 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter the string: ");
        String word=input.nextLine();
        //basic methods, more can be used
        System.out.println(Arrays.toString(word.toCharArray())); //converts to character array
        System.out.println(word.charAt(3));
        System.out.println(word.indexOf('i'));
        System.out.println(word.toLowerCase());
        System.out.println(word.strip()); //removes the extra space if there at start or/and end of the String
        System.out.println(Arrays.toString(word.split(" "))); //splits the String after condition we put in
    }
}

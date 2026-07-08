package LinearSearch6;
import java.util.*;
public class SearchInString2 {
    static void search(String str,char ch){
        if(str.length()<=0){
            System.out.println("please enter a valid string");
        }
       for(int i=0;i<str.length();i++){ //remember String length syntax
           if(str.charAt(i)==ch){ //basic syntax silly mistake
               System.out.println("character is found at the index: "+i);
               return;
           }
       }
        System.out.println("character is not present in the String");
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter the string: ");
        String str=input.nextLine();
        System.out.println("enter the character to find in the String: ");
        char ch=input.next().trim().charAt(0);
        search(str,ch);
    }
}

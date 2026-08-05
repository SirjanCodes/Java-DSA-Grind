package Basics1;
//Q.Find whether string is palindrome or not.
import java.util.Scanner;
public class Q8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter a word: ");
        String word=input.nextLine().toLowerCase(); //remember this:-so that case problem doesnt occur
        int start=0;
        int end=word.length()-1; //word.length():-size of the string
        while(start<end){
            if(word.charAt(start)!=word.charAt(end)){ //dont do silly mistake
                break;
            }
            start++;
            end--;
        }
        if(start>=end){ /*>= is used such that when we cross the paths without any break
        for eg:-abba, 1st:-start and end=0,3 then 1,2 then at 2,1 ,condition is true and crossing is done*/
            System.out.println("String is a palindrome");
        }
        else{
            System.out.println("String is not a palindrome");
        }
    }
}
//In String, we also use indexOf():-searches the string for the letter:-pangram problem
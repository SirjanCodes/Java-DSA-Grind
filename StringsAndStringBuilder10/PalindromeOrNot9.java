package StringsAndStringBuilder10;
import java.util.*;
public class PalindromeOrNot9 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter the string: ");
        String word=input.nextLine().trim().toLowerCase();
        int start=0;
        int end=word.length()-1;
        while(start<end){
            if(word.charAt(start)!=word.charAt(end)){
                System.out.println("the string is not a palindrome string");
                break;
            }
            //no silly mistake;-dont forget these:-
            start++;
            end--;
        }
        if(start>=end){
            System.out.println("the string is a palindrome string");
        }
    }
}
/*other logic/simpler if understood:-
class Solution {
    public boolean isPalindrome(String s) {
        for(int i=0;i<=s.length()/2;i++){
            if(s.charAt(i)!=s.charAt(s.length()-i-1)){ //comparing both ends step by step by compressing
                return false;
            }
        }
        return true;
    }
}
 */
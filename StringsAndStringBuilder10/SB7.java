package StringsAndStringBuilder10;
import java.util.*;
public class SB7 { //we didnt name as StringBuilder coz there will be error as its already a class
    public static void main(String[] args) {
        //StringBuilder Class is used to create objects which we can change/modify instead of wasting space
        Scanner input= new Scanner(System.in);
        StringBuilder builder = new StringBuilder(); //syntax
        for(int i=0;i<26;i++){
            char ch=(char)('a'+i);
            builder.append(ch); //remember syntax to add in StringBuilder, many other fxns are there to use
            builder.reverse();
        }
        System.out.println(builder); /*difference from String here is that no unnecessary space is wasted while
        creating new object and deleting previous ones continuously, therefore this is mutable unlike Strings*/
        //OR
        System.out.println(builder.toString());
    }
}

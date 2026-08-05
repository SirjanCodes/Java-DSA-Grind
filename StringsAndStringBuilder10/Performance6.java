package StringsAndStringBuilder10;
import java.util.*;
public class Performance6 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String word=" ";
        for(int i=0;i<26;i++){ //see once, basic logic
            char ch=(char)('a'+i);
            System.out.println(ch);
            word=word+ch; /*after every iteration,:-eg:-i=0:-word="a",i=1:-"ab",i=2:-"abc"........till i=25,
           new object is created(coz Strings cant be modified) & previous ones are thrown into the garbage, so
           there is so much wastage of space , T.C.:-O(N^2):-very bad performance*/
            //to fix this :- StringBuilder Class is used to create objects which we can change/modify
        }
        System.out.println(word);
    }
}

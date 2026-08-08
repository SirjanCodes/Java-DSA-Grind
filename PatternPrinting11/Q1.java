package PatternPrinting11;
//nobody really asks patterns but these are just for logic building and implementing the things we've learnt
import java.util.*;
public class Q1 {
    //*****
    //*****
    //*****
    //*****
    //*****
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //or take input of rows and columns if u want
        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
/*Basic Method for every Pattern:-
1)number of lines=number of rows(outer loop).
2)get the logic for  number of columns accordingly.
3)what to print:-eg:-*,1,2,etc.

For More practice, go to the kunal kushwaha github and there are many questions for various patterns.*/
package PatternPrinting11;
import java.util.*;
public class Q8 {
    //        *
    //       ***
    //      *****
    //     *******
    //    *********
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        for(int i=1;i<=5;i++){
            for(int k=1;k<=5-i;k++){ //leading spaces (k) from the start
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("* "); //this space will be added so that the particular pattern can be printed
            }
            System.out.println(" ");
        }
    }
}

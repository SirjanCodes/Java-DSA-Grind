package PatternPrinting11;
import java.util.*;
public class Q5 {
    //    *
    //    **
    //    ***
    //    ****
    //    *****
    //    ****
    //    ***
    //    **
    //    *
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=5; //size
        for(int i=1;i<=2*n-1;i++){ //till 9, i is rows,j is columns and k is total columns in rows
            int k;
            if(i<=n){ //basic normal logic for the first top half
                k=i;
            }
            else{
                k=2*n-i; //logic for the bottom half after the 5th row
            }
            for(int j=1;j<=k;j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}

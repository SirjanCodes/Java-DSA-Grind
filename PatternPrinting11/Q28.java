package PatternPrinting11;
import java.util.*;
public class Q28 {
    //         *
    //        * *
    //       * * *
    //      * * * *
    //     * * * * *
    //      * * * *
    //       * * *
    //        * *
    //         *
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=5;
        for(int i=1;i<=2*n-1;i++){
            int k;
            int totalcolsinrows;
            if(i<=n){
                for(k=1;k<=5-i;k++){
                    System.out.print(" ");
                }
                for(int j=1;j<=i;j++){
                    System.out.print("* ");
                }
                System.out.println(" ");
            }
            else{ //can be solved using this else logic for the reverse pattern one
                for(k=1;k<=i-5;k++){
                    System.out.print(" ");
                }
                for(int j=1;j<=2*n-i;j++){
                    System.out.print("* ");
                }
                System.out.println(" ");
            }
        }
    }
}

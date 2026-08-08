package PatternPrinting11;
import java.util.*;
public class Q4 {
    //1
    //12
    //123
    //1234
    //12345
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<5;i++){
            for(int j=1;j<=i+1;j++){
                System.out.print(j);
            }
            System.out.println(" ");
        }
    }
}

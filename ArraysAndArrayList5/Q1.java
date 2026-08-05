package ArraysAndArrayList5;
/*Q.Create an empty integer array of size 5. Use a for loop and Scanner to let the user type in 5 numbers.
Then, use an enhanced for loop (or a standard one) to print them all out.*/
import java.util.*;
public class Q1 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int arr [] = new int [5];
        System.out.println("enter the numbers: ");
        for(int i=0;i<arr.length;i++){
            arr[i]=input.nextInt();
        }
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}

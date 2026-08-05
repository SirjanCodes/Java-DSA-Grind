package ArraysAndArrayList5;
/*Q.Hardcode an array with random numbers. Ask the user to input a "target" number. Loop through the array—
if you find the target, print "Found it at index [i]". If the loop finishes and you didn't find it, print
"Not in the array".*/
import java.util.*;
public class Q3 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("enter size of array: ");
        int n=input.nextInt();
        int arr[]=new int[n];
        System.out.println("enter elements in the array");
        for(int i=0;i<n;i++){
            arr[i]=input.nextInt();
        }
        System.out.println("Array is: "+Arrays.toString(arr));
        System.out.println("enter the target element you want to find: ");
        int x=input.nextInt();
        for(int i=0;i<n;i++){
            if(x==arr[i]){
                System.out.println("target element is found at index: "+i);
                return;
            }
        }
        System.out.println("target element is not present in the array ");
    }
}

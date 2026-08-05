package ArraysAndArrayList5;
//Q.Create an array of random numbers. Loop through it and find the absolute largest number in the array.
import java.util.*;
public class Q6 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter size of the array: ");
        int n=input.nextInt();
        int arr[]=new int[n];
        System.out.println("enter elements in the array: ");
        for(int i=0;i<n;i++){
            arr[i]=input.nextInt();
        }
        int max=arr[0]; //logic
        for(int i=0;i<n;i++){
            if(arr[i]>max){ //understand working
                max=arr[i];
            }
        }
        System.out.println("array is: "+Arrays.toString(arr));
        System.out.println("the largest number in the array is: "+max);
    }
}

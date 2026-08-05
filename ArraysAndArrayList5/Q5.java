package ArraysAndArrayList5;
/*Q.Create an array. Write a method swap(int[] arr, int index1, int index2). The method should take the array
and swap the numbers at those two specific indices.*/
import java.util.*;
public class Q5 {
    static void swap(int arr[],int a,int b){
        //no for loop will be used coz there is no use of "i"
            int temp=arr[a];
            arr[a]=arr[b];
            arr[b]=temp;
        System.out.println(Arrays.toString(arr));
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter size of array: ");
        int n=input.nextInt();
        int arr[]=new int[n];
        System.out.println("enter elements in the array: ");
        for(int i=0;i<n;i++) {
            arr[i] = input.nextInt();
        }
        System.out.println("Array is: "+    Arrays.toString(arr));
        System.out.println("Array after swap is: ");
        swap(arr,0,2);
    }
}

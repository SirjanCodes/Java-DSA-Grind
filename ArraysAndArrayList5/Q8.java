package ArraysAndArrayList5;
//Q.Write a method to reverse an entire array.
import java.util.*;
public class Q8 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter size of the array: ");
        int n=input.nextInt();
        int arr[]=new int[n];
        System.out.println("enter elements in the array: ");
        for(int i=0;i<n;i++){
            arr[i]=input.nextInt();
        }
        System.out.println("array is: "+Arrays.toString(arr));
        int start=0;
        int end=arr.length-1;
        while(start<end){
            int temp=arr[start]; //no silly mistake man:-dont forget arr plz
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
        System.out.println("reversed array is: "+Arrays.toString(arr));
    }
}

package SortingAlgorithms9;
import java.util.*;
public class SelectionSort2 {
    static void selection(int arr[]){
        for(int i=0;i<arr.length;i++){
                int max=0; //to find the index of the element to be swapped
                for(int j=1;j<arr.length-i;j++){ //similar as bubble sort
                    if(arr[max]<arr[j]){
                        max=j; //swapped the index of the elements accordingly
                    }
                }
            int temp=arr[max];
            arr[max]=arr[arr.length-i-1]; //logic :- -1 coz we r swapping outside the j loop
            arr[arr.length-i-1]=temp;
        }
        System.out.println("the sorted array is: "+Arrays.toString(arr));
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of the array: ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("enter the elements in the array: ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("the array is: "+Arrays.toString(arr));
        selection(arr);
    }
}
//this sort works well only on small lists/arrays.
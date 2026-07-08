package BinarySearch7;
import java.util.*;
public class BinarySearchProgram1 {
    //we are not doing sorting for now here, only binary search:-works only for ascending order
    static void search(int arr[],int target){
            int start = 0;
            int end = arr.length - 1;
            while (start <= end) { //remember =
                int mid = start+(end-start) / 2; /*this is similar as (start+end)/2 but it may exceed the integer
                limit so thats why we are using this above formula*/
                if (arr[mid] < target) { //logics:-arr[mid], no silly mistakes
                    start=mid+1; //logic
                }
                if (arr[mid] > target) {
                    end=mid-1; //logic
                }
                if (arr[mid] == target) {
                    System.out.println("the target element is found in the array at the index: "+mid); //remember
                    return;
                }
            }
        System.out.println("element is not found in the array"); //no more silly mistake yaar
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter the size of the array: ");
        int n=input.nextInt();
        int arr[]=new int[n];
        System.out.println("enter the elements in the array: ");
        for(int i=0;i<n;i++){
            arr[i]=input.nextInt();
        }
        System.out.println("array is: "+Arrays.toString(arr));
        System.out.println("enter the target element to find in the array: ");
        int target=input.nextInt();
        search(arr,target);
    }
}

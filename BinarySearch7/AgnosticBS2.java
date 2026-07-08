package BinarySearch7;
import java.util.*;
public class AgnosticBS2 {
   static void search(int arr[],int target){
       int start=0;
       int end=arr.length-1;
       while(start<=end){
           int mid=start+(end-start)/2;
           if(arr[mid]==target){ //common
               System.out.println("the target number is found at the index: "+mid);
               return;
           }
           //for ascending:-basic logic
           if(arr[start]<=arr[end]){ //dont ever forget =
              if(arr[mid]<target){
                   start=mid+1;
               }
               else if(arr[mid]>target){
                   end=mid-1;
               }
           }
           //for descending:-vice-versa of ascending order
           else{ //dont use condition otherwise java will run both
               if(arr[mid]>target){
                   start=mid+1;
               }
               else if(arr[mid]<target){
                   end=mid-1;
               }
           }
       }
       System.out.println("the target element is not present in the array");
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

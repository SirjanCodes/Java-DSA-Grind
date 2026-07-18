package BinarySearch7;
/*Q.Find the Rotation Count in Rotated Sorted array
Difficulty Level : Easy • Last Updated : 28 Jun, 2021
Consider an array of distinct numbers sorted in increasing order. The array has been rotated
(clockwise) k number of times. Given such an array, find the value of k.
Examples:
Input : arr[] = {15, 18, 2, 3, 6, 12}
Output: 2
Explanation : Initial array must be {2, 3,
6, 12, 15, 18}. We get the given array after
rotating the initial array twice.
Input : arr[] = {7, 9, 11, 12, 5}
Output: 4*/
import java.util.*;
public class RotationCountInRotatedSortedArray6 {
    /*simple logic:-if u see carefully count of the number of rotations is +1 of the pivot element index so we
    are just calculating the (pivot+1)th index directly*/
    static int count(int arr[]){
        int start=0;
        int end=arr.length-1;
        int pivot=-1;
        while(start<end){
            int mid=start+(end-start)/2;
            if(mid<end && arr[mid]>arr[mid+1]){
                return mid+1; //+1 for finding count of rotations
            }
            if(mid>start && arr[mid]<arr[mid-1]){
                return mid; //+1
            }
            //squeezing pointers
            if(arr[start]>arr[mid]){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the size of the array: ");
        int n=input.nextInt();
        int arr[]=new int[n];
        System.out.println("enter the elements in the array: ");
        for(int i=0;i<n;i++){
            arr[i]=input.nextInt();
        }
        System.out.println("the array is: "+Arrays.toString(arr));
        System.out.println(count(arr));
    }
}
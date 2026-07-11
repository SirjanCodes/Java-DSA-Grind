package BinarySearch7;
/*Q.Find position of an element in a sorted array of infinite numbers.
Difficulty Level : Medium • Last Updated : 07 May, 2021
Suppose you have a sorted array of infinite numbers, how would you search an element in the array?
Source: Amazon Interview Experience.
Since array is sorted, the first thing clicks into mind is binary search, but the problem here is that we
don't know size of array.
If the array is infinite, that means we don't have proper bounds to apply binary search. So in order to find
position of key, first we find bounds and then apply binary search algorithm.
Let low be pointing to 1st element and high pointing to 2nd element of array, Now compare key with high index
element,
->if it is greater than high index element then copy high index in low index and double the high index.
->if it is smaller, then apply binary search on high and low indices found.*/
import java.util.*;
public class LeetCode702ndQuestion5 {
    static void search(int arr[],int key){
        int low=0; //no silly mistake:-these are bounds which we need to find first, not the elements
        int high=1;
            while(key>arr[high]){
                int temp=high+1; //just to store the value for low using high
                high=high+(high-low+1)*2; //logic:-previous end+(size of the box*2)
                low=temp;
            }
                while(low<=high){
                    int mid=low+(high-low)/2;
                    if(arr[mid]==key){
                        System.out.println("the target element is found at the index: "+mid);
                        return;
                    }
                    if(arr[mid]<key){
                        low=mid+1;
                    }
                    if(arr[mid]>key){
                        high=mid-1;
                    }
                }
                System.out.println("the target element is not present in the array");
    }
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("lets assume the size of the array is infinite");
        int arr[]={1,3,5,6,7,9,10,13,17,25,41,56}; //assume this as a sorted infinite size array
        System.out.println("enter the target element to search inside the array: ");
        int key=input.nextInt();
        search(arr,key);
    }
}

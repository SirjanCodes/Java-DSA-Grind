package BinarySearch7;
import java.util.*;
public class FloorOfNumber4 {
    static void search(int arr[],int target) {
        int start = 0;
        int end = arr.length - 1;
        //ascending
        if (arr[start] <= arr[end]) {
            //safety checks:-agrr target sbse chhote number se chhote hua
            if (target < arr[start]) {
                System.out.println("there is no floor of the target number present in the array");
                return;
            }
            while (start <= end) {
                int mid=start+(end-start)/2;
                if (arr[mid] == target) {
                    System.out.println("the floor of the target number is: "+arr[mid]);
                    return;
                }
                if(arr[mid]<target){
                    start=mid+1;
                }
                if(arr[mid]>target){
                    end=mid-1;
                }
            }
            System.out.println("the ceiling of the number is: "+arr[end]);
        }
        //descending
        else{
            //safety checks, agrr target sbse chhote number se chhote hua
            if (target < arr[end]) {
                System.out.println("there is no floor of the target number present in the array");
                return;
            }
            while (start <= end) {
                int mid=start+(end-start)/2;
                if (arr[mid] == target) {
                    System.out.println("the floor of the target number is: "+arr[mid]);
                    return;
                }
                if(arr[mid]>target){
                    start=mid+1;
                }
                if(arr[mid]<target){
                    end=mid-1;
                }
            }
            System.out.println("the ceiling of the number is: "+arr[start]);
        }
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter the size of the array: ");
        int n=input.nextInt();
        int arr[]=new int[n];
        System.out.println("enter the elements in the array");
        for(int i=0;i<n;i++){
            arr[i]=input.nextInt();
        }
        System.out.println("the array is: "+Arrays.toString(arr));
        System.out.println("enter the target number to find its floor in the array: ");
        int target=input.nextInt();
        search(arr,target);
    }
}

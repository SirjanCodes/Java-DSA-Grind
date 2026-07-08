package BinarySearch7;
//Q.Ceiling:-smallest number in the array which is > or = the target number.
import java.util.*;
public class CeilingOfNumber3 {
    //array is sorted so will use binary search
    static void search(int arr[],int target){
        int start=0;
        int end=arr.length-1;
        //ascending
        if(arr[start]<=arr[end]){
            //safety checks:-dont forget these, agrr target sbse bde number se bda hua
            if(target>arr[end]){
                System.out.println("there is no ceiling of the target number present in the array");
                return;
            }
            while(start<=end){
                int mid=start+(end-start)/2;
                if(arr[mid]==target){
                    System.out.println("the ceiling of the target number is: "+arr[mid]);
                    return;
                }
                if(arr[mid]<target){
                        start=mid+1;
                }
                if(arr[mid]>target){
                    end=mid-1;
                }
            }
            /*this is very imp coz it prints the next bigger number on the right according to the 2 indexes
           left at the end when the loop breaks after the required condition*/
            System.out.println("the ceiling of the target number is: "+arr[start]);
        }
        //descending
        else{
            //safety checks, agrr target sbse bde number se bda hua
            if(target>arr[start]){
                System.out.println("there is no ceiling of the target number present in the array");
                return;
            }
            while(start<=end){
                int mid=start+(end-start)/2;
                if(arr[mid]==target){
                    System.out.println("the ceiling of the target number is: "+arr[mid]);
                    return;
                }
                if(arr[mid]>target){
                    start=mid+1;
                }
                if(arr[mid]<target){
                    end=mid-1;
                }
            }
            /*this is very imp coz it prints the next bigger number on the left according to the 2 indexes
           left at the end when the loop breaks after the required condition*/
            System.out.println("the ceiling of the target number is: "+arr[end]);
        }
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
        System.out.println("enter the target number to find its ceiling in the array: ");
        int target=input.nextInt();
        search(arr,target);
    }
}
/*in the output, if we write the target number then its ceiling will be the target number itself, so we gotta
write something else as target number if we wannna understand the working
 */
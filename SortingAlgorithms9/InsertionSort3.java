package SortingAlgorithms9;
import java.util.*;
public class InsertionSort3 {
    static void insertion(int arr[]){
        for(int i=0;i<arr.length-1;i++){ // -1 for j=i+1 so that no index out of bounds error will be there
            for(int j=i+1;j>0;j--){ //inner loop moves backwards for comparing the elements of both partitions
                if(arr[j-1]>arr[j]){
                    int temp=arr[j-1];
                    arr[j-1]=arr[j];
                    arr[j]=temp;
                }
                else{ //dont forget this
                    break; //coz then elements before this partition are already sorted
                }
            }
        }
        System.out.println("the sorted array is: "+Arrays.toString(arr));
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter the size of the array: ");
        int n=input.nextInt();
        int arr[]=new int[n];
        System.out.println("enter the elements in the array: ");
        for(int i=0;i<arr.length;i++){
            arr[i]=input.nextInt();
        }
        System.out.println("the array is: "+Arrays.toString(arr));
        insertion(arr);
    }
}

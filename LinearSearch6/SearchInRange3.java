package LinearSearch6;
import java.util.*;
public class SearchInRange3 {
    static void search(int arr[],int num,int idx1,int idx2){
        if(idx1>idx2 || idx1<0 || idx2>arr.length){ //just see this idx1>idx2 logic and remember to put return
            System.out.println("please enter a valid range");
            return;
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]==num && i>=idx1 && i<=idx2){
                System.out.println("the number is found at the index: "+i);
                return;
            }
        }
        System.out.println("the number is not present in the desired range of the array");
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter the size of the array: ");
        int n=input.nextInt();
        int arr[]=new int[n];
        System.out.println("enter elements in the array: ");
        for(int i=0;i<n;i++){
            arr[i]=input.nextInt();
        }
        System.out.println("the array is: "+Arrays.toString(arr));
        System.out.println("enter the number to find: ");
        int num=input.nextInt();
        System.out.println("enter the starting index of the range: ");
        int idx1=input.nextInt();
        System.out.println("enter the ending index of the range: ");
        int idx2=input.nextInt();
        search(arr,num,idx1,idx2);
    }
}

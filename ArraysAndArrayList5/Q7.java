package ArraysAndArrayList5;
//Q.Exactly the same as Q6, but find the smallest number.
import java.util.*;
public class Q7 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter size of the array: ");
        int n=input.nextInt();
        int arr[]=new int[n];
        System.out.println("enter elements in the array: ");
        for(int i=0;i<n;i++){
            arr[i]=input.nextInt();
        }
        int min=arr[0]; //logic
        for(int i=0;i<n;i++){
            if(arr[i]<min){ //understand working
                min=arr[i];
            }
        }
        System.out.println("array is: "+Arrays.toString(arr));
        System.out.println("the smallest number in the array is: "+min);
    }
}

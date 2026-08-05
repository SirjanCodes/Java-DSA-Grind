package ArraysAndArrayList5;
import java.util.*;
public class PassingInFxns3 {
    static void change(int brr[]){
        brr[0]=69;
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter length of the arrray: ");
        int n=input.nextInt();
        int arr[]=new int[n];
        System.out.println("enter elements in the array: ");
        for(int i=0;i<n;i++){
            arr[i]=input.nextInt();
        }
        System.out.println("original array is: "+Arrays.toString(arr));
        System.out.println("array after change is: ");
        change(arr);
        System.out.println(Arrays.toString(arr)); //changed coz modification krr rhe h:-Mutable Behaviour
        //whereas, Strings are Immutable:-object cannot be changed
    }
}
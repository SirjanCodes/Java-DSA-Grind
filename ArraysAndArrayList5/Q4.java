package ArraysAndArrayList5;
/*Q.Create an array with 5 numbers. Create a second, empty array of the exact same size. Write a loop to copy
every number from the first array into the second array, then print the second array.*/
import java.util.*;
public class Q4 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("size of the 1st array is 5");
        int arr1[]=new int[5];
        System.out.println("enter elements in the array: ");
        for(int i=0;i<5;i++){
            arr1[i]=input.nextInt();
        }
        System.out.println("1st array is: "+Arrays.toString(arr1));
        System.out.println("size of the 2nd array is same the 1st which is 5");
        int arr2[]=new int[arr1.length];
        for(int i=0;i<arr1.length;i++){
            arr2[i]=arr1[i]; //we will assign values of arr2 so dont do silly mistake by writing vice-versa
        }
        System.out.println("2nd array is: "+Arrays.toString(arr2));
    }
}

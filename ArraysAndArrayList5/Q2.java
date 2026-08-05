package ArraysAndArrayList5;
//Q.Create an array of numbers. Loop through it and find the total sum of every element inside.
import java.util.*;
public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum=0;
        System.out.println("enter size of the array: ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("enter number in the array: ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            sum=sum+arr[i]; //no silly mistake
        }
        System.out.println("the sum of all the numbers present in the array is: "+sum);
    }
}

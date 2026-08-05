package ArraysAndArrayList5;
/*Q.Create a simple 2D array (like int[][] arr = {{1, 2}, {3, 4}};). Write a nested for loop
(a loop inside a loop) to print it out so it looks like a square grid on your console.*/
import java.util.*;
public class Q9 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter number of rows in the array: ");
        int n1=input.nextInt();
        System.out.println("enter number of columns in the array: ");
        int n2=input.nextInt();
        int arr[][]=new int[n1][n2];
        System.out.println("enter elements in the array: ");
        for(int i=0;i<n1;i++){
            for(int j=0;j<arr[i].length;j++){
                arr[i][j]=input.nextInt();
            }
        }
        //normal printing due to square grid representation:-
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                System.out.print(arr[i][j]);
            }
            System.out.println(" ");
        }
    }
}

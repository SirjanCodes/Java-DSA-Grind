//this is not a BS in 2D logic, this is just warmup LS program
package BSIn2DArrays8;
import java.util.*;
public class BasicSearchProgram1 {
    static void search(int arr[][], int target){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if(arr[i][j]==target){
                    System.out.println("the target element is present in the array on row "+i+" and column "+j);
                }
            }
        }
        System.out.println("the target element is not present in the array");
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter the number of rows in the array: ");
        int a=input.nextInt();
        System.out.println("enter the number of columns in the array: ");
        int b=input.nextInt();
        int arr[][]=new int[a][b];
        System.out.println("enter the elements in the array: ");
        for(int i=0;i<a;i++){
            for(int j=0;j<arr[i].length;j++){
                arr[i][j]=input.nextInt();
            }
        }
        System.out.println("the array is: "+Arrays.deepToString(arr));
        System.out.println("enter the target element to search in the array: ");
        int target=input.nextInt();
        search(arr,target);
    }
}

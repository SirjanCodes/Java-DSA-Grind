package LinearSearch6;
import java.util.*;
public class SearchIn2DArrays4 {
    static void search(int arr[][],int num){
        if(arr.length<=0){
            System.out.println("please enter a valid size of the array");
        }
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if(arr[i][j]==num){
                    System.out.println("the number is found at row " +i+"and column " +j);
                    return;
                }
            }
        }
        System.out.println("the number is not present in the array");
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter number of rows of the array: ");
        int n1=input.nextInt();
        System.out.println("enter number of columns of the array: ");
        int n2=input.nextInt();
        int arr[][]=new int[n1][n2];
        System.out.println("enter the elements in the array: ");
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                arr[i][j]=input.nextInt();
            }
        }
        System.out.println("array is: "+Arrays.deepToString(arr));
        System.out.println("enter the number to find in the array: ");
        int num=input.nextInt();
        search(arr,num);
    }
}

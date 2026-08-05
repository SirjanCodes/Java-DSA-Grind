package ArraysAndArrayList5;
import java.util.*;
public class MultiDimensionalArrays4 {
    //In Java, multidimensional arrays are treated as arrays inside of array.
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       // int brr[][]=new int[3][3]; basic syntax:-in this,its not mandatory to enter column size as its not imp.
       int brr[][]={{1,2,3},
                {4,5,6},
                {7,8,9}};
        for(int i=0;i<brr.length;i++){ //for printing
            for(int j=0;j<brr[i].length;j++){ /*VVVIMP Concept:-remember this arr[i].length:-tells how many items
             are there in this exact row:-eg:-arr[0]={1,2,3}=3 items so loop will perfectly stop after 3 items*/
                System.out.print(brr[i][j]); //no ln
            }
            System.out.println(" "); //remember this for representation in the output
        }
        //OR :- remember syntax :- best and simplest way
        System.out.println(Arrays.deepToString(brr));
        // OR :- printing only through row :- remember syntax
        for(int i=0;i<brr.length;i++) {
            System.out.println(Arrays.toString(brr[i]));
        } //enhanced for loops are also there but these are enough otherwise it will be complicated
        System.out.println("enter number of rows: ");
        //input
        int a=input.nextInt();
        System.out.println("enter number of columns: ");
        int b=input.nextInt();
        int arr[][]=new int[a][b];
        System.out.println("enter elements of the array: ");
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                arr[i][j]=input.nextInt();
            }
        }
        System.out.println(Arrays.deepToString(arr));
    }
}

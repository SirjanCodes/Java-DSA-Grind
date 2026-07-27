package BSIn2DArrays8;
import java.util.*;
public class BSin2DArrayProgram2 {
    //LeetCode 240:-array is sorted in both row and column wise manner
    static int [] search(int arr[][], int target){
        int r=0;
        int c=arr[0].length-1; /*VIMP:-0 is used to start from the 1st row otherwise it will be 1-1=0,
        we r starting from the top-right corner ,so, left is smaller and down is bigger numbers*/
        while(r<arr.length && c>=0){ /*logic:-we r just traversing through each row and checking each element
        using column and seeing if target is present or not, simple, nothing else*/
            if(arr[r][c]==target){
                return new int[]{r,c};
            }
            if(arr[r][c]<target){
                r++;
            }
            else{ //gotta remember else, otherwise index out of bounds
                c--;
            }
        }
        return new int[]{-1,-1}; //not found
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the number of rows of the array: ");
        int a=input.nextInt();
        System.out.println("enter the number of columns of the array: ");
        int b=input.nextInt();
        int arr[][]=new int[a][b];
        System.out.println("enter the elements in the array: ");
        for(int i=0;i<a;i++){
            for(int j=0;j<arr[i].length;j++){
                arr[i][j]=input.nextInt();
            }
        }
        System.out.println("the array is: "+Arrays.deepToString(arr));
        System.out.println("enter the target element to find in the array: ");
        int target=input.nextInt();
        System.out.println(Arrays.toString(search(arr,target))); //no silly mistake in printing the return DT
    }
}
//LeetCode 74 is also done in the app only:-for strictly sorted array
package LinearSearch6;
import java.util.*;
public class LinearSearchProgram1 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter the size of the array: ");
        int n=input.nextInt();
        if(n<=0){
            System.out.println("please enter a valid size of the array");
        }
        int arr[]=new int[n];
        System.out.println("enter the elements in the array: ");
        for(int i=0;i<n;i++){
            arr[i]=input.nextInt();
        }
        System.out.println("array is: "+Arrays.toString(arr));
        System.out.println("enter the number to search in the array: ");
        int num=input.nextInt();
        for(int i=0;i<n;i++){
            if(arr[i]==num){
                System.out.println("the number is found at the index: "+i);
                return;
            }
        }
        System.out.println("the number is not present in the array");
    }
}
//we can also solve by making different methods, we can use static boolean DT too, by returning true or false
package FxnsOrMethodsinJava4;
import java.util.Arrays;
import java.util.Scanner;
public class ChangeValue7 {
    static void changeArr(int arr[]){
        arr[0]=99; /*here, we just modified the object, we didnt create a new object
        if we make a change in the object via reference variable, same object will be changed*/
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int arr[]={1,2,3,4,5,6,7};
        changeArr(arr);
        System.out.println(Arrays.toString(arr)); //remember this syntax
    }
}

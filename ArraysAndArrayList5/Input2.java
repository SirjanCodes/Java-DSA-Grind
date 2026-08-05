package ArraysAndArrayList5;
import java.util.*;
public class Input2 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        //array of primitives:-
        int arr []=new int[5];
        for(int i=0;i<arr.length;i++){ //for input
            arr[i]=input.nextInt();
        }
        for(int i=0;i<arr.length;i++){ //for printing the array
            System.out.println(arr[i]);
        }
        //OR :- for each loop:-
        for(int num:arr){ //for every element of the array, print the element
            System.out.println(num); //here num represents element of the array
        }
        //OR :- the best and the simplest one :- toString() method:-
        System.out.println(Arrays.toString(arr)); //converts the array into String
        //array of objects:-
        String str[]=new String[3];
        for(int i=0;i<str.length;i++){
                str[i]=input.next();
        }
        System.out.println(Arrays.toString(str));
        str[0]="Sirjan"; //this modification will be done and printed
        System.out.println(Arrays.toString(str));
    }
}

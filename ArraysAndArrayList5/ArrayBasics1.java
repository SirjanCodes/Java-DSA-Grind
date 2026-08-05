package ArraysAndArrayList5;
import java.util.*;
public class ArrayBasics1 {
    public static void main(String[] args) {
        //used to store multiple similar data types
        //syntax :- DT[] name=new DT[size];
        int [] arr=new int[5]; //LHS is at compile time and RHS is at runtime/dynamic memory allocation
        //or directly :- int [] arr = {3,4,5,3,2};
        /*int [] arr; declaration :- object is defined
        arr[]=new int[size]; initialization :- object is created*/
        /*In Java, internally:-
        1)array objects are stored in a heap.
        2)heap objects are not continuous.
        3)DMA(Dynamic Memory Allocation) is there.
        Hence:-in arrays, continuous memory allocation may not be there, it completely depends upon JVM.
        However, definition of arrays says different. */
        int brr[]=new int[4]; //index will start from 0 so 0 to 3 in this case
        System.out.println(brr[0]); //by default current array is:-{0,0,0,0}, so output is 0
        String words[]=new String[7];
        System.out.println(words[6]); //similarly for string array, default :- null
        System.out.println(words[7]); //array index out of bound error
        /*null:-special value which is by default assigned to reference variables and is used for non-primitives
        and we can typecast null to any type as well, except for primitive data types */
    }
}
/*VVVIMP Conceot:-in most of the questions if we want an array as a return type then we gotta make our own new
array and use it instead of the already presented one:-mostly in leetcode and good questions
 */
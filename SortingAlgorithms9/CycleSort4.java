package SortingAlgorithms9;
import java.util.*;
public class CycleSort4 {
    /*VVVIMP:-Pattern:-when number given in range of 1 to N:-use cyclic sort*/
    static void cycle(int arr[]){
        int i=0;
        while(i<arr.length){ //for loop(use i-- after swap in if) can also be used but this is much cleaner
            int correct=arr[i]-1; //logic/pattern:-index=value-1
            if(arr[correct]!=arr[i]){ //then simply swap with correct index if not equal
                int temp=arr[correct];
                arr[correct]=arr[i];
                arr[i]=temp;
            }
            else{ //dont forget this
                i++; //if equal, check for the remaining ones
            }
        }
        System.out.println("the sorted array is: "+Arrays.toString(arr));
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter the size of the array: ");
        int n = input.nextInt();
        int arr[]=new int[n];
        System.out.println("enter the elements in the array: ");
        for(int i=0;i<arr.length;i++){
            arr[i]=input.nextInt();
        }
        System.out.println("the array is: "+Arrays.toString(arr));
        cycle(arr);
    }
}
/*Here is the ultimate breakdown of how the ones we've covered stack up:1. The Overall Most Practical: Insertion SortFor general-purpose, everyday coding, this is the winner out of the basic sorts.Why it wins: It is adaptive and stable. If an array is already partially sorted, its time complexity drops to $O(N)$.Real-world use: It is so efficient for small arrays that advanced algorithms like Python's built-in sort() (Timsort) actually switch to Insertion Sort when the dataset gets small enough!2. The Specialized King: Cycle SortThis is the absolute best, but only for one specific scenario.Why it wins: When you know the array contains a continuous range of numbers from $1$ to $N$, nothing beats it. It sorts in purely $O(N)$ time with $O(1)$ space using the absolute minimum number of memory writes.Real-world use: It is the secret weapon for massive tech interview questions where you have to find a "missing number" or "duplicate number" in an array.3. The "Only When Forced" Option: Selection SortYou will almost never use this in real life for speed.Why it exists: Its only redeeming quality is that it makes the absolute minimum number of swaps ($O(N)$ swaps worst-case).Real-world use: If you are working on a very constrained hardware system where writing to memory is extremely "expensive" or wears out the flash drive, Selection Sort is useful. Otherwise, its $O(N^2)$ time complexity makes it too slow.4. The Educational Tool: Bubble SortThis is the bottom of the barrel.Why it loses: It is strictly a teaching tool to help developers understand how looping and swapping work.Real-world use: Essentially zero. Even at its best, it requires way too many redundant comparisons and swaps compared to Insertion Sort.*/
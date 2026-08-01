package SortingAlgorithms9;
import java.util.*;
public class BubbleSort1 {
    static void bubble(int arr[]){
        boolean swap = false; //just for extra minor things
        for(int i=0;i<arr.length;i++){ //after 1st pass, highest element will be at last and so on...
            for(int j=1;j<arr.length-i;j++){ //-i to exclude the already sorted ends after each pass
                if(arr[j-1]>arr[j]){ //for swapping the element if previous element is greater than next
                    int temp=arr[j-1];
                    arr[j-1]=arr[j];
                    arr[j]=temp;
                    swap=true;
                }
            }
        }
        if(swap==false){
            System.out.println("the array is already sorted");
            return;
        }
        System.out.println("the sorted array is: "+Arrays.toString(arr));
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter the size of the array: ");
        int n=input.nextInt();
        int arr[]=new int[n];
        System.out.println("enter the elements in the array: ");
        for(int i=0;i<arr.length;i++){
            arr[i]=input.nextInt();
        }
        System.out.println("the array is: "+Arrays.toString(arr));
        bubble(arr);
    }
}
/*Why Bubble Sort Gets So Much Hate:-
Bubble sort is an excellent teaching tool, but it gets heavily criticized in the developer community because of its severe real-world inefficiency. Here is exactly why software engineers generally avoid using it:

Quadratic Scaling: The worst and average case time complexity is O(N²), meaning the execution time increases dramatically as the size of the dataset grows.

Excessive Swapping: The algorithm relies on a massive number of element swaps, which is computationally costly and slows down execution.

Hardware Inefficiency: It interacts very poorly with modern CPU hardware, producing at least twice as many memory writes as insertion sort and causing significantly more cache misses.

The "Turtle" Problem: Small elements located near the end of the array move toward the beginning incredibly slowly, advancing only a single step per algorithmic pass.

Beaten by Peers: Even when compared to other simple O(N²) sorting algorithms, alternatives like Insertion Sort are generally much faster and more efficient in practice.

Strictly Academic: Because of these extreme performance drop-offs, it is almost exclusively used as an educational tool for beginners rather than in practical, real-life software applications.*/
package Basics1;
import java.util.Scanner;
public class LoopBasics11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //while loop:-generally used when we dont know number of times to run the loop
        int count=1;
        while(count!=7){
            System.out.println(count);
            count++;
        }
        //for loop:-generally used when we know the number of times to run the loop
        for(int i=1;i!=7;i++){
            System.out.println(i);
        }
    }
}

package FxnsOrMethodsinJava4;
/*Q.Write a function to check if a given triplet is a Pythagorean triplet or not. (A Pythagorean triplet is when
the sum of the square of two numbers is equal to the square of the third number).*/
import java.util.*;
public class Q8 {
    static void check(double a, double b, double c) {
        if(a<0 || b<0 || c<0){
            System.out.println("please enter a valid triplet");
            return;
        }
     double asq=Math.pow(a,2);
     double bsq=Math.pow(b,2);
     double csq=Math.pow(c,2);
     if((asq+bsq)==(csq) || (bsq+csq)==(asq) || (asq+csq)==(bsq)){ //silly mistake
         System.out.println("this triplet is a pythagorean triplet");
     }
     else{
         System.out.println("this triplet is not a pythagorean triplet");
     }
    }
        public static void main (String[]args){
            Scanner sc = new Scanner(System.in);
            check(3,4,5); //or 5,12,13
        }
    }

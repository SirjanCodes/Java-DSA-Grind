package FxnsOrMethodsinJava4;
/*Q.A person is eligible to vote if his/her age is greater than or equal to 18. Define a method to find out if
he/she is eligible to vote.*/
import java.util.*;
public class Q3 {
    static void vote(int age){
        if(age<0){
            System.out.println("please enter a valid age");
        }
        if(age>=18){
            System.out.println("the person is eligible to vote");
        }
        else{
            System.out.println("this person is not eligible to vote");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        vote(69);
    }
}

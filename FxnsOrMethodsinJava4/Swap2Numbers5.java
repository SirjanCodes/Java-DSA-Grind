package FxnsOrMethodsinJava4;
import java.util.Scanner;
public class Swap2Numbers5 {
    static void changeName(){
        //Pass By Reference Concept:-
        String names="Samridhi"; /*now this is a VVVIMP concept, here the name we changed but we didnt print
        the vlaue like sout(names) in this method, so in main fxn, name is not changed and remains the name
        which we wrote*/

        /*VVVIMP:-we just created an object, not change the name (desired thing), this is pass by reference which
        is not there in java*/
    }

    static void swap(int n1,int n2){
        int temp=n1;
        n1=n2;
        n2=temp;
        System.out.println(n1+" "+n2); /*similarly here,swapping will be done as this line is written in the
        method itself so it swaps the numbers and print their value too instead of just swapping*/
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter 1st number: ");
        int n1=input.nextInt();
        System.out.println("enter 2nd number: ");
        int n2=input.nextInt();
        swap(n1,n2); /*so, swapping will be done as in above method swapping and printing both were done unlike
        the name method, if the above print line would be here in main fxn then swapping wouldnt be done*/

        String name="Ankit";
        changeName();
        System.out.println(name); //so here name will not be changed, this line should be written in method
    }
}

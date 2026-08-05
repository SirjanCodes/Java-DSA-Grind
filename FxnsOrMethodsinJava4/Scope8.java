package FxnsOrMethodsinJava4;
import java.util.Scanner;
import java.util.*; //to call every library fxn
public class Scope8 {
    //Scope:-Initialization, however changes can be made to the same initialized variable.
    static void change(){ //method scope
        String naam="Rajni";
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
       // System.out.println(naam); we cannot access this due to the method scope
        int a=10;
        { //block scope
            //int a=100; initialization cant be done as its already done in main fxn
            a=100; //changes can be done
            int b=70;
        }
       // System.out.println(b); cannot be accessed due to block scope
        for(int i=0;i<=10;i++){ //loop block
            System.out.println(i);
        }
        //System.out.println(i); cannot be used due to loop scope

        /*Simple Logic:-anything initialized outside the block can be used(changes/updation) inside the block
        and anything initialized inside the block cannot be used outside the block, however we can
        reinitialize a variable outside the block which is initialized inside the block already as that thing
        only limits upto the block:-*/
        {
            int c=100; //this was initialized and only limited to this block
        }
        int c=70; //so we can reinitialize it and use it
    }
}

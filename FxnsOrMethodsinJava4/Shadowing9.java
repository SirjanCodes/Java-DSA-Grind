package FxnsOrMethodsinJava4;
import java.util.*;
public class Shadowing9 { //block 1(higher level block) start
    static int x=100; //dont forget static
    static int y=69;
    public static void main(String[] args) { //block 2 start
        Scanner input=new Scanner(System.in);
        System.out.println(x); //100
        int x=90; /*now when we change the value of the variable when 2 blocks overlap then the higher level
        block is shadowed and the value is changed accordingly*/
        //VVIMP:-scope begins when value of the variable is initialized:-
        int y;
      //  System.out.println(y); this will show an error as the value is yet to be changed
        y=100;
        System.out.println(x); //90
        System.out.println(y);
    } //block 2 end
} //block 1 end

package FxnsOrMethodsinJava4;
import java.util.*;
public class VariableArguments10 {
    static void print(int ...v){ /*...v is treated as an array of the DT we decide (int in this case), we use
    this when we dont know how many times we will pass the particular value, remember syntax*/
        System.out.println(Arrays.toString(v)); //syntax to print array
    }
    static void prints(String ...s){
        System.out.println(Arrays.toString(s));
    }
    static void multiple(String name, int d, int ...i){
        //vararg parameter should always be at the last, it cant be in between or starting
        System.out.print(name+" "); //printing will be done separately
        System.out.print(d+" ");
        System.out.println(Arrays.toString(i));
    }
    public static void main(String[] args) {
        print(2,4,5,6,7,7,4,3,3,3,45,0);
        prints("sirjan","ashmit","ankit","shubhangi");
        multiple("sirjan",69,7,8,6,4,44); //order should be same as method
    }
}

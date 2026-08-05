package FxnsOrMethodsinJava4;
import java.util.*;
public class MethodOverloading11 { //similar name multiple methods
    static void print(int n){
        System.out.println(n);
    }
  //  static int print(int num) this will show an error due to similar arguments passed
    static String print(String name){
        return name;
    }
    static int print(int n1,int n2,int n3){
        return (n1+n2+n3);
    }
    //Concept:-either DT of arguments or number of arguments should be different
    public static void main(String[] args) {
        print(69);
        System.out.println(print("Samridhi"));
        //dont do silly mistakes:-sout krke likhna pdta hai other types ko except void
        System.out.println(print(6,5,4));
    }
}

package FxnsOrMethodsinJava4;
import java.util.Scanner;
public class PassByValue6 {
    static void greet(String naam){ //naam is only accessible in this fxn,otherwise it will be outside its scope
        System.out.println(naam);
    }
    public static void main(String[] args) {
        String name="Sirjan Singh";
        greet(name); /*it doesnt matter if there is naam in the method, this name variable will be passed onto
        the method and treated like naam and be printed, in java ,there is no pass by reference*/

        //Primitives are just pass by value, whereas objects and references are passing the value of reference
    }
}
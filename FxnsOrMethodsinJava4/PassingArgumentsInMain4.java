package FxnsOrMethodsinJava4;
import java.util.Scanner;
public class PassingArgumentsInMain4 {
    static String greeting(String greet){
        return greet;
    }
    static int sum(int n1,int n2){
        int sum=n1+n2;
        return sum;
    }
    public static void main(String[] args) {
        int addition=sum(30,69); //ye sb krrna hi pdega just like prev code, or use sout(sum(30,69));
        System.out.println(addition);
        System.out.println(greeting("hello man"));
    }
}

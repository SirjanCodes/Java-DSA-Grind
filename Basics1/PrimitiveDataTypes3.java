package Basics1;
import java.util.Scanner;
public class PrimitiveDataTypes3 { //primitive:-any data type that cannot be broken further
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int id=67; //4 bytes (1 byte=8bits in Java)
        char ch='d'; //2 bytes
        float temp=97.44f; /*for normal decimal numbers, see syntax:-f, 4 bytes, by default DT of decinal numbers
        are double so we add f for differentiation*/
        long size=4554986984334383403L; /*for large integers, see syntax:-L, 8 bytes, by default DT of integer
        is int so we add L for larger integers*/
        double marks=25.4333355353535335335; //for large decimal numbers, 8 bytes
        boolean check=false;
        //String is not primitive
        String name="Sirjan"; //this can be broken down further into more characters
    }
}

package Basics1;
import java.util.Scanner;
public class AutomaticTypePromotionInExpressions9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a=257; //byte limit is till 256
        byte b=(byte)(a);
        System.out.println(b); //257%256

        byte c =40;
        byte d=60;
        byte e=90;
        int ans=(c*d)*e; //now operations are performed based on int,not byte otherwise it would not fit in 256
        System.out.println(ans);

        byte f=6;
        //f=f*2; //cant do it coz an integer 2 is there

        //ASCII values
        int number='A';
        System.out.println(number);

        char ch=65;
        System.out.println(ch);

        System.out.println(3*2.333f);//simple concept:-ans will be in float as it is bigger

        //unicode values
        System.out.println("नमस्तेनमस्ते");
        System.out.println("ナマステ"); //java works on unicode values:-characters,symbols,numbers

         byte g=65;
         char h='e';
         short i=10876;
         int j=889;
         float k=69.443f;
         double l=932.2398293;
        double result=(g*h)+(i/j)+(k*l);
        System.out.println(result); //ans in double
        System.out.println((g*h)+" "+(i/j)+" "+(k*l)); //Internal Working:-each ans in terms of bigger DT
    }
}

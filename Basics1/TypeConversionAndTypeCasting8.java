package Basics1;
import java.util.Scanner;
public class TypeConversionAndTypeCasting8 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        //type conversion
        float a=input.nextInt(); /*condition:-left should always be greater than the right,
        in this case ,float is greater coz it can contain int+dec values both*/
       // int b=input.nextFloat(); this vice-versa will give an error
        //type casting:-compressing bigger DT to a smaller one
        /*int num=62.44f; obv error as left is smaller*/
        int num=(int)(62.44f); //see method of casting
        System.out.println(num);
    }
}

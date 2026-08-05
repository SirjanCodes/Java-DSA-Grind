package Basics1;
import java.util.Scanner;
public class TemperatureConversionProgram12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter temperature in celsius: ");
        double c=input.nextDouble();
        double f=(1.8*c)+32; //see formula:-1.8 or 9/5
        System.out.println("temperature in fahrenheit is: "+f);
    }
}

package StringsAndStringBuilder10;
import java.util.*;
public class PrettyPrinting4 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        float num=234.2167f;
        System.out.printf("the formatted number is: %.2f" ,num); /*here, printf means formatted string, %() is
        a place holder and will replace the value accordingly, remember the remaining syntax as well, this also
         rounds off the number accordingly*/
        System.out.println(" "); //line to print the below thing
        System.out.println(Math.PI);
        System.out.printf("the formatted PI value is: %.2f", Math.PI);
        System.out.println(" ");
        System.out.printf("my name is %s and my surname is %s", "Sirjan", "Singh"); /*placeholders values are
        replaced according to the position*/
    }
}
/* See these once:-
 * There are many format specifiers we can use. Here are some common ones:
 *
 * %c - Character
 * %d - Decimal number (base 10)
 * %e - Exponential floating-point number
 * %f - Floating-point number
 * %i - Integer (base 10)
 * %o - Octal number (base 8)
 * %s - String
 * %u - Unsigned decimal (integer) number
 * %x - Hexadecimal number (base 16)
 * %t - Date/time
 * %n - newline
 */
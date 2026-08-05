package FxnsOrMethodsinJava4;
import java.util.Scanner;
public class ReturningString3 {
    static String print(){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter something: ");
        String word=sc.nextLine();
        return word;
    }
    public static void main(String[] args) {
        System.out.println(print()); /*we can do this otherwise value will not print, or store this method inside
        a variable :- String words=print(); then sout(words) to get output*/
        //VVIMP concept:-just remember, return type waale mai sout krwana pdega method ko main mai
    }
}

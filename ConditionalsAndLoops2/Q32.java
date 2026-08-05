package ConditionalsAndLoops2;
/*Q.Kunal is allowed to go out with his friends only on the even days of a given month. WAP to count the number
 of days he can go out in the month of august.*/
import java.util.Scanner;
public class Q32 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String month = "August";
        System.out.println("month is: "+month);
        int count=0;
        for(int i=1;i<=31;i++){
            if(i%2==0){
                count++;
            }
        }
        System.out.println("number of days Kunal can go out in August is: "+count);
    }
}

package ConditionalsAndLoops2;
//Q.Find Ncr and Npr.
//Formula :- nPr=n!/(n-r)!
import java.util.Scanner;
public class Q34 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter total number of items: ");
        int n=input.nextInt();
        System.out.println("enter number of items to be selected: ");
        int r=input.nextInt();
        int nfact=1;
        int nminusrfact=1;
        if(n-r<0){ //this is VVVIMP condition
            System.out.println("answer is 0"); //5P7=5!/(5-7)! which is invalid and usually considered as 0
            return; //use this as a break
        }
        for(int i=n;i>=1;i--){
                nfact = nfact * i;
        }
        for(int i=n-r;i>=1;i--) {
                nminusrfact = nminusrfact * i;
        }
        int nPr=nfact/nminusrfact;
        System.out.println("permutation of these 2 numbers are: "+nPr);
    }
}
//similarly, we can do for nCr=n!/r!(n-r)!
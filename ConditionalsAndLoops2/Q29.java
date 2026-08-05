package ConditionalsAndLoops2;
//Q.Vowel or Consonant.
import java.util.Scanner;
public class Q29 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter alphabet: ");
        char ch=input.next().trim().charAt(0);
        if (ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U') {
            System.out.println("alphabet is a vowel");
        }
        else{
            System.out.println("alphabet is a consonant");
        }
        }
    }


package Basics1; /*package:-folder in which our java file lies
,we can also create a sub folder in a folder:-foldername.subfoldername*/
/*.java means that it should contain a class and this class is FirstJavaProgram
class :- name grp of properties and fxns*/
public class FirstJavaProgramOutput1 { /*this class is public so its accessible to everyone
 ,public class will always be the class which is name we gave to our java class*/
public static void main(String [] args){ /*here main is a fxn :- collection of codes
without main, code will not run as class looks for main to run,its like entry point of code*/
    //public :- if main is that imp then it should be accessible to everyone
    /*static :- to use main fxn without creating object of the above class as static is obj independent*/
    //void:-return type of the fxn
    //String[] args:-character array (array of strings)
    System.out.println("hello world"); /*hold control and press on each sout and see its whole working
    ,these are present in language package made by developers to make our lives easier,
    out is variable name of printStream*/
    System.out.print("Sirjan");//ln is removed so, no new line
    System.out.println("Bhalla");
   // System.out.println(args[1]); now its value will be put in the running terminal to get printed
    /*after this if we open FirstJavaProgram.class in the files then it will show a code which is byte code
    which we cannot understand, its a computer language thing*/
}
}
/*naming java class starting with a capital letter should be in practice as everything starting with capital
   is a class letter*/
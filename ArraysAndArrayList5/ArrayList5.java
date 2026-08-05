package ArraysAndArrayList5;
import java.util.*;
public class ArrayList5 {
    //used when we dont know the size of the array
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>(10); /*here, we can put data type only as wrapper
      classes such as Integer in this case, we cannot use primitives like int, also writing capacity doesnt
      matter here as we can add or do multiple things exceeding this written capacity easily*/
        /*Internal Working of Capacity:-once the written capacity get full, size of arraylist is increased by
       1.5x and the old elements are copied to the new increased sized arraylist and old arraylist is deleted*/
        //Array Functions:-
        list.add(654);
        list.add(69);
        list.add(77);
        list.add(17);
        System.out.println(list);

        list.remove(0); //remember syntax of each function
        System.out.println(list);

        list.set(1,66);
        System.out.println(list);

        System.out.println(list.getFirst());
        System.out.println(list.getLast());

        System.out.println(list.contains(654));
        System.out.println(list.contains(66));

        System.out.println(list.get(2));
        //see more fxns by writing :- list. ,more fxns will appear that we can use too

        //input
        ArrayList<Integer> lists = new ArrayList<>(7);
        for(int i=0;i<7;i++){
            lists.add(input.nextInt()); //remember syntax
        }
        System.out.println(lists); //print

        //multi-dimensional ArrayList:-ArrayList inside an ArrayList:-get() add hojayega bss,dont forget index
        ArrayList<ArrayList<Integer>> listss=new ArrayList<>(4);
        //intialization:-
        for(int i=0;i<4;i++){
            listss.add(new ArrayList<>()); //remember syntax
        }
        //adding elements:- remember syntax :- commented out coz of input
        listss.get(0).add(33);
        listss.get(1).add(69);
        System.out.println(listss.getFirst()); //first element of the main array list
        //see the difference between both:-just like 2D arrays
        System.out.println(listss.get(1).getFirst()); //first elements of 2nd row:-having index 1
        System.out.println(listss);
        //input:-
        for(int i=0;i<4;i++){
            listss.get(i).add(input.nextInt()); //remember syntax:-get(i) mainly
        }
        System.out.println(listss); //print
    }
}
//remember boolean arraylist syntax:-ArrayList<Boolean> result=new ArrayList<>(8);
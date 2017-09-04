package Actual;

import java.util.ArrayList;

/**
 * Created by HACKER on 08/08/2017.
 * Relational Operators|| == && != +
 */
public class ArrayListExample {
    public static void main(String[]args){
        ArrayList arrayList = new ArrayList();
        System.out.println("Initial size of ArrayList ");
        System.out.println(arrayList.size());

        //add elements to the array list
        arrayList.add("C");
        arrayList.add("A");
        arrayList.add("F");
        arrayList.add("G");
        arrayList.add("M");
        arrayList.add("L");

        System.out.println("Size of arrayList after addition");
        System.out.println(arrayList.size());


        //display the arrayList
        System.out.println("Contents of array List");
        System.out.println(arrayList);

        //remove elements
        arrayList.remove("F");
        arrayList.remove("A");

        //contents after deletion
        System.out.println("Size after deletion");
        System.out.println(arrayList.size());

        System.out.println("Contents after deletions");
        System.out.println(arrayList);

    }
}

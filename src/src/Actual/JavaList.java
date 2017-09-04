package batchone.Actual;

import java.util.ArrayList;
import java.util.List; //import

/**
 * Created by HACKER on 05/08/2017.
 * || == && != ++
 */
public class JavaList {
    public static void main(String[]args){
        //creating a list
        List<String> myList= new ArrayList<>();

        //populating a list
        myList.add("python"); //removed
        myList.add("C"); //removed
        myList.add("Go");
        myList.add("Android");
        myList.add("JavaScript");
        myList.add("Kotlin");

        //printing a list
        for (String language:myList) {
            System.out.println(myList);
        }

        //printing list using java 8 - style
        myList.stream().forEach(System.err::println);

        //remove item from list
        myList.remove(1);
        myList.remove(4);

        myList.forEach(System.out::println); //for-each uses lazy evaluation to iterate
    }
}

package batchone.preshow;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by HACKER on 05/08/2017.
 * || == && != ++
 */
public class ListUse {
    public static void main(String[]args){
        //creating a List
        List<String> myList = new ArrayList<>();

        //populating a List
        myList.add("java");
        myList.add("python");
        myList.add("C");
        myList.add("javaScript");

        //printing a List
        for (String language:myList) {
            System.out.println(language);
        }

        //printing a list using Java-8 functional style
        myList.stream().forEach(System.err::println);

        //remove items from a list
        myList.remove(1); // removes python
        myList.forEach(System.out::println);
    }
}

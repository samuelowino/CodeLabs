package batchone.Actual;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by HACKER on 05/08/2017.
 * || == && != ++
 */
public class JavaSets {
    public static void main(String[]args){
        Set<Integer> mySet = new HashSet<>();

        //populate the Set
        mySet.add(345);
        mySet.add(278);
        mySet.add(908);

        //print Set Values
        mySet.forEach(System.out::println);

        //remove values
        mySet.remove(278);

        mySet.forEach(System.err::println);
    }
}

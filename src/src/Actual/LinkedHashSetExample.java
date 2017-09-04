package Actual;

import java.util.LinkedHashSet;

/**
 * Created by HACKER on 08/08/2017.
 */
public class LinkedHashSetExample {
    public static void main(String[]args){
        LinkedHashSet linkedHashSet = new LinkedHashSet();

        //populate hashSet
        linkedHashSet.add("N");
        linkedHashSet.add("M");
        linkedHashSet.add("k");
        linkedHashSet.add("j");
        linkedHashSet.add("l");
        linkedHashSet.add("u");

        //print elements in HashSet
        System.out.println("Values in the HashSet are ");
        System.out.println(linkedHashSet);
    }
}

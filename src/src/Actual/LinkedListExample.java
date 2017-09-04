package Actual;

import java.util.LinkedList;

/**
 * Created by HACKER on 08/08/2017.
 */
public class LinkedListExample {
    public static void main(String[]args){
        LinkedList linkedList = new LinkedList();
        linkedList.add("F");
        linkedList.add(2);
        linkedList.add("N");
        linkedList.add("m");
        linkedList.add("J");
        linkedList.add("P");
        linkedList.add("A");

        //print original elements
        System.out.println("Original Elements of the LinkedList are");
        System.out.println(linkedList);

        //remove elements from linkedList
        linkedList.remove("F");
        linkedList.remove(2);

        //print new Values
        System.out.println("Contents after deletion :");
        System.out.println(linkedList);
    }
}

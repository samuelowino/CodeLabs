package Actual;

import java.util.Vector;

/**
 * Created by HACKER on 08/08/2017.
 * Relational Operators|| == && != +
 */
public class VectorsTutorial {
    public static void main(String[]args){
        Vector<Integer> integerVector = new Vector<>(3,2);
        System.out.println("Initial Size "+integerVector.size());
        System.out.println("Intial Capacity"+integerVector.capacity());

        //lets add some elements
        integerVector.addElement(34);
        integerVector.addElement(89);
        integerVector.addElement(77);
        integerVector.addElement(21);

        //lets check current size and capacity
        System.err.println("Capacity after four additions "+integerVector.capacity());
        System.err.println("Size after four additions "+integerVector.size());

        //lets obtain first element
        System.out.println("First Element "+integerVector.firstElement());

        //lets obtain Last Element
        System.out.println("Last Element "+integerVector.lastElement());


    }
}

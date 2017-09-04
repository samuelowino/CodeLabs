package Actual;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/**
 * Created by HACKER on 08/08/2017.
 * Relational Operators|| == && != +
 */
public class TreeMapExample {
    public static void main(String[]args){
        //create the TreeMap instance
        TreeMap tm = new TreeMap();

        tm.put("Zara", new Double(3434.34));
        tm.put("Mike", new Double(456.10));
        tm.put("Joel", new Double(3434.34));
        tm.put("Wilfred", new Double(456.10));
        tm.put("Guran", new Double(3434.34));
        tm.put("Juwel", new Double(456.10));

        //Get a set of the entries
        Set set = tm.entrySet();

        //Get an Iterator
        Iterator i = set.iterator();

        //Display Elements
        while(i.hasNext()){
            Map.Entry me = (Map.Entry)i.next();
            System.out.print(me.getKey());
            System.out.println(me.getValue());
        }
    }
}

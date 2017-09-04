package Actual;

import java.util.Enumeration;
import java.util.Hashtable;

/**
 * Created by HACKER on 08/08/2017.
 * HACKER on 04/08/2017.
 * Relational Operators|| == && != +
 */
public class HashTableTutorial {
    public static void main(String[]args){
        Hashtable<String, Double> balance = new Hashtable<String, Double>();
        Enumeration<String> names;
        String str;
        double bal;

        balance.put("Zara", new Double(3454.45));
        balance.put("Mike", new Double(7454.45));
        balance.put("Joan", new Double(8454.45));
        balance.put("Willy", new Double(454.45));

        //show all balances in hashTable
        names = balance.keys();
        while (names.hasMoreElements()){
            str = names.nextElement();
            System.out.println(str+": "+balance.get(str));
        }



    }
}

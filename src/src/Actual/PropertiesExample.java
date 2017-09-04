package Actual;

import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

/**
 * Created by HACKER on 08/08/2017.
 * Relational Operators|| == && != +
 */
public class PropertiesExample {
    public static void main(String[]args){
        Properties capitals = new Properties();
        Set states;
        String str;

        capitals.put("Illinoise","SpringField");
        capitals.put("Missouri","Jefferson City");
        capitals.put("Washington","Olympia");
        capitals.put("California","Sacremento");
        capitals.put("Indiana","Indianapolis");

        //show all states and capitals in hashTable
        states = capitals.keySet(); // get Set -view of Keys
        Iterator itr = states.iterator();

        while (itr.hasNext()){
            str = (String)itr.next();
            System.out.println("The capital of "+str+" is "+capitals.getProperty(str));
        }

    }
}

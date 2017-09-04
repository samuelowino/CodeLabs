package Actual;

import java.util.LinkedHashMap;

/**
 * Created by HACKER on 08/08/2017.
 * Relational Operators|| == && != +
 */
public class LinkedHashMapExample {
    public static void main(String[]args){
        LinkedHashMap linkedHashMap = new LinkedHashMap();

        linkedHashMap.put("Energy",45334);
        linkedHashMap.put("Speed",180);
        linkedHashMap.put("Fuel",4567);

        //print values
        System.out.println(linkedHashMap.entrySet());
        System.out.println(linkedHashMap.keySet());
    }
}

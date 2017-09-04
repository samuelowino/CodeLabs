package Actual;

import java.util.Enumeration;
import java.util.Vector;

/**
 * Created by HACKER on 07/08/2017.
 * Using Enumerations and Vectors
 * Operators|| == && != +
 */
public class EnumerationAndVectorsTutorial {
    public static void main(String[]args){
        Enumeration<String> days;
        Vector<String> dayName = new Vector<>();

        dayName.add("sunday");
        dayName.add("monday");
        dayName.add("tuesday");
        dayName.add("wednesday");
        dayName.add("thursday");
        dayName.add("friday");

        days = dayName.elements();

        while (days.hasMoreElements()){
            System.out.println(dayName);
        }

    }
}

package batchone.preshow;

import java.util.HashMap; //import
import java.util.stream.Stream;

/**
 * Created by HACKER on 05/08/2017.
 * || == && != ++
 */
public class HashMapUse {
    public static void main(String[]args){
        //create the HashMap
        HashMap<String,Integer> studentMarks = new HashMap<>();

        //populate hashMap
        studentMarks.put("Joan",4500);
        studentMarks.put("Mildred",500);
        studentMarks.put("Dennish",7800);
        studentMarks.put("Felix",300);

        //obtain student marks using Key-name
        System.out.println("Joan's Marks"+studentMarks.get("Joan"));
        System.out.println("Mildred's Marks"+studentMarks.get("Felix"));

        //print all key-value paiers in the map
        System.err.println(studentMarks.keySet());
        System.out.println(studentMarks.entrySet());

        //iterate through using java 8 streams
        Stream.of(studentMarks).forEach(System.err::println);
    }
}

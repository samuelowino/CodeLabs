package batchone.Actual;

import java.util.stream.Stream;

/**
 * Created by HACKER on 04/08/2017.
 * Operators =+ ++
 */
public class ArraysDemo {

    public static void main(String[]args){
        // Integer Arrays
        int[] values = {45,67,89,102,45,78};
        for(int i = 0;i<values.length;i++){
            System.out.println(values[i]);
        }

        //String Arrays
        String[] stringValues = {"Madagasca","Treasure Island","James Gosling","Java One","Github"};
        for (String value: stringValues){
            System.out.println(value);
        }

        //looping through arrays with for-each
        Stream.of(stringValues).forEach(System.err::println);

        //2 Dimensional Arrays
        String[][] valuesTwoDimens = {{"Joan","Mildred"},{"2345 marks","649 marks"}};
        for (int i = 0;i<valuesTwoDimens.length;i++) {
            for (int j = 0;j<valuesTwoDimens.length;j++){
                System.out.println(valuesTwoDimens[i][j]);
            }
        }
    }
}

package batchone.preshow;

import java.util.stream.Stream;


public class LearnArrays {

    public static void main(String[]args){
        //Integer arrays
        int values[] = {12,34,22,33,55,65};

        for(int i = 0;i<values.length;i++ ) {
            System.out.println(values[i]);
        }

        //String array
        String stringValues[] = {"Tom","Blake","Peter","Larson"};
        for (int j = 0;j<stringValues.length;j++){
            System.out.println(stringValues[j]);
        }

        //looping an arrays with for-each
        Stream.of(stringValues).forEach(System.out::println);

        //2-Dimensional Arrays
        String studentDetails[][] = {
                {"Joan","Maxwell","Joan"},
                {"456 marks","200marks","350 marks"},};

        for(int k = 0;k<studentDetails.length;k++){
            for (int l=0;l<studentDetails.length;l++ ){
                System.out.println("["+studentDetails[k][l]);
            }
        }

    }
}

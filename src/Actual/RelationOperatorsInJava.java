package batchone.Actual;

/**
 * Created by HACKER on 04/08/2017.
 * Relational Operators|| == && != +
 */
public class RelationOperatorsInJava {
    public static void main(String[]args){

        //compare numbers with relational  operator ==
        if(200 == 124){
            System.out.println("200 equals 124");
        }else {
            System.out.println("200 is NOT equal to 124");
        }

        //compare number with relational operator ||

        if(200== 124 || 600 == 600){
            System.out.println("200 equals 124 OR 600 equals 600");
        }else {
            System.out.println("200 is not equal to 124 or 600 is NOT equal to 600");
        }

        //compare numbers with relational operator  &&

        if(200==124 && 600 == 600 ){
            System.out.println("200 is equal to 124 AND 600 is equal to 600");
        }else {
            System.out.println("200 not equal to 124 AND 600 is NOT equal to 600");
        }

        //compare number with relational operator  !=

        if(200!=124 ){
            System.out.println("200 is NOT equal to 124");
        }else {
            System.out.println("200 is EQUAL to 124");
        }
    }
}

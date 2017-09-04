package batchone.preshow;

/**
 * Created by HACKER on 04/08/2017.
 *  Relational Operators|| == && !=
 */
public class RelationalOperators {

    public static void main(String[]args){
        //compare number with logical operator ==
        if(200==200){
            System.out.println("124 equals 200");
        }else {
            System.out.println("124 is NOT equal to 200");
        }

        //compare numbers with logical operator ||

        if(124==200 || 200==210){
            System.out.println("true");
        }else {
            System.out.println(false);
        }

        //compare numbers with logical operator &&
        if (200==200 && 200==200){
            System.out.println(true);
        }else {
            System.out.println(false);
        }

        //compare number with logical operator !=
        if(200!=124){
            System.err.println(true);
        }else {
            System.err.println(false);
        }

    }

}

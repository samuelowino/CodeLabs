package Actual;

import java.util.Random;

/**
 * Created by HACKER on 07/08/2017.
 * || == && != +
 */
public class NumberOperationsTutorial {
    public static void main(String[]args){
        int number = 106;
        System.out.println("abs"+Math.abs(number));
        System.out.println("sqr"+Math.sqrt(number));
        System.out.println("ceil "+Math.ceil(number));
        System.out.println("floor "+Math.floor(number));
        System.out.println("round "+Math.round(number));
        System.out.println("min "+Math.min(number,67));
        System.out.println("max "+Math.max(number,800));

        System.out.println("exponential "+Math.exp(number));
        System.out.println("number to power 6"+Math.pow(number,6));
        System.out.println("cos "+Math.cos(number));
        System.out.println("sin "+Math.sin(number));
        System.out.println("tan "+Math.tan(number));
        System.out.println("asin "+Math.asin(number));
        System.out.println("toRadom "+new Random(number).nextInt());


    }
}

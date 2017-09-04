package batchone.preshow;

import java.util.Random;

/**
 * Created by HACKER on 04/08/2017.
 * OPerators =+ ++
 */
public class ArithmenticOperators {

    public static void main(String[]args){

        System.out.println("Sum"+getSum(200,456));
        System.out.println("Difference"+getDifference(1000,500));
        System.out.println("Quotient"+getQuotient(300,10));
        System.out.println("Squire Root"+getSquireRoot(2500));
        System.out.println("Random Values"+getRandomValue(1001));
    }

    //summation function
    public static int getSum(int a,int b){
        return a + b;
    }

    //subtraction function
    public static int getDifference(int a,int b){
        return a-b;
    }

    //division function
    public static int getQuotient(int a,int b){
        return a/b;
    }

    //squire root function
    public static double getSquireRoot(double a){
        return Math.sqrt(a);
    }

    //obtain random value
    public static int getRandomValue(int seed){
        return  new Random(seed).nextInt();
    }



}

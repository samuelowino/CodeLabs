package batchone.Actual;

import javax.sound.midi.SysexMessage;
import java.util.Random;

/**
 * Created by HACKER on 04/08/2017.
 * Operators =+ ++
 */
public class JavaArithmentics {
    public static void main(String[]args){
        System.out.println("Sum"+getSum(200,356));
        System.out.println("Difference"+getDifference(560,1000));
        System.out.println("Quotient"+getQuotient(200,10));
        System.out.println("Sqrt"+getSquireRoot(2500));
        System.out.println("Random Value"+getRandomValue(1002));

    }

    //summation function

    public static int getSum(int a,int b){
        return a+b;
    }

    //suntraction
    public static int getDifference(int a,int b){
        return a - b;
    }

    //division
    public static double getQuotient(int a,int b){
        return a/b;
    }

    //squire root
    public static double getSquireRoot(double value){
        return Math.sqrt(value);
    }

    //random values
    public static int getRandomValue(int seed){
        return new Random(seed).nextInt();
    }
}

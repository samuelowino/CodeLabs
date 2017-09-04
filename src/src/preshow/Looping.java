package batchone.preshow;

/**
 * Created by HACKER on 05/08/2017.
 * || == && != ++
 */
public class Looping {
    public static void main(String[]args){
        //using while-loop
        int count = 1;
        while(count<=35){
            System.out.println(count);
            count++;
        }

        //using do-while loop
        int count_two=1;
        do{
            System.out.println(count_two);
            count_two++;
        }while(count_two<35);

        //using for loop
        for(int count_three=0;count_three<35;count_three++){
            System.out.println(count_three);
        }

    }
}

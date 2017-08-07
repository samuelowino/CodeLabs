package batchone.Actual;

/**
 * Created by HACKER on 05/08/2017.
 * || == && != ++
 */
public class LoopingAndIteration {
    public static void main(String[] args) {
        //looping through with while
        int count = 1;
        while (count <= 35) {
            System.out.println(count);
            count++;
        }

        //looping through with do-while
        int count_two = 0;
        do {
            System.out.println(count_two);
            count_two++;
        } while (count_two<35);

        //looping through with for
        for(int count_three=0;count_three<35;count_three++){
            System.err.println(count_three);
        }

    }
}

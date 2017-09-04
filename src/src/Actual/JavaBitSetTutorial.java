package Actual;

import java.util.BitSet;

/**
 * Created by HACKER on 07/08/2017.
 * Operators|| == && != +
 */
public class JavaBitSetTutorial {
    public static void main(String[]args){
        BitSet bitSet1 = new BitSet(16);
        BitSet bitSet2 = new BitSet(16);

        //set some bits
        for (int i=0;i<16;i++){
            if ((i%2 == 0))bitSet1.set(i);
            if ((i%2 != 0))bitSet2.set(i);
        }
        System.out.println("Initial pattern in bitSet1 is ");
        System.out.println(bitSet1);
        System.out.println("Initial pattern in bitset2 is ");
        System.out.println(bitSet2);

        //AND bits
        bitSet2.and(bitSet1);
        System.out.println("bits2 AND bits1");
        System.out.println(bitSet2);

        //OR bits
        bitSet2.or(bitSet1);
        System.out.println("bits2 OR bits1");
        System.out.println(bitSet2);

        //XOR bits
        bitSet2.xor(bitSet1);
        System.out.println("bits2 XOR bits1");
        System.out.println(bitSet2);
    }


}

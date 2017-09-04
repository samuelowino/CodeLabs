package Actual;

import java.util.EmptyStackException;
import java.util.Stack;

/**
 * Created by HACKER on 08/08/2017.
 * perators|| == && != +
 */
public class StackTutorialGuide {

    //renders push() operations
    public static void showpush(Stack st, int a){
        st.push(new Integer(a));
        System.out.println("push ["+a+"]");
        System.out.println("stack:"+st);
    }

    //renders pop() operations
    public static void showpop(Stack st){
        System.out.print("pop -> ");
        Integer a = (Integer)st.pop();
        System.out.print(a);
        System.out.println("Stack :"+st);

    }

    public static void main(String[]args){
        //create a new Stack instance
        Stack<Integer> integerStack = new Stack<>();
        showpush(integerStack,67);
        showpush(integerStack,34);
        showpush(integerStack,88);
        showpush(integerStack,22);

        try{
            showpop(integerStack);
            showpop(integerStack);
            showpop(integerStack);
            showpop(integerStack);
            showpop(integerStack);
            showpop(integerStack);
            showpop(integerStack);
        }catch (EmptyStackException ex){
            System.err.println("STACK IS NOW EMPTY");
        }

    }
}

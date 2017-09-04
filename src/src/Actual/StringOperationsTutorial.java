package Actual;

/**
 * Created by HACKER on 07/08/2017.
 * Operators|| == && != +
 */
public class StringOperationsTutorial {
    public static void main(String[] args) {
        //creating a String from literals
        String value = "my string value";
        //creating string from a char[] array
        char[] helloString = {'h', 'e', 'l', 'l', 'o', ' ', '!'};
        String value2 = new String(helloString);

        //System.out.println(value2);

        //Working with StringBuffer
        StringBuffer stringBuffer = new StringBuffer("sample text");
        //append function
        stringBuffer.append(" madagascar");
        //reverse function
        stringBuffer.reverse();

        //delete function
        stringBuffer.delete(0, 6);

        //insert function
        stringBuffer.insert(6, "Milky");

        System.out.println(stringBuffer);
    }
}

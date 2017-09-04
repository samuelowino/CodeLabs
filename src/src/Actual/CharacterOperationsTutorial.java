package Actual;

/**
 * Created by HACKER on 07/08/2017.
 */
public class CharacterOperationsTutorial {

    public static void main(String[] args) {
        characterOperationTest('n');
    }

    public static void characterOperationTest(Character c) {

        //basic charater operations
        System.out.println(c.charValue());
        System.out.println(c.equals('f'));
        System.out.println(c.hashCode());
        //More Character Operations
        System.out.println("Is Letter " + Character.isLetter(c));
        System.out.println("Is Digit " + Character.isDigit(c));
        System.out.println("Is Whitespace " + Character.isWhitespace(c));
        System.out.println("Is Uppercase " + Character.isUpperCase(c));
        System.out.println("Is Lowercase " + Character.isLowerCase(c));
        System.out.println("toString() " + c.toString());
    }
}

package Actual;

/**
 * Created by HACKER on 07/08/2017.
 */
public class MoreStringOperations {
    public static void main(String[]args){
        String values = "My name is Xara";
        String value1 = "my NAME is xara";
        System.out.println(values.charAt(6));
        System.out.println(values.compareTo(value1));
        System.out.println(values.equals(value1));
        System.out.println(values.compareToIgnoreCase(value1));
        System.out.println(values.equalsIgnoreCase(value1));
        System.out.println(values.endsWith("ra"));
        System.out.println(values.getBytes().hashCode());
        System.out.println(values.toUpperCase());
        System.out.println(values.toLowerCase());
    }
}

package batchone.preshow;

/**
 * Created by HACKER on 05/08/2017.
 * Operators|| == && != +
 */
public class Conditionals {
    public static void main(String[] args) {
        //using if-else to compare conditions
        String value = "flex";
        if (value.equals("flex")) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }

        //using switch-case to compare conditions
        switch (value) {
            case "flex":
                System.out.println(true);
                break;
            case "FLEX":
                System.out.println(false);
                break;
            default:
                break;
        }
    }
}

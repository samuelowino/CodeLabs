package batchone.Actual;

/**
 * Created by HACKER on 05/08/2017.
 * || == && != +
 */
public class JavaConditionals {
    public static void main(String[] args) {
        //check conditions using if-else
        String testValue = "flex";

        if (testValue.equals("flex")) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }

        //check conditions using switch-case
        switch (testValue) {
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

package Actual;

/**
 * Created by HACKER on 07/08/2017.
 */
public class JavaMethods {
    public static void main(String[]args){
        sayHello();
        System.out.println(returnGreeting());
        whatsYourName("Zane");
        callWhatsYourName("Flexa");
    }

    //method without return type
    public static void sayHello(){
        System.out.println("Subscribe for More");
    }

    //method with return type
    public static String returnGreeting(){
        return "Hello Guyz !! Dont forget to subscribe!!";
    }

    //method with argument
    public static void whatsYourName(String name){
        System.out.println("Name Entered is "+name);
    }

    //method that calls a method
    public static void callWhatsYourName(String name){
        whatsYourName(name);
    }
}

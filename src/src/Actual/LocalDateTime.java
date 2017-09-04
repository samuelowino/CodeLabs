package Actual;

import java.time.LocalDate;
import java.time.LocalTime;

/**
 * Created by HACKER on 05/08/2017.
 * || == && != ++ ALll this code is available on my github [github.com/samuelowino]
 *
 */
public class LocalDateTime {
    public static void main(String[]args){
        //create LocalTime object for current time
        LocalTime nowTime = LocalTime.now();
        System.out.println(nowTime.toString());

        //create LocalDate object for current date
        LocalDate localDate = LocalDate.now();
        System.out.println(localDate.toString());

        //create custom LocalTime object
        LocalTime myTime = LocalTime.of(23,55);
        System.err.println(myTime.toString());

        //create custom LocalDate object
        LocalDate myDate = LocalDate.of(2009,10,20);
        System.err.println(myDate.toString());

        //check if myDate is after today
        System.out.println(myDate.isAfter(localDate));

        //check if myDate is before today
        System.err.println(myDate.isBefore(localDate));

    }
}

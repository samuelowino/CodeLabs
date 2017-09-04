package Actual;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by HACKER on 08/08/2017.
 * Relational Operators|| == && != +
 */
public class MapInterfaceTutorial {
    public static void main(String[]args){
        //create an instance of Map interface using HashMap
        Map<String,Integer> employeeSalaries = new HashMap<>();

        //hdjsjhdh hsdjhbjh
        employeeSalaries.put("Jenny",4500);
        employeeSalaries.put("Accountant Ben",78000);
        employeeSalaries.put("CTO Joe",180000);
        employeeSalaries.put("Manager Greee",90000);
        employeeSalaries.put("Genitor Michael",30000);

        System.out.println("Map Elements"+employeeSalaries);
        System.out.println("Map Keys"+employeeSalaries.keySet());
        System.out.println("Map Entries "+employeeSalaries.entrySet());
    }
}

package org.example;

import java.util.*;

public class App 
{
    public static void main( String[] args )
    {
        //  Key , Value
        Map<String, Integer> luckyNumbers = new HashMap<>();

        luckyNumbers.put("Anka", 8);
        luckyNumbers.put("Anka", 999);
        luckyNumbers.put("Dag", 25);
        luckyNumbers.put("Lotto", 17);

        System.out.println(luckyNumbers);
        System.out.println(luckyNumbers.keySet());
        System.out.println(luckyNumbers.containsKey("Anka"));
        System.out.println(luckyNumbers.containsValue("999"));
        System.out.println(luckyNumbers.getOrDefault("Anka", 666));

        /*
        List<Boolean> results = new ArrayList<>();
        Set<String> names = new HashSet<>();

        results.add(names.add("Ulf"));
        results.add(names.add("Ulf"));// will not be added
        results.add(names.add("Fredrik"));
        results.add(names.add("Erik"));
        results.add(names.add("Simon"));

        for (String name : names ) {
            System.out.println(name);
        }

        for (boolean item : results)
        {
            System.out.println(item);
        }
        */

        /*
        MyList<Integer> numbers = new MyList<Integer>();

        numbers.addToList(12);

        MyList<String> names = new MyList<>();

        names.addToList("Ulf");
        */
    }
}

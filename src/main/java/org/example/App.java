package org.example;

import java.util.*;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
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
        /*
        MyList<Integer> numbers = new MyList<Integer>();

        numbers.addToList(12);

        MyList<String> names = new MyList<>();

        names.addToList("Ulf");
        */
    }
}

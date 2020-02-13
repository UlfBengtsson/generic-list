package org.example;

public class MyList<T> {

    private T[] theList = (T[]) new Object[10];
    private int counter = 0;

    public void addToList(T item)
    {
        if (counter < theList.length)
        {
            theList[counter++] = item;
        }
    }
}

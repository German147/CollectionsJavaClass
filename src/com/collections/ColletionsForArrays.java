package com.collections;

import java.util.*;

    /* We can use Collections.sort() to sort an array
    after creating a ArrayList of given array items.
    Here I use a Collection.sort() to sort an already created array*/
public class ColletionsForArrays {
    public static void main(String[] args) {
        //I Create an array of Strings
        String animals[] = {"Dog", "Cat", "Parrot",
                "Mouse", "Bird", "Rabbit", "Fox"};

        //Here I make a list named animaList
        List animaList = new ArrayList(Arrays.asList(animals));

        // Now we can use the Collection.sort() method to sort the list elements
        Collections.sort(animaList);

        /*We can also use the descending order like this
        Collections.sort(animaList,Collections.reverseOrder()); */

        //Now we can print the result
        System.out.println("The List of animal from the array animaList is this: " + animaList);

    }
}

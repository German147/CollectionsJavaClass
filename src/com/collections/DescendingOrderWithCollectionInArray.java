package com.collections;

import java.util.ArrayList;
import java.util.Collections;

    /*Java programm to use Collections.sort() in a descending order*/
public class DescendingOrderWithCollectionInArray {
    public static void main(String[] args) {
//Here we create a list of strings
        ArrayList<String> names = new ArrayList<String>();
        names.add("German");
        names.add("Leandro");
        names.add("Martina");
        names.add("Evange");
        names.add("Alberto");
        names.add("Carlos");
        names.add("Zoe");
        names.add("Uma");
        /*Now we invoque the Collections.sort() method to sort
         the elemens but in a descending order of this array*/
        Collections.sort(names,Collections.reverseOrder());

        //Now we can Print the sorted list
        System.out.println("Here the list after using Collections.sort() in a descending order : \n " + names );

    }
}

package com.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

    //Java program demonstrating the use of Collections.sort()
public class Main {

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

        /*Now we invoque the Collections.sort method to sort the elemens of this array
        * in ascending order*/
        Collections.sort(names);

        //Now we can Print the sorted list
        System.out.println("Here the list after using Collections.sort() : \n " + names );
    }
}

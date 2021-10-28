package com.collections.SortingAsUserWants;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

//Here the Driver class that perform the main workflow
public class MainPerformerClass  extends Worker{
    public static void main(String[] args){

          /*Here we use this class to for sorting in ascending order of
     roll number*/
        class sortByRolNumber implements Comparator<Worker> {
            public int compare(Worker a, Worker b) {
                return a.rolNumber - b.rolNumber;
            }

        }

        ArrayList<Worker> wkr = new ArrayList<Worker>();
        wkr.add(new Worker(4, "Manuel", "Mateos", 55, 23));
        wkr.add(new Worker(1, "Luis", "Barrera", 38, 25));
        wkr.add(new Worker(3, "Jose", "Perez", 28, 65));
        wkr.add(new Worker(2, "German", "Cecato", 45, 35));

        System.out.println("Heer we print the unsorted List of Workers :");
        for (int i = 0; i < wkr.size(); i++)
            System.out.println(wkr.get(i));

        Collections.sort(wkr, new sortByRolNumber());
        System.out.println("\nNow it is Sorted by roll number");
        for (
                int i = 0; i < wkr.size(); i++)
            System.out.println(wkr.get(i));
    }

}




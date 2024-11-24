package com.iesvdm.exercise7;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;

public class Exercise7 {
    public static void main(String[] args) {
        /***
         Write lambda code for a Comparator object that orders List objects in order of their length.
         Then write code for a Comparator object that orders List objects in the order of the sum of their integers
         (the sum is all the integers in the list added together, you can use stream to obtain this sum).
         Use these Comparator objects and the two-argument method max from Java’s class Collections
         to find the longest list and the list which adds up to the most from the set of lists from a HashSet object,
         for example as created in question 3.
         Also create a version of the previous code using stream comparing, sorted and max functions of the API stream.
         ***/


        HashSet<List<Integer>> hashSet = new HashSet<>(List.of(
                List.of(1, 2, 3),
                List.of(4, 5, 6, 7),
                List.of(8, 9)
        ));

        //po Longitud
        Comparator<List<Integer>> byLength = Comparator.comparingInt(List::size);

        //por suma
        Comparator<List<Integer>> bySum = Comparator.comparingInt(list -> list.stream().mapToInt(Integer::intValue).sum());

        //listas mas larga
        List<Integer> longestList = Collections.max(hashSet, byLength);
        System.out.println("Longest list: " + longestList);

        //listas con mayor suma
        List<Integer> listWithMaxSum = Collections.max(hashSet, bySum);
        System.out.println("List with max sum: " + listWithMaxSum);


        //usando stream
        System.out.println();
        System.out.println("Usando Stream");
        System.out.println("-----------------------------------");
        List<Integer> longestListStream = hashSet.stream()
                .max(Comparator.comparingInt(List::size))
                .orElse(List.of());
        System.out.println("Longest list: " + longestListStream);

        System.out.println("-----------------------------------");

        List<Integer> listWithMaxSumStream = hashSet.stream()
                .max(Comparator.comparingInt(list -> list.stream().mapToInt(Integer::intValue).sum()))
                .orElse(List.of());
        System.out.println("List with max sum: " + listWithMaxSumStream);

    }
}

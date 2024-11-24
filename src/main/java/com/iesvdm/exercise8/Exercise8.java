package com.iesvdm.exercise8;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;

public class Exercise8 {
    public static void main(String[] args) {
        /***
         Modify your answer to question 3 to store the set of lists of integers as a TreeSet object
         with an ordering given by the second Comparator object of question 7.
         Then also store the set of lists of integers as a TreeSet object with an ordering given by the first Comparator object of question 7.
         Compare the results.
         ***/
        HashSet<List<Integer>> hashSet = new HashSet<>(List.of(
                List.of(1, 2, 3),
                List.of(4, 5, 6, 7),
                List.of(8, 9)
        ));

        Comparator<List<Integer>> byLength = Comparator.comparingInt(List::size);
        Comparator<List<Integer>> bySum = Comparator.comparingInt(list -> list.stream().mapToInt(Integer::intValue).sum());


        List<Integer> longestList = Collections.max(hashSet, byLength);
        System.out.println("Lista más larga: " + longestList);


        List<Integer> maxSumList = Collections.max(hashSet, bySum);
        System.out.println("Lista con mayor suma: " + maxSumList);

        longestList = hashSet.stream().max(byLength).orElse(Collections.emptyList());
        maxSumList = hashSet.stream().max(bySum).orElse(Collections.emptyList());
        System.out.println("Lista más larga (Stream): " + longestList);
        System.out.println("Lista con mayor suma (Stream): " + maxSumList);


    }
}

package com.iesvdm.exercise1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;

public class Exercise1 {
    public static void main(String[] args) {
        /**
         *Write a lambda to define a Comparator which compares two integers according to
         * their closeness to an integer given externally and caught in the closure of the lambda.
         *  For example, if the integer given is 25,
         *  then 22 should be greater than 30 according to the Comparator object because 22 is closer to 25 (3 difference) than 30 (5 difference).
         *  Demonstrate using this to sort an ArrayList using Java’s built-in sort method,
         *  and to construct a TreeSet ordered by a Comparator of this type, and by a stream using its built-in sort method.
         */

        int externalIntreger= 25;
        Comparator<Integer> comparator = (a, b) -> {
            int diffA = Math.abs(externalIntreger - a);
            int diffB = Math.abs(externalIntreger - b);
            return diffA - diffB;
        };

        List<Integer> numeros = Arrays.asList(30, 22, 40, 18, 26);
        numeros.sort(comparator);
        System.out.println( "Lista ordenada :"  + numeros);


        TreeSet<Integer> treeSet = new TreeSet<>(comparator);
        treeSet.addAll(numeros);
        System.out.println( "TreeSet ordenado :"  + treeSet);


        System.out.println("Stream ordenado");
        numeros.stream().sorted(comparator).forEach(System.out::println);

    }
}

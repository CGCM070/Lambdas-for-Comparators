package com.iesvdm.exercise2;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Exercise2 {
    public static void main(String[] args) {
        /**
         * Write two programs, each of which reads in some words all on one line,
         * stores them in an object referred to by a variable of type Set and then
         * prints them out, each word on a separate line, using the for-each method.
         * In one program the object should be of actual type HashSet, in the other
         * of actual type TreeSet.
         */

        Set<String> hashSet = new HashSet<>();
        Set<String> treeSet = new HashSet<>();

        List<String> palabras = List.of("hola", "adios", "hasta luego", "hasta mañana");
        System.out.println("HashSet");
        hashSet.addAll(palabras);
        hashSet.forEach(System.out::println);

        System.out.println();
        System.out.println("--------------------");

        System.out.println("TreeSet");
        treeSet.addAll(palabras);
        treeSet.forEach(System.out::println);

    }
}

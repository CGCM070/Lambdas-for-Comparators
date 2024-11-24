package com.iesvdm.exercise3;

import org.junit.Test;

import java.util.*;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toSet;

public class Exercise3 {
    public static void main(String[] args) {

        /***
         Write a program that reads several lines of text consisting only of integers.
         The integers in each line should be stored in an object of type List (integers are separated by spaces),
         and this representation of each line should be stored in an object of type HashSet.
         Then the program should print out the contents of this set using forEach method for the object of type List,
         and the forEach for the object of type HashSet.
         ***/
        Scanner scanner = new Scanner(System.in);
        List<Set<Integer>> list = new ArrayList<>();

        System.out.println("Introduce una serie de números separados por espacios");
        String line;
        while (!(line = scanner.nextLine()).isEmpty()) {
          Set<Integer> Set = Arrays.stream(line.split("\\s+")).
                  filter(n -> n.matches("\\d+"))
                    .map(Integer::parseInt)
                  .collect(Collectors.toSet());
               list.add(Set);

        }
        System.out.println("Contenido de la lista de Sets");
        list.forEach(System.out::println);
        // 1 1 1 3 3 3 5 6 7 7 8 9 564
        // eseperado [1, 3, 5, 6, 7, 8, 9, 564]
    }




}

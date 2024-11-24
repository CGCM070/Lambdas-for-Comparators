package com.iesvdm.exercise5;

import java.util.*;
import java.util.stream.Collectors;

public class Exercise5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Set<Integer>> listOfSets = new ArrayList<>();

        System.out.println("Introduce líneas (solo se guardarán enteros):");
        String line;
        while (!(line = scanner.nextLine()).isEmpty()) {
            Set<Integer> set = Arrays.stream(line.split("\\s+"))
                    .filter(num -> num.matches("\\d+"))
                    .map(Integer::parseInt)
                    .collect(Collectors.toSet());
            listOfSets.add(set);
        }

        System.out.println("Contenido del List de Sets:");
        listOfSets.forEach(System.out::println);
    }
}


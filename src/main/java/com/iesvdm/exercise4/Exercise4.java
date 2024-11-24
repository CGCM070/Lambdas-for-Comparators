package com.iesvdm.exercise4;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Exercise4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        HashSet<List<Integer>> hashSet = new HashSet<>();

        System.out.println("Introduce líneas (solo se guardarán enteros):");
        String line;
        while (!(line = scanner.nextLine()).isEmpty()) {
            List<Integer> list = Arrays.stream(line.split("\\s+"))
                    .filter(num -> num.matches("\\d+"))
                    .map(Integer::parseInt)
                    .collect(Collectors.toList());
            hashSet.add(list);
        }

        System.out.println("Contenido del HashSet:");
        hashSet.forEach(System.out::println);
    }
}

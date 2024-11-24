package exercise6;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;


public class Exercise6 {
    public static void main(String[] args) {

    HashSet<List<Integer>> hashSet = new HashSet<>(List.of(
            List.of(1, 2, 3, 4, 5),
            List.of(1, 2, 3, 4, 5, 6, 7, 8, 9),
            List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11)
    ));

    System.out.println(longestList(hashSet));
    }


    /***
     Write your own static method that will take a HashSet object
     and return from it the List object within it that is the longest
     using the reduce method of corresponding stream.
     If the HashSet is empty, it should return an empty List object.
     Use this method with the HashSet object created in the answer to question 3.
     ***/

    public static List<Integer> longestList(HashSet<List<Integer>> hashSet) {
        return hashSet.stream()
                .reduce((list1, list2) -> list1.size() > list2.size() ? list1 : list2)
                .orElse(new ArrayList<>());
    }

}

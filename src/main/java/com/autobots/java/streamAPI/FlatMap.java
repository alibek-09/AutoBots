package com.autobots.java.streamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMap {
    public static void main(String[] args) {

        List<List<String>> nestedList = List.of(
                List.of("A", "B"),
                List.of("C", "D"),
                List.of("E")
        );
        System.out.println(nestedList);

        List<String> nonNested = new ArrayList<>();
        for (List<String> list : nestedList){
            nonNested.addAll(list);
        }
        System.out.println(nonNested);

        System.out.println("______________");

        List<String> nonNestedWithStream = nestedList.stream()
                .flatMap(List ::stream )
                .collect(Collectors.toList());
        System.out.println(nonNestedWithStream);


    }
}

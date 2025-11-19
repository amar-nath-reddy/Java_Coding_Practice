package org.example.streams.easy;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FindDistinctElemts {
    public static void main(String[] args) {
        //find all distinct elments remove duplicate
        List<Integer> num =Arrays.asList(2,2,3,5,3,6,7,8,4);

        //Approch 1 using strems
        num.stream()
                .distinct()
                .toList();
        System.out.println("FindDistinctElemts:"+num.stream()
                .distinct()
                        .sorted()
                .toList());

        //Approch 2 using set
        Set<Integer> num1 =  num.stream().collect(Collectors.toSet());// not req sorting
        System.out.println("Approch 2 using set:"+num1);

    }
}

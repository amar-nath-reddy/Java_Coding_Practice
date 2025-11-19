package org.example.streams.easy;

import java.util.Arrays;
import java.util.List;

public class AvgOfNumber {
    public static void main(String[] args) {
        List<Integer> num = Arrays.asList(5,10,15,20,25);
       int sumoflist = num.stream()
                .reduce(0, Integer::sum);

        Long count =  num.stream().count();
        System.out.println("AVG in list:"+sumoflist/count);

        //another approach using only streams

      double avgnumber=  num.stream()
                .mapToInt(Integer::intValue)
                .average()
                .orElse(0.0);
        System.out.println("Avg number using Streams:"+avgnumber);

    }
}

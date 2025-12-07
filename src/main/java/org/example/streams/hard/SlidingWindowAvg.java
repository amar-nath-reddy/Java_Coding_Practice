package org.example.streams.hard;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class SlidingWindowAvg {
    public static void main(String[] args) {
        List<Integer> num = Arrays.asList(4,8,15,16,23,42);
int window = 3;
        List<Double> collectnum = IntStream.range(0, (num.size() - (window - 1)))
                .mapToObj(i -> num.subList(i, i + window))
                .map(w -> w.stream()
                        .mapToInt(Integer::intValue)
                        .average().orElse(0.0)).toList();

        System.out.println(collectnum);

     /*
         Convert each index into a sublist using mapToObj
         java.mapToObj(i -> num.subList(i, i + window))
         For i = 0 → num.subList(0, 3) → [2, 4, 6]

         For i = 1 → num.subList(1, 4) → [4, 6, 8]

         For i = 2 → num.subList(2, 5) → [6, 8, 10]
         But you need objects (like List<Integer>) to work with sublists.

         [[2,4,6], [4,6,8], [6,8,10]]

      */

    }



}

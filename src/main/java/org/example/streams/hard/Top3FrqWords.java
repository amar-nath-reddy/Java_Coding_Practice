package org.example.streams.hard;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Top3FrqWords {

    public static void main(String[] args) {
        String value = "java is lang, java is grate, and the java is king..";

        Map<String, Long> wordsvalu = Arrays.stream(
                value.toLowerCase()
                        .replaceAll("[^a-z\\\\s]", "")
                        .split(" "))
                .collect(Collectors
                                 .groupingBy(Function.identity(),Collectors.counting()));


        System.out.println(wordsvalu);

    }
}
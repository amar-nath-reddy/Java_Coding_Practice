package org.example.streams.hard;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ReverseEachWordInSting {

    public static void main(String[] args) {
        String  value = "Java Streams are very powerful";

        String name = "Amarnath";

        String collect = Arrays.stream(value.split(" "))
                .map(e -> new StringBuilder(e).reverse().toString()).sorted()
                .collect(Collectors.joining(" "));
        System.out.println(collect);


        String stringStream = Arrays.stream(name.split(" "))
                .map(st -> new StringBuilder(st).reverse().toString())
                        .collect(Collectors.joining());
        System.out.println(stringStream);



    }
}

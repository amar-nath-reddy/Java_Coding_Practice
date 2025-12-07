package org.example.practiceproblems;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Stringchar {
    public static void main(String[] args) {
        String name = "aaffdsdekjfhkkv";
        // we can not stream a string for that we ues Arrays.stream

       List<String> nms = Arrays.stream(name.split(""))
                .distinct()
                .collect(Collectors.toList());
       int siz = nms.size();

        Map<String, Long> collect = Arrays.stream(name.split(""))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        int collectsiz = name.length();

        System.out.println("sorted string with remoed dulicate::"+nms +"Size od sting::"+siz);
        System.out.println(" string with count of charetes::"+collect +"Size od sting::"+collectsiz);

        String words = "my name is amarnath";
        String s = Arrays.stream(words.split(" "))
                .max(Comparator.comparing(String::length)).get();
        System.out.println(" word that has the highest length::"+s);


        Optional<Map.Entry<Character, Long>> first = name.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream().skip(1).findFirst();
        System.out.println("first"+first);
    }
}

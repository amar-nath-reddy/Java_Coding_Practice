package org.example.streams.hard;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

public class LongestWordFinder {
    public static void main(String[] args) {
        String val = "my Name is Amarnath Reddy, i am a java, devloeper.";

       String s=  Arrays.stream(val.toLowerCase()
                        .replaceAll("[^a-z\\s]","")
                        .split(" "))
                              .max(Comparator.comparing(String::length))
                              .orElse("");
        System.out.println(s);
    }
}

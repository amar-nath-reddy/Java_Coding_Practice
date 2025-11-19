package org.example.streams.easy;

import java.util.Arrays;
import java.util.List;

public class CountStringChar {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Amar","Avai","Dinesh","Robo");

        System.out.println("letter srrts with a:"+ names.stream()
                .filter(na->na.startsWith("A"))
                .toList());
    }
}

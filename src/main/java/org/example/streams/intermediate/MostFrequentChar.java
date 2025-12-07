package org.example.streams.intermediate;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MostFrequentChar {

    public static void main(String[] args) {

        String value = "amarnath";

        Map.Entry<Character, Long> collect = value.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream().max(Map.Entry.comparingByValue())
                .orElseThrow();
        System.out.println(collect);

        String value1 = "lwieugvabsvubbuuhowvebioiudrfrkwkjkosdf";
        Map<Character, Long> characterLongEntry = (Map<Character, Long>) value1.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        System.out.println(characterLongEntry);
    }
}

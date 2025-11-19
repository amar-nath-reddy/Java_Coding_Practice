package org.example.streams.intermediate;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/**
 * Examples of finding elements in a list using Java Streams.
 */
public class FindFirstNumberGreaterInList {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(3, 7, 12, 5, 11, 20);
        final int threshold = 10;

        // Print the first number >= threshold (preserves encounter order)
        numbers.stream()
                .filter(n -> n >= threshold)
                .findFirst()
                .ifPresent(n -> System.out.println("First number >= " + threshold + ": " + n));

        // Demonstrate safe Optional handling
        Optional<Integer> firstOpt = numbers.stream()
                .filter(n -> n >= threshold)
                .findFirst();
        System.out.println(firstOpt
                                   .map(n -> "firstOpt: " + n)
                                   .orElse("No number >= " + threshold + " found."));

        // If you want the smallest number >= threshold, use min instead of sorting the whole stream
        Optional<Integer> smallestOpt = numbers.stream()
                .filter(n -> n >= threshold)
                .min(Integer::compareTo);
        smallestOpt.ifPresent(n -> System.out.println("Smallest number >= " + threshold + ": " + n));
    }
}
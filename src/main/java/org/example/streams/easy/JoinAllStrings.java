package org.example.streams.easy;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class JoinAllStrings {
    public static void main(String[] args) {

        List<String> fruits = Arrays.asList("Apple","Banana","Orange");
        String joinedString =fruits.stream()
                .collect(Collectors.joining());
        System.out.println(joinedString);  //outpit--->  AppleBananaOrange

        String joinedString1 =fruits.stream()
                .collect(Collectors.joining(",","[","}"));// we can use delimiter like , and use prefix and postfix
        System.out.println("After using delimiter:"+joinedString1+"Length:"+joinedString1.length());


    }
}

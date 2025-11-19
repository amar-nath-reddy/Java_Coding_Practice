package org.example.streams.stremssupereasy;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SquareNumber {

    public static void main(String[] args) {

        List<Integer> num = Arrays.asList(2,3,4,5,6);

        // I need to Perform square root like 2*2,3*3 etc

        System.out.println("Suare of Numbers n*n :"+num.stream()
                .map(squre->squre*squre) // need to modifie and transform
                .collect(Collectors.toList()));

        //square Even numbers
        System.out.println("Suare of EvenNUmbers n*n :"+num.stream()
                        .filter(even->even%2 ==0)// filtered for even then squred it
                .map(squre->squre*squre) // need to modifie and transform
                .toList());//latest update insted of .collect(Collectors.toList())); use toList() in java 19

    }
}

package org.example.streams.stremssupereasy;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class NumbersGraterthaninList {
    public static void main(String[] args) {
        List<Integer> num = Arrays.asList(2,3,6,8,10,1,7);

        num.stream()
                .filter(nu->nu >=10)
                .sorted()
                .findFirst();
        System.out.println("NumbersGraterthaninList:"+ num.stream()
                .filter(nu->nu >= 5)
                .count());

    }
}

package org.example.streams.stremssupereasy;

import java.util.Arrays;
import java.util.List;

public class MaxNumber {
    public static void main(String[] args) {
        List<Integer> num = Arrays.asList(2,3,6,8,10,1,7);

        System.out.println("MaxNumber:"+
                num.stream()
                        .reduce(0,(a,b)->Integer.max(a,b)));
    }
}

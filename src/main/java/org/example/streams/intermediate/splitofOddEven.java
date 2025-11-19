package org.example.streams.intermediate;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class splitofOddEven {

    public static void main(String[] args) {
        List<Integer> num = Arrays.asList(1,2,3,4,5,6,7,8,9);

        Map<Boolean,  List<Integer>> oddandeven= num.stream()
                .collect(Collectors.partitioningBy(evn->evn%2==0));

        // partitioningBy will store the data in 2 ways tru and false and we store in map and we retrieve it

        System.out.println("Even NUmbers::"+oddandeven.get(true));
        System.out.println("Odd NUmbers::"+oddandeven.get(false));
    }
}

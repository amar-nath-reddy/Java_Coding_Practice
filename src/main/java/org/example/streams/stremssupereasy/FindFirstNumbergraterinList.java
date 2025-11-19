package org.example.streams.stremssupereasy;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FindFirstNumbergraterinList {
    public static void main(String[] args) {
        List<Integer> num = Arrays.asList(3,7,12,5,11,20);
        num.stream()
                .filter(number->number >=10)
                .findFirst().stream().toList().forEach(System.out::println);

      Optional<Integer> FindFirstNumbergraterinList =  num.stream()
                .filter(number->number >=10)
                .findFirst();
        System.out.println("FindFirstNumbergraterinList:"+FindFirstNumbergraterinList.get());

        Optional<Integer> FindFirstNumbergraterinList1 =  num.stream()
                .filter(number->number >=10)//12,11,20
                .sorted()//11,12,20
                .findFirst();

        System.out.println("FindFirstNumbergraterinList:"+FindFirstNumbergraterinList1.get());
    }
}

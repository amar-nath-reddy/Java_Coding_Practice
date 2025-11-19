package org.example.streams.stremssupereasy;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterEvenNumbers {
    public static void main(String[] args) {
        //even Number and OddNumbers
        // even Numbers 2,4,6 with dives 2 and == 0
        List<Integer> numbers =
                Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,21,22);

        // Now Here we are going To Performer  FilterEvenNumbers

        List<Integer> even  =numbers.stream()
                .filter( evn->evn%2 == 0)
                .collect(Collectors.toList());
        even.forEach(System.out::println);

     int evenSum  =numbers.stream()
                .filter( evn->evn%2 == 0)
                        .reduce(0,(a,b)->a+b);
        System.out.println("Sum of evn in LIst :"+evenSum);


        System.out.println("Returning the filterEvenNumbers from method ");
        List<Integer> evenNumbersreturndBymethod
                = FilterEvenNumbers.filterEvenNumbers(numbers);
        System.out.println(evenNumbersreturndBymethod);

    }
    //I want to Perform  same  in method but it has return type
    //Filter is the intermediate operation it won't take effect untile we
    //use terminal on that .

    public static List<Integer> filterEvenNumbers(List<Integer> numbers){
       return numbers.stream()
                .filter( evn->evn%2 == 0)
                .collect(Collectors.toList());

    }
}

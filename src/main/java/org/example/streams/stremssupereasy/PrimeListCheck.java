package org.example.streams.stremssupereasy;

import java.util.*;
import java.util.stream.Collectors;

public class PrimeListCheck {

    // Method to check if a number is prime or not prime
    // 0 and 1 are not prime
    //prime numbers are 1 and by it factores like 3 ,5
    //having more than 1 factor called not prime called composit numbers 6->2*3,3*2,6*1
    public static boolean isPrime(int n) {
        if (n <= 1)
            return false; // 0 and 1 are not prime
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0)
                return false; // divisible → not prime
        }
        return true; // no divisors found → prime
    }



    public static void main(String[] args) {
        // Example list of numbers
        List<Integer> numbers = Arrays.asList(2, 3, 4, 5, 10, 13, 17, 20, 23,30);

        // Check each number
        for (int num : numbers) {
            if (isPrime(num)) {
                System.out.println(num + " is a prime number.");
            } else {
                System.out.println(num + " is not a prime number.");
            }
        }

        Map<Boolean, List<Integer>>  primenumb = numbers.stream()
             .collect(Collectors.partitioningBy(PrimeListCheck::isPrime));
        System.out.println("Prime:"+primenumb.get(true));
        System.out.println("Not - Prime:"+primenumb.get(false));
    }
}

package org.example;

public class PracticeTest {
    public static void main(String[] args) {
        int total_amount = 4800;
        int percent = 6;
        int result = total_amount * percent / 100;
        int final_amount = total_amount - result;
        System.out.println("percentage: " + result);
        System.out.println("after discount Final Amount : " + final_amount);
    }
}

package org.example.practicemodels;

import java.util.Scanner;

public class Percentage {
    public static void main(String[] args) {
        //scanner to give the percentage and amount
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Total amount:");
        int total_amount = sc.nextInt();
        System.out.println("Total amount:"+total_amount);

        System.out.println("Enter the discount:");
        int discount = sc.nextInt();
        System.out.println("discount:"+discount);

        Percentage percentage= new Percentage();
        int discounted_amount = percentage.percentage(total_amount,discount);
        System.out.println("After discount The Price : "+discounted_amount);

    }
    // this method returns the percentage
    public int percentage(int amount,int discounts ){
        return amount/discounts*100;
    }
}

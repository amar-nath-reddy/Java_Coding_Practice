package org.example.forloop;

public class testing_loops {
    public static void main(String[] args) {

        int n = 5;


        for (int i = 1; i <= n; i++) // 5 time will run
        { for (int j = n; j > i; j--) {  // 5 , 5>1 ,4
            System.out.print(' ');
        } for (int k = 1; k <= (2 * i - 1); k++) {
            System.out.print('*');
        } System.out.println();
        }



    }
}

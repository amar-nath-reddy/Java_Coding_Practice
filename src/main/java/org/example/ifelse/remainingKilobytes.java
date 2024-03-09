package org.example.ifelse;

public class remainingKilobytes {

    public static void main(String[] args) {
        printMegaBytesAndKiloBytes(2500);
    }
    public static void  printMegaBytesAndKiloBytes ( int kiloBytes){
        if (kiloBytes < 0 ){
            System.out.println("Invalid Value");
            return;
        }

        double megabytes = kiloBytes / 1024; //we can get MB
        int remainingKilobytes = kiloBytes % 1024;  // we get remaing kb
        System.out.println(kiloBytes + " KB = " + megabytes + " MB and " + remainingKilobytes + " KB");

    }
}

package org.example.ifelse;


    public class LeapYear {
        public static void main(String[] args) {
            isLeapYear(2024);
        }
        public static boolean isLeapYear(int year){
            if (year<1 || year>9999){
                return false;
            }else{
                return (year%4==0) && (year%100!=0) || year%400==0;
            }
        }

    }



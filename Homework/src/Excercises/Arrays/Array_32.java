package Excercises.Arrays;

import java.time.Month;
import java.util.Scanner;

public class Array_32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int days = sc.nextInt();
        int month = sc.nextInt();
        month -=1;
        int years = sc.nextInt();
        int[] count = new int[]{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        days+=2;
        if(years%4==0 && (years%100!=0)){
            count[1] = 29;
        }
        if (days>count[month]){
            days = days - count[month];
            month++;
        }
        if (month>11){
            month=12-month;
            years++;
        }
        System.out.println(days+" "+(month+1)+" "+years);

    }
}

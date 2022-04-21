package Excercises.Arrays;

import java.util.Scanner;

public class Array_33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int days = sc.nextInt();
        int month = sc.nextInt();
        int countofdays=0;
        int years1;
        month -=2;
        int years = sc.nextInt();
        years-=1;
        int[] count = new int[]{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        years1 = years/4;
        countofdays = (years*365)+years1;
        while(month>-1){
            countofdays +=count[month];
            month-=1;
        }
        countofdays += days;
        System.out.println(countofdays);



    }
}

package Excercises.Arrays;
import java.util.*;

public class Array_31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int days = sc.nextInt();
        int monthcount = 0;
        int[] count = new int[]{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        while (days>count[monthcount]) {
            days = days - count[monthcount];
            monthcount++;
        }
        System.out.println(days+" "+(monthcount+1));

    }
}

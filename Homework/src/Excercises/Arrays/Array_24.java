package Excercises.Arrays;
import java.util.Scanner;

public class Array_24 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int[][] arr = new int[a][b];

        for (int i = 0; i < a; i++) {

            arr[i] = new int[a - i];
            for (int j = 0; j < a - i; j++) {
                if (i == 0 || j == 0) {
                    arr[i][j] = 1;
                } else {
                    arr[i][j] = arr[i][j - 1] + arr[i - 1][j];
                }
            }}
        for (int[] row : arr) {
            for (int el : row)
                System.out.printf(" %2d", el);
            System.out.println();
        }}}

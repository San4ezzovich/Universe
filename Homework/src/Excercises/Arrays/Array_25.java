package Excercises.Arrays;
import java.util.Scanner;

public class Array_25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int  n = sc.nextInt();
        int[][] m = new int[n][n];
        int i = n/2 ;
        int j = n/2 ;
        int min_i = i; int max_i = i;
        int min_j = j; int max_j = j;
        int d = 0;
        for (int a = 0; a < n * n; a++) {
            m[i][j] = a;
            switch (d) {
                case 0:
                    i -= 1;
                    if (i < min_i) {
                        d = 1;
                        min_i = i;
                    }
                    break;
                case 1:
                    j -= 1;
                    if (j < min_j) {
                        d = 2;
                        min_j = j;
                    }
                    break;
                case 2:
                    i += 1;
                    if (i > max_i) {
                        d = 3;
                        max_i = i;
                    }
                    break;
                case 3:
                    j += 1;
                    if (j > max_j) {
                        d = 0;
                        max_j = j;
                    }
            }
        }

        for (int k = 0; k < n; k++) {
            for (int v = 0; v < n; v++)
                System.out.print(m[k][v] + "\t");
            System.out.println();
        }
    }
}

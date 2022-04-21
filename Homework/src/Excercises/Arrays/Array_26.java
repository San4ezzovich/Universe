package Excercises.Arrays;
import java.util.Scanner;

public class Array_26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int  n = sc.nextInt();
        int[][] m = new int[n][n];
        int min = 0,max = n*n;
        while (min<max){
            for(int i = 0;i<n;i++) {
                if (i % 2 == 0) {
                    for (int j = 0; j < n; j++) {
                        m[i][j] = min;
                        min++;
                    }
                }
                else{
                        for (int j = n-1; j >= 0; j--) {
                            m[i][j] = min;
                            min++;
                        }
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

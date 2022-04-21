package Excercises.Arrays;
import java.util.Scanner;

public class Array_27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int  n = sc.nextInt();
        int[][] a = new int[n][n];
        int m = 1;
        for(int i =0;i<n*2-1;i++){
            for(int j=0;j<=i;j++){
               if (i-j>=n||j>=n) continue;
                a[j][i-j]=m;
               m++;
            }
        }
        for (int k = 0; k < n; k++) {
            for (int v = 0; v < n; v++)
                System.out.print(a[k][v] + "\t");
            System.out.println();
        }
    }
}

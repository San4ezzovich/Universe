package Excercises.Arrays;
import java.util.Scanner;

public class Array_29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int  n = sc.nextInt();
        int  m = sc.nextInt();
        int[][] a = new int[n][m];
        int[][] b = new int[m][n];
        for(int i=0;i<n;i++){
            for(int j=0; j<m;j++){
                a[i][j] = sc.nextInt();
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0; j<m;j++){
                b[j][n-i-1] = a[i][j];
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++)
                System.out.print(b[i][j] + "\t");
            System.out.println();
        }
    }
}

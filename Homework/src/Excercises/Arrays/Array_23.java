package Excercises.Arrays;
import java.util.ArrayList;
import java.util.Scanner;

public class Array_23 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int [][] arr = new int [a][b];
        int i = 0, j = 0;
        for ( int k = 0; k < a *b; ++k, ++j ) {

            if ( k != 0 && k % b == 0 ) {
                ++i;
                j = 0;
                System.out.println();
            }

            arr[ i ][ j ] = i * j;
            System.out.format( "%4d", arr[ i ][ j ] );

        }
}
}

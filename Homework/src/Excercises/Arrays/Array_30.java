package Excercises.Arrays;
import java.util.Scanner;

public class Array_30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int  n = sc.nextInt();
        int[][] a = new int[n][n];
        int x = 0;
        int y = 0;
        int xmax = n, xmin = 2;
        int ymax = n,ymin = 0;
        int d = 0;
        int i=0;
        while(ymax>ymin && xmax>xmin){
            a[x][y] = 1;
            i++;
            switch (d) {
                case 0:/*right*/
                    y++;
                    if (y == ymax - 1) {
                        d = 1;
                        ymax = ymax - 2;
                    }
                    break;
                case 1:/*right*/
                    x++;
                    if (x == xmax - 1) {
                        d = 2;
                        xmax = xmax-2;
                    }
                    break;

                case 2:/*right*/
                    y--;
                    if (y <= ymin) {
                        d = 3;
                        ymin =ymin+2;
                    }
                    break;
                case 3:/*right*/
                    x--;
                    if (x <= xmin) {
                        d = 0;
                        xmin = xmin+2;
                    }
                    break;

            }
        }
        for (int v = 0; v < n; v++) {
            for (int k = 0; k < n; k++)
                System.out.print(a[v][k] + "\t");
            System.out.println();
        }
    }
}

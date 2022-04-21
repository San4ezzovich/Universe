package Excercises.Arrays;
import java.util.Scanner;
import java.util.Random;
import java.util.*;
public class Array_28 {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int minesCount = sc.nextInt();
        String[][] playground = new String[n][m];
        Set<Mine> mines = new HashSet<>();
        for (int i = 0; i < minesCount; i++) {
            boolean isCreated = false;
            while (!isCreated){
                int x = Math.abs(rand.nextInt() % m);
                int y = Math.abs(rand.nextInt() % n);
                Mine mine = new Mine(x, y);
                if (!mines.contains(mine)) {
                    mines.add(mine);
                    isCreated = true;
                }
            }
        }

        for (Mine mine: mines) {
            playground[mine.y()][mine.x()] = "*";
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (playground[i][j] == "*") continue;

                int count = 0;

                if (i > 0 && j > 0 && playground[i - 1][j - 1] == "*") count++;
                if (i > 0 && playground[i - 1][j] == "*") count++;
                if (i > 0 && j < m - 1 && playground[i - 1][j + 1] == "*") count++;
                if (j > 0 && playground[i][j - 1] == "*") count++;
                if (j < m - 1 && playground[i][j + 1] == "*") count++;
                if (i < n - 1 && j > 0 && playground[i + 1][j - 1] == "*") count++;
                if (i < n - 1 && playground[i + 1][j] == "*") count++;
                if (i < n - 1 && j < m - 1 && playground[i + 1][j + 1] == "*") count++;

                playground[i][j] = String.valueOf(count);
            }
        }

        for (String[] arr: playground) {
            for (String a: arr) {
                System.out.print(a + " ");
            }
            System.out.println();
        }
    }
}
        record Mine (int x, int y){}
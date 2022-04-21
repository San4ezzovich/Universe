package Excercises.Arrays;
import java.util.Scanner;

public class Array_19 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int result =0, x=0,y=0;
        int [][] arr = new int [a][b];
        for (int i = 0;i<a;i++){
            for(int j=0;j<b;j++){
                int c = sc.nextInt();
                arr[i][j] = c;
            }
        }
        for (int i = 0;i<a;i++){
            for(int j=0;j<b;j++){
                if (result < arr[i][j]){
                    result = arr[i][j];
                    x = i;
                    y = j;
                }
            }
        }
        System.out.println(result+ " "+ x +" "+ y);
    }

}

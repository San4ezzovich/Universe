package Excercises.Arrays;
import java.util.ArrayList;
import java.util.Scanner;

public class Array_16 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int [][] arr = new int [a][a];
        for (int i = 0;i<a;i++){
            arr[i][a-i-1] = 1;
            for(int j=0;j<i;j++){
                arr[i][a-j-1] = 2;
            }
        }
        for(int i=0;i<a;i++){
            for(int j=0;j<a;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println("\n");
        }
    }

}

package Excercises.Arrays;
import java.util.Scanner;

public class Array_18 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int result =0, temp = 0;
        int [][] arr = new int [a][b];
        for (int i = 0;i<a;i++){
            for(int j=0;j<b;j++){
                int c = sc.nextInt();
                arr[i][j] = c;
            }
        }
        for (int i = 0;i<a;i++){
            for(int j=0;j<b;j++){
                temp += arr[i][j];
            }
            if (result<temp){
                result = temp;
            }
            temp = 0;
        }
        System.out.println(result);
    }

}

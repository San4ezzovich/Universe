package Excercises.Arrays;
import java.util.Scanner;

public class Array_20 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int result =0, x=0,answ=0;
        int [][] arr = new int [a][b];
        for (int i = 0;i<a;i++){
            for(int j=0;j<b;j++){
                int c = sc.nextInt();
                arr[i][j] = c;
            }
        }
        for (int i = 0;i<a;i++){
            for(int j=0;j<b;j++){
                result += arr[i][j];
                }
            if (answ<result){
                x = i;
                answ = result;
            }
            result = 0;


        }
        System.out.println(x);
    }

}

package Excercises.Arrays;
import java.util.Scanner;

public class Array_17 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int result =0, temp = 0;
        int [][] arr = new int [a][a];
        for (int i = 0;i<a;i++){
            for(int j=0;j<a;j++){
                int b = sc.nextInt();
                arr[i][j] = b;

            }
        }
        for (int i = 0;i<a;i++){
            for(int j=0;j<i;j++){
                if(arr[a-i-1][a-j-1] == arr[i][j]){
                    result++;
                }
            }
        }
        for (int i = 1;i<=a;i++){
            temp+=i-1;
        }
        if (result == temp){
            System.out.println("YES");
        }
        else System.out.println("NO");
        for(int i=0;i<a;i++){
            for(int j=0;j<a;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println("\n");
        }
    }

}

package Excercises.Arrays;
import java.util.ArrayList;
import java.util.Scanner;

public class Array_2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int result = 0;
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i =0;i<a;i++){
            int k =sc.nextInt();
            arr.add(k);
        }
        for(int i = 0;i<a;i++){
            if (arr.get(i)>0){
                result++;
            }
        }
        System.out.println(result);

    }
}

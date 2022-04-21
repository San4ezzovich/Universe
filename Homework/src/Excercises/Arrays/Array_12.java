package Excercises.Arrays;
import java.util.ArrayList;
import java.util.Scanner;

public class Array_12 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i =0;i<a;i++){
            int k =sc.nextInt();
            arr.add(k);
        }
        int height = sc.nextInt();
        System.out.println(arr.indexOf(height)+1);
    }
}

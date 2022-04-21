package Excercises.Arrays;
import java.util.ArrayList;
import java.util.Scanner;

public class Array_14 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int temp;
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i =0;i<a;i++){
            int k =sc.nextInt();
            arr.add(k);
        }
        int n = sc.nextInt();
        for(int i = 0;i<n;i++){
            temp = arr.get(i);
            arr.remove(0);
            arr.add(temp);
        }
        for(int i = 0;i<a;i++)
        System.out.println(arr.get(i));
    }
}

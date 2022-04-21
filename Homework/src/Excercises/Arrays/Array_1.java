package Excercises.Arrays;
import java.util.ArrayList;
import java.util.Scanner;
public class Array_1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i =0;i<a;i++){
            int k =sc.nextInt();
            arr.add(k);
        }
        for(int i = 0;i<a;i++){
            if (i%2!=0){
                System.out.println(arr.get(i));
            }
        }

    }
}

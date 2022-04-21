package Excercises.Arrays;
import java.util.ArrayList;
import java.util.Scanner;
public class Array_7 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int temp;
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i =0;i<a;i++){
            int k =sc.nextInt();
            arr.add(k);
        }
        for (int i = 0; i < a/2; i++) {
            temp = arr.get(a-i-1);
            arr.set(a-i-1,arr.get(i));
            arr.set(i,temp);
        }
        for (int i=0; i<a; i++){
            System.out.println(arr.get(i));
        }
    }
}

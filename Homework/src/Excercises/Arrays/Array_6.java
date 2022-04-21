package Excercises.Arrays;
import java.util.ArrayList;
import java.util.Scanner;

public class Array_6 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int result = 0;
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i =0;i<a;i++){
            int k =sc.nextInt();
            arr.add(k);
        }
        for(int i = 1;i<a-1;i++){
            if(arr.get(i)> arr.get(i+1) && arr.get(i)> arr.get(i-1)){
                result++;
            }
        }
        System.out.println(result);


    }
}

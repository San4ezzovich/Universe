package Excercises.Arrays;
import java.util.ArrayList;
import java.util.Scanner;

public class Array_11 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int result=0;
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i =0;i<a;i++){
            int k =sc.nextInt();
            if (arr.contains(k)){
            }
            else {
                result++;
                arr.add(k);
            }
        }
        System.out.println(result);
    }
}

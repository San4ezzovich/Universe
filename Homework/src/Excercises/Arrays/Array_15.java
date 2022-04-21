package Excercises.Arrays;
import java.util.ArrayList;
import java.util.Scanner;

public class Array_15 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int temp = 1, result=2,n=99999;
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i =0;i<a;i++){
            int k =sc.nextInt();
            arr.add(k);
        }
        for(int i=0;i<a;i++){
            if(arr.get(i)==n){
                temp++;
            }
            else temp = 1;
            if(temp>=3){
                result++;
            }
            n = arr.get(i);
        }
        if (result>=3){
            System.out.println(result);
        }
        else System.out.println(0);
    }

}

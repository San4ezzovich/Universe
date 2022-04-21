package Excercises.BasicConcepts.data;
import java.util.Scanner;
import java.util.ArrayList;
public class data_1 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        int result = n;
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i =0;i<n;i++) {
            int k = sc.nextInt();
            if (arr.contains(k)) {
                result--;
            }
            arr.add(k);
        }
        System.out.print(result);
    }
}

package Excercises.BasicConcepts.data;
import java.util.ArrayList;
import java.util.Scanner;
public class data_4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>();
        ArrayList<Integer> arr1 = new ArrayList<>();
        int n = sc.nextInt();
        int k, result = 0;
        for(int i = 0;i<n;i++){
            k = sc.nextInt();
            if(arr.contains(k)){
            }
            else{arr.add(k);}
        }
        for(int i = 0;i<n;i++){
            k = sc.nextInt();
            if(arr1.contains(k)){
            }
            else{arr1.add(k);}
        }
        for(int i = 0; i<n;i++){
            for(int j = 0; j<n;i++){
                if( arr.get(i) == arr1.get(j)){
                    System.out.print(arr.get(i));
                }
            }
        }

    }
}

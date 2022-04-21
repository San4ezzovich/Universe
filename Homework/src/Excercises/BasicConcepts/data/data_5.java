package Excercises.BasicConcepts.data;
import java.util.Scanner;
import java.util.ArrayList;
public class data_5 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>();
        while(true){
            int k = sc.nextInt();
            if (arr.contains(k)) {
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
            arr.add(k);
        }

    }
}

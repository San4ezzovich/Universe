package Excercises.Arrays;
import java.util.ArrayList;
import java.util.Scanner;

public class Array_13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int temp;
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            arr.add(i + 1);
        }
        for (int i=a-1; i <=b/2; i++) {
            temp = arr.get((b)-i-1);
            arr.set((b)-i-1,arr.get(i));
            arr.set(i,temp);
        }
        for (int i=c-1; i <=d/2; i++) {
            temp = arr.get((d)-i-1);
            arr.set((d)-i-1,arr.get(i));
            arr.set(i,temp);
        }

        for(int i=0;i<n;i++){
            System.out.print(arr.get(i)+ " ");
        }
    }
}

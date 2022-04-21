package Excercises.IfElseForWhile.For;
import java.util.Scanner;

public class For_6 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        float res = 1;
        for (int i=1;i<=a;i++){
            res = res * i;
        }
        System.out.println(res);
    }
}

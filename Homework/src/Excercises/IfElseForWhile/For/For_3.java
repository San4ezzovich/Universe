package Excercises.IfElseForWhile.For;
import java.util.Scanner;

public class For_3 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n<0||n>30) return;
        n = n*n;
        System.out.print(n);
    }
}

package Excercises.IfElseForWhile.If_else;
import java.util.Scanner;

public class IfElse1_17 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        if (k%5==0 || k%3==0 || k%5==3 || k%3==2){
            System.out.println("YES");
        }
        else System.out.println("NO");
    }
}

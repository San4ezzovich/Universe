package Excercises.IfElseForWhile.If_else;
import java.util.Scanner;
public class IfElse1_14 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (a==0 || b ==0){
            System.out.println("INF");
        }
        double result = -b/a;
        if (result==0) System.out.println("NO");
    }
}

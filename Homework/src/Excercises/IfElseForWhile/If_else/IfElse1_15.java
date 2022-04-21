package Excercises.IfElseForWhile.If_else;
import java.util.Scanner;
public class IfElse1_15 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        if (c == 0 || d ==0){
            return;
        }
        double x1 = -b/a;
        double x2 = -c/d;
        if (x2 == x1) System.out.println("NO");
        else System.out.println(x1);
    }
}

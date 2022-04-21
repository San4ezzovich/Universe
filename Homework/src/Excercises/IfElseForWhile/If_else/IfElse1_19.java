package Excercises.IfElseForWhile.If_else;
import java.util.Scanner;
public class IfElse1_19 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a1 = sc.nextInt();
        int a2 = sc.nextInt();
        int a3 = sc.nextInt();
        if (a1==a2 && a1==a3){
            System.out.print(a1);
        }
        else if (a1==a2 || a2==a3 || a1==a3){
            System.out.println(2);
        }
        else System.out.print(0);
    }
}

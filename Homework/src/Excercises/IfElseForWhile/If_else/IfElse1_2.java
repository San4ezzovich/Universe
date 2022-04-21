package Excercises.IfElseForWhile.If_else;
import java.util.Scanner;
public class IfElse1_2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        if (year<=0){
            System.out.println("Can`t be smaller than 1. Return");
            return;
        }
        if (year%4==0){
            if (year%400==0){
                System.out.println("YES");
                return;
            }
            if (year%100==0){
                System.out.println("NO");
            }
            else{
                System.out.println("YES");
            }
        }
        else{
            System.out.println("NO");
        }
    }
}

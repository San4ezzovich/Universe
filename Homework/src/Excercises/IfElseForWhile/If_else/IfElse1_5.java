package Excercises.IfElseForWhile.If_else;

import java.util.Scanner;
public class IfElse1_5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        if (x>y){
            System.out.println("1");
        }
        else if (x<y){
            System.out.println("2");
        }
        else if (x==y){
            System.out.println("0");
        }
        else{
            System.out.println("Error.Return");
            return;
        }
    }
}

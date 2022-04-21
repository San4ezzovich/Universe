package Excercises.IfElseForWhile.For;
import java.util.Scanner;

public class For_12 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        String aStr = Integer.toString(a);
        double result = 0;
        for(int i = 0;i<=aStr.length();i++ ) {
            result = result+ a%10*Math.pow(10,aStr.length()-(i+1));
            a/=10;
        }
        System.out.println(result);
    }
}


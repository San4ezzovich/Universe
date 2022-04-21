package Excercises.IfElseForWhile.For;
import java.util.Scanner;

public class For_10 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int d = sc.nextInt();
        int result = 0;
        while (d>0){
            if (d%10==x){
                result++;
            }
            d/=10;
        }
        System.out.println(result);
    }
}

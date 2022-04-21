package Excercises.IfElseForWhile.For;
import java.util.Scanner;

public class For_2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result = 1;
        if (n<=0 || n>12){
            return;
        }
        for (int i=1;i<=n;i++){
            result = result*i;
        }
        System.out.println(result);
    }
}
